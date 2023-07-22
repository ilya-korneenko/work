package object;

import homework.hw_5.comparator.ComparatorPersonNick;
import homework.hw_5.dto.Person;

import java.util.Comparator;

public class Main1 {
    public static void main(String[] args) {
        Comparator<Person> cmpFromClass = new ComparatorPersonNick();
        Comparator<Person> cmpFromAnonClass = new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.getNick().compareTo(person2.getNick());
            }
        };

        Comparator<Person> cmpFromLambda = (person1, person2) ->
                person1.getNick().compareTo(person2.getNick());

        //верх и низ взаимозаменяемы

        Comparator<Person> cmpFromLambdaWithBody = (person1, person2) -> {
            String nick1 = person1.getNick();
            String nick2 = person2.getNick();
            return nick1.compareTo(nick2);
        };

        /**
         * **
         * То самое главное
         */
        Comparator<Person> cmpFromRef = Main1::refToMethod;

        System.out.println(cmpFromClass);
        System.out.println(cmpFromAnonClass);
        System.out.println(cmpFromLambda);
        System.out.println(cmpFromLambdaWithBody);
        System.out.println(cmpFromRef);
    }

    /**
     * Главное! этот метод совпадает по принимаемым параметрам
     * и по возвращаемому объекту
     * Будет использоваться ссылка на метод
     * @param o1 1й персон
     * @param p2 2й персон
     * @return +/-/0
     */
    public static int refToMethod(Person o1, Person p2){
        String nick1 = o1.getNick();
        String nick2 = p2.getNick();
        return nick1.compareTo(nick2);
    }
}
