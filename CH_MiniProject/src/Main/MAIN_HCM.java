package Main;

import java.util.ArrayList;
import java.util.Scanner;

import Game.FinalProject;
import Game.Month;
import JDBC_MODEL.BbangDAO;
import JDBC_MODEL.BbangDTO;
import JDBC_MODEL.UserInfoDAO;
import JDBC_MODEL.UserInfoDTO;
import Music.BGM;
import Music.BGM2;
import View.BackGround;
import 개인전적.List;
import 엔딩.Ending;
import 프롤로그_에필로그.Intro;

public class MAIN_HCM {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
	
		UserInfoDTO udto = new UserInfoDTO();
		BbangDAO bdao = new BbangDAO();
		Month month = new Month();

		BackGround background = new BackGround();
		
		background.ilsang();

		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while (true) {


			// 아스키 아트 아래 메뉴 출력
			System.out.println();
			System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
			System.out.println();
			System.out.println(" \t    [1] 로그인  |  [2] 신입 수강생 등록  |  [3] 수료 인원 |  [4] 종료 ");
			System.out.println();
			System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");

			System.out.println();

			System.out.print("\t\t\t\t메뉴를 선택해줘 ! ");

			int choice = sc.nextInt();
			

			if (choice == 1) { // 로그인

				System.out.print("\t\t\t\t▷ 아이디입력 : ");
				String id = sc.next();
				

				System.out.print("\t\t\t\t▷ 비밀번호입력 : ");
				String pw = sc.next();
				

				UserInfoDTO dto = new UserInfoDTO();
				BbangDTO bdto = new BbangDTO();

				dto.setId(id);
				dto.setPw(pw);

				UserInfoDAO udao = new UserInfoDAO();
				UserInfoDTO userresult = udao.login(dto);

				if(userresult != null) {
					while (true) {

						System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
						System.out.println();
						System.out.println(" [1] 내 캐릭터 보기 | [2] 캐릭터 생성 | [3] 내 캐릭터 삭제 | [4] 메인 화면으로 ");
						System.out.println();
						System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
						System.out.println();
						System.out.print("\t\t\t\t메뉴를 선택해줘 ! ");
						int choice2 = sc.nextInt();
						new BGM2();
						if(choice2 ==1) {
							ArrayList<BbangDTO> list = bdao.idlist(userresult.getId());
							
							if(list.size() == 0) {
								System.out.println();
								System.out.println("수강 등록 먼저 해!!");
								System.out.println();
							}else{
								System.out.println("\t\t\t\t"+"Nick \t save \t  com");
								System.out.println("\t\t\t\t"+"---------------------------");
								for(int i = 0; i<list.size();i++) {
									bdto = list.get(i);
									System.out.println("\t\t\t\t"+bdto.getNick() + "\t" + bdto.getSave() + "\t" + bdto.getCom());
									
								}
								System.out.println();
								System.out.print("\t\t\t\t진행할 닉네임을 선택해!  ");
								String nick = sc.next();
								new BGM2();
								if(bdto.getSave() == 0) {
									Intro intro = new Intro();
									intro.Intro();
								}
								BbangDTO bbangdto = bdao.checkdto(nick);
								
								month.month(bbangdto);
								bbangdto = bdao.checkdto(nick);
								
								FinalProject finalproject = new FinalProject();
								finalproject.presentation(bbangdto);
								System.out.println("\t\t\t\t졸업 축하햄!!");
								Ending ending  = new Ending();
								ending.ending(bbangdto);
								bdao.updateday(bbangdto);
							}
							
						}else if(choice2 ==2) {
							
							System.out.print("\t\t\t\t수강생 이름: ");
							String nick = sc.next();
							new BGM2();
							System.out.print("\t\t\t\t수강생 나이: ");
							int age = sc.nextInt();
							new BGM2();
							
							BbangDTO iddto = new BbangDTO();
							
							iddto.setNick(nick);
							iddto.setAge(age);
							iddto.setId(userresult.getId());
							
							bdao.makechar(iddto);
							
							
							
						}else if(choice2 == 3) {
							ArrayList<BbangDTO> list = bdao.idlist(userresult.getId());
							System.out.println("Nick \t save \t  com");
							for(int i = 0; i<list.size();i++) {
								bdto = list.get(i);
								System.out.println(i+"\t"+bdto.getNick() + "\t" + bdto.getSave() + "\t" + bdto.getCom());
								
							}
							
							
							System.out.println("\t\t\t\t삭제할 닉네임을 알려줘");
							String nick = sc.next();
							new BGM2();

							BbangDAO bdao1 = new BbangDAO();
							int cnt = bdao.delete(nick);
							
							
							if(cnt>0) {
								System.out.println("\t\t\t\t" +nick + "을(를) 정상적으로 삭제했어");
							}
						}else {
							break;
						}


					}
				}
				//======================================= choice == 1 로그인
				} else if (choice == 2) { // 신입 수강생 등록

						System.out.println("\r\n\"    " +  "\t\t\t\t환영합니다 ! ");

						System.out.println("\r\n"+"\r\n"+"\r\n"+"\r\n");

						System.out.print("\t\t\t\t너 아이디가 뭐야? : ");
						String joinId = sc.next();
						new BGM2();

						System.out.println("\r\n"+"\r\n"+"\r\n"+"\r\n");

						System.out.print("\t\t\t\t비번은? : ");
						String joinPw = sc.next();
						new BGM2();
						
						UserInfoDTO dto = new UserInfoDTO();
						
						dto.setId(joinId);
						dto.setPw(joinPw);
						UserInfoDAO udao = new UserInfoDAO();
						int cnt = udao.join(dto);

					}
			//============================================= choice == 2 회원가입
				else if (choice == 3) { // 수료 인원
					List list = new List();
					list.allchar();
						

					} else if(choice == 4){ //  종료
						System.out.print("\t\t\t\t진짜 갈려고..?. [1] 네 [2] 아니오  ");

						int quitChoice = sc.nextInt();
						new BGM2();

						if (quitChoice == 1) {
							break;

						}
					}else {
						System.out.println();
						System.out.println("잘못된 접근입니다 ! 다시 입력해주세요.");
						System.out.println();
					}
			
				
				}
		//========================================== choice == 3 로그인 
		

			}
}
