package com.javaex.ex01;

public class PhoneBookApp {

	public static void main(String[] args) {
		
		
		//초기화면 반복출력
		while(true) {
			StartMenu();
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				//리스트
				
			case 2:
				//등록 add
				
			case 3:
				//삭제 remove
				
			case 4:
				//검색 indexOf
				
			case 5:
				//종료
				System.out.println("********************************");
				System.out.println("*             감사합니다                      *");
				System.out.println("********************************");
				return false;
				break;
				
			default:
				System.out.println("[다시 입력해 주세요.]");
			}
		}

	}

}
