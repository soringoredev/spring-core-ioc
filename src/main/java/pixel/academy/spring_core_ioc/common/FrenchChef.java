package pixel.academy.spring_core_ioc.common;

import org.springframework.stereotype.Component;

@Component
public class FrenchChef implements Chef {

    @Override
    public String getDailyRecipe() {
        return "Preparez un boeuf bourgignon avec vin....";
    }
}
