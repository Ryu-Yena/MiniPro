package com.javaex.ex01;

import java.io.FileReader;

public class PhoneBookApp {

	public static void main(String[] args) {
		
		
		//파일 읽기
		try {
			FileReader fr = new FileReader("PhoneDB");
		//초기화면 반복출력
			while(true) {
				PhoneBookUI.StartMenu();
				int num = sc.nextInt();
				
				switch(num) {
				case 1:
					//리스트
				PhoneBookUI.showList();
				case 2:
					//등록 add
					
				case 3:
					//삭제 remove
					
				case 4:
					//검색 indexOf
					
				case 5:
					//종료
					PhoneBookUI.exit();
					break;
					
				default:
					System.out.println("[다시 입력해 주세요.]");
				}
			}
			fr.close();
		}catch (Exception e) {
			System.out.println("오류 수정 바람.");
		}

	}

}
