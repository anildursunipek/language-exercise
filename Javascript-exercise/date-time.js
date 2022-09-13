let now = new Date(); // güncel tarih ve saat bilgisi

// Get Methods
console.log(typeof now);
result = now.getDate();
console.log("Day= " + result); // Gün bilgisini return eder
result = now.getDay();
console.log("Haftanın hangi günü?= " + result); // 0 - pazar | 1 - pazartesi | 2- salı |  3- çarşamba | ......  |6 - cumartesi
result = now.getFullYear();
console.log("Yıl= " + result);
result = now.getHours();
console.log("Saat= " + result);
result = now.getTime();
console.log("Ms türünden saat bilgisi= " + result);

// Set Methods
result = now.setFullYear(2033);
result = now.setDate(11);
result = now.setMonth(7); // Dızı ındex'leri gibi 0 ocak 1 şubat şeklinde başlar

result = now;
console.log("Set edilmiş date= " + result);

// Yaş hesaplama
let birthday = new Date(1999,7,11);

age = new Date() - birthday;
console.log(age);

// age değer olarak milisecond türünde döndürülür. Bunu operatorler ile yıla çevirebiliriz
let milisecond = age;
let second = age / 1000;
let minute = second / 60;
let hour = minute / 60;
let day = hour / 24;
let year = day / 365;

console.log(year);
console.log("Yaşınız= " + Math.round(year));