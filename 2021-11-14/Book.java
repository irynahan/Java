public class Book{

    private int id;
    private String author;
    private int price;

    public Book(int id, String author, int price) {
        this.id = id;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int computePrice(){
        return price;
    }
}
