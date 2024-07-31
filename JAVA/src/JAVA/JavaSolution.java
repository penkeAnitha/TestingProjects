package JAVA;

    class Animal{
            void walk(){
                System.out.println("iam Walking");
            }
        }
        class Bird extends Animal{
            void fly(){
                System.out.println("iam flying");
            }
        }
         class Solution {
            public static void main(String[] args) {
                Bird bird = new Bird();
                bird.walk();
                bird.fly();
            }
        }


