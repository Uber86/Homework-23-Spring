package Homework23.Spring.skypro.service;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
@SessionScope
public class Basket {

    private final Set<Integer> setList = new HashSet<>();

    public void add(List<Integer> id) {
        setList.addAll(id);
    }

    public Set<Integer> get() {
        return setList;
    }



}
