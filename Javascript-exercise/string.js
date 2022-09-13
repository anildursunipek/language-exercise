// String mesajlar format string ile daha basit bir şekilde yazılabilir
// Backtick -> alt gr + , -> ``
let name = "Anıl";
let city = "Bursa";
let age = 23;

let message = `Benim adım ${name}. ${city}'da yaşıyorum. Emekliliğe ${65-23} yılım kaldı.`;
console.log(message);

// Mesajı daha dinamik hale getirebiliriz.
// Ternary operators
age = 67;
let retire = (65 - age > 0) ? "Emeklilik için " + (65 - age) + "yılınız kaldı" : "Zaten emeklisiniz";
message = `Benim adım ${name}. ${city}'da yaşıyorum.${retire}`;
console.log(message);

// STRING METHODS
let strMethods = "  Komple uygulamalı web geliştirme kursu. ";

let result;
result = strMethods.toUpperCase(); 
result = strMethods.toLowerCase();
result = strMethods.length;
result = strMethods[10];
result = strMethods.slice(0,10);
result = strMethods.slice(-10,-5);
result = strMethods.slice(-10,-5);
result = strMethods.slice(2,7);
// substring -> slice ile aynı işlevdedir
result = strMethods.replace("kursu","eğitimi");
result = strMethods.trim();
result = strMethods.trimEnd();
result = strMethods.trimStart();
result = strMethods.indexOf("uygu");
result = strMethods.trim().split(" ");
result = strMethods.trim().split(" ")[0];
result = strMethods.trim().split(" ").slice(0,3);
result = strMethods.indexOf("eğitimi"); // Eğer içerisinde yoksa -1 değeri döndürür

console.log(result);

// String Example
let url = "https://www.anıldursunipek.com/";
let title = "Komple Web Geliştirme Kursu";
// yöntem - 1
// title = title.split(" ");
// title = title.join("-")
// yöntem - 2 (replaceAll)
title = title.replaceAll(" ","-");

console.log(title);
let newMessage = (url + title).toLowerCase().replaceAll("ı","i");
console.log(newMessage);



