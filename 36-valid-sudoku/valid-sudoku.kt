class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        

        val set: HashSet<String> = HashSet()

        for (i in 0 until 9) {
            for (j in 0 until 9) {
                val num = board[i][j]
                if (num != '.'){

                    val inRow = "$num in row $i"
                    val inCol = "$num in col $j"
                    val inBlock = "$num in block ${i / 3}-${j/3}"

                    if (!set.add(inRow) || 
                    !set.add(inCol) ||
                    !set.add(inBlock)) {
                        return false;
                    }
                }

            }
        }

        return true;


    }
}