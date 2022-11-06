// Meta Bilgiler Bu dosyada tutuluyor
class Music{
    constructor(title, singer, img_path, file_path){
        this.title = title;
        this.singer = singer;
        this.img_path = img_path;
        this.file_path = file_path;
    }

    getName(){
        return this.singer + " - " + this.title;
    }
}

const musicList = [
    new Music("Boşver","Nilüfer","1.jpeg","1.mp3"),
    new Music("Bu da Geçer mi Sevgilim","Yalın","2.jpeg","2.mp3"),
    new Music("Aramızda Uçurumlar","Suat Suna","3.jpeg","3.mp3")
]