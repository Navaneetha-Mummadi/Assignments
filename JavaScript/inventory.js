const productInventory = (function () {
    let stock = 0; 

    return {
        getStock: function () {
            return stock;
        },
        addStock: function (quantity) {
            stock += quantity;
            console.log(`Stock after adding: ${stock}`);
        },
        sell: function (quantity) {
            if (quantity <= stock) {
                stock -= quantity;
                console.log(`Sold ${quantity} items.`);
            } else {
                console.log("Insufficient stock");
            }
        }
    };
})();

productInventory.addStock(10); 
productInventory.sell(3);      
console.log(`Stock remaining: ${productInventory.getStock()}`);


/*PS D:\WIPRO\frontend> node -v
v22.17.1
PS D:\WIPRO\frontend> cd JavaScript
PS D:\WIPRO\frontend\JavaScript> node inventory.js
>> 
Stock after adding: 10
Sold 3 items.
Stock remaining: 7
*/