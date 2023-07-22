package hashcode;


import static com.sun.tools.doclint.Entity.pi;

public class HashcodeConcept {
    public static void main(String[] args) {
        Simpson homer = new Simpson(1, "Homer");
        Simpson bart = new Simpson(2, "Homer");

        boolean isHashcodeEquals = homer.hashCode() == bart.hashCode();
        if (isHashcodeEquals){
            System.out.println("Стоит сравнить методы equals.");
        }else{
            System.out.println("Не стоит сравнивать методами equals " +
                    "т.к. индетификатор отличается => точно не равны");

        }

    }
}
