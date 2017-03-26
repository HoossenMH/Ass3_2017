import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Hasan on 3/26/2017.
 */
@Configuration
public class AppConfig {
    @Bean(name = "car")
    public CarInterface getService()
    {
        return new CarServiceImp();
    }
}
