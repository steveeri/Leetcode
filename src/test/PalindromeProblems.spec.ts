import { expect } from 'chai';
import isPalindrome from '../IsNumberPalindrome';
import longestPalindrome from '../LongestPalindrome';

beforeAll(() => {
});

describe("Is Number Palindrome", () => {

    describe("Given input number 121, function should return 'True'", () => {
        it("Should evaluate 'True'", () => {
            const res = isPalindrome(121);
            expect(res).to.be.true;
        });
    })    
    
    describe("Given input number -121, function should return 'False'", () => {
        it("Should evaluate 'False'", () => {
            const res = isPalindrome(-121);
            expect(res).to.be.false;
        });
    })

    describe("Given input number 10, function should return 'False'", () => {
        it("Should evaluate 'False'", () => {
            const res = isPalindrome(10);
            expect(res).to.be.false;
        });
    })
 
});

describe("Find Longest Palindrome in String", () => {

    describe("Given input string 'babad', function should return 'bab'", () => {
        it("Should evaluate 'True'", () => {
            const res = longestPalindrome("babad");
            expect(res).to.be.equal("bab");
        });
    })

    describe("Given input string 'cbbd', function should return 'bb'", () => {
        it("Should evaluate 'True'", () => {
            const res = longestPalindrome("cbbd");
            expect(res).to.be.equal("bb");
        });
    })
    
    describe("Given input string 'racecar', function should return 'racecar'", () => {
        it("Should evaluate 'True'", () => {
            const res = longestPalindrome("racecar");
            expect(res).to.be.equal("racecar");
        });
    })   

    describe("Given input string 'racecarracecar', function should return 'racecarracecar'", () => {
        it("Should evaluate 'True'", () => {
            const res = longestPalindrome("racecarracecar");
            expect(res).to.be.equal("racecarracecar");
        });
    }) 
 
});
