import java.util.*;

public class varifyPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the person no");
        int n = sc.nextInt();

        if(n%2==0)
             System.out.println("Positive");
        else
            System.out.println("Negative");
    }
}