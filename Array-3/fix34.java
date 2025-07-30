public class fix34 {
   public int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==3) {
                if (nums[i+1]==4 && i<(nums.length-1)) {
                    continue;
                }else if ((i>0 && nums[i-1]==4 && i<(nums.length-1)&&((i>1 && nums[i-2]!=3)))) {
                    int temp=nums[i+1];
                    nums[i+1]=nums[i-1];
                    nums[i-1]=temp;
                    continue;
                }else{
                    int index=-1;
                    boolean flag=true;

                    for (int j = i+1; j < nums.length; j++) {
                        if(nums[j]==4 && flag)
                        {
                            index=j;
                            flag=false;
                        }
                    }

                    if(index > -1){
                        int temp2=nums[i+1];
                        nums[i+1]=nums[index];
                        nums[index]=temp2;
                    }else{
                        for (int j = 0; j < i; j++) {
                            if(nums[j]==4 && flag)
                            {
                                if(j>0 && nums[j-1]!=3)
                                {
                                    index=j;
                                    flag=false;
                                }
                            }
                        }
                        int temp2=nums[i+1];
                        nums[i+1]=nums[index];
                        nums[index]=temp2;
                    }
                }
            }
        }
        return nums;
    }
}
