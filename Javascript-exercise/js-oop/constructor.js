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

// initilaze object
let questions = [
    new Question("Which is javascript management package application?",{"a":"Node.js","b":"Typsecript","c":"Npm"},"c"),
    new Question("Which is javascript management package application?",{"a":"Node.js","b":"Typsecript","c":"Npm"},"c"),
    new Question("Which is javascript management package application?",{"a":"Node.js","b":"Typsecript","c":"Npm"},"c"),
    new Question("Which is javascript management package application?",{"a":"Node.js","b":"Typsecript","c":"Npm"},"c")
]
// console.log(quest1.questionDescribe);
// console.log(quest1.questionAnswers);
// console.log(quest1.checkAnswer("c"));
// console.log(quest1.checkAnswer("b"));
function Quiz(questions){
    this.questions = questions;
    this.questionIndex = 0;
}
Quiz.prototype.getQuestion = function(){
    return this.questions[this.questionIndex];
}
const quiz = new Quiz(questions);
// console.log(quiz);
// console.log(quiz.getQuestion())
// quiz.questionIndex += 1;
// console.log(quiz.getQuestion())

document.querySelector(".btn-start").addEventListener("click", function(){
        document.querySelector(".quiz_box").classList.add("active");
        // console.log(listQuestion(quiz.getQuestion()));
        listQuestion(quiz.getQuestion(), quiz.questionIndex);
        quiz.questionIndex += 1;
});

function listQuestion(quest, questionIndex){
    questionDescribe = `<span>${questionIndex+1 + "- " + quest.questionDescribe}</span>`;
    let options= ``;

    for(let answer in quest.questionAnswers){
        let classI = quest.questionCorrectAnswer == answer ? "fas fa-check" :   "fas fa-times";
        options += 
                `<div class="option">
                    <span><b>${answer}: </b>${quest.questionAnswers[answer]}</span>
                    <div class="icon"><i class="${classI}"></i></div>
                </div>`;
    }
    document.querySelector(".question_text").innerHTML = questionDescribe;
    document.querySelector(".option_list").innerHTML = options;
}

document.querySelector(".next-btn").addEventListener("click",function(){
    if(questions.length > quiz.questionIndex){
        listQuestion(quiz.getQuestion(), quiz.questionIndex);
        quiz.questionIndex += 1;
    }else{
        alert("Quiz finished!!!")
    }
});