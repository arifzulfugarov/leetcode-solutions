/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int max(int a, int b) {
    return (a > b) ? a : b;
}

int dfsHeight(struct TreeNode* node, int* diameter) {
    if (node == NULL) return 0;

    int lh = dfsHeight(node->left, diameter);
    int rh = dfsHeight(node->right, diameter);

    *diameter = max(*diameter, lh + rh);

    return 1+ max(lh, rh);

}


int diameterOfBinaryTree(struct TreeNode* root) {
    

int diameter = 0;
dfsHeight(root, &diameter);
return diameter;


}