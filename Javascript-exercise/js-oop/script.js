const ui = new UI();

// initilaze object
let questions = [
    new Question("Which is javascript management package application?",{"a":"Node.js","b":"Typsecript","c":"Npm"},"c"),
    new Question("Which is javascript management package application?",{"a":"Node.js","b":"Typsecript","c":"Npm"},"b"),
    new Question("Which is javascript management package application?",{"a":"Node.js","b":"Typsecript","c":"Npm"},"c"),
    new Question("Which is javascript management package application?",{"a":"Node.js","b":"Typsecript","c":"Npm"},"a")
]
const quiz = new Quiz(questions);

ui.btn_start.addEventListener("click", function(){
        ui.quiz_box.classList.add("active");
        // console.log(listQuestion(quiz.getQuestion()));
        ui.listQuestion(quiz.getQuestion(), quiz.questionIndex);
        ui.showQuestionIndex(quiz.questionIndex + 1, quiz.questions.length);
});

ui.next_btn.addEventListener("click",function(){
    if(questions.length > quiz.questionIndex + 1){
        quiz.questionIndex += 1;
        ui.listQuestion(quiz.getQuestion(), quiz.questionIndex);
        ui.next_btn.classList.remove("show");   
        ui.showQuestionIndex(quiz.questionIndex + 1, quiz.questions.length);
    }else{
        alert("Quiz finished!!!")
    }
});

function optionSelected(option){
    let answer = option.querySelector("span b").textContent[0];
    let quest = quiz.getQuestion();

    if(quest.checkAnswer(answer)){
        option.classList.add("correct");
    }else{
        option.classList.add("incorrect");
    }

    for(let i=0; i < ui.option_list.children.length; i++){
        ui.option_list.children[i].classList.add("disabled");
    }
    ui.next_btn.classList.add("show");
}