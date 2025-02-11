package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        //전위 증감 연산자 사용 예
        int a = 1;
        int b = 0;

        b = ++a; //a를 먼저 증가시키고, 그 값을 b에 대입
        System.out.println("a = " + a + ", b = "+ b);

        //후위 증감 연산자 사용 예
        a = 1; //a를 다시 1로 저장
        b = 0; //b를 다시 0으로 저장

        b = a++; //a 현재값을 b에 대입하고, 그 후 a의 값을 증가
        System.out.println("a = " + a + ", b = "+ b); //결과 : a = 2, b = 1
    }
}
