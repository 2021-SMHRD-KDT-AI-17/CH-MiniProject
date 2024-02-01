# 📎 Java기반 빵빵이의 일상(팀명: _다섯명이조_)

![PS23121400811](https://github.com/2021-SMHRD-KDT-AI-17/CH-MiniProject/assets/157353916/921394b6-b045-437c-8160-447ae776932e)
45_1280]

## 👀 서비스 소개

* 서비스명:  빵빵이의 일상 

* 서비스설명: 본 게임의 플레이어인 당신에게는 총 4주동안 진행되는 개발자 과정 속 랜덤하게 여러 상황이 주어집니다. 이에 따른 선택은 설정된 분기마다 반영이 되며 때로는 예상하지 못 한 결말을 여러분에게 제공할 것입니다. 매일 신중하고 의미 있는 삶을 사세요 !
<br>

## 📅 프로젝트 기간
2024.01.26 ~ 2024.01.30 (5일)
<br>

## ⭐ 프로젝트 주요 기능
### JDBC
- JAVA와 DB서버를 연동하여 해당 테이블에 데이터를 조회/업데이트/수정을 진행
1. 로그인

	- **개요: 값을 입력받아 Orcle 서버에서 조회하기**
	1. 데이터 조회: 값을 입력받아 User_Info 테이블에 저장된 데이터를 조회
	2. 데이터 비교: 사용자가 입력한 값과 비교 후 일치 여부 확인
	3. 프로필 출력: 일치 여부 확인 후 일치할 경우 해당 데이터의 ID, PW 값을 출력
<br>

2. 회원가입
	- **개요: 값을 입력받아 Orcle 서버에 업데이트**
	1. 데이터 업데이트: 값을 입력받아 User_Info테이블에 ID, PW 업데이트 하기
	2. 회원가입된 정보 출력: 정상적으로 데이터가 입력시 회원가입이 완료되었다는 문구와 함께 ID, PW출력
<br>

3. 캐릭터 생성/ 캐릭터 조회/ 캐릭터 삭제
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

4. 스탯에 따른 엔딩 보기

	- **개요: 스탯 확인 후 캐릭터 엔딩 설정**
	1) play를 진행 후 스탯확인: play가 진행되는 동안 변화한 스탯 확인
	2) 엔딩 업데이트: 확인된 스탯과 Ending 테이블에 있는 값을 비교하여 엔딩 입력 업데이트
	3) 엔딩 크래딧 확인: 정상적으로 입력 시 해당 엔딩 에필로그 출력
<br>
	
5. 전체 캐릭터 보기
	- **개요: 로그인 실행 후 생성한 캐릭터의 상태를 보여줌**
	1. DB에 있는 데이터에서 NICK, SAVE, END의 값을 가져옴
	2. 10개의 캐릭터만을 출

<br>
---

### Play
- **개요: 빵빵이가 스마트인재개발원을 다니면서 발생한 이벤트에 대한 행동을 선택하여 스탯의 증감을 확인 **
- **총 4주간의 교육을 마치고 최종적으로 엔딩을 진행함**

	1. 평일
		- **개요: 기상 / 등교 / 오전수업 / 점심 / 오후수업 / 방과후활동 순으로 진행됨**
		1. 오전 / 오후 수업에는 공부하기/ 잠자기/ 핸드폰하기 의 선택지가 있음
			- Hp가 50 이하일 경우 자동으로 '잠자기'가 선택되어 Hp를 회복함
			- Stress가 80 이상일 경우 자동으로 '핸드폰하기'가 선택되어 Stress를 감소함
			- 각 선택지에 따른 UI를 출력함
		2. 점심에는 본인이 먹고 싶은 음식을 입력하여 해당 음식을 먹음
		3. 방과후 확동으로 헌팅 / 공부 / 운동 / 로또 / 친구만나기 의 선택지가 있음
			- 선택에 따라 스탯이 아래 표와 같이 변화함
		4. 모든 일과가 끝남과 동시에 save에 해당하는 값이 1씩 증가하여 savepoint를 만듬
		5. 모든 스탯이 DB서버 업데이트 되고 이후 해당 결과에 따른 멘트가 출력됨

<table>
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
    <img src="https://github.com/2021-SMHRD-KDT-AI-17/CH-MiniProject/assets/99461952/a06b133e-3bbf-40cc-adc4-cb1443c3adc5" width="100" height="120"/>
    <img src="https://github.com/2021-SMHRD-KDT-AI-17/CH-MiniProject/assets/99461952/d3de7e20-2039-42a2-899a-285572eab52f" width="100" height="120"/>
    </td>
    <td align="center"><img src="https://github.com/2021-SMHRD-KDT-AI-17/CH-MiniProject/assets/99461952/27ca8272-4fb5-4563-9916-d740dfef008e" width="100" height="120"/></td>
    <td align="center"><img src="https://github.com/2021-SMHRD-KDT-AI-17/CH-MiniProject/assets/99461952/0ed37943-3828-4c4a-b8ef-c1590d35f950" width="100" height="120"/></td>
    <td align="center"><img src="https://github.com/2021-SMHRD-KDT-AI-17/CH-MiniProject/assets/99461952/e4e07fd5-8140-4173-b01b-9cf77cfc4e18" width="100" height="100"/></td>
    <td align="center"><img src="https://github.com/2021-SMHRD-KDT-AI-17/CH-MiniProject/assets/99461952/cb02d926-1add-484e-843c-76d9ffd102bf" width="100" height="120"/></td>
  </tr>

  
</table>



2. 주말
	- **개요: 주말에만 할 수 있는선택지를 만들어 진행됨**
	1. 여행 / 운동 / 문화생활 / 스포츠 / 데이트 의 선택지가 있음
	2. 선택 이후 관련 UI가 출력되어 플레이어에게 알려줌

3. 일주일
	- **개요: 평일 5일과 주말 2일을 for문으로 반복하여 게임을 진행함**
	1. save를 7로 나누어 게임을 종료하고 다시 시작하더라도 종료된 시점에서 시작함
	2. 전체 과정이 종료 되면 현재 본인의 스탯을 확인하고 종료 여부를 선택함

4. 한달
	-	**일주일을 for문을 이용해 4번 반복하여 게임을 진행함**
	1. 전체 일정이 종료 되고 최종 발표를 진행하여 code 스탯에 따라 등수가 정해진다. 
	2. 등수에 따라 스탯 추가가 가능함
	3. 최종 스탯 확인 후 엔딩 UI 출력

---
	

### 엔딩보기
- 플레리어의 선택에 따라 변화하는 스탯으로 엔딩이 결정됨

<br>

## ⛏ 기술스택
<table>
    <tr>
        <th>구분</th>
        <th>내용</th>
    </tr>
    <tr>
        <td>사용언어</td>
        <td>
            <img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white"/>
        </td>
    </tr>
    <tr>
        <td>개발도구</td>
        <td>
            <img src="https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=Eclipse&logoColor=white"/>
        </td>
    </tr>
    <tr>
        <td>데이터베이스</td>
        <td>
            <img src="https://img.shields.io/badge/Oracle 11g-F80000?style=for-the-badge&logo=Oracle&logoColor=white"/>
        </td>
    </tr>
    <tr>
        <td>협업도구</td>
        <td>
            <img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=Git&logoColor=white"/>
            <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=GitHub&logoColor=white"/>
        </td>
    </tr>
</table>


<br>

## ⚙ 서비스 흐름도

![다이어그램](https://github.com/2021-SMHRD-KDT-AI-17/CH-MiniProject/assets/157353916/0ee933d2-823c-4eed-9f21-22cf8d5f3362)

<br>

## ⚙ 테이블 명세서




## 🖥 화면 구성

### 메인 화면

![스크린샷 2024-01-31 083117](https://github.com/2021-SMHRD-KDT-AI-17/CH-MiniProject/assets/157353916/62f3a6ea-fb66-4b7c-a645-ec4ae34eeb86)
<br>

### 로그인/회원가입
![스크린샷 2024-01-31 083219](https://github.com/2021-SMHRD-KDT-AI-17/CH-MiniProject/assets/157353916/4afbbf37-7391-468d-8840-c1a31b112b5e)
<br>

### 빵빵이의 일상 생성/플레이
![스크린샷 2024-01-31 083309](https://github.com/2021-SMHRD-KDT-AI-17/CH-MiniProject/assets/157353916/022cf2fc-1fe3-412d-85a8-fea3391ed37e)
<br>


## 👨‍👩‍👦‍👦 팀원 역할
<table>
  <tr>
    <td align="center"><img src="https://item.kakaocdn.net/do/fd49574de6581aa2a91d82ff6adb6c0115b3f4e3c2033bfd702a321ec6eda72c" width="100" height="100"/></td>
    <td align="center"><img src="https://mb.ntdtv.kr/assets/uploads/2019/01/Screen-Shot-2019-01-08-at-4.31.55-PM-e1546932545978.png" width="100" height="100"/></td>
    <td align="center"><img src="https://mblogthumb-phinf.pstatic.net/20160127_177/krazymouse_1453865104404DjQIi_PNG/%C4%AB%C4%AB%BF%C0%C7%C1%B7%BB%C1%EE_%B6%F3%C0%CC%BE%F0.png?type=w2" width="100" height="100"/></td>
    <td align="center"><img src="https://i.pinimg.com/236x/ed/bb/53/edbb53d4f6dd710431c1140551404af9.jpg" width="100" height="100"/></td>
    <td align="center"><img src="https://pbs.twimg.com/media/B-n6uPYUUAAZSUx.png" width="100" height="100"/></td>
  </tr>
  <tr>
    <td align="center"><strong>홍창민</strong></td>
    <td align="center"><strong>조영훈</strong></td>
    <td align="center"><strong>정재원</strong></td>
    <td align="center"><strong>신혜선</strong></td>
    <td align="center"><strong>김대원</strong></td>
  </tr>
  <tr>
    <td align="center"><b>Backend</b></td>
    <td align="center"><b>Frontend</b></td>
    <td align="center"><b>Backend</b></td>
    <td align="center"><b>Backend</b></td>
    <td align="center"><b>Backend</b></td>
  </tr>
  <tr>
    <td align="center"><a href="https://github.com/kecaseo9" target='_blank'>github</a></td>
    <td align="center"><a href="https://github.com/joyeonghoon" target='_blank'>github</a></td>
    <td align="center"><a href="https://github.com/wodnjs0104" target='_blank'>github</a></td>
    <td align="center"><a href="https://github.com/gptjs0629" target='_blank'>github</a></td>
    <td align="center"><a href="https://github.com/vensr1" target='_blank'>github</a></td>
  </tr>
</table>

## 🤾‍♂️ 트러블슈팅
  
* 문제1<br>
 ![스크린샷 2024-01-31 085014](https://github.com/2021-SMHRD-KDT-AI-17/CH-MiniProject/assets/157353916/03edba61-c6d0-4af2-b767-4ca6c9f46c7a)

1.  협업 과정 중 깃허브 충돌로 문제가 생겨 pull 하지 않는 프로젝트를 확인하여 다시 git 허브에 연동하여 해결

2. 하루가 지남에 따라 save의 값이 원하는대로 업데이트 되지 않은 문제 발생 -> DB에 commit을 하지 않아 발생한 문제로 java에서 setter를 이용해 update하는 방식으로 해결
 
* 문제2<br>
 
![스크린샷 2024-01-31 085022](https://github.com/2021-SMHRD-KDT-AI-17/CH-MiniProject/assets/157353916/68055dff-ce69-4c31-bfa9-0edffa59d319)

1. SAVE(캐릭터의 날짜 저장) 의 데이터는 정상적으로 입력이 되나 SAVE의 값이 28이상일 경우 END(엔딩 결과), COM(완료 날짜) 부분에 값이 들어오지 않음
