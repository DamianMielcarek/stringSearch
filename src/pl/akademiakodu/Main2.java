package pl.akademiakodu;

/**
 * Created by Lenovo on 2016-11-18.
 */
public class Main2 {
    public int getIndexOfString(String text, String[] pattern) {

        for (int i = 0; i < pattern.length; i++)
            if (pattern[i] == text)
                return i;

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(Main.getIndexOfString("8sdadsdasd435 87-630  das", "87-630"));

    }
}

