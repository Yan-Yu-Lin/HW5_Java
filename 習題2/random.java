import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UtilExample {

    public static void main(String[] args) {
        // 使用 ArrayList 儲存整數
        List<Integer> numbers = new ArrayList<>();

        // 產生 5 個隨機數字並加入 ArrayList
        Random random = new Random();
        System.out.println("產生的隨機數字：");
        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(100); // 產生 0 到 99 的隨機整數
            numbers.add(randomNumber);
            System.out.print(randomNumber + " ");
        }
        System.out.println();

        // 列印 ArrayList 的內容
        System.out.println("\nArrayList 中的數字：");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();


        // 計算 ArrayList 中數字的總和
         int sum = 0;
         for(int number : numbers){
             sum+=number;
         }
         System.out.println("\nArrayList 中數字的總和: "+sum);

        // 額外展示: 刪除 ArrayList 中的一個元素
         numbers.remove(0); // 移除第一個元素
         System.out.println("\n移除第一個元素後的 ArrayList：");
         for(int number: numbers){
            System.out.print(number + " ");
         }
         System.out.println();
    }
}
