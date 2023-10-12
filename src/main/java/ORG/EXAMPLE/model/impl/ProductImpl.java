package org.example.model.impl;

import lombok.Data;
import org.example.model.interf.Product;

@Data
public abstract class ProductImpl implements Product {
    protected long id;
    protected boolean available;
    protected String title;
    protected double price;

    public ProductImpl(long id, boolean available, String title, double price) {
        this.id = id;
        this.available = available;
        this.title = title;
        this.price = price;
    }

    public String getBasicInfo(){
        return "Product{" +
                "id=" + id +
                ", available=" + available +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }


}
