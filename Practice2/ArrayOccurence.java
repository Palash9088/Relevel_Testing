public class ArrayOccurence {

    static void Array (int arr[])
    {
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i<arr.length;i++)
        {
            if (arr[i] % 2 == 0)
            {
                evenCount = arr[i];
            }
            else
            {
                oddCount = arr[i];
            }
        }
        System.out.println(oddCount + " Num occurred odd times");
        System.out.println(evenCount + " Num occurred even times");
    }
        static void sum (int arr[],int sum)
    {
        for(int i=0; i<arr.length-3;i++)
        {
            for(int j=i+1;j<arr.length-2;j++)
            {
                for (int k =j+1;k<arr.length-1;k++)
                {
                    for(int l = k+1;l<arr.length;l++)
                    {
                        if (arr[i] +arr[j]  + arr[k] + arr[l] == sum)
                        {
                            System.out.println("Sum of " + arr[i] + " " +  arr[j]+ " " + arr[k] +" " + arr[l] + " is " + sum );
                            return;

                        }
                    }
                }
            }
        }
    }

    static void calcAverage(int[] arr)
    {
        int sum = 0;
        int average = 0;
        for (int i=0; i<arr.length;i++)
        {
            sum = sum + i;
            float averageN = arr.length;
            average = (int) (sum / averageN);
        }
        System.out.println(sum);
        System.out.println(average);
    }

    static void checkSpecificNum(int[] arr, int value)
    {
        boolean flag = false;
        for (int j : arr) {
            if (value == j) {
                flag = true;
                break;
            }
        }
        if (flag == true)
        {
            System.out.println("Array contain specific value " + value);
        }
        else
        {
            System.out.println("Array does not contain specific value " + value);
        }
    }



    public static void main(String[] args) {

        ArrayOccurence arrayOccurence = new ArrayOccurence();

        int arr[] = {1,2,3,3,2,1,3,3,3};
        int arr1[] = {1,2,3,4,5,6,7,8,9,10,1,1,1,1};


        sum(arr1,12);
    }
}
