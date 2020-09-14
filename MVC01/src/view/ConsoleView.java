package view;

import java.io.*;

import controller.*;
import model.*;

public class ConsoleView {
	private BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
	public void display() throws IOException {
		while(true){
			System.out.println("####### 学生管理メニュー #######");
			System.out.println(" 1.学生の追加");
			System.out.println(" 2.学生の削除");
			System.out.println(" 3.学生の一覧表示");
			System.out.println(" 9.終了");
			System.out.print(" >>選択して下さい：");
			int no = Integer.parseInt(bin.readLine());
			System.out.println();
			switch (no) {
			case 1:
				addStudentView();
				break;
			case 2:
				deleteStudentView();
				break;
			case 3:
				listStudentView();
				break;
			case 9:
				return;
			}
		}
	}

	public void addStudentView() throws IOException {
		String id,name;
		System.out.print(" 学籍番号：");
		id = bin.readLine();
		System.out.print(" 学生氏名：");
		name = bin.readLine();
		if(StudentApp.addStudent(id, name) == false){
			System.out.println(" !!!データが一杯なため追加できません!!!");
		}
		System.out.println();
	}

	public void deleteStudentView() throws IOException{
		String id;
		System.out.print(" 学籍番号：");
		id = bin.readLine();
		if(StudentApp.deleteStudent(id) == false){
			System.out.println(" !!!該当する学生が見つかりません!!!");
		}
		System.out.println();
	}
private void listStudentView() {

		Student wTbl[] = StudentApp.getStudentTbl();
		for(int i = 0;i < wTbl.length;i++){
			System.out.println(" [" + wTbl[i].getId() + "]" + wTbl[i].getName());
		}
		System.out.println();
	}

}
