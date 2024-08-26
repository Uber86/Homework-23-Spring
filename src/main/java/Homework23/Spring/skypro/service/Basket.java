package Homework23.Spring.skypro.service;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
@SessionScope
public class Basket {

    private final List<Integer> setList = new ArrayList<>();

    public void add(List<Integer> id) {
        setList.addAll(id);
    }

    public List<Integer> get() {
        return setList;
    }



}
