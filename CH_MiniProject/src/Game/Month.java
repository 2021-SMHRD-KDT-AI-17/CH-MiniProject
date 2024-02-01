package Game;

import JDBC.SavePoint;
import JDBC.ViewStack;
import JDBC_MODEL.BbangDAO;
import JDBC_MODEL.BbangDTO;
import 엔딩.Ending;

public class Month {

	//한달
	
	AWeek aweek = new AWeek();
	SavePoint savepoint = new SavePoint();
	ViewStack viewstack = new ViewStack();
	WeekDay weekday = new WeekDay();
	WeekEnd weekend = new WeekEnd();
	BbangDAO bdao = new BbangDAO();
	ActionWeekEnd actionweekend = new ActionWeekEnd();
	Actionclass actionclass = new Actionclass();
	ActionAfter actionafter = new ActionAfter();
	ActionBefore actionbefore = new ActionBefore();
	BbangDTO bdto = new BbangDTO();
	
	//=================================== 객체 생성
	
	
	public void month(BbangDTO bbnagdto) {		// 매개변수 변경 
		
		BbangDAO bdao = new BbangDAO();
		int week = bbnagdto.getSave()/7;
		
		System.out.println();
		for(int i = week; i<4;i++) {
			aweek.week(bbnagdto);
			if(bbnagdto.getSave() == 28) {
				break;
			}
		}
		FinalProject finalproject = new FinalProject();
		finalproject.presentation(bbnagdto);
		System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
		System.out.println();
		System.out.println("\t\t\t\t마지막 날,,,");
		System.out.println();
		System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
		
		bdao.updateday(bbnagdto);
		
		Ending ending = new Ending();
		
		ending.ending(bbnagdto);
		

	}
}
