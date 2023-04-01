import { expect } from 'chai';
import mergeTwoLists from '../MergeTwoLists';
import ListNode from '../ListNode';

beforeAll(() => {
});

describe("Merge Two Lists Lists", () => {

    describe("Given input lists [1,2,4] & [1,3,4], function should return list [1,1,2,3,4,4]", () => {
        it("Should evaluate 'True'", () => {
            const l1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
            const l2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
            const res = mergeTwoLists(l1, l2);
            expect(res.val).to.be.equal(1);
            expect(res.next.val).to.be.equal(1);
            expect(res.next.next.val).to.be.equal(2);
            expect(res.next.next.next.val).to.be.equal(3);
            expect(res.next.next.next.next.val).to.be.equal(4);
            expect(res.next.next.next.next.next.val).to.be.equal(4);
        });
    })

});
