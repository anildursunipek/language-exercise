const ui = new UI();

// initilaze object
let questions = [
    new Question("Which is javascript management package application?",{"a":"Node.js","b":"Typsecript","c":"Npm","d": "Angular"},"c"),
    new Question("Which is javascript management package application?",{"a":"Node.js","b":"Typsecript","c":"Npm","d": "Angular"},"b"),
    new Question("Which is javascript management package application?",{"a":"Node.js","b":"Typsecript","c":"Npm","d": "Angular"},"c"),
    new Question("Which is javascript management package application?",{"a":"Node.js","b":"Typsecript","c":"Npm","d": "Angular"},"a")
]

const quiz = new Quiz(questions);
const responseTime = 10;

ui.btn_start.addEventListener("click", function(){
        ui.quiz_box.classList.add("active");
        ui.timer.style.width = "11rem";
        ui.time_second.textContent = `${responseTime}`;
        startTimer(responseTime);
        startTimerLine(responseTime);
        // console.log(listQuestion(quiz.getQuestion()));
        ui.listQuestion(quiz.getQuestion(), quiz.questionIndex);
        ui.showQuestionIndex(quiz.questionIndex + 1, quiz.questions.length);
});

ui.next_btn.addEventListener("click",function(){
    if(questions.length > quiz.questionIndex + 1){
        ui.timer.style.backgroundColor = "#FFD33D";
        ui.timer.style.width = "11rem";
        ui.timer.style.color = "#000000";
        ui.time_second.textContent = `${responseTime}`;
        quiz.questionIndex += 1;
        ui.listQuestion(quiz.getQuestion(), quiz.questionIndex);
        ui.next_btn.classList.remove("show");   
        ui.showQuestionIndex(quiz.questionIndex + 1, quiz.questions.length);
        clearInterval(counter);
        clearInterval(counterLine);
        startTimer(responseTime);
        startTimerLine(responseTime);
    }else{
        ui.timer.style.backgroundColor = "#FFD33D";
        ui.timer.style.color = "#000000";
        ui.timer.style.width = "15rem";
        clearInterval(counter);
        clearInterval(counterLine);
        ui.show_Score(quiz.trueAnswers,quiz.questions.length)
        ui.score_box.classList.add("active");
        ui.quiz_box.classList.remove("active");
    }
});

function optionSelected(option){
    let answer = option.querySelector("span b").textContent[0];
    let quest = quiz.getQuestion();
    clearInterval(counter);
    clearInterval(counterLine);

    if(quest.checkAnswer(answer)){
        quiz.trueAnswers += 1;
        option.classList.add("correct");
    }else{
        correctAnswer = quiz.getQuestion().questionCorrectAnswer;
        for(let i=0; i < ui.option_list.children.length; i++){
            if(ui.option_list.children[i].querySelector("span").textContent[0] == correctAnswer){
                ui.option_list.children[i].classList.add("correct");
                ui.option_list.children[i].classList.add("disabled");
            }else{
                ui.option_list.children[i].classList.add("disabled");
            }
        }
        option.classList.add("incorrect");
    }


    for(let i=0; i < ui.option_list.children.length; i++){
        ui.option_list.children[i].classList.add("disabled");
    }
    ui.next_btn.classList.add("show");
}

ui.finish_btn.addEventListener("click", function(){
    window.location.reload(); // Bu fonksiyon sayfa yenilenmesini ve start aşamasına dönülmesini sağlar
})
ui.replay_btn.addEventListener("click",function(){
    quiz.trueAnswers = 0;
    quiz.questionIndex = 0;
    ui.btn_start.click();
    ui.score_box.classList.remove("active");
    ui.next_btn.classList.remove("show");
})

let counter;

function startTimer(time){
    counter = setInterval(timer,1000);
    // setInterval'ın referans değerini geri döndürür ve counter içine aktarır. Counter referansı illeride ınterval'ı temizlemek için kullanılır.
    function timer(){
        ui.time_second.textContent = time;
        time--;
        if(time < 0){
            clearInterval(counter);
            ui.timer.style.backgroundColor = "rgb(242, 110, 110)";
            ui.timer.style.color = "#fff";
            ui.timer.style.width = "15rem";
            ui.time_second.textContent = "Time's Up!";
            correctAnswer = quiz.getQuestion().questionCorrectAnswer;
            for(let i=0; i < ui.option_list.children.length; i++){
                if(ui.option_list.children[i].querySelector("span").textContent[0] == correctAnswer){
                    ui.option_list.children[i].classList.add("correct");
                    ui.option_list.children[i].classList.add("disabled");
                }else{
                    ui.option_list.children[i].classList.add("disabled");
                }
            }
            ui.next_btn.classList.add("show");
        }
    }
}
let counterLine;

function startTimerLine(responseTime){
    let lineWidth = 0;
    let totalLineWidth = 550;
    counterLine = setInterval(timerLine, 100)
    
    function timerLine(){
        lineWidth += totalLineWidth / ((responseTime + 1) * 10);
        // console.log(lineWidth);
        ui.timer_line.style.width = lineWidth+"px";

        if(lineWidth > totalLineWidth - 1){
            clearInterval(counterLine);
        }
    }
}