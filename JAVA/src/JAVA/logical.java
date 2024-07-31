package JAVA;

public class logical {
    public static void main(String[]args){
        int sciencemarks=95;
        if (sciencemarks >= 90 && sciencemarks <= 100) {
            char Grade = 'A';
            System.out.println("Excellent");
        } else if (sciencemarks >= 80 && sciencemarks <= 90) {
            char Grade = 'B';
            System.out.println(" Good");
        } else if (sciencemarks>=70 && sciencemarks <= 80) {
             char Grade = 'C';
            System.out.println("above average");
        } else if (sciencemarks >= 60 && sciencemarks <= 70) {
            char Grade = 'D';
            System.out.println("below average");
        } else {
            char Grade = 'F';
            System.out.println(" fail");
        }







    }
}
