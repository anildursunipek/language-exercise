// Number
let num = 15;
console.log(num);
console.log(typeof num);

// String
let str = "Anıl";
let empty = ""; // String değer döndürür

console.log(str);
console.log(empty);
console.log(typeof str);
console.log(typeof empty);

// undefined
let blank;
console.log(blank);
console.log(typeof blank);

// number to string
let number = 15;
console.log(typeof number.toString());

// string to number
let str2 = "100";
console.log(typeof Number(str2));

// boolean
console.log("------------------------");
let bool = true;
let bool2 = false;
console.log(bool);
console.log(bool2);

let bool3 = number < 20; // Bu tarz koşullar ile true false değerler döndürülebilir
console.log(bool3);

// === > hem değer hem tip kontrolü yapar
console.log("------------------------");
let bool4 = 3 === "3"; // -> false
let bool5 = 3 === 3; // -> true
console.log(bool4);
console.log(bool5);

// if-else block
console.log("------------------------");
let username = "anıldursun";
let password = "1234";

if (username == "anıldursun") {
  if (password == "1234") {
    console.log("Başarı ile giriş yapıldı");
  } else {
    console.log("Parola yanlış girildi");
  }
} else {
  console.log("Kullanıcı adı yanlış girildi");
}

// if else basic examples
// Example - 1
num = 16;
if (num > 10 && num < 50) {
  console.log("Sayı 10 ile 50 arasında");
} else {
  console.log("Sayı 10 ile 50 arasında değil");
}
// Example - 2
if (num > 0 && num % 2 == 1) {
  console.log("Pozitif tek sayıdır");
} else {
  console.log("Pozitif tek sayı değildir!!!");
}
// Example - 3
x = Math.floor(Math.random() * 100);
y = Math.floor(Math.random() * 100);
z = Math.floor(Math.random() * 100);
console.log("x= " + x + " y= " + y + " z= " + z);
if (x > y && x > z) {
  console.log("X en büyük sayıdır");
} else if (y > z && y > x) {
  console.log("Y en büyük sayıdır");
} else if (z > x && z > y) {
  console.log("Z en büyük sayıdır");
} else {
  console.log("Sayılar eşittir");
}

// Example - 4
vize_1 = Math.floor(Math.random() * 100);
vize_2 = Math.floor(Math.random() * 100);
final = Math.floor(Math.random() * 100);

ortalama = ((vize_1 + vize_2) / 2) * 0.4 + final * 0.6;
console.log("Ortalamanız: " + ortalama + "\nFinal Notunuz: " + final);
if (ortalama >= 50 && final >= 50) {
  console.log("Geçtiniz");
} else {
  console.log("Kaldınız");
}
