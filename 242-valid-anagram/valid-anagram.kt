class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        
        if (s.length != t.length) return false

        val charCounts = mutableMapOf<Char, Int>()

        for (char in s) {
            charCounts[char] = charCounts.getOrDefault(char, 0) + 1
        }

        for (char in t) {

            if (!charCounts.containsKey(char)){
                return false
            }

            val updatedCount = charCounts[char]!! - 1

            if (updatedCount == 0) {
                charCounts.remove(char)
            } else {
                charCounts[char] = updatedCount
            }

        }

        return charCounts.isEmpty()
        
    }
}