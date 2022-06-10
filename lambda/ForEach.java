package lambda;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("asdf", "sdf", "acvv", "asdf");
        list.forEach(l-> {
            System.out.println(l);
        });
    }
}
