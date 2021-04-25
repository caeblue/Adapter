import java.util.ArrayList;

public class CD implements DigitalAlbum
{
    private ArrayList<String> songs = new ArrayList<String>();
    private int currentIdex = 0;

    /**
     * Constrcutor to add all the songs to the arraylist
     * @param song1
     * @param song2
     * @param song3
     * @param song4
     * @param song5
     */
    public CD(String song1, String song2, String song3, String song4, String song5)
    {
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    /**
     * Method to play all the songs on the CD
     */
    public String playFromBeginning()
    {
        for(int i=0; i < 5; i++)
        {
            System.out.println( "Playing song " + (currentIdex+1) + ": " + songs.get(currentIdex));
        }
        return "";
    }

    /**
     * For some reason my javadoc doesnt bring all things up?
     * anyways, Method to play the song selected by num
     */
    public String playSong(int num)
    {
        if(num < 5)
        {
        currentIdex = num;
        String retString = "Playing "+ (currentIdex + 1) + ": " + songs.get(currentIdex);
        currentIdex ++;
        return retString;
        }
        else
        {
            return "Not a valid song number";

        }
    }

    /**
     * method to play the next song in the index
     */
    public String nextSong()
    {
        if(currentIdex == 4)
        {
            currentIdex= 0;
        }
        else
        {
            currentIdex++;
        }
        return "playing " + (currentIdex+1) + ": " + songs.get(currentIdex);
    }

    /**
     * mehtod to play the previous song in the index
     */
    public String prevSong()
    {
       if(currentIdex < 6 && currentIdex != 0)
       {
           currentIdex --;
       }
       else
       {
           currentIdex=0;
       }
        return "Skipping back and playing: " + songs.get(currentIdex);
    }
     

    /**
     * method to display a pause in music
     */
    public String pause()
    {
        return "pausing";
    }

    /**
     * method to display stopping the cd
     */
    public String stop()
    {
        return "Stopping CD and ejecting";
    }
}
