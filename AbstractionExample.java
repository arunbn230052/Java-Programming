abstract class MahindraCar {
    public abstract void engine();
    public abstract void gear();
    
    public void playmusic() {
        System.out.println("Play music");
    }
    
    MahindraCar() {
    }
}

class Thar extends MahindraCar {
    @Override
    public void engine() {
        System.out.println("Bolero engine");
    }

    @Override
    public void gear() {
        System.out.println("Bolero gear");
    }
}

interface Book {
    void bookInformation();
}

interface EngineeringBook {
    public static int ISBN_NUM=2342425;
    void engBookinfo();
    public void engineerBook(){
        System.out.println();
    }
}

class ITBook implements Book, EngineeringBook {
    @Override
    public void bookInformation() {
        System.out.println("Book information");
    }

    @Override
    public void engBookInfo() {
        System.out.println("Engineering book information");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        MahindraCar mCar = new Thar();
        mCar.engine();
        mCar.gear();

        Book book = new ITBook();
        book.bookInformation();
    }
}


