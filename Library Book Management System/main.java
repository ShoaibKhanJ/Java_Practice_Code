class Book{
    String title;
    String author;
    int price;
    static int totalbooks;

    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
        totalbooks ++;
    }

    void displayBookDetails(){
        System.out.println("Title: "+ this.title);
        System.out.println("Author: "+ this.author);
        System.out.println("Price: "+ this.price);
    }

    static void bookcount(){
        System.out.println("Total Books Count: "+ totalbooks);
    }
}

class main{
    public static void main(String[] args) {
        Book b1 = new Book("Eat that Fog", "Brain Tracy", 850 );
        Book b2 = new Book("The Art of Laziness", "Library Mindset", 700 );
        Book b3 = new Book("Attitude is Everything", "Jeff Keller", 550 );


        System.out.println("------------------------------");
        b1.displayBookDetails();
        System.out.println("------------------------------");
        b2.displayBookDetails();
        System.out.println("------------------------------");
        b3.displayBookDetails();
        System.out.println("------------------------------");
        
        Book.bookcount();

    }
}