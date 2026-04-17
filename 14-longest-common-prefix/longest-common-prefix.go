func longestCommonPrefix(strs []string) string {
    

    // I am thinking of checking of each char of each word and if they are 
    // the same add them into string and return

    if len(strs) == 0 {
        return ""
    }
    firstWord := strs[0]

    //string(strs[0][0])

    for i:=0; i < len(firstWord); i++{
        char := firstWord[i]


        for j:=1; j < len(strs); j++ {

            if i >= len(strs[j]) || strs[j][i] != char {
                return firstWord[:i]
            }
        }
    } 

    return firstWord


}