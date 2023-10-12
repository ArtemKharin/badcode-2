package org.example.model.impl;

import lombok.EqualsAndHashCode;
import org.example.model.interf.NotifiableProduct;

@EqualsAndHashCode(callSuper = true)
public class NotifiableProductImpl extends ProductImpl implements NotifiableProduct {
    protected String channel;

    public NotifiableProductImpl(long id, boolean available, String title, double price) {
        super(id, available, title, price);
        this.channel = generateAddressForNotification();
    }

    @Override
    public String generateAddressForNotification() {
        return "somerandommail@gmail.com";
    }

    @Override
    public String getBasicInfo() {
        return "NotifiableProduct{" +
                "channel='" + channel + '\'' +
                ", id=" + id +
                ", available=" + available +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
