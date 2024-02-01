package 프롤로그_에필로그;

public class Intro {

	public void Intro()  {
		System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
		System.out.println();
		String row1 = "내 이름은 빵빵이";

		String[] row1Arr = row1.split("");

		System.out.print("\t\t\t\t");
		for (int i = 0; i < row1Arr.length; i++) {

			System.out.print(row1Arr[i] + "");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();

		// 2번째 줄
		String row2 = "선택된 버튼으로 좌우하는 운명 시뮬레이션!!!";

		String[] row2Arr = row2.split("");

		System.out.print("\t\t\t\t");
		for (int i = 0; i < row2Arr.length; i++) {

			System.out.print(row2Arr[i] + "");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();

		// 3번째 줄
		String row3 = "선택된 운명이 좌우하는 빵빵이의 일상!!!";

		String[] row3Arr = row3.split("");

		System.out.print("\t\t\t\t");
		for (int i = 0; i < row3Arr.length; i++) {

			System.out.print(row3Arr[i] + "");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();

		// 4번째 줄
		String row4 = "과연 빵빵이는 일상을 잘 끝마칠수 있을까!!!";

		String[] row4Arr = row4.split("");

		System.out.print("\t\t\t\t");
		for (int i = 0; i < row4Arr.length; i++) {

			System.out.print(row4Arr[i] + "");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 엔딩1) 매력80이상으로 옥지 만남
		public void okji() {
			System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
			System.out.println();
			String str1 = "\t\t첫사랑인 옥지랑 결혼을 하게 되었습니다.";
			String[] str1_arr = str1.split("");
			for(int i = 0; i<str1_arr.length;i++) {
				System.out.print(str1_arr[i]);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println();
			System.out.println();
			System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
		}
		// 엔딩2) 체력0으로 중퇴		
		public void hpOut() {
			System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
			System.out.println();
			String str2 = "\t\t코딩학원에서 중퇴했습니다..";
			String[] str2_arr = str2.split("");
			for(int i=0; i<str2_arr.length;i++) {
				System.out.print(str2_arr[i]);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println();
			System.out.println();
			System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
		}
		// 엔딩3) 체력30이하로 병원
		public void hpHos() {
			System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
			System.out.println();
			String str3 = "\t\t체력이 고갈되어 응급실에 입원하였습니다.";
			String[] str3_arr = str3.split("");
			for(int i=0; i<str3_arr.length;i++) {
				System.out.print(str3_arr[i]);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}		
			}
			System.out.println();
			System.out.println();
			System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
		}
		// 엔딩4) 체력80이상으로 태권도장
		public void hpFull() {
			System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
			System.out.println();
			String str4 = "\t\t태권도에 심취하여 국가대표 선수가 되었습니다.";
			String[] str4_arr = str4.split("");
			for(int i=0; i<str4_arr.length;i++) {
				System.out.print(str4_arr[i]);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}		
			}
			System.out.println();
			System.out.println();
			System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
		}
		// 엔딩5) 스트레스 80이상으로 정신병원
		public void stressHos() {
			System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
			System.out.println();
			String str5 = "\t\t스트레스를 너무 받아 정신병원에 입원했습니다.";
			String[] str5_arr = str5.split("");
			for(int i=0; i<str5_arr.length;i++) {
				System.out.print(str5_arr[i]);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}		
			}
			System.out.println();
			System.out.println();
			System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
		}
		// 엔딩6) 코딩 80이상으로 대기업
		public void big() {
			System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
			System.out.println();
			String str6 = "\t\t스인원 과정을 성공적으로 수료하고 대기업에 취직했습니다 !";
			String[] str6_arr = str6.split("");
			for(int i=0; i<str6_arr.length;i++) {
				System.out.print(str6_arr[i]);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}		
			}
			System.out.println();
			System.out.println();
			System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
		}
		// 엔딩7) 코딩 30~80으로 중소
		public void small() {
			System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
			System.out.println();
			String str7 = "\t\t스인원 과정을 진행했지만 실력이 부족하여 중소기업에 취직했습니다.";
			String[] str7_arr = str7.split("");
			for(int i=0; i<str7_arr.length;i++) {
				System.out.print(str7_arr[i]);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}		
			}
			System.out.println();
			System.out.println();
			System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
		}
		// 엔딩8) 코딩 30이하로
		public void noJob() {
			System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
			System.out.println();
			String str8 = "\t\t열심히 하지 않아서 취직에 실패했습니다.";
			String[] str8_arr = str8.split("");
			for(int i=0; i<str8_arr.length;i++) {
				System.out.print(str8_arr[i]);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}		
			}
			System.out.println();
			System.out.println();
			System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
		}
		// 엔딩9) 로또 lottonum이 사용자가 입력한 usernum과 같다면 당첨
		public void winLotto() {
			System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
			System.out.println();
			String str9 = "\t\t WOW ! 로또 1등에 당첨되었습니다 !";
			String[] str9_arr = str9.split("");
			for(int i=0; i<str9_arr.length;i++) {
				System.out.print(str9_arr[i]);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}		
			}
			System.out.println();
			System.out.println();
			System.out.println("▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰ ▰  ");
		}

}
