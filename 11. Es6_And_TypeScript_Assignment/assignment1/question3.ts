// Create an ‘Order’ object having data members ‘id’, ‘title’, ‘price’. Add the methods 
//   printOrder() & getPrice(). Now, copy the order object using Object.assign().

let order={
    id:1,
    title:"Food",
    price:200,
    printOrder(){
       console.log( this.id,this.title,this.price);
    },
    getPrice(){
        console.log(this.price);
    }
}


console.log(order.printOrder());