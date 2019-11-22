package com.training.testcollections;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import com.training.collection.Car;
import com.training.collection.CellPhone;
import com.training.collection.Laptop;
import com.training.collection.School;
import com.training.collection.StudentFruit;

public class TestCollections {

	@Test
	public void testCar() {
		Car car = new Car("TVS", "Juptor", 1998, 2500.45);
		Car car1 = new Car("TVS", "Juptor", 1998, 2500.45);
		Car car2 = new Car("LandRover", "VISION", 1998, 63500.45);
        Set<Car> setCar = new HashSet<Car>();
		setCar.add(car);
		setCar.add(car1);
		setCar.add(car2);
        Set<Car> actual = new HashSet<Car>();
		actual.add(car);
		actual.add(car1);
		actual.add(car2);
		assertEquals(actual, setCar);
		}
	@Test
	public void testLaptop() {
		Laptop laptop = new Laptop("Sony", "Ericson", "Windows","QuadCore");
		Laptop laptop1 = new Laptop("Sony", "Ericson", "Windows","QuadCore");
		Laptop laptop2 = new Laptop("Apple", "Aster", "Mac","DuadCore");
		Set<Laptop> setLaptop = new HashSet<Laptop>();
        setLaptop.add(laptop);
		setLaptop.add(laptop1);
		setLaptop.add(laptop2);
        Set<Laptop> actual = new HashSet<Laptop>();
		actual.add(laptop);
		actual.add(laptop1);
		actual.add(laptop2);
		assertEquals(actual,setLaptop);
		}
	@Test
	public void testSchool() {
		School School = new School("Akash", "Virar", "Xaviers","Palghar",1);
		School School1 =new School("Akash", "Virar", "Xaviers","Palghar",1);
		School School2 =new School("Satish", "Bhayandar", "Peters","Palghar",3);
		Set<School> setSchool = new HashSet<School >();
		setSchool.add(School);
		setSchool.add(School1);
		setSchool.add(School2);
	//	System.out.println(setSchool);
        Set<School> actual = new HashSet<School>();
		actual.add(School);
		actual.add(School1);
		actual.add(School2);
		assertEquals(actual,setSchool);
		}
	@Test
	public void testCellPhone() {
		CellPhone cellphone = new CellPhone("Iphone", "X", "Best","Mac",19200.00);
		CellPhone cellphone1 =new CellPhone("Iphone", "X", "Best","Mac",19200.00);
		CellPhone cellphone2 =new CellPhone("MI", "NOTE7", "GOOD","ANDROID",8500.99);
		Set<CellPhone> setPhone = new HashSet<CellPhone >();
		setPhone.add(cellphone);
		setPhone.add(cellphone1);
		setPhone.add(cellphone2);
	    //System.out.println(setPhone);
        Set<CellPhone> actual = new HashSet<CellPhone>();
		actual.add(cellphone);
		actual.add(cellphone1);
		actual.add(cellphone2);
		assertEquals(actual,setPhone);
		}
	@Test
	public void testStudentFruit() {
		StudentFruit student  = new StudentFruit("Akash","Pineapple");
		StudentFruit student1  = new StudentFruit("Indu","Apple");
		StudentFruit student2  = new StudentFruit("Seema","Banana");
		Map<String,String> favFruit =new HashMap<String,String>();  
		favFruit.put("Akash","Pineapple");
		favFruit.put("Indu","Apple");
		favFruit.put("Seema","Banana");
        assertEquals("Pineapple",favFruit.get("Akash"));
		
		}

}
