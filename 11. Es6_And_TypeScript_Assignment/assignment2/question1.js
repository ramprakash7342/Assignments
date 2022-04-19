// 1.	Symbols: Write a class that defines next() method to return next number from Fibonacci 
//     series. The class will have a private attributes ‘previousNo’ & ‘currentNo’.
var GetFibo = /** @class */ (function () {
    function GetFibo() {
        this.previousNo = 0;
        this.currentNo = 1;
        this.count = 0;
    }
    GetFibo.prototype.next = function () {
        if (this.count <= 1) {
            return Symbol(this.count++);
        }
        else {
            var temp = this.currentNo + this.previousNo;
            this.previousNo = this.currentNo;
            this.currentNo = temp;
            return Symbol(temp);
        }
    };
    return GetFibo;
}());
var obj = new GetFibo();
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
