package oopmanager;

import abstractpackage.Info;
import abstractpackage.Manager;

public class InfoManager implements Manager{
	private Info[] infos;
	private int index;
	private final int DEFAULT_SIZE = 10;
	
	public int getSize(){
		return infos.length;
	}
	public Info[] getInfos(){
		return infos;
	}
	private  void createArray(int size){
		infos = new Info[size];		
	}
	
	public InfoManager(){
		index = 0;
		createArray(DEFAULT_SIZE);
	}
	public InfoManager(int size){
		index = 0;
		createArray(size);
	}
	public InfoManager(Info[] arr){
		infos = arr.clone();
	}
	
	@Override
	public int insert(Info data) {
		if(index == infos.length)
			return -1;
		else{
			infos[index] = data;
			index++;
		}
		return 0;
	}

	@Override
	public Info[] search(Info data) {
		return null;
	}
	
	@Override
	public int modify(Info data1, Info data2) {
		return 0;
	}
	
	@Override
	public int delete(Info data) {
		return 0;
	}
}





