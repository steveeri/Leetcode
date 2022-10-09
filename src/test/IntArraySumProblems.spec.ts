
import { expect } from 'chai';
import threeSome from "../../src/IntArray3SumEqualsZero";
import fourSum from '../../src/IntArray4SumEqualsTarget';

describe("3Sum", () => {
    describe("Find unique Tuples in int array [-1,0,1,2,-1,-4], that sum to 0", () => {
        it("Should return 2 tuples", () => {
            let res = threeSome([-1,0,1,2,-1,-4]);
            expect(res.length).to.equal(2);
        });
    })

    describe("Find unique Tuples in int array [-1,0,1,2,-1,-4], that sum to 0", () => {
        it("Should return int array [[-1,-1,2],[-1,0,1]]", () => {
            let res = threeSome([-1,0,1,2,-1,-4]);
            expect(res.toString()).to.equal([[-1,-1,2],[-1,0,1]].toString());
        });
    })
});

describe("4Sum", () => {
    describe("Find unique unique quadruplets in int array [1,0,-1,0,-2,2], that sum to 0", () => {
        it("Should return 3 quadruplets", () => {
            let res = fourSum([1,0,-1,0,-2,2], 0);
            expect(res.length).to.equal(3);
        });
    })

    describe("Find unique unique quadruplets in int array [1,0,-1,0,-2,2], that sum to 0", () => {
        it("Should return int array [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]", () => {
            let res = fourSum([1,0,-1,0,-2,2], 0);
            expect(res.toString()).to.equal([[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]].toString());
        });
    })
    

    describe("Find unique unique quadruplets in int array [2,2,2,2,2], that sum to 8", () => {
        it("Should return 1 quadruplet", () => {
            let res = fourSum([2,2,2,2,2], 8);
            expect(res.length).to.equal(1);
        });
    })

    describe("Find unique unique quadruplets in int array [2,2,2,2,2], that sum to 8", () => {
        it("Should return int array [[2,2,2,2]]", () => {
            let res = fourSum([2,2,2,2,2], 8);
            expect(res.toString()).to.equal([[2,2,2,2]].toString());
        });
    })
    
    
    describe("Find unique unique quadruplets in int array [-3,-1,0,2,4,5], that sum to 1", () => {
        it("Should return int array [[-3,-1,0,5]]", () => {
            let res = fourSum([-3,-1,0,2,4,5], 1);
            expect(res.toString()).to.equal([[-3,-1,0,5]].toString());
        });
    })
    
    
    describe("Find unique unique quadruplets in int array [0,1,5,0,1,5,5,-4], that sum to 11", () => {
        it("Should return int array [[-4,5,5,5],[0,1,5,5]]", () => {
            let res = fourSum([0,1,5,0,1,5,5,-4], 11);
            expect(res.toString()).to.equal([[-4,5,5,5],[0,1,5,5]].toString());
        });
    })

});