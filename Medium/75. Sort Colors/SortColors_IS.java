//  0 ms - beats 100%
//  43.61 mb - beats 25.43%

class Solution {
    public void sortColors(int[] nums) {
        int leftPoint = 0;
        int rightPoint = nums.length-1;
        int counter = 0;
        
        while(counter <= rightPoint) {
            if(nums[counter] == 0) {
                nums = swapNums(leftPoint, counter, nums);
                leftPoint++;
            } else if(nums[counter] == 2) {
                nums = swapNums(counter, rightPoint, nums);
                rightPoint--;
                counter--;
            }
            counter++;
        }
    }
    
    public int[] swapNums(int i, int j, int[] numbers) {
        int temp = numbers[i]; // need to swap areas in array 
        numbers[i] = numbers[j];
        numbers[j] = temp;

        return numbers;
    }
    
}
