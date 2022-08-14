import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Perulangan {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int panjang, lebar;
        System.out.print("Masukkan Panjang : "); // melakukan input nama
        panjang = Integer.parseInt(reader.readLine());
        System.out.print("Masukkan Lebar : "); // melakukan input nama
        lebar = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= lebar; i++) {
            for (int j = 1; j <= panjang; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
