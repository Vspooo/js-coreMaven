package homework4.words;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("ccchgggnghnghnghn");
        words.add("aaaafgfggdfgdfdfg");
        words.add("bbbbbgfdgdfgdfdgf");
        words.add("dddddddfgfghgfhfg");
        words.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(words);


    }
    }
