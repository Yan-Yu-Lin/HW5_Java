public class LangExample {

    public static void main(String[] args) {
        // String 類別的範例
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("字串 1: " + str1);
        System.out.println("字串 2: " + str2);

        // 字串連接
        String combinedStr = str1 + " " + str2;
        System.out.println("連接後的字串: " + combinedStr);

        // 字串長度
        int strLength = combinedStr.length();
        System.out.println("字串的長度: " + strLength);

        // 轉換為大寫
        String upperCaseStr = combinedStr.toUpperCase();
        System.out.println("轉換為大寫: " + upperCaseStr);

        // 檢查字串是否包含特定的字串
        boolean containsHello = combinedStr.contains("Hello");
        System.out.println("字串是否包含 'Hello': " + containsHello);


        // Math 類別的範例
        double num = 16.0;

        // 平方根
        double sqrtResult = Math.sqrt(num);
        System.out.println("\n" + num + " 的平方根: " + sqrtResult);

        // 四捨五入
        double roundResult = Math.round(sqrtResult * 100.0) / 100.0; //取小數點後兩位
        System.out.println(sqrtResult + " 四捨五入到小數點後兩位: " + roundResult);


        // 最大值
        int maxNum = Math.max(10, 20);
        System.out.println("10 和 20 的最大值: " + maxNum);


        // 絕對值
        int absNum = Math.abs(-5);
        System.out.println("-5 的絕對值: " + absNum);
    }
}
