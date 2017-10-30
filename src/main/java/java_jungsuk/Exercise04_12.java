package java_jungsuk;

public class Exercise04_12 {
    public static void main(String[] args){
        for (int i = 1; i < 10; i++){
            for (int j = 1; j < 4; j++){
                int x = j + 1 + (i - 1)/ 3 * 3;
                int y = i % 3 == 0? 3 : i % 3;

                int result = x * y;

                if (x > 9) {
                    break;
                }

                System.out.print(x + "*" + y + "=" +result+"\t");
                }

            System.out.println();
            if (i % 3 == 0){
                System.out.println();
            }
        }
    }
}
