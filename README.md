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

# 개발 목적
<div>
국내 여행 ~~
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

# 선정 이유

<div>
    <table>
        <thead>
            <tr>
                <th>기술</th>
                <th>선정 이유</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <th>Java 1.8</th>
                <th>오랫동안 지원받을 수 있는 LTS 버전이며, 이전 버전의 Java 코드와 라이브러리를 이용하여 작업할 때 호환성 문제가 발생할 가능성이 낮아서 1.8 버전을 채택했습니다.</th>
            </tr>
            <tr>
                <th>SpringBoot 2.7.10</th>
                <th>내장 서버를 지원하여 서버 구축하는 시간을 단축할 수 있으며, 의존성 관리를 자동화하여 필요한 라이브러리를 쉽게 가져올 수 있어서 채택했습니다.</th>
            </tr>
            <tr>
                <th>Thymeleaf</th>
                <th></th>
            </tr>            
            <tr>
                <th>Handlebars.js</th>
                <th>문법이 간단하고 단순한 데이터 바인딩 작업에 효과적이라는 장점때문에 채택했습니다.</th>
            </tr>            
            <tr>
                <th>Ajax</th>
                <th></th>
            </tr>
            <tr>
                <th>jQuery</th>
                <th></th>
            </tr>                       
        </tbody>
    </table>
</div>
<br>


<!--
SpringBoot 2.7.10
Apache Tomcat 9.0.73
Mybatis 2.3.0
-->



# 주요 기능
## 회원

- 회원 가입 - 아이디 유효성 검사
  
  ![join_id](https://github.com/kgee2/my-real-korea/assets/117699823/f1852ad4-080d-42f5-a7ac-fd3ef410b646)

- 회원 가입 - 비밀번호 유효성 검사
  
    ![join_pw](https://github.com/kgee2/kgee2/assets/117699823/9813355e-2266-4970-83ff-e0323349170e)

- 회원 가입 - 주소 찾기
  
  Daum 주소 API

    ![join_add](https://github.com/kgee2/kgee2/assets/117699823/5ad11e68-79c7-448f-9279-922b868dc481)

- 로그인 - 이메일 인증
  
  Java Mail API
    ![login_auth](https://github.com/kgee2/kgee2/assets/117699823/fd4617df-8ce7-4e51-8e32-d1bea2871e96)

- 로그인 - 비밀번호 찾기

    - 복호화가 불가능한 bCryptPasswordEncoder 때문에 원래의 비밀번호를 찾을 수 없기 때문에 임시 비밀번호 생성
    - 아이디와 이메일이 일치하는 회원의 이메일로 임시 비밀번호 발송


    ![find_pw](https://github.com/kgee2/kgee2/assets/117699823/5a07b824-4135-46ee-94c4-e1abe810cd8c)

- 로그인 - 카카오 로그인

    카카오 로그인 API
    - 카카오 계정으로 가입한 회원의 아이디는 K_ + 카카오 프로필에서 가져온 ID (10자리 숫자)의 조합
    - 데이터베이스에 등록되어 있지 않은 아이디라면 회원 가입, 등록되어 있는 아이디라면 로그인
    - 이메일 주소, 닉네임, 성별을 수집하여 회원 데이터베이스에 등록 
  
  ![login_kakao](https://github.com/kgee2/kgee2/assets/117699823/c2d17beb-d68f-4187-b230-24e6f15cb71c) 
    
- 회원 정보 - 프로필 사진 업로드   
    - MultipartResolver를 사용하여 파일 업로드
    - UUID 를 사용하여 파일 이름 변경 후 directory에 저장 
     
   ![mypage_upload](https://github.com/kgee2/kgee2/assets/117699823/d4158a69-e572-4045-860f-8ae916781b70)

- 회원 정보 - 관리자 페이지
    ![mypage_admin](https://github.com/kgee2/kgee2/assets/117699823/45d31250-73bb-4c14-9bbc-2cbfa38c0029)

