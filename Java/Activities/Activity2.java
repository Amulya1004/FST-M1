package activities;

public class Activity2 {
    public static void main(String[] args) {
        int[] arr = {10, 77, 10, 54, -11, 10};
        int sum=0;

        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==10)
            {
                sum = sum+arr[i];
            }
            else
            {
                continue;
            }
        }
        if(sum==30)
        {
            System.out.println(true);
        }
        else
            System.out.println(false);
    }
}
