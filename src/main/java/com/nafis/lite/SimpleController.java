package com.nafis.lite;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.util.Arrays.asList;

@Controller
public class SimpleController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/image")
    public String image(){
        return "image";
    }

    @GetMapping("/people")
    public ModelAndView getPeople(ModelAndView modelAndView){
        Person person1 = new Person("Robbie White", "2001/01/01", "https://pics.wikireality.ru/upload/thumb/2/20/441294_ava-agenta-vk.jpg/180px-441294_ava-agenta-vk.jpg");
        Person person2 = new Person("Nafis Zaydullin", "2005/01/19", "https://narcosis-css.ru/wp-content/uploads/poluchit-besplatno-podpischikov-v-kontakte_15.jpg");
        Person person3 = new Person("Samatyan Zaydullin", "2000/01/01", "https://sun9-54.userapi.com/7m_rSUl1lSVCbKclvElrxpJtIdqMsj5iiFtP-A/PJxC0CIC6os.jpg?ava=1");

        List<Person> people = new ArrayList<>();
        people.addAll(asList(person1, person2, person3));

        modelAndView.setViewName("people");
        modelAndView.addObject("people", people);

        return modelAndView;
    }
}
