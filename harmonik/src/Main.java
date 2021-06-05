import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Harmonik serisi için sayı giriniz : ");
        n=scanner.nextInt();
        double sum=0;
        for (double i=1;i<=n;i++){
            sum+=(1/i);
        }
        System.out.println(sum);
    }
}
