package design.specification1;
public class MyUtility {
    public static int countVowel(UserName userName){
        int vowel = 0;
        char[] fullName = userName.fullName().toCharArray();
        for (char c : fullName) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vowel++;
            }
        }
        return  vowel;
    }
}
