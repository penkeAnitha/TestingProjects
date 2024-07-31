package Polymorphism;

class Employee {//methodoverloading
    int plusmethod(int salary, int hike) {
        return salary + hike;
    }


  static class  Student  {
        int plusmethod(int salary, int bonus, int hike) {
            return salary + bonus + hike;
        }
        public static void main(String[] args) {
         Employee employee=new Employee();
         Student student=new Student();
         int result= employee.plusmethod(15000,5);
         int output=student.plusmethod(15000,500,5);
         System.out.println(result);
         System.out.println(output);
        }
    }
}


