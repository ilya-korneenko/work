package homework.hw_2.task5.five;

public class RangeInIncrements {
    public StringBuilder RangeIncrements(int min, int max, int step){
        StringBuilder stringBuilder = new StringBuilder();
        while (min <= max){
            if(min + step <= max ) {
                stringBuilder.append(min).append(", ");
                min += step;
            }else{
                stringBuilder.append(min);
                min+=step;
            }
        }
        return stringBuilder;
    }
}
