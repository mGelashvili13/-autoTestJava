import model.Command;
import model.Event;
import model.Ticket;
import model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    private static Object Collection;

    public static void main(String[] args) {

        List<Event> events = new ArrayList<Event>();
        List<User> users = new ArrayList<User>();
        List<Ticket> tickets = new ArrayList<Ticket>();
        Scanner scanner = new Scanner(System.in);
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date

        while (true) {
            System.out.println("Введите номер операции: ");
            int num = scanner.nextInt();
            System.out.printf("Вы ввели: %d \n", num);
            if (num == Command.Exit.id) {
                break;
            }

            Command[] cmds = Command.values();
            Command cmd = null;

            for (Command command : cmds) {
                if (command.id == num) {
                    cmd = command;
                }
            }

            switch (cmd) {
                case CreateUser:
                    for (int us = 0; us < 3; us++) {
                        users.add(readUs(scanner));
                    }
                    break;

                case CreateEvent:
                    for (int us = 0; us < 3; us++) {
                        events.add(readEv(scanner));
                    }
                    break;
                case CreateTicket:
                    System.out.println("Хотите купить билет? Тогда введите id пользователя: ");
                    int idUs = scanner.nextInt();

                    for (int j = 0; j < users.size(); j++) {
                        for (int i = 0; i < events.size(); i++) {

                            if (users.get(j).id == idUs) {

                                System.out.println("пользователь с этим id имеется в бд: ");

                                System.out.println("введите id события: ");
                                int idEv = scanner.nextInt();

                                if (idEv == events.get(i).idEvent) {

                                    System.out.println("событие существует в бд. Введите номер места в зале");
                                    int iseat = scanner.nextInt();
                                    System.out.println("введите id билета");
                                    int idTicket = scanner.nextInt();

                                    Ticket newTicket = new Ticket(idTicket, idEv, idUs, iseat);
                                    tickets.add(newTicket);

                                } else {
                                    System.out.println("к сожалению мы не располагаем информацией об этом событии");
                                }

                            } else {
                                users.add(readUs(scanner));
                                System.out.println("введите id события: ");
                                int idEv = scanner.nextInt();

                                if (idEv == events.get(i).idEvent) {
                                    System.out.println("событие существует в бд. Купить на него билет для нового пользователя:");

                                    System.out.println("событие существует в бд. Введите номер места в зале");
                                    int iseat = scanner.nextInt();
                                    System.out.println("введите id билета");
                                    int idTicket = scanner.nextInt();

                                    Ticket newTicket = new Ticket(idTicket, idEv, idUs, iseat);
                                    tickets.add(newTicket);

                                } else {
                                    System.out.println("к сожалению мы не располагаем информацией об этом событии");
                                }
                            }
                        }
                    }
                    break;


                case DeletEvent:
                    for (int i = 0; i < events.size(); i++) {
                        if (events.get(i).dateEvent == myObj || events.get(i).dateEvent == myObj.minusDays(i)) {
                            events.remove(i);
                        }
                    }
                    break;

                case Reminder:
                    System.out.println("введите id пользователя, для проверки актуальных билетов");
                    int iduser = scanner.nextInt();
                    for (int i = 0; i < users.size(); i++) {
                        if (users.get(i).id == iduser) {
                            if (events.get(i).dateEvent == myObj || (events.get(i).dateEvent == myObj.plusDays(i))) {
                                System.out.println("ближайшие мероприятия " + events.get(i).titleEvent);
                            }
                        } else {
                            System.out.println("пользователь с таким id не существует");
                        }
                    }
                    break;
            }
        }
    }


    public static User readUs(Scanner scan) {

        System.out.println("введите параметры нового пользователя: ");

        System.out.println("Введите id пользователя ");
        int idUser = scan.nextInt();

        System.out.println("Введите имя пользователя ");
        String nameUser = scan.next();

        System.out.println("Введите телефон пользователя ");
        String phoneUser = scan.next();

        User userNew = new User(idUser, nameUser, phoneUser);
        return userNew;
    }


    public static Event readEv(Scanner scanner) {
        System.out.println("Введите параметры нового события: ");

        System.out.println("Введите id события ");
        int idEvent = scanner.nextInt();

        System.out.println("Введите название события ");
        String titleEvent = scanner.next();

        System.out.println("Введите дату проведения события гг-мм-дд");
        String dateEvent = scanner.next();
        LocalDate date = LocalDate.parse(dateEvent);

        Event newEVENT = new Event(idEvent, titleEvent, dateEvent);
        return newEVENT;
    }

