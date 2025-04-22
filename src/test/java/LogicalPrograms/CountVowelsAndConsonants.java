package LogicalPrograms;

import org.testng.annotations.Test;

public class CountVowelsAndConsonants {


    static String value="Naveen Automation Engineer";
    static int vowels=0;
    static int consonants=0;

    @Test
    public static void type1() {
        value=value.toLowerCase().replace(" ","");
        for (int i=0; i<value.length();i++) {
            char charValue= value.charAt(i);

            switch (charValue) {
                case 'a':
                    vowels++;
                    break;
                case 'e':
                    vowels++;
                    break;
                case 'i':
                    vowels++;
                    break;
                case 'o':
                    vowels++;
                    break;
                case 'u':
                    vowels++;
                    break;
                default:
                    consonants++;
            }
        }
        System.out.println("Count of vowels : "+vowels);
        System.out.println("Count of consonants : "+consonants);
    }
    @Test
    public static void type2(){
        value=value.toLowerCase().replace(" ","");
        for (int i=0; i<value.length();i++) {
            char c= value.charAt(i);

            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowels++;
            }else {
                consonants++;
            }
        }

        System.out.println("Count of vowels : "+vowels);
        System.out.println("Count of consonants : "+consonants);
    }
}
