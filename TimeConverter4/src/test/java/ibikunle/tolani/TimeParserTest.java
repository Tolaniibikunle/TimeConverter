package ibikunle.tolani;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by tolaniibikunle on 2/20/17.
 */
public class TimeParserTest {
    TimeParser timeParser;

    @Before
    public void setUp(){
        timeParser = new TimeParser();
    }

    @Test
    public void parseHoursTest(){
        int expectedHours = 8;
        int actualHours = timeParser.parseHours("0843");
        System.out.println(timeParser.parseHours("0834hrs"));
        Assert.assertEquals("I am expected 8",expectedHours,actualHours);



    }

    @Test
    public void parseMilMinutesTest() {
        int expectedMinutes = 34;
        int actualMinutes = timeParser.parseMilMinutes("0834");
        System.out.println(timeParser.parseMilMinutes("0834hrs"));
        Assert.assertEquals("i am expecting 34",expectedMinutes,actualMinutes);

    }
    @Test
    public void parseStdMinutesTest(){
        int expectedMinutes = 35;
        int actualMinutes = timeParser.parseStdMinutes("8:35pm");
        System.out.println(timeParser.parseStdMinutes("8:35pm"));
        Assert.assertEquals("i am expected 35",expectedMinutes,actualMinutes);
    }

    @Test
    public void isStdTimeTest(){
        boolean actual = timeParser.isStdTime("8:35pm");
        System.out.println(timeParser.isStdTime("8:35pm"));
        Assert.assertTrue("I am expecting true",actual);
    }

    @Test
    public void getMeridianTest(){
        String expected = "pm";
        String actual  = timeParser.getMeridian("8:45pm");
        System.out.println(timeParser.getMeridian("8:45pm"));
        Assert.assertEquals("I am expecting pm",expected,actual);

    }
}
