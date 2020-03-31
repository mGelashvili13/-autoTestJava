package model;

import java.util.*;

public class User {
    public int id;
    public String name;
    public String phone;

    public User(int nid, String nname, String nphone) {
        System.out.println("user ");
        id = nid;
        name = nname;
        phone = nphone;
    }

    
}
//
//  {
////            // считать 3 числа и вывести их среднее арифметическое
////            Scanner scanner = new Scanner(System.in);
////            int sum = 0;
////            for (int i = 0; i < 3; i++) {
////                System.out.println("Введите число:");
////                int n = scanner.nextInt();
////                sum += n;
////            }
////            System.out.println("Avg: " + (sum / 3));
////        }
//
////        {
////            // считать n чисел и вывести их среднее арифметическое
////            // где n задается с клавиатуры
////            Scanner scanner = new Scanner(System.in);
////            int sum = 0;
////            System.out.println("введите данные ");
////            int n = 3;
////            int[] useri = new int[n];
////            System.out.println("количество чисел = " + n + " количество полей для заполнения " + useri.length);
////
////            // считать с клавиатуры в массив
////            for (int i = 0; i < n; i++) {
////
////                System.out.println("Введите:");
////                int ni = scanner.nextInt();
////                useri[i] = ni;
////            }
////
////            // посчитать AVG массива
////            for (int i = 0; i < n; i++) {
////                sum += useri[i];
////            }
////            System.out.println("avg: "+ (sum/3));
////
////        }
//
//          {
//          //считать из ввода параметры
//          //из считаного создать элемент массива спараметрами
//          //вывести на экран массив
//          User[] users = new User[3];
////            List<User> users = new ArrayList<User>();
//          for (int us = 0; us < 3; us++) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("введите параметры нового пользователя: ");
//
//        System.out.println("Введите id пользователя ");
//        int idUser = scanner.nextInt();
//
//
//        System.out.println("Введите имя пользователя ");
//        String nameUser = scanner.next();
//
//
//        System.out.println("Введите телефон пользователя ");
//        String phoneUser = scanner.next();
//
//        User userNew=new User(idUser,nameUser,phoneUser);
////                users.add(userNew);
////                users.set(us, userNew);
//        users[us] = userNew;
//        }
//
//        for (int i = 0; i < users.length; i++) {
//        System.out.println(users[i].name);
//        }
//
//        }
////
//
//
//        }