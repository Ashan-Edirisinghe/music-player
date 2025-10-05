import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;


public class MPGUI extends JFrame {

 public MPGUI() {
     super("Music Player");

     setSize(400, 300);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLocationRelativeTo(null);

     setLayout(null);

    GUIcomponents();
 }
private void GUIcomponents (){

     addToolbar();

        JLabel songImage = new JLabel(loadimage("src/assets/record.png"));
        songImage.setBounds(0,50,getWidth()-20,225);
        add(songImage);

        JLabel songTitle = new JLabel(" song name");
        songTitle.setBounds(0,285,getWidth()-10,30);
        songTitle.setFont(new Font("Dialog", Font.BOLD, 24));
        songTitle.setBackground(Color.BLACK);
        songTitle.setHorizontalAlignment(SwingConstants.CENTER);
        add(songTitle);


        JLabel artistName = new JLabel(" artist name");
        artistName.setBounds(0,315,getWidth()-10,30);
        artistName.setFont(new Font("Dialog", Font.PLAIN, 18));
        artistName.setBackground(Color.BLACK);
        artistName.setHorizontalAlignment(SwingConstants.CENTER);
        add(artistName);

        JSlider songProgress = new JSlider();
        songProgress.setBounds(getWidth()/2 - 300/2,365,300,40);
        songProgress.setBackground(null);
        add(songProgress);

       addPlaybackBtns();


}

private void addToolbar(){

     JToolBar toolbar = new JToolBar();
     toolbar.setBounds(0,0,100,20);
     toolbar.setFloatable(false);

     JMenuBar menuBar = new JMenuBar();
     toolbar.add(menuBar);

     JMenu  songMenu = new JMenu("song");
     menuBar.add(songMenu);

     JMenuItem addSongItem = new JMenuItem("Add song");
     songMenu.add(addSongItem);

     JMenu playlist = new JMenu("Playlist");
     menuBar.add(playlist);

     JMenuItem createPlaylist= new JMenuItem("Create Playlist");
     playlist.add(createPlaylist);

     JMenuItem viewPlaylist= new JMenuItem("View Playlist");
     playlist.add(viewPlaylist);

      add(toolbar);

}

private void addPlaybackBtns(){
  JPanel  playbackBtns = new JPanel();
    playbackBtns.setBounds(0, 435, getWidth() - 10, 80);
    playbackBtns.setBackground(null);

    // previous button
    JButton prevButton = new JButton(loadimage("src/assets/previous.png"));
    prevButton.setBorderPainted(false);
    prevButton.setBackground(null);

    playbackBtns.add(prevButton);

    //play button

    JButton playButton = new JButton(loadimage("src/assets/play.png"));
    playButton.setBorderPainted(false);
    playButton.setBackground(null);

    playbackBtns.add(playButton);

     // pause button
    JButton pauseButton = new JButton(loadimage("src/assets/pause.png"));
    pauseButton.setBorderPainted(false);
    pauseButton.setBackground(null);
    pauseButton.setVisible(false);

    playbackBtns.add(pauseButton);

        // next button

    JButton nextButton = new JButton(loadimage("src/assets/next.png"));
    nextButton.setBorderPainted(false);
    nextButton.setBackground(null);

    playbackBtns.add(nextButton);

    add(playbackBtns);






}



private  ImageIcon loadimage(String imagepath) {
    try {
        BufferedImage image = ImageIO.read(new File(imagepath));
        return new ImageIcon(image);

    } catch (Exception e) {
        e.printStackTrace();
    }

    return null;

}

}
