package org.example;

import org.example.model.interf.Product;
import org.example.repository.ProductRepository;
import org.example.utils.Notificator;
import org.example.utils.ProductGenerator;

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