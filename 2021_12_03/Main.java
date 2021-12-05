public class Main {

    public static void main(String[] args) {

        ConcatenationTester tester = new ConcatenationTester();

        System.out.println(tester.test(new StringConcatenator(), "Hello world guys", 100000));
        System.out.println(tester.test(new StringBufferConcatenator(), "Hello world guys", 100000));
        System.out.println(tester.test(new StringBuilderConcatenator(), "Hello world guys", 100000));
        System.out.println(tester.test(new CharArrayConcatenator(), "Hello world guys", 100000));
    }

}
