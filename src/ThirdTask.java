import java.util.ArrayList;
import java.util.Scanner;

public class ThirdTask {

    public static void TheThirdTask1(){
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Введите числа через пробел");
        String kek = scanner3.nextLine();
        String [] array = kek.split(" ");
        int[] arrayOfInts = new int[array.length];
        for(int i = 0; i< array.length; i++){
            arrayOfInts[i]=Integer.valueOf(array[i]);
        }

        ArrayList<Integer> arrayOfIntsFinal = new ArrayList<Integer>();

        for (int i = 0; i<arrayOfInts.length; i++){
            if(arrayOfInts[i]%3 == 0){
                arrayOfIntsFinal.add(arrayOfInts[i]);
            }
        }

        System.out.println(arrayOfIntsFinal);

    }

    public static int [] TheThirdTask2(int[] intArray){

        int lengthOfTheNewArray = 0;
        for(int i = 0; i< intArray.length; i++){
            if(intArray[i]%3==0){
                lengthOfTheNewArray++;
            }
        }

        int [] arrayOfThirds = new int[lengthOfTheNewArray];
        int count = 0;
        for(int i = 0; i< intArray.length; i++){
            if(intArray[i]%3==0){
                arrayOfThirds[count]=intArray[i];
                count++;
            }
        }

        return arrayOfThirds;
    }


}
