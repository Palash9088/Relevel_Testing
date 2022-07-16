public class ArrayPos {
    public static void main(String[] args) {

        int arr[] = {-2,-1,-3,1,2,3};
        int countP = 0;
        int countN =0;
        for (int i=0; i< arr.length;i++)
        {
            if (arr[i]<0)
            {
                countN++;
            }
            else
            {
                countP++;
            }
        }
        System.out.println("Count of Positive is " + countP);
        System.out.println("Count of Negative is " + countN);
    }
}
