package lamda;

@FunctionalInterface
public interface ICall {
    boolean call(String number);
    default boolean callToMother(){
        return call("+375333333333");
    }
}
