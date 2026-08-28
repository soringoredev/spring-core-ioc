package pixel.academy.spring_core_ioc.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class MexicanChef implements Chef {

    @Override
    public String getDailyRecipe() {
        return "Prepara tacos al pastor con pina ....";
    }
}
