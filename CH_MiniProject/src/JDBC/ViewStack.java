package JDBC;

import JDBC_MODEL.BbangDTO;

public class ViewStack {

	// 스택 보기
	
	//========================== 객체 생성
	
	public void viewStack(BbangDTO result) {
		System.out.println("스택 출력");
		
		int ch = result.getCh();
		int hp = result.getHp();
		int code = result.getCode();
		int stress = result.getStress();
		
		int save = result.getSave();
		
		String nick = result.getNick();
		
		System.out.println(nick + "(님)의 스탯은 ch " + ch +" hp " + hp + " code " + code + " stress " + stress +"입니다. " );
		
	}
}
