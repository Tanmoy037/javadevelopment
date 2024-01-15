//  oops in java
public class day11 {
    public static void main(String[] args) {
    //     Pen pen1 = new Pen();
    //     pen1.color = "blue";
    //     pen1.type = "gel";

    //     pen1.write();

    //     Pen pen2 = new Pen();
    //     pen2.color = "black";
    //     pen2.type = "ballpoint";

    //     pen1.printColor();
    //     pen2.printColor();
        Student s1 = new Student();
        s1.name = "Tanmoy";
        s1.age = 24;

        s1.printInfo(s1.name, s1.age);
    }
    
}

// polymorphism
class Student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
        
    }
    public void printInfo(int age) {
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }
}
// Inheritence
class Shape {
    String color;
}

class Triangle extends Shape {
    
}


class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);

    }
}


