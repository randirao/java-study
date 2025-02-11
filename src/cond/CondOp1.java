package cond;

public class CondOp1 {
    public static void main(String[] args) {
        int age = 18;
        String statues;
        if(age >= 18){
            statues = "성인";
        } else{
            statues = "미성년자";
        }
        System.out.println("age = " + age + ", statues = " + statues);
    }
}
