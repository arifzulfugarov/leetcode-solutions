class Solution {
    fun numberOfSpecialChars(word: String): Int {
        

        val uniqueChars = word.toSet()

        return uniqueChars.count {char -> char.isLowerCase() && uniqueChars.contains(char.uppercaseChar())}
    }
}