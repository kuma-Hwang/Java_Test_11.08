import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("구구단 몇단? : ");
        int dan = s.nextInt();

        if(dan < 2  || dan > 9) {
            System.out.println("구구단은 2단 ~ 9단까지만 선택할 수 있습니다. 프로그램을 종료합니다.");
            s.close();
            return;
        }

        for(int i = 1; i <= 9; i++) {
            System.out.println(dan + " x " + i +" = " + (dan * i));
        }
    }
}
