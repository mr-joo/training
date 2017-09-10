package homework;

public class HomeWork25 {
    /*
    문제2. 문자열이 애너그램(Anagram)인지 확인하는 메서드를 만들어보자 (우선순위 : 중)
    String str1 = "TomMarvoloRiddle";
    String str2 = "IAmLordVoldemort";
    char[] chars = str.tocharArray; > {'T', 'o', }
    str1의 첫번째 문자부터 문자들이 몇 개 있는지 확인, str2에 있는 문자가 몇 개 있는지 확인
    str1의 문자 개수와
     */
    public static class IsAnagram{

        public static boolean anagram(String str1, String str2){
            if (str1.length() != str2.length()){
                return false;
            }else {
                char[] chars = str1.toCharArray();
                for (int index = 0; index < chars.length; index++){
                    int str1CharCount = charCount(str1, chars[index]);
                    int str2CharCount = charCount(str2, chars[index]);

                    if (str1CharCount != str2CharCount){
                        return false;
                    }
                }
            }
            return true;
        }

        public static int charCount(String str, char ch){
            int count = 0;
            char[] chars = str.toCharArray();
            for (int i = 0; i < str.length(); i++){
                if (chars[i] == ch) {
                    count = count + 1;
                }
            }
            return count;
        }
    }

    public static void main(String[] args){
        System.out.println(IsAnagram.anagram("aba", "aab"));
    }
}
