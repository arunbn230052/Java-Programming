public class ObjectClass {
    String color;
    int age;
    int height;
    String breed;

    public ObjectClass() {
        System.out.println("Object Created");
    }
    public void run() {
        System.out.println("Dog Details: Color - " + color + ", Age - " + age + ", Height - " + height + ", Breed - " + breed);
    }

    public void printrun() {
        System.out.println("Color = " + this.color);
        System.out.println("Age = " + this.age);
        System.out.println("Height = " + this.height);
        System.out.println("Breed = " + this.breed);
    }

    public static void main(String[] args) {
    
        ObjectClass d1 = new ObjectClass();
        d1.color = "black";
        d1.age = 12;
        d1.height = 23;
        d1.breed = "breed 2";
        d1.run();

        ObjectClass d2 = new ObjectClass();
        d2.color = "black";
        d2.age = 10;
        d2.height = 20;
        d2.breed = "breed 2";
        d2.run();

        ObjectClass d3 = new ObjectClass();
        d3.color = "black";
        d3.age = 15;
        d3.height = 24;
        d3.breed = "breed 3";
        d3.run();

        Student s1 = new Student();
        s1.name = "Arun";
        s1.age = 22;
        s1.rollNo = 1234;  // rollNo should be int, not char
        s1.address = "Rautahat";
        s1.program = "BSIT";
        s1.detail();
    }
}

class Student {
    String name;
    int rollNo;
    int age;
    String address;
    String program;

    public void detail() {
        System.out.println("Name = " + this.name);
        System.out.println("Program = " + this.program);
        System.out.println("Roll No = " + this.rollNo);
        System.out.println("Age = " + this.age);
        System.out.println("Address = " + this.address);
    }
}
