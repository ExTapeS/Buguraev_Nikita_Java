import java.util.Arrays;

public class Main {

    static int [] array = new int[]{3, 5, 6, 9, 11, 12};

    public static void main(String[] args) {
        FirstTask.TheFirstTask();
        SecondTask.TheSecondTask();
        ThirdTask.TheThirdTask1();
        System.out.println(Arrays.toString(ThirdTask.TheThirdTask2(array)));
    }
}