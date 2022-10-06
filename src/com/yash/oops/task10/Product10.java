package com.yash.oops.task10;

public class Product10 implements Cloneable{
	private int pid;
    private String pname;
    private double price;
    private String unitOfMeasurement;

    public Product10(int i, String string, int j, String string2) {
		// TODO Auto-generated constructor stub
	}
	public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getUnitOfMeasurement() {
		return unitOfMeasurement;
	}
	public void setUnitOfMeasurement(String unitOfMeasurement) {
		this.unitOfMeasurement = unitOfMeasurement;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", unitOfMeasurement="
				+ unitOfMeasurement + ", getPid()=" + getPid() + ", getPname()=" + getPname() + ", getPrice()="
				+ getPrice() + ", getUnitOfMeasurement()=" + getUnitOfMeasurement() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
