public class TripleSteps
{

    public static int countWays(int steps)
    {
        return countWays(steps, 0);

    }

    private static int countWays(int steps, int currentStep)
    {
        if(steps == currentStep)return 1;
        else if(steps < currentStep)return 0;

        return
              countWays(steps, currentStep + 1)+
              countWays(steps, currentStep + 2) +
              countWays(steps, currentStep + 3);
    }



    public static void main(String[] args)
    {

        System.out.println(countWays(15));

    }
}
