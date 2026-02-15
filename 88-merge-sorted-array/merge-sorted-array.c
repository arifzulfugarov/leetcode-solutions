void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n) {
    

int right = nums1Size - 1;

while (m > 0 && n > 0){

    if (nums1[m-1] > nums2[n-1]){
        nums1[right] = nums1[m-1];
        m--;
    }else{
        nums1[right] = nums2[n-1];
        n--;
    }

    right--;
    
}

while (n > 0) {
    nums1[right] = nums2[n-1];
    n--;
    right--;
}

}