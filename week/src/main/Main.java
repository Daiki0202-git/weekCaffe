package main;
import java.util.Random;

import dayOfTheWeek.Today;
public class Main {

	public static void main(String[] args) {
//		今日が何曜日で、コーヒーを飲むかカフェラテを飲むか決める
		String today = Today.getDayOfTheWeekShort();
		String cf = "コーヒー";
		String cl = "カフェラテ";
		Random random = new Random();
		String[] d = {"日","月","火","水","木","金","土"};


		if(d[0] == today) {
			System.out.println("今日は"+today+"曜日");
			if(0 == random.nextInt(2)) {
				System.out.println("今日は"+cf+"の気分");
			}else {
				System.out.println("今日は"+cl+"の気分");
			}
		}else if(d[1] == today) {
			System.out.println("今日は"+today+"曜日");
			if(0 == random.nextInt(2)) {
				System.out.println("今日は"+cf+"の気分");
			}else {
				System.out.println("今日は"+cl+"の気分");
			}
		}else if(d[2] == today) {
			System.out.println("今日は"+today+"曜日");
			if(0 == random.nextInt(2)) {
				System.out.println("今日は"+cf+"の気分");
			}else {
				System.out.println("今日は"+cl+"の気分");
			}
		}else if(d[3] == today) {
			System.out.println("今日は"+today+"曜日");
			if(0 == random.nextInt(2)) {
				System.out.println("今日は"+cf+"の気分");
			}else {
				System.out.println("今日は"+cl+"の気分");
			}
		}else if(d[4] == today) {
			System.out.println("今日は"+today+"曜日");
			if(0 == random.nextInt(2)) {
				System.out.println("今日は"+cf+"の気分");
			}else {
				System.out.println("今日は"+cl+"の気分");
			}
		}else if(d[5] == today) {
			System.out.println("今日は"+today+"曜日");
			if(0 == random.nextInt(2)) {
				System.out.println("今日は"+cf+"の気分");
			}else {
				System.out.println("今日は"+cl+"の気分");
			}
		}else if(d[6] == today) {
			System.out.println("今日は"+today+"曜日");
			if(0 == random.nextInt(2)) {
				System.out.println("今日は"+cf+"の気分");
			}else {
				System.out.println("今日は"+cl+"の気分");
			}
		}

	}

}
