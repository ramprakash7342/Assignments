var names = ['Tom', 'Ivan', 'Jerry'];
var arrayOfObject = [];
var getNewArray = function (arr) {
    for (var i = 0; i < arr.length; i++)
        arrayOfObject.push({ name: arr[i], length: arr[i].length });
};
getNewArray(names);
console.log(arrayOfObject);
