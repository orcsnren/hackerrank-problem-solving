package implementations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfProgrammer {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        int normalPeriod = 13;
        int transformationDiff=13;
        int transformationYear = 1918;
        boolean canBeDividedFour = false;
        String yearStr = String.valueOf(year);
        String day;
        String month="09";

        if(year%4==0){
            canBeDividedFour = true;
            normalPeriod--;
        }
        if(transformationYear == year){
            normalPeriod += transformationDiff;
        }else if(transformationYear < year){
           if(year%400 != 0 && !(canBeDividedFour && year%100!=0)){
               normalPeriod = 13;
           }
        }  
           day = String.valueOf(normalPeriod);
        
        return new StringBuilder().append(day).append(".").append(month).append(".").append(yearStr).toString();
       
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

