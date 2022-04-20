package lesson13.current.simple;

import org.springframework.stereotype.Component;

@Component
public class BeanInterfaceImpl implements BeanInterface {
    public void doSomething() {
        System.out.println(1);
    }
}
