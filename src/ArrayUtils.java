import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class ArrayUtils
{
    public static void main(String[] args) throws IOException
    {
        //ArrayUtils arrayUtils = new ArrayUtils();
        //ArrayUtils.checkMagazine(new String[]{"two", "times", "three", "is", "not", "four"}, new String[]{"two", "times", "two",  "is",  "four"});

        //ArrayUtils.activityNotifications(10, 20], 5);
        int[] arr = { 10, 20, 30, 40, 50 };
        ArrayUtils.activityNotifications(arr, 3);

    }
    static int sum(int[] q)
    {
       return Arrays.stream(q).reduce((a, b) -> a+b ).getAsInt();
    }

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {

        Arrays.sort(prices);
        int count = 0;
        int toyAmount = 0;
        for(int p : prices){
            toyAmount = toyAmount + p;
            if(k - toyAmount >= 0){
                count++;
            }else {
                break;
            }
        }
        return count;

    }

    static int activityNotifications(int[] expenditure, int d)
    {
        int notificationSent = 0;
        int index = 1;
        List<Integer> expenditureList = Arrays.stream(expenditure)        // IntStream
                .boxed()        // Stream<Integer>
                .collect(Collectors.toList());

        for (int dayExpenditure : expenditureList) {
            if (index > d) {
                int median = getMedian(expenditureList.subList((index - d - 1), (index - 1)).stream().mapToInt(Integer::intValue).toArray());
                int triggerAmtForNotification = median * 2;
                if (dayExpenditure >= triggerAmtForNotification) {
                    notificationSent++;
                }

            }
            ++index;

        }
        return notificationSent;
    }

    static int getMedian (int[] nums)
    {
        Arrays.sort(nums);
        if(nums.length % 2 == 0){
            return (int) Math.ceil( (  nums[nums.length/2] + nums[nums.length/2 - 1])/2 / 100 );
        }
        return nums[nums.length/2];
    }

    List<Integer> compareTriplets(List<Integer> a, List<Integer> b)
    {
        int a_points = 0;
        int b_points = 0;
        for ( int i = 0; i < a.size() ; i++)
        {
            if(a.get(i) > b.get(i))a_points++;
            if(a.get(i) < b.get(i))b_points++;

        }
        return new ArrayList<Integer>(Arrays.asList( a_points, b_points) );
    }

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2)
    {

        for(char c : "abcdefghijklmnopqrstuvwxyz".toCharArray())

        {
            if(s1.indexOf(c) > -1 && s2.indexOf(c) > -1)
                return "YES";
        }

        return "NO";
    }
    static void checkMagazine(String[] magazine, String[] note) {
        String result = "Yes";
        List<String> mgList = new ArrayList<>();
        mgList.addAll(Arrays.asList(magazine));
        Collections.sort(mgList);

        List<String> noteList = new ArrayList<>();
        noteList.addAll(Arrays.asList(note));

        HashSet<String> magNotes = new HashSet<>();
        for( String n1 : noteList){
            boolean Notcontains = mgList.stream().noneMatch(n1::equals);
            if( Notcontains){
                result = "No";
                break;
            }
            magNotes.add(n1);
            mgList.remove( n1);
        }
        System.out.println(result);

    }

    static void whatFlavors(int[] cost, int money) {

        int totalsp = 0;
        List<Integer> flavourIndex = new ArrayList();
        for(int i = cost.length - 1 ; i > 0 ; i--){
            int c = cost[i];
            if( (totalsp + c) > money){
                continue;
            }
            totalsp = totalsp + c;
            flavourIndex.add(i + 1);
            if (flavourIndex.size() == 2)break;
        }
        System.out.println(flavourIndex.get(1) + " " + flavourIndex.get(0));
    }

}
