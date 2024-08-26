package Homework23.Spring.skypro.controller;

import Homework23.Spring.skypro.service.ShopSevice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ShopController {

    private final ShopSevice sevice;

    public ShopController(ShopSevice sevice) {
        this.sevice = sevice;
    }

    @GetMapping("/add")
    public void add(@RequestParam List<Integer> id) {
        sevice.add(id);
    }


    @GetMapping("/get")
    public List<Integer> get() {
        return sevice.get();
    }

}
