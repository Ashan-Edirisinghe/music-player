import javazoom.jl.player.advanced.AdvancedPlayer;

public class MusicPlayer {
//store song
    private Song currentSong;

    //play music

    private AdvancedPlayer advancedPlayer;



public  MusicPlayer(Song song) {

    }


private void loadsong( Song song){

    currentSong = song;

    if(currentSong != null){
         playsong();
    }

}


private  void playsong(){

}

}
