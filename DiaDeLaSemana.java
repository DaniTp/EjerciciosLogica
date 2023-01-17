import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        String diaEs="";
        try{
        String dateS = year+"-"+month+"-"+day;
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateS);
          Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
   int dia = calendar.get(Calendar.DAY_OF_WEEK);
     
    System.out.println(dia);
    switch(dia){
        
        case 2:{
            diaEs="MONDAY";
            break;
        }
        case 3:{
            diaEs="TUESDAY";
            break;
        }
        case 4:{
            diaEs="WEDNESDAY";
            break;
        }
        case 5:{
            diaEs="THURSDAY";
            break;
        }
        case 6:{
            diaEs="FRIDAY";
            break;
        }
        case 7:{
            diaEs="SATURDAY";
            break;
        }
        case 1:{
            diaEs="SUNDAY";
            break;
        }
    }
        }catch(Exception e){
            e.printStackTrace();
        }
              
    
   
    return diaEs;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}