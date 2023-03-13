package co.edu.umanizales.tads.controller;

import co.edu.umanizales.tads.model.Store;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreController {
    private Store store;
    public StoreController(){
        store=new Store(1,"Ebay");

    }
    @PostMapping("/additem")
    public void addItem(@RequestBody Store.Item item){
        store.addItem((item));
    }
    @GetMapping("/solditems/{quantity}")
    public List<Store.Item>getSoldItems(@PathVariable int quantity){
        return store.getSoldItems(quantity);
    }
}
