package com.study.springboot.bean;

public interface Printer {

	public void print(String message);
}
/*
 * ��(Bean)�̶� ������ �����̳ʰ� �����ϴ� ��ü�� �ǹ� ������ �����̳ʴ� ���� ����, �ʱ�ȭ, ���� ��û�� ���� �� ��� �� ��
 * �����ֱ� ���ݿ� ��ģ ������ ��� ���� @Component, @Service, @Repository, @Controller ����
 * ������̼��� Ŭ������ �ٿ��� ������ �� �ְ�, xml���� �����̳� java ���� Ŭ�������� <bean>, @Bean�� ���ؼ��� ������ ��
 * �ֽ��ϴ�. �̷��� ����� ���� �������� �˾Ƽ� �����ϰ� �Ǹ�, �ʿ��� �� @Autowired, @Inject ���� ������̼��� ����Ͽ�
 * ���Թ޾� ����� �� �ֽ��ϴ�.
 */
