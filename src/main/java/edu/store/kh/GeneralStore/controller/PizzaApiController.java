package edu.store.kh.GeneralStore.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PizzaApiController {
    // ServiceImpl -> Autowired 호출
    @GetMapping("/pizzas")
    public void getAllPizzas() {

    }

    @PostMapping("/pizzas")
    public void createPizza() {

    }
}
