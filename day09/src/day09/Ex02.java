package day09;

public class Ex02 {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("인자가 없습니다.");
			System.out.println("usage: Ex02 <a> <b>");
			System.exit(-1);
		}
		System.out.println(args.length);
		for(int i = 0; i < args.length; i++) {
			System.out.println("args["+i+"]:"+args[i]);
		}
	}
}
