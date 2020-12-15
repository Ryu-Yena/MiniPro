package com.javaex.ex01;

import java.io.*;
import java.util.*;


public class PhonBookUI {
	private ArrayList<String> PhoneDB = new ArrayList<String>;
	

	//메인화면
	private static void StartMenu() {
		System.out.println("********************************");
		System.out.println("*        전화번호 관리 프로그램                 *");
		System.out.println("********************************");
		System.out.println();
		System.out.println(" 1.리스트   2.등록   3.삭제   4.검색   5.종료");
		System.out.println("---------------------------------");
		System.out.println(">메뉴번호: ");
	}
	
	//리스트
	public void showList() {
		System.out.println("<1.리스트>");
	}
	public PhonBookUI() {
		// TODO Auto-generated constructor stub
	}
	//등록
	
	//스캐너
	Scanner sc = new Scanner(System.in);
		
	public static void insert() {
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
}
