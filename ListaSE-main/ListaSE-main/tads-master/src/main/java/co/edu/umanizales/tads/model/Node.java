package co.edu.umanizales.tads.model;

import lombok.Data;

import java.util.Arrays;

@Data
public class Node {

    private Kid data;
    private Node next;



    public Node(Kid data) {
        this.data = data;
        this.next=null;
    }


    public Kid getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
