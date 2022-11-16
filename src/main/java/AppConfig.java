import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.Async;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name="cat")
    @Scope("prototype")
    public Cat getCat() {
        Cat cat = new Cat();
        cat.setSound("Meow");
        return cat;
    }

}