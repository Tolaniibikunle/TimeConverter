package ibikunle.tolani;



/**
 * Created by tolaniibikunle on 2/20/17.
 */
public class TimeConverter {
    TimeInputOutput timeInputOutput = new TimeInputOutput();
    TimeParser parser = new TimeParser();
    NumbersToWords numbersToWords = new NumbersToWords();

    void run(){
        String userInput = timeInputOutput.getUserString("Enter the time to convert"); // userinput
        String[] convertedTime = parser.isStdTime(userInput) ? convertStdTime(userInput): convertMilTime(userInput); // breaking time up into hours and minutes
        // this is displaying the converted input
        if(parser.isStdTime(userInput)){
            timeInputOutput.displayConvertedStdTime(convertedTime,parser.getMeridian(userInput));
        }else
            timeInputOutput.displayConvertedMilTime(convertedTime);

    }




    private String[] convertStdTime(String s) {
       // [12:00 08:00] or [1200 or 0800]
        String hours = getHours(s) ;
        String minutes = getStdMinutes(s);
        return new String[]{hours,minutes};
    }


    private String[] convertMilTime(String s) {
        String hours = getHours(s);
        String minutes = getMilMinutes(s);
        return new String[]{hours,minutes}; // now we have the hours and minutes into the the array
    }

    private String getHours(String s) {
    int hoursNumbers = parser.parseHours(s);
    String hoursWords = numbersToWords.convertToWords(hoursNumbers);
    return hoursWords;
    }

    private String getMilMinutes(String s) {
        int minutesNumber = parser.parseMilMinutes(s);
        String minutesWords = isItZero(minutesNumber) ? "" : numbersToWords.convertToWords(minutesNumber);
        return minutesWords;
    }

    private boolean isItZero(int minutesNumber) {
        return minutesNumber==0;
    }

    private String getStdMinutes(String s) {
        int minutesNumber = parser.parseStdMinutes(s);
        String minutesWords = numbersToWords.convertToWords(minutesNumber);
        return minutesWords;
    }


}
