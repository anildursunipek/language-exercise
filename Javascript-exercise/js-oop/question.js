// Constructor Example
function Question(questionDescribe,questionAnswers,questionCorrectAnswer){
    this.questionDescribe = questionDescribe;
    this.questionAnswers = questionAnswers;
    this.questionCorrectAnswer = questionCorrectAnswer;
    // Her soru tanımlandığında fonksiyonun tekrar etmemesi için foksiyon tanımlamalarını prototype içerisinde yapabiliriz
    // this.checkAnswer = function(answer){
    //     return answer == this.questionCorrectAnswer
    // }
}
// Prototype içerisinde yapılan tanımlama ihtiyaç halinde çağırıldığında kullanılır ve bellekte gereksiz yer kaplamaz
// Her soru için tekrar tekrar fonksiyon oluşması önlendi !!!
Question.prototype.checkAnswer = function(answer){
    return answer == this.questionCorrectAnswer;
}