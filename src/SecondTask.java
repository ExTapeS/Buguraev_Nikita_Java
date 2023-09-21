import java.util.Scanner;

public class SecondTask {

    public static void TheSecondTask(){
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner2.nextLine();
        if(name.equals("Вячеслав")){
            System.out.println("Привет, Вячеслав");
        }else{
            System.out.println("Нет такого имени");
        }
    }
}
