// Objeler bir dict yada json yapısına benzetilebilir
// Key'lerden ve value'lerden oluşur
// Obje içerisinde obje, obje içerisinde dizi, dizi içerisinde obje tanımlamarı yapılabilir

// Example

let userA = {
  "name": "Jake",
  "surname": "Peralta",
  "age": 35,
  "adress": {
    "country": "USA",
    "city": "broklyn",
  }
};
let userB = {
  "name": "Mike",
  "surname": "Ross",
  "age": 27,
  "adress": {
    "country": "USA",
    "city": "NYC",
  }
};

let users = [userA, userB];

console.log(users[0].name);
console.log(users[1]["name"]);
console.log(users[0].adress.city);

// PRACTİCE

let order1 = {
    "order-id": 101,
    "order-date": new Date(2022, 11, 31),
    "payment-type": "credit-card",
    "adress": "Yahya kaptan mah. kocaeli Izmit",
    "products": [
      {
        "product-id": 5,
        "product-name": "iphone 13 pro",
        "url": "https://abc.com/iphone-13-pro",
        "price": 22000
      },
      {
          "product-id": 6,
          "product-name": "iphone 13 pro max",
          "url": "https://abc.com/iphone-13-pro-max",
          "price": 25000
        },
    ],
    "customer":{
      "customer-id": 12,
    },
    "seller" : {
      "firm-id" : 34,
      "firm-name" : "Apple Turkey"
    }
  };
let order2 =   {
    "order-id": 102,
    "order-date": new Date(2022, 11, 30),
    "payment-type": "credit-card",
    "adress": "Yahya kaptan mah. kocaeli Izmit",
    "products": [
      {
          "product-id": 6,
          "product-name": "iphone 13 pro max",
          "url": "https://abc.com/iphone-13-pro-max",
          "price": 25000
        },
    ],
    "customer":{
      "customer-id": 12,
    },
    "seller" : {
      "firm-id" : 34,
      "firm-name" : "Apple Turkey"
    }
  }
  let orders = [order1,order2];

// Her bir siparişin ayrı ayrı kdv dahil ödenen üceritini hesaplamak ( kdv -> 18%)
let total_order_price = 0;
for(let i = 0 ; i < orders.length ; i++){
    let total_price = 0
    for(let x = 0 ; x < orders[i].products.length ; x++){
        total_price += orders[i].products[x].price * 1.18; // Kdv eklemesi
    }
    console.log(orders[i]["order-id"] + " Numaralı Sipariş Tutarı --> " + total_price);
    total_order_price += total_price;
}
console.log("Tüm siparişlerin toplamı -> " + total_order_price);