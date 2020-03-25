import model.Event;
import model.Ticket;
import model.User;

import java.util.Scanner;

public class Application {

    private static User user;
    private static Event event;
    private static Ticket ticket;

    public static void main(String[] args) {
        System.out.println("Hello world");


        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер операции: ");
        int num = in.nextInt();
        System.out.printf("Вы ввели: %d \n", num);
        switch (num) {

            case 1:
                System.out.println("создать пользователя");
                User someUser = new User(1, "Will Jones", "34324234");
                user = someUser;
                System.out.println("создали пользователя " + someUser.name);

            case 2:
                System.out.println("создать событие ");
                Event someEvent = new Event(11, "new year fair");
                event = someEvent;
                System.out.println("создать событие " + someEvent.titleEvent);

            case 3:
                System.out.println("создать билет для пользователя на событие");
                if (!(event == null || user == null)) {
                    ticket = new Ticket(7, event.idEvent, user.id, 56);
                    System.out.println("создать билет на пользователя " + user.name + " на мероприятие " + event.titleEvent);

                } else {
                    System.out.println("создать билет невозможно");


                }
                break;
        }


    }
}
