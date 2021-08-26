package lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker("Иван");

        Letter letter = new Letter();
        letter.recipient = worker.name;

        OrderWork orderWork = new OrderWork(worker.name);

        OrderDismissal orderDismissal = new OrderDismissal(worker.name);
        System.out.println("чтобы запустить полный режим напишите 1, чтобы -semple 0");
        Scanner scan = new Scanner(System.in);
        int intSimple = scan.nextInt();

        if (intSimple == 1) {
            EXIT(worker, orderDismissal, orderWork, letter);
            orderWork.statrtStatus();
            orderDismissal.statrtStatus();
            EXIT(worker, orderDismissal, orderWork, letter);
        } else {
            simpleEXIT(worker, orderDismissal, orderWork, letter);
            orderWork.statrtStatus();
            orderDismissal.statrtStatus();
            simpleEXIT(worker, orderDismissal, orderWork, letter);
        }
    }




//метод вывода данных
                public static void EXIT (Worker worker, OrderDismissal orderDismissal, OrderWork orderWork, Letter
                letter){
                System.out.println(worker.title);
                System.out.println("имя раблтника: " + worker.name);
                System.out.println();
                System.out.println(letter.title);
                System.out.println("номер письма: " + letter.getNambre());
                System.out.println("кому: " + letter.recipient);
                System.out.println("от кого: " + letter.sender);
                System.out.println();
                System.out.println(orderWork.title);
                System.out.println("номер: " + orderWork.getNambre());
                System.out.println("имя сотрудника: " + orderWork.nameWorker);
                System.out.println("текст приказа " + orderWork.orderText);
                System.out.println("статус: " + orderWork.getStatus());
                System.out.println();
                System.out.println(orderDismissal.title);
                System.out.println("номер: " + orderDismissal.getNambre());
                System.out.println("имя сотрудника: " + orderDismissal.nameWorker);
                System.out.println("причина увольнения " + orderDismissal.reassonOfDismissal);
                System.out.println("статус: " + orderDismissal.getStatus());
            }
                public static void simpleEXIT (Worker worker, OrderDismissal orderDismissal, OrderWork orderWork, Letter
                letter)
                {

                    System.out.println(letter.title);
                    System.out.println("номер письма: " + letter.getNambre());

                    System.out.println(orderWork.title);
                    System.out.println("номер: " + orderWork.getNambre());

                    System.out.println();
                    System.out.println(orderDismissal.title);
                    System.out.println("номер: " + orderDismissal.getNambre());

                }
            }




