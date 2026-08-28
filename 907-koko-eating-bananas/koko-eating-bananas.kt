class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
    
        var left = 1
        var right = piles.maxOrNull() ?: 0
        var ans = right

        while (left<=right) {
            
            val midValue = left + (right - left)/2
            if (canFinish(piles, h, midValue)){
                ans = midValue
                right = midValue - 1
            } else {
                left = midValue + 1
            }

        }

        return ans

    }

    fun canFinish(piles: IntArray, h: Int, k: Int): Boolean{

        var hours: Long = 0L
        for (pile in piles){
           hours += pile.toLong()/k
           if (pile.toLong() % k != 0L) hours++;
        }

        return h >= hours
    }
}