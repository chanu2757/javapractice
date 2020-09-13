package com.test.question;

public class question_02 {
public static void main(String[] args) {
	
//	Q1();
//	Q2();
	Q3();
}

private static void Q3() {
	//주어진 데이터를 변수를 만들어 아래와 같은 문장 출력
	String[] date = {"2020-01-01","2020-01-01","2020-01-02","2020-01-03","2020-01-03"};
	String[] menu = {"카페라테","돼지불백","마트 장본것들","교통 카드 충전","편의점 결제"};
	int[] price = {4800,8500,125840,45000,16200};
	
	System.out.println("[날짜]\t\t[내역]\t\t[금액]");
	System.out.println("==========================================");
	for(int i=0;i<date.length;i++) {
		System.out.printf("%s\t%s\t%,d원\n",date[i],menu[i],price[i]);
	}
}

private static void Q2() {
	//주어진 데이터를 변수를 만들어 아래와 같은 문장을 출력하시오.
	
	String[] name = {"홍길동","아무개","하하하"};
	int[] kor = {80,90,95};
	int[] eng = {76,86,79};
	int[] math = {89,92,85};
	
	System.out.printf("[학생]\t[국어]\t[영어]\t[수학]\t[평균]\n");
	System.out.println("----------------------------------------");
	for(int i=0;i<name.length;i++) {
		System.out.printf("%s\t%d\t%d\t%d\t%d\n",name[i],kor[i],eng[i],math[i],(kor[i]+eng[i]+math[i])/name.length);
	}
}

private static void Q1() {
	//주어진 데이터를 변수를 만들어 문장출력하기
	String name = "홍길동";
	int age = 20;
	int gen = 1;
	String address = "서울시 강남구 역삼동";
	
	System.out.printf("안녕하세요. 제 이름은 %s입니다.\n",name);
	System.out.printf("나이는 %d살이고 %s입니다.\n",age,gen==1?"남자":"여자");
	System.out.printf("저는 %s에 살고 있습니다.",address);
	
	
}


}
