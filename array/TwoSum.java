package leetcodeblind751.array;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer,Integer> resultNum=new HashMap();
    for(int i=0;i<nums.length;i++){
      if(resultNum.containsKey(nums[i])){
        return new int[]{resultNum.get(nums[i]),i};
      }
      resultNum.put(target-nums[i],i);
    }
    return null;
  }
  public static void main(String args[]){
    TwoSum twoSumObject=new TwoSum();
    for(int n:twoSumObject.twoSum(new int[] { 2, 7, 11, 15 },9)){
      System.out.print(n);
    }
    System.out.println();
    for(int n:twoSumObject.twoSum(new int[] { 3,2,4 },6)){
      System.out.print(n);
    }
    System.out.println();
    for(int n:twoSumObject.twoSum(new int[] { 3,3 },6)){
      System.out.print(n);
    }
    System.out.println();
  }
}