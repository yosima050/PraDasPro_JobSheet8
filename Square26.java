import java.util.Scanner;
public class Square26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Nilai N = ");
        int N = sc.nextInt();
        for(int iOuter=0; iOuter<=N; iOuter++) {
            for(int i=1; i<=N; i++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}