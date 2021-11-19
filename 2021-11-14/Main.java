public class Main {
    public static void main(String[] args) {
// В классе Main написать статический метод String describeBook(Book book), отдающий описание книги (использующее поля книги)
// в метое main создать несколько книг, сделать массив из них и вызвать описание каждой книги из массива. (отредактировано)
        Book book1 = new Book(1, "Book1","Author1", 15);
        Book book2 = new TechnicalBook(2, "Book2", "Author2", 10, "Mathe");
        Book book3 = new LiteratureBook(3, "Book3", "Author3", 23);
        Book book4 = new BestSeller(4, "Book4", "Author4", 5, 1.33);

        Book[] books = new Book[]{book1, book2, book3, book4};
        for (Book eachBook : books) {
            System.out.println(describeBook(eachBook));
        }
    }

    static String describeBook(Book book) {
        return book.getId() + "\t" +  book.getAuthor() + "\t" + book.getTitle() + "\t" + book.computePrice();
    }
}

