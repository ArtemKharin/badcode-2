package org.example.model.impl;

import lombok.EqualsAndHashCode;
import lombok.Setter;
import org.example.model.interf.ProductBundle;

@Setter
@EqualsAndHashCode(callSuper = true)
public class ProductBundleImpl extends ProductImpl implements ProductBundle {
    protected int amount;

    public ProductBundleImpl(long id, boolean available, String title, double price, int amount) {
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
