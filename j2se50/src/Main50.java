import annotations.Cat;
import annotations.Dog;
import enumeration.DirectionEnum;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class Main50 {

    public static void main(String[] args) {

        //Annotation override example
        Dog dog = new Dog();
        dog.speak();
        out.println("Type: " + dog.getType());


        //Generic Type example
        List<Cat> cats = new ArrayList<Cat>();
        Cat cat = new Cat("Anggora", "Meoww");
        cats.add(cat);
        cat = new Cat("Persian", "Meooowwww");
        cats.add(cat);

        //Enum example
        DirectionEnum south = DirectionEnum.SOUTH;
        out.println(south);

        //For-each loop example
        for (Cat value : cats) {
            out.println("Cat type: " + value.getType() + ", cat sounds: " + value.getSound());
        }
    }
}
