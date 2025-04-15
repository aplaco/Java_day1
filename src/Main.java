import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //터미널에서 사용가능한 입력도구를 생성하는 클래스
        //해당 클래스는 관련 기능 메서드들을 품고 있는 인스턴스 객체를 반환
        Scanner scanner = new Scanner(System.in);

        //문자값을 입력받을 수 있는 메서드 호출
        String name = scanner.nextLine(); //문자값 입력받게 하는 메서드 호출
        int age = scanner.nextInt();
        double height = scanner.nextDouble();

        System.out.println("내 이름은"+name+"이고 나이는"+age+"살이며 키는"+height+"입니다");
    }
}