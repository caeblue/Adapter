public interface AnalogAlbum 
{
    /**
     * Interface class to force all classes 
     * who implement it to run these methods
     */
    public String play();
    public String rewind();
    public String ffwd();
    public String pause();
    public String stopEject();
    
}
