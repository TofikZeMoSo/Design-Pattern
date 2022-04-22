package Adapter_Design_Pattern;

public class MP4Player implements AdvancedMediaPlayer{
    @Override
    public void playVLC(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
              System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
