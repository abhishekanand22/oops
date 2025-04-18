// class Pen{
//     String color;
//     String type;

//     public void writing(){
//         System.out.println(this.type);
        
//     }

// }



// public class oops{
//     public static void main(String args[])
//     {
//         Pen pen1 = new Pen();

//         pen1.color="blue";
//         pen1.type="ballpoint";

//         pen1.writing();
//     }
// }


//polymorphism

// class Student{

//     String name;
//     int age;

//     public void printInfo(String name){
//         System.out.println(name);
//     }

//     public void printInfo(int age){
//         System.out.println(age);
//     }

//     public void printInfo(String name, int age){
//         System.out.println(name);
//         System.out.println(age);
//     }
// }

// public class oops{
//     public static void main(String args[])
// {
//     Student s1 = new Student();

//     s1.name="aman";
//     s1.age=23;

//     s1.printInfo(s1.age);
//     s1.printInfo(s1.name);
//     s1.printInfo(s1.name+ " "+ s1.age);

// }
// }


//inheritance

// class Shape{
//     public void Area(){
//         System.out.println("Displays Area : ");
//     }
// }

// class Triangle extends Shape{
//     public void Area(int h,int b){
//         System.out.println(0.5*b*h);
//     }
// }


// public class oops{
//     public static void main(String args[])
//     {
//         Triangle t1 = new Triangle();

//         t1.Area();
//         t1.Area(5, 67);
//     }
// }


// encapsulation


// abstraction through abs class

// abstract class Animal{
//     abstract void walk();
//     public void breathe(){
//         System.out.println("Animal breathing...");
//     }
// }

// class Horse extends Animal{
//     void walk(){
//         System.out.println("Animal walks on 4 legs.");
//     }

// }

// class Chiken extends Animal{
//     void walk(){
//         System.out.println("Walks on 2 legs.");
//     }
// }


// public class oops{
//     public static void main(String args[])
//     {
//         Horse h1 = new Horse();

//         h1.walk();
//         h1.breathe();
//     }
// }



// abs through interface

interface Animal{
    void walk();
}

class Horse implements Animal{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

public class oops {
    public static void main(String args[])
    {
        Horse h1 = new Horse();
        h1.walk();
    }
    
}