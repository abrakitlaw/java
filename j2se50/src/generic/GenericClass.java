package generic;

public class GenericClass implements GenericInterface<String, Integer> {

    @Override
    public Integer doSomeOperation(String t) {
        return 1;
    }

    @Override
    public String doReverseOperation(Integer t) {
        return "One";
    }
}
