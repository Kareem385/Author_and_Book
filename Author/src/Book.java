
public class Book {

private String name;
private Author author; //created author variable from author class
private double price;
private int qtyInStock;

public Book(String name, Author author, double price, int qtyInStock)
{
	this.name = name;
	this.author = author;
	this.price = price;
	this.qtyInStock = qtyInStock;
}
public String getName() {
	return name;
}

public Author getAuthor() {
	return author;
}

public double getPrice() {
	return price;
	}

public int getQtyInStock(){
	return qtyInStock;
}
}
