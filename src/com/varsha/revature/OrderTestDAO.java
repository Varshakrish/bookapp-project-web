package com.varsha.revature;

import java.time.LocalDate;

public class OrderTestDAO {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Order order = new Order();
		order.setUserId(5);
		order.setBookId(3);
		order.setQuantity(1);
		order.setStatus("delievered");
		order.setOrderDate(LocalDate.now());
		System.out.println(order);
      
		  OrderDAO orderDAO = new OrderDAO();
	        orderDAO.bookOrder(order);
	        System.out.println(order);
	 
	}

	
}
