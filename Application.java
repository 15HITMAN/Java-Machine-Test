import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories  // This ensures that Spring Data JPA repositories are enabled
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

