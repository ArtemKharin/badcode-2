package org.EXAMPLE.utils;

import org.EXAMPLE.model.impl.NotifiableProduct;
import org.EXAMPLE.repository.ProductRepository;

public class Notificator {
    private final ProductRepository productRepository;

    public Notificator(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public long sendNotifications() {
        return productRepository.getAll().stream()
                .filter(it -> it instanceof NotifiableProduct)
                .map(it -> (NotifiableProduct) it)
                .peek(this::sendNotification)
                .count();
    }

    public void sendNotification(NotifiableProduct notifiableProduct) {
        //sending some notifications here
    }
}