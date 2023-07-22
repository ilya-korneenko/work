package workDay;

public class workDay {
    /**
     * @weekday - true, если будний день
     * @vacation - true, если отпуск
     * @algotithm - true, если можно спать
     */

    private boolean weekday;
    private boolean vacation;

    private boolean algorithm;

    public boolean getAlgorithm() {
        return algorithm;
    }


    public boolean getWeekday(){
        return weekday;
    }

    public void setWeekday(boolean weekday) {
        this.weekday = weekday;
    }

    public boolean getVacation() {
        return vacation;
    }

    public void setVacation(boolean vacation) {
        this.vacation = vacation;

    }

    public void algorithm(boolean weekday, boolean vacation) {
        /*
         * weekday 0 vacation 0 - true
         * weekday 0 vacation 1 - true
         * weekday 1 vacation 0 - false
         * weekday 1 vacation 1 - true
         * */

        if (!weekday && !vacation) {
            this.algorithm=true;
        } else if (!weekday && vacation) {
            this.algorithm=true;;
        } else if (weekday&&!vacation) {
            this.algorithm=false;
        } else if (weekday&&vacation) {
            this.algorithm=true;
        }

    }

    public void output(boolean algorithm) {
        if (algorithm) {
            System.out.println("Спи");
        } else {
            System.out.println("Иди работать");
        }
    }

}
