char* reverseWords(char* s) {
    
int n = strlen(s);
char *out = malloc((size_t)n+1);
// we need also index for our new string so word can be at index 0 first
int k = 0;
int i = n - 1;
int firstWord = 1;

while (i >= 0) {

while (i >= 0 && s[i]==' ') i--;
if (i < 0) break;

//then if we skipped the space we found the word
int end = i;

while (i >= 0 && s[i] != ' ') i--;
int start = i + 1;

if (!firstWord) out[k++] = ' ';
firstWord = 0;

for (int j = start; j <= end; j++) {
    out[k++] = s[j];
}
}

out[k] = '\0';
return out;

}