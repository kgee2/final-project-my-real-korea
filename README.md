# My Real Korea
국내 여행 상품/티켓 구매 & 동행 찾기
<div>
    <p>배포 주소 (AWS EC2) : 
        <a href="http://52.79.213.21:8090/my-real-korea">http://52.79.213.21:8090/my-real-korea</a>
    </p>
</div>        
<br>

# 프로젝트 개요
<div>
    <h3>참여 인원</h3>
    <p>9명</p>   
    <h3>프로젝트 기간</h3>
    <p>2023.03.27 - 2023.04.28</p>   
</div>
<br>

# 사용 기술
<div>
    <div>
        <img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white">
        <img src="https://img.shields.io/badge/SpringBoot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white">
        <img src="https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white">
    </div>
    <div>
        <img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=white"> 
        <img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white"> 
        <img src="https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white"> 
        <img src="https://img.shields.io/badge/Bootstrap5-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white">
    </div>
    <div>
        <img src="https://img.shields.io/badge/jQuery-0769AD?style=for-the-badge&logo=jquery&logoColor=white">
        <img src="https://img.shields.io/badge/Ajax-258CCF?style=for-the-badge&logo=Ajax&logoColor=white">
        <img src="https://img.shields.io/badge/Handlebars.js-000000?style=for-the-badge&logo=Handlebars.js&logoColor=white">
    </div>       
    <div>
        <img src="https://img.shields.io/badge/Oracle-F80000?style=for-the-badge&logo=oracle&logoColor=white"> 
        <img src="https://img.shields.io/badge/MyBatis-bf0603?style=for-the-badge&logo=MybatislogoColor=white">
    </div>
    <div>
        <img src="https://img.shields.io/badge/Github-181717?style=for-the-badge&logo=github&logoColor=white">
        <img src="https://img.shields.io/badge/AWS EC2-232F3E?style=for-the-badge&logo=amazonaws&logoColor=white"> 
    </div>  
</div>
<br>

<div>
    <table>
        <thead>
            <tr>
            </tr>
        </thead>
        <tbody>
            <tr>
                <th>Language</th>
                <th>Java 1.8, JavaScript, HTML/CSS </th>
            </tr>
            <tr>
                <th>Server</th>
                <th>Apache Tomcat 9.0.73</th>
            </tr>
            <tr>
                <th>Framework</th>
                <th>SpringBoot, MyBatis 2.3.0, BootStrap5</th>
            </tr>            
            <tr>
                <th>DB</th>
                <th>Oracle</th>
            </tr>            
            <tr>
                <th>IDE</th>
                <th>Spring Tool Suite4(STS) - Gradle</th>
            </tr>
            <tr>
                <th>API</th>
                <th>kakao Login, Daum 주소, Google Maps, PortOne</th>
            </tr> 
            <tr>
                <th>Library</th>
                <th>Thymeleaf, Handlebars, jQuery</th>
            </tr>
            <tr>
                <th>ETC</th>
                <th>Github, AWS EC2</th>
            </tr>                                               
        </tbody>
    </table>
</div>
<br>


# 전체 기능
### 1. 회원
- 회원가입 - Daum 주소, 이메일 인증 
- 로그인 - kakao 로그인, 아이디/비밀번호 찾기
- 마이페이지 - 프로필 사진 업로드, 회원 정보 수정
- 관리자 페이지 - 전체 회원 관리
  
### 2. 티켓/투어 상품
- 상품 조회 - 정렬, 검색, 지역별 필터링
- 상품 상세 보기
- 상품 결제 - PortOne
- 상품 리뷰 CRUD, 파일 업로드

### 3. 동행 / 자유 게시판
- 게시글, 댓글 CRUD
- 정렬, 검색, 지역별/모집 상태별 필터링

### 4. 1:1 실시간 채팅
- 동행 게시글 작성자와 1:1 채팅
  
### 5. 공지사항 CRUD

### 6. 위시리스트 CRUD


<br>
<br>

# 담당 기능

## 회원 가입 
- 아이디 유효성 검사
  
  ![join_id](https://github.com/kgee2/my-real-korea/assets/117699823/f1852ad4-080d-42f5-a7ac-fd3ef410b646)

- 비밀번호 유효성 검사
  
    ![join_pw](https://github.com/kgee2/kgee2/assets/117699823/9813355e-2266-4970-83ff-e0323349170e)

- 주소 찾기 (Daum 주소 API)
  
    ![join_add](https://github.com/kgee2/kgee2/assets/117699823/5ad11e68-79c7-448f-9279-922b868dc481)

<br>

## 로그인 
- 이메일 인증 (Java Mail API)
  
    ![login_auth](https://github.com/kgee2/kgee2/assets/117699823/fd4617df-8ce7-4e51-8e32-d1bea2871e96)

- 비밀번호 찾기

    - 복호화가 불가능한 bCryptPasswordEncoder 때문에 원래의 비밀번호를 찾을 수 없기 때문에 임시 비밀번호 생성
    - 아이디와 이메일이 일치하는 회원의 이메일로 임시 비밀번호 발송


    ![find_pw](https://github.com/kgee2/kgee2/assets/117699823/5a07b824-4135-46ee-94c4-e1abe810cd8c)

- 카카오 로그인

  - 카카오 계정으로 가입한 회원의 아이디는 K_ + 카카오 프로필에서 가져온 ID (10자리 숫자)의 조합
  - 데이터베이스에 등록되어 있지 않은 아이디라면 회원 가입, 등록되어 있는 아이디라면 로그인
  - 이메일 주소, 닉네임, 성별을 수집하여 회원 데이터베이스에 등록 
  
  ![login_kakao](https://github.com/kgee2/kgee2/assets/117699823/c2d17beb-d68f-4187-b230-24e6f15cb71c) 

<br>
   
## 회원 정보 
- 프로필 사진 업로드   
  - MultipartResolver를 사용하여 파일 업로드
  - UUID 를 사용하여 파일 이름 변경 후 directory에 저장 
     
   ![mypage_upload](https://github.com/kgee2/kgee2/assets/117699823/d4158a69-e572-4045-860f-8ae916781b70)

- 관리자 페이지
    - 전체 회원 관리
 
  ![mypage_admin](https://github.com/kgee2/kgee2/assets/117699823/45d31250-73bb-4c14-9bbc-2cbfa38c0029)

