package pixel.academy.spring_core_ioc.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TurkishChef implements Chef {

    @Override
    public String getDailyRecipe() {
        return "Turkish Kebab";
    }

    public TurkishChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
}