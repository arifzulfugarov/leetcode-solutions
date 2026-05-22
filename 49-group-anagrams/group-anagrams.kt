class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        

        val anagramMap = HashMap<String, MutableList<String>>()

        for (str in strs) {

            val sortedKey = str.toCharArray().sorted().joinToString("")

            if (!anagramMap.containsKey(sortedKey)){
                anagramMap[sortedKey] = mutableListOf()
            }

            anagramMap[sortedKey]?.add(str)

        }

        return anagramMap.values.toList()
      
    }
}