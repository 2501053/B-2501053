import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name = "";
        int age = 0;
        char gender = ' ';
        char result = ' ';

        // 입력 받기
        System.out.print("이름을 입력하세요: ");
        name = keyboard.nextLine();

        System.out.print("나이를 입력하세요: ");
        age = keyboard.nextInt();
        keyboard.nextLine(); // 버퍼 클리어

        System.out.print("성별을 입력하세요 (M/F): ");
        gender = keyboard.nextLine().charAt(0);

        // 성별에 따라 결과 문자 설정
        if (gender == 'M' || gender == 'm') {
            result = '남';
        } else if (gender == 'F' || gender == 'f') {
            result = '여';
        } else {
            result = '?';
        }

        // 출력
        System.out.printf("%s님의 나이는 %d살 입니다.\n", name, age);
        System.out.printf("%s님의 성별은 %c(%c자) 입니다.\n", name, gender, result);
    }
}
