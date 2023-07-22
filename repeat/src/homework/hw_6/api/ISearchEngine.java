package homework.hw_6.api;

public interface ISearchEngine {

    /**
     *Метод для определения того, сколько раз слово встретилось в тексте
     * @param text текст в котором ищем
     * @param word что ищем в тексте
     * @return Метод возвращает информации о количестве раз которое встречается слово в тексте
     */
    long search(String text, String word);
}
