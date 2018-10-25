package lc;

import javax.sound.midi.Soundbank;

public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ret = 0;
        int left = 0;
        int product = 1;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] >= k)
                left = right;

            while (left < right && product * nums[right] >= k) {
                System.out.println(product * nums[right]);
                System.out.println(k);

                product = product / nums[left];
                left++;
            }

            if (nums[right] < k) {
                product = product * nums[right];
                ret += right - left + 1;
            } else {
                product = 1;
                left = right + 1;
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        int[] nums = {13,24,27,7,6,20,12,23,11,23,3,21,3,4,30,3,19,16,28,32,16,8,21,10,33,2,1,27,9,17,25,14,27,7,18,31,17,23,27,24,1,11,14,3,6,30,18,31,10,14,29,33,27,25,18,23,4,11,9,10,14,9,27,10,19,26,3,30,24,17,7,11,24,19,20,16,8,12,13,20,21,9,29,10,2,2,16,30,19,20,23,19,32,10,23,15,23,8,33,10,9,5,23,11,18,21,10,27,6,24,26,24,32,24,19,20,32,1,19,17,22,2,7,4,13,1,26,14,22,26,16,9,20,3,12,12,16,23,3,26,22,27,10,8,3,2,7,9,32,19,24,10,8,29,10,4,23,15,9,5,9,15,9,19,23,19,19,26,8,26,3,16,25,9,26,5,16,26,9,9,10,20,31,26,15,7,19,1,28,16,1,7,2,31,5,6,15,12,27,32,20,21,9,29,1,28,18,6,21,16,14,4,1,9,15,11,18,20,33,32,22,9,13,30,30,3,25,20,2,32,23,4,32,18,27,2,32,3,32,20,20,10,10,27,15,18,14,33,2,3,12,19,19,5,26,31,19,28,10,31,13,7,29,10,17,15,15,6,23,26,26,25,8,7,21,12,23,23,27,32,11,1,28,6,21,8,8,12,16,1,11,31,12,4,10,31,25,29,33,15,29,17,1,33,24,15,30,19,23,21,8,15,15,13,30,32,9,16,11,21,32,5,25,8,13,4,1,13,14,4,32,28,25,14,15,13,29,12,19,27,3,13,26,20,5,29,20,10,3,26,22,16,11,31,3,25,2,31,4,27,7,4,13,24,7,13,18,5,30,32,29,27,19,5,29,16,13,26,13,9,31,8,11,1,25,26,7,17,29,19,12,25,22,10,3,4,15,29,12,25,31,17,33,25,25,12,22,30,8,25,8,5,13,7,25,6,13,24,14,25,9,33,25,11,29,4,6,18,12,18,17,25,7,7,7,14,7,31,18,25,26,25,17,6,29,24,5,14,32,5,33,26,17,13,31,13,2,4,3,3,2,29,30,15,10,13,20,10,28,11,30,8,7,25,29,30,33,20,9,26,33,23,7,29,22,1,27,4,17,5,7,10,11,18,5,17,4,24,6,30,25,7,33,1,22,1,27,22,33,16,30,18,19,14,26,16,8,23,19,18,18,25,6,16,12,16,10,17,26,9,31,10,18,13,9,13,25,15,20,25,33,9,24,28,27,29,6,17,11,13,16,32,11,13,16,15,29,18,3,29,2,14,21,25,25,32,27,22,16,21,14,30,3,28,5,11,19,4,15,15,13,29,11,20,32,22,24,20,7,22,14,16,9,4,17,7,20,20,18,29,26,19,25,12,11,13,3,17,11,7,24,28,3,17,33,15,22,19,32,17,2,4,28,14,9,16,25,20,26,7,17,9,21,13,9,10,2,30,4,20,23,24,26,23,20,18,2,14,32,16,13,9,29,7,5,27,9,24,21,3,25,4,1,9,19,19,26,13,4,11,5,30,22,28,6,6,15,21,30,8,29,6,23,28,2,18,2,7,4,18,19,27,14,2,5,26,20,8,17,23,5,16,2,21,31,21,6,19,7,27,31,33,3,21,25,9,18,21,7,3,15,16,14,29,20,24,5,19,13,9,4,8,31,13,11,5,27,25,19,21,20,30,33,17,4,3,6,24,23,16,3,22,24,17,27,13,14,11,23,4,3,19,15,29,10,28,33,2,17,4,32,15,14,18,30,22,23,5,30,31,11,4,1,32,10,23,14,8,12,11,2,1,18,28,9,12,29,14,7,3,23,3,10,27,21,16,24,33,27,28,25,31,7,23,2,8,13,3,27,29,3,31,2,15,28,6,21,26,30,29,4,10,21,1,5,19,24,2,22,2,14,31,23,14,6,21,25,28,19,21,26,29,21,18,22,6,23,11,16,9,20,24,33,4,20,9,15,26,13,9,19,28,22,30,12,18,18,5,3,25,28,9,13,2,3,14,30,4,32,8,16,32,9,27,28,5,8,24,22,7,25,22,16,22,26,15,6,26,6,25,25,2,26,17,29,32,14,10,32,13,14,33,13,12,6,18,19,9,8,6,25,4,7,20,18,21,14,25,30,1,23,31,17,5,7,31,9,14,12,33,6,5,3,31,26,26,27,31,24,27,4,6,27,1,17,5,24,2,25,15,19,3,25,20,24,15,22,30,12,26,25,12,32,6,15,23,4,32,26,17,12,12,22,1,28,30,3,23,8,24,22,24,8,8,2,6,9,1,8,15,1,12,18,28,28,8,5,16,28,23,12,22,4,32,12,16,33,4,11,28,20,17,15,20,8,20,27,15,15,8,15,22,8,15,14,10,19,11,14,21,26,8,6,3,8,27,3,23,3,8,8,26,27,28,19,28,8,26,8,19,5,14,8,1,24,10,17,24,9,22,27,17,9,24,19,16,18,1,4,3,19,23,27,13,22,12,7,19,23,19,3,27,13,14,15,5,32,30,14,31,25,22,26,18,22,13,33,8,31,19,18,24,12,5,25,24,14,30,16,18,3,22,33,2,28,12,24,4,4,16,32,19,10,31,10,21,25,6,18,3,29,22,16,21,29,31,13,19,15,19,12,7,6,32,11,12,9,1,30,24,28,32,6,30,4,13,32,23,33,2,32,27,5,13,14,33,23,21,30,1,32,26,27,16,13,5,33,8,21,7,1,30,27,15,10,2,13,25,11,32,29,18,2,21,33,33,24,33,33,14,27,30,29,30,14,30,11,32,3,15,11,13,23,29,11,21,7,21,26,4,8,28,23,32,13,21,9,17,1,17,5,18,10,5,2,24,8,12,24,32,16,17,18,3,29,21,32,31,32,9,13,13,8,24,19,26,18,33,30,7,17,14,14,33,24,14,10,3,23,20,3,30,25,25,22,6,10,17,30,19,29,9,26,2,33,6,20,7,6,28,7,7,28,30,12,19,28,30,16,22,24,24,22,19,32,5,27,29,15,5,17,31,3,5,14,33,31,21,6,29,9,9,9,9,15,11,8,11,26,1,16,17,9,20,27,17,22,3,6,16,25,28,2,24,10,23,12,14,30,14,19,33,6,33,22,17,13,18,10,28,28,23,17,18,29,12,15,2,24,13,10,11,29,2,27,11,26,26,23,6,22,6,13,4,18,17,6,4,9,14,12,19,26,27,17,7,8,31,10,28,15,6,18,16,11,5,10,26,7,5,32,3,23,15,32,1,17,15,7,17,10,17,2,3,33,2,10,14,15,15,3,10,9,26,25,1,8,28,33,17,22,26,30,28,18,29,19,16,29,24,20,12,13,8,27,22,23,27,13,32,32,3,19,29,1,3,4,29,16,7,28,8,31,8,4,20,14,12,29,21,7,10,7,27,28,22,3,16,22,30,6,33,10,33,22,6,12,2,5,22,3,7,33,6,32,16,7,16,5,13,28,19,12,25,4,12,20,25,13,29,15,20,27,20,20,6,16,9,24,22,12,30,23,4,23,12,27,33,16,13,25,26,4,23,25,1,2,2,9,4,4,9,18,7,2,29,16,20,25,8,15,5,21,17,8,22,30,29,22,25,30,29,5,16,1,5,16,18,13,23,13,29,14,4,22,22,20,21,33,33,30,13,3,17,5,26,33,25,18,10,33,21,25,3,17,18,30,5,17,7,18,23,29,28,27,22,13,28,25,24,31,29,18,4,32,27,29,21,7,24,33,19,30,29,6,32,23,18,18,25,26,12,24,19,15,27,9,2,8,9,5,33,33,7,31,17,28,2,19,32,16,9,22,8,4,6,8,17,14,14,24,25,14,24,7,27,20,7,9,32,32,16,21,6,19,11,18,2,29,27,7,4,24,27,29,13,5,9,10,10,6,26,15,13,13,13,18,30,6,7,15,15,2,8,30,33,6,6,31,5,27,10,20,8,9,7,13,21,19,13,1,2,26,12,1,30,27,22,13,29,12,7,15,27,20,9,6,12,16,9,13,10,9,18,7,10,31,19,28,14,5,9,23,8,33,16,26,18,17,24,30,31,29,11,14,25,2,6,11,6,24,21,15,3,6,1,9,1,33,10,24,12,4,18,1,18,20,6,13,7,11,31,12,14,27,10,24,20,13,17,31,19,18,15,2,26,20,26,1,28,21,15,29,27,13,12,16,17,4,32,28,9,29,2,27,17,28,24,8,11,10,12,1,33,23,10,24,30,5,32,3,11,13,12,8,10,31,6,26,12,30,12,21,16,22,23,22,29,1,26,30,4,25,23,1,6,13,4,7,11,27,16,17,7,7,4,15,29,13,31,30,16,25,18,29,4,27,26,18,5,6,19,12,14,11,3,17,21,7,5,26,9,12,25,32,7,1,11,4,28,18,32,14,4,2,28,6,19,1,20,23,23,25,24,11,31,2,18,19,17,11,26,7,18,27,18,30,3,3,7,4,17,26,25,1,10,10,19,7,7,6,29,29,28,17,27,30,27,4,9,4,15,20,6,23,11,9,12,7,3,1,21,14,21,24,11,14,17,10,2,22,16,29,27,21,33,2,31,31,30,22,3,14,28,24,30,16,27,23,2,4,7,18,29,11,10,10,22,22,28,31,1,33,29,2,33,27,17,20,27,25,5,21,8,31,31,6,15,19,15,21,25,6,27,22,10,33,11,1,13,29,17,22,14,5,26,9,22,33,7,17,16,29,15,33,3,19,10,20,11,33,31,20,3,31,6,5,21,13,23,11,21,13,13,1,8,12,5,24,11,11,20,27,21,5,11,10,22,28,15,15,22,6,16,13,30,20,24,20,30,11,33,9,5,26,25,18,11,9,13,7,22,28,1,1,7,1,17,1,8,14,14,28,28,14,8,18,10,14,25,27,9,9,18,1,12,9,22,19,12,4,23,7,5,32,26,11,3,24,2,18,23,17,23,2,18,17,25,16,27,26,30,8,5,9,11,12,21,10,28,3,22,15,5,16,26,19,30,30,6,6,1,18,27,14,20,12,22,14,15,14,1,29,32,9,28,5,12,7,18,31,20,25,22,8,30,33,8,29,3,16,22,22,17,14,1,6,20,9,15,30,7,13,27,3,9,32,16,13,14,33,17,32,30,15,18,11,16,15,2,16,10,18,20,29,14,8,21,11,7,18,3,11,24,17,33,24,24,30,28,27,1,32,24,4,6,3,22,11,19,22,27,32,24,14,23,27,4,6,3,33,12,24,26,27,22,16,12,7,21,12,17,31,6,31,30,4,33,27,18,33,15,26,1,29,16,25,4,20,3,26,16,29,8,30,16,5,15,19,10,17,13,9,9,29,25,10,7,16,27,13,10,10,12,12,23,1,6,6,25,24,19,18,31,20,20,3,13,11,33,21,14,15,10,33,20,14,32,31,11,14,28,2,11,3,7,21,17,28,3,22,4,19,32,31,23,6,29,10,33,8,6,26,2,25,8,3,15,19,10,24,21,33,11,32,23,24,6,9,1,6,18,3,11,20,4,18,19,24,6,32,8,2,11,12,4,22,7,20,29,15,11,7,8,13,12,3,11,22,9,23,6,19,30,13,20,11,19,6,13,13,25,13,8,11,4,5,21,32,10,21,17,30,7,10,7,29,1,23,23,14,2,9,5,29,9,15,30,25,14,21,26,32,24,11,28,21,10,15,6,33,8,8,11,5,6,27,3,15,4,24,21,15,19,29,6,7,20,27,5,15,31,10,23,10,28,11,1,21,26,21,30,13,31,24,22,5,27,32,13,5,15,3,33,29,20,20,2,8,10,13,31,30,25,30,9,26,30,21,10,13,8,2,31,7,22,23,2,29,5,30,21,12,5,8,12,14,27,1,22,30,18,13,24,3,19,19,6,9,26,32,21,25,32,15,3,6,17,31,23,7,8,12,30,3,8,1,30,8,10,29,29,7,8,33,3,8,27,11,17,31,24,23,3,31,23,27,27,1,32,19,3,21,15,24,16,9,25,13,1,1,9,9,28,9,9,20,28,7,28,19,20,20,15,24,33,13,8,12,3,22,22,17,4,3,25,26,6,19,29,5,31,18,33,17,13,22,21,7,13,8,21,10,31,29,5,12,23,22,19,29,2,29,18,23,26,2,32,25,16,8,3,25,15,15,26,12,15,3,22,5,21,24,8,1,22,20,1,33,26,16,16,17,11,33,23,32,22,1,27,25,8,33,31,11,25,20,1,10,23,20,16,14,14,30,4,2,1,21,8,12,13,16,31,26,20,19,24,13,22,18,9,6,32,15,19,11,23,12,24,27,9,7,22,25,10,13,13,9,20,22,26,28,33,33,31,18,27,1,19,8,13,17,21,7,32,18,29,17,5,13,6,5,29,6,29,31,22,31,21,20,24,4,20,4,11,19,7,27,23,1,32,7,13,7,9,33,16,28,31,17,6,9,9,24,23,31,14,11,23,5,29,18,4,3,3,11,15,32,21,21,4,22,24,19,30,26,20,21,11,8,13,9,22,31,5,32,1,8,14,16,22,29,31,3,13,27,31,6,11,8,9,12,25,20,6,19,12,27,4,15,14,31,16,28,16,7,29,1,23,12,14,9,4,26,23,17,30,23,30,7,9,10,3,12,5,19,24,24,16,23,6,17,6,14,13,15,3,13,24,30,22,24,6,5,12,25,11,27,11,17,31,10,16,21,20,15,25,33,33,20,27,19,29,14,28,16,8,24,18,1,19,12,13,10,22,5,4,21,33,25,27,24,7,7,2,9,28,2,32,25,25,15,3,27,27,5,30,1,32,11,2,1,8,27,2,20,30,13,4,15,31,16,1,17,3,5,8,28,15,29,30,26,10,14,12,21,7,25,2,20,25,8,32,8,4,22,22,28,5,14,8,22,32,25,2,28,12,20,25,30,7,31,8,31,17,1,33,4,15,4,14,8,24,12,32,18,4,7,9,5,2,22,5,1,27,17,10,26,28,6,12,28,24,6,2,25,10,28,5,17,19,21,11,12,16,23,32,30,21,19,21,10,22,30,1,4,33,15,7,10,29,18,9,9,17,33,13,32,19,3,21,15,15,7,15,20,5,12,18,12,7,10,32,27,27,9,27,9,9,32,15,2,29,21,32,5,15,24,32,19,10,18,27,2,6,33,30,3,18,14,15,20,4,11,21,19,14,5,5,25,12,20,28,12,5,11,8,12,18,18,19,30,33,24,27,29,8,18,10,31,5,7,30,26,17,15,8,13,17,1,28,12,12,13,30,5,27,9,2,27,8,32,17,1,1,1,24,11,24,7,2,3,8,21,28,21,15,5,33,16,25,10,18,30,26,6,28,22,3,15,25,27,32,19,26,12,13,2,32,3,10,26,4,14,17,3,8,25,16,22,15,13,25,1,4,19,2,26,15,28,27,31,25,28,1,9,12,32,17,32,21,13,14,19,32,8,6,5,27,14,1,2,5,24,30,1,2,12,29,16,32,21,25,20,1,28,7,19,31,22,3,26,29,23,27,15,14,17,31,25,3,27,28,25,18,2,30,7,30,1,6,16,28,30,16,10,2,11,14,25,16,23,23,4,27,26,22,22,5,6,10,20,21,7,5,29,29,15,12,18,28,27,29,24,31,10,32,22,4,23,15,8,33,15,2,24,8,33,2,21,3,25,33,9,10,32,29,6,13,13,12,14,16,11,3,27,33,24,22,4,30,7,28,19,7,9,25,9,3,16,23,32,8,25,31,17,22,5,14,6,18,32,6,29,18,28,32,13,3,31,5,23,33,31,23,24,3,30,33,1,25,8,20,25,10,29,22,16,16,23,23,18,25,23,33,22,12,3,16,20,18,27,22,24,29,3,6,30,4,16,18,15,24,25,29,22,2,15,29,15,6,21,11,9,14,33,31,9,17,15,18,20,33,28,28,11,8,13,21,27,4,7,9,7,26,9,3,23,5,6,16,2,14,9,24,11,1,33,24,6,23,18,32,26,3,21,12,8,24,19,3,10,17,11,7,27,7,16,8,28,4,32,20,5,23,27,16,10,16,3,18,22,9,8,8,17,22,17,16,29,1,12,22,1,10,1,21,16,22,27,28,17,27,29,28,20,12,13,31,12,13,33,6,28,25,21,16,3,27,23,14,22,17,9,16,26,7,13,25,32,18,15,12,16,14,3,17,18,25,31,27,27,32,7,3,5,15,20,32,33,32,27,12,32,20,1,8,7,31,8,26,25,17,15,6,25,27,18,13,10,29,14,4,1,5,14,26,24,6,29,29,23,4,5,27,23,16,19,17,10,12,2,11,7,32,3,13,33,19,9,10,33,3,7,20,18,29,25,5,31,28,30,30,6,9,9,27,4,7,15,23,1,12,13,11,19,28,15,21,23,1,20,22,30,8,32,11,18,18,11,27,6,33,3,6,25,23,13,5,27,7,10,18,7,20,15,2,5,11,13,6,18,25,24,19,29,20,18,3,14,24,30,1,1,22,26,8,15,29,1,17,29,23,32,8,11,13,8,28,24,3,20,5,22,13,4,26,5,33,6,3,19,26,26,20,15,31,1,20,1,6,4,33,6,24,7,20,28,5,18,9,15,33,32,23,19,29,1,29,29,20,24,11,20,1,16,25,32,8,30,15,18,14,13,20,3,5,18,20,33,8,6,24,12,20,2,17,6,10,3,30,18,16,5,19,18,25,25,30,3,30,4,11,20,29,30,26,15,11,13,21,21,17,33,2,5,4,32,11,24,18,6,32,7,18,25,9,27,7,16,13,5,30,23,16,10,11,12,26,31,3,27,33,32,27,26,29,31,8,2,19,1,33,5,12,29,18,15,32,4,12,2,24,15,33,20,19,32,9,6,7,33,6,4,28,31,3,16,15,16,11,7,31,3,32,19,27,11,2,6,33,9,3,23,7,11,14,32,6,3,33,33,6,12,30,1,12,9,23,18,13,19,30,26,12,18,7,32,16,12,10,29,25,25,16,6,23,26,21,21,29,20,21,22,33,24,18,11,31,25,25,26,12,7,10,33,3,11,32,17,26,31,4,12,10,16,1,28,22,26,18,19,25,32,31,31,21,2,8,22,15,4,8,22,32,2,26,14,11,31,13,24,21,17,1,17,14,28,12,31,8,27,32,23,16,20,23,3,25,27,19,26,16,20,15,15,9,4,15,28,27,21,5,16,10,33,27,33,1,25,26,23,10,18,10,17,18,4,30,14,24,23,31,11,12,32,29,30,10,22,1,7,6,3,13,24,21,31,3,16,18,18,32,4,19,30,12,8,11,3,7,20,4,6,28,9,29,13,11,21,29,10,21,14,22,13,26,4,28,7,15,26,1,5,32,12,31,6,8,9,26,3,33,27,23,19,3,24,28,31,25,13,19,1,12,8,16,21,22,28,33,24,17,25,2,7,30,24,30,15,21,23,12,7,3,22,16,18,4,11,22,31,4,24,7,7,26,20,14,28,7,5,3,11,12,8,4,16,5,32,2,17,21,22,24,25,18,24,26,6,5,10,2,15,25,30,16,14,31,17,19,3,22,27,28,23,6,25,17,10,30,5,19,4,11,3,11,10,20,20,15,19,12,11,12,8,8,9,9,2,27,7,8,13,20,13,19,33,20,13,4,15,15,19,26,1,24,30,6,3,31,3,12,27,9,25,8,2,15,10,4,6,23,21,2,8,2,19,9,21,15,30,14,15,26,16,33,3,27,19,18,13,11,4,26,27,21,5,10,12,12,25,27,9,18,2,26,6,31,12,12,21,2,33,21,13,32,24,10,15,28,5,26,28,20,8,27,14,32,17,4,19,30,5,27,10,15,31,10,6,28,15,33,23,17,26,5,16,25,3,8,4,19,29,22,4,20,13,20,20,30,6,27,5,15,17,29,24,11,8,25,23,19,7,26,32,26,5,10,8,14,26,21,16,4,18,7,30,19,28,4,5,4,24,31,30,1,17,16,20,9,31,31,13,1,17,8,12,18,20,21,18,24,2,25,19,14,32,8,30,18,26,15,7,7,12,3,10,5,20,20,10,25,25,16,32,6,10,26,26,13,3,19,2,21,1,21,12,15,32,14,15,16,4,6,11,1,30,29,3,31,9,32,1,25,1,25,5,32,22,26,18,20,15,22,27,22,6,12,27,20,12,28,16,16,30,30,6,19,12,13,9,30,10,26,13,27,27,30,4,13,11,32,3,3,3,12,4,13,20,16,4,11,18,32,15,13,12,23,5,21,8,29,26,27,18,12,22,4,29,20,24,29,19,4,13,22,22,22,29,17,2,8,32,32,18,27,19,25,23,28,26,19,32,24,27,2,16,19,15,28,15,9,1,30,32,12,5,22,30,6,20,23,30,25,29,15,4,4,22,13,12,17,2,15,6,26,17,32,2,19,4,20,24,12,19,25,31,31,16,21,27,25,18,15,16,16,13,6,5,23,30,18,15,13,2,25,20,27,6,5,31,32,3,22,15,7,22,5,16,29,11,21,7,19,29,33,17,7,32,11,9,2,28,30,18,16,16,27,33,7,28,6,3,33,19,31,17,7,19,1,4,28,7,27,24,22,30,1,1,11,24,15,21,32,31,15,30,12,27,24,20,6,14,10,5,19,21,29,12,3,24,24,19,24,29,19,25,2,4,11,13,31,28,17,6,26,23,18,30,13,9,4,2,26,15,13,5,1,29,1,21,17,33,11,28,30,25,27,29,2,2,28,18,24,9,11,3,33,33,26,8,33,10,25,1,5,9,15,18,14,8,5,14,15,33,18,12,32,1,30,30,31,25,19,15,12,30,15,18,14,32,20,27,6,14,16,16,20,19,17,1,31,7,5,13,9,30,23,30,1,18,2,21,3,23,18,27,30,19,22,12,24,9,3,19,16,21,8,9,32,24,5,29,22,17,2,5,31,31,9,22,24,20,13,18,31,24,19,13,1,14,13,1,14,26,14,28,7,26,2,4,25,15,18,29,10,32,25,11,5,7,7,15,19,1,30,28,21,28,1,7,17,1,15,30,10,15,20,19,8,7,19,15,2,2,10,27,14,10,7,7,11,22,14,13,4,15,20,22,29,9,5,26,29,33,24,15,8,2,7,24,30,27,17,26,25,7,4,11,8,5,13,15,28,11,30,31,28,5,11,24,30,21,32,14,11,4,23,13,17,13,4,6,26,22,7,11,23,20,31,3,24,21,30,21,5,9,5,8,9,17,12,13,23,30,26,30,6,29,28,24,1,31,16,17,25,9,1,33,21,33,28,29,4,5,15,8,23,3,28,12,21,27,23,30,3,29,11,23,17,5,30,21,1,28,17,8,13,33,19,12,6,4,24,19,17,16,17,31,14,11,21,13,18,31,27,30,13,13,1,17,31,2,22,21,28,19,16,18,20,13,28,1,4,29,32,4,23,32,21,11,29,5,33,27,3,19,25,4,19,23,32,12,13,9,13,5,20,31,8,27,29,31,32,7,3,16,32,6,10,29,28,23,27,27,3,6,16,26,12,31,30,21,6,9,11,29,27,10,29,4,17,20,25,16,9,21,20,33,8,32,18,2,3,26,20,4,11,1,4,5,25,5,14,25,21,22,2,24,11,8,33,29,26,5,11,28,29,7,15,16,7,9,25,18,1,1,32,10,5,10,28,20,26,21,13,20,19,26,6,12,24,5,17,22,9,23,32,12,28,19,23,22,19,7,19,12,27,5,11,28,23,29,30,6,14,12,22,33,19,33,14,2,11,13,21,28,17,12,5,9,21,8,24,28,3,19,9,13,20,8,27,29,14,5,30,33,15,27,28,23,19,21,7,31,13,20,3,29,1,25,20,29,12,26,31,16,27,27,12,30,12,18,27,16,12,10,15,24,28,18,25,1,10,28,17,7,11,2,13,3,23,21,30,6,9,13,16,28,8,21,22,26,12,16,32,22,17,24,17,27,30,25,26,17,23,8,32,28,18,16,10,23,30,10,30,27,7,22,24,13,23,28,3,24,3,33,10,10,13,24,9,31,2,27,5,10,17,20,17,2,32,14,9,8,21,33,26,13,32,11,28,5,11,1,2,12,9,5,7,6,18,1,6,28,16,27,31,17,18,31,1,13,11,25,17,8,4,31,3,32,14,29,28,8,1,4,30,16,26,25,22,9,24,25,5,13,29,23,15,7,4,13,14,15,5,19,4,14,4,24,15,6,27,25,21,8,8,32,14,33,4,23,8,33,12,28,27,7,2,27,25,6,10,14,23,29,28,24,13,9,4,12,32,1,27,9,21,8,5,16,28,18,16,19,21,33,2,10,5,1,2,28,31,23,22,27,21,27,3,5,8,13,27,5,12,32,7,28,5,20,10,15,26,13,30,27,12,25,18,32,23,26,3,17,32,5,9,22,5,1,2,17,22,22,8,31,14,2,6,33,9,18,31,20,14,29,6,9,13,11,11,17,22,5,25,19,19,5,9,15,27,3,4,32,9,10,9,22,30,32,11,20,22,29,26,19,33,7,1,13,9,8,22,28,19,12,8,29,6,17,26,17,23,5,22,12,18,21,7,20,28,11,29,1,33,5,9,10,25,32,19,30,3,22,9,3,2,19,15,30,9,23,25,15,25,9,18,29,2,28,12,12,1,17,28,12,15,33,20,3,8,9,1,2,33,24,12,1,10,22,10,16,32,17,21,23,23,30,14,5,27,32,16,26,19,27,32,13,3,3,27,13,25,8,30,14,29,19,15,10,4,31,15,33,17,12,21,27,9,25,23,30,16,14,14,19,28,20,18,8,22,3,27,11,22,11,6,11,30,14,22,28,13,24,28,3,13,32,27,17,14,12,10,13,10,4,1,25,12,23,27,25,16,25,7,1,21,18,13,6,32,21,9,17,7,6,6,22,6,27,23,6,19,3,24,14,22,5,32,29,5,19,3,32,14,1,28,16,14,32,9,23,20,31,32,11,15,24,4,29,16,24,10,3,24,24,31,27,11,31,31,17,19,1,26,26,16,17,1,33,3,23,32,20,18,11,15,30,25,17,12,19,27,28,28,30,19,22,5,18,23,16,17,33,25,33,19,1,25,23,10,22,6,31,27,9,21,16,9,17,31,7,19,4,23,11,27,12,6,3,24,16,23,7,7,13,14,14,15,31,20,18,19,1,3,33,19,30,5,13,4,9,32,32,13,14,19,31,23,24,7,29,30,33,12,8,3,4,21,19,1,31,17,9,7,20,6,6,3,10,7,21,10,4,26,14,11,23,16,29,12,4,22,18,15,28,19,31,15,22,25,17,20,20,32,23,20,8,4,14,23,32,9,8,32,20,21,12,32,28,25,6,26,17,3,23,21,16,20,1,26,17,11,29,24,25,6,19,26,1,8,13,32,6,16,8,1,12,9,8,23,25,28,11,33,9,21,23,19,21,8,18,18,29,23,19,17,7,28,9,1,23,33,12,22,1,11,12,2,21,11,13,10,22,28,10,29,21,7,21,23,17,27,25,15,1,14,7,20,4,14,23,11,15,7,1,20,29,20,25,18,29,8,33,8,29,4,7,12,28,14,25,23,4,14,6,28,21,1,3,14,14,30,32,32,26,33,9,5,10,18,19,33,8,33,28,27,5,9,28,8,22,18,13,1,31,23,4,9,21,31,2,2,22,27,31,10,8,18,2,17,1,28,1,23,16,11,25,24,3,28,3,5,6,17,32,2,11,22,32,31,5,6,7,12,31,6,12,17,19,12,20,26,7,6,9,8,18,30,30,22,15,33,24,11,3,23,10,24,3,24,21,28,6,22,13,31,23,27,16,28,16,7,15,4,7,2,8,17,8,21,8,17,12,17,3,1,6,2,18,29,21,32,5,19,32,19,27,2,29,29,23,12,9,26,16,16,9,19,18,3,4,19,13,21,16,25,6,8,22,10,28,31,6,3,29,11,27,8,4,12,22,11,11,8,4,15,22,11,19,22,25,22,17,19,12,2,25,1,19,15,16,5,7,14,33,7,12,20,21,17,29,2,24,4,17,20,15,4,26,13,21,5,30,33,30,23,1,16,23,21,15,23,24,13,17,26,24,18,10,11,3,21,10,23,16,22,18,30,14,25,12,6,23,8,20,3,29,2,15,7,14,22,1,16,28,18,25,7,5,25,11,14,22,21,21,12,17,20,12,1,23,1,31,6,6,19,25,20,12,22,19,22,17,13,15,15,11,24,22,17,21,33,3,10,20,3,8,16,22,18,10,4,29,9,10,7,7,15,32,7,2,14,1,18,17,33,24,11,22,17,29,6,14,19,32,3,19,2,5,18,30,7,7,16,32,15,10,26,25,26,15,11,15,5,31,17,2,6,2,27,26,9,17,33,29,17,17,9,16,10,20,28,8,32,3,12,29,27,12,32,17,4,26,21,30,32,22,17,1,24,16,33,18,24,24,23,19,30,10,19,33,29,3,3,8,24,25,10,15,26,4,17,20,11,28,28,15,25,7,14,18,33,22,2,12,23,18,16,9,31,5,32,5,3,23,15,32,9,24,10,10,20,20,2,6,16,18,11,27,6,28,32,30,25,15,14,30,31,19,29,19,4,24,8,23,9,22,18,4,20,23,8,15,2,1,8,25,29,2,33,28,32,8,33,27,32,17,22,3,32,10,8,29,31,3,10,20,32,15,33,3,16,31,17,2,18,22,25,27,15,5,21,2,2,2,6,20,11,13,1,10,6,15,29,23,4,17,30,29,8,14,27,2,29,21,4,26,28,29,13,4,28,5,15,7,21,33,2,17,4,30,24,30,30,14,27,30,27,15,2,27,2,16,26,4,33,23,20,10,21,24,23,17,23,20,10,21,20,2,2,13,26,13,20,9,6,31,3,9,22,11,27,5,2,6,9,32,30,16,16,20,3,16,2,13,9,19,23,10,1,24,23,22,32,20,3,10,21,17,20,25,6,19,28,22,29,21,20,16,32,31,2,14,8,6,16,12,5,2,19,8,23,12,29,3,16,25,8,23,17,31,31,22,8,2,31,7,22,17,18,10,13,14,17,20,3,10,16,27,30,4,7,31,29,7,18,1,27,22,2,19,12,23,5,21,21,2,13,1,1,19,25,11,31,25,6,18,15,6,4,12,9,28,28,4,15,8,14,4,15,18,11,3,6,32,30,8,6,3,13,19,21,28,1,18,6,21,31,22,11,27,26,5,6,26,14,33,5,6,17,7,7,30,11,11,9,6,26,32,32,18,6,16,11,26,11,26,19,5,27,6,8,28,4,13,15,24,16,2,27,32,12,22,27,3,7,17,22,2,16,16,22,31,22,14,22,26,25,1,3,31,30,15,32,23,10,7,33,12,32,19,25,17,9,17,33,16,4,4,26,1,4,7,13,2,8,23,19,26,25,18,24,15,7,32,19,16,20,1,8,14,15,21,26,26,33,31,28,13,13,9,9,10,20,24,22,12,14,22,20,2,29,22,24,12,33,4,12,29,3,14,33,22,22,10,6,13,20,25,24,21,12,33,9,31,12,9,33,14,12,20,7,23,30,9,13,16,29,24,26,7,26,10,15,8,20,20,1,16,8,26,23,19,1,24,4,29,23,28,15,28,31,25,9,24,28,32,7,21,29,25,26,2,9,2,16,1,10,25,16,21,33,28,27,13,25,3,23,31,9,20,3,30,32,32,8,25,9,20,22,7,13,21,33,1,3,22,19,15,4,28,26,10,12,31,22,25,29,1,20,22,25,18,25,32,2,8,30,22,15,8,1,15,8,29,33,3,15,32,23,13,6,30,14,22,5,17,31,3,16,30,13,2,23,8,25,8,32,18,32,16,17,18,1,9,19,33,12,27,28,30,21,3,1,33,22,33,13,31,23,30,25,22,27,1,13,4,12,33,3,30,9,18,10,6,3,12,8,7,11,11,28,5,1,28,10,14,9,11,20,23,12,5,32,8,9,17,12,12,29,30,32,29,15,22,31,25,9,33,23,7,5,11,3,9,4,25,7,26,31,29,4,27,18,13,23,27,26,11,4,22,9,3,1,21,12,14,30,30,1,6,19,28,31,9,3,20,32,14,33,21,26,7,23,10,4,23,4,9,26,14,8,23,19,1,22,3,7,2,16,26,2,12,8,10,19,17,24,15,30,32,18,33,13,27,5,8,24,26,15,6,6,16,27,4,5,4,8,14,1,3,7,2,22,12,20,20,27,24,4,29,27,4,17,27,12,2,27,31,12,6,25,4,30,19,27,5,4,26,25,18,29,27,12,4,9,2,28,2,29,9,6,13,10,14,28,18,13,3,28,18,30,33,12,5,18,8,31,23,2,7,18,9,11,23,25,28,33,7,9,6,9,14,29,16,21,30,10,11,21,27,29,6,30,30,12,30,12,6,30,18,26,18,26,32,27,32,5,12,6,18,24,7,20,3,15,11,8,21,6,13,23,29,25,27,12,20,25,31,8,21,29,15,19,22,22,23,11,19,16,12,8,12,23,20,11,21,11,16,12,21,1,16,8,13,17,30,1,32,18,14,19,8,17,18,11,30,29,22,18,7,9,33,20,30,8,30,1,29,18,21,32,20,5,8,4,13,21,4,27,27,6,15,14,6,18,20,18,25,10,3,17,32,13,6,15,14,4,11,22,25,5,10,27,31,5,1,7,1,22,27,14,30,6,28,8,6,30,11,4,32,23,7,23,9,33,29,33,14,12,33,18,14,19,19,13,3,18,29,33,13,19,7,15,10,2,26,32,10,9,6,17,30,1,15,26,12,8,16,18,1,28,18,6,27,8,14,2,13,12,26,10,18,30,30,14,18,4,9,25,9,1,5,30,31,18,22,2,14,21,1,24,30,17,1,17,21,17,12,33,12,21,24,13,1,3,1,10,26,22,13,19,9,31,25,18,25,7,24,15,21,17,32,11,24,30,29,18,13,3,7,8,28,19,12,29,15,27,5,21,5,31,12,12,3,16,11,13,10,22,31,1,26,33,9,16,32,15,29,31,3,33,26,10,23,10,16,27,4,15,23,28,25,11,21,19,22,28,22,11,17,6,18,17,14,24,1,12,20,24,15,19,12,9,6,13,8,29,27,32,5,11,23,5,5,22,16,30,6,18,25,4,31,17,22,22,13,20,11,4,29,4,9,7,26,20,22,15,6,33,18,13,10,25,15,16,12,33,12,1,3,14,32,20,20,16,9,13,23,20,15,24,5,5,7,28,7,28,15,5,30,29,16,32,10,21,17,29,27,22,23,17,16,11,21,10,6,29,13,14,1,12,2,26,4,9,14,17,14,29,31,26,9,14,10,3,17,33,11,9,10,7,16,26,3,33,1,24,6,23,14,8,29,9,16,6,8,15,12,4,12,18,21,32,16,3,33,9,8,26,12,27,2,2,24,24,4,26,7,30,5,23,1,16,20,24,22,25,27,2,4,9,23,22,24,14,30,7,11,23,6,19,9,12,25,11,30,7,27,24,15,33,1,7,7,10,7,18,17,31,33,23,32,19,17,4,23,2,7,5,23,29,31,7,32,26,27,9,10,14,29,14,18,11,30,14,14,31,20,18,12,23,27,18,10,18,24,24,30,4,24,4,11,20,19,13,3,30,3,31,14,3,15,15,26,23,23,26,32,8,28,14,9,5,10,21,14,21,19,4,32,10,12,23,29,12,4,20,7,12,26,33,29,25,23,17,31,14,5,20,25,27,3,2,5,33,32,9,12,8,2,30,23,27,29,27,17,14,4,15,28,10,25,6,18,28,23,9,32,28,2,27,8,28,25,4,2,8,8,22,3,3,5,16,24,1,31,18,11,31,22,3,30,25,4,33,7,21,13,2,13,33,6,13,13,13,25,32,23,24,16,27,8,27,27,4,11,18,27,32,28,1,33,30,20,5,11,29,25,30,13,5,12,30,1,19,15,6,28,27,17,24,2,30,9,18,28,2,5,12,19,12,23,10,2,6,22,31,10,24,31,25,29,22,21,5,23,10,15,14,17,15,8,10,1,17,31,2,20,6,32,20,21,13,12,32,6,12,15,7,24,20,19,14,33,28,20,31,6,27,5,13,23,13,19,14,23,33,11,20,20,18,1,26,27,22,15,9,12,20,12,12,8,27,18,5,25,21,26,12,3,19,14,6,28,32,33,5,2,31,3,6,29,11,17,28,33,8,14,25,19,29,26,28,30,8,20,1,18,20,22,6,12,21,24,3,21,23,9,20,25,8,27,9,8,15,26,32,15,2,4,33,33,19,3,15,11,4,26,20,7,15,2,30,1,28,12,31,27,27,33,20,11,8,12,27,17,7,7,4,1,13,33,2,2,31,22,18,21,21,18,7,20,33,21,26,21,7,20,21,23,17,6,28,26,17,32,16,33,33,33,15,26,4,14,7,32,23,10,14,1,21,14,23,31,22,2,19,23,20,13,31,28,29,30,20,25,14,26,6,16,20,28,26,26,7,13,5,2,2,9,17,25,27,29,26,14,21,23,8,19,6,22,22,6,26,28,19,4,6,7,19,24,19,5,7,2,2,14,17,23,33,20,5,23,11,32,23,33,23,14,1,16,17,14,33,8,18,1,25,15,24,15,1,18,23,32,6,24,29,3,2,26,25,18,17,10,23,25,32,29,17,17,11,3,7,17,6,14,16,10,28,11,9,17,7,9,4,2,22,24,9,33,9,31,22,1,15,2,24,30,6,28,27,8,23,26,28,16,17,33,1,22,9,1,28,22,26,13,32,12,20,19,17,25,14,10,25,24,13,7,11,30,3,5,25,19,22,9,13,24,4,6,16,6,29,7,14,22,18,2,19,7,21,5,14,26,5,22,11,25,21,3,3,3,6,8,5,19,33,13,17,17,23,33,29,26,9,24,30,1,11,5,28,5,14,11,20,26,9,33,10,31,7,33,5,32,17,31,10,10,21,29,16,6,3,33,24,8,22,21,27,25,21,5,31,8,21,15,29,1,25,27,25,23,13,22,11,31,4};
        int k = 2917;
        SubarrayProductLessThanK s = new SubarrayProductLessThanK();
        System.out.println(s.numSubarrayProductLessThanK(nums, k));
    }
}
