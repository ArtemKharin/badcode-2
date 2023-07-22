package org.EXAMPLE.model.impl;

import lombok.EqualsAndHashCode;
import org.EXAMPLE.model.interf.NotifiableProductInterface;

@EqualsAndHashCode(callSuper = true)
public class NotifiableProduct extends Product implements NotifiableProductInterface {
    protected String channel;

    public NotifiableProduct(long id, boolean available, String title, double price) {
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
