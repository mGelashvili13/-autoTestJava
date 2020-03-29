import model.Command;
import model.Event;
import model.Ticket;
import model.User;

import java.util.*;

public class Application {

    private static User user;
    private static Event event;
    private static Ticket ticket;

    public static void main(String[] args) {
        System.out.println("Hello world");
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Введите номер операции: ");
            int num = in.nextInt();
           // String nnameUser = in.next();
            System.out.printf("Вы ввели: %d \n", num);
            if (num == Command.Exit.id){
                break;
            }

//            Command cmd = null;//Command.values();
//            Command[] cmds = {Command.Exit, Command.CreateEvent...};

            User[] users = {

                    new User(0, "Vasia", "553"),
                    new User(1, "Vova", "555")};

            for (User user: users) {
                if (user.phone.contains("53")) {
                    System.out.println(user.name);
                }
            }

//            {
//                int i = 0;
//                Command c = cmds[i];
//                while (true) {
//                    // do smth with c
//                    i++;
//                    if (i == cmds.length) {
//                        break;
//                    }
//                    c = cmds[i];
//                }
//            }
//
//            {
//                for (int i = 0; i < cmds.length; ++i) {
//                    Command c = cmds[i];
//                    // do smth with c
//                }
//            }

            Command[] cmds = Command.values();
            Command cmd = null;

            for (Command command: cmds) {
                if (command.id == num) {
                    cmd = command;
                }
            }
            switch (cmd) {
                case CreateUser:
                    System.out.println("создать пользователя");
                    User someUser = new User(1, "Will Jones", "34324234");
                    user = someUser;
                    System.out.println("создали пользователя " + someUser.name);
                    break;
                case CreateEvent:
                    System.out.println("создать событие ");
                    Event someEvent = new Event(11, "new year fair");
                    event = someEvent;
                    System.out.println("создали событие " + someEvent.titleEvent);
                    break;
                case CreateTicket:
                    System.out.println("создать билет для пользователя на событие");
                    if (!(event == null || user == null)) {
                        ticket = new Ticket(7, event.idEvent, user.id, 56);
                        System.out.println("создали билет на пользователя " + user.name + " на мероприятие " + event.titleEvent);
                    } else {
                        System.out.println("создать билет невозможно");
                    }
                    break;
            }
        }
    }
}
