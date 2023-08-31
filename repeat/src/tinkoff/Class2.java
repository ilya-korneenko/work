package tinkoff;

public class Class2 {
    public int razrez(int N){
        int raz = 0;
        if(N%2==0){
            if(N==2){
                return 1;
            }
            while (N!=0){
                raz++;
                N/=2;
            }
            //return raz;
        }else{
            while (N!=1){
                raz++;
                N/=2;
            }
            raz++;
        }
        return raz;
    }
}
