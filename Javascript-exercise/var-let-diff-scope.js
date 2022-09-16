var name = "Anıl"; // Global Scope

function print() {
  var name = "Mike"; // Function Scope
  console.log(name);
}

print(); // -> Mike
console.log(name); // -> Anıl
// Function içerisinden global scope'a erişilebilir ancak function içerisindeki değişiklikler global scope'u etkilemez

// Let ile tanımlama
let age = 25;

if (true) {
  let age = 32;
  console.log(age);
}
console.log(age);

// Var ile tanımlama
var weight = 82;
if (true) {
  var weight = 72;
  console.log(weight);
}
console.log(weight);

// Let ile yapılan tanımlamalar global scope'u etkilemez ancak var ile yapılan tanımlamalar global scope'u etkiler
// Çoğu programlama dilinde block içerisindeki tanımlamalar global'i etkilemediği için let kullanımı daha sıktır
