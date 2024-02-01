package Game;

import JDBC_MODEL.BbangDTO;
import View.BbangView;

public class FinalProject {
	
	BbangView bbangview = new BbangView();
	// 최종 프로젝트 발표
	
	public void presentation(BbangDTO result) {
		bbangview.ppt();
		
		if(result.getCode()>=80) {
			System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
			System.out.println();
			System.out.println("\t\t\t\t끼욧! 끼꼬! 꾜잇! 꺄앗 1등!!!!!!");
			System.out.println();
			System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
			result.setCh(result.getHp() + 10);
			
		}else if(result.getCode()>=70) {
			System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
			System.out.println();
			System.out.println("\t\t\t\t끼욧! 끼꼬! 꾜잇! 꺄앗 2등!!!!!!");
			System.out.println();
			System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
			result.setCh(result.getHp() + 5);
		}
		
	}
	

}
