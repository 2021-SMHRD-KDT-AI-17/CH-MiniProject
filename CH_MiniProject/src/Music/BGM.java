package Music;

// 1) 뮤직 플레이어로 실행시키는 방법 

//	
//	String defaultpath ="C:\\Users\\smhrd\\Desktop\\5. 미니 프로젝트";
//	Music m1 = new Music(defaultpath + "")
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class BGM {

	public BGM() { // 배경음

		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(new File("C:\\Users\\SMHRD\\Desktop\\gitTest_8-bit-dream-land-142093.wav"));

			Clip clip = AudioSystem.getClip();

			clip.open(ais);

			// 소리 설정

			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

			// 볼륨 조절
			gainControl.setValue((-20.0f));

			clip.start();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}



		public void playSound(String pathName, boolean isLoop) {
			try {
				
				Clip clip = AudioSystem.getClip();
				
				File audioFile = new File(pathName);
				AudioInputStream coin = AudioSystem.getAudioInputStream(audioFile);
				clip.open(coin);
				clip.start();
				if(isLoop) {
					clip.loop(Clip.LOOP_CONTINUOUSLY);
				}
					
			}catch (LineUnavailableException e) {
				e.printStackTrace();
			}catch (UnsupportedAudioFileException e) {
				
			}catch (IOException e) {
				e.printStackTrace();
			}
				
			
		}}
