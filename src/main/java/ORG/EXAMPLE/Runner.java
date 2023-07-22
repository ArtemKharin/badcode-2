package org.EXAMPLE;

import org.EXAMPLE.model.impl.Product;
import org.EXAMPLE.utils.ProductUtils;

import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        ProductUtils utils = new ProductUtils();
        Stream.generate(utils::generateRandomProduct)
                .limit(10)
                .forEach(utils::saveProduct);
        utils.getAll().stream()
                .map(Product::getBasicInfo)
                .forEach(System.out::println);
        System.out.println("notifications sent: " + utils.sendNotifications());
    }
}