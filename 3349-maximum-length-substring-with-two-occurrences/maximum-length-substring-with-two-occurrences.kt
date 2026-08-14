class Solution {
    fun maximumLengthSubstring(s: String): Int {
        

        //sliding window?
        //e.g. take b then c then b then b skip one if count[char] > 2 then skip char and start again

        var maxLength = 0
        var left = 0
        val counts = IntArray(26)

        for (right in s.indices) {
            
            val charRight = s[right] - 'a'
            counts[charRight]++

            while (counts[charRight] > 2) {
                val charLeft = s[left] - 'a'
                counts[charLeft]--
                left++
            }


            maxLength = max(maxLength, right - left + 1)
        }

        return maxLength
    }
}