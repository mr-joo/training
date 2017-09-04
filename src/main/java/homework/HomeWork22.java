package homework;

public class HomeWork22 {
    /*
    문제 #3. 다형성
    Executor를 하나 만들고 해당 클래스에 Document 인터페이스를 파라미터로 받는 메서드를 하나 만든다.
    Document 인터페이스에는 read( )라는 메서드가 있다.
    Document를 구현하는 Hwp, Doc, Pdf라는 클래스를 만들고 Executor를 통해 실행해보자.
     */
    public static class Executor{
        public void executor(Document doc){
            doc.read();
        }
    }

    interface Document{
        void read();
    }

    public static class Hwp implements Document{
        public void read(){
            System.out.println("Hwp 문서입니다.");
        }
    }
    public static class Doc implements Document{
        public void read(){
            System.out.println("Doc 문서입니다.");
        }
    }
    public static class Pdf implements Document{
        public void read(){
            System.out.println("Pdf 문서입니다.");
        }
    }

    public static void main(String[] args){
        Executor executor = new Executor();

        Hwp hwp = new Hwp();
        Doc doc = new Doc();
        Pdf pdf = new Pdf();

        executor.executor(hwp);
        executor.executor(doc);
        executor.executor(pdf);
    }
}
