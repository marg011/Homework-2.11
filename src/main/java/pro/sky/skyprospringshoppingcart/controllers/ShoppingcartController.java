package pro.sky.skyprospringshoppingcart.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringshoppingcart.services.ShoppingcartService;

import java.util.List;

@RestController
public class ShoppingcartController {

    private final ShoppingcartService shoppingcartService;

    public ShoppingcartController(ShoppingcartService shoppingcartService) {
        this.shoppingcartService = shoppingcartService;
    }

    @GetMapping(path = "/store/order/add")
    public void addItems(@RequestParam ("ids") Integer ids[]){
        shoppingcartService.addItems(ids);
    }

    @GetMapping(path = "/store/order/get")
    public List<Integer> getItems(){
        return shoppingcartService.getItems();
    }

}
