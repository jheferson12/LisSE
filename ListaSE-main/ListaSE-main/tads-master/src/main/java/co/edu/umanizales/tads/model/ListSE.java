package co.edu.umanizales.tads.model;
import lombok.Data;

import java.util.Map;
import java.util.HashMap;

@Data

public class ListSE {
    private node head;
    private class node {
        private Kid value;
        private node next;



       //all the constructor said getters and setters
        public Kid getValue() {
            return value;
        }

        public void setValue(Kid value) {
            this.value = value;
        }
        public node getNext(){
            return next;
        }
        public void setNext(node value){
            this.next=value;
        }


        public Map<String, Integer> countKidByCity() {
            Map<String, Integer> KidByCity = new HashMap<>();
            node current = head;
            while (current != null) {
                Kid kid = current.getValue();
                String city = kid.getCity();
                if (!KidByCity.containsKey(city)) {
                    KidByCity.put(city, 1);
                } else {
                    int previousCount = KidByCity.get(city);
                    KidByCity.put(city, previousCount + 1);
                }
                current = current.getNext();
            }
            return KidByCity;
        }



    }

    /*
    Algoritmo de adicionar al final
    Entrada
        un niño
    si hay datos
    si
        llamo a un ayudante y le digo que se posicione en la cabeza
        mientras en el brazo exista algo
            pasese al siguiente
        va estar ubicado en el ùltimo

        meto al niño en un costal (nuevo costal)
        y le digo al ultimo que tome el nuevo costal
    no
        metemos el niño en el costal y ese costal es la cabeza
     */
    public class Node{

        public Object getData() {
            return data;
        }

        public Object data;
        private Kid value;
        private node next;

        public Node(Kid value) {
            this.value = value;
            this.next = null;
        }


        public node getNext() {
            return next;
        }

        public Kid getValue() {
            return value;
        }

        public void setNext(node next) {
            this.next = next;
        }


    }


    public void add(Kid kid) {
        if (head != null) {
            node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            /// Parado en el último
            node newNode = new node();
            temp.setNext(newNode);
        } else {
            head = new node();
        }
    }

    /* Adicionar al inicio
    si hay datos
    si
        meto al niño en un costal (nuevocostal)
        le digo a nuevo costal que tome con su brazo a la cabeza
        cabeza es igual a nuevo costal
    no
        meto el niño en un costal y lo asigno a la cabez
     */


    public void addToStart(Kid kid) {
        if (head != null) {
            node newNode = new node();
            newNode.setNext(head);
            head = newNode;
        } else {
            head = new node();
        }
    }


    /*algoritmo para adicionar en posicion
    primero saber el tamaño de la lista con un metodo que recorra  la lista hasta que no haya un niño siguiente y en cada vuelta del bucle se va contando
    luego se crea un meotdo donde recive el niño nuevo y en donde se quiere ser agregado
    si la posicion que se quiere es coherente con el tamaño de la lista
      entonces
        se crea el niño
         si la posicion donde se quiere adicionar es 0  lo que sera la cabeza entonces
            entonces  se llamara el metodo que agrega el niño al inicio
         en caso de que sea otra posicion diferente a 0
            entonces se crea un mensajero para que vaya una posicion antes de la pedida
                cuando se llegue a a la posicion entonces
                    se crea un nuevo nodo
                    y el siguiente niño del nuevo nodo sera lo siguiente que teniea el menesajero
                    y lo siguiente del mensjaero sera el nuevo nodo

        en caso de que la posicion no sea posible se agrega al final con un metood agregar

    * */

    public int size() {
        int size = 0;
        node temp = head;
        while (temp != null) {
            size++;
            temp = temp.getNext();

        }
        return size;
    }



    public void addInPosition(int position, Kid kid) {

        if (size() >= position) {



            if (position == 0) {
                addToStart(kid);
            } else {
                node temp = head;
                for (int i = 0; i < position - 1; i++) {
                    temp = temp.getNext();
                }
                node newNode = new node();
                newNode.setNext(temp.getNext());
                temp.setNext(newNode);

            }
        } else {
          add(kid);
        }
    }

    /*
    * algoritmo para eliminar por id
    * se crea una mensajero que sea igual a la cabeza
    * y otro nodo el cual sera para indentificar al anterior nodo
    * lugo se recorre la lista solo en caso de que el mensajer tenga algun valor y en caso de no se haya encontrado el niño con ese id
    * a dentro del bucle el segudno nodo sera igual al mensajero y el mensajero para a otra niño asi hasta que termine el ciclo
    * en caso de que el mensajero no haya quedado vacio
    * entonces
    *       si el nodo previous  es null es porque al que se quiere eliminar es a la cabeza  entonces nunca entraron al bulce
    *           entonces la cabeza sera el valor que le seguia al mensajero o sea el valor sigueite a la cabeza
    *
    *
    *    */

    public void deleteByIdentification(String identification) {
        node temp = head;
        node previousNode = null;
        node Data=null;





        while ((temp != null) && ( temp.getData.getIdentification() != (identification))) {
            previousNode = temp;
            temp= temp.getNext();



        }
          if (temp != null){
                if (previousNode== null){
                    head=temp.getNext();
                }
                else {
                    previousNode.setNext(temp.getNext());
                }
          }


        }
    }



