<div align="center">

## [![Typing SVG](https://readme-typing-svg.demolab.com?font=Stylish&size=30&duration=2000&pause=500&center=true&vCenter=true&multiline=true&repeat=false&random=false&width=535&height=100&lines=%EC%95%88%EB%85%95%ED%95%98%EC%84%B8%EC%9A%94!+%F0%9F%98%81;JEDU+%ED%8F%AC%ED%8A%B8%ED%8F%B4%EB%A6%AC%EC%98%A4+%EC%9E%85%EB%8B%88%EB%8B%A4!)](https://git.io/typing-svg)

</div>

</br>

## 📝 JEDU 프로젝트 소개

1. 프로젝트 개요
   + 국비 프로젝트 중 하나로 기업과 연계해서 프로젝트를 진행함
   + 바둑을 배우고 싶어하는 사람에게 기초적인 지식을 제공하고, 즐거운 경험을 통해 흥미를 유발하는 동시에, 체계적으로 바둑을 공부하려는 이들을 위해 제작

</br>
     
2. 개발기간 및 참여인원
   + 2024년 3월 18일 ~ 2024년 4월 22일 (약 4주)
   + 4명

</br>

3. 개발 상세 내용
     + 스프링 시큐리티 구현
     + 학생페이지 구현
       + 학습그룹
         + 그룹 조회 (가입, 승인중, 거절시 재가입 신)
         + 그룹 승입 여부
         + 나의 학습 그룹 조회 (나의 학습 진도율 및 그룹의 학생들 진도율 표시)
       +  학습그룹
         + 숙제조회
         + 제출이력, 데드라인, 숙제합격여부
     + 선생페이지 장바구니 및 결재 구현
       + TOSS API를 사용하여 결재 구현
       + ADMIN이 올린 게임컨텐츠 장바구니 담기 구현
     + AWS EC2를 활용하여 배포 및 구현
       + 윈도우에서 ./gradlew build후에 filezilla를 사용하여 배포함 
     
</br>
</br>

## 📝 ERD 구조
<img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/e2527bab-2af2-43d9-8644-7ff80bc9e2ff" width="1200" height="600">

## 📝 시스템 아키텍처
<img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/ae2fad39-9910-46ce-a4e0-eba36bafce4d" width="1200" height="600">

## 🔎 JEDU 개발 내용 소개

### 1. JEDU 홈페이지 메인
+ 메인 화면은 모든 사용자에게 열려 있으며, 회원과 비회원 모두 접근할 수 있습니다. 비회원들은 메인 화면을 통해 서비스 소개를 비롯하여 튜토리얼과 게임 일부를 체험할 수 있습니다.
+ 🔐 Spring Security를 사용하여 역할(role)을 나눈 후, 로그인 시 역할에 따라 th:block을 활용하여 학생, 선생님, 일반 사용자, 관리자 메뉴를 각각 설정해 놓았습니다.
<details>
   <summary>코드 펼치기/접기</summary>
   <img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/883c9353-9ee3-46c6-9730-0ca5260e5e49" width="1200" height="600">
</details>
<img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/f1500a2a-7e64-4dc3-b348-b4d8a9338444" width="1200" height="600">
<img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/fa27d8ae-4d2a-41fc-87b4-6906229af915" width="1200" height="600">
<img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/a3da11f3-f2da-4e45-8793-22e34af6786f" width="1200" height="600">

</br>
</br>
</br>
</br>
<hr>

### 2-1. 학생페이지 학습 그룹 조회
+ 학습 그룹 조회 페이지입니다.
+ 학습 그룹 페이지는 선생님이 등록한 학습 그룹을 한눈에 보기 쉽게 리스트 형태로 구성하였습니다.
+ 목록 개수가 7개를 초과하면 페이지네이션을 통해 페이징 처리할 수 있도록 구현해 두었습니다.
+ 또한, 초록색 버튼인 AI 찬스 버튼을 누르면 각각의 학생 레벨에 맞는 학습을 추천하도록 설정했습니다. 이를 위해 jQuery를 사용하여 AJAX (GET) 방식으로 데이터를 불러오도록 구현하였습니다.
<details>
   <summary>코드 펼치기/접기</summary>
   <img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/008eca20-ac0d-4274-a260-9804f7c6814b" width="900" height="400">
    <img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/8b627471-95bd-4e88-b98b-8eca4ed3ed15" width="1000" height="600">
    <img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/9696a920-dadc-4f89-8b4b-e5eea47b7368" width="900" height="400">
</details>
<img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/1df5833f-679b-4ec8-aeeb-b85bb1d593f4" width="1200" height="600">
<img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/2cff2a3a-a5f7-4c74-879c-05a34d99b778" width="1200" height="600">
<img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/60b83e38-5b04-4cea-9dd9-8d704b4108bf" width="1200" height="600">
<img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/1df5833f-679b-4ec8-aeeb-b85bb1d593f4" width="1200" height="600">

</br>
</br>
<hr>


### 2-2. 학생페이지 학습 그룹 신청
+ 학습 그룹 조회 후, 가입하고 싶은 그룹명을 클릭하면 해당 학습 그룹의 상세 정보를 확인하고 신청할 수 있는 기능을 추가했습니다.
+ 이 기능 또한 AJAX로 구현했으며, 승인 신청, 승인 중, 가입 완료, 거절 시 재가입 신청 등 다양한 상황에 대비하여 기능을 구현했습니다.
<img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/2537e11c-3cfc-4911-ae32-418d58bfa4e7" width="1200" height="600">
<img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/704e19e9-b197-453d-8246-fbc902b66b91" width="1200" height="600">
<img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/1417c6ff-8165-43bf-bcb9-889966127c82" width="1200" height="600">


</br>
</br>
<hr>

### 2-3. 학생페이지 학습 그룹 승인 여부
+ 학생의 편의를 위해 신청한 학습 그룹의 승인 상태를 확인할 수 있도록 별도의 페이지를 구성했습니다. 이 페이지에서는 신청한 학습 그룹이 승인되었는지, 거절되었는지, 아니면 아직 승인 중인지에 대한 정보를 제공합니다.
<img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/4f3c1c0e-9e14-4350-87f9-956bfb6fae0d" width="1200" height="600">

</br>
</br>
<hr>

### 2-4. 학생페이지 학습 그룹 진행 상황
+ 선생님이 미리 정해둔 수업 진행도와 선생님의 숙제 평가에 따라 수업 진행율을 학생이 볼 수 있도록 구현해 놓았습니다. 이를 통해 학생들은 자신의 학습 진행 상황을 쉽게 확인할 수 있습니다.
+ 가입된 학습 그룹을 클릭하면, 학생들이 자신의 학습 진행 상황 외에도 다른 학생들의 진행률을 볼 수 있도록 구현해 놓았습니다. 이는 약간의 자극제로 작용할 수 있도록 하기 위해 구현해 보았습니다.
<details>
   <summary>코드 펼치기/접기</summary>
   <img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/444b1c7a-6d9f-4865-a822-3d5ab430951b" width="900" height="400">
</details>
<img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/54e81f1a-3572-439c-8b4d-c623ae359b45" width="1200" height="600">
<img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/ba0eeb5d-b4a9-4d34-862e-1c514d791a55" width="1200" height="600">

</br>
</br>
<hr>

### 3-1. 학생페이지 숙제메뉴
+ 이 페이지에서는 선생님이 내어 주신 숙제를 확인할 수 있습니다. 학생들은 이 페이지에서 자신에게 할당된 숙제를 볼 수 있습니다.
+ 해당 숙제를 클릭하면 숙제의 상세 내용을 확인할 수 있으며, 바로 숙제를 풀어서 제출할 수 있도록 만들어 놓았습니다.
<img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/5465464b-9ad7-4b75-b273-a094cd04564f" width="1200" height="600">
<img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/39cb1ac6-63c4-4094-9c6b-1bc1a4d9169c" width="1200" height="600">

</br>
</br>
<hr>

### 3-2. 학생페이지 숙제 이력 페이지
+ 숙제 제출 이력 페이지는 다음과 같이 구성되어 있습니다:
   1. 숙제 제출 기한: 각 숙제의 제출 마감일을 확인할 수 있습니다. 날짜를 계산하여 표시를 해두었습니다. ex) 제출 D-10 / 제출 D+12 / 제출 완료
   2. 숙제 제출 현황: 제출한 숙제가 평가되었는지 여부를 표시합니다.
   3. 숙제 평가 확인: 평가가 완료된 숙제에 대한 평가 내용을 확인할 수 있습니다.
         + 선생님의 평가를 기반으로 “우수”, “보통”, “미흡” 으로 구분됩니다. 만약 사용자가 “우수” 또는 “보통”을 받으면 해당 스터디의 다음 단계로 진도를 나아갈 수 있습니다. 또한, “나의 학습 그룹” 페이지에서 해당 스터디의 진도율을 확인 할 수 있습니다.
<img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/88334efe-62d4-4013-b494-b23de6c8a6ec" width="1200" height="600">
<img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/1e06bab5-b1aa-409f-9645-697a202aeaf4" width="1200" height="600">
<img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/038114fc-ee25-468b-8698-21d9bb8a7259" width="1200" height="600">

</br>
</br>
<hr>

### 4. 선생페이지 장바구니 및 토스결제 API
+ 상대적으로 일찍 학생 페이지를 마무리한 저는 다른 조원의 기능 중 하나를 맡아서 구현해 보았습니다. 이 기능은 다음과 같습니다:
   1. 게임 콘텐츠 구매:
      + 선생님은 기본적으로 관리자가 만들어 놓은 게임 콘텐츠를 구매해야 해당 콘텐츠를 사용하여 학습 그룹을 만들 수 있습니다.
   2. 콘텐츠 구매 방식:
      + 관리자가 만들어 놓은 콘텐츠를 바로 결제할 수 있는 옵션과, 장바구니에 넣어서 한꺼번에 결제할 수 있는 옵션을 제공하여 콘텐츠를 구매할 수 있도록 구현하였습니다.
   3. 결제 프로세스:
      + 결제 프로세스에는 토스 API를 사용하였습니다. 이를 통해 안전하고 편리하게 결제가 이루어지도록 하였습니다.
<img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/c833495d-f46e-49c7-a2f8-bf1b8c21937d" width="1200" height="600">
<img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/bbcd7ade-bce7-4822-9d77-66d381319cf0" width="1200" height="600">
<img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/8ca7fce8-1c31-4fc7-9577-670d2ac0b1ac" width="1200" height="600">
<img src="https://github.com/jung4260/JEDU_portfolio/assets/41248229/e5bb6b55-b220-4098-ba41-8fcb7067793b" width="1200" height="600">

</br>
</br>
<hr>

## 📝 JEDU 프로젝트 소감
```이번 프로젝트를 진행하며 많은 것을 배울 수 있는 귀중한 경험이었습니다. 팀원들과 협력하여 각자의 역할을 수행하고, 여러 기능을 구현하는 과정을 통해 개발 능력을 향상시킬 수 있었습니다. 특히, Spring Security를 이용한 역할 기반 접근 제어와 jQuery를 활용한 AJAX 통신, 시각적데이터를 위한 백엔드 설계 그리고 토스 API를 사용한 결제 시스템 구축 등 다양한 기술을 적용해보는 기회가 되었습니다.```
<br>
<br>
```초기에 학생 페이지를 일찍 마무리하면서 다른 조원의 기능 구현을 도왔던 경험은, 협업의 중요성을 다시 한 번 깨닫게 해주었습니다. 또한, 데이터베이스 연결 및 처리 과정에서 발생한 문제들을 해결하면서 문제 해결 능력을 키울 수 있었습니다.```
<br>
<br>
```프로젝트를 성공적으로 마무리하면서, 기능 구현과 버그 해결, 그리고 최종 테스트까지 모든 과정을 통해 얻은 지식과 경험이 앞으로의 개발자 커리어에 큰 도움이 될 것이라 확신합니다. 팀원들과 함께 목표를 달성해가는 과정이 매우 의미 있었고, 앞으로도 이런 협업과 성취감을 느낄 수 있는 프로젝트를 많이 해보고 싶습니다.```
