package org.EXAMPLE.utils;

import org.EXAMPLE.model.impl.NotifiableProduct;
import org.EXAMPLE.model.impl.Product;
import org.EXAMPLE.model.impl.ProductBundle;

import java.util.Random;

public class ProductGenerator {
    public ProductGenerator() {
    }

    public static Product generateRandomProduct() {
        Random random = new Random();
        if (random.nextBoolean()) {
            return new ProductBundle(
                    random.nextLong(),
                    random.nextBoolean(),
                    (random.nextFloat() + "" + random.nextDouble()),
                    random.nextDouble(),
                    random.nextInt(15));
        } else {
            return new NotifiableProduct(
                    random.nextLong(),
                    random.nextBoolean(),
                    (random.nextFloat() + "" + random.nextDouble()),
                    random.nextDouble());
        }
    }
}