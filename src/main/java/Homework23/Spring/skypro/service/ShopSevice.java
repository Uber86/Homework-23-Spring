package Homework23.Spring.skypro.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class ShopSevice {

    private final Basket basket;

    public ShopSevice(Basket basket) {
        this.basket = basket;
    }

    public void add(List<Integer> id) {
        basket.add(id);
    }

    public Set<Integer> get() {
        return basket.get();
    }

}
