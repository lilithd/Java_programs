import java.util.Scanner;


public class Person {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String name, address, phone;
		int age;
		
		PersonalInfo person1;
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("Enter the name of the contact: ");
		name = kb.nextLine();
		
		System.out.println("Enter the age of the contact: ");
		age = kb.nextInt();
		
		kb.nextLine();
		
		System.out.println("Enter the address of the contact: ");
		address = kb.nextLine();
		
		System.out.println("Enter the phone number of the contact: ");
		phone = kb.nextLine();
		person1 = new PersonalInfo(name, age, address, phone);
		person1.setName(name);
		person1.setAge(age);
		person1.setAddress(address);
		person1.setPhone(phone);
		
		System.out.println(person1.getName() +"\n" + person1.getAge() + "\n" + person1.getAddress()
				+ "\n" + person1.getPhone());
		
		kb.close();
	}

}
