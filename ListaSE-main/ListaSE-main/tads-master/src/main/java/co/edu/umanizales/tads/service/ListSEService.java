package co.edu.umanizales.tads.service;
import co.edu.umanizales.tads.model.Kid;
import co.edu.umanizales.tads.model.ListSE;
import co.edu.umanizales.tads.model.Node;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@Data
public class ListSEService {


    private ListSE kids;

    public ListSEService() {



        ListSE listSE=new ListSE();

        kids.add(new Kid("12","Jheferson",(byte)18));
        kids.add(new Kid("12","Santiago",(byte)20));
        kids.add(new Kid("12","Ana",(byte)19));
        kids.add(new Kid("12","Sebastian",(byte)40));
        kids.add(new Kid("12","Nicolas",(byte)35));
        kids.add(new Kid("12","Tomas",(byte)80));
        kids.add(new Kid("12","Gabriel",(byte)12));


        }


   }


