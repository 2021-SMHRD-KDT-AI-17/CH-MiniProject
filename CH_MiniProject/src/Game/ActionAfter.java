package Game;

import java.util.Random;
import java.util.Scanner;

import JDBC_MODEL.BbangDAO;
import JDBC_MODEL.BbangDTO;
import View.BbangView;

public class ActionAfter {

//	//수업 후 행동들
//	BbangDAO bdao = new BbangDAO();
//	BbangDTO result = bdao.checkdto();
//	BbangView bbangview = new BbangView();
//	
//	public void afterclass() {
//		System.out.println("수업 끝나고 선택함");
//		System.out.println("[1] 헌팅 [2] 공부 [3] 운동 [4] 로또 [5] 친구");
//		
//		Scanner sc = new Scanner(System.in);
//		int ac = sc.nextInt();
//		BbangView bbangview = new BbangView();
//		
//		switch(ac) {
//		case 1: 
//			int hunt_num =rd.nextInt(100)+1;
//			
//			System.out.println("헌팅 한다.");
//			bbangview.chUp();
//			
//			if(hunt_num <= result.getCh()) {
//				System.out.println("헌팅 성공!!");
//				result.setCh(result.getCh()+ 10);
//			}else{
//				System.out.println("헌팅 실풰,,,,");
//				result.setCh(result.getCh()- 10);
//			}
//			
//			break;
//		case 2: 
//			System.out.println("방과후 공부 한다. ");
//			bbangview.codeUp();
//			result.setCode(result.getCode()+ 10);	
//			result.setStress(result.getStress()+ 10);
//			break;
//		case 3: 
//			System.out.println("운동한다.");
//			bbangview.hpUp();
//			result.setHp(result.getHp()+ 10);	
//			break;
//		case 4: 
//			System.out.println("로또 산다.");
//			bbangview.buyLotto();
//			
//			System.out.println(" 로또 번호를 입력하세유!! ");
//			int num = sc.nextInt();
//			int lotto_num = rd.nextInt(65) + 1;;
//			if(num == lotto_num) {
//				System.out.println(" 측축!!! 당첨!!!!!!!!!");
//			}else {
//				System.out.println("다음 기회에,,,,,,,,,ㅜ");
//			}
//			break;
//		case 5: 
//			System.out.println("친구 만나서 논다. ");
//			bbangview.stressDown();
//			result.setStress(result.getStress()- 10);	
//			break;
//		}
//	}
//	
//	public void hunt() {
//		System.out.println("헌팅 한다.");
//		bbangview.chUp();
//		result.setCh(result.getCh()+ 10);	
//	}
//	
//	public void study() {
//		System.out.println("방과후 공부 한다. ");
//		bbangview.codeUp();
//		result.setCode(result.getCode()+ 10);	
//		result.setStress(result.getStress()+ 10);	
//	}
//	
//	public void exercise() {
//		System.out.println("운동한다.");
//		bbangview.hpUp();
//		result.setHp(result.getHp()+ 10);	
//	}
//	
//	public void lotto() {
//		Scanner sc = new Scanner(System.in);
//		Random rd = new Random();
//		
//		System.out.println("로또 산다.");
//		bbangview.buyLotto();
//		
//		System.out.println(" 로또 번호를 입력하세유!! ");
//		int num = sc.nextInt();
//		int lotto_num = rd.nextInt(65) + 1;;
//		if(num == lotto_num) {
//			System.out.println(" 측축!!! 당첨!!!!!!!!!");
//		}딘
//	}
//	
//	public void friend() {
//		System.out.println("친구 만나서 논다. ");
//		bbangview.stressDown();
//		result.setStress(result.getStress()- 10);	
//	}
//	
//	public void sleep() {
//		System.out.println("일과 후 잠을 잠다. ");
//		bbangview.codeDown();
//		result.setHp(result.getHp()+ 10);	
//	}
}
