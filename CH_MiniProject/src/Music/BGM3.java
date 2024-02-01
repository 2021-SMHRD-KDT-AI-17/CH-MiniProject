package Music;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class BGM3 {
	
public BGM3() {
		
		
		
		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream( new File("빵빵이의-일상_.wav"));
			
			Clip clip = AudioSystem.getClip();
			
//			clip.open(ais);
			
			clip.stop();
			
			
			// 소리 설정 
			
			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			
			// 볼륨 조절
			gainControl.setValue((-20.0f));
			
			clip.start();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
