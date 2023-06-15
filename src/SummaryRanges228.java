import java.util.ArrayList;
import java.util.List;

public class SummaryRanges228 {

    public static void main(String[] args) {
        int nums[] = {0,1,2,4,5,7};
        summaryRanges(nums).
                stream().forEach(System.out::println);
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();

        for(int i=0; i<nums.length;){
            int count = 0;
            int range = nums[i];
            while(i+count+1< nums.length && nums[i+count+1] - nums[i+count] == 1){
                range = nums[i+count+1];
                count++;
            }
            if(nums[i] == range) list.add(nums[i]+"");
            else list.add(nums[i]+"->"+ range);
            i = i + count+1;
        }
        return list;
    }
}
