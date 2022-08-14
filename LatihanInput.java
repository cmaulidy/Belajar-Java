import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LatihanInput {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int jmlhmhs;
        // int dayatampungkelas = 100;
        System.out.print("Masukkan jumlah siswa : "); // melakukan input nama
        jmlhmhs = Integer.parseInt(reader.readLine());
        if (jmlhmhs > 100) {
            System.out.println("Kelas melebihi kapasitas");
        } else {
            System.out.println("Kelas kurang dari kapasitas");
        }
    }
}