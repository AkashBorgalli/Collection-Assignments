package com.training.collection;

public class StudentFruit implements Comparable<StudentFruit> {
	private String name;
	private String favFruit;
	public StudentFruit(String name, String favFruit) {
		super();
		this.name = name;
		this.favFruit = favFruit;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the favFruit
	 */
	public String getFavFruit() {
		return favFruit;
	}
	/**
	 * @param favFruit the favFruit to set
	 */
	public void setFavFruit(String favFruit) {
		this.favFruit = favFruit;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((favFruit == null) ? 0 : favFruit.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		StudentFruit other = (StudentFruit) obj;
		if (favFruit == null) {
			if (other.favFruit != null)
				return false;
		} else if (!favFruit.equals(other.favFruit))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public int compareTo(StudentFruit o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return "StudentFruit [name=" + name + ", favFruit=" + favFruit + "]";
	}
	
	

}
