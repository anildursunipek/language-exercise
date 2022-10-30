function UI(){
    this.btn_start = document.querySelector(".btn-start"),
    this.quiz_box = document.querySelector(".quiz_box"),
    this.next_btn = document.querySelector(".next-btn"),
    this.option_list = document.querySelector(".option_list")
}

UI.prototype.listQuestion = function(quest, questionIndex){
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
    this.option_list.innerHTML = options;

    const opts = this.option_list.querySelectorAll(".option"); // opts -> options

    for(let opt of opts){
        opt.setAttribute("onclick", "optionSelected(this)");
    }
}

UI.prototype.showQuestionIndex = function(indexNumber, totalQuestion){
    let tag = `<span class="badge bg-warning">${indexNumber} / ${totalQuestion}</span>`;
    document.querySelector(".question_index").innerHTML = tag;
}