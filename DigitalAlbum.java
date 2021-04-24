public interface DigitalAlbum
{
    /**
     * Interface class to force all classes 
     * who implement it to run these methods
     */

     public String playFromBeginning();
     public String playSong(int num);
     public String prevSong();
     public String nextSong();
     public String stop();
     public String pause();
    
}
