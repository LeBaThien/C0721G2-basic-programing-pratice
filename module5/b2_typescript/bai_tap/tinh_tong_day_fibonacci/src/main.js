function fibonacci(num) {
    if (num <= 2) {
        return 1;
    }
    return fibonacci(num - 1) + fibonacci(num - 2);
}
console.log("Fibonacci index is " + fibonacci(10));
var sum = 0;
for (var i = 0; i < 10; i++) {
    sum += fibonacci(i);
}
console.log("Sum the number of fibonacci is " + sum);
var a = 1;
console.log(a);
