package ch08;

public class Person {

	public int height;
	public int weight;
	public int age;
	public String gender;
	public String name;
	
	public Person(int height, int weight, String gender, String name, int age) {
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	
	public void personInfo() {
		System.out.println(String.format("키가 %d 이고 몸무게가 %d 킬로인 %s이 있습니다. "
				+ "이름은 %s 이고 나이는 %d세입니다.", height, weight, gender, name, age));
	}
}
