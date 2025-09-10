import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("문자 하나 입력: ");
        char ch = keyboard.nextLine().charAt(0);

        System.out.printf("입력한 문자 '%c'의 ASCII 코드는 %d입니다.\n", ch, (int) ch);
    }
}
