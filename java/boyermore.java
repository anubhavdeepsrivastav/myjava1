public class boyermore {
    public int majorityElement(int[] nums) {
        int count=0;
        int element=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0){
                count+=1;
                element=nums[i];

            }
            elseif(element!=nums[i]){
                count=count-1;
            }
            elseif(element==nums[i])

            {
                count+=1;
            }
            
        }   
    
    return element;
} 
    
}
