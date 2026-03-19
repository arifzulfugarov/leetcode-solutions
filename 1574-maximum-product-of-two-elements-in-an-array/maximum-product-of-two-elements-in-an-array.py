class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        
        swapping = True
        end = len(nums)

        while swapping is True:
            swapping = False

            for i in range(1, end):
                if nums[i-1] > nums[i]:
                    nums[i-1], nums[i] = nums[i], nums[i-1]
                    swapping = True
            end -= 1
        
        return (nums[-1]-1) * (nums[-2]-1)
