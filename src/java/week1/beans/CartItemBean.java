/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1.beans;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.xml.rpc.encoding.Serializer;


@Named
@RequestScoped
public class CartItemBean implements Serializable{
     private String itemName;
     private int itemQty;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemQty() {
        return itemQty;
    }

    public void setItemQty(int itemQty) {
        this.itemQty = itemQty;
    }
     
     public CartItemBean createCopy() {
		CartItemBean i = new CartItemBean();
		i.itemName = itemName;
		i.itemQty = itemQty;
		return (i);
	}
    
}
