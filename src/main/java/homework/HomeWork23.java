package homework;

public class HomeWork23 {
    /*
    [문자열(String) 익숙해지기]
     */
    public static void main(String[] args){
        String str = "Hello World";
        String strTrim = " Hello World ";

        // 문자열에서 3번째 문자를 반환
        char charAt = str.charAt(3);
        System.out.println(charAt);

        // 현재의 문자열과 str로 지정된 문자열 비교, 현재 문자열이 str로 지정된 문자열 보다 크면 양수, 같으면 0, 작으면 음수
        int compare = str.compareTo("Hello Everyone");
        System.out.println(compare);

        // 입력한 문자가 포함되는지 확인
        boolean contains = str.contains("bc");
        System.out.println(contains);

        // 현재의 문자열이 str 문자열로 끝나면 true, 아니면 false를 반환
        boolean endsWith = str.endsWith("World");
        System.out.println(endsWith);

        //현재의 문자열과 str로 지정된 문자열이 같으면 true, 다르면 false를 반환
        boolean equals = str.equals("hello world");
        System.out.println(equals);

        // 현재의 문자열과 str로 지정된 문자열이 같으면 true, 다르면 false를 반환. 비교할 때 대소문자 무시
        boolean eIgnore = str.equalsIgnoreCase("hello world");
        System.out.println(eIgnore);

        // 입력받은 문자의 인덱스를 반환
        int indexOf = str.indexOf("o");

        // String 길이가 0이라면 true, 아니면 false를 반환
        boolean empty = str.isEmpty();

        // 입력받은 문자열의 마지막 인덱스를 반환
        int lastIndex = str.lastIndexOf("world");
        System.out.println(lastIndex);

        // 문자열의 길이를 반환
        int length = str.length();
        System.out.println(length);

        // target 문자를 replacement로 지정된 문자로 대치
        String replace = str.replace("World", "Everyone");
        System.out.println(replace);

        // 현재의 문자열이 str 문자열로 시작하면 true, 아니면 false를 반환
        boolean startsWith = str.startsWith("olleh");
        System.out.println(startsWith);

        // begin 인덱스와 end 인덱스 사이 부분
        String subString = str.substring(2, 5);
        System.out.println(subString);

        // 문자열을 문자 배열로 반환
        char[] charArray = str.toCharArray();
        System.out.println(charArray);

        // 문자열을 모두 소문자로 변환하여 반환
        String lowerCase = str.toLowerCase();
        System.out.println(lowerCase);

        // 문자열을 모두 대문자로 변환하여 반환
        String upperCase = str.toUpperCase();
        System.out.println(upperCase);

        // 문자열의 앞 뒤 공백을 제거
        String trim = strTrim.trim();
        System.out.println(trim);

        // 입력받은 타입을 문자열로 변환하여 반환
        String valueOf = str.valueOf(6);
        System.out.println(valueOf);
    }
}
