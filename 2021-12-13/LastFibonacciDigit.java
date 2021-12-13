import java.lang.reflect.Array;

public class LastFibonacciDigit {

    public static void main(String[] args) {
        // System.out.println(1+"  "+lastFibonacciNumber(1));
        // System.out.println(2+"  "+lastFibonacciNumber(2));
        for(int eachValue : new int[]{ 1,2,3,4,5,6,7,8,9,10, (int)(Math.pow(2,31)-1) } ) {
            System.out.println(eachValue+"  " + getFibonacci(eachValue)+"  "+lastFibonacciNumber(eachValue));
        }
    }


    // Найти последнюю цифру числа фибоначи под номером до 2^31-1
    public static int lastFibonacciNumber(int number){
        long fibonacci = getFibonacci(number);
        return (int) (fibonacci % 10);
    }

    static long getFibonacci(int targetNumber){
        if(targetNumber<0){
            throw new IllegalArgumentException(" fd;kaljfkldj fdsa fkjsda; fjas");
        }
        if(targetNumber==1){
            return 0L;
        }
        if(targetNumber==2){
            return 1L;
        }
        long first = 0;
        long tempSecond = 0;
        long second = 1;
        int number=3;
        while(number<=targetNumber){
            tempSecond = second;
            second = first + second;
            first = tempSecond;
            number++;
        }
        return second;
    }

}
