package com.study.springboot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity	
public class Member {

	//JPA에서 엔티티의 주 키를 자동으로 생성할 때 사용하며,strategy 속성을 통해 주 키 생성 전략을 지정
	//GenerationType.IDENTITY 데이터 페이스에서 자동으로 PK를 생성하도록 하는 전략
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false)
	//@Conlumn 어노테이션은 엔티티의 필드와 데이터 베이스 테이블의 컬럼간의 매핑을 지정
	//id 컬럼과 매핑하고 업데이트가 불가능하게 설정할 수 있습니다.
	private Long id;
	
	@Column(name="name", nullable=false)
	private String name;
	
	
}
