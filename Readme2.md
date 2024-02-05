# JDBC
- JAVA와 DB서버를 연동하여 해당 테이블에 데이터를 조회/업데이트/수정을 진행

## 1. 로그인

- **개요: 값을 입력받아 Orcle 서버에서 조회하기**
1. 데이터 조회: 값을 입력받아 User_Info 테이블에 저장된 데이터를 조회
2. 데이터 비교: 사용자가 입력한 값과 비교 후 일치 여부 확인
3. 프로필 출력: 일치 여부 확인 후 일치할 경우 해당 데이터의 ID, PW 값을 출력
<br>

## 2. 회원가입
- **개요: 값을 입력받아 Orcle 서버에 업데이트**
1. 데이터 업데이트: 값을 입력받아 User_Info테이블에 ID, PW 업데이트 하기
2. 회원가입된 정보 출력: 정상적으로 데이터가 입력시 회원가입이 완료되었다는 문구와 함께 ID, PW출력
<br>

## 3. 캐릭터 생성/ 캐릭터 조회/ 캐릭터 삭제
- **개요:  값을 입력 받아 캐릭터 생성/ 조회/ 삭제**

1)  캐릭터 생성하기
	- 게임 시작 전 플레이할 게임 캐릭터를 생성
	- 생성하고 싶은 캐릭터의 닉네임, 나이를 입력받아 Char_Bbang 테이블에 업데이트 하기
	- 정상적으로 업데이트 완료 시 캐릭터의 닉네임이 출력되어 이전 화면으로 넘어감

2) 캐릭터 조회하기
	- 게임 시작 전 플레이할 캐릭터 조회
	- 조회된 캐릭터의 닉네임을 입력하여 play진행
	- 정상적으로 닉네임 입력할 경우 닉네임과 함께 게임이 시작됨
	- 비정상적으로 닉네임 입력할 경우 다시 입력하라는 멘트와 함께 이전 화면으로 넘어감
3) 캐릭터 삭제하기
	- 삭제하고 싶은 닉네임을 입력받아 캐릭터 삭제 진행
	- 정상적으로 삭제할 경우 해당 캐릭터는 삭제되었다는 문구와 함께 삭제
<br>

## 4. 스탯에 따른 엔딩 보기
- **개요: 스탯 확인 후 캐릭터 엔딩 설정**

1) play를 진행 후 스탯확인: play가 진행되는 동안 변화한 스탯 확인
2) 엔딩 업데이트: 확인된 스탯과 Ending 테이블에 있는 값을 비교하여 엔딩 입력 업데이트
3) 엔딩 크래딧 확인: 정상적으로 입력 시 해당 엔딩 에필로그 출력
<br>
	
## 5. 전체 캐릭터 보기
- **개요: 로그인 실행 후 생성한 캐릭터의 상태를 보여줌**

1. DB에 있는 데이터에서 NICK, SAVE, END의 값을 가져옴
2. 10개의 캐릭터만을 출력

---

# Play
- **개요: 빵빵이가 스마트인재개발원을 다니면서 발생한 이벤트에 대한 행동을 선택하여 스탯의 증감을 확인 **
- **총 4주간의 교육을 마치고 최종적으로 엔딩을 진행함**

## 1. 평일
- **개요: 기상 / 등교 / 오전수업 / 점심 / 오후수업 / 방과후활동 순으로 진행됨**
1. 오전 / 오후 수업에는 공부하기/ 잠자기/ 핸드폰하기 의 선택지가 있음
	- Hp가 50 이하일 경우 자동으로 '잠자기'가 선택되어 Hp를 회복함
	- Stress가 80 이상일 경우 자동으로 '핸드폰하기'가 선택되어 Stress를 감소함
	- 각 선택지에 따른 UI를 출력함
2. 점심에는 본인이 먹고 싶은 음식을 입력하여 해당 음식을 먹음
3. 방과후 확동으로 헌팅 / 공부 / 운동 / 로또 / 친구만나기 의 선택지가 있음
	- 선택에 따라 스탯이 아래 표와 같이 변화함
4. 모든 일과가 끝남과 동시에 save에 해당하는 값이 1씩 증가하여 savepoint를 만듦듦
5. 모든 스탯이 DB서버 업데이트 되고 이후 해당 결과에 따른 멘트가 출력됨

<table align = "center">
  <tr>
    <td align="center"><strong>헌팅</strong></td>
    <td align="center"><strong>공부</strong></td>
    <td align="center"><strong>운동</strong></td>
    <td align="center"><strong>로또</strong></td>
    <td align="center"><strong>친구</strong></td>
  </tr>
  <tr>
    <td align="center"><b>성공 ch 증가  / 실패  ch감소</b></td>
    <td align="center"><b>hp 감소 / code 증가</b></td>
    <td align="center"><b>hp 증가 / code 감소</b></td>
    <td align="center"><b>1%의 확률로 당첨</b></td>
    <td align="center"><b>stress감소 / code 감소</b></td>
  </tr>
  <tr>
    <td align="center">
    	<img src="https://github.com/2021-SMHRD-KDT-AI-17/CH-MiniProject/assets/99461952/1b321209-a18a-4d10-b876-f0b7b100c421" width="100" height="120"/>
    	<img src="https://github.com/2021-SMHRD-KDT-AI-17/CH-MiniProject/assets/99461952/15de9d9b-ba3f-4004-b7e0-ae61e5b66829" width="100" height="120"/>
    </td>
    <td align="center">
	    <img src="https://github.com/2021-SMHRD-KDT-AI-17/CH-MiniProject/assets/99461952/0c4c79a4-2f5c-47f7-9869-da352496ec32" width="100" height="120"/>
    </td>
    <td align="center">
	    <img src="https://github.com/2021-SMHRD-KDT-AI-17/CH-MiniProject/assets/99461952/1e29dafb-c66c-41be-96b6-ad698b2ce2a0" width="100" height="120"/>
    </td>
    <td align="center"><img src="https://github.com/2021-SMHRD-KDT-AI-17/CH-MiniProject/assets/99461952/99878418-1a4b-4fd4-84c5-83d5124fb716" width="100" height="100"/></td>
    <td align="center"><img src="https://github.com/2021-SMHRD-KDT-AI-17/CH-MiniProject/assets/99461952/5d50b43d-7f50-4fbe-b0ae-e48f14554382" width="100" height="120"/></td>
  </tr>
</table>



## 2. 주말
- **개요: 주말에만 할 수 있는선택지를 만들어 진행됨**
1. 여행 / 운동 / 문화생활 / 스포츠 / 데이트 의 선택지가 존재재
2. 선택 이후 관련 UI가 출력되어 플레이어에게 안내

<table>
  <tr>
    <td align="center"><strong>여행</strong></td>
    <td align="center"><strong>운동</strong></td>
    <td align="center"><strong>문화생활</strong></td>
    <td align="center"><strong>스포츠</strong></td>
    <td align="center"><strong>데이트</strong></td>
  </tr>
  <tr>
    <td align="center"><b>stress 감소</b></td>
    <td align="center"><b>hp 증가</b></td>
    <td align="center"><b>stress 감소</b></td>
    <td align="center"><b> hp 증가 </b></td>
    <td align="center"><b>ch 증가</b></td>
  </tr>
  <tr>
    <td align="center">
    <img src="https://github.com/2021-SMHRD-KDT-AI-17/CH-MiniProject/assets/99461952/a06b133e-3bbf-40cc-adc4-cb1443c3adc5" width="100" height="120"/>
    <img src="https://github.com/2021-SMHRD-KDT-AI-17/CH-MiniProject/assets/99461952/d3de7e20-2039-42a2-899a-285572eab52f" width="100" height="120"/>
    </td>
    <td align="center"><img src="https://github.com/2021-SMHRD-KDT-AI-17/CH-MiniProject/assets/99461952/27ca8272-4fb5-4563-9916-d740dfef008e" width="100" height="120"/></td>
    <td align="center"><img src="https://github.com/2021-SMHRD-KDT-AI-17/CH-MiniProject/assets/99461952/0ed37943-3828-4c4a-b8ef-c1590d35f950" width="100" height="120"/></td>
    <td align="center"><img src="https://github.com/2021-SMHRD-KDT-AI-17/CH-MiniProject/assets/99461952/e4e07fd5-8140-4173-b01b-9cf77cfc4e18" width="100" height="100"/></td>
    <td align="center"><img src="https://github.com/2021-SMHRD-KDT-AI-17/CH-MiniProject/assets/99461952/cb02d926-1add-484e-843c-76d9ffd102bf" width="100" height="120"/></td>
  </tr>
</table>

## 3. 일주일
- **개요: 평일 5일과 주말 2일을 for문으로 반복하여 게임을 진행함**
1. save를 7로 나누어 게임을 종료하고 다시 시작하더라도 종료된 시점에서 시작함
2. 전체 과정이 종료 되면 현재 본인의 스탯을 확인하고 종료 여부를 선택

 
## 4. 한달
- **일주일을 for문을 이용해 4번 반복하여 게임을 진행함**
1. 전체 일정이 종료 되고 최종 발표를 진행하여 code 스탯에 따라 등수가 정해진다. 
2. 등수에 따라 스탯 추가가 가능함
3. 최종 스탯 확인 후 엔딩 UI 출력

---
	

### 엔딩보기
- 플레리어의 선택에 따라 변화하는 스탯으로 엔딩이 결정됨
