 Class Book {
    private String title;
    private String author;
    private double price;
    private String ISBN;

    public Book(String title, String author, double price, String ISBN) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.ISBN = ISBN;
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("ISBN: " + ISBN);
        System.out.println();
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99, "978-0743273565");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 12.50, "978-0061120084");

        System.out.println("Book 1 Details:");
        book1.displayDetails();
        
        System.out.println("Book 2 Details:");
        book2.displayDetails();
    }
}


