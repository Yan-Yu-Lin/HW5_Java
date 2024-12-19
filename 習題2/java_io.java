import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileIOExample {

    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // 寫入檔案
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(outputFile)))) {
            writer.println("這是要寫入檔案的第一行文字。");
            writer.println("這是要寫入檔案的第二行文字。");
            System.out.println("資料已寫入 " + outputFile);

        } catch (IOException e) {
            System.out.println("寫入檔案時發生錯誤： " + e.getMessage());
        }


        // 讀取檔案
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            System.out.println("\n從 " + inputFile + " 讀取到的內容：");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("讀取檔案時發生錯誤： " + e.getMessage());
        }
    }
}
