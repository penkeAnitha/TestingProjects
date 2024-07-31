package Enum;

public class Test {
    private String name;
    private DAyOFWEEK day;

    public  Test(String name, DAyOFWEEK day) {
        this.name = name;
        this.day = DAyOFWEEK.MONDAY;
    }

    public String getname(){
        return name;
    }

    public DAyOFWEEK getday(){
        return day;
    }
}
