public class BestSeller extends LiteratureBook{

    private final int bestsellerPrice;

    public BestSeller(int id, String title, String author, int price, double coef) {
        super(id, title, author, price);
        this.bestsellerPrice = (int) (super.computePrice() * coef);
    }

    // BestSeller наслудует литературную книгу(!) и имеет дополнительное поле, которое рассчитывается из
    // стоимости литературной(!) книги, умноженной на коэффициент


    @Override
    public int computePrice() {
        return bestsellerPrice;
    }
}
