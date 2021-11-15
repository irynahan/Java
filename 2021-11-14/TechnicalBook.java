public class TechnicalBook extends Book{

    private String scientificField;

    public TechnicalBook(int id, String author, int price, String scientificField) {
        super(id, author, price);
        this.scientificField = scientificField;
    }

    public String getScientificField() {
        return scientificField;
    }
}
