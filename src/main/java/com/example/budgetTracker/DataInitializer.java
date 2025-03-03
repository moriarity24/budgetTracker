package com.example.budgetTracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        categoryRepository.save(new Category("Salary"));
        categoryRepository.save(new Category("Food"));
        categoryRepository.save(new Category("Rent"));
    }
}
