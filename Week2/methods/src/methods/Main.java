package methods;


public class Main {

	public static void main(String[] args) {
		Person[] persons = new Person[] {
				new Person("Volkan","Aslan","male"),
				new Person("Engin","Demirog","male"),
				new Person("Ayşe","Kumluca","female")
				};
		sayHello(persons);
		
	}
	public static void sayHello(Person[] persons) {
		for (Person person : persons) {
				
			if(person.getGender() == "male") {
				System.out.println("Hello Mr. " + person.getLname());
			}
			else if(person.getGender() == "female") {
				System.out.println("Hello Ms. " + person.getLname());
			}
		}
		
	}


}
