package Javainheritance;
    class Grandfather {//Heirachial inheritance
        public void land() {
            System.out.println("grandfather  land");
        }

      static class Father extends Grandfather {
            public void car() {
                System.out.println("father car");
            }

            static class Son extends Father {
                public void gold() {
                    System.out.println("Son gold");
                }

          static  class Uncel extends Father {
                    public static void main(String[] args) {
                        Father father=new Father();
                        father.car();
                        Grandfather grandfather=new Grandfather();
                        grandfather.land();
                        Son son=new Son();
                        son.gold();

                    }
                }
            }
        }
    }


