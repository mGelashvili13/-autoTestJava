import model.FunctionalEnum;
import model.User;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello world");


        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер операции: ");
        int num = in.nextInt();
        System.out.printf("Вы ввели: %d \n", num);
            if (num == 1) {
                System.out.println("создать пользователя");
                User someUser = new User(1, "Will Jones", "34324234");
                System.out.println("созздали пользователя "+someUser.name);
            }else {
                System.out.println("число не 1");
            }


    }
}
