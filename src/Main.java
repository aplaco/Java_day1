import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt();

        if(score >= 90) {
            System.out.println("A");
        }

        else if (score >= 85) {
            System.out.println("B");
        }

        else {
            System.out.println("C이하");
        }
    }
}