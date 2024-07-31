package JAVA;
 class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

        public static void main(String[]args){
            Person person=new Person("Anitha",21);
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }
    }



