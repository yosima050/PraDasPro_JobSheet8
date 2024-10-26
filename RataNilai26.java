import java.util.Scanner;

public class RataNilai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        int j;
        float totalNilai,rataNilai,nilaiMhs;

        for(j=1;j<=5;j++) {
            i=1; 
            while (i<=5) {
            totalNilai=0;
            System.out.println("Input Nilai Mahasiswa ke " + i);
            for (j=1;j<=5;j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilaiMhs=sc.nextInt();
                totalNilai+=nilaiMhs;
            }
            rataNilai=totalNilai/5;
            System.out.println("Rata - Rata Nilai Mahasiswa ke- " + i + " Adalah " + rataNilai );
            i++;
        }
        }
    }
}
