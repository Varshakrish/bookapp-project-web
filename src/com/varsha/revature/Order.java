package com.varsha.revature;

import java.time.LocalDate;

public class Order {
	private Integer id;
	private Integer quantity;
	private Integer userId;
	private Integer bookId;
	private String status;
	private LocalDate orderDate;

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", quantity=" + quantity + ", userId=" + userId + ", bookId=" + bookId + ", status="
				+ status + ", orderDate=" + orderDate + "]";
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}


}
