/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1.beans;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.flow.FlowScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author vigne
 */
@Named
@FlowScoped("placeorders")
public class CartBean implements Serializable{
    
   @Inject private CartItemBean cartItem;
   
   private ArrayList<CartItemBean> cartItems = new ArrayList<CartItemBean>();

    public CartItemBean getCartItem() {
        return cartItem;
    }

    public void setCartItem(CartItemBean cartItem) {
        this.cartItem = cartItem;
    }

    public ArrayList<CartItemBean> getCartItems() {
        return cartItems;
    }

    public void setCartItems(ArrayList<CartItemBean> cartItems) {
        this.cartItems = cartItems;
    }
   
   	public void addItem() {
        addItem(cartItem.createCopy());
	}

	public void addItem(CartItemBean i) {
		cartItems.add(i);
	}
    
}
