import java.util.Random;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        // TODO code application logic here

        Random g = new Random();
        int [] number = new int [100];

        System.out.print(" Random Numbers:");
        for (int d = 0 ; d < number.length ; d++){
            int RandomG = g.nextInt(100)+1;
            number[d] = RandomG;
            System.out.print(" " +RandomG);
        }
        long startTime = System.nanoTime();
        System.out.print("\n Sorted Numbers:"+Arrays.toString(BubbleSortAscendMethod(number)));

        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("\n Execution time in microseconds :" + timeElapsed / 1000);

    }
    public static int [] BubbleSortAscendMethod(int[] number){
        int temp;

        for(int i = 0 ; i < number.length-1 ; i++){
            for ( int j = 1 ; j < number.length - i ; j++){
                if ( number[j-1] > number[j]){
                    temp = number[j-1];
                    number[j-1] = number[j];
                    number[j] = temp;
                }
            }
        }
        return number;
    }
}