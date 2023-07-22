package org.EXAMPLE.utils;

import org.EXAMPLE.repository.ProductRepository;
import org.EXAMPLE.model.impl.NotifiableProduct;
import org.EXAMPLE.model.impl.Product;
import org.EXAMPLE.model.impl.ProductBundle;

import java.util.List;
import java.util.Random;

public class ProductUtils {
    private final ProductRepository repository = new ProductRepository();

    public void saveProduct(Product product) {
        repository.save(product);
    }

    public long sendNotifications() {
        return getAll().stream()
                .filter(it -> it instanceof NotifiableProduct)
                .map(it -> (NotifiableProduct) it)
                .peek(this::sendNotification)
                .count();
    }
    public void sendNotification(NotifiableProduct notifiableProduct) {
        //sending some notifications here
    }

    public List<Product> getAll() {
        return repository.getAll();
    }

    public Product generateRandomProduct() {
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
