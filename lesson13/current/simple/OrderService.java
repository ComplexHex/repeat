package lesson13.current.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public void createOrder() {
        System.out.println("Заказ сформирован");
    }
}
