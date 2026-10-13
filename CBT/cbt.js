/* =====================================================================
   문제 데이터
   T 단답 / A 여러 줄 / S 순서(한글만 비교) / C 단일선택 / M 복수선택
   ans: 정확히 일치(공백·;·따옴표·마침표 무시), has: 모두 포함, any: 하나 이상 포함
   ===================================================================== */
const T=(l,show,o={})=>({k:'t',l,show,...o});
const A=(l,show,o={})=>({k:'a',l,show,...o});
const S=(l,show,seq)=>({k:'s',l,show,seq});
const C=(l,opts,ok)=>({k:'c',l,opts,ok});
const M=(l,opts,ok)=>({k:'m',l,opts,ok});
const PTS={A:5,B:10,C:6,D:10,E:16};

const Q=[
/* ============================== A ============================== */
{id:'A1',p:'A',title:'PRG 패턴',body:`
<p><code>PerfumeController</code>의 <code>survey()</code>는 설문을 저장한 뒤 <code>return "main";</code>이 아니라 <code>return "redirect:/";</code>를 반환한다. 그 이유를 설명한 다음 글의 빈칸 ①~③을 채우시오.</p>
<p>"redirect:/"를 반환하면 브라우저가 / 주소를 ( ① ) 방식으로 다시 요청한다. 그래서 사용자가 새로고침을 해도 설문 저장 요청이 다시 전송되지 않아 설문이 ( ② ) 저장되지 않는다. 이런 방식을 ( ③ ) 패턴이라 한다.</p>`,
 items:[T('①','GET',{ans:['get']}),T('②','중복 (두 번)',{any:['중복','두번','2번','여러']}),T('③','PRG (Post-Redirect-Get)',{any:['prg','redirect']})],
 exp:'POST /survey → 저장 → 302 redirect → 브라우저가 GET / 재요청. 새로고침해도 마지막 요청이 GET이라 POST가 재전송되지 않는다.'},

{id:'A2',p:'A',title:'GET 과 POST',body:`
<p>결과 페이지의 삭제 기능은 <code>&lt;a href="/delete/3"&gt;</code> 같은 링크(GET)가 아니라 POST 요청으로 처리한다. 그 이유를 설명한 다음 글의 빈칸 ①~②를 채우시오.</p>
<p>GET 은 데이터를 ( ① )할 때 쓰는 요청이고, 저장·수정·삭제처럼 데이터를 바꾸는 요청은 ( ② )(으)로 보낸다. GET 으로 삭제를 만들면 주소만 열어도 삭제가 실행되어 위험하다.</p>`,
 items:[T('①','조회',{any:['조회','읽']}),T('②','POST',{ans:['post']})],exp:''},

{id:'A3',p:'A',title:'Entity 와 DTO 분리',body:`
<p>기준 코드는 같은 필드를 가진 <code>PerfumeEntity</code>와 <code>PerfumeDTO</code>를 따로 만들어 사용한다.</p>
<p>(1) 다음 글의 빈칸 ①~②를 채우시오. "<code>PerfumeEntity</code>는 DB의 ( ① )과(와) 연결되는 객체이고, <code>PerfumeDTO</code>는 화면, Controller, Service 사이에서 ( ② )를 주고받는 데 쓰는 객체이다."</p>
<p>(2) 둘을 나누어 쓰는 이유로 알맞은 것을 [보기]에서 <b>모두</b> 고르시오.</p>`,
 items:[T('(1) ①','테이블 (의 행/레코드)',{any:['테이블','table','행','레코드']}),T('(1) ②','데이터',{any:['데이터','data']}),
  M('(2)',['㉠ 화면이 바뀌어도 Entity(테이블)는 영향을 덜 받는다.','㉡ 테이블 구조가 화면에 그대로 드러나는 것을 막는다.','㉢ DB 조회 속도가 빨라진다.'],[0,1])],
 exp:'㉢ 속도와는 무관하다. 분리의 목적은 화면 변경과 테이블 구조 노출로부터 서로를 보호하는 것.'},

{id:'A4',p:'A',title:'계층 구조',body:`
<p>(1) 다음 설명 (가)~(다)에 알맞은 계층을 [Controller, Service, Repository] 중에서 골라 쓰시오.</p>
<table class="t"><tr><th>기호</th><th>설명</th></tr>
<tr><td>가</td><td>요청 URL을 받아 파라미터를 DTO로 받고, 보여줄 화면이나 리다이렉트를 결정한다.</td></tr>
<tr><td>나</td><td>DTO↔Entity 변환, 정렬 조건 설정, 성별 집계 같은 업무 로직을 처리한다.</td></tr>
<tr><td>다</td><td>DB에 데이터를 저장·조회·삭제한다.</td></tr></table>
<p>(2) 계층을 나누어 얻는 좋은 점으로 <b>알맞지 않은</b> 것을 고르시오.</p>`,
 items:[C('(1) 가',['Controller','Service','Repository'],0),C('(1) 나',['Controller','Service','Repository'],1),C('(1) 다',['Controller','Service','Repository'],2),
  C('(2)',['㉠ 한 계층을 고쳐도 다른 계층에 영향이 적다','㉡ 같은 로직을 여러 곳에서 재사용하기 쉽다','㉢ 프로그램 실행 속도가 빨라진다'],2)],exp:''},

{id:'A5',p:'A',title:'의존성 주입(DI)',body:`
<p><code>PerfumeController</code>의 <code>private final PerfumeService ps;</code> 필드에는 <code>new PerfumeService()</code> 코드가 없는데도 객체가 들어 있다. 그 원리를 설명한 다음 글의 빈칸 ①~③을 채우시오.</p>
<p><code>PerfumeService</code>에 붙은 ( ① ) 어노테이션 때문에, 스프링은 시작할 때 이 클래스의 객체를 만들어 스프링 컨테이너에 <b>빈</b>으로 등록한다. <code>PerfumeController</code>에 붙은 ( ② ) 어노테이션은 <code>final</code> 필드를 매개변수로 받는 생성자를 만들고, 스프링은 이 생성자를 호출하면서 컨테이너의 빈을 넣어 준다. 이처럼 필요한 객체를 스프링이 넣어 주는 것을 ( ③ )이라 한다.</p>`,
 items:[T('①','@Service',{ans:['@service','service']}),T('②','@RequiredArgsConstructor',{ans:['@requiredargsconstructor','requiredargsconstructor']}),T('③','의존성 주입 (DI)',{any:['di','의존성주입','의존관계주입','dependencyinjection']})],exp:''},

{id:'A6',p:'A',title:'뷰 반환',body:`
<p><code>mainPage()</code>는 문자열 <code>"main"</code>을 반환한다. (1) 이때 화면으로 사용되는 파일의 경로를 쓰시오. (2) 클래스에 <code>@Controller</code> 대신 <code>@RestController</code>가 붙어 있다면 브라우저에 무엇이 표시되는지 쓰시오.</p>`,
 items:[T('(1)','src/main/resources/templates/main.html',{has:['templates','main.html']}),T('(2)','화면 대신 문자열 main 이 그대로 출력된다 (응답 본문)',{any:['main','문자열','텍스트']})],exp:'@RestController는 반환값을 뷰 이름이 아니라 응답 본문 그대로 내보낸다.'},

{id:'A7',p:'A',title:'트랜잭션',body:`
<p><code>PerfumeService</code> 클래스에 붙은 <code>@Transactional</code>에 대한 설명이다. 빈칸 ①~③을 채우시오.</p>
<p>클래스의 각 메서드를 하나의 ( ① )(으)로 실행한다. 메서드가 정상적으로 끝나면 ( ② )하여 DB에 반영하고, 실행 중 예외가 발생하면 ( ③ )하여 그 메서드에서 한 DB 작업을 모두 취소한다.</p>`,
 items:[T('①','트랜잭션',{any:['트랜잭션','transaction']}),T('②','커밋 (commit)',{any:['커밋','commit']}),T('③','롤백 (rollback)',{any:['롤백','rollback']})],exp:''},

{id:'A8',p:'A',title:'ddl-auto 설정',body:`
<p><code>application.properties</code>의 <code>spring.jpa.hibernate.ddl-auto=update</code>에 대한 질문이다.</p>
<p>(1) 다음 글의 빈칸을 채우시오. "애플리케이션이 시작될 때 ( ① ) 클래스를 기준으로, DB에 없는 테이블이나 컬럼을 자동으로 만든다."</p>
<p>(2) 실제 서비스(운영) 서버에서 권장하는 값을 하나 쓰시오.</p>`,
 items:[T('(1) ①','Entity',{any:['entity','엔티티']}),T('(2)','none (또는 validate)',{any:['none','validate']})],exp:''},

{id:'A9',p:'A',title:'JPA 이름 매핑',body:`
<p><code>PerfumeEntity</code>의 필드는 perfume 테이블의 컬럼과 연결된다. (1) <code>favoriteScent</code> 필드와 (2) <code>completionTime</code> 필드가 연결되는 컬럼 이름을 각각 쓰고, (3) 필드 이름이 컬럼 이름으로 바뀔 때 대문자는 어떻게 바뀌는지 한 줄로 쓰시오.</p>`,
 items:[T('(1)','favorite_scent',{ans:['favorite_scent']}),T('(2)','completion_time',{ans:['completion_time']}),T('(3)','대문자 앞에 밑줄(_)이 붙고 소문자로 바뀐다 (camelCase → snake_case)',{any:['_','밑줄','언더']})],exp:''},

{id:'A10',p:'A',title:'Repository 인터페이스',body:`
<p><code>PerfumeRepository</code>는 메서드를 하나도 선언하지 않았는데 Service에서 <code>save()</code>, <code>findAll()</code>, <code>findById()</code>를 사용할 수 있다. (1) 이 메서드들은 어떤 인터페이스를 상속받아서 쓸 수 있는 것인지 인터페이스 이름을 쓰시오. (2) <code>JpaRepository&lt;PerfumeEntity, Integer&gt;</code>의 두 타입이 각각 무엇인지 [Entity 타입, 기본키 타입] 중에서 골라 쓰시오.</p>`,
 items:[T('(1)','JpaRepository',{ans:['jparepository']}),C('(2) PerfumeEntity',['Entity 타입','기본키 타입'],0),C('(2) Integer',['Entity 타입','기본키 타입'],1)],exp:''},

/* ============================== B ============================== */
{id:'B1',p:'B',title:'설문 등록 흐름',body:`
<p>main.html에서 모든 항목을 올바르게 입력하고 [설문 제출] 버튼을 눌렀다.</p>
<p>(1) 다음 보기를 실행 순서대로 나열하시오. (예: 가 나 다 …)</p>
<table class="t">
<tr><td>가</td><td><code>PerfumeRepository</code>의 <code>save()</code>가 INSERT SQL을 실행한다</td></tr>
<tr><td>나</td><td><code>main.js</code>에서 입력값 유효성 검사를 한다</td></tr>
<tr><td>다</td><td>브라우저가 GET / 를 요청하고 main 화면이 표시된다</td></tr>
<tr><td>라</td><td>폼 데이터가 POST /survey 로 전송된다</td></tr>
<tr><td>마</td><td><code>PerfumeService</code>의 <code>save()</code>에서 DTO를 Entity로 변환한다</td></tr>
<tr><td>바</td><td><code>survey()</code>가 요청 파라미터를 <code>PerfumeDTO</code>로 받는다</td></tr>
<tr><td>사</td><td>Controller가 <code>"redirect:/"</code>를 반환한다</td></tr></table>
<p>(2) 이름을 비워 둔 채 [설문 제출]을 누르면 어느 단계에서 멈추는지 기호를 쓰고, 이때 폼 전송을 막는 main.js의 메서드 이름을 쓰시오.</p>`,
 items:[S('(1)','나 → 라 → 바 → 마 → 가 → 사 → 다','나라바마가사다'),T('(2) 기호','나',{ans:['나']}),T('(2) 메서드','e.preventDefault()',{has:['preventdefault']})],exp:''},

{id:'B2',p:'B',title:'정렬 결과 예측',body:`
<p>perfume 테이블에 다음 데이터가 저장되어 있다.</p>
<table class="t"><tr><th>번호</th><th>이름</th><th>성별</th><th>나이</th><th>작성 시간</th></tr>
<tr><td>1</td><td>김민수</td><td>남성</td><td>25</td><td>2026-10-01 10:00</td></tr>
<tr><td>2</td><td>이서연</td><td>여성</td><td>30</td><td>2026-10-01 11:00</td></tr>
<tr><td>3</td><td>박지훈</td><td>남성</td><td>25</td><td>2026-10-02 09:00</td></tr>
<tr><td>4</td><td>최유진</td><td>여성</td><td>22</td><td>2026-10-02 10:00</td></tr>
<tr><td>5</td><td>정하늘</td><td>여성</td><td>30</td><td>2026-10-03 08:00</td></tr>
<tr><td>6</td><td>강태호</td><td>남성</td><td>31</td><td>2026-10-03 09:00</td></tr></table>
<pre><code>Sort.by(Sort.Order.desc("gender"), Sort.Order.asc("age"), Sort.Order.desc("completionTime"))</code></pre>
<p>(1) 기준 코드의 <code>selectAll()</code>이 반환하는 목록의 순서대로 이름을 쓰시오.<br>(2) result.html의 <code>&lt;h2&gt;</code> 영역에 출력되는 내용을 쓰시오.<br>※ 문자열 정렬은 가나다순이 오름차순이다.</p>
<p class="note2">※ 참고 — result.html 일부 (12~17행)</p>
<pre><code>&lt;h2&gt;
    응답자(
    &lt;span th:text="| 여 &#36;{genderCnt['여성'] ?: 0}|" class="female"&gt;0&lt;/span&gt;
    &lt;span th:text="| 남 &#36;{genderCnt['남성'] ?: 0}|" class="male"&gt;0&lt;/span&gt;
    )
&lt;/h2&gt;</code></pre>`,
 items:[S('(1)','최유진 → 정하늘 → 이서연 → 박지훈 → 김민수 → 강태호','최유진정하늘이서연박지훈김민수강태호'),T('(2)','응답자( 여 3 남 3 )',{has:['여3','남3']})],
 exp:'gender 내림차순(가나다 \'남성\'<\'여성\' → 내림차순이면 여성 먼저) → 여성은 나이 오름차순(최유진 22, 30살끼리는 작성 시간 내림차순: 정하늘 10-03, 이서연 10-01) → 남성은 25살끼리 작성 시간 내림차순(박지훈, 김민수) 후 강태호 31.'},

{id:'B3',p:'B',title:'성별 집계',body:`
<p>Service의 <code>count()</code> 메서드와 result.html의 <code>&lt;h2&gt;</code>에 대한 질문이다.</p>
<p>(1) 성별이 순서대로 [여성, 남성, 여성, 여성, 남성]인 목록을 넣었을 때 반환되는 Map의 내용을 쓰시오.<br>
(2) 저장된 설문이 여성 2건뿐일 때 <code>&lt;h2&gt;</code>에 출력되는 내용을 쓰시오.<br>
(3) 저장된 설문이 하나도 없을 때 <code>&lt;h2&gt;</code>에 출력되는 내용을 쓰시오.</p>
<p class="note2">※ 참고 — result.html 일부 (12~17행)</p>
<pre><code>&lt;h2&gt;
    응답자(
    &lt;span th:text="| 여 &#36;{genderCnt['여성'] ?: 0}|" class="female"&gt;0&lt;/span&gt;
    &lt;span th:text="| 남 &#36;{genderCnt['남성'] ?: 0}|" class="male"&gt;0&lt;/span&gt;
    )
&lt;/h2&gt;</code></pre>
[[snip:c7:69-92:PerfumeService의 count() 메서드]]`,
 items:[T('(1)','{여성=3, 남성=2}',{has:['여성=3','남성=2']}),T('(2)','응답자( 여 2 남 0 )',{has:['여2','남0']}),T('(3)','응답자( 여 0 남 0 )',{has:['여0','남0']})],
 exp:'result.html: <code>&#36;{genderCnt[\'여성\'] ?: 0}</code> — 키가 없으면(null) 0.'},

{id:'B4',p:'B',title:'유효성 검사 추적',body:`
<p>main.js의 유효성 검사에 대한 질문이다. (1)~(4) 각 상황에서 표시되는 alert 메시지를 쓰시오. (표시되지 않으면 "없음")</p>
<table class="t"><tr><th>상황</th><th>입력 내용</th></tr>
<tr><td>(1)</td><td>이름: 홍길동 / 성별: 선택 안 함 / 나이: 비움 / 나머지 비움</td></tr>
<tr><td>(2)</td><td>이름: 공백 3칸 / 나머지 모두 올바르게 입력</td></tr>
<tr><td>(3)</td><td>나이: -5 / 나머지 모두 올바르게 입력</td></tr>
<tr><td>(4)</td><td>이름·성별·나이·향기 올바르게 입력, 사용 빈도는 건드리지 않음, 브랜드 비움</td></tr></table>
[[snip:c11:6-63:main.js의 유효성 검사]]
[[snip:c9:44-64:main.html의 사용 빈도 선택]]`,
 items:[T('(1)','"성별을 선택하세요."',{has:['성별']}),T('(2)','"이름을 입력하세요."',{has:['이름']}),T('(3)','"올바른 나이를 입력하세요."',{has:['나이']}),T('(4)','"선호하는 향수 브랜드를 입력하세요."',{has:['브랜드']})],
 exp:'검사 순서: 이름 → 성별 → 나이 → 향기 → 사용 빈도 → 브랜드 → 예산. 먼저 걸린 항목 하나만 alert 후 return. 사용 빈도 라디오는 "사용하지 않음"이 checked 기본값이라 (4)에서 통과한다.'},

{id:'B5',p:'B',title:'삭제 흐름 추적',body:`
<p>결과 페이지에서 번호(no)가 5 인 설문의 행을 클릭했다.</p>
<p>(1) 클릭한 행의 번호를 넘기는 다음 코드의 빈칸 ①~②를 채우시오.</p>
<pre><code>&lt;!-- result.html --&gt;
&lt;tr th:____①____="&#36;{p.no}" class="result-tr"&gt; ... &lt;/tr&gt;

// result.js
let no = event.currentTarget.____②____.no;</code></pre>
<p>(2) 확인창에서 [취소]를 누르면 서버로 요청이 가는지 쓰시오.<br>(3) [확인]을 누르면 서버로 가는 요청의 HTTP 메서드와 URL을 쓰시오.<br>(4) 삭제를 마친 뒤 브라우저가 다시 요청하는 URL을 쓰시오.</p>
[[snip:c12:6-21:result.js]]
[[snip:c8:61-70:PerfumeController의 삭제 메서드]]`,
 items:[T('(1) ①','data-no',{ans:['data-no','th:data-no']}),T('(1) ②','dataset',{ans:['dataset']}),C('(2)',['간다','안 간다'],1),T('(3)','POST /delete/5',{has:['post','/delete/5']}),T('(4)','/result  (GET, redirect:/result)',{has:['/result']})],
 exp:'confirm()이 false면 if 블록이 실행되지 않아 요청이 가지 않는다. 확인 시 JS가 가상 form을 만들어 POST 제출.'},

/* ============================== C ============================== */
{id:'C1',p:'C',title:'빈(Bean) 등록',body:`
<p><code>PerfumeService</code> 클래스를 다음과 같이 작성하고 애플리케이션을 실행했다.</p>
<pre><code>@Slf4j
@Transactional
@RequiredArgsConstructor
public class PerfumeService {
    private final PerfumeRepository pr;
    // ... (메서드 생략)
}</code></pre>
<p>[증상] 실행하자마자 애플리케이션이 종료되며 다음 메시지가 출력된다.</p>
<pre><code>Parameter 0 of constructor in net.datasa.survey.controller.PerfumeController
required a bean of type 'net.datasa.survey.service.PerfumeService'
that could not be found.</code></pre>
<p>(1) 이 클래스에 빠진 어노테이션을 쓰시오. (2) 그 어노테이션이 없으면 왜 위 오류가 나는지 한 줄로 쓰시오.</p>`,
 items:[T('(1)','@Service',{ans:['@service','service']}),T('(2)','스프링이 빈으로 등록하지 않아, Controller 생성자에 주입할 PerfumeService 빈을 찾을 수 없기 때문',{any:['빈','bean']})],exp:''},

{id:'C2',p:'C',title:'정렬 기준 이름',body:`
<p>Service의 <code>selectAll()</code> 정렬 코드를 다음과 같이 작성했다.</p>
<pre><code>Sort sort = Sort.by(
    Sort.Order.desc("gender"),
    Sort.Order.asc("age"),
    Sort.Order.desc("completion_time")
);</code></pre>
<p>[증상] 결과 페이지(/result)에 접속하면 500 오류 화면이 나타나고, 로그에 다음 메시지가 남는다.</p>
<pre><code>[응답 결과] 실패.. No property 'completion' found for type 'PerfumeEntity'</code></pre>
<p>DB에는 completion_time 컬럼이 분명히 있다. (1) <code>Sort.Order</code>에 넣는 이름은 [DB 컬럼명, Entity 필드명] 중 무엇인지 쓰시오. (2) 세 번째 정렬 조건을 고쳐 쓰시오.</p>`,
 items:[C('(1)',['DB 컬럼명','Entity 필드명'],1),A('(2)','Sort.Order.desc("completionTime")',{has:['desc','completiontime']})],exp:'JPA는 컬럼이 아니라 Entity 필드(camelCase) 기준으로 정렬한다.'},

{id:'C3',p:'C',title:'경로 변수',body:`
<p>삭제 메서드를 다음과 같이 작성했다.</p>
<pre><code>@PostMapping("/delete/{no}")
public String deleteSurvey(@PathVariable("num") Integer no) {
    // ... (생략)
}</code></pre>
<p>[증상] 행을 클릭하고 [확인]을 누르면 500 오류 화면이 나타나고, 로그에 다음 메시지가 남는다.</p>
<pre><code>MissingPathVariableException: Required URI template variable 'num'
for method parameter type Integer is not present</code></pre>
<p>(1) 매핑 경로에 있는 경로 변수 이름과 <code>@PathVariable</code>에 적힌 이름을 각각 쓰시오. (2) 메서드 선언 줄을 고쳐 쓰시오.</p>`,
 items:[T('(1) 경로 변수','no',{ans:['no']}),T('(1) @PathVariable','num',{ans:['num']}),A('(2)','public String deleteSurvey(@PathVariable("no") Integer no) {',{has:['@pathvariable("no")']})],exp:'경로의 {no}와 @PathVariable("…") 이름이 같아야 한다.'},

{id:'C4',p:'C',title:'요청 파라미터 바인딩',body:`
<p>main.html의 선호 향 선택 부분을 다음과 같이 작성했다.</p>
<pre><code>&lt;select id="favoriteScent" name="favorite_scent"&gt;</code></pre>
<p>[증상] 설문을 제출하면 저장은 되지만, DB를 확인하면 favorite_scent 컬럼만 NULL이다.</p>
<p>(1) 요청 파라미터 값이 DTO에 들어가려면 <code>name</code> 속성 값이 무엇과 같아야 하는지 쓰시오. (2) 위 코드를 고쳐 쓰시오.</p>
[[snip:c5:14-25:PerfumeDTO]]`,
 items:[T('(1)','DTO의 필드 이름 (favoriteScent)',{any:['favoritescent','필드','dto']}),A('(2)','<select id="favoriteScent" name="favoriteScent">',{has:['name="favoritescent"']})],exp:'폼 name은 DTO 필드명(camelCase) 그대로. DB 컬럼명(snake_case)이 아니다.'},

{id:'C5',p:'C',title:'타입 변환 실패(400)',body:`
<p>main.js가 동작하지 않는 상황(예: JS 파일 연결 누락)에서 다른 항목은 모두 입력하고 나이만 비운 채 설문을 제출했다.</p>
<p>[증상] 400 Bad Request 오류 화면이 나타나고, 로그에 age 필드의 typeMismatch(타입 변환 실패) 메시지가 남는다.</p>
<p>(1) <code>PerfumeDTO</code>의 <code>age</code> 필드 타입을 쓰고, 빈 값이 오면 왜 오류가 나는지 한 줄로 쓰시오. (2) 빈 값이 null로 들어와 오류가 나지 않게 하려면 <code>age</code>의 타입을 무엇으로 바꾸면 되는지 쓰시오.</p>
[[snip:c5:14-25:PerfumeDTO]]`,
 items:[T('(1) 타입','int',{ans:['int']}),T('(1) 이유','int는 null을 가질 수 없어 빈 값("")을 변환하지 못한다',{any:['null','변환','숫자']}),T('(2)','Integer',{ans:['integer']})],exp:''},

{id:'C6',p:'C',title:'예외 처리',body:`
<p>Controller의 <code>survey()</code> 메서드는 다음과 같다.</p>
<pre><code>@PostMapping("/survey")
public String survey(PerfumeDTO perfume) {
    try {
        ps.save(perfume);
        log.debug("[등록 결과] 성공");
    } catch (Exception e) {
        log.debug("[설문 등록] 실패..");
    }
    return "redirect:/";
}</code></pre>
<p>[증상] DB 서버가 꺼진 상태에서 사용자가 설문을 제출했다. 사용자는 30초쯤 기다린 뒤 아무 안내 없이 메인 화면으로 돌아왔고, 설문은 저장되지 않았다. 운영 서버(로그 레벨 info)에는 라이브러리가 남긴 DB 연결 오류만 있고, 우리 코드가 남긴 실패 로그는 없다.</p>
<p>(1) 운영 서버에 "[설문 등록] 실패.." 로그가 남지 않은 이유를 로그 레벨과 연결해 한 줄로 쓰시오. (2) catch 블록의 로그 코드를 error 레벨로, 예외 내용(e)까지 남기도록 고쳐 쓰시오.</p>`,
 items:[T('(1)','운영 서버 로그 레벨이 info라서 그보다 낮은 debug 로그는 출력되지 않는다',{has:['info','debug']}),A('(2)','log.error("[설문 등록] 실패..", e);',{has:['log.error(',',e)']})],exp:''},

{id:'C7',p:'C',title:'HTTP 메서드 매핑(405)',body:`
<p>설문 등록 메서드를 다음과 같이 작성했다.</p>
<pre><code>@GetMapping("/survey")
public String survey(PerfumeDTO perfume) {
    // ... (생략)
}</code></pre>
<p>[증상] [설문 제출]을 누르면 <code>Method Not Allowed, status=405</code> 오류 화면이 나타난다.</p>
<p>(1) main.html의 폼이 보내는 HTTP 메서드와 위 코드가 받는 HTTP 메서드를 각각 쓰고, 첫 줄을 고쳐 쓰시오. (2) 404 오류와 405 오류의 차이를 한 줄로 쓰시오.</p>
[[snip:c9:12-12:main.html의 폼 태그]]`,
 items:[T('(1) 폼이 보내는','POST',{ans:['post']}),T('(1) 코드가 받는','GET',{ans:['get']}),T('(1) 고친 첫 줄','@PostMapping("/survey")',{has:['@postmapping("/survey")']}),
  T('(2)','404: URL에 연결된 처리기가 없음 / 405: URL은 있으나 HTTP 메서드가 맞지 않음',{any:['메서드','method']})],exp:''},

{id:'C8',p:'C',title:'DB 제약조건',body:`
<p>main.html의 성별 선택을 다음과 같이 바꿨다.</p>
<pre><code>&lt;option value="남자"&gt;남성&lt;/option&gt;
&lt;option value="여자"&gt;여성&lt;/option&gt;</code></pre>
<p>[증상] 설문을 제출하면 메인 화면으로 돌아오지만 저장되지 않는다. 로그에 <code>Check constraint 'perfume_chk_1' is violated.</code>가 남는다.</p>
<p>(1) 남성을 선택했을 때 서버로 전송되는 gender 값을 쓰시오. (2) perfume 테이블의 gender 컬럼에 저장할 수 있는 값 2가지를 쓰시오. (3) 위 코드를 고쳐 쓰시오.</p>
[[snip:c1:2-13:perfume 테이블 정의(SQL)]]`,
 items:[T('(1)','남자',{ans:['남자']}),T('(2)',"'남성', '여성'",{has:['남성','여성']}),A('(3)','<option value="남성">남성</option>\n<option value="여성">여성</option>',{has:['value="남성"','value="여성"']})],exp:'화면에 보이는 글자가 아니라 value 값이 전송된다. CHECK (gender IN (\'남성\', \'여성\')).'},

/* ============================== D ============================== */
{id:'D1',p:'D',title:'CREATE TABLE 완성',body:`
<p>향수 설문의 후기를 저장하는 perfume_review 테이블을 만들려고 한다. 명세를 보고 SQL의 빈칸 ①~⑥을 채우시오. (MySQL 기준)</p>
<table class="t"><tr><th>컬럼명</th><th>타입</th><th>제약조건</th></tr>
<tr><td>review_no</td><td>integer</td><td>기본키, 자동 증가</td></tr>
<tr><td>perfume_no</td><td>integer</td><td>not null, perfume 테이블의 no 참조(외래키)</td></tr>
<tr><td>rating</td><td>integer</td><td>not null, 1 이상 5 이하만 허용</td></tr>
<tr><td>content</td><td>varchar(500)</td><td>not null</td></tr>
<tr><td>created_at</td><td>timestamp</td><td>기본값: 현재 시간</td></tr></table>
<pre><code>CREATE TABLE perfume_review (
    review_no   INTEGER       ____①____ PRIMARY KEY,
    perfume_no  INTEGER       NOT NULL,
    rating      INTEGER       NOT NULL CHECK (____②____),
    content     VARCHAR(500)  ____③____,
    created_at  TIMESTAMP     ____④____ CURRENT_TIMESTAMP,
    ____⑤____ (perfume_no) ____⑥____ perfume(no)
);</code></pre>`,
 items:[T('①','AUTO_INCREMENT',{ans:['auto_increment']}),T('②','rating BETWEEN 1 AND 5  (또는 rating >= 1 AND rating <= 5)',{any:['between1and5','>=1']}),T('③','NOT NULL',{ans:['notnull']}),T('④','DEFAULT',{ans:['default']}),T('⑤','FOREIGN KEY',{ans:['foreignkey']}),T('⑥','REFERENCES',{ans:['references']})],exp:''},

{id:'D2',p:'D',title:'집계 SQL 완성',body:`
<p>perfume 테이블에서 선호 향별 응답 수를 조회하려 한다. SQL의 빈칸 ①~④를 채우고 물음에 답하시오.</p>
<pre><code>-- (1) 선호 향별 응답 수 (응답 수가 많은 순, 같으면 향 이름 오름차순)
SELECT favorite_scent AS '선호 향',
       ____①____      AS '응답 수'
FROM   perfume
____②____ favorite_scent
ORDER BY ____③____;

-- (2) (1)에서 응답 수가 2건 이상인 향만 조회
SELECT favorite_scent AS '선호 향',
       COUNT(*)       AS '응답 수'
FROM   perfume
GROUP BY favorite_scent
____④____
ORDER BY COUNT(*) DESC, favorite_scent ASC;</code></pre>
<p>(3) ④에 WHERE를 쓸 수 없는 이유로 맞는 것을 고르시오.</p>`,
 items:[T('①','COUNT(*)',{ans:['count(*)']}),T('②','GROUP BY',{ans:['groupby']}),T('③','COUNT(*) DESC, favorite_scent ASC',{has:['count(*)desc']}),T('④','HAVING COUNT(*) >= 2',{has:['having','count(*)','2']}),
  C('(3)',['㉠ WHERE는 그룹으로 묶기 전에 행을 거르므로 COUNT(*)를 조건으로 쓸 수 없다','㉡ WHERE는 ORDER BY 뒤에만 쓸 수 있다'],0)],
 exp:'실행 순서: FROM → WHERE → GROUP BY → HAVING → SELECT → ORDER BY. 집계 결과 조건은 HAVING.'},

{id:'D3',p:'D',title:'조회 기능 빈칸 채우기',body:`
<p>(1) 다음은 설문 결과를 조회하는 Controller 메서드와 result.html의 일부이다. 빈칸 ①~⑧을 채우시오.</p>
<pre><code>@____①____("/result")
public String result(____②____ model) {
    List&lt;PerfumeDTO&gt; surveyResponselist = ps.____③____();
    model.____④____("surveyResponselist", surveyResponselist);

    Map&lt;String, Integer&gt; genderCnt = ps.count(surveyResponselist);
    model.addAttribute("genderCnt", genderCnt);
    return "____⑤____";
}

&lt;tr th:____⑥____="p : &#36;{____⑦____}" class="result-tr" th:data-no="&#36;{p.no}"&gt;
    &lt;td th:text="&#36;{____⑧____}"
        th:classappend="&#36;{p.gender} == '남성' ? 'male' : 'female'"&gt;이름&lt;/td&gt;
    ...
&lt;/tr&gt;</code></pre>
<p>(2) Controller에서 Model에 담는 이름만 <code>"list"</code>로 바꾸고 result.html은 그대로 두었다. 결과로 알맞은 것을 고르시오.</p>
[[snip:c7:40-40:PerfumeService의 메서드 선언]]
[[snip:c5:14-25:PerfumeDTO]]`,
 items:[T('①','GetMapping',{ans:['getmapping','@getmapping']}),T('②','Model',{ans:['model']}),T('③','selectAll',{ans:['selectall']}),T('④','addAttribute',{ans:['addattribute']}),T('⑤','result',{ans:['result']}),T('⑥','each',{ans:['each']}),T('⑦','surveyResponselist',{ans:['surveyresponselist']}),T('⑧','p.name',{ans:['p.name']}),
  C('(2)',['㉠ 500 오류 화면','㉡ 표 머리글만 나오고 데이터 행이 없음','㉢ 정상 표시'],1)],
 exp:'${surveyResponselist}가 null이면 th:each는 에러 없이 0번 반복(행 없음). genderCnt는 그대로라 상단 응답자 수는 정상.'},

{id:'D4',p:'D',title:'조건 조회 메서드 완성',body:`
<p>나이가 N 세 이상인 응답자를 작성 시간 최신순으로 조회하는 기능을 만들려고 한다.</p>
<p>(1) <code>PerfumeRepository</code>에 추가할 쿼리 메서드 선언을 한 줄로 쓰시오. (참고 시트의 이름 규칙 사용, 반환 타입은 <code>List&lt;PerfumeEntity&gt;</code>)</p>
<p>(2) <code>PerfumeService</code>의 다음 메서드에서 빈칸 ①~④를 채우시오. (<code>toDTO()</code>는 Entity를 DTO로 바꾸는 메서드로, 이미 있다고 가정한다)</p>
<pre><code>public List&lt;PerfumeDTO&gt; selectByMinAge(int age) {
    List&lt;PerfumeEntity&gt; entityList = ____①____;
    List&lt;PerfumeDTO&gt; dtoList = new ArrayList&lt;&gt;();
    for (PerfumeEntity entity : ____②____) {
        dtoList.____③____(toDTO(entity));
    }
    return ____④____;
}</code></pre>
[[snip:c4:20-36:PerfumeEntity]]
[[snip:c7:18-24:PerfumeService의 필드]]`,
 items:[A('(1)','List<PerfumeEntity> findByAgeGreaterThanEqualOrderByCompletionTimeDesc(int age);',{has:['findbyagegreaterthanequal','orderbycompletiontimedesc']}),
  T('(2) ①','pr.findByAgeGreaterThanEqualOrderByCompletionTimeDesc(age)',{has:['findbyagegreaterthanequalorderbycompletiontimedesc(age)']}),T('(2) ②','entityList',{ans:['entitylist']}),T('(2) ③','add',{ans:['add']}),T('(2) ④','dtoList',{ans:['dtolist']})],
 exp:'findBy + Age + GreaterThanEqual(이상) + OrderBy + CompletionTime + Desc. 필드명은 Entity camelCase를 대문자 시작으로.'},

{id:'D5',p:'D',title:'DTO → Entity 변환 완성',body:`
<p>(1) <code>PerfumeService</code>의 <code>save()</code> 메서드에서 빈칸 ①~④를 채우시오.</p>
<pre><code>public void save(PerfumeDTO perfume) {
    PerfumeEntity entity = PerfumeEntity.____①____()
        .name(perfume.____②____())
        .gender(perfume.getGender())
        // ... (나머지 필드도 같은 방식)
        .comments(perfume.getComments())
        .____③____();
    ____④____;
}</code></pre>
<p>(2) Entity를 만들 때 <code>no</code>와 <code>completionTime</code>에는 값을 넣지 않는다. 각각 값을 넣어 주는 것을 [DB의 자동 증가, JPA Auditing] 중에서 골라 쓰시오.</p>
[[snip:c7:18-24:PerfumeService의 필드]]`,
 items:[T('①','builder',{ans:['builder']}),T('②','getName',{ans:['getname']}),T('③','build',{ans:['build']}),T('④','pr.save(entity)',{ans:['pr.save(entity)','save(entity)']}),
  C('(2) no',['DB의 자동 증가','JPA Auditing'],0),C('(2) completionTime',['DB의 자동 증가','JPA Auditing'],1)],
 exp:'no: @GeneratedValue(IDENTITY) / completionTime: @CreatedDate + @EntityListeners(AuditingEntityListener.class) + @EnableJpaAuditing.'},

/* ============================== E ============================== */
{id:'E1',p:'E',title:'수정 기능 완성',body:`
<p>결과 페이지의 각 행에 [수정] 버튼을 추가하려 한다. 버튼을 누르면 기존 값이 채워진 수정 화면(edit.html)이 열리고, 값을 고쳐 저장하면 결과 페이지로 돌아온다.</p>
<p>(1) 요청 설계표의 빈칸 ①~④를 채우시오.</p>
<table class="t"><tr><th>기능</th><th>HTTP 메서드</th><th>URL</th><th>처리 후 반환값</th></tr>
<tr><td>수정 화면 열기</td><td>( ① )</td><td>/edit/{no}</td><td>( ② )</td></tr>
<tr><td>수정 내용 저장</td><td>( ③ )</td><td>/edit/{no}</td><td>( ④ )</td></tr></table>
<p>(2) Controller, Service, View 코드의 빈칸 ⑤~⑧을 채우시오.</p>
<pre><code>// PerfumeController
@GetMapping("/edit/{no}")
public String editForm(____⑤____("no") Integer no, Model model) {
    PerfumeDTO dto = ps.selectOne(no);
    model.____⑥____("perfume", dto);
    return "edit";
}

// PerfumeService (@Transactional이 붙어 있어 메서드가 끝나면 변경 내용이 UPDATE 된다)
public void update(Integer no, PerfumeDTO dto) {
    PerfumeEntity entity = pr.____⑦____(no)
        .orElseThrow(() -&gt; new EntityNotFoundException("설문 정보가 없습니다."));
    entity.setName(dto.getName());
    // ... (나머지 값도 같은 방식으로 변경)
}

&lt;!-- edit.html : 기존 이름을 입력칸에 채워 보여 준다 --&gt;
&lt;input type="text" name="name" ____⑧____="&#36;{perfume.name}"&gt;</code></pre>
<p>(3) 없는 번호로 /edit/99 를 요청했을 때 발생하는 예외의 클래스 이름을 위 코드에서 찾아 쓰시오.</p>
[[snip:c7:18-24:PerfumeService의 필드]]
[[snip:c8:42-43:PerfumeController의 결과 조회 메서드]]`,
 items:[T('①','GET',{ans:['get']}),T('②','"edit"',{ans:['edit']}),T('③','POST',{ans:['post']}),T('④','"redirect:/result"',{ans:['redirect:/result']}),
  T('⑤','@PathVariable',{ans:['@pathvariable','pathvariable']}),T('⑥','addAttribute',{ans:['addattribute']}),T('⑦','findById',{ans:['findbyid']}),T('⑧','th:value',{ans:['th:value']}),
  T('(3)','EntityNotFoundException',{ans:['entitynotfoundexception']})],
 exp:'update()에서 pr.save()를 안 불러도 @Transactional 안에서 영속 상태 Entity의 값을 바꾸면 커밋 시점에 UPDATE(더티 체킹). 저장 쪽 Controller 예: @PostMapping("/edit/{no}") … ps.update(no, dto); return "redirect:/result";'},

{id:'E2',p:'E',title:'선호 향 검색 기능 완성',body:`
<p>결과 페이지 위쪽에 선호 향 선택 상자와 [검색] 버튼을 추가하여, 선택한 향의 응답만 표에 보이게 하려 한다. "전체"를 선택하면 모든 응답이 보이고, 응답자 수(여/남)도 검색 결과를 기준으로 표시한다.</p>
<p>(1) 다음 글의 빈칸 ①~②를 채우시오.<br>검색은 데이터를 조회하는 기능이므로 ( ① ) 메서드를 쓰고, 검색 조건은 <code>/result?scent=꽃향</code>처럼 주소 뒤에 붙이는 ( ② )(으)로 보낸다.</p>
<p>(2) Controller, Repository, View 코드의 빈칸 ③~⑧을 채우시오.</p>
<pre><code>// PerfumeController
@GetMapping("/result")
public String result(____③____(value = "scent", required = false) String scent,
                     Model model) {
    List&lt;PerfumeDTO&gt; list;
    if (scent == null || scent.isEmpty()) {
        list = ps.____④____();          // 전체 조회
    } else {
        list = ps.selectByScent(scent); // 검색
    }
    model.addAttribute("surveyResponselist", list);
    model.addAttribute("genderCnt", ps.count(____⑤____));
    return "result";
}

// PerfumeRepository
List&lt;PerfumeEntity&gt; ____⑥____(String favoriteScent, Sort sort);

&lt;!-- result.html --&gt;
&lt;form action="/result" method="____⑦____"&gt;
    &lt;select name="____⑧____"&gt;
        &lt;option value=""&gt;전체&lt;/option&gt;
        &lt;option value="꽃향"&gt;꽃향&lt;/option&gt; ...
    &lt;/select&gt;
    &lt;button&gt;검색&lt;/button&gt;
&lt;/form&gt;</code></pre>
<p>(3) ③에서 <code>required = false</code>를 빼면, 검색 조건 없이 /result 로 처음 접속했을 때 몇 번 오류가 나는지 상태 코드를 쓰시오.</p>
[[snip:c7:40-47:PerfumeService의 selectAll()]]`,
 items:[T('①','GET',{ans:['get']}),T('②','쿼리 스트링 (쿼리 파라미터)',{any:['쿼리','query']}),
  T('③','@RequestParam',{ans:['@requestparam','requestparam']}),T('④','selectAll',{ans:['selectall']}),T('⑤','list',{ans:['list']}),T('⑥','findByFavoriteScent',{ans:['findbyfavoritescent']}),T('⑦','GET',{ans:['get']}),T('⑧','scent',{ans:['scent']}),
  T('(3)','400',{ans:['400']})],
 exp:'⑤는 전체가 아니라 검색 결과 목록(list) 기준으로 성별을 세야 하므로 list. required=false가 없으면 scent 파라미터 누락 → 400(MissingServletRequestParameterException).'}
];

/* =====================================================================
   채점 · 상태
   ===================================================================== */
const $=s=>document.querySelector(s);
const norm=s=>String(s).toLowerCase().replace(/:/g,'=').replace(/[\s;"'`“”‘’.]/g,'');
function grade(it,v){
  if(it.k==='c') return v===it.ok;
  if(it.k==='m'){const a=[...(v||[])].sort().join(),b=[...it.ok].sort().join();return a===b}
  if(it.k==='s') return (v||'').replace(/[^가-힣]/g,'')===it.seq;
  const n=norm(v||''); if(!n) return false;
  let ok=false;
  if(it.ans) ok=it.ans.some(x=>norm(x)===n);
  if(!ok&&(it.has||it.any)) ok=(!it.has||it.has.every(x=>n.includes(norm(x))))&&(!it.any||it.any.some(x=>n.includes(norm(x))));
  return ok;
}
const filled=(it,v)=>it.k==='c'?v!=null:it.k==='m'?!!(v&&v.length):!!(v||'').trim();
const CIRC='①②③④⑤⑥⑦⑧';

let ST=null;
function newState(set,mode,limit,name){
  ST={set,mode,limit,name,cur:0,done:false,rev:new Set(),ov:{},timer:null,t:limit>0?limit*60:0,
      ans:Object.fromEntries(set.map(q=>[q.id,q.items.map(it=>it.k==='m'?[]:it.k==='c'?null:'')]))};
}
const mark=(q,n)=>{const o=ST.ov[q.id]&&ST.ov[q.id][n];return o!=null?o:grade(q.items[n],ST.ans[q.id][n])};
const qStat=q=>{const f=q.items.filter((it,n)=>filled(it,ST.ans[q.id][n])).length;return f===0?0:f===q.items.length?2:1};
const qRatio=q=>q.items.filter((_,n)=>mark(q,n)).length/q.items.length;
const showFb=q=>ST.done||ST.rev.has(q.id);

/* ---------- 시작 ---------- */
const shuf=a=>{for(let i=a.length-1;i>0;i--){const j=Math.floor(Math.random()*(i+1));[a[i],a[j]]=[a[j],a[i]]}return a};
$('#goBtn').onclick=()=>{
  const sel=document.querySelector('input[name=sset]:checked').value;
  const mode=document.querySelector('input[name=smode]:checked').value;
  let set;
  if(sel==='all') set=Q.slice();
  else if(sel==='part') set=Q.filter(q=>q.p===$('#sPart').value);
  else{
    const want={A:4,B:2,C:4,D:2,E:1};set=[];
    for(const p in want){const pool=shuf(Q.filter(q=>q.p===p));set.push(...pool.slice(0,want[p]))}
  }
  // 파트 순서(A→E)는 유지하고, 체크하면 각 파트 안에서 문제 순서를 섞는다
  set=Object.keys(PTS).flatMap(p=>{const g=set.filter(q=>q.p===p);return $('#sShuf').checked?shuf(g):g.sort((a,b)=>Q.indexOf(a)-Q.indexOf(b))});
  newState(set,mode,Math.max(0,parseInt($('#sMin').value)||0),$('#sName').value.trim());
  $('#start').classList.add('hide');$('#result').classList.add('hide');$('#exam').classList.remove('hide');
  $('#hName').textContent=ST.name?'수험자: '+ST.name:'';
  $('#cTotal').textContent=set.length;
  $('#cMode').textContent=mode==='study'?'[학습 모드]':'[시험 모드]';
  $('#legend').innerHTML='<span><i style="background:#fff"></i>안 품</span><span><i style="background:#cfe0f5"></i>일부</span><span><i style="background:#2f6db5"></i>입력 완료</span>';
  tick();ST.timer=setInterval(tick,1000);
  window.onbeforeunload=e=>{e.preventDefault();e.returnValue=''};
  draw();
};
document.querySelectorAll('input[name=sset]').forEach(r=>r.onchange=()=>{$('#sMin').value=r.value==='all'?120:r.value==='mock'?60:30});

/* ---------- 타이머 ---------- */
function fmt(t){const h=String(Math.floor(t/3600)).padStart(2,'0'),m=String(Math.floor(t%3600/60)).padStart(2,'0'),s=String(t%60).padStart(2,'0');return `${h}:${m}:${s}`}
function tick(){
  if(ST.done)return;
  const el=$('#timer');
  if(ST.limit>0){ if(ST.t<=0){submit();return} el.textContent=fmt(ST.t);el.classList.toggle('warn',ST.t<=300);ST.t--; }
  else{ el.textContent=fmt(ST.t);ST.t++; }
}

/* ---------- 화면 그리기 ---------- */
function draw(){drawQ();drawPal();drawFtr();drawCount()}
function drawCount(){$('#cLeft').textContent=ST.set.filter(q=>qStat(q)!==2).length}
function drawPal(){
  $('#pal').innerHTML=ST.set.map((q,i)=>{
    let c=['','some','all'][qStat(q)];
    if(ST.done){const r=qRatio(q);c=r===1?'r-ok':r===0?'r-ng':'r-pt'}
    return `<button class="${c} ${i===ST.cur?'cur':''}" data-i="${i}" title="${q.id} ${q.title}">${i+1}</button>`;
  }).join('');
  if(ST.done)$('#legend').innerHTML='<span><i style="background:#2e7d32"></i>만점</span><span><i style="background:#ffb74d"></i>부분</span><span><i style="background:#c62828"></i>0점</span>';
}
$('#pal').onclick=e=>{const b=e.target.closest('button');if(b){ST.cur=+b.dataset.i;draw();$('#qpanel').scrollTop=0}};

function drawQ(){
  const q=ST.set[ST.cur],fb=showFb(q),a=ST.ans[q.id];
  let h=`<div class="qh"><span class="qn">문제 ${ST.cur+1}.</span><span>[${q.id}] ${q.title}</span><span class="pt">${q.p} 파트 · ${PTS[q.p]}점</span></div><div class="qb">${snips(q.body)}</div>`;
  h+=`<div class="ansbox"><h4>답안 입력</h4>`;
  q.items.forEach((it,n)=>{
    const v=a[n],dis=fb?'disabled':'';
    h+=`<div class="it"><span class="lb">${it.l}</span>`;
    if(it.k==='t')h+=`<input type="text" data-n="${n}" value="${esc(v)}" ${dis} autocomplete="off" spellcheck="false">`;
    else if(it.k==='s')h+=`<input type="text" data-n="${n}" value="${esc(v)}" ${dis} placeholder="순서대로 기호를 나열 (예: 가 나 다 …)" autocomplete="off">`;
    else if(it.k==='a')h+=`<textarea data-n="${n}" ${dis} spellcheck="false">${esc(v)}</textarea>`;
    else if(it.k==='c')h+=`<span class="opts">${it.opts.map((o,j)=>`<label><input type="radio" name="r${n}" data-n="${n}" value="${j}" ${v===j?'checked':''} ${dis}> ${o}</label>`).join('')}</span>`;
    else h+=`<span class="opts">${it.opts.map((o,j)=>`<label><input type="checkbox" data-n="${n}" value="${j}" ${(v||[]).includes(j)?'checked':''} ${dis}> ${o}</label>`).join('')}</span>`;
    if(fb){
      const ok=mark(q,n),cor=it.k==='c'?it.opts[it.ok]:it.k==='m'?it.ok.map(j=>it.opts[j]).join(' / '):it.show;
      h+=`<div class="fb ${ok?'ok':'ng'}"><button class="mk" data-mk="${n}" title="클릭하면 ○/× 변경">${ok?'○ 정답':'× 오답'}</button>정답: <span class="cor">${it.k==='a'?'<pre style="margin:4px 0">'+esc(cor)+'</pre>':it.k==='t'||it.k==='s'?esc(cor):cor}</span></div>`;
    }
    h+=`</div>`;
  });
  h+=`</div>`;
  if(fb&&q.exp)h+=`<div class="exp"><b>해설</b> ${q.exp}</div>`;
  $('#qpanel').innerHTML=h;
}
function esc(s){return String(s==null?'':s).replace(/&/g,'&amp;').replace(/</g,'&lt;').replace(/>/g,'&gt;').replace(/"/g,'&quot;')}

$('#qpanel').addEventListener('input',e=>save(e));
$('#qpanel').addEventListener('change',e=>save(e));
function save(e){
  const el=e.target,q=ST.set[ST.cur];if(el.dataset.n==null)return;
  const n=+el.dataset.n,it=q.items[n],arr=ST.ans[q.id];
  if(it.k==='c')arr[n]=+el.value;
  else if(it.k==='m'){const s=new Set(arr[n]);el.checked?s.add(+el.value):s.delete(+el.value);arr[n]=[...s]}
  else arr[n]=el.value;
  drawPal();drawCount();
}
$('#qpanel').addEventListener('click',e=>{
  const b=e.target.closest('[data-mk]');if(!b)return;
  const q=ST.set[ST.cur],n=+b.dataset.mk;
  (ST.ov[q.id]=ST.ov[q.id]||{})[n]=!mark(q,n);
  const sc=$('#qpanel').scrollTop;drawQ();drawPal();$('#qpanel').scrollTop=sc;
});

/* ---------- 하단 버튼 ---------- */
function drawFtr(){
  const q=ST.set[ST.cur],last=ST.set.length-1;
  let h=`<button class="btn" id="bPrev" ${ST.cur===0?'disabled':''}>◀ 이전</button><button class="btn" id="bNext" ${ST.cur===last?'disabled':''}>다음 ▶</button>`;
  if(!ST.done){
    h+=`<button class="btn" id="bLeft">안 푼 문제</button>`;
    if(ST.mode==='study'&&!ST.rev.has(q.id))h+=`<button class="btn" id="bReveal" style="border-color:#2e7d32;color:#2e7d32">정답 확인</button>`;
    h+=`<span class="sp"></span><button class="btn pri" id="bSubmit">답안 제출</button>`;
  }else h+=`<span class="sp"></span><button class="btn" id="bRes">결과 요약</button><button class="btn pri" id="bAgain">처음으로</button>`;
  $('#ftr').innerHTML=h;
  const g=id=>document.getElementById(id);
  g('bPrev').onclick=()=>go(ST.cur-1);g('bNext').onclick=()=>go(ST.cur+1);
  if(g('bLeft'))g('bLeft').onclick=()=>{
    const n=ST.set.length;for(let k=1;k<=n;k++){const i=(ST.cur+k)%n;if(qStat(ST.set[i])!==2){go(i);return}}
    modal('안내','모든 문제를 풀었습니다.',[['확인']]);
  };
  if(g('bReveal'))g('bReveal').onclick=()=>{ST.rev.add(q.id);draw()};
  if(g('bSubmit'))g('bSubmit').onclick=()=>{
    const left=ST.set.filter(q=>qStat(q)!==2).length;
    modal('답안 제출',`안 푼 문제 수: <b>${left}</b>개<br>답안을 제출하시겠습니까?<br><small>제출 후에는 답안을 수정할 수 없습니다.</small>`,[['취소'],['최종 제출',submit,1]]);
  };
  if(g('bRes'))g('bRes').onclick=showResult;
  if(g('bAgain'))g('bAgain').onclick=()=>{location.hash='';location.reload()};
}
function go(i){if(i<0||i>=ST.set.length)return;ST.cur=i;draw();$('#qpanel').scrollTop=0}
function modal(t,b,btns){
  $('#mTitle').textContent=t;$('#mBody').innerHTML=b;
  const bt=$('#mBtns');bt.innerHTML='';
  btns.forEach(([label,fn,pri])=>{const x=document.createElement('button');x.className='btn'+(pri?' pri':'');x.textContent=label;x.onclick=()=>{$('#modal').classList.add('hide');fn&&fn()};bt.appendChild(x)});
  $('#modal').classList.remove('hide');
}

/* ---------- 제출 · 결과 ---------- */
function submit(){
  if(ST.done)return;
  ST.done=true;clearInterval(ST.timer);window.onbeforeunload=null;
  $('#modal').classList.add('hide');
  showResult();
}
function calc(){
  let got=0,max=0;
  ST.set.forEach(q=>{max+=PTS[q.p];got+=PTS[q.p]*qRatio(q)});
  return {got,max};
}
function showResult(){
  $('#exam').classList.add('hide');$('#result').classList.remove('hide');
  $('#rName').textContent=ST.name?'수험자: '+ST.name:'';
  const {got,max}=calc();
  const full=ST.set.filter(q=>qRatio(q)===1).length;
  let h=`<div class="score"><h2>득점 결과</h2><div class="big">${got.toFixed(1)} <span style="font-size:.5em;color:#666">/ ${max}점</span></div>
  <div class="sm">정답률 ${(got/max*100).toFixed(1)}% · 만점 문항 ${full} / ${ST.set.length} · 100점 환산 ${(got/max*100).toFixed(1)}점<br>
  <small>서술형·코드 답은 자동 채점이 느슨하거나 엄격할 수 있으니, 문제 보기에서 ○/×를 직접 고치면 점수가 바로 반영됩니다.</small></div></div>
  <div class="score"><h2>문항별 결과</h2><table class="rt"><tr><th>번호</th><th>문제</th><th>정답 / 전체 빈칸</th><th>득점</th><th>결과</th><th></th></tr>`;
  ST.set.forEach((q,i)=>{
    const ok=q.items.filter((_,n)=>mark(q,n)).length,r=ok/q.items.length,pt=PTS[q.p]*r;
    const c=r===1?'m-ok">○':r===0?'m-ng">×':'m-pt">△';
    h+=`<tr><td>${i+1}</td><td class="l">[${q.id}] ${q.title}</td><td>${ok} / ${q.items.length}</td><td>${pt.toFixed(1)} / ${PTS[q.p]}</td><td class="${c}</td><td><button class="btn" data-rv="${i}">문제 보기</button></td></tr>`;
  });
  h+=`</table></div><div style="text-align:center;margin:14px"><button class="btn pri big" id="rAgain">처음으로</button></div>`;
  $('#resBody').innerHTML=h;
  $('#resBody').onclick=e=>{
    const b=e.target.closest('[data-rv]');
    if(b){ST.cur=+b.dataset.rv;$('#result').classList.add('hide');$('#exam').classList.remove('hide');draw()}
    if(e.target.id==='rAgain'){location.hash='';location.reload()}
  };
}

/* ---------- 글자 크기 ---------- */
document.querySelectorAll('.fsz button').forEach(b=>b.onclick=()=>{
  document.documentElement.style.setProperty('--fs',b.dataset.fs+'px');
  document.querySelectorAll('.fsz button').forEach(x=>x.classList.toggle('on',x.dataset.fs===b.dataset.fs));
});

/* ===== 부록 2 기준 코드 (프로젝트 파일에서 생성) ===== */
const CODE=[{"id":"c1","t":"2-1. SQL","file":"과목평가_SQL.sql","path":"docs/과목평가_SQL.sql","lang":"sql","hint":"테이블 정의. gender의 CHECK('남성','여성') → C8·D1 / completion_time DEFAULT CURRENT_TIMESTAMP / favorite_scent 같은 snake_case 컬럼 → A9","text":"-- 테이블\ncreate table perfume (\n\tno\t\t\t\tinteger\t\t\tauto_increment \t\tprimary key,\n\tname\t\t\tvarchar(30)\t\tnot null,\n\tgender\t\t\tvarchar(10)\t\tCHECK (gender IN ('남성', '여성')),\n\tage\t\t\t\tinteger\t\t\tnot null,\n\tfavorite_scent\tvarchar(50),\n\tusage_frequency\tvarchar(50),\n\tfavorite_brand\tvarchar(50),\n\tpurchase_budget\tvarchar(50),\n\tcomments\t\tvarchar(200),\n\tcompletion_time\tTIMESTAMP \t\tDEFAULT CURRENT_TIMESTAMP\n);\n\nselect \n\tno \t\t\t\tas '번호',\n\tname \t\t\tas '이름',\n\tgender \t\t\tas '성별',\n\tfavorite_scent \tas '선호 향',\n\tfavorite_brand \tas '선호 브랜드',\n\tusage_frequency as '사용 빈도',\n\tpurchase_budget as '구매 예산',\n\tcomments \t\tas '의견',\n\tcompletion_time as '설문 시간'\nfrom \n\tperfume;\n\n\ndesc perfume;\ncommit;"},{"id":"c2","t":"2-2. 설정","file":"application.properties","path":"src/main/resources/application.properties","lang":"properties","hint":"ddl-auto=update → A8 / 로그 레벨 info·debug → C6 / 포트 9000. ※ 원본 PDF는 DB가 busan14, 이 PC 프로젝트는 test2로 바꿔 둔 것.","text":"spring.application.name=survey\n\n# url\nserver.port=9000\nserver.servlet.context-path=/\n\n# log\nlogging.level.root=info\nlogging.level.net.datasa.survey=debug\n\n# MySql\nspring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver\nspring.datasource.url=jdbc:mysql://localhost:3306/test2?useSSL=false&serverTimezone=Asia/Seoul&useUnicode=true&characterEncoding=UTF-8\nspring.datasource.username=root\nspring.datasource.password=root\n\n### Hibernate SQL 로그\n# SQL 문 출력\nlogging.level.org.hibernate.SQL=debug\n# 파라미터 값 출력\nlogging.level.org.hibernate.type.descriptor.sql=trace\n\n### JPA 설정\n# 테이블 자동 생성/갱신\nspring.jpa.hibernate.ddl-auto=update\n# MySQL 8용 방언\nspring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect\n\n### SQL 출력 관련 설정\n# System.out 로그 비활성화 (logger 방식만 사용)\nspring.jpa.show-sql=false\n# Logger 기반 SQL 출력\nspring.jpa.properties.hibernate.show_sql=true\n# SQL 포맷팅 출력\nspring.jpa.properties.hibernate.format_sql=true"},{"id":"c3","t":"2-3. 시작 클래스","file":"SurveyApplication.java","path":"src/main/java/net/datasa/survey/SurveyApplication.java","lang":"java","hint":"@EnableJpaAuditing (Auditing 3종 중 하나) → D5","text":"package net.datasa.survey;\n\nimport org.springframework.boot.SpringApplication;\nimport org.springframework.boot.autoconfigure.SpringBootApplication;\nimport org.springframework.data.jpa.repository.config.EnableJpaAuditing;\n\n@EnableJpaAuditing\n@SpringBootApplication\npublic class SurveyApplication {\n\n\tpublic static void main(String[] args) {\n\t\tSpringApplication.run(SurveyApplication.class, args);\n\t}\n\n}\n"},{"id":"c4","t":"2-4. Entity","file":"PerfumeEntity.java","path":"src/main/java/net/datasa/survey/domain/entity/PerfumeEntity.java","lang":"java","hint":"@Entity·@Table·@Id·@GeneratedValue·@CreatedDate → A3·A9·D5 / no, completionTime은 값을 직접 넣지 않음","text":"package net.datasa.survey.domain.entity;\n\nimport jakarta.persistence.*;\nimport lombok.AllArgsConstructor;\nimport lombok.Builder;\nimport lombok.Data;\nimport lombok.NoArgsConstructor;\nimport org.springframework.data.annotation.CreatedDate;\nimport org.springframework.data.jpa.domain.support.AuditingEntityListener;\n\nimport java.time.LocalDateTime;\n\n@Entity\n@Table(name=\"perfume\")\n@Data\n@Builder\n@NoArgsConstructor\n@AllArgsConstructor\n@EntityListeners(AuditingEntityListener.class)\npublic class PerfumeEntity {\n\t@Id\n\t@GeneratedValue(strategy = GenerationType.IDENTITY)\n\tprivate Integer no;\t\t\t\t\t\t// 설문 번호\n\t\n\tprivate String \tname;\t\t\t\t\t// 이름\n\tprivate String \tgender;\t\t\t\t\t// 성별\n\tprivate int \tage;\t\t\t\t\t// 나이\n\tprivate String \tfavoriteScent;\t\t\t// 선호하는 향\n\tprivate String \tusageFrequency;\t\t\t// 사용 빈도\n\tprivate String \tfavoriteBrand;\t\t\t// 선호 브랜드\n\tprivate String \tpurchaseBudget;\t\t\t// 구매 예산\n\tprivate String \tcomments;\t\t\t\t// 추가 의견\n\t\n\t@CreatedDate\n    private LocalDateTime completionTime;\t// 설문 시간\n}\n"},{"id":"c5","t":"2-5. DTO","file":"PerfumeDTO.java","path":"src/main/java/net/datasa/survey/domain/dto/PerfumeDTO.java","lang":"java","hint":"age가 int → C5 / 필드명(camelCase)이 폼 name과 같아야 바인딩 → C4","text":"package net.datasa.survey.domain.dto;\n\nimport java.time.LocalDateTime;\n\nimport lombok.AllArgsConstructor;\nimport lombok.Builder;\nimport lombok.Data;\nimport lombok.NoArgsConstructor;\n\n@Data\n@Builder\n@NoArgsConstructor\n@AllArgsConstructor\npublic class PerfumeDTO {\n\tprivate Integer no;\t\t\t\t\t\t// 설문 번호\n\tprivate String \tname;\t\t\t\t\t// 이름\n\tprivate String \tgender;\t\t\t\t\t// 성별\n\tprivate int \tage;\t\t\t\t\t// 나이\n\tprivate String \tfavoriteScent;\t\t\t// 선호하는 향\n\tprivate String \tusageFrequency;\t\t\t// 사용 빈도\n\tprivate String \tfavoriteBrand;\t\t\t// 선호 브랜드\n\tprivate String \tpurchaseBudget;\t\t\t// 구매 예산\n\tprivate String \tcomments;\t\t\t\t// 추가 의견\n    private LocalDateTime completionTime;\t// 설문 시간\n}\n"},{"id":"c6","t":"2-6. Repository","file":"PerfumeRepository.java","path":"src/main/java/net/datasa/survey/repository/PerfumeRepository.java","lang":"java","hint":"JpaRepository<PerfumeEntity, Integer> → A10 / 쿼리 메서드는 여기에 선언 → D4·E2","text":"package net.datasa.survey.repository;\n\nimport net.datasa.survey.domain.entity.PerfumeEntity;\nimport org.springframework.data.jpa.repository.JpaRepository;\nimport org.springframework.stereotype.Repository;\n\n@Repository\npublic interface PerfumeRepository extends JpaRepository<PerfumeEntity, Integer>{\n\n}\n"},{"id":"c7","t":"2-7. Service","file":"PerfumeService.java","path":"src/main/java/net/datasa/survey/service/PerfumeService.java","lang":"java","hint":"@Service·@Transactional·@RequiredArgsConstructor → A5·A7·C1 / save()의 builder → D5 / selectAll()의 Sort → B2·C2 / count() → B3 / deleteById의 orElseThrow → E1","text":"package net.datasa.survey.service;\n\nimport jakarta.persistence.EntityNotFoundException;\nimport jakarta.transaction.Transactional;\nimport lombok.RequiredArgsConstructor;\nimport lombok.extern.slf4j.Slf4j;\nimport net.datasa.survey.domain.dto.PerfumeDTO;\nimport net.datasa.survey.domain.entity.PerfumeEntity;\nimport net.datasa.survey.repository.PerfumeRepository;\nimport org.springframework.data.domain.Sort;\nimport org.springframework.stereotype.Service;\n\nimport java.util.ArrayList;\nimport java.util.HashMap;\nimport java.util.List;\nimport java.util.Map;\n\n@Service\n@Slf4j\n@Transactional\n@RequiredArgsConstructor\npublic class PerfumeService {\n\n\tprivate final PerfumeRepository pr;\n\n\tpublic void save(PerfumeDTO perfume) {\n\t\tPerfumeEntity entity = PerfumeEntity.builder()\n\t\t\t\t\t\t\t   .name(perfume.getName())\n\t\t\t\t\t\t\t   .age(perfume.getAge())\n\t\t\t\t\t\t\t   .gender(perfume.getGender())\n\t\t\t\t\t\t\t   .favoriteScent(perfume.getFavoriteScent())\n\t\t\t\t\t\t\t   .usageFrequency(perfume.getUsageFrequency())\n\t\t\t\t\t\t\t   .favoriteBrand(perfume.getFavoriteBrand())\n\t\t\t\t\t\t\t   .purchaseBudget(perfume.getPurchaseBudget())\n\t\t\t\t\t\t\t   .comments(perfume.getComments())\n\t\t\t\t\t\t\t   .build();\n\t\tpr.save(entity);\n\t}\n\n\tpublic List<PerfumeDTO> selectAll() {\n\t\t\n    \tSort sort = Sort.by(\n\t\t\tSort.Order.desc(\"gender\"),\n\t\t\tSort.Order.asc(\"age\"),\n\t\t\tSort.Order.desc(\"completionTime\")\n\t\t);\n\t\tList<PerfumeEntity> entityList = pr.findAll(sort);\n\t\tList<PerfumeDTO>    dtoList    = new ArrayList<>();\n\t\t\n\t\tfor (PerfumeEntity entity : entityList) {\n\t\t\tPerfumeDTO dto = PerfumeDTO.builder()\n\t\t\t\t\t\t\t .no(entity.getNo())\n\t\t\t\t\t\t\t .name(entity.getName())\n\t\t\t\t\t\t\t .age(entity.getAge())\n\t\t\t\t\t\t\t .gender(entity.getGender())\n\t\t\t\t\t\t\t .favoriteScent(entity.getFavoriteScent())\n\t\t\t\t\t\t\t .usageFrequency(entity.getUsageFrequency())\n\t\t\t\t\t\t\t .favoriteBrand(entity.getFavoriteBrand())\n\t\t\t\t\t\t\t .purchaseBudget(entity.getPurchaseBudget())\n\t\t\t\t\t\t\t .comments(entity.getComments())\n\t\t\t\t\t\t\t .completionTime(entity.getCompletionTime())\n\t\t\t\t\t\t\t .build();\n\t\t\tdtoList.add(dto);\n\t\t}\n\t\t\n\t\treturn dtoList;\n\t}\n\n\tpublic Map<String, Integer> count(List<PerfumeDTO> surveyResponselist) {\n\t\t\n\t\tMap<String, Integer> map = new HashMap<>();\n\t\t\n\t\t// 1\n\t\tfor (PerfumeDTO dto : surveyResponselist) {\n\t        String gender = dto.getGender();\n\t        \n\t        if (map.containsKey(gender)) {\n\t            map.put(gender, map.get(gender) + 1);\n\t        } else {\n\t            map.put(gender, 1);\n\t        }\n\t    }\n\t\t\n\t\t// 2\n//\t\tmap = surveyResponselist.stream()\n//        .collect(Collectors.groupingBy(\n//            PerfumeDTO::getGender,\n//            Collectors.collectingAndThen(Collectors.counting(), Long::intValue)\n//        ));\n\t\t\n\t\treturn map;\n\t}\n\t\n\tpublic void deleteById(Integer no) {\n\t\t\n\t\tPerfumeEntity entity = pr.findById(no)\n\t\t\t\t.orElseThrow(() -> new EntityNotFoundException(\"설문 정보가 없습니다.\"));\n\t\t\n\t\tpr.delete(entity);\n\t}\n}\n"},{"id":"c8","t":"2-8. Controller","file":"PerfumeController.java","path":"src/main/java/net/datasa/survey/controller/PerfumeController.java","lang":"java","hint":"redirect:/ (PRG) → A1 / @PostMapping 삭제 → A2·C7 / @PathVariable → C3 / try-catch 로그 레벨 → C6 / 목록 조회 Model → D3","text":"package net.datasa.survey.controller;\n\nimport lombok.RequiredArgsConstructor;\nimport lombok.extern.slf4j.Slf4j;\nimport net.datasa.survey.domain.dto.PerfumeDTO;\nimport net.datasa.survey.service.PerfumeService;\nimport org.springframework.stereotype.Controller;\nimport org.springframework.ui.Model;\nimport org.springframework.web.bind.annotation.GetMapping;\nimport org.springframework.web.bind.annotation.PathVariable;\nimport org.springframework.web.bind.annotation.PostMapping;\n\nimport java.util.List;\nimport java.util.Map;\n\n@Controller\n@Slf4j\n@RequiredArgsConstructor\npublic class PerfumeController {\n\t\n\tprivate final PerfumeService ps;\n\n\t@GetMapping({\"\", \"/\"})\n\tpublic String mainPage() {\n\t\treturn \"main\";\n\t}\n\t\n\t@PostMapping(\"/survey\")\n\tpublic String survey(PerfumeDTO perfume) {\n\t\tlog.debug(\"survey_param: {}\", perfume);\n\t\t\n\t\ttry {\n\t\t\tps.save(perfume);\n\t\t\tlog.debug(\"[등록 결과] 성공\");\n\t\t} catch (Exception e) {\n\t\t\tlog.debug(\"[설문 등록] 실패..\");\n\t\t}\n\t\t\n\t\treturn \"redirect:/\";\n\t}\n\t\n\t@GetMapping(\"/result\")\n\tpublic String result(Model model) {\n\t\t\n\t\ttry {\n\t\t\t// 응답 리스트\n\t\t\tList<PerfumeDTO> surveyResponselist = ps.selectAll();\n\t\t\tmodel.addAttribute(\"surveyResponselist\", surveyResponselist);\n\t\t\t\n\t\t\t// 성별 카운트\n\t\t\tMap<String, Integer> genderCnt = ps.count(surveyResponselist);\n\t\t\tmodel.addAttribute(\"genderCnt\", genderCnt);\n\t\t\tlog.debug(\"[응답 결과] list: {}\", surveyResponselist);\n\t\t} catch (Exception e) {\n\t\t\tlog.debug(\"[응답 결과] 실패.. {}\", e.getMessage());\n\t\t}\n\t\t\n\t\treturn \"result\";\n\t}\n\t\n\t@PostMapping(\"/delete/{no}\")\n\tpublic String deleteSurvey(@PathVariable(\"no\") Integer no) {\n\t\ttry {\n\t\t\tps.deleteById(no);\n\t\t} catch (Exception e) {\n\t\t\tlog.debug(\"[예외 발생] 실패.. {}\", e.getMessage());\n\t\t}\n\t\t\n\t\treturn \"redirect:/result\";\n\t}\n}\n"},{"id":"c9","t":"2-9. main.html","file":"main.html","path":"src/main/resources/templates/main.html","lang":"html","hint":"폼 method=POST·name 속성 → B1·C4·C7 / 성별 option value → C8","text":"<!DOCTYPE html>\n<html xmlns:th=\"thymeleaf.org\">\n<head>\n    <meta charset=\"UTF-8\">\n    <title>향수 설문조사</title>\n    <link rel=\"stylesheet\" th:href=\"@{/css/main.css}\">\n    <script defer th:src=\"@{/js/main.js}\"></script>\n</head>\n<body>\n    <div class=\"container\">\n        <h1>향수 설문조사</h1>\n        <form th:action=\"survey\" method=\"POST\" id=\"survey\">\n            <div class=\"question\">\n                <label for=\"name\">이름</label>\n                <input type=\"text\" id=\"name\" name=\"name\" placeholder=\"이름을 입력하세요\">\n            </div>\n\n            <div class=\"question\">\n                <label for=\"gender\">성별</label>\n                <select id=\"gender\" name=\"gender\">\n                    <option value=\"\">선택하세요</option>\n                    <option value=\"남성\">남성</option>\n                    <option value=\"여성\">여성</option>\n                </select>\n            </div>\n\n            <div class=\"question\">\n                <label for=\"age\">나이</label>\n                <input type=\"number\" id=\"age\" name=\"age\" placeholder=\"나이를 입력하세요\">\n            </div>\n\n            <div class=\"question\">\n                <label for=\"favoriteScent\">가장 좋아하는 향기</label>\n                <select id=\"favoriteScent\" name=\"favoriteScent\">\n                    <option value=\"\">선택하세요</option>\n                    <option value=\"꽃향\">꽃향</option>\n                    <option value=\"우디향\">우디향</option>\n                    <option value=\"과일향\">과일향</option>\n                    <option value=\"시트러스향\">시트러스향</option>\n                    <option value=\"스파이시향\">스파이시향</option>\n                </select>\n            </div>\n\n            <div class=\"question\">\n                <label id=\"usageFrequency\">향수를 얼마나 자주 사용하시나요?</label>\n                <div class=\"radio-group\">\n                    <div>\n                        <input type=\"radio\" id=\"daily\" name=\"usageFrequency\" value=\"매일\">\n                        <label for=\"daily\">매일</label>\n                    </div>\n                    <div>\n                        <input type=\"radio\" id=\"weekly\" name=\"usageFrequency\" value=\"주 2-4회\">\n                        <label for=\"weekly\">주 2-4회</label>\n                    </div>\n                    <div>\n                        <input type=\"radio\" id=\"rarely\" name=\"usageFrequency\" value=\"가끔\">\n                        <label for=\"rarely\">가끔</label>\n                    </div>\n                    <div>\n                        <input type=\"radio\" id=\"never\" name=\"usageFrequency\" value=\"사용하지 않음\" checked>\n                        <label for=\"never\">사용하지 않음</label>\n                    </div>\n                </div>\n            </div>\n\n            <div class=\"question\">\n                <label for=\"favoriteBrand\">선호하는 향수 브랜드</label>\n                <input type=\"text\" id=\"favoriteBrand\" name=\"favoriteBrand\" placeholder=\"브랜드를 입력하세요\">\n            </div>\n\n            <div class=\"question\">\n                <label for=\"purchaseBudget\">향수 구매 시 예상 예산</label>\n                <select id=\"purchaseBudget\" name=\"purchaseBudget\">\n                    <option value=\"5만원 - 10만원\">5만원 - 10만원</option>\n                    <option value=\"10만원 - 15만원\">10만원 - 15만원</option>\n                    <option value=\"15만원 - 20만원\">15만원 - 20만원</option>\n                    <option value=\"20만원 - 25만원\">20만원 - 25만원</option>\n                    <option value=\"25만원 - 30만원\">25만원 - 30만원</option>\n                    <option value=\"30만원 이상\">30만원 이상</option>\n                </select>\n            </div>\n\n            <div class=\"question\">\n                <label for=\"comments\">추가 의견</label>\n                <textarea id=\"comments\" name=\"comments\" rows=\"4\" placeholder=\"의견을 적어주세요\"></textarea>\n            </div>\n\n\t\t\t<div class=\"btn\">\n\t            <button id=\"btn1\" type=\"submit\">설문 제출</button>\n\t            <button id=\"btn2\" type=\"button\">설문 결과</button>\n\t\t\t</div>\n        </form>\n    </div>\n</body>\n</html>"},{"id":"c10","t":"2-10. result.html","file":"result.html","path":"src/main/resources/templates/result.html","lang":"html","hint":"th:each, th:data-no → B5·D3 / genderCnt['여성'] ?: 0 → B3","text":"<!DOCTYPE html>\n<html xmlns:th=\"thymeleaf.org\">\n<head>\n\t<meta charset=\"UTF-8\">\n\t<title>향수 설문조사 결과</title>\n\t<link rel=\"stylesheet\" th:href=\"@{/css/result.css}\">\n    <script defer th:src=\"@{/js/result.js}\"></script>\n</head>\n<body>\n\t<h1>향수 설문 결과</h1>\n\n    <h2>\n    \t응답자( \n    \t<span th:text=\"| 여 ${genderCnt['여성'] ?: 0}|\" class=\"female\">0</span>\n    \t<span th:text=\"| 남 ${genderCnt['남성'] ?: 0}|\" class=\"male\">0</span>\n    \t)\n    </h2>\n    <table>\n        <thead>\n            <tr>\n            \t<th>이름</th>\n                <th>나이</th>\n                <th>선호 향기</th>\n                <th>사용 빈도</th>\n                <th>선호 브랜드</th>\n                <th>구매 예산</th>\n                <th>추가 의견</th>\n                <th>설문 시간</th>\n            </tr>\n        </thead>\n        <tbody>\n            <tr th:each=\"p : ${surveyResponselist}\"\n                class=\"result-tr\"\n                th:data-no=\"${p.no}\">\n            \t<td th:text=\"${p.name}\"\n            \t\tth:classappend=\"${p.gender} == '남성' ? 'male' : 'female'\">이름</td>\n                <td th:text=\"${p.age}\">나이</td>\n                <td th:text=\"${p.favoriteScent}\">향기</td>\n                <td th:text=\"${p.usageFrequency}\">빈도</td>\n                <td th:text=\"${p.favoriteBrand}\">브랜드</td>\n                <td th:text=\"${p.purchaseBudget}\">예산</td>\n                <td th:text=\"${p.comments}\">의견</td>\n                <td th:text=\"${#temporals.format(p.completionTime, 'yyyy-MM-dd HH:mm:ss')}\">시간</td>\n            </tr>\n        </tbody>\n    </table>\n\n</body>\n</html>"},{"id":"c11","t":"2-11. main.js","file":"main.js","path":"src/main/resources/static/js/main.js","lang":"javascript","hint":"유효성 검사 순서와 alert 메시지 → B4 / e.preventDefault() → B1","text":"\ndocument.querySelector(\"#btn2\").addEventListener('click', function() {\n\tlocation.href = '/result';\n});\n\ndocument.querySelector(\"#survey\").addEventListener('submit', function(e) {\n    const name   = document.querySelector(\"#name\").value.trim();\n    const gender = document.querySelector(\"#gender\").value;\n    const age    = document.querySelector(\"#age\").value.trim();\n    const scent  = document.querySelector(\"#favoriteScent\").value;\n    const usage  = document.querySelectorAll(\"input[name='usageFrequency']\");\n    const brand  = document.querySelector(\"#favoriteBrand\").value.trim();\n    const budget = document.querySelector(\"#purchaseBudget\").value;\n\n    if (name === \"\") {\n        alert(\"이름을 입력하세요.\");\n        e.preventDefault();\n        return;\n    }\n\n    if (gender === \"\") {\n        alert(\"성별을 선택하세요.\");\n        e.preventDefault();\n        return;\n    }\n\n    if (age === \"\" || isNaN(age) || age <= 0) {\n        alert(\"올바른 나이를 입력하세요.\");\n        e.preventDefault();\n        return;\n    }\n\n    if (scent === \"\") {\n        alert(\"가장 좋아하는 향기를 선택하세요.\");\n        e.preventDefault();\n        return;\n    }\n\n    let usageSelected = false;\n    for (let radio of usage) {\n        if (radio.checked) {\n            usageSelected = true;\n            break;\n        }\n    }\n    if (!usageSelected) {\n        alert(\"향수 사용 빈도를 선택하세요.\");\n        e.preventDefault();\n        return;\n    }\n\n    if (brand === \"\") {\n        alert(\"선호하는 향수 브랜드를 입력하세요.\");\n        e.preventDefault();\n        return;\n    }\n\n    if (budget === \"\") {\n        alert(\"향수 구매 예산을 선택하세요.\");\n        e.preventDefault();\n        return;\n    }\n});\n"},{"id":"c12","t":"2-12. result.js","file":"result.js","path":"src/main/resources/static/js/result.js","lang":"javascript","hint":"dataset.no, confirm(), 가상 form POST /delete/{no} → B5","text":"const h1 = document.querySelector('h1');\nh1.addEventListener('click', function() {\n    location.href = '/';\n});\n\nconst resultRows = document.querySelectorAll(\".result-tr\");\nresultRows.forEach(row => {\n    row.addEventListener('click', function(event) {\n        const surveyNo = event.currentTarget.dataset.no;\n\n        if (confirm(\"이 설문 데이터를 정말로 삭제하시겠습니까?\")) {\n            // 자바스크립트에서 동적 가상 폼 전송\n            const form = document.createElement('form');\n            form.method = 'POST';\n            form.action = `/delete/${surveyNo}`;\n\n            document.body.appendChild(form);\n            form.submit();\n        }\n    });\n});\n"}];

/* =====================================================================
   학습하기 (목차 · 문제은행 풀이 · 참고 시트 · 기준 코드)
   ===================================================================== */
const PARTS={
  A:{t:'A. 개념 이해',d:'스프링 백엔드의 핵심 개념을 알고 있는가 — 문제은행 10문항 중 4문항 출제 (5점 × 4 = 20점)'},
  B:{t:'B. 코드 추적',d:'코드의 실행 순서와 결과를 예측할 수 있는가 — 5문항 중 2문항 출제 (10점 × 2 = 20점)'},
  C:{t:'C. 디버깅',d:'증상을 보고 원인을 찾아 고칠 수 있는가 — 8문항 중 4문항 출제 (6점 × 4 = 24점)'},
  D:{t:'D. 코드 완성',d:'빈칸을 채워 SQL과 계층별 코드를 완성할 수 있는가 — 5문항 중 2문항 출제 (10점 × 2 = 20점)'},
  E:{t:'E. 기능 설계',d:'새 기능의 요청과 계층별 코드를 완성할 수 있는가 — 2문항 중 1문항 출제 (16점)'}
};

const REF=[
{id:'r1',t:'1) 주요 어노테이션',h:`
<table class="t w"><tr><th>어노테이션</th><th>설명</th></tr>
<tr><td>@Controller</td><td>요청을 처리하고 뷰 이름(화면)을 반환하는 클래스</td></tr>
<tr><td>@RestController</td><td>요청을 처리하고 데이터를 그대로 응답 본문에 담아 반환하는 클래스</td></tr>
<tr><td>@Service / @Repository</td><td>서비스 / 저장소 역할의 클래스를 스프링 빈으로 등록</td></tr>
<tr><td>@GetMapping / @PostMapping</td><td>해당 URL의 GET / POST 요청을 메서드에 연결</td></tr>
<tr><td>@PathVariable("이름")</td><td>URL 경로의 {이름} 자리 값을 매개변수로 받음</td></tr>
<tr><td>@RequestParam(value="이름", required=false)</td><td>쿼리 스트링·폼 값 하나를 매개변수로 받음 (required=false 면 없어도 됨)</td></tr>
<tr><td>@Transactional</td><td>메서드를 하나의 트랜잭션으로 실행</td></tr>
<tr><td>@Entity / @Table(name="")</td><td>DB 테이블과 연결되는 클래스 / 연결할 테이블 이름</td></tr>
<tr><td>@Id / @GeneratedValue(strategy=IDENTITY)</td><td>기본키 / DB의 자동 증가로 값 생성</td></tr>
<tr><td>@CreatedDate,<br>@EntityListeners(AuditingEntityListener.class),<br>@EnableJpaAuditing</td><td>저장 시 생성 시간을 자동 입력 (세 가지 모두 필요)</td></tr>
<tr><td>@RequiredArgsConstructor</td><td>final 필드를 매개변수로 받는 생성자 자동 생성 (Lombok)</td></tr>
<tr><td>@Data / @Builder</td><td>getter·setter 등 자동 생성 / 빌더 패턴 자동 생성 (Lombok)</td></tr>
<tr><td>@Slf4j</td><td>log 객체 자동 생성. log.debug(), log.info(), log.error()</td></tr></table>`},
{id:'r2',t:'2) JpaRepository 기본 메서드',h:`
<table class="t w"><tr><th>메서드</th><th>설명</th></tr>
<tr><td>save(entity)</td><td>저장 (새 객체면 INSERT, 기존 객체면 UPDATE)</td></tr>
<tr><td>findAll() / findAll(Sort sort)</td><td>전체 조회 / 정렬하여 전체 조회</td></tr>
<tr><td>findById(id)</td><td>기본키로 1건 조회. Optional 로 반환 → <code>.orElseThrow(() -&gt; new 예외(...))</code></td></tr>
<tr><td>delete(entity) / deleteById(id)</td><td>삭제</td></tr>
<tr><td>count()</td><td>전체 개수</td></tr></table>`},
{id:'r3',t:'3) 쿼리 메서드 이름 규칙',h:`
<table class="t w"><tr><th>키워드</th><th>예시</th><th>의미 (SQL)</th></tr>
<tr><td>findBy 필드</td><td>findByGender(String gender)</td><td>WHERE gender = ?</td></tr>
<tr><td>And / Or</td><td>findByGenderAndAge(...)</td><td>WHERE gender = ? AND age = ?</td></tr>
<tr><td>GreaterThanEqual / LessThan</td><td>findByAgeLessThan(int age)</td><td>WHERE age &lt; ?</td></tr>
<tr><td>Between</td><td>findByAgeBetween(int a, int b)</td><td>WHERE age BETWEEN ? AND ?</td></tr>
<tr><td>Containing / StartingWith</td><td>findByNameStartingWith(String s)</td><td>WHERE name LIKE '?%'</td></tr>
<tr><td>OrderBy 필드 Asc / Desc</td><td>findByGenderOrderByNameAsc(...)</td><td>ORDER BY name ASC</td></tr>
<tr><td>(매개변수) Sort sort</td><td>findByGender(String g, Sort sort)</td><td>전달한 Sort 로 정렬</td></tr></table>
<p class="tip">예) “나이가 N 이상, 작성 시간 최신순” → <code>findByAgeGreaterThanEqualOrderByCompletionTimeDesc(int age)</code> (D4)</p>`},
{id:'r4',t:'4) 정렬 · Model · 기타',h:`
<pre><code>Sort sort = Sort.by(Sort.Order.asc("필드명"), Sort.Order.desc("필드명"));
model.addAttribute("이름", 값);                       // 화면에서 \${이름}으로 사용
redirectAttributes.addFlashAttribute("이름", 값);     // 리다이렉트 후 화면에 1회 전달
return "뷰이름";            // templates/뷰이름.html
return "redirect:/경로";    // 브라우저가 해당 경로로 GET 재요청</code></pre>
<p class="tip">Sort 에 넣는 이름은 DB 컬럼명이 아니라 <b>Entity 필드명</b>(예: completionTime) — C2</p>`},
{id:'r5',t:'5) Thymeleaf 문법',h:`
<table class="t w"><tr><th>문법</th><th>설명</th></tr>
<tr><td>th:text="&#36;{값}"</td><td>태그 안의 글자를 값으로 바꿈</td></tr>
<tr><td>th:each="p : &#36;{목록}"</td><td>목록을 반복하며 태그를 만듦</td></tr>
<tr><td>th:if="&#36;{조건}"</td><td>조건이 참일 때만 태그 표시</td></tr>
<tr><td>th:classappend="&#36;{조건} ? 'a' : 'b'"</td><td>조건에 따라 class 추가</td></tr>
<tr><td>th:value / th:selected / th:checked</td><td>입력값 / 선택 상태 / 체크 상태 지정</td></tr>
<tr><td>th:href="@{/경로}" / th:action / th:src</td><td>경로를 만들어 지정</td></tr>
<tr><td>th:data-이름="&#36;{값}"</td><td>data-이름 속성 생성 (JS 에서 dataset.이름으로 읽음)</td></tr>
<tr><td>|글자 &#36;{값}|</td><td>문자열과 값을 이어 붙임</td></tr>
<tr><td>&#36;{값 ?: 기본값}</td><td>값이 null 이면 기본값 사용</td></tr>
<tr><td>&#36;{#temporals.format(시간, 'yyyy-MM-dd')}</td><td>날짜·시간 형식 지정</td></tr></table>`},
{id:'r6',t:'6) JavaScript',h:`
<table class="t w"><tr><th>코드</th><th>설명</th></tr>
<tr><td>document.querySelector("#id")</td><td>id 로 요소 1개 찾기 (없으면 null)</td></tr>
<tr><td>요소.addEventListener("submit" | "click", 함수)</td><td>이벤트 연결</td></tr>
<tr><td>e.preventDefault()</td><td>기본 동작(폼 전송 등) 취소</td></tr>
<tr><td>문자열.trim()</td><td>앞뒤 공백 제거</td></tr>
<tr><td>confirm("메시지")</td><td>확인 → true, 취소 → false</td></tr>
<tr><td>요소.dataset.이름</td><td>data-이름 속성 값 읽기</td></tr></table>`},
{id:'r7',t:'7) HTTP 상태 코드',h:`
<table class="t w"><tr><th>코드</th><th>의미</th></tr>
<tr><td>200</td><td>성공</td></tr>
<tr><td>302</td><td>다른 주소로 이동(리다이렉트)</td></tr>
<tr><td>400</td><td>잘못된 요청 (값 변환·바인딩 실패 등)</td></tr>
<tr><td>404</td><td>요청한 URL에 연결된 처리기가 없음</td></tr>
<tr><td>405</td><td>URL은 있으나 HTTP 메서드가 맞지 않음</td></tr>
<tr><td>500</td><td>서버 내부 오류 (처리 중 예외)</td></tr></table>`},
{id:'r8',t:'8) SQL (MySQL)',h:`
<pre><code>CREATE TABLE 테이블 (
    컬럼 타입 AUTO_INCREMENT PRIMARY KEY,
    컬럼 타입 NOT NULL,
    컬럼 타입 CHECK (컬럼 IN ('값1', '값2')),     -- 또는 CHECK (컬럼 BETWEEN 1 AND 5)
    컬럼 타입 DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (컬럼) REFERENCES 다른테이블(컬럼)
);

SELECT 컬럼, COUNT(*) AS '별칭'     -- 실행 순서: FROM → WHERE → GROUP BY
FROM   테이블                        --            → HAVING → SELECT → ORDER BY
WHERE  행 조건
GROUP BY 컬럼
HAVING 그룹(집계) 조건
ORDER BY 컬럼 DESC, 컬럼 ASC;</code></pre>`},
{id:'r9',t:'9) 기타',h:`
<ul>
<li>한글 문자열 정렬은 가나다순이 오름차순이다. (예: '남성' &lt; '여성', '김' &lt; '박')</li>
<li>스프링 부트는 Entity 필드명(camelCase)을 컬럼명(snake_case)으로 바꾸어 연결한다.</li>
<li><code>int</code> 는 null 을 가질 수 없고, <code>Integer</code> 는 null 을 가질 수 있다.</li>
</ul>`}
];

/* ---------- 페이지 정의 (목차 순서) ---------- */
const TOC=[
  {id:'guide',t:'1. 평가 안내'},
  {id:'rules',t:'2. 출제 규칙'},
  {id:'run',t:'3. 프로젝트 실행 방법'},
  {id:'bank',t:'4. 문제은행 (30문항)',kids:Object.keys(PARTS).map(p=>({id:p,t:PARTS[p].t,kids:Q.filter(q=>q.p===p).map(q=>({id:q.id,t:q.id+'. '+q.title}))}))},
  {id:'ref',t:'부록 1. 참고 시트',kids:REF.map(r=>({id:r.id,t:r.t}))},
  {id:'code',t:'부록 2. 기준 코드',kids:CODE.map(c=>({id:c.id,t:c.t.endsWith(c.file)?c.t:c.t+' · '+c.file}))}
];
const FLAT=[];(function w(a){a.forEach(n=>{FLAT.push(n);n.kids&&w(n.kids)})})(TOC);
const NODE={};FLAT.forEach(n=>NODE[n.id]=n);
const PARENT={};FLAT.forEach(n=>(n.kids||[]).forEach(k=>PARENT[k.id]=n.id));

function chain(id){const c=[];for(let x=id;x;x=PARENT[x])c.push(x);return c}
function drawToc(cur){
  const on=new Set(chain(cur));
  const li=n=>{
    const a=`<a href="#study/${n.id}" class="${n.id===cur?'cur':''}">${esc(n.t)}</a>`;
    return n.kids?`<details ${on.has(n.id)?'open':''}><summary>${a}</summary><ul>${n.kids.map(li).join('')}</ul></details>`:`<div class="leaf">${a}</div>`;
  };
  $('#toc').innerHTML=`<a href="#study" class="tochome ${cur==='home'?'cur':''}">📖 학습하기 첫 화면</a>`+TOC.map(li).join('');
  const c=$('#toc a.cur');if(c&&c.scrollIntoView)c.scrollIntoView({block:'nearest'});
}

/* ---------- 본문의 [[snip:코드id:시작-끝:제목]] 을 부록 2 코드 일부로 바꿈 ---------- */
function snips(html){
  return html.replace(/\[\[snip:(\w+):(\d+)-(\d+):([^\]]*)\]\]/g,(_,id,a,b,t)=>{
    const c=CODE.find(x=>x.id===id),L=c.text.replace(/\n$/,'').split('\n');a=+a;b=+b;
    const body=L.slice(a-1,b).map(l=>'<span class="cl">'+(l?esc(l):'&#8203;')+'</span>').join('');
    return '<p class="note2">※ 참고 — '+esc(t)+' ('+esc(c.file)+' '+(a===b?a+'행':a+'~'+b+'행')+')</p><pre class="code" style="counter-reset:ln '+(a-1)+'">'+body+'</pre>';
  });
}

/* ---------- 문제+답변 카드 ---------- */
function corr(it){
  if(it.k==='c')return esc(it.opts[it.ok]);
  if(it.k==='m')return it.ok.map(j=>esc(it.opts[j])).join('<br>');
  if(it.k==='a')return '<pre>'+esc(it.show)+'</pre>';
  return esc(it.show);
}
function qaCard(q){
  const rows=q.items.map(it=>`<div class="ai"><b>${esc(it.l)}</b><span class="cor">${corr(it)}</span></div>`).join('');
  return `<div class="qa" id="qa-${q.id}"><h3>${q.id}. ${esc(q.title)} <small>${q.p} 파트 · ${PTS[q.p]}점</small></h3>
  <div class="q">${snips(q.body)}</div><div class="a">${rows}${q.exp?`<div class="exp"><b>해설</b> ${q.exp}</div>`:''}</div></div>`;
}
function codeBox(c){
  const lines=c.text.replace(/\n$/,'').split('\n').map(l=>`<span class="cl">${l?esc(l):'&#8203;'}</span>`).join('');
  const refs=c.hint?`<p class="tip">${esc(c.hint)}</p>`:'';
  return `<p class="path">${esc(c.path)} · ${c.text.replace(/\n$/,'').split('\n').length}줄</p>${refs}<pre class="code">${lines}</pre>`;
}

/* ---------- 본문 만들기 ---------- */
function pageHtml(id){
  if(id==='home')return `
   <h2>학습하기</h2>
   <p>학습자료집(PDF) 내용을 목차별로 정리했습니다. 왼쪽 목차에서 항목을 고르거나 아래 카드를 누르세요. 문제은행은 문제와 답변이 한 묶음으로 나옵니다.</p>
   <div class="cards">${TOC.map(n=>`<a class="card" href="#study/${n.id}"><b>${esc(n.t)}</b><span>${n.kids?n.kids.length+'개 항목':'바로 보기'}</span></a>`).join('')}</div>
   <p class="tip">시험은 이 학습자료집의 문제은행 30문항에서 13문항(100점)이 나오고, 그중 2문항은 데이터나 조건이 조금 바뀝니다. 시험 때 부록 1(참고 시트)과 부록 2(기준 코드)가 제공됩니다.</p>`;
  if(id==='guide')return `<h2>1. 평가 안내</h2>
   <table class="t w"><tr><th>평가 방식</th><td>페이퍼(자필) 시험. 인터넷, 교재, 전자기기, AI 사용 불가</td></tr>
   <tr><th>문항 수</th><td>13 문항, 100 점</td></tr>
   <tr><th>출제 범위</th><td>이 자료집의 문제은행 30 문항</td></tr>
   <tr><th>사전 배포</th><td>이 학습자료집, 정답 코드(survey 프로젝트 압축 파일)</td></tr>
   <tr><th>시험 때 제공</th><td>부록 1 참고 시트, 부록 2 기준 코드 (이 자료집과 같은 내용)</td></tr></table>`;
  if(id==='rules')return `<h2>2. 출제 규칙</h2>
   <table class="t w"><tr><th>파트</th><th>평가 역량</th><th>문제은행</th><th>시험 출제</th><th>배점</th></tr>
   <tr><td>A. 개념 이해</td><td>스프링 백엔드의 핵심 개념을 알고 있는가</td><td>10 문항</td><td>4 문항</td><td>5점 × 4 = 20점</td></tr>
   <tr><td>B. 코드 추적</td><td>코드의 실행 순서와 결과를 예측할 수 있는가</td><td>5 문항</td><td>2 문항</td><td>10점 × 2 = 20점</td></tr>
   <tr><td>C. 디버깅</td><td>증상을 보고 원인을 찾아 고칠 수 있는가</td><td>8 문항</td><td>4 문항</td><td>6점 × 4 = 24점</td></tr>
   <tr><td>D. 코드 완성</td><td>빈칸을 채워 SQL 과 계층별 코드를 완성할 수 있는가</td><td>5 문항</td><td>2 문항</td><td>10점 × 2 = 20점</td></tr>
   <tr><td>E. 기능 설계</td><td>새 기능의 요청과 계층별 코드를 완성할 수 있는가</td><td>2 문항</td><td>1 문항</td><td>16점</td></tr>
   <tr><th>합계</th><td></td><th>30 문항</th><th>13 문항</th><th>100 점</th></tr></table>
   <ul><li>시험 문제는 문제은행에서 그대로 나옵니다. 다만 2 문항은 데이터나 조건을 조금 바꿔서 냅니다.</li>
   <li>서술형은 한두 줄로 핵심만 쓰면 됩니다.</li><li>코드 문제는 대부분 빈칸 채우기입니다.</li>
   <li>철자, import, 세미콜론 같은 작은 실수는 감점하지 않습니다.</li></ul>`;
  if(id==='run')return `<h2>3. 프로젝트 실행 방법</h2>
   <p>향수 설문(survey) 프로젝트 — 8월 과목평가의 정답 코드입니다. 부록 2의 기준 코드와 내용, 줄 번호가 같고, 시험 문제는 이 코드를 기준으로 출제됩니다.</p>
   <h3>준비물</h3><ul><li>JDK 21</li><li>MySQL 8 (busan14 데이터베이스, 계정 root / 비밀번호 root) — 다른 계정이나 DB를 쓰면 <code>src/main/resources/application.properties</code>의 url, username, password를 환경에 맞게 바꿉니다.</li></ul>
   <h3>실행 순서</h3><ol><li>MySQL에서 사용할 데이터베이스를 선택하고 <code>docs/과목평가_SQL.sql</code>의 CREATE TABLE 문을 실행합니다.</li>
   <li>IntelliJ에서 survey 폴더를 열고 Gradle 동기화가 끝날 때까지 기다립니다.</li>
   <li><code>SurveyApplication.java</code>를 실행합니다. (명령 프롬프트에서는 survey 폴더에서 <code>gradlew bootRun</code>)</li>
   <li>브라우저에서 <code>http://localhost:9000</code> 에 접속합니다.</li></ol>
   <h3>이렇게 공부하세요</h3><ul><li>설문을 몇 건 등록하고, 결과 페이지에서 정렬과 응답자 수, 삭제를 확인합니다.</li>
   <li>콘솔 로그에서 실행되는 SQL(INSERT, SELECT, DELETE)을 확인합니다.</li>
   <li>문제은행 C(디버깅) 문항처럼 코드를 일부러 바꿔 보고, 어떤 오류가 나는지 직접 확인한 뒤 원래대로 되돌립니다.</li></ul>`;
  if(id==='bank')return `<h2>4. 문제은행 (30문항)</h2><p>파트를 고르면 그 파트의 모든 문제가, 문제 번호를 고르면 그 문제 하나가 나옵니다.</p>
   <div class="cards">${Object.keys(PARTS).map(p=>`<a class="card" href="#study/${p}"><b>${esc(PARTS[p].t)}</b><span>${Q.filter(q=>q.p===p).length}문항 · ${PTS[p]}점</span></a>`).join('')}</div>`;
  if(PARTS[id])return `<h2>${esc(PARTS[id].t)}</h2><p>${esc(PARTS[id].d)}</p>`+Q.filter(q=>q.p===id).map(qaCard).join('');
  const q=Q.find(x=>x.id===id);if(q)return qaCard(q);
  if(id==='ref')return `<h2>부록 1. 참고 시트</h2><p>시험지에도 이 참고 시트가 그대로 첨부됩니다.</p><div class="cards">${REF.map(r=>`<a class="card" href="#study/${r.id}"><b>${esc(r.t)}</b></a>`).join('')}</div>`;
  const r=REF.find(x=>x.id===id);if(r)return `<h2>${esc(r.t)}</h2>${r.h}`;
  if(id==='code')return `<h2>부록 2. 기준 코드</h2><p>8월 과목평가 정답 코드(survey 프로젝트)입니다. CSS 파일은 제외했고, 줄 번호는 PDF 부록 2와 같습니다. 파일마다 어느 문제와 연결되는지 적어 두었습니다.</p><div class="cards">${CODE.map(c=>`<a class="card" href="#study/${c.id}"><b>${esc(c.t)}</b><span>${c.t.endsWith(c.file)?'':esc(c.file)}</span></a>`).join('')}</div>`;
  const c=CODE.find(x=>x.id===id);if(c)return `<h2>${esc(c.t)} — ${esc(c.file)}</h2>`+codeBox(c);
  return '<h2>페이지를 찾을 수 없습니다</h2>';
}

function renderStudy(id){
  if(id!=='home'&&!NODE[id])id='home';
  drawToc(id);
  const i=FLAT.findIndex(n=>n.id===id);
  const prev=i>0?FLAT[i-1]:null,next=i>=0&&i<FLAT.length-1?FLAT[i+1]:null;
  const nav=id==='home'?`<div class="pn"><span></span><a class="btn" href="#study/${FLAT[0].id}">${esc(FLAT[0].t)} ▶</a></div>`
    :`<div class="pn">${prev?`<a class="btn" href="#study/${prev.id}">◀ ${esc(prev.t)}</a>`:'<span></span>'}${next?`<a class="btn" href="#study/${next.id}">${esc(next.t)} ▶</a>`:'<span></span>'}</div>`;
  $('#stBody').innerHTML=pageHtml(id)+nav;
  $('#stBody').scrollTop=0;window.scrollTo(0,0);
  $('#study').classList.remove('menu');
}
$('#stMenu').onclick=()=>$('#study').classList.toggle('menu');
$('#stShade').onclick=()=>$('#study').classList.remove('menu');

/* ---------- 화면 전환 (해시 라우터) ---------- */
function route(){
  if(ST&&!ST.done)return;                       // 시험 보는 중에는 화면을 바꾸지 않음
  const h=location.hash.replace(/^#/,'');
  ['home','start','study','exam','result'].forEach(v=>$('#'+v).classList.add('hide'));
  if(h==='quiz')$('#start').classList.remove('hide');
  else if(h==='study'||h.startsWith('study/')){$('#study').classList.remove('hide');renderStudy(h.split('/')[1]||'home')}
  else $('#home').classList.remove('hide');
}
window.addEventListener('hashchange',route);
route();
