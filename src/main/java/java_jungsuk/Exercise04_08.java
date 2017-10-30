package java_jungsuk;

public class Exercise04_08 {
    public static void main(String[] args){
        for (int x = 0; x <= 10; x++){
            for (int y = 0; y <= 10; y++){
                int cal = (2 * x) + (4 * y);

                if (cal == 10){
                    System.out.println("x=" + x + "," + "y=" + y);
                }
            }
        }
    }
}
