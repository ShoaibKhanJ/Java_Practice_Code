class Book{
    String title;
    String author;
    int price;
    static int totalbooks;

    book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
        totalbooks ++;
    }

    void Bookdetails(){
        Sytsem.out.println("Title: "+ this.title);
        Sytsem.out.println("Author: "+ this.author);
        Sytsem.out.println("Price: "+ this.price);
    }

    static void bookcount(){
        Sytsem.out.println("Total Books Count: "+ totalbooks);
    }
}

class main{
    public static void main(String[] args) {
        Book b1 = new Book("Eat that Fog", "Brain Tracy", 850 );
        Book b2 = new Book("The Art of Laziness", "Library Mindset", 700 );
        Book b3 = new Book("Attitude is Everything", "Jeff Keller", 550 );


        Sytsem.out.println("------------------------------");
        b1.Bookdetails();
        Sytsem.out.println("------------------------------");
        b2.Bookdetails();
        Sytsem.out.println("------------------------------");
        b3.Bookdetails();
        Sytsem.out.println("------------------------------");
        
        Book.bookcount();

    }
}