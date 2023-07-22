package org.EXAMPLE;

import org.EXAMPLE.model.impl.Product;
import org.EXAMPLE.repository.ProductRepository;
import org.EXAMPLE.utils.Notificator;
import org.EXAMPLE.utils.ProductGenerator;

import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        ProductRepository repository = new ProductRepository();
        Notificator notificator = new Notificator(repository);
        Stream.generate(ProductGenerator::generateRandomProduct)
                .limit(10)
                .forEach(repository::save);
        repository.getAll().stream()
                .map(Product::getBasicInfo)
                .forEach(System.out::println);
        System.out.println("notifications sent: " + notificator.sendNotifications());
    }
}