package lambdaExpression;

public class LambdaExample {

    public static void main(String[] args) {

        StateOwner stateOwner = new StateOwner();

        stateOwner.addStateListener(() -> System.out.println("State changed"));
    }
}
