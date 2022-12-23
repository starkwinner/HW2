import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Здравствуйте, уважаемый пользователь! Введите, пожалуйста, ваше ФИО ");
        String name = in.nextLine();
        System.out.println("Артем Леонидович, введи пожалуйста вашу дату рождения.");
        String age = in.nextLine();
            System.out.println();
            System.out.println("Добро пожаловать, Артем Леонидович (28 лет)!");
        System.out.println("=========================");


    }
}