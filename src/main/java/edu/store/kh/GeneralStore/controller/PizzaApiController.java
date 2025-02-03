package edu.store.kh.GeneralStore.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api")
@RestController
public class PizzaApiController {
    // ServiceImpl -> Autowired 호출
    @GetMapping("/pizzas") //   /api/pizzas
    public void getAllPizzas() {

    }

    @PostMapping("/pizzas") //   /api/pizzas
    public void createPizza() {

    }
}
