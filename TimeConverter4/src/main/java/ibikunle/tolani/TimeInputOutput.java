package ibikunle.tolani;

import java.util.Scanner;

/**
 * Created by tolaniibikunle on 2/20/17.
 */
public class TimeInputOutput {


    public String getUserString(String s) {
        System.out.println(s);
        Scanner scanner = new Scanner(System.in); // need to get in the user input
        return scanner.nextLine();
    }

    public void displayConvertedMilTime(String[] convertedTime) {
        System.out.println(
                "The time is " + convertedTime[0] + " hundred" + convertedTime[1] + " hours"
        );
    }

    public void displayConvertedStdTime(String[] convertedTime, String meridian) {
        System.out.println(
                "The time is " + convertedTime[0] + " " + convertedTime[1] + " "+ meridian
        );

    }








//    //test method
//    public static void main(String[] args) {
//        TimeInputOutput timeInputOutput = new TimeInputOutput();
//        System.out.println(timeInputOutput.getUserString("Enter the time to convert: "));
//        timeInputOutput.displayConvertedMilTime(new String[]{"zero eight","thirty four"});
//        timeInputOutput.displayConvertedStdTime(new String[]{"zero eight","thirty four"},"pm");
//
//    }


}
