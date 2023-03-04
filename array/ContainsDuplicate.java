package leetcodeblind751.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> numData=new HashSet<>();
    for(int i=0;i<nums.length;i++){
      if(numData.contains(nums[i])){
        return true;
      }
      numData.add(nums[i]);
    }
    return false;
  }

  public static void main(String args[]){
    ContainsDuplicate containsDuplicateObject=new ContainsDuplicate();
    System.out.println(containsDuplicateObject.containsDuplicate(new int[]{7,1,5,3,6,4,1}));
    System.out.println(containsDuplicateObject.containsDuplicate(new int[]{7,6,4,3,1}));
  }
}
