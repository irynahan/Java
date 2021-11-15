public class LiteratureBook extends Book{
    // LiteratureBook наследует книгу,
    // кроме того цена литературной книги рассчитывается из суммы базовой стоимости и 10 условных

    public LiteratureBook(int id, String author, int price) {
        super(id, author, price);
    }

    @Override
    public int computePrice() {
        return super.computePrice() + 10;
    }
}
