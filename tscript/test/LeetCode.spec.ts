
import { expect } from 'chai';
import threeSome from "../src/IntArray3SumEqualsZero";

describe("3Sum", () => {
    describe("Find unique Tuples in int array [-1,0,1,2,-1,-4], that sum to 0", () => {
        it("Should return 2 tuples", () => {
            let res = threeSome([-1,0,1,2,-1,-4]);
            expect(res.length).to.equal(2);
        });
    })
});

describe("3Sum", () => {
    describe("Find unique Tuples in int array [-1,0,1,2,-1,-4], that sum to 0", () => {
        it("Should return int array [[-1,-1,2],[-1,0,1]]", () => {
            let res = threeSome([-1,0,1,2,-1,-4]);
            expect(res.toString()).to.equal([[-1,-1,2],[-1,0,1]].toString());
        });
    })
});