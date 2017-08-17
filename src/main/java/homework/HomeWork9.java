package homework;

public class HomeWork9 {
    public static void main(String[] args){
        class Credit {
            int score;

            public Credit(int score){
                this.score = score;
            }

            public void printCredit(){
                if (95 <= score){
                    System.out.printf("A+");
                } else if (90 <= score){
                    System.out.printf("A");
                } else if (85 <= score){
                    System.out.printf("B+");
                } else if (80 <= score){
                    System.out.printf("B");
                } else if (75 <= score){
                    System.out.printf("C+");
                } else if (70 <= score){
                    System.out.printf("C");
                } else if (65 <= score){
                    System.out.printf("D");
                } else {
                    System.out.printf("F");
                }
            }
        }
        Credit credit = new Credit(86);
        credit.printCredit();
    }
}
