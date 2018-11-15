package exercise;

import exercise.SingularlyLinkedList;


public class boxer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingularlyLinkedList<String> boxers= new SingularlyLinkedList <String>();
		
		boxers.addFirst("Pacquiao");
		boxers.addFirst("Manny");
		boxers.addFirst("Pacman");
		boxers.addFirst("Manuel");
		boxers.addFirst("Dionisia");
		
		
		
		System.out.println("size : " + boxers.size());
		
	}

}
 