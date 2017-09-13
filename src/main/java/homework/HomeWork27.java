package homework;

import java.util.Scanner;

public class HomeWork27 {
    static Scanner input = new Scanner(System.in);

    public static class PhoneInfo {
        String name;
        String phoneNumber;
        String birthday;

        public PhoneInfo(String name, String phoneNumber, String birthday) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.birthday = birthday;
        }

        public PhoneInfo(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public void printData(){
            System.out.println("이름 : " + name);
            System.out.println("전화번호 : " + phoneNumber);
            if (birthday != null){
                System.out.println("생일 : " + birthday);
            }
        }
    }

    public static class PhoneBookManager{
        PhoneInfo[] phoneInfos = new PhoneInfo[100];
        int infos = 0;

        public void input(){
            System.out.println("데이터 입력을 시작합니다..");

            System.out.println("이름 : ");
            String name = input.nextLine();

            System.out.println("전화번호 : ");
            String phoneNumber = input.nextLine();

            System.out.println("생일 : ");
            String birthday = input.nextLine();

            phoneInfos[infos++] = new PhoneInfo(name, phoneNumber, birthday);
            System.out.println("데이터 입력이 완료되었습니다.");
            System.out.println("");
        }

        public void search(){
            System.out.println("데이터 검색을 시작합니다.");

            System.out.printf("이름 : ");
            String searchName = input.nextLine();

            //compareTo 메소드에서 비교한 결과를 통해 해당 정보를 출력
        }

        private int compareTo(String name){
            //search에서 입력한 이름과 phoneInfos[]에 입력한 이름과 비교

        }

        public void delete(){
        }
    }

    public static class Select {
        public void select(){
            System.out.println("선택하세요...");
            System.out.println("1. 데이터 입력");
            System.out.println("2. 데이터 검색");
            System.out.println("3. 데이터 삭제");
            System.out.println("4. 프로그램 종료");
            System.out.println("선택 : ");
        }
    }


    public static void main(String[] args){
        int choice = 0;

        Select select = new Select();
        PhoneBookManager phoneBookManager = new PhoneBookManager();

        while (true){
            select.select();
            choice = input.nextInt();
            switch (choice){
                case 1:
                    phoneBookManager.input();
                    break;
                case 2:
                    phoneBookManager.search();
                    break;
                case 3:
                    phoneBookManager.delete();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }
    }
}
