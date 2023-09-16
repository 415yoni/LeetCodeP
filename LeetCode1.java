// where it all begins
import java.util.HashSet;
import java.util.Arrays;

public class LeetCode1{

    public int[] twoSum(int[] nums, int target){
        HashSet<Integer> sums = new HashSet<>();

        for(int i = 0; i<nums.length;i++){
            int complement = target - nums[i];
            if(sums.contains(complement)){
                return new int[] {nums[i], complement};

            }
            sums.add(nums[i]);
        }
        return null;

    }




public static void main(String[] argv) {

    LeetCode1 solution = new LeetCode1();
    LeetCode1 solution1 = new LeetCode1();
    int[] test1 = solution.twoSum(new int[]{2,7,11,15},9);
    int[] test2 = solution1.twoSum(new int[]{9,3,5,2,4,2,3,4,53},57);
    int[] test3 = solution.twoSum(new int[]{4,5,3,5,2,3,4}, 7);
    System.out.println(Arrays.toString(test1));
    System.out.println(Arrays.toString(test2));
    System.out.println(Arrays.toString(test3));
   

}
}
