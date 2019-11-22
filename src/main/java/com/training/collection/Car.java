package com.training.collection;

import java.util.HashSet;
import java.util.Set;

public class Car {
	String maker, model;
	int year;
	double price;
	Set<Car> setCar = new HashSet<Car>(); 
	
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String maker, String model, int year, double price) {
		super();
		this.maker = maker;
		this.model = model;
		this.year = year;
		this.price = price;
		
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maker == null) ? 0 : maker.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((setCar == null) ? 0 : setCar.hashCode());
		result = prime * result + year;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (maker == null) {
			if (other.maker != null)
				return false;
		} else if (!maker.equals(other.maker))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (setCar == null) {
			if (other.setCar != null)
				return false;
		} else if (!setCar.equals(other.setCar))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Car [maker=" + maker + ", model=" + model + ", year=" + year + ", price=" + price +"]";
	}
	
}
