/*
Given a list, modify it so that each index stores the product of all elements in the list except the
element at the index itself.
 */

function calculateProductArray(nums) {
    let product = 1;
    const result = [];

    for (let i = 0; i < nums.length; i++) {
        result[i] = product;
        product *= nums[i];
    }

    product = 1;

    for (let i = nums.length - 1; i >= 0; i--) {
        result[i] *= product;
        product *= nums[i];
    }

    return result;
}

const nums = [4, 2, 1, 5, 0];
const productArray = calculateProductArray(nums);
console.log(productArray);