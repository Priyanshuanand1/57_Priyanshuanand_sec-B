package ass2;
class person{
	public String Name;
	public int age;
	
	public person(String Name,int age) {
		this.Name=Name;
		this.age=age;
				
	}
}
public class Q1 {
	public static void main(String[] args) {
		person person1= new person("Anand",21);
		person person2= new person("And",22);
		
		System.out.println("name of person1:" +person1.Name);
		System.out.println("name of person1:" +person1.age);
		System.out.println("name of person2:" +person2.Name);
		System.out.println("name of person2:" +person2.age);	
	}

}

