import java.util.Arrays;

public class PivotIndex724 {

    public static void main(String[] args) {
        int arr[] = {2,1,-1};
        int result = pivotIndex(arr);
        System.out.println(result);
    }

    public static int pivotIndex(int[] nums) {
        int rightSum=0, leftSum=0;

        for(int i=0; i<nums.length; i++){
            leftSum=0;
            for(int j=i+1; j<nums.length; j++){
                leftSum=leftSum+nums[j];
            }
            if(rightSum == leftSum){
                return i;
            }
            rightSum=rightSum+nums[i];
        }
        return -1;
    }
}
