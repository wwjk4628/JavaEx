package com.javaex.practice;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		/*
		 * [Ex01.java] 다음중 기본 자료형 중 정수형 자료형이 아닌 것은? (1) int (2) float (3) byte (4) long
		 * 2 JDK와 JRE의 차이점을 설명한 것 중 틀린 것을 찾아 수정해보세요? (1) 자바 프로그램을 개발하려면 JDK가 반드시 필요하다.
		 * (2) 자바 프로그램을 실행만 하려고 할 때는 JRE가 있으면 된다 (3) JDK는 개발도구 와 JRE로 구성되어 있다 (4) JDK에는
		 * javac.exe가 포함되어 있지 않다. ?
		 * 
		 * [Ex03.java] JVM에 대한 설명으로 틀린 것을 찾아 수정해보세요 (1) JVM은 java.exe 명령어에 의해 구동된다 (2)
		 * JVM은 바이트코드(~.class)를 기계어로 변환하여 실행시킨다. (3) 운영체제별로 동일한 JVM이 사용된다. (4)
		 * 바이트코드(~.class)는 운영체제에 독립적이만, JVM은 운영체제에 종속적이다. ?
		 * 
		 * 
		 * [Ex04.java] java 프로그램 개발과정을 순서대로 나열해 보세요 (1) Javac.exe로 바이트코드(~.class)을 생성한다
		 * (2) Java.exe로 JVM을 실행시킨다. (3) 자바 소스파일(~.java)을 작성한다 (4) JVM은 main() 메소드를 찾아
		 * 실행시킨다 3 1 2 4
		 * 
		 * [Ex05.java] 자바 소스파일(~. java)을 작성할 때 틀린 것을 찾아 수정해보세요 (1) 패키지명은 일반적으로 가독성을 위해
		 * 대문자, 소문자 섞어 사용한다. (2) 클래스명은 소문자로만 구성하여 작성한다 (3) 자바 소스파일(~.java)명과 클래스 이름은
		 * 대소문자까지 모두 동일한 단어를 사용해야 한다. (4) 실행문 뒤(문자의 끝)에는 반드시 ( : )콜론을 사용해야 한다. (5) 처음으로
		 * 실행되는 함수의 이름은 개발자가 임의로 작성해서 만든다 1 소문자로 2 대문자,소문자 4 : -> ;
		 * 
		 * [Ex06.java] 아래의 설명 중 틀린 것을 찾아서 수정해 보세요. (1) 변수한개에는 동시에 여러 개의 값을 담을 수 있다. (2)
		 * 변수는 선언시에 사용한 타입의 값만 저장할 수 있다. (3) 변수는 초기값이 저장되지 않아도 읽을 수 있다. (4) 모든 자료형의 변수는
		 * 동일한 방식으로 저장된다. (5) double형은 float보다 큰 수를 담을 수 있다. (6) int, float, char,
		 * String은 모두 기본자료형에 속한다 (7) final로 선언된 변수는 수정이 가능하다 (8) long형에는 항상 ‘L’을 붙여서
		 * 대입해야 한다. (9) float형에는 항상 ‘F’을 붙여서 대입해야 한다. 3
		 * 
		 * [Ex07.java] 다음 코드에서 변수로 사용할 수 없는 경우 이유를 작성하세요. (코드를 작성해서 오류가 없도록 변경해 보세요)
		 */
		// int true; //함수
		int _of_workers;
		int countOfLetterslnString;
		int firstLever1; // 앞에 숫자
		int person; // # 사용불가능
		int _person;
		/*
		 * [Hello.java] 아래 클래스 파일의 이름은 Hello.java 입니다. 클래스의 코드가 아래와 같을 때 오류가 나는 부분을 찾고
		 * 이유를 설명해보세요 파일명: Hello.java
		 * 
		 * public class hello{
		 * 
		 * public static void main(String[] args){
		 * 
		 * System.out.println("Hello World); } } // public class hello -> public class
		 * Hello
		 * 
		 * [Ex09.java] 아래와 예제와 같이 작성해 보세요 예제) int 4byte 정수형 short (2byte ) (정수형 ) double
		 * (8 ) (실수 ) float (4 ) (실수 ) byte (1 ) (정수 ) char (2 ) (문자 ) Boolean (1 ) (논리
		 * ) long (8 ) (정수 )
		 * 
		 * 형 변환(type casting) 우선순위를 그린 표이다. 아래의 빈칸을 채우세요 (1)byte (2)short (3)2byte
		 * (4)4byte (5)long (6)float (7)double [Ex11.java] 아래의 코드에서 오류가 발생하는 부분을 예상하고
		 * 수정하세요
		 */

		int iVar = 10;
		long lVar = 1000000000000L;
		char cVar = 'a'; // 단어 한개만
		double dVar = 10;
		float fVar = 12.4f;// 뒤에 f
		String str = "ab";
		// [Ex12.java]
//		다음코드의 잘못된 부분을 찾아서 수정해 보세요.
//		(코드를 작성해서 오류가 없도록 변경해 보세요.)

		int x, y = 0;
		char grade = 'A';
		int salary = 2_000_000;
		byte n = 0b1000;
		/*
		 * [Ex13.java] 다음 중 결과값이 다른 것을 선택하고 이유를 설명해 보세요
		 */
		System.out.println(13 / 5);
		System.out.println((double) 13 / 5);
		System.out.println(13 / (double) 5);
		System.out.println((double) 13 / (double) 5);
		System.out.println(13.0 / 5);
		System.out.println(13 / 5.0);
		System.out.println((double) 13 / 5);
		// 1, = 2 2,3,4,5,6,7 = 2.6
		/*
		 * [Ex14.java] 아래 프로그램의 결과를 코드작성전에 먼저 예상해보고 코드를 작성해 확인해 보세요 5 6 6 6 7 6 6 6 5
		 * 
		 * [Ex15.java] 아래 프로그램의 결과를 코드작성전에 먼저 예상해보고 코드를 작성해 확인해 보세요 -1 6 3 11 6.5 4 3
		 * 
		 * [Ex16.java] 아래 프로그램의 결과를 코드작성전에 먼저 예상해보고 코드를 작성해 확인해 보세요 a=4 b=2 x=2 y=2
		 * 
		 * 
		 */
		int x1 = 1;
		int y1 = 1;
		int a = ++x1 * 2;
		int b = y1++ * 2;

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("x=" + x1);
		System.out.println("y=" + y1);
		/*
		 * [Ex17.java] 다음 코드의 오류가 나는 부분을 찾은 후 이유를 작성하세요. (코드를 작성해서 오류가 없도록 변경해 보세요.)
		 */
		int sum;
		int x2, y2;
		x2 = 10;
		y2 = 10;
		sum = x2 + y2;
		System.out.println("합은 " + sum);

		/*
		 * [Ex18.java] 다음의 코드를 컴파일 할 때 오류가 발생한다. 오류의 원인은? //x 의 값이 지정되지 않음
		 * 
		 * [Ex19.java] 아래 프로그램의 결과를 코드작성전에 먼저 예상해보고 코드를 작성해 확인해 보세요 91 41 51
		 */
		int num01 = 40;
		int num02 = 50;
		int result01 = (num01++) + (++num02);
		System.out.println(result01);
		System.out.println(num01);
		System.out.println(num02);
		/*
		 * [Ex21.java] 아래의 출력 결과를 예상하여 작성하고, Ex20 문제와 어떤 부분이 다른지 비교해 보세요. (코드를 작성해서 예상과
		 * 맞는지 확인해 보세요.) 10 1
		 */
		int i = 10;
		int n01 = ++i % 2;

		System.out.println(i);
		System.out.println(n01);
		/*
		 * [Ex22.java] 아래의 출력결과를 예상하여 작성하세요. (코드를 작성해서 예상과 맞는지 확인해 보세요.) f t f t f t t
		 * 
		 * [Ex23.java] 다음의 요구사항을 만족하는 코드를 작성하세요. 요구사항 ⚫ double 형의 speed, time, distance
		 * 변수를 선언한다. ⚫ speed 변수에 90.0을 저장한다. ⚫ time 변수에 60.0을 저장한다. ⚫ speed와 time을 곱하고 그
		 * 결과를 distance에 저장한다. ⚫ distance를 콘솔에 출력한다.
		 *
		 */
		double speed, time, distance;
		speed = 90.0;
		time = 60.0;
		distance = speed * time;
		System.out.println(distance);

		/*
		 * [Ex24.java] 다음의 코드는 화씨 온도를 섭씨 온도로 변환하는 프로그램이다. 결과값이 0이 나오는 이유는 무엇이며 정상인 결과가
		 * 나오도록 수정하세요. ⚫ *[참고] ℃ : 섭씨 기호 ℉ : 화씨 기호 화씨→섭씨 ℃ = 5/9 * (℉ - 32) 섭씨→화씨 ℉ = (℃
		 * * 9/5) + 32
		 */
		double f = 80.0;
		System.out.println(5.0 / 9 * (f - 32.0));
		/*
		 * [Ex25.java] 아래의 출력결과를 예상하여 작성하세요. (코드를 작성해서 예상과 맞는지 확인해 보세요.) f t f t t
		 */
		int a01 = 13;
		System.out.println((a01 > 13) && (a01 >= 13));
		System.out.println((a01 > 13) || (a01 >= 13));
		System.out.println((a01 / 3 == 4) && (a01 % 3 == 2));
		System.out.println((a01 / 3 == 4) || (a01 % 3 == 2));
		System.out.println((a01 / 3 == 4) && (a01 % 3 == 2) || (a01 / 3 == 4));

		/*
		 * [Ex26.java] 월급을 입력 받아 10년동안 최대 저축액을 계산하는 프로그램을 작성하세요.
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("월급을 입력하세요:");
		int mon = scanner.nextInt();
		int bank = mon * 120;
		System.out.println("10년동안 최대 저축액은 " + bank + "원 입니다.");
		/*
		 * [Ex27.java] 반지름을 입력 받아 원의 면적을 구하는 프로그램을 작성하세요. (파이 값은 3.14로 상수로 지정)
		 * 
		 */
		double PI = 3.14;
		System.out.print("반지름을 입력하세요:");
		int cir = scanner.nextInt();
		double size = cir * cir * PI;
		System.out.println("원의 넓이는 " + size);
		/*
		 * 
		 * [Ex28.java] 원화를 달러화로 계산하는 프로그램을 작성하세요. (환율 1달러 = 1230.95원 상수로 지정)
		 */
		final double dollar = 1230.95;
		System.out.print("환전할 원화를 입력하세요:");
		int change = scanner.nextInt();
		System.out.println("받으실 달러는 " + change / dollar);

		/*
		 * 
		 * [Ex29.java] 직사각형의 둘레와 면적을 구하는 프로그램을 작성하세요. (너비, 높이 변수 double형으로 작성)
		 */
		System.out.print("너비를 입력하세요:");
		int x02 = scanner.nextInt();
		System.out.print("높이를 입력하세요:");
		int y02 = scanner.nextInt();
		System.out.println("사각형의 둘레는" + (x02 + y02) * 2);
		System.out.println("사각형의 둘레는" + x02 * y02);
		/*
		 * [Ex30.java] 마일을 km로 변환하는 프로그램을 작성하세요.(1마일 = 1.609km 상수로 지정)
		 * 
		 */
		System.out.print("마일을 입렷하세요:");
		int mile = scanner.nextInt();
		final double km = 1.609;
		System.out.println(mile + "마일은 " + mile * km + "킬로미터 입니다.");
		/*
		 * [Ex31.java] 상품을 구매하면 정가의 10%를 부가세로 부여한다. 아래와 같이 출력되도록 프로그램을 작성하세요
		 * 
		 */
		System.out.print("상품가격:");
		double price = scanner.nextInt();
		System.out.print("받은돈:");
		double money = scanner.nextInt();
		System.out.println("================");
		System.out.println("받은돈:" + money);
		System.out.println("상품가격:" + price);
		System.out.println("부가세:" + price / 10.0);
		System.out.println("잔액:" + (money - price));
		/*
		 * [Ex32.java] 사용자로부터 밑변, 높이 값을 입력 받아 삼각형의 넓이를 구하는 프로그램을 작성하세요
		 */
		System.out.print("가로");
		double x03 = scanner.nextInt();
		System.out.print("세로");
		double y03 = scanner.nextInt();
		System.out.println("삼각형의 넓이는 " + x03 * y03 / 2.0);
//		[Ex33.java]
//		사용자로부터 구의 반지름을 입력 받아 구의 부피를 계산하는 프로그램을 작성하세요.
		System.out.println("반지름:");
		double r = scanner.nextInt();
		System.out.println("구의 부피는: " + 4 / 3.0 * PI * r * r);
//		[Ex35.java]
//		long형 변수를 사용하여 빛이 1년동안 진행하는 거리를 계산하여 출력하세요.
		long l = 300_000 * 31_536_000l;
		System.out.println("빛이 1년동안 가는 거리는 " + l + "km 입니다.");
//		[Ex36.java]
//		동전 별 개수를 입력 받아 총금액을 계산하는 프로그램을 작성하세요.
		System.out.print("500원 개수:");
		int _500 = scanner.nextInt();
		System.out.print("100원 개수:");
		int _100 = scanner.nextInt();
		System.out.print("50원 개수:");
		int _50 = scanner.nextInt();
		System.out.print("10원 개수:");
		int _10 = scanner.nextInt();
		System.out.println("동전의 총합은 " + ((500 * _500) + (100 * _100) + (50 * _50) + (10 * _10)) + "원 입니다.");
//		[Ex37.java]
//	사용자에게 연필의 개수와 인원수를 입력 받아 모든 인원에게 같은 수의 연필을 나눠주려고 한다
//	1인당 연필의 받을 수 있는 연필의 개수와 나머지를 구하시오
		
		System.out.print("전체 연필갯수를 입력해주세요: ");
		int pen = scanner.nextInt(); 
		System.out.print("전체 연필갯수를 입력해주세요: ");
		int per = scanner.nextInt(); 
		System.out.print("1인당 연필의 갯수는 " + pen/per + " 입니다.");
		System.out.println("연필의 나머지 갯수는 " + pen%per + " 입니다.");
//		[Ex38.java]
//	총 금액을 입력하면 백원단위는 할인을 해주고 있습니다. 실제 지불금액을 출력하는 코드를 작성하세
		System.out.print("전체금액을 입려해주세요: ");
		int total = scanner.nextInt();
		int result = (total/1000)*1000;
		System.out.println("실제 지불금액은 " + result);
		
		scanner.close();
	}

}
