package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		//	업케스팅 
		Animal dog1 = new Dog("snoopy");
		//	upcasting : 부모 타입으로 자손 객체를 참조하는 것
		//	참조 타입에 설계된 것만 사용할 수 있다.
		
		dog1.eat();
		dog1.walk();
//		dog1.bark();
//		설계도에 있는 것만 사용 가능
		Dog dog2 = new Dog("Doogy");
		dog2.eat();
		dog2.walk();
		dog2.bark();
		
		//	Downcasting : 명시적으로 타입을 지정
		//	dog1을 bark() 하도록 해보자
		((Dog)(dog1)).bark();
		
		{
			Dog pat = new Dog("Azi");
			pat.eat();
			pat.walk();
			pat.bark();
			
			pat = null;
				
//			pat = new Cat("아즈라엘");		형제간 참조 불가
			
		}
		{
			Animal pat = new Dog("Azi");
			pat.eat();
			pat.walk();
//			pat.bark();
			//	현재 pat이 어떤 클래스의 인스턴스인지 확인
			if (pat instanceof Dog) {
				((Dog)pat).bark();
			}else if (pat instanceof Cat){
				((Cat)pat).meow();
			}
			
			pat = null;
			
			pat = new Cat("아즈라엘"); 
			pat.eat();
			pat.walk();
//			pat.meow();
			if (pat instanceof Dog) {
				((Dog)pat).bark();
			}else if (pat instanceof Cat){
				((Cat)pat).meow();
			}
			
		}
	}

}
