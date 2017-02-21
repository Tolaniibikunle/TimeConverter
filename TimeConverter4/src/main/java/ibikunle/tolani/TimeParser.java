package ibikunle.tolani;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tolaniibikunle on 2/20/17.
 */
public class TimeParser {


    //1354hrs

    public int parseHours(String s) {
        String hours = findIntString(s,"(^\\d{1,2})");

        return Integer.parseInt(hours);
    }



    public int parseMilMinutes(String s) {
        String minutes = findIntString(s,"(?<=\\d{2})(\\d{1,2})"); // find this group and then look ahead of that group and give what comes after which is going to look like

        return Integer.parseInt(minutes);
    }

    public int parseStdMinutes(String s) {
        String minutes = findIntString(s,"(?<=\\d{1,2}:)(\\d{1,2})"); // find this group and then look ahead of that group and give what comes after which is going to look like

        return Integer.parseInt(minutes);
    }

    private String findIntString(String s, String regex) {
        Pattern pattern = Pattern.compile(regex); // this is the regex pattern that we are parsing our string by
        Matcher matcher = pattern.matcher(s); // the string that we are searching the pattern for

        String foundString = "";

        while(matcher.find())
            foundString = matcher.group(); //since we only have one pattern we are only going to find one thing.. only group of zero will have something

            return foundString;
    }

    //1543hrs or 2:37pm

    public boolean isStdTime(String s) {
        return ":".equals(findIntString(s,":")); // if there is a colon it returns true and means there is a standard time.
    }


    public String getMeridian(String s) {
        String meridian = findIntString(s,"AM|am|PM|pm");
        return meridian;
    }
}
