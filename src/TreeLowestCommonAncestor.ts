"use strict";

import { number } from "yargs";
import TreeNode from "./TreeNode";

const lowestCommonAncestor = (root: TreeNode | null, p: TreeNode | null, q: TreeNode | null): TreeNode | null => {

	if (!root || (!p && !q)) return null; // guard condition.

	const foundP = root === p;
	const foundQ = root === q;
	if (foundP && !q) return root;
	if (foundQ && !p) return root;

	const resL = lowestCommonAncestor(root.left,  (!!p && !foundP) ? p : null, (!!q && !foundQ) ? q : null);
	if ((foundP || foundQ) && !!resL) return root;
	const resR = lowestCommonAncestor(root.right, (!!p && !foundP) ? p : null, (!!q && !foundQ) ? q : null);
	if ((foundP || foundQ) && !!resR) return root;

	if (!!resL && !!resR) return root;     // This branch-root is the LCA.
	if (!!resL) return resL;               // Must be left
	if (!!resR) return resR;               // Must be right
	if (foundP || foundQ) return root;     // must be the current node then

	return null;     // dead end found.
};



export default lowestCommonAncestor;

/// TESTS 

// const res: TreeNode | null = lowestCommonAncestor(null, null, null);
// console.log(res);


/* 

236. Lowest Common Ancestor of a Binary Tree - Medium

Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two 
nodes p and q as the lowest node in T that has both p and q as descendants 
(where we allow a node to be a descendant of itself).”

Example 1:
Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
Output: 3
Explanation: The LCA of nodes 5 and 1 is 3.

Example 2:
Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
Output: 5
Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.

Example 3:
Input: root = [1,2], p = 1, q = 2
Output: 1

Constraints:
The number of nodes in the tree is in the range [2, 105].
-10^9 <= Node.val <= 10^9
All Node.val are unique.
p != q
p and q will exist in the tree.

*/