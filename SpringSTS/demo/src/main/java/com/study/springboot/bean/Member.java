package com.study.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Member {
	//"ȫ�浿"�̶�� ���� name �ʵ�� �ʱ�ȭ
	@Value("ȫ�浿")
	private String name;
	@Value("����")
	private String nickname;
	
	//@Autowired�� �ش� Ÿ���� ���� �ڵ����� ����
	@Autowired
	@Qualifier("printerA")
	//���� Ÿ���� ���� �� �߿��� Ư�� ���� �����Ͽ� �����ϰ� ������ ���
	//���� Ŭ���� �� printerA��� �̸��� ���� printer �ʵ忡 ����
	private Printer printer;

	public Member() {
	}

	public Member(String name, String nickname, Printer printer) {
		this.name = name;
		this.nickname = nickname;
		this.printer = printer;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	public void print() {
		printer.print("Hello " + name + " : " + nickname);
	}
}
