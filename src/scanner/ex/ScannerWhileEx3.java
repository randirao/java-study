package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요(-1입력시 중단): ");

        int sum = 0;
        int count = 0;

//        while(true) {
//            System.out.print("숫자를 입력해주세요(-1입력시 중단): ");
//            int number = scanner.nextInt();
//
//            if(number == -1){
//                break;
//            }
//
//            sum += number;
//            count++;
//        }

        int number = 0;
        while((number = scanner.nextInt()) != -1) {
            sum += number;
            count++;
        }

        double average = (double) sum / count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}
