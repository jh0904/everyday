package cn.leetcode;

/**
 * cn.test1.sort
 *
 * @author jh
 * @date 2018/6/4 22:56
 * description:给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] nums={1,1,2};
        int len = removeDuplicates(nums);

// 在函数里修改输入数组对于调用者是可见的。
// 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
        for (int i = 0; i < len; i++) {
            System.out.println (nums[i]);
        }
    }
    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length==0) {
            return 0;
        }
        int index = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
}
