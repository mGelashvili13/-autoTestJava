import model.FunctionalEnum;

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
            }else {
                System.out.println("число не 1");
            }


    }
}
