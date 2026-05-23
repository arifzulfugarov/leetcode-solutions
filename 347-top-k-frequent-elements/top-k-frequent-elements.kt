class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        

        val countMap = hashMapOf<Int, Int>()

        for (num in nums) {
            if (countMap.containsKey(num)){
                countMap[num] = countMap[num]!! + 1
            } else {
                countMap[num] = 1
            }
        }

        val minHeap = PriorityQueue<Int> { a, b -> countMap[a]!! - countMap[b]!! }
        for (num in countMap.keys) {
            minHeap.add(num)

            if (minHeap.size > k) {
                minHeap.poll()
            }
        }

        return minHeap.toIntArray()
    }
}