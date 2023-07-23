package com.spring.study.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*빈(Bean) : Spring이 IoC방식으로 관리하는 객체 
  빈 팩토리(BeanFactory) : 스프링의 IoC를 담당하는 핵심 컨테이너 config : (bean들이 담긴 상자개념)
  애플리케이션 컨텍스트(ApplicationContext) : 빈 팩토리를 확장한 컨테이너 */
@Configuration
public class Config {
	
	@Bean
	public Member member1() {
		//의존성 주입 중 Setter 주입 방식
		Member member1 = new Member();
		member1.setName("푸바오");
		member1.setNickname("아기팬더");
		member1.setPrinter(new PrinterA());
		
		return member1;
	}
}
