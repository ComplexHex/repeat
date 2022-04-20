package lesson13.current.simple;

import org.springframework.stereotype.Component;

@Component
public class ProductService {
    public void getProducts() {
        System.out.println("Получен список товаров");
    }
}
