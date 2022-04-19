// Write a class Account with attributes id, name, balance. Add two sub classes SavingAccount 
// & CurrentAccount having specific attribute interest & cash_credit respectively. Create multiple
//  saving & current account objects. Write a functionality to find out total balance in the bank.
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Account = /** @class */ (function () {
    function Account(id, name, balance) {
        this.id = id;
        this.name = name;
    }
    Account.balance = 0;
    return Account;
}());
;
var SavingAccount = /** @class */ (function (_super) {
    __extends(SavingAccount, _super);
    function SavingAccount() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    SavingAccount.prototype.cash_credit = function (amount) {
        Account.balance = Account.balance + amount;
    };
    return SavingAccount;
}(Account));
// class CurrentAccount{
// }
var sa = new SavingAccount(1, "ram", 2345);
sa.cash_credit(200);
sa.cash_credit(400);
console.log(Account.balance);
