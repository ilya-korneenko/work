package homework.hw_2.loops.task1;

public class outPutFactorial {
    public String outputfactorial(long number){
        StringBuilder builder = new StringBuilder();
        if (number == 0){
            return "0! = ";
        } else if (number == 1) {
            return "1! = ";
        } else {
            for (int i = 1; i <= number; i++) {
                builder.append(i);
                if(i != number) {
                    builder.append(" * ");
                }else {
                    builder.append(" = ");
                }
            }
        }
        return String.valueOf(builder);
    }

}
