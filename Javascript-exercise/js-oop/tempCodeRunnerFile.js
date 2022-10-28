// Constructor Example
function Question(questionDescribe,questionAnswers,questionCorrectAnswer){
    this.questionDescribe = questionDescribe;
    this.questionAnswers = questionAnswers;
    this.questionCorrectAnswer = questionCorrectAnswer;
    this.checkAnswer = function(answer){
        return answer == this.questionCorrectAnswer
    }
}

// initilaze object
let quest1 = new Question("Which is javascript management package application?",{a:"Node.js",b:"Typsecript",c:"Npm"},"c");
console.log(quest1.questionDescribe);
console.log(quest1.questionAnswers);
console.log(quest1.checkAnswer( c));