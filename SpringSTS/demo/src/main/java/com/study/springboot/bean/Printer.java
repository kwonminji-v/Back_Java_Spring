package com.study.springboot.bean;

public interface Printer {

	public void print(String message);
}
/*
 * 빈(Bean)이란 스프링 컨테이너가 관리하는 객체를 의미 스프링 컨테이너는 빈의 생성, 초기화, 서비스 요청에 따른 빈 사용 등 빈
 * 생명주기 전반에 걸친 관리를 담당 빈은 @Component, @Service, @Repository, @Controller 등의
 * 어노테이션을 클래스에 붙여서 선언할 수 있고, xml설정 파일이나 java 설정 클래스에서 <bean>, @Bean을 통해서도 선언할 수
 * 있습니다. 이렇게 선언된 빈은 스프링이 알아서 관리하게 되며, 필요할 때 @Autowired, @Inject 등의 어노테이션을 사용하여
 * 주입받아 사용할 수 있습니다.
 */
