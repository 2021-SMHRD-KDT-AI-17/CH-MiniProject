package Game;

import java.util.Random;
import java.util.Scanner;

import JDBC_MODEL.BbangDAO;
import JDBC_MODEL.BbangDTO;
import Music.BGM2;
import View.BbangView;

public class AWeek {

	// 한 주 관련 코딩
	
	WeekDay weekday = new WeekDay();
	WeekEnd weekend = new WeekEnd();
	
	BbangDAO bdao = new BbangDAO();
	
	ActionWeekEnd actionweekend = new ActionWeekEnd();
	Actionclass actionclass = new Actionclass();
	ActionAfter actionafter = new ActionAfter();
	ActionBefore actionbefore = new ActionBefore();
	
	BbangView bbangview = new BbangView();
	
	//================================== 객체 생성
	public void week(BbangDTO result) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		BbangDAO bdao = new BbangDAO();
		int dw = result.getSave()%7;
		
		String day = "";
		int save = result.getSave();

		
		for(int i = dw;i<=6;i++) {
			switch (save%7) {
			case 0: day = "월"; break;
			case 1: day = "화"; break;
			case 2: day = "수"; break;
			case 3: day = "목"; break;
			case 4: day = "금"; break;
			case 5: day = "토"; break;
			case 6: day = "일"; break;
			}
			
			if(save%7>=0&& save%7<=4) {
				
				System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
				System.out.println();
				System.out.println("\t\t\t\t"+save +"일 " +day+"요일");
				System.out.println("\t\t\t\t띠리리리리링!! ");
				System.out.println("\t\t\t\t오늘은 학원가는 날,, 가기 싫다,,,");
				System.out.println();
				System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println();
				System.out.println();
				
				
				System.out.println("\t\t\t\t오전 수업");
				System.out.println();
				int hp = result.getHp();		// 수정 확인
				int stress = result.getHp();	// 수정 확인
				System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
				System.out.println();
				System.out.println("\t\t\t\t오전엔 뭐하지?");
				System.out.print(" \t\t\t\t[1] 공부 [2] 잠 [3] 핸드폰 ");
				int num = sc.nextInt();
				new BGM2();
				System.out.println();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				if(hp < 30 || num == 2) {			// 수치 조정 필요, DTO로 입력 
					// 채력 증가
					bbangview.codeDown();
					System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
					System.out.println();
					if(hp <30 && num!=2) {
						System.out.println("\t\t\t\t채력이 없어서 너무 졸려,,, 잘래,,");
					}else {
						System.out.println("\t\t\t\t그냥 잘래,,,");
					}
					System.out.println();
					System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
					result.setHp(result.getHp()+10);	
					result.setCode(result.getCode()-10);	
				}else if(num ==3) {
					
					bbangview.phone();
					System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
					System.out.println();
					if(stress > 80 && num != 3) {
						System.out.println("\t\t\t\t스트레스 너무 받아서 게임할래!");
					}else {
						System.out.println("\t\t\t\t 그냥 게임이나 할래!!");
					}
					System.out.println();
					System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
					
					
					result.setStress(result.getStress() - 10);
					result.setCode(result.getCode()-10);	
				}
				else {
					
					bbangview.codeUp();
					System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
					System.out.println();
					System.out.println("\t\t\t\t 미래의 나를 위해 공부해야지!!");
					System.out.println();
					System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
					result.setHp(result.getHp()-10);	
					result.setCode(result.getCode()+10);	
					result.setStress(result.getStress() + 10);
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
				System.out.println();
				System.out.print("\t\t\t\t점심 시간이다!! 뭐드실?? ");
				String food = sc.next();
				new BGM2();
				
				System.out.println("\t\t\t\t" + food + "(을)를 먹자!! ");
				System.out.println();
				System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
				result.setHp(result.getHp()+5);	
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
					// 채력 증가
				
					hp = result.getHp();		// 수정 확인
					stress = result.getHp();	// 수정 확인
					System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
					System.out.println();
					System.out.println("\t\t\t\t오후엔 뭐하지? [1] 공부 [2] 잠 [3] 핸드폰");
					num = sc.nextInt();
					new BGM2();
					System.out.println();
					System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
				
					
					if(hp < 30 || num == 2) {			// 수치 조정 필요, DTO로 입력 
						// 채력 증가
						bbangview.codeDown();
						System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
						System.out.println();
						if(hp <30 && num!=2) {
							System.out.println("\t\t\t\t채력이 없어서 너무 졸려,,, 잘래,,");
						}else {
							System.out.println("\t\t\t\t그냥 잘래,,,");
						}
						System.out.println();
						System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
						result.setHp(result.getHp()+10);	
						result.setCode(result.getCode()-10);	
					}else if(num ==3) {
						
						bbangview.phone();
						System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
						System.out.println();
						if(stress > 80 && num != 3) {
							System.out.println("\t\t\t\t스트레스 너무 받아서 게임할래!");
						}else {
							System.out.println("\t\t\t\t 그냥 게임이나 할래!!");
						}
						System.out.println();
						System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
						
						
						result.setStress(result.getStress() - 10);
						result.setCode(result.getCode()-10);	
					}
					else {
						
						bbangview.codeUp();
						System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
						System.out.println();
						System.out.println("\t\t\t\t 미래의 나를 위해 공부해야지!!");
						System.out.println();
						System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
						result.setHp(result.getHp()-10);	
						result.setCode(result.getCode()+10);	
						result.setStress(result.getStress() + 10);
					}
					System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
					System.out.println();
					System.out.println("\t\t\t\t 수업이 끝나고 난 뭐할까,,?");
					System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
				
				{
					
					System.out.print("\t\t\t\t[1] 헌팅 [2] 공부 [3] 운동 [4] 로또 [5] 친구 ");
					
					int ac = sc.nextInt();
					new BGM2();
					BbangView bbangview = new BbangView();
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					switch(ac) {
					case 1: 
						bbangview.chUp();
						int hunt_num =rd.nextInt(100)+1;
						System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
						System.out.println();
						System.out.println("\t\t\t\tㅎ ㅔ헿 저희랑 노실래요?");
						System.out.println();
						System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
						
						if(hunt_num <= result.getCh()) {
							bbangview.chUp();
							System.out.println("\t\t\t\t 야호!!");
							result.setCh(result.getCh()+ 10);
						}else{
							System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
							System.out.println();
							System.out.println("\t\t\t\t힝구 ㅠ");
							result.setCh(result.getCh()- 10);
							System.out.println();
							System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
						}
						
						break;
					case 2: 
						bbangview.codeUp();
						System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
						System.out.println();
						System.out.println("\t\t\t\t 아,, 하기 싫어,,,");
						System.out.println();
						System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
						result.setCode(result.getCode()+ 10);	
						result.setStress(result.getStress()+ 10);
						break;
					case 3: 
						System.out.println("운동한다.");
						bbangview.hpUp();
						
						System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
						System.out.println();
						System.out.println("\t\t\t\t아이! 아이!");
						System.out.println();
						System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
						result.setHp(result.getHp()+ 10);	
						break;
					case 4: 
						bbangview.buyLotto();
						System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
						System.out.println();
						System.out.println("\t\t\t\tㅎ ㅔ헤 아저씨 로또한장 주세요!");
						System.out.println();
						System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
						
						System.out.print("\t\t\t\t 로또 번호를 입력해 (1~10)!! ");
						int num1 = sc.nextInt();
						new BGM2();
						int lotto_num = rd.nextInt(10) + 1;;
						
						System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
						System.out.println();
						if(num1 == lotto_num) {
							System.out.println("\t\t\t\t 아저씨 X 2 여기 1등이요! ");
							result.setLot(1);
						}else {
							System.out.println("\t\t\t\t 씹꽝이래요 씹꽝!");
						}
						System.out.println();
						System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
						break;
					case 5: 
						bbangview.stressDown();
						System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
						System.out.println();
						System.out.println("\t\t\t\t 마시고 죽자!!");
						System.out.println();
						System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
						
						result.setStress(result.getStress()- 10);	
						break;
					}
				}
				bbangview.codeDown();
				System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
				System.out.println();
				System.out.println("\t\t\t\t ㅎ ㅔ 헿 오늘도 알차게 살았다");
				System.out.println();
				System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
				
				result.setHp(result.getHp()+ 10);	
				
				bdao.updateday(result);
				
			}
			else {
				
				System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
				System.out.println();
				System.out.println("\t\t\t\t"+save +"일 " +day+"요일");
				System.out.println("\t\t\t\t띠리리리리링!! ");
				System.out.println("\t\t\t\t ㅎ ㅔ헿 주말이다!");
				System.out.println();
				System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
				
				System.out.println("\t\t\t\t 주말 동안 뭐하지?");
				System.out.print("\t\t\t\t[1] 여행 [2] 운동 [3] 문화 [4] 스포츠 [5] 데이트");
				
				int ac = sc.nextInt();
				new BGM2();
				
				switch(ac) {
				case 1: 
					bbangview.travel();
					System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
					System.out.println();
					System.out.println("\t\t\t\tㅎ ㅔ헿 여행가자!");
					System.out.println();
					System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
					
					result.setCode(result.getCode() - 10);
					result.setStress(result.getStress() - 10);
					break;
				case 2: 
					bbangview.hpUp();
					System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
					System.out.println();
					System.out.println("\t\t\t\t아이! 아이!");
					System.out.println();
					System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
					result.setCode(result.getCode() - 10);
					result.setHp(result.getHp() + 20);
					break;
				case 3: 
					bbangview.stressDown();
					System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
					System.out.println();
					System.out.println("\t\t\t\tㅎㅔ 헿 꽁짜 영화표 생겼다 ㅎ");
					System.out.println();
					System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
					
					result.setStress(result.getStress() - 10);
					result.setCode(result.getCode() - 10);
					break;
				case 4: 
					bbangview.baseball();
					System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
					System.out.println();
					System.out.println("\t\t\t\t 아 저 새끼들 내가 감독해도 저것보단 잘하겠다");
					System.out.println();
					System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
					result.setCode(result.getCode() - 10);
					result.setStress(result.getStress() - 10);
					break;
				case 5: 
					bbangview.date();
					System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
					System.out.println();
					System.out.println("\t\t\t\t 옥찌얌! 빵빵아");
					System.out.println();
					System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
					result.setCode(result.getCode() - 10);
					result.setCh(result.getCh() + 10);
					result.setCode(result.getCode() - 10);
					break;
				}
				bbangview.codeDown();
				System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
				System.out.println();
				System.out.println("\t\t\t\t ㅎ ㅔ 헿 오늘도 알차게 살았다");
				System.out.println();
				System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
				bdao.updateday(result);
				
			}
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
			
			result.setSave(result.getSave()+1);
			save = result.getSave();
			if(result.getSave() == 28) {
				
				break;
			}
			bdao.updateday(result);
			
		}
	}
}
