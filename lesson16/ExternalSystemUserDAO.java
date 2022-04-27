package lesson16;

import org.springframework.stereotype.Component;

@Component
public class ExternalSystemUserDAO {
    public void addUser() {
        System.out.println("New External User added");
    }
}
