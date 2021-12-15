


function fibonacci (num: number): number {
    if(num <= 2) {
        return 1;
    }
    return fibonacci(num -1) + fibonacci(num -2);
}

console.log("Fibonacci index is " + fibonacci(10));

let sum = 0;
for(let i = 0; i < 10; i++){
    sum += fibonacci(i)
}
console.log("Sum the number of fibonacci is " + sum);

// const a = 1;
// console.log(a);