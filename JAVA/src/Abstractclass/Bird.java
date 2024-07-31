package Abstractclass;

class Bird extends Abstractclass2 {
     public void soundmakes (){
         System.out.println("bird makes sound");
         }
         public void breathing(){
         System.out.println(" bird is breathing through lungs ");
         }
         public void eating(){
         System.out.println("bird is eating");
         }
         public void moving(){
         System.out.println("bird is moving");
         }
         public static void main(String[]args){
         Bird mybird=new Bird();{
              mybird.soundmakes();
              mybird.breathing();
              mybird.sleeping();
              mybird.eating();
              mybird.moving();
         }

         }
     }

