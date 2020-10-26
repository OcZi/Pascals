function pasc(n) {
    const result = [];
    result[0] = [1];
    result[1] = [1, 1];
    for (let row = 2; row < n; row++) {
        result[row] = [1];
        for (let col = 1; col <= row - 1; col++) {
            result[row][col] = result[row-1][col] + result[row-1][col-1];
            result[row].push(1);
        }
    }
    return result;
}

// Test
let pascal = pasc(10);
// Replace "for in" with basic for loop.
// "for in" is a bad idea for arrays.
// It will always iterate through their properties.
// Used for enumerations.

// for (let p in pascal) {
//     console.log(p);
// }

for (let i = 0; i < pascal.length; i++) {
    let array = pascal[i];
    console.log(array.toString());
}