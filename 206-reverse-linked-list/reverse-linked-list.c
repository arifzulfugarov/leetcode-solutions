/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    

   struct ListNode *reversed = NULL;
   struct ListNode *curr = head;

    while (curr != NULL) {

        struct ListNode *next = curr->next;
        curr->next = reversed;
        reversed = curr;
        curr = next;
    }

return reversed;
    
}