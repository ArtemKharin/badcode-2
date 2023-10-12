package org.example.utils;

import org.example.model.interf.NotifiableProduct;
import org.example.repository.ProductRepository;

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