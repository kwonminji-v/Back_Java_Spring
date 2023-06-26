package study_0601;

public class City {
		
		private String cityname;
		private int population;
		private int increase;
		
/* 
getter와 setter사용법
setter를 통해서 main 메서드에서 값을 받아온다. 생성된 클래스로 여기선 City 클래스 안에있는 get메서드를 말함
ex) setPopulatin의 매개변수인 int population은 CityData에서 input 받은 population 값을 의미한다.

getter를 통해서 main 메서드에서 출력하고자 할 때, City 클래스가 선언된 변수를 통해 City.변수를 통해서 불러온다.
ex) getPopulation에서 return 된 cityname변수를 main메서드에서 사용하여 출력이 가능하다.
city.cityname() 과 같이 작성해주면 출력이 가능하다.

City가 보따리 City안에 있는 method가 상품들이라고 생각하면 된다.

  */		
		
		public String getCityname() {
			return cityname;
		}
		
		public void setCityname(String cityname) {
			this.cityname = cityname;
		}
		public int getPopulation() {
			return population;
		}
		public void setPopulation(int population) {
			this.population = population;
		}
		public int getIncrease() {
			return increase;
		}
		public void setIncrease(int increase) {
			this.increase = increase;
		}
	
}
