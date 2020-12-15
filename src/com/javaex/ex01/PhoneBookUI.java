package com.javaex.ex01;

import java.io.*;
import java.util.*;


public class PhoneBookUI {
	
	//파일
	File listDB = new File("PhoneDB");
	
	//파일 리더
	File
	
	private ArrayList<PhoneDB> list = new ArrayList<PhoneDB>();
	

	//메인화면
	public static void StartMenu() {
		System.out.println("********************************");
		System.out.println("*        전화번호 관리 프로그램                 *");
		System.out.println("********************************");
		System.out.println();
		System.out.println(" 1.리스트   2.등록   3.삭제   4.검색   5.종료");
		System.out.println("---------------------------------");
		System.out.println(">메뉴번호: ");
	}
	
	//리스트
	public static void showList() {
		System.out.println("<1.리스트>");
		try {
			
		}
	}
	
	//등록
	
	//스캐너
	Scanner sc = new Scanner(System.in);
		
	public static void insert(String name, String ph, String company) {
		System.out.println("<2.등록>");
		System.out.print(">이름: ");
		String name = sc.nextLine();
		
		System.out.println("");
		System.out.print(">휴대전화: ");
		String ph = sc.nextLine();
		
		System.out.println("");
		System.out.print(">회사전화: ");
		String company = sc.nextLine();
	}
	
	sc.close();
	
	//종료
	public static void exit() {
		System.out.println("********************************");
		System.out.println("*             감사합니다                      *");
		System.out.println("********************************");
	}
}
