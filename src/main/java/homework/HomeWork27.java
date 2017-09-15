package homework;

import java.util.Scanner;

public class HomeWork27 {
    static Scanner input = new Scanner(System.in);

    interface Menu{
        int INPUT = 1, SEARCH = 2, DELETE = 3, END = 4;
    }

    interface InputSelect{
        int BASIC = 1, UNIV = 2, COMPANY = 3;
    }

    public static class MenuInputException extends Exception{
        int wrongChoice;

        public MenuInputException(int choice){
            wrongChoice = choice;
        }
        public void printException(){
            System.out.println(wrongChoice + "에 해당하는 선택은 존재하지 않습니다.");
        }
    }

    public static class PhoneInfo{
        String name;
        String phoneNumber;

        public PhoneInfo(String name, String num) {
            this.name = name;
            phoneNumber = num;
        }

        public void printData(){
            System.out.println("이름 : " + name);
            System.out.println("전화번호 : " + phoneNumber);
        }
    }

    public static class PhoneUnivInfo extends PhoneInfo{
        String major;
        int year;

        public PhoneUnivInfo(String name, String num, String major, int year){
            super(name, num);
            this.major = major;
            this.year = year;
        }

        public void printData(){
            super.printData();
            System.out.println("전공 : " + major);
            System.out.println("학년 : " + year);
        }
    }

    public static class PhoneCompanyInfo extends PhoneInfo{
        String company;

        public PhoneCompanyInfo(String name, String num, String company){
            super(name, num);
            this.company = company;
        }

        public void printData(){
            super.printData();
            System.out.println("회사 : " + company);
        }
    }

    public static class PhoneBookManager{
        public static final int NOT_FOUND = -1;
        PhoneInfo[] phoneInfos = new PhoneInfo[100];
        int count = 0;

        private PhoneInfo basicInfo(){
            System.out.print("이름 : ");
            String name = input.nextLine();

            System.out.print("전화번호 : ");
            String phoneNumber = input.nextLine();

            return new PhoneInfo(name, phoneNumber);
        }

        private PhoneInfo univInfo(){
            System.out.print("이름 : ");
            String name = input.nextLine();

            System.out.print("전화번호 : ");
            String phoneNumber = input.nextLine();

            System.out.print("전공 : ");
            String major = input.nextLine();

            System.out.print("학년 : ");
            int year = Integer.parseInt(input.nextLine());

            return new PhoneUnivInfo(name, phoneNumber, major, year);
        }

        private PhoneInfo companyInfo(){
            System.out.print("이름 : ");
            String name = input.nextLine();

            System.out.print("전화번호 : ");
            String phoneNumber = input.nextLine();

            System.out.print("회사 : ");
            String company = input.nextLine();

            return new PhoneCompanyInfo(name, phoneNumber, company);
        }

        public void input() throws MenuInputException{
            System.out.println("데이터 입력을 시작합니다..");
            System.out.println("1. 일반, 2. 대학 3. 회사");
            System.out.print("선택 >> ");
            int choice = Integer.parseInt(input.nextLine());
            PhoneInfo info = null;

            if (choice < InputSelect.BASIC || choice > InputSelect.COMPANY){
                throw  new MenuInputException(choice);
            }

                switch (choice){
                    case InputSelect.BASIC:
                        info = basicInfo();
                        break;
                    case InputSelect.UNIV:
                        info = univInfo();
                        break;
                    case InputSelect.COMPANY:
                        info = companyInfo();
                        break;
                }

            phoneInfos[count++] = info;
            System.out.println("데이터 입력이 완료되었습니다.");
            System.out.println("");
        }

        public void search(){
            System.out.println("데이터 검색을 시작합니다.");

            System.out.print("이름 : ");
            String name = input.nextLine();

            int searchedIndex = getIndexOf(name);

            if (searchedIndex != NOT_FOUND){
                phoneInfos[searchedIndex].printData();
            }
            System.out.println("데이터 검색이 완료되었습니다.");
            System.out.println("");
        }

        public void delete(){
            System.out.println("데이터 삭제를 시작합니다..");

            System.out.print("이름 : ");
            String name = input.nextLine();

            int searchedIndex = getIndexOf(name);

            PhoneInfo[] newPhoneInfos = new PhoneInfo[100];
            int newIndex = 0;

            for (int i = 0; i < phoneInfos.length; i++){
                if (searchedIndex == i){
                    continue;
                }
                newPhoneInfos[newIndex++] = phoneInfos[i];
            }
            phoneInfos = newPhoneInfos;
            System.out.println("데이터 삭제가 완료되었습니다.");
            System.out.println("");
        }

        private int getIndexOf(String name){
            for (int i = 0; i < count; i++){
                if (phoneInfos[i].name.equals(name)){
                    return i;
                }
            }
            return -1;
        }
    }

    public static class Select {
        public void select(){
            System.out.println("선택하세요...");
            System.out.println("1. 데이터 입력");
            System.out.println("2. 데이터 검색");
            System.out.println("3. 데이터 삭제");
            System.out.println("4. 프로그램 종료");
            System.out.print("선택 : ");
        }
    }


    public static void main(String[] args){
        int choice = 0;

        Select select = new Select();
        PhoneBookManager phoneBookManager = new PhoneBookManager();

        while (true){
            try {
                select.select();
                choice = Integer.parseInt(input.nextLine());

                if (choice < Menu.INPUT || choice > Menu.END){
                    throw new MenuInputException(choice);
                }

                switch (choice){
                    case Menu.INPUT:
                        phoneBookManager.input();
                        break;
                    case Menu.SEARCH:
                        phoneBookManager.search();
                        break;
                    case Menu.DELETE:
                        phoneBookManager.delete();
                        break;
                    case Menu.END:
                        System.out.println("프로그램을 종료합니다.");
                        return;
                }
            }catch (MenuInputException exception){
                exception.printException();
                System.out.println("메뉴 선택을 처음부터 다시 진행합니다.");
            }

        }
    }
}
