package OOPS.classes_objects;

public class Employee {
    String name;
    int id;
    int salary;

    void display(){
        System.out.println("NAME: "+name);
        System.out.println("ID: "+id);
        System.out.println("SALARY: "+salary);

    }
    public static void main(String[] args){
        Employee ob=new Employee();
        ob.name="abhi";
        ob.id=001;
        ob.salary=500000;
        Employee ob1=new Employee();
        ob1.name="bhumit";
        ob1.id=002;
        ob1.salary=47000;
        Employee ob2=new Employee();
        ob2.name="ajay";
        ob2.id=003;
        ob2.salary=22000;

        ob.display();
        ob1.display();
        ob2.display();
    }
}
