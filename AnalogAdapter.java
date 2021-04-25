public class AnalogAdapter implements AnalogAlbum{
    private DigitalAlbum album;

    /**
     * constructor to set the album to this class variable
     * @param album
     */
    public AnalogAdapter(DigitalAlbum album)
    {
        this.album = album;
    }

    /**
     * method to call the digital album next song
     */
    public String play()
    {
        return album.nextSong();
    }

    /**
     * method to call the digital album rewind song
     */
    public String rewind()
    {
        return album.prevSong();
    }

    /**
     * method to call the digital album next song
     */
    public String ffwd()
    {
        return album.nextSong();
    }

    /**
     * method to call the digital album pause music
     */
    public String pause()
    {
        return album.pause();
     
    }

    /**
     * method to call the digital album stop music
     */
    public String stopEject()
    {
        return album.stop(); 
    }


}
