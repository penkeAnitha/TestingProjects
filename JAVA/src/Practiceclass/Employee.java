package Practiceclass;
//Write a Java program to create a class called "Employee" with a name, job title, and salary attributes,
// and methods to calculate and update salary.
public class Employee {
    private String name;
    private String jobtitle;
    private double salary;

    public Employee(String name, String jobtitle, double salary) {
        this.name = name;
        this.jobtitle = jobtitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobtitle() {
        return jobtitle;

    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void raisesalary(double percentage) {
        salary = salary + salary * percentage / 100;
    }

    public void printEmployeedetails() {
        System.out.println("Name:" + name);
        System.out.println("Jobtitle" + jobtitle);
        System.out.println("salary" + salary);
    }

        public static void main(String[] args) {
     Employee employee=new Employee("kushi", "Hr manager", 40000);
     Employee employee1=new Employee("anusha","software developer",20000);
     employee.printEmployeedetails();
     employee1.printEmployeedetails();
     employee.raisesalary(12);
     employee1.raisesalary(8);
     System.out.println(" after raising salary:");
     System.out.println(" 12% raising  for 'Kushi':");
     employee.printEmployeedetails();
     System.out.println(" after raising salary:");
     System.out.println(" 8% raising  for 'Anusha':");
     employee1.printEmployeedetails();
        }
    }



