package co.edu.umanizales.tads.model;

public class ListKid {
    private Node head;
    private int size;
    public ListKid(){
        head=null;
        size=0;
    }
    public void add(Kid kid){
        Node newNode=new Node(kid);Node current;
        if(head==null){
            head=newNode;
        }else {
            current = head;
            while(current.getNext()!=null){
                current=current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }
    public double averageAge(){
        if(size==0){
            return 0;
        }else{
            int sum=0;
            Node current=head;
            while (current !=null){
                sum+=current.getData().getAge();
                current=current.getNext();
            }
            return (double) sum/size;
        }
    }

}
