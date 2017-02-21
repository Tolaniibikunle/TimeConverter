package ibikunle.tolani;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by tolaniibikunle on 2/20/17.
 */
public class NumbersToWordTest {
    NumbersToWords numbersToWords;

    @Before
    public void setUp(){
        numbersToWords = new NumbersToWords();
    }

    @Test
    public void convertToWordsTest(){
       String  wordExpected = "forty five";
       String  wordActual = numbersToWords.convertToWords(45);
        System.out.println(numbersToWords.convertToWords(45));
        Assert.assertEquals("i am expecting forty five",wordExpected,wordActual);
    }

}
