package org.EXAMPLE.model.impl;

import lombok.EqualsAndHashCode;
import lombok.Setter;
import org.EXAMPLE.model.interf.ProductBundleInterface;

@Setter
@EqualsAndHashCode(callSuper = true)
public class ProductBundle extends Product implements ProductBundleInterface {
    protected int amount;

    public ProductBundle(long id, boolean available, String title, double price, int amount) {
        super(id, available, title, price);
        this.amount = amount;
    }

    @Override
    public int getAmountInBundle() {
        return amount;
    }
    @Override
    public String getBasicInfo() {
        return "ProductBundle{" +
                " id=" + id +
                ", available=" + available +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", amountInBundle=" + amount +
                '}';
    }
}
