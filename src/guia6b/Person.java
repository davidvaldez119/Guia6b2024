package guia6b;



public class Person implements  Comparable<Person>{

	private String name;
	private Integer edad;
	
	
	public Person(String name, Integer edad) 
	{
		this.name = name;
		this.edad = edad;
	}


	public Person() {
		super();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", edad=" + edad + "]";
	}


	@Override
	public int compareTo(Person o) {
		//si retorna negativo o va despues de la otra
		//si retorna positivo o va antes de la otra
		//si son iguales da 0
		
		return this.edad -(o.getEdad());
	}


	


	


	
	
}
