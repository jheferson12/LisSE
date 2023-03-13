package co.edu.umanizales.tads.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Kid {
    private String identification;
    private String name;
    private byte age;
    private String city;
    public Kid(String s, String jheferson, byte age){
        this.age=age;
    }

    public byte getAge() {
        return age;
    }
}
