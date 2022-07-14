import java.util.Scanner;

public class Sorting {

    static class BubbleSort{
        //Worst Case Time Complexity [ Big-O ]: O(n2)
        //Best Case Time Complexity [Big-omega]: O(n)
        //Average Time Complexity [Big-theta]: O(n2)
        public void bubbleSorting(){
            Scanner scanIn = new Scanner(System.in);
            System.out.println("Enter the no of elements you want to sort");
            int noOfElms = scanIn.nextInt();
            int[] arr=new  int[noOfElms];
            System.out.println("Enter the elements");
            for (int i=0;i<noOfElms;i++){
                arr[i]=scanIn.nextInt();
            }
            //took inputs from the user;
            int flag =0;//Introduced flag for monitoring swap process


            for (int i=0;i<noOfElms-1;i++){ //BubbleSorting Has started
                for (int j=i+1;j<noOfElms;j++){
                    if(arr[i]>arr[j]){
                        int temp=arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        flag=1;

                    }
                    if (flag==0) {
                        break;
                    }
                }
            }
            System.out.println("The sorted array is");
            for (int i=0;i<noOfElms;i++) System.out.print(arr[i]+" ");

        }

    }

    public static void main(String[] args) {

        BubbleSort b1 = new BubbleSort();
        b1.bubbleSorting();


    }
}
