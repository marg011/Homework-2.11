package pro.sky.skyprospringshoppingcart.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@SessionScope
public class ShoppingcartServiceImpl implements ShoppingcartService {

    List<Integer> items = new ArrayList<>();
    public void addItems(Integer ids[]){
        items.addAll(Arrays.asList(ids));
    }
    public List<Integer> getItems(){
        return items;
    }
}
