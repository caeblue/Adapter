import java.util.ArrayList;

public class CD implements DigitalAlbum
{
    private ArrayList<String> songs = new ArrayList<String>();
    private int currentIdex = 0;

    public CD(String song1, String song2, String song3, String song4, String song5)
    {
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    public String playFromBeginning()
    {
        for(int i=0; i < 5; i++)
        {
            System.out.println( "Playing song " + currentIdex + songs.get(currentIdex));
        }
        return "";
    }

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
        return "playing " + songs.get(currentIdex);
    }

    public String prevSong()
    {
       if(currentIdex < 6 && currentIdex != 0)
       {
           currentIdex --;
       }
       else
       {
           currentIdex = 1;
       }
        return "Skipping back and playing: " + songs.get(currentIdex);
    }

    public String stop()
    {
        return "pausing";
    }

    public String pause()
    {
        return "Stopping CD and ejecting";
    }
}
