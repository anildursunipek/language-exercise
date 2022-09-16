let cars = ["bwm", "audi", "mercedes", "honda", "ferrari"];
console.log(cars);

let phones = [
  ["iphone13", 10000, "black"],
  ["iphone14", 20000, "gray"],
];
console.log(phones[0][2]);
console.log(typeof phones);

console.log(phones.toString());
console.log(cars.join("-"));
console.log(cars.join(" "));
console.log(cars.pop() + "\n" + cars);
console.log(cars.push("renault") + "\n" + cars);

// shift-> ilk elemanı siler |  unsihft -> en başa eleman ekler

console.log(phones.concat(cars));

// splice metodu -> hem bir eleman eklemek hem de bir elemanı silmek için kullanılabilir splice(index, kaç adet silinecek?, eklenecek elemanlar)

result = cars.splice(0, 1);
console.log(result); // Silinen elemanları geri dödürür
result = cars.splice(0, 2);
console.log(result); // Silinen elemanları geri dödürür

result = cars.splice(0, 0, "citroen", "mazda", "nissan", "ww");
console.log(result); // Silme işlemi olmadığı için boş küme döndürür
console.log(cars); // 0 indexi seçtiğimiz için eklemeleri başa yapar

result = cars.splice(cars.length, 0, "toyota", "chevrolet"); // cars.lenght ile son indexi parametre olarak giriyoruz ve bu sayede en sone ekleme yapabiliyoruz
console.log(cars);

// Js - Array - Practice

let fruits = ["apple", "pear", "banana", "strawbarry"];
console.log(fruits.length);
console.log(
  "First index -> " +
    fruits[0] +
    " | " +
    "Last index -> " +
    fruits[fruits.length - 1]
);
console.log("Elma dizinin bir elemanı mıdır? -> " + fruits.includes("apple"));
fruits.push("cherry");
console.log(fruits);
result = fruits.splice(fruits.length - 2, 2);
console.log(result);
console.log(fruits);

// Dizi içerisinden alınan bilgi ile öğrencilerin yaşını hesaplama

let students = [
  ["Yiğit", "Bilgi", 2010, [80, 70, 60]],
  ["Ada", "Bilgi", 2012, [80, 80, 90]],
  ["Ahmet", "Turan", 2009, [60, 60, 70]],
];
// yaş hesaplama
for (let i = 0; i < 3; i++) {
  console.log(
    students[i][0] +
      "Adlı öğrencinin yaşı --> " +
      (new Date().getFullYear() - students[i][2])
  );
}

// not ortalaması hesaplama
for (let i = 0; i < 3; i++) {
  total = 0;
  for (let x = 0; x < 3; x++) {
    total += students[i][3][x];
  }
  console.log(students[i][0] + "Adlı öğrencinin not ortalaması --> " + (total/3).toFixed(2));
}
