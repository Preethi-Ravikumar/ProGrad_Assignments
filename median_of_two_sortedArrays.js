 var findMedianSortedArrays = function(nums1, nums2) {
    var m=nums1.concat(nums2);
    m.sort();
    var ans;
    var l=m.length;
    if(l%2==0){
        var mid=l/2;
        var r=(m[mid-1]+m[mid])/2;
        ans=r;
    }
    else{
        var mid=l/2;
        let x=Math.floor(mid);
        ans=m[x];    
    }
    return ans;
 };
