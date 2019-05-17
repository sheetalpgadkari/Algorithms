import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VeryBigNumberSum
{

    static long aVeryBigSum(long[] ar) {

        return
                Arrays.stream(ar)
                        .reduce( (a, b) -> a + b)
                        .getAsLong();
    }

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int str_length = s.length();
        long number_of_occurances = n / str_length;
        long remaining_char = n % str_length;
        int count = getCharacterOccurance(s, "a");
        return count * number_of_occurances + getCharacterOccurance(s.substring(0, new Long(remaining_char).intValue()), "a");

    }

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int seek = 0;
        int count = 0;
        for (int i=0; i < c.length ;){
            if((i+2)>=c.length){
                count++;
                break;
            }
            if(c[i+2] == 0){
                i = i +2;
            } else{
                i= i + 1;
            }
            ++count;


        }
        return count;

    }

    private static int getCharacterOccurance(String s, String ch)
    {
       return s.length() - s.replace(ch, "").length();
    }

    //DDUUDDUDUUUD
    //UDDDUDUU
    //DUDDDUUDUU
    static int countingValleys(int n, String s) {
        int up_counter = 0;
        int down_counter = 0;
        int valley_counter = 0;

        for ( char c : s.toCharArray()){
            if(c=='U')up_counter++;
            if(c=='D')down_counter++;
            if(down_counter > 0 && up_counter > 0 && (down_counter-up_counter) == 0 && c=='U'){
                up_counter =0 ;
                down_counter=0;
                valley_counter ++;
            }
        }
        return valley_counter;

    }

    static List<String> getAllSubstringAfterDelete(String s)
    {


        List<String> subStringList = new ArrayList<>();
        for( int i=0; i < s.length() ; i++) {
            for (int j = i; j < s.length(); j++){
                subStringList.add(
                      s.replaceAll(  s.replaceAll(s.substring(i, j), ""), "")
                );
            }

        }

        return subStringList;
    }

    public static void main(String[] args) throws IOException
    {
       //int countingValleys = countingValleys(12, "DDUUDDUDUUUD");
        long countingValleys = jumpingOnClouds(new int[] {0 ,0 ,0 ,1 ,0  ,0});
        System.out.println(countingValleys);

    }
}
