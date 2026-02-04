#define MAX(a,b) ((a) > (b) ? a:b)


int lengthOfLongestSubstring(char* s) {

    
    int n = strlen(s);
    if (n == 0) return 0;

    int counts[128] = {0};

    int left = 0, max_len = 0;

    for(int right = 0; right < n; right++) {

        unsigned char current_char = s[right];
        counts[current_char]++;

        while(counts[current_char]>1) {
            unsigned char left_char = s[left];
            counts[left_char]--;
            left++;
        }

        max_len = MAX(max_len, right-left+1);
    }

return max_len;
        
}