import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ShowArray
{

    static void show(String[] arr)
    {
        if(arr.length == 0)return;
        System.out.println(arr[arr.length - 1]);
        show(Arrays.copyOfRange(arr, 0, arr.length - 1));
    }

    public static void main(String[] args)
    {
        //Stream.of(getAllSubstring("ABC")).forEach(s -> System.out.println(s));
        Stream.of(getBinarySubstring(23)).forEach(s -> System.out.println(s));

    }

    public static List<String> getAllSubstring (String str){
        return getAllSubstring("", str, new ArrayList<String>());
    }

    public static List<String> getAllSubstring (String pre, String suffix, List list){
        if(suffix.length() ==0 ){
            list.add(pre);
        }else{
             for (char c : suffix.toCharArray()){
                 String newSuffix = suffix.replace(Character.toString(c), "");
                 getAllSubstring(pre + c, newSuffix, list);
             }
        }
        return list;

    }

    public static List<String> getBinarySubstring(int n){
        return getBinarySubstring(n, "", "", new ArrayList<String>());
    }

    public static List<String> getBinarySubstring (int n, String pre, String binstr, List list){
        if(n == 0 ){
            list.add(pre + binstr);
        }else{
            getBinarySubstring(n-1, "0", pre + binstr , list);
            getBinarySubstring(n-1, "1", pre + binstr , list);
        }
        return list;

    }

    public void printPosition (int n, int[][] arr)
    {



    }

}
