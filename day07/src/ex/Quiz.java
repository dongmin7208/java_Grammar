package ex;

public class Quiz {

	public static int digitCount(long n) {
		int ret = 1;
		while (true) {
			n = n / 10;
			if (n == 0)
				break;
			ret++;
		}
		return ret;
	}

	public static char numToChar(long n) {
		char ret = 0;
		switch ((int) n) {
		case 1:	ret = '��';	break;
		case 2:	ret = '��';	break;
		case 3:	ret = '��';	break;
		case 4:	ret = '��';	break;
		case 5:	ret = '��';	break;
		case 6:	ret = '��';	break;
		case 7:	ret = 'ĥ';	break;
		case 8:	ret = '��';	break;
		case 9:	ret = '��';	break;
		}
		return ret;
	}

	public static String unit1(int n) {
		String ret = "";
		switch (n) {
		case 0:	ret = "";	break;
		case 1:	ret = "��";	break;
		case 2:	ret = "��";	break;
		case 3:	ret = "õ";	break;
		}
		return ret;
	}

	public static String unit2(int n) {
		String ret = "";
		switch (n) {
		case 1:	ret = "��";	break;
		case 2:	ret = "��";	break;
		case 3:	ret = "��";	break;
		case 4:	ret = "��";	break;

		}
		return ret;
	}

	public static String convert(long n) {
		String ret = "";
		int digitCount = digitCount(n);
		//������ ������ ����
		//������ ������ŭ �ݺ��ϸ鼭 ���ڸ� ���ڷ� ����
		//����� ���ڸ� ���ڿ� + �� �̿��Ͽ� �ٿ��ְ�
		//�� �ڸ����� ���� ���� ���ڸ� �ٿ��ش�.
		//������� ���ڿ��� ��ȯ�Ѵ�.
		return ret;
	}

	public static void main(String[] args) {
		System.out.println("1234 �ڸ���:" + digitCount(1234));
		for(int i = 1; i < 10; i++) {
			System.out.println(i + ":" +numToChar(i));
		}
		System.out.println(unit1(2));
		System.out.println(unit1(1));
		System.out.println();
//		System.out.println("1 : " + convert(1));
//		System.out.println("12 : " + convert(12));
//		System.out.println("123 : " + convert(123));
//		System.out.println("1234 : " + convert(1234));
//		System.out.println("12345 : " + convert(12345));
	}
}
