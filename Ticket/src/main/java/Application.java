import model.Event;
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
                System.out.println("создали пользователя "+someUser.name);
            }else {
                System.out.println("число не 1");
            }
            if (num == 2){
                System.out.println("создать событие ");
                Event someEvent= new Event(11, "новогодняя ярморка" );
                System.out.println("создать событие "+ someEvent.titleEvent);
            }if (num==3){
            System.out.println("создать билет для пользователя на событие");
            User someUser = new User(19, "Вася Пупкин", "77777");
            Event someEvent= new Event(11, "новогодняя фрморка");
            System.out.println("создать билет на пользователя "+someUser.name +" на мероприятие "+someEvent.titleEvent );
        }


    }
}
