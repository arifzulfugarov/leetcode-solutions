int removeElement(int* nums, int numsSize, int val) {

    int countElements = 0;

    for (int i = 0; i < numsSize; i++) {
        
        if (nums[i] != val){
            nums[countElements] = nums[i];
            countElements++;
        }
    }

    return countElements;

}