package Music;

import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.InputStream;

public class Music2 extends Thread {

	private Player player; // mp3 를 재생해주는 클래스
	private boolean isLoop; // 음악의 무한 루프 확인
	private BufferedInputStream bufferedInputStream;

//	    private File file; // 파일을 가져오는 클래스
//	    private FileInputStream fileInputStream;

	// 음악 mp3 파일 이름, 음악 반복재생 여부, 게임관련 음악인지 메뉴 관련 음악인지 여부
	public Music2(String name, boolean isLoop, String mod) {
		try {
			this.isLoop = isLoop; // isLoop 초기화

			// 음악 파일을 inputstream 에 넣어서 가져옴
			// game 관련 음악이면 game_music 에서 , menu 관련 음악이면 menu_music 에서 출력됨
			if (mod.equals("game")) {

				InputStream input = Music.class.getClassLoader()
						.getResourceAsStream("gitTest_8-bit-dream-land-142093.wav/" + name);

				bufferedInputStream = new BufferedInputStream(input); // 이후 다시 버퍼에 담아서 읽어 올 수 있도록
				player = new Player(bufferedInputStream); // 최종적으로 player 인스턴스는 버퍼에 담긴 음악 파일을 갖음

			} else if (mod.equals("menu")) {

				InputStream input = Music.class.getClassLoader().getResourceAsStream("빵빵이의-일상_.wav/" + name);
				bufferedInputStream = new BufferedInputStream(input); // 이후 다시 버퍼에 담아서 읽어 올 수 있도록

				player = new Player(bufferedInputStream); // 최종적으로 player 인스턴스는 버퍼에 담긴 음악 파일을 갖음
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}


	public void close() { // 음악을 종료하는 메서드
		isLoop = false;
		player.close();

		// 해당 스레드를 종료상태로 만듦 => 게임을 실행하는것과 별도로 곡 재생을 하는 스레드가 존재하는데
		// 곡 재생 스레드를 종료해줌
		this.interrupt();
	}

	@Override
	public void run() {

		try {
			do {
				player.play(); // 최종적으로 player 인스턴스는 버퍼에 담긴 음악 파일을 play

			} while (isLoop == true); // isLoop 가 true 인 동안 음악 반복 재생
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
