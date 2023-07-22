package homework.hw_2.loops.task2;

public class OutPut {
    /**
     *
     * @param ms массив из которого делаем строку для перемножения
     * @return преобразованную строку
     */
    public String Output(int[] ms){
        StringBuilder builder = new StringBuilder();
        if(ms.length == 1){
            return ms[0] + " = ";
        }else {
            for (int i = 0; i < ms.length; i++) {
                builder.append(ms[i]);
                if(ms.length - 1 == i){
                    builder.append(" = ");
                }else {
                    builder.append(" * ");
                }
            }
        }
        return String.valueOf(builder);
    }
}
