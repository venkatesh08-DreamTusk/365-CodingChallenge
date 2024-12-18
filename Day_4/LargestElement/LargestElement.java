package Day_4.LargestElement;

public class LargestElement {

    public static   void main(String[] args){

        int[] arr = {0,-1,-5,-90,-23};
        int largest = largestElement(arr);
        int smallest = smallestElement(arr);
        System.out.println(largest);
        System.out.println(smallest);
    }

    private static  int largestElement(int[] arr){
        int largest = arr[0];

        for(int i = 0; i <= arr.length-1;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    private static  int smallestElement(int[] arr){
        int smallest = arr[0];

        for(int i = 0; i <= arr.length-1;i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;

    }
}
