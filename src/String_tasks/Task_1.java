package String_tasks;

public class Task_1 {
    public static void Write(){
        for(int i=1;i<=100;i++){
            if(i%3==0 || i%5==0) {
                if (i % 3 == 0) {
                    System.out.print(" Fizz");
                }
                if (i % 5 == 0) {
                    System.out.print(" Buzz");
                }
            }
            else {
                System.out.print(" "+i);
            }
            System.out.print(",");
        }
    }
}
