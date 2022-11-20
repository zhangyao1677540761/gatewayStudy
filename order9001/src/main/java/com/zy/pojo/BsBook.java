package com.zy.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @TableName bs_book
 */
public class BsBook implements Serializable {


    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private String title;

    /**
     *
     */
    private String author;

    /**
     *
     */
    private BigDecimal price;

    /**
     *
     */
    private Integer sales;

    public BsBook() {
    }

    /**
     *
     */
    private Integer stock;

    /**
     *
     */
    private String imgPath;

    private static final long serialVersionUID = 1L;

    /**
     *
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     */
    public String getAuthor() {
        return author;
    }

    /**
     *
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     *
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     *
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     *
     */
    public Integer getSales() {
        return sales;
    }

    /**
     *
     */
    public void setSales(Integer sales) {
        this.sales = sales;
    }

    /**
     *
     */
    public Integer getStock() {
        return stock;
    }

    /**
     *
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     *
     */
    public String getImgPath() {
        return imgPath;
    }

    /**
     *
     */
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", author=").append(author);
        sb.append(", price=").append(price);
        sb.append(", sales=").append(sales);
        sb.append(", stock=").append(stock);
        sb.append(", imgPath=").append(imgPath);
//        sb.append(", Message=").append(Message);
        sb.append("]");
        return sb.toString();
    }
}