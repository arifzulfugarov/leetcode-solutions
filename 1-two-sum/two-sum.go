func twoSum(nums []int, target int) []int {
    

    //if there is nums[j] such that if we do target - nums[i] = nums[j] then we return i, j

    seen := make(map[int]int)

    for i, num := range nums{
        complement := target - num

        if index, found := seen[complement]; found{
            return[]int{index, i}
        }

        seen[num] = i
    }

    return nil

    
}