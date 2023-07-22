package org.EXAMPLE.model.impl;

import lombok.Data;
import org.EXAMPLE.model.interf.ProductInterface;

@Data
public abstract class Product implements ProductInterface {
    protected long id;
    protected boolean available;
    protected String title;
    protected double price;

    public Product(long id, boolean available, String title, double price) {
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
