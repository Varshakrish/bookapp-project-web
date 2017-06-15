package com.varsha.revature;

import java.time.LocalDate;

public class BookDAOTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		book.setName("varsha");
		book.setPrice(200);
		book.setAuthour_id(2);
		book.setPublished_date(LocalDate.now());
		System.out.println(book);

	}
}
