
public class Author {
	//name, email and gender instance variables
	private String name;
	private String email;
	private char gender;

	//Empty Author constructor
	public Author() {
		}
	
	//no setters for name and gender because they can't be changed. 
	//Initialized variables
public Author(String name, String email, char gender) {
	this.name =name;
	this.email = email;
	this.gender = gender;
}

//get methods
public String getName() {
	return name;
}

public String getEmail(){
	return email;
}

public char getGender() {
	return gender;
}

public void setEmail(String email)
{
	this.email = email;
}

public String toString()
{
	return toString();
}
}
