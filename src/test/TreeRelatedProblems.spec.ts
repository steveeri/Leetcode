import { expect } from 'chai';

import TreeNode from '../TreeNode';
import lowestCommonAncestor from '../TreeLowestCommonAncestor';

var tree1: TreeNode;

beforeAll(() => {
    tree1 =
        new TreeNode(3, 
            new TreeNode(5, 
                new TreeNode(6,null, null), 
                new TreeNode(2, 
                    new TreeNode(7,null, null), 
                    new TreeNode(4,null, null))), 
            new TreeNode(1, 
                new TreeNode(0,null, null), 
                new TreeNode(8,null, null))
            );
});

describe("Lowest Common Ancestor", () => {
    describe("Given tree input [3,5,1,6,2,0,8,null,null,7,4], and p = 5 and q = 1, function should return node #3", () => {
        it("Should return node #3", () => {
            const res = lowestCommonAncestor(tree1, tree1?.left, tree1?.right);
            expect(res).to.be.not.null;
            expect(res).to.equal(tree1);
        });
    })

    describe("Given tree input [3,5,1,6,2,0,8,null,null,7,4], and p = 5 and q = 4, function should return node #5", () => {
        it("Should return node ", () => {
            const res = lowestCommonAncestor(tree1, tree1?.left, tree1?.left?.right?.right);
            expect(res).to.be.not.null;
            expect(res).to.equal(tree1.left);
        });
    })    
});
