package code.doston;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDateJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDateJpaApplication.class, args);
        System.out.println("Running...");
    }

}
