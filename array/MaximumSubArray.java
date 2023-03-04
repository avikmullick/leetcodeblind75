package leetcodeblind751.array;

public class MaximumSubArray {

  public int maxSubArray(int[] nums){
    int maxResult=nums[0];
    int sum=0;
    for(int i=0;i<nums.length;i++){
      sum=sum+nums[i];
      if(sum>maxResult){
        maxResult=sum;
      }
      if(sum<0){
        sum=0;
      }
    }
    return maxResult;
  }
  public static void main(String args[]){
    MaximumSubArray maximumSubArray=new MaximumSubArray();
    System.out.println(maximumSubArray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    System.out.println(maximumSubArray.maxSubArray(new int[]{1}));
    System.out.println(maximumSubArray.maxSubArray(new int[]{5,4,-1,7,8}));
  }
}
