package maintest;

import abstractpackage.Info;
import oopmanager.*;

public class Main {
	public static void main(String[] args) {
		InfoManager im = new InfoManager();
		Sequence tSeq = new Sequence();
		Sequence sSeq = new Sequence();
		
		im.insert(new Teacher(tSeq.nextVal(), "홍길동", 33, "자바"));
		im.insert(new Teacher(tSeq.nextVal(), "홍길동", 20, "심리상담"));
		im.insert(new Student(sSeq.nextVal(), "박보영", 25, 100, 89, 98));
		im.insert(new Student(sSeq.nextVal(), "이지은", 28, 67, 100, 77));
		im.insert(new Student(sSeq.nextVal(), "장동건", 26, 50, 45, 100));
	
		Info[] infos = im.getInfos();
		for(Info tmp : infos){
			if(tmp != null) tmp.infoPrint();
		}
	}
}





