class Solution {
    fun evalRPN(tokens: Array<String>): Int {
         
         val stack = ArrayDeque<Int>()

         for (str in tokens) {

            if (str.equals("+")) {
                stack.addLast(stack.removeLast() + stack.removeLast())
            } else if (str.equals("-")) {
                val second = stack.removeLast()
                val first = stack.removeLast()
                stack.addLast(first-second)
            } else if (str.equals("*")){
                stack.addLast(stack.removeLast() * stack.removeLast())
            } else if (str.equals("/")){
                val second = stack.removeLast()
                val first = stack.removeLast()
                stack.addLast(first / second)
            } else {
                stack.addLast(str.toInt())
            }
         }
        
        return stack.last()
        
    }
}