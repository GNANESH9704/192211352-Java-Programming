package java_class;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class meanMedianMode {
	    public static void main(String[] args) {
	        int[] numbers = {16, 18, 27, 16, 23, 21, 19};
	        System.out.println("Mean = " + calculateMean(numbers));
	        System.out.println("Median = " + calculateMedian(numbers));
	        System.out.println("Mode = " + calculateMode(numbers));
	    }
	    public static double calculateMean(int[] nums) {
	        int sum = 0;
	        for (int num : nums) sum += num;
	        return (double) sum / nums.length;
	    }
	    public static double calculateMedian(int[] nums) {
	        Arrays.sort(nums);
	        int len = nums.length;
	        return len % 2 == 0 ? (nums[len/2 - 1] + nums[len/2]) / 2.0 : nums[len/2];
	    }
	    public static int calculateMode(int[] nums) {
	        Map<Integer, Integer> counts = new HashMap<>();
	        int mode = nums[0], maxCount = 0;
	        for (int num : nums) {
	            int count = counts.getOrDefault(num, 0) + 1;
	            counts.put(num, count);
	            if (count > maxCount) {
	                maxCount = count;
	                mode = num;
	            }
	        }
	        return mode;
	    }
}
