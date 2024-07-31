package Practiceclass;

public class Bird extends Pet {
    double wingspan;
    public Bird(String name,int age,double wingspan){
        super(name,"Bird",age);
     this.wingspan=wingspan;
    }
    public void printdetials(){
        super.printdetails();
        System.out.println("wingspan:"+wingspan+"meters");
    }

        public static void main(String[]args){
            Dog dog=new Dog("charle",7,"ball");
            System.out.println("dog details:");
            dog.printdetails();
            System.out.println("dog's age in human years"+dog.calculateHumanAge());
            Bird bird=new Bird("wing",9,8.5);
            System.out.println("Bird Details:");
                    bird.printdetials();
            System.out.println("Bird's age in human years:"+dog.calculateHumanAge());
        }
    }



