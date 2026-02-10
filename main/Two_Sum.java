import java.util.HashMap;
import java.util.Map;

class two_Sum {
    public int[] twoSum(int[] nums, int target) {

        // HashMap to store numbers we have seen so far
        // Key   -> number from the array
        // Value -> index of that number
        Map<Integer, Integer> map = new HashMap<>();

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {

            // Calculate the number needed to reach the target
            int complement = target - nums[i];

            // Check if the required number already exists in the map
            if (map.containsKey(complement)) {

                // If found, return the index of the complement
                // and the current index
                return new int[] { map.get(complement), i };
            }

            // Store the current number and its index in the map
            // This is done after the check to avoid using the same element twice
            map.put(nums[i], i);
        }

        // This line will never be reached because the problem
        // guarantees exactly one valid solution
        return new int[0];
    }
}
