package co.edu.umanizales.tads.controller;


import co.edu.umanizales.tads.model.Kid;
import co.edu.umanizales.tads.model.ListKid;
import co.edu.umanizales.tads.service.ListSEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/lists")
public class ListSEController {
    @Autowired
    private ListSEService listSEService;

    private  ListKid listKid=new ListKid();

    @GetMapping("/kid/{age}")
    public ResponseEntity<Void>addKid(@PathVariable byte age){
        listKid.add(new Kid("12", "Jheferson", age));
        return ResponseEntity.ok().build();
    }
    @GetMapping("/Average-age")
    public ResponseEntity<Double>averageAge(){
        return ResponseEntity.ok(listKid.averageAge());
    }


    }











