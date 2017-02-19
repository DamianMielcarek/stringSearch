package pl.akademiakodu;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import static java.awt.SystemColor.text;

public class Main {

    // bez używania gotowych klas i metod

    // text = "afdafafdsafdsafdsf 87-630 ds87-630adfdasfadfadsf", pattern = 87-630

/*
    public int getIndexOf( int toSearch, int[] tab )
    {
        for( int i=0; i< tab.length ; i ++ )
            if( tab[ i ] == toSearch)
                return i;

        return -1;
    }
*/
    public static int getIndexOfString(String text, String pattern) {
        boolean isEqual;
        int k = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            isEqual = true;
            k = 0;
            stringBuilder = new StringBuilder();
            // sprawdzenie
            for (int j = i; j < pattern.length(); j++) {
                stringBuilder.append(text.charAt(i));
            }
            System.out.println(pattern + " porównanie z " + stringBuilder);
            if (stringBuilder.toString().equals(pattern)) {
                return i;
            }
        }
        return -1;
    }
    /*
    // bez StringBuildera
    public static int getIndexOfString(String text, String pattern) {
        boolean isEqual;
        int k = 0;
        for (int i = 0; i < text.length(); i++) {
            isEqual = true;
            k = 0;
            // sprawdzenie
            if (text.charAt(j) != pattern.charAt(k++)) {
                isEqual = false;
                break;
            }
        }
        if (isEqual)
            return i;
    }
        return-1;
    */



    public static void main(String[] args) {
	// write your code here
        System.out.println(Main.getIndexOfString("adasad 87-630  ds87-630adasdadsf", "87-630"));
    }
}
