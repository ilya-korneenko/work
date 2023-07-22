package homework.hw_4;

import homework.hw_4.comparator.ComparableComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class DataContainer<T> implements Iterable<T> {
    private T[] data;

    /**
     * @param data
     */
    public DataContainer(T[] data) {
        this.data = Arrays.copyOf(data, data.length);
    }

    /**
     * метод вставки
     *
     * @param item значение, которое добавляется в массив
     * @return индекс, вставленного элемента
     */
    public int add(T item) {
        if (item != null)                                           //проверка item
        {
            if (data.length == 0) {                                 //проверка массива на наличие размера
                data = Arrays.copyOf(data, 1);
                data[0] = item;
                return 0;   //&
            } else {                                                //проверка на наличие в массиве null
                boolean flagOfNullExist = false;
                int indexAdd = 0;
                for (int i = 0; i < data.length; i++) {
                    if (data[i] == null) {
                        flagOfNullExist = true;
                        indexAdd = i;
                        break;
                    }
                }
                if (flagOfNullExist) {                              //если null есть в массиве
                    data[indexAdd] = item;
                    return indexAdd;
                } else {
                    data = Arrays.copyOf(data, data.length + 1);   //если в массиве нет null
                    data[data.length - 1] = item;
                    return data.length - 1;
                }
            }
        } else {
            return -1;
        }
    }

    /**
     * метод получения элемента по индексу
     *
     * @param index индекс
     * @return возвращает элемент, либо null при отсутствии такого индекса
     */
    public T get(int index) {
        if (index >= data.length) {
            return null;
        } else {
            return data[index];
        }
    }

    /**
     * данный метод возвращает поле data
     *
     * @return data
     */
    public T[] getItems() {
        return Arrays.copyOf(this.data, this.data.length);
    }

    /**
     * удаление элемента по индексу
     *
     * @param index индекс, по которому удаляется элемент
     * @return true - если индекс присутствует и удаление прошло успешно
     * false - если такого индекса нет
     */
    public boolean delete(int index) {
        if (index < data.length) {
            for (int i = index; i < data.length; i++) {
                for (int j = i + 1; j < data.length; j++) {
                    data[i] = data[j];
                    break;
                }
            }
//            T[] tmp = Arrays.copyOf(data, data.length - 1);
//            data = tmp;

            data = Arrays.copyOf(data, data.length - 1);
            return true;
        } else {
            return false;
        }
    }

    /**
     * удаление по элементу
     *
     * @param item элемент
     * @return true - если элемент есть, и его удалили
     * false - если элемента нет и удаления не было
     */
    public boolean delete(T item) {
        if (item != null) {
            boolean flagOfExist = false;
            int indexElement = 0;
            for (int i = 0; i < data.length; i++) {
                if (item.equals(data[i])) {
                    flagOfExist = true;
                    indexElement = i;
                }
                if (flagOfExist)
                    break;
            }
            if (flagOfExist) {
                delete(indexElement);
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }

    /**
     * моя сортировка, которую стоит убрать видимо
     * @param comparator
     * @param container
     */
    public void sort(Comparator<? super T> comparator, DataContainer container) {
        //сортировка пузырьком
        int numberItems = container.data.length;
        Object[] tmp = container.data;

        for (int i = 0; i < numberItems - 1; i++) {
            for (int j = 0; j < numberItems - i - 1; j++) {
                if (tmp[j] != null && tmp[j + 1] != null) {
                    if (tmp[j + 1].hashCode() < tmp[j].hashCode()) {
                        Object swap = tmp[j];
                        tmp[j] = tmp[j + 1];
                        tmp[j + 1] = swap;
                    }
                }
            }
        }

    }


    /**
     * правильная сортировка
     * @param cmp
     */
    public void sort(Comparator<? super T> cmp) {
        boolean sort = false;

        while (!sort){
            for (int i = 1; i < data.length; i++) {
                sort=true;
                if(cmp.compare(this.data[i-1], this.data[i])>0){
                    T tmp = this.data[i-1];
                    this.data[i-1]= this.data[i];
                    this.data[i]=tmp;
                    sort=false;
                }
            }
        }
    }

    public static <T> void sort(DataContainer<T> container, Comparator<? super T> comparator){

        boolean sort = false;

        // container.sort(comparator); - можно было описать всё одной строкой

        while (!sort){
            for (int i = 1; i < container.data.length; i++) {
                sort=true;
                if(comparator.compare(container.data[i-1], container.data[i])>0){
                    T tmp = container.data[i-1];
                    container.data[i-1]= container.data[i];
                    container.data[i]=tmp;
                    sort=false;
                }
            }
        }
    }

    public static void sort(DataContainer<? extends Comparable> dataContainer){
        dataContainer.sort(new ComparableComparator());
    }

    /**
     * исправить наличие запятых в середине массива ", ," && [, ..] && [..., ]
     *
     * @return строку с массивом
     */
    @Override
    public String toString() {
        if (data == null)
            return "null";

        int iMax = data.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            if (data[i] != null) {
                b.append(String.valueOf(data[i]));
            }
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }


    private boolean checkExistIndex(T[] data, int i) {
        return i >= 0 || i < data.length - 1;
    }

    @Override
    public Iterator<T> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<T> {

        private int currentPosition;

        @Override
        public boolean hasNext() {
            return checkExistIndex(data, currentPosition + 1);
        }
        @Override
        public T next() {
            return data[currentPosition++];
        }

    }
}