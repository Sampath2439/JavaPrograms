package Pragrams;

public class numberFollw {
    public static int[] fix23(int[] nums){
        if(nums[0] == 2 && nums[1] == 3){
            nums[1] = 0;
        }
        if(nums[1] == 2 && nums[2] == 1){
            nums[2] = 0 ;
        }
        return nums;
    }

    //method to print the array

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]);
            if (i<arr.length-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        int[][] testCases = {{2,3,4},{1,2,3},{1,2,2},{3,2,3},{2,0,2},{2,3,2}};
        for (int i  =0; i<testCases.length;i++){
            int[] result = fix23(testCases[i]);
            System.out.print("Test Case : "+(i + 10)+ " : ");
            printArray(result);
        }
    }
}
