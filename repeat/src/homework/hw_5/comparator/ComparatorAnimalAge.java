package homework.hw_5.comparator;

import homework.hw_5.dto.Animal;

import java.util.Comparator;

public class ComparatorAnimalAge implements Comparator<Animal> {

    /**
     * компаратор по возрасту животных
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return положительное, если возраст 1 > возраста 2
     *         отрицательное, если возраст 1 < возраста 2
     *         0, если возраст 1 = возрасту 2
     */
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getAge() - o2.getAge();
    }
}
