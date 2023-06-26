package jungsuk_0616;

public class Ex_2_AnonyClass {
		Object iv = new Object() {
			void method() {}
			};
		static Object cv = new Object() {
			void method(){}
			};
		void myMethod() {
			Object lv = new Object() {
				void method() {}
				};
		}
}

