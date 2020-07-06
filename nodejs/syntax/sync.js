var fs = require('fs');

//readFilesync<
/* 
console.log('A');
var result = fs.readFileSync('./sample.txt','utf-8');
console.log(result);
console.log('C');
*/

console.log('A');
fs.readFile('./sample.txt','utf-8',function(err, result){ // 리턴값을 갖지 않는다. , 비동기식
    console.log(result); // callback
});
console.log('C');