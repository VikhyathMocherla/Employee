package com;

public class Product 
{
	private int productID;
	private String productName;
	private float price;
	public Product()
	{
		super();
	}
	public Product (int productId,String productName,float price)
	{
		super();
		this.productID=productId;
		this.productName=productName;
		this.price=price;
	}
	public int getProductId()
	{
		return productID;
	}
	public void setProductId(int productId)
	{
		this.productID=productId;
	}
	public String getProductName()
	{
		return productName;
	}
	public void setProductName(String productName)
	{
		this.productName=productName;
	}
	public float getPrice()
	{
		return price;
	}
	public void setPrice(float price)
	{
		this.price=price;
	}
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", price=" + price + "]";
	}
}
