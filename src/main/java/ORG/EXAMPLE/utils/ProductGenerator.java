package org.example.utils;

import org.example.model.impl.NotifiableProductImpl;
import org.example.model.impl.ProductImpl;
import org.example.model.impl.ProductBundleImpl;

import java.util.Random;

public class ProductGenerator {
    public ProductGenerator() {
    }

    public static ProductImpl generateRandomProduct() {
        Random random = new Random();
        if (random.nextBoolean()) {
            return new ProductBundleImpl(
                    random.nextLong(),
                    random.nextBoolean(),
                    (random.nextFloat() + "" + random.nextDouble()),
                    random.nextDouble(),
                    random.nextInt(15));
        } else {
            return new NotifiableProductImpl(
                    random.nextLong(),
                    random.nextBoolean(),
                    (random.nextFloat() + "" + random.nextDouble()),
                    random.nextDouble());
        }
    }
}