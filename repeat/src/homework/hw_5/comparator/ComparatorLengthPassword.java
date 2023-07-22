package homework.hw_5.comparator;

import homework.hw_5.dto.Person;

import java.util.Comparator;

public class ComparatorLengthPassword implements Comparator<Person> {
    /**
     * компаратор по длине пароля
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return положительное, если длина 1 > длины 2
     *         отрицательное, если длина 1 < длины 2
     *         0, если длина 1 = длине 2
     */
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getPassword().length() - o2.getPassword().length();
    }
}
