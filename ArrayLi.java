import java.util.*;


class ArrayLi{

	public static void main(String args[]){
		String[] files={
			"hii.java",
			"hidsi.java",
			"hii.j"
		};

	List<String> l1 = new ArrayList<>();

	for(String f1: files){
		if(f1.endsWith(".java")){
			l1.add(f1);
		}
	}


	for (String list1: l1){
		System.out.println(list1);
	}
	}
}
