package jinsong.tacocloud;


import lombok.Data;
import org.springframework.lang.NonNull;

import javax.validation.constraints.Size;
import java.util.List;

@Data
public class Taco {
    @NonNull
    @Size(min=5, message="Name must be at least 5 characters long")
    private String name;

    @NonNull
    @Size(min=1, message="You must choose at least 1 ingredient")
    private List<String> ingredients;

    public Taco() {
    }

    @Override
    public String toString() {
        return "Taco{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
