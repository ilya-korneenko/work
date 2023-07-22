package banks.service.api;

public enum ERate {
    USD("Американский доллар"),
    EUR("Евро"),
    RUB("Российский рубль");

    private final String description;
    ERate(String description) {
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

    public static ERate valueOfIgnoreCase(String name){
        for (ERate rate: values()){
            if(rate.name().equalsIgnoreCase(name)){
                return rate;
            }
        }
        throw new IllegalArgumentException("Такой валюты не существует");
    }
}
