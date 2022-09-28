/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
 const removeElement = (nums, val) => {
	let rmCnt = 0;
	for(let i = 0; i+rmCnt < nums.length; i++) {
		nums[i] = nums[i+rmCnt];
		rmCnt += nums[i] == val ? 1 : 0;
		if (nums[i] == val) i--;
	}
	return (nums.length - rmCnt);
};

const res = removeElement([0,7,7,3,4,5,6,7,7,7], 7);
console.log(res);
