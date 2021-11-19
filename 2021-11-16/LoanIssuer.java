public class LoanIssuer {
    String name;
    String surname;
    boolean isLazy;
    boolean isKind;

    public LoanIssuer(String name, String surname, boolean isLazy, boolean isKind) {
        this.name = name;
        this.surname = surname;
        this.isLazy = isLazy;
        this.isKind = isKind;
    }

    public boolean toProvide(LoanUser user) {
        if (user.annualSalary < 20000) {
            return false;
        }

        if (this.isLazy == true) {
            return true;
        }

        if (this.isKind == true && user.age <= 70) {
            return true;
        }

        if (this.isKind == false && user.age <= 50) {
            return true;
        }
        return false;
    }
}