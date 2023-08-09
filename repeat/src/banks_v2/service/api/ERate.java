package banks_v2.service.api;

public enum ERate {
    USD("Американский долар"),
    EUR("Евро"),
    RUB("Российский рубль"),;

    private final String description;

    public String getDescription() {
        return description;
    }

    ERate(String name) {
        this.description = name;
    }

    public static ERate valueOfIgnoreCase(String name){
        //String nameUpper = name.toUpperCase();
        for(ERate rate : values()){
            if(rate.name().equalsIgnoreCase(name)) {
                return rate;
            }
        }
        throw new IllegalArgumentException("Такой валюты не существует");
    }
}
