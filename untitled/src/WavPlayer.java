import javax.sound.sampled.*;
import java.io.IOException;
import java.io.InputStream;

    public class WavPlayer {
        public static void playWavRes(String resString) {
            try {
                InputStream stream = WavPlayer.class.getResourceAsStream(resString);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(stream);
                Clip clip = AudioSystem.getClip();
                clip.open(audioStream);
                clip.start();
                Thread.sleep(clip.getMicrosecondLength() / 1000); // Warten auf Ende
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

