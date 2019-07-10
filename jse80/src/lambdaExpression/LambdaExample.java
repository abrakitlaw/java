package lambdaExpression;

public class LambdaExample {

    public static void main(String[] args) {

        StateOwner stateOwner = new StateOwner();

        stateOwner.addStateListener(new StateChangeListener() {
            @Override
            public void onStateChange() {
                System.out.println("State changed");
            }
        });
    }
}
