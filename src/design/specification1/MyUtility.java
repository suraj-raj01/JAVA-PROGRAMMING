package design.specification1;
public class MyUtility {
    public static int countVowel(UserName userName){
        int vowel = 0;
        char[] fullName = userName.fullName().toCharArray();
        for(int i=0; i<fullName.length; i++){
            if(fullName[i]=='a' || fullName[i]=='e' || fullName[i]=='i' || fullName[i]=='o' || fullName[i]=='u'
            || fullName[i]=='A' || fullName[i]=='E' || fullName[i]=='I' || fullName[i]=='O' || fullName[i]=='U'  ){
                vowel ++;
            }
        }
        return  vowel;
    }
}
