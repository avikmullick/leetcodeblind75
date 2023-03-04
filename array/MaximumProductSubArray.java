package leetcodeblind751.array;

public class MaximumProductSubArray {

  public int maxProductSubArray(int[] nums){
    int maxResult=nums[0];
    int product=1;
    for(int i=0;i<nums.length;i++){
      product=product*nums[i];
      if(product>maxResult){
        maxResult=product;
      }
      if(product<=0){
        product=1;
      }
    }
    return maxResult;
  }
  public static void main(String args[]){
    MaximumProductSubArray maximumProductSubArray=new MaximumProductSubArray();
    System.out.println(maximumProductSubArray.maxProductSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    System.out.println(maximumProductSubArray.maxProductSubArray(new int[]{1}));
    System.out.println(maximumProductSubArray.maxProductSubArray(new int[]{5,4,-1,7,8}));
    System.out.println(maximumProductSubArray.maxProductSubArray(new int[]{2,3,-2,4}));
    System.out.println(maximumProductSubArray.maxProductSubArray(new int[]{-2,0,-1}));
    System.out.println(maximumProductSubArray.maxProductSubArray(new int[]{-3,-1,-1}));
    System.out.println(maximumProductSubArray.maxProductSubArray(new int[]{0,2}));
  }
}
