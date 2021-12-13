public class NokNod {
    public static void main(String[] args) {
        System.out.println(nod(140, 96));
        System.out.println(nod(15, 28));
        System.out.println(nod(24, 8));
        System.out.println(nod(24, 18));
        System.out.println(nod(84, 90));

        System.out.println(nok(99, 54));
        System.out.println(nok(12, 49));
        System.out.println(nok(60, 90));
        System.out.println(nok(18, 24));

    }

    public static int nok(int a, int b) {
        return a * b / nod(a, b);
    }

    public static int nod(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int rest = max % min;
        if (rest == 0) {
            return min;
        } else {
            return nod(min, rest);
        }
    }

}
