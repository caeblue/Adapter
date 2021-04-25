import java.util.ArrayList;

public class Cassett implements AnalogAlbum 
{
    /**
     * Creation of variables to use to move through album
     */
    private ArrayList<String> songs = new ArrayList<String>();
    private int currentIndex = 0;
   
    /**
     * Constructor adds all the songs into the arraylist
     * @param song1
     * @param song2
     * @param song3
     * @param song4
     * @param song5
     */
    public Cassett(String song1, String song2, String song3, String song4, String song5)
    {
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    public String play()
    {
        if(currentIndex < 5)
        {
            String retString = "Playing song " + (currentIndex + 1) + ": " + songs.get(currentIndex);
            currentIndex++;
            return retString;
        }
        else
        {
            return "At the end of the casette, you need to rewind";
          
        }
    }

    public String rewind()
    {
             currentIndex --;
             return "Rewinding to song " + (currentIndex +1);
    }

    public String ffwd()
    {
        if (currentIndex == 4)
        {
            return "Forwarded to the end of the cassett";
        }
        else
        {
            currentIndex ++;
            return "Forwarding to song: " + (currentIndex + 1);
        }
    }

    public String pause()
    {
        return "Pausing";
    }

    public String stopEject()
    {
        return "Stopping cassett and ejecting";
    }

}
