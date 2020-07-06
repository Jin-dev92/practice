/*
function a() {
    console.log('A');   
}
*/

var a= function () {
    console.log('a');
}

function slowfunc(callback) {  // 오래 걸리는 함수
    callback();
}


slowfunc(a);