var searchInsert = function(nums, target) {
    var l=nums.length;
    var r;
    var f=0;
    for(let i=0;i<l;i++){
        if(nums[i]==target){
            r=i;
            f=1;
        }
    }
    if(f==0){
        nums.push(target);
        nums.sort(function(a, b){return a-b});
        for(let i=0;i<l+1;i++){
            if(nums[i]==target){
                r=i;
            }
        }
    }
    return r;
};
