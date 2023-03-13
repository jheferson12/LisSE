package co.edu.umanizales.tads.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
@RestController
public class KidController {

        @Autowired
        private  KidController kidService;




        @Autowired
        public KidController(KidController kidService){
            this.kidService=kidService;
        }
        @GetMapping("/count-By-City")
        public ResponseEntity<Map<String,Integer>> countKidsByCity(){
                Map<String,Integer>KidsByCity;
                KidsByCity = (Map<String, Integer>) kidService.countKidsByCity();
                return ResponseEntity.ok(KidsByCity);
        }
}
