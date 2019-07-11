package methodReference;

import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {
        /**
         * Reference to a Static Method example
         */
        //In the following example, we have defined a functional interface
        // and referring a static method to it's functional method say().
        //Referring static method
        Sayable sayable = MethodReference::saySomething;
        //Calling interface method
        sayable.say();

        //In the following example, we are using predefined functional interface Runnable to refer static method.
        Thread thread = new Thread(MethodReference2::threadStatus);
        thread.start();

        //You can also use predefined functional interface to refer methods.
        BiFunction<Integer, Integer, Integer> adder = Arithmatic::add;
        int result = adder.apply(10, 20);
        System.out.println(result);

        //You can also override static methods by referring methods.
        //In the following example, we have defined and overloaded three add methods.
        BiFunction<Integer, Float, Float> adder2 = Arithmatic::add;
        BiFunction<Float, Float, Float> adder3 = Arithmatic::add;
        float result2 = adder2.apply(10, 20.0f);
        float result3 = adder3.apply(10.0f, 20.0f);
        System.out.println(result2);
        System.out.println(result3);

        /**
         * Reference to an Instance Method example
         */
        InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
        //Referring non-static method using reference
        sayable = instanceMethodReference::saySomethingInMethodReference;
        //Calling interface method
        sayable.say();

        //Referring non-static method using anonymous object
        sayable = new InstanceMethodReference()::saySomethingInMethodReference;
        //Calling interface method
        sayable.say();

        //In the following example, we are referring instance (non-static) method.
        // Runnable interface contains only one abstract method. So, we can use it as functional interface.
        thread = new Thread(new InstanceMethodReference2()::printMsg);
        thread.start();

        //It is a predefined interface and contains a functional method apply().
        BiFunction<Integer, Integer, Integer> adderInstanceMethodReference = new Arithmatic()::addInstanceMethod;
        int result4 = adderInstanceMethodReference.apply(10, 20);
        System.out.println(result4);

        /**
         * Reference to a Constructor example
         */
        //You can refer a constructor by using the new keyword.
        // Here, we are referring constructor with the help of functional interface.
        Messageable messageable = Message::new;
        messageable.getMessage("Hello");
    }
}
