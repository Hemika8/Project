package com.cts.ProjectApplication.Buyer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ShoppingCart {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int cartId;
private int itemId;
private int quantity;
@ManyToOne
@JoinColumn(name="buyerId")
private Buyer buyer;
public ShoppingCart()
{
	
}
public ShoppingCart(int cartId, int itemId, int quantity, Buyer buyer) {
	this.cartId = cartId;
	this.itemId = itemId;
	this.quantity = quantity;
	this.buyer = buyer;
}
public int getCartId() {
	return cartId;
}
public void setCartId(int cartId) {
	this.cartId = cartId;
}
public int getItemId() {
	return itemId;
}
public void setItemId(int itemId) {
	this.itemId = itemId;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Buyer getBuyer() {
	return buyer;
}
public void setBuyer(Buyer buyer) {
	this.buyer = buyer;
}

}
