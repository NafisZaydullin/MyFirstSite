package com.nafis.lite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.util.Arrays.asList;

@Controller
public class ProductsController {
    @GetMapping("/products")
    public ModelAndView products(ModelAndView modelAndView){
        Product milk = new Product("Prostokvashino",
                "Milker",
                69.99,
                new Date(2020, 3,27).toString(),
                new Date(2021, 3,27).toString());
        Product chocolate = new Product("AlpenSilver",
                "Alpen\'s Industry",
                45.69,
                new Date(2019,10,10).toString(),
                new Date(2020,4,10).toString());
        Product marker = new Product("MultiMarker",
                "CrownBallPen",
                49.99,
                new Date(2019,8,10).toString(),
                new Date(2022,8,10).toString());
        Product apple = new Product("Yablan",
                "Fruit Garden",
                95,
                new Date(2020,4,1).toString(),
                new Date(2025, 4,1).toString());
        Product ussr = new Product("USSR",
                "Lenin",
                78,
                new Date(1922,12,30).toString(),
                new Date(1991,12,91).toString());

        List<Product> products = new ArrayList<>();
        products.addAll(asList(milk, chocolate, marker, apple, ussr));

        modelAndView.setViewName("products");
        modelAndView.addObject("products", products);
        return modelAndView;
    }
}
