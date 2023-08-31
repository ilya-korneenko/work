package streamWork.Supplier;

import streamWork.dto.Student;
import streamWork.dto.StudentsBuilder;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class SupplierStudents implements Supplier {
    private final ThreadLocalRandom rnd = ThreadLocalRandom.current();
    private final String[] names = {"Иля", "Буся", "Кирилл", "Ваня", "Вика", "Алина", "Полина",
            "Болт", "Аркадий", "Смоук"};
    private final String[] secondNames = {"Первый", "Второй", "Третий", "Четвертый", "Пятый",
            "Шестой", "Седьмой", "Восьмой", "Девятый"};
    private final String[] middleNames = {"Cергеевич", "Александрович", "Викторович", "Ильич", "Инокентьевич",
            "Никитич", "Абрамович", "Герасимович"};


    @Override
    public Student get() {

        String name = names[rnd.nextInt(0, names.length)];
        String secondName = secondNames[rnd.nextInt(0, secondNames.length)];
        String midleName = middleNames[rnd.nextInt(0, middleNames.length)];
        String FIO = name + " " + secondName + " " + midleName;
        return StudentsBuilder.create()
                .setName(name)
                .setSecondName(secondName)
                .setMidleName(midleName)
                .setAssessment(rnd.nextDouble(0,10))
                .setFIO(FIO)
                .build();


    }
}
