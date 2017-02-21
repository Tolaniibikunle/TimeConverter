package ibikunle.tolani;

import java.util.TreeMap;

/**
 * Created by tolaniibikunle on 2/20/17.
 */
public class NumbersToWords extends TreeMap<Integer, String> {

    // anytime this is initiated this runs.. and creates these values within the treeMap
    {
        this.put(0,"");
        this.put(1,"one");
        this.put(2,"two");
        this.put(3,"three");
        this.put(4,"four");
        this.put(5,"five");
        this.put(6,"six");
        this.put(7,"seven");
        this.put(8,"eight");
        this.put(9,"nine");
        this.put(10,"ten");
        this.put(11,"eleven");
        this.put(12,"twelve");
        this.put(13,"thirteen");
        this.put(14,"fourteen");
        this.put(15,"fifteen");
        this.put(16,"sixteen");
        this.put(17,"seventeen");
        this.put(18,"eighteen");
        this.put(19,"nineteen");
        this.put(20,"twenty");
        this.put(30,"thirty");
        this.put(40,"forty");
        this.put(50,"fifty");
    }


    // 5 or 27
    public String convertToWords(int n) {
        String convertedWord = lessThan21(n)? getOneWord(n) : getTwoWords(n);
        return convertedWord;
    }

    private String getTwoWords(int n) {
        //56
        int firstNumber = (n/10)*10; //integer division there is no remainder... so you will just just get 5*10 or whatever number you are passing through
        int secondNumber = n%10; // this is just the remainder get the remainder from the first number..
        String twoWords = getOneWord(firstNumber)+ " " + getOneWord(secondNumber);
        return twoWords;
    }

    private String getOneWord(int n) {
        return this.get(n); // because this is a treeMap<Integer String>  you can get that String. using .get
    }

    private boolean lessThan21(int n) {

        return n<21;
    }
}
