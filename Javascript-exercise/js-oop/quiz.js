function Quiz(questions){
    this.questions = questions;
    this.questionIndex = 0;
    this.trueAnswers = 0;
}

Quiz.prototype.getQuestion = function(){
    return this.questions[this.questionIndex];
}