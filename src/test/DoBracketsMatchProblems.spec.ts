import { expect } from 'chai';
import isValid from './../DoBracketsMatch';

beforeAll(() => {
});

describe("Do Brackets Match", () => {

    describe("Given input (), function should return 'True'", () => {
        it("Should evaluate 'True'", () => {
            const res = isValid('()');
            expect(res).to.be.true;
        });
    })

     describe("Given input '()[]{}', function should return 'True'", () => {
        it("Should evaluate 'True'", () => {
            const res = isValid('()[]{}');
            expect(res).to.be.true;
        });
    })

     describe("Given input '(]', function should return 'False'", () => {
        it("Should evaluate 'True'", () => {
            const res = isValid('(]');
            expect(res).to.be.false;
        });
    })
 
});
