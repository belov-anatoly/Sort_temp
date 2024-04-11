import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = firstNumber();
        int b = secondNumber();
        int c = thirdNumber();

        System.out.println("Вы ввели эти числа: " + a + ", " + b + ", " + c + "." + "\n" + "Среди этих чисел наибольшее число - " + comparisionOfNumbers(a, b, c) + ".");
    }

    private static int firstNumber() {

        try{
            System.out.println("Введите первое число (количество часов): ");
            Scanner sc1 = new Scanner(System.in);
            int firstNumber = sc1.nextInt();
            if ((firstNumber > 0) && (firstNumber < 23))
                return firstNumber;
            else
                return firstNumber();
        }
        catch (Exception e){return firstNumber();}
    }

    private static int secondNumber() {

        try{
            System.out.println("Введите второе число (количество минут): ");
            Scanner sc2 = new Scanner(System.in);
            int secondNumber = sc2.nextInt();
            if ((secondNumber > 0) && (secondNumber < 59))
                return secondNumber;
            else
                return secondNumber();
        }
        catch (Exception e){return secondNumber();}
    }

    private static int thirdNumber() {

        try{
            System.out.println("Введите третье число (количество секунд): ");
            Scanner sc3 = new Scanner(System.in);
            int thirdNumber = sc3.nextInt();
            if ((thirdNumber > 0) && (thirdNumber < 59))
                return thirdNumber;
            else
                return thirdNumber();
        }
        catch (Exception e){return thirdNumber();}
    }

    private static int summator(){ // Суммируем числа, полученные от пользователя, в единое время.

        int a = firstNumber();
        int b = secondNumber();
        int c = thirdNumber();
        int sum =

    }

    private static int comparisionOfNumbers(int a, int b, int c){

        int number1 = 0;
        int number2 = 0;

        if (a > b) {number1 = a;}
        else {number1 = b;}

        if (number1 > c) {number2 = number1;}
        else {number2 = c;}

        return number2;
    }
}
