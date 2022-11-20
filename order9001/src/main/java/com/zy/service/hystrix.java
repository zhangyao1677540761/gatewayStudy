package com.zy.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zy.feignDao.feign8001;
import com.zy.pojo.BsBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @学习小结
 */
@Service
public class hystrix {
    @Autowired
    feign8001 feign8001;

    //默认10秒内20个以上请求,50%以上错误启动熔断机制
    @HystrixCommand(fallbackMethod = "LastOverMethod",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),//是否开启熔断器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),//时间窗口期ms
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"),//失败率多少开启
    })
    public String getBook(@PathVariable("id") Integer id){
        if (id < 0) {
            throw new  RuntimeException("....id不能为负数");
        }
        BsBook book = feign8001.getBook(id);
        return book.toString();
    }
    //降级方法
    public String LastOverMethod(@PathVariable("id") Integer id){
        return "id不能为负数当前id是"+id;
    }

}
