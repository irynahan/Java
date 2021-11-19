public class Main {

    public static void main(String[] args) {
        LoanUser youngUser = new LoanUser("Vasya", "Vasin", 49, 30000);

        LoanIssuer lazyAndKindIssuer = new LoanIssuer("Maria", "Petrovna", false, false);

        System.out.println(lazyAndKindIssuer.toProvide(youngUser));// the result tells whether the issuer provides a loan to the user
    }
}
