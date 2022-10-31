import java.util.Scanner;
/*

Greetings program

public class main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("hello what is u r name:");
        String name = scan.nextLine();
        System.out.println("Hello ,"+name);
    }
}
*/
public class main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("write ur number : ");
        int num1 = scan.nextInt();
        System.out.print("write ur operator (+,-,*,%,/) : ");
        char operator = scan.next().charAt(0);
        System.out.print("write ur second number : ");
        int num2 = scan.nextInt();
        switch (operator) {
            case '+' -> System.out.println(num1 + num2);
            case '-' -> System.out.println(num1 - num2);
            case '/' -> System.out.println(num1 / num2);
            case '*' -> System.out.println(num1 * num2);
            case '%' -> System.out.println(num1 % num2);
        }

    }
}