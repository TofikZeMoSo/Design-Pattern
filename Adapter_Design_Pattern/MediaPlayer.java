package Adapter_Design_Pattern;

//create bridge betwwen two incompatable interface
//as this pattern combine capability of two independent interface.
public interface MediaPlayer
{
    public void play(String audioType, String fileName);
}
