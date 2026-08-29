package pixel.academy.spring_core_ioc.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
public class MexicanChef implements Chef {

    @Override
    public String getDailyRecipe() {
        return "Prepara tacos al pastor con pina ....";
    }

    public MexicanChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    // init method
    @PostConstruct
    public void initializeBean() {
        System.out.println("Bean initialized. " + getClass().getSimpleName());
    }

    // destroy method
    @PreDestroy
    public void cleanup() {
        System.out.println("Bean is about to be destroyed. " + getClass().getSimpleName());
    }



}
