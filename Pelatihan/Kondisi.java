import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kondisi {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int umur;
        System.out.print("Masukkan Umur anda : "); // melakukan input nama
        umur = Integer.parseInt(reader.readLine());

        if (umur < 13) {
            System.out.println("Anak anak  Usia = " + umur);
        } else if (umur > 12 && umur < 21) {
            System.out.println("Remaja  Usia = " + umur);
        } else {
            System.out.println("Dewasa = " + umur);
        }
    }
}
