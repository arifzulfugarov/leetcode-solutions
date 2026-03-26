class Solution:
    def decodeString(self, s: str) -> str:
        
        def dfs(i):

            result = ""

            while i < len(s) and s[i]!=']':

                if s[i].isalpha():
                    result += s[i]
                    i += 1

                elif s[i].isdigit():
                    num = 0
                    while i < len(s) and s[i].isdigit():

                        num = num * 10 + int(s[i])
                        i += 1
                    
                    i += 1
                    inner, i = dfs(i)
                    i += 1

                    result += inner * num

            return result, i
        
        result, _ = dfs(0)
        return result



        