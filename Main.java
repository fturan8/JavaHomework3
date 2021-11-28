package odev3Gun;

public class Main {

	public static void main(String[] args) {
		
		StudentUser studentUser1 = new StudentUser(); //Öðrenci tanýmlandý
		studentUser1.getId();
		studentUser1.setUserName("fturan");
		studentUser1.setFirstName("Fýrat");
		studentUser1.setLastName("Turan");
		studentUser1.setPassword("123456");
		studentUser1.setTakenCourse("Java");
		
		System.out.println(studentUser1.getId());
		
		InstructorUser instructorUser1 = new InstructorUser(); //Öðretmen Tanýmlandý
		instructorUser1.getId();
		instructorUser1.setUserName("EnginDemirog");
		instructorUser1.setFirstName("Enign");
		instructorUser1.setLastName("Demiroð");
		instructorUser1.setPassword("456789");
		instructorUser1.setGivenCourse("Java");
		
		System.out.println(instructorUser1.getId());

		StudentManager studentManager = new StudentManager();
		studentManager.add(studentUser1);
		studentManager.remove(studentUser1);
		studentManager.attendCourse("React");
		studentManager.login(studentUser1);
		studentManager.logout(studentUser1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructorUser1);
		instructorManager.remove(instructorUser1);
		instructorManager.addingCourse("React");
		instructorManager.login(instructorUser1);
		instructorManager.logout(instructorUser1);
		
		
		
		
	}
	
	

}
