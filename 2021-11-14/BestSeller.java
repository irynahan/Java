public class BestSeller extends LiteratureBook{
    private double koef;
    private double bestSellerPrice;

    public BestSeller(int id, String author, int price, double koef) {
        super(id, author, price);
        this.koef = koef;
        this.bestSellerPrice = this.koef * this.getPrice();
    }
    // BestSeller наслудует литературную книгу(!) и имеет дополнительное поле, которое рассчитывается из
    // стоимости литературной(!) книги, умноженной на коэффициент


}
