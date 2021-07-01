package abstractpackage;

public interface Manager {
	abstract int insert(Info data);
	abstract Info[] search(Info data);
	abstract int modify(Info data1, Info data2);
	abstract int delete(Info data);
}


