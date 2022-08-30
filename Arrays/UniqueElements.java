public class UniqueElements {

    void findUniqueElement(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {   int j;
            for(j=0;j<arr.length;j++)
            {if(arr[i] == arr[j])
                    break;}
                if(i == j)
                {
                    System.out.println("Unique elements in the array " + arr[i]);
                }
        }
    }

    public static void main(String[] args) {
        UniqueElements uniqueElements = new UniqueElements();

        int arr[] = {12, 10, 9, 45, 2, 10, 10, 45};
        uniqueElements.findUniqueElement(arr);
    }
}
