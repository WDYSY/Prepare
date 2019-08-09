var getSum = require("./a");
var obj = require("./b");

console.log(getSum(5,10));
obj.b();

/* 
以上就是commonJS的实现，可以看到a、b都是模块化的，
commonJS很简单，就用module.exports就好了
*/