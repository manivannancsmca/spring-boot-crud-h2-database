package com.example.demo.config;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleDataLoader implements CommandLineRunner {

    private final ProductRepository repository;

    public SampleDataLoader(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        if (repository.count() == 0) {
            repository.save(new Product("Laptop", "High-performance laptop with 32GB RAM", 1499.99));
            repository.save(new Product("Mouse", "Wireless ergonomic mouse", 49.99));
            repository.save(new Product("Keyboard", "Mechanical keyboard with RGB backlight", 89.99));
            repository.save(new Product("Monitor", "27-inch 4K UHD monitor", 399.99));
            repository.save(new Product("Headphones", "Noise-cancelling Bluetooth headphones", 199.99));
            System.out.println("Sample product data loaded.");
        }
    }
    
}
