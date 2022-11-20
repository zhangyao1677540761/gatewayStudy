package com.zy.feignDao;

import com.zy.pojo.BsBook;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @学习小结
 */
@FeignClient("provide-8001")
public interface feign8001 {
    @GetMapping("/{id}")
    public BsBook getBook(@PathVariable("id") Integer id);
}
