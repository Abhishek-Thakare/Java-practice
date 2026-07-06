package OOPS.classes_objects;

public class Emloyee {
    String name;
    int id;
    int salary;

    void display(){
        System.out.println("NAME: "+name);
        System.out.println("ID: "+id);
        System.out.println("SALARY: "+salary);

    }
    public static void main(String[] args){
        Emloyee ob=new Emloyee();
        ob.name="abhi";
        ob.id=001;
        ob.salary=500000;
        Emloyee ob1=new Emloyee();
        ob1.name="bhumit";
        ob1.id=002;
        ob1.salary=47000;
        Emloyee ob2=new Emloyee();
        ob2.name="ajay";
        ob2.id=003;
        ob2.salary=22000;

        ob.display();
        ob1.display();
        ob2.display();
    }
}
