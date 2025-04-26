class Pen {
    String color;
    String type;
    
    public void printInfo() {
        System.out.println("Color = " + this.color);
        System.out.println("Type = " + this.type);
    }
    
    Pen(String color, String type) {
        this.color = color;
        this.type = type;
        System.out.println("Constructor called");
    }
    
    Pen(Pen p) {
        this.color = p.color;
        this.type = p.type;
    }
}

public class DemoConstructor {
    public static void main(String[] args) {
        Pen p1 = new Pen("black", "gel");
        Pen p2 = new Pen(p1);
        p2.printInfo();
        p1.printInfo();

    }
}
