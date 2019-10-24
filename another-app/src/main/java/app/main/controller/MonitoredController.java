package app.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class MonitoredController {

    @GetMapping("/myFood")
    public String getFood() throws Exception {
        List<String> food = Arrays.asList("potato", "lettuce", "tomato", "brick");

        Random rand = new Random();
        String dish = food.get(rand.nextInt(food.size()));

        if (dish.equalsIgnoreCase("brick")) {
            throw new Exception("That's no food");
        } else {
            return dish;
        }
    }
}
