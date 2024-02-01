package 엔딩;

import JDBC_MODEL.BbangDAO;
import JDBC_MODEL.BbangDTO;
import JDBC_MODEL.EndingDAO;
import View.BbangView;
import 프롤로그_에필로그.Intro;

public class Ending {

	// 엔딩 확인
	BbangView bbangview = new BbangView();
	EndingDAO edao = new EndingDAO();
	Intro intro = new Intro();
	

	
	// ============================= 객체
	
	public void ending(BbangDTO result) {

		// if문으로 엔딩 확인
		//매력80이상으로 옥지 만남
		if(result.getCh()>=80) {
			bbangview.okji();
//			result.setEnd(edao.okji().getEnd());
			intro.okji();
		//체력80이상으로 태권도장
		}else if(result.getHp()>=80) {
			bbangview.hpFull();
			result.setEnd(edao.hpFull().getEnd());
			intro.hpFull();
		//체력30이하로 병원
		}else if(result.getHp()<=30 &&result.getHp()>0) {
			bbangview.hpHos();
			result.setEnd(edao.hpHos().getEnd());
			intro.hpHos();
		//체력0으로 중퇴
		}else if(result.getHp()<=0) {
			bbangview.hpOut();
			result.setEnd(edao.hpOut().getEnd());
			intro.hpOut();
		//스트레스 80이상으로 정신병원
		}else if(result.getStress()>=edao.stressHos().getStree()) {
			bbangview.stressHos();
			result.setEnd(edao.stressHos().getEnd());
			intro.stressHos();
		//코딩 80이상으로 대기업
		}else if(result.getCode()>=edao.big().getCode()) {
			bbangview.big();
			result.setEnd(edao.big().getEnd());
			intro.big();
		//코딩 30~80으로 중소
		}else if(result.getCode()>=edao.small().getCode()) {
			bbangview.small();
			result.setEnd(edao.small().getEnd());
			intro.small();
		//코딩 30이하로
		}else if(result.getCode()>=edao.noJob().getCode()) {
			bbangview.noJob();
			result.setEnd(edao.noJob().getEnd());
			intro.noJob();
		//로또 lottonum이 사용자가 입력한 usernum과 같다면 당첨
		}else if(edao.winLotto().getlot()==1) {
			bbangview.winLotto();
			result.setEnd(edao.winLotto().getEnd());
			intro.winLotto();
		}
		
	}
		
		
}

