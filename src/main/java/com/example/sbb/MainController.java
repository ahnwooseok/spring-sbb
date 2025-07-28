package com.example.sbb;
//	•	이 Java 파일은 `com.example.sbb` 패키지에 속해 있습니다.
//	•	일반적으로 루트 클래스(예: `@SpringBootApplication`)도 같은 패키지 안 또는 상위에 있어야 자동 컴포넌트 스캔이 가능합니다.

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class MainController {
//•	`@Controller`는 해당 클래스를 Spring MVC의 컨트롤러로 등록하는 애너테이션입니다.
//•	이 컨트롤러 클래스는 웹 요청을 처리하는 역할을 합니다.

    @GetMapping("/sbb")
//    •	HTTP GET 방식으로 `/sbb` 경로 요청이 들어오면 처리합니다.
//    •	예: 브라우저에서 `http://localhost:8080/sbb` 으로 접속 시 이 메서드가 실행됨.

    @ResponseBody
//    •	해당 메서드가 반환하는 값을 HTML 응답 본문(Response Body) 로 직접 전송하도록 지정합니다.
//    •	즉, 반환값을 템플릿 없이 그대로 브라우저에 출력함 → View 이름으로 처리되지 않음.

    public String index() {
        return "안녕하세요 sbb에 오신 것을 환영합니다.";
    }
//    •	반환 타입은 `String`
//    •	`@ResponseBody`가 있으므로, 문자열 그대로 응답됨

}