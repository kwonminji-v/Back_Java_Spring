package model;



public class Study_0612_Ex_8_Student {
			//main 문에서 객체의 멤버를 그대로 가져다 쓰기 때문에 캡슐화는 진행하지 않는다.
	
			 public int id;
			 public String tel;

			//Constructor -> private로 선언하지 않았기때문에(캡슐화 X) getter&setter를 구현하지 않는다.
public  Study_0612_Ex_8_Student(int id, String tel) {
			this.id = id;
			this.tel = tel;

		}
}
