package Enum;

public class enumClass {
    public static void main(String[] args) {
        Level level = Level.high;
        System.out.println(level);
        switch (level) {
            case LOW:
                System.out.println("low level");
            break;
            case medium:
                System.out.println("medium level");
                break;
            case high:
                System.out.println("high level");
                break;
        }
    }
}

