package com.spring.study;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ContentValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> arg0) {
		return ContentDto.class.isAssignableFrom(arg0);
		//검증할 객체의 클래스 타입 정보
	}
	
	@Override
	public void validate(Object obj, Errors errors) {
		
		ContentDto dto = (ContentDto)obj;
		
		String sWriter = dto.getWriter();
		if(sWriter == null || sWriter.trim().isEmpty()) {
			System.out.println("작가란의 입력데이터가 없습니다.");
			errors.rejectValue("writer", "trouble");
		}
	}
	
}
