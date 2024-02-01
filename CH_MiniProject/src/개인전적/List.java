package 개인전적;

import java.util.ArrayList;

import JDBC_MODEL.BbangDAO;
import JDBC_MODEL.BbangDTO;

public class List {
	// 개인 전적 확인
	
	public void allchar() {
		
		BbangDAO bdao = new BbangDAO();
		
		
		System.out.println("순서\t닉네임\t매력\t체력\t코딩\t스트레스\t로또");

		ArrayList<BbangDTO> list = bdao.checkid();
		for(int i = 0; i<list.size();i++) {
			BbangDTO bdto = list.get(i);
			System.out.print(i+1+"\t"+bdto.getNick() + "\t" + bdto.getCh() + "\t" + bdto.getHp() + "\t" + bdto.getCode() + "\t" + bdto.getStress() + "\t");
			if(bdto.getLot() == 1) {
				System.out.println("T");
			}else {
				System.out.println("F");
			}
		}
           System.out.println();
	}
}
