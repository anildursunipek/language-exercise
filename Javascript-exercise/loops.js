// Rastgele dizi oluşturma
let array = [];
for(let i = 0 ; i < 10 ; i++){
    array[i] = Math.floor(Math.random() * 100) + 1;
}
console.log("Oluşturulan dizi = " + array);

// Javascript'de for döngüsü için farklı kullanımlar mevcuttur
for(let num in array){
    console.log(num); // Bu şekilde index numaraları yazdırılır
}

// Kullanım 1 -> Dizinin index numaralarını kullanarak for döngüsü oluşturmak
for(let num of array){
    console.log(num); // Bu şekilde dizinin elemanları sırası ile yazdırılır
}

// Diziler ile kullanabildiğimiz gibi object'ler ile de kullanabiliriz
// obje tanımlama
let user = {
    "name" : "Anıl",
    "surname" : "Ipek",
    "ogr_id" : "1234",
    "age" : 23
}
// Object'lerdeki key ve value değerlerine döngü ile erişebiliriz
for(let key in user){
    console.log(key);  // Key'leri çıktı olarak veriri
}
for(let key in user){
    console.log(user[key]); // Value'leri çıktı olarak verir 
}

 