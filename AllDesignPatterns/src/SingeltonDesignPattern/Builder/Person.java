package SingeltonDesignPattern.Builder;

public class Person {
	private String name, surname, address;
	
	private Person(Builder builder) {
		this.name = builder.name;
		this.surname = builder.surname;
		this.address = builder.address;
	}
	
//	public Person() {
//		this.name = "";
//		this.surname = "";
//		this.address = "";
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public void setSurname(String surname) {
//		this.surname = surname;
//	}
//	
//	public void setAddress(String address) {
//		this.address = address;
//	}
	
	
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public String getAddress() {
		return address;
	}
	
	public static class Builder{
		private String name, surname, address;

		

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder surname(String surname) {
			this.surname = surname;
			return this;
		}

		public Builder address(String address) {
			this.address = address;
			return this;
		}
		
		public Person build() {
            return new Person(this);
	}

}
}
