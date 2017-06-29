package com.javase.chapter15;

public class Person {
	private String name;
	private  int attack;
	private double colorValue;
	private String type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getattack() {
		return attack;
	}
	public void setattack(int attack) {
		this.attack = attack;
	}
	public double getcolorValue() {
		return colorValue;
	}
	public void setcolorValue(double colorValue) {
		this.colorValue = colorValue;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", attack=" + attack + ", colorValue=" + colorValue + ", type=" + type + "]";
	}
	public Person(String name, int attack, double colorValue, String type) {
		super();
		this.name = name;
		this.attack = attack;
		this.colorValue = colorValue;
		this.type = type;
	}
	public Person() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + attack;
		long temp;
		temp = Double.doubleToLongBits(colorValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Person other = (Person) obj;
		if (attack != other.attack)
			return false;
		if (Double.doubleToLongBits(colorValue) != Double.doubleToLongBits(other.colorValue))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
}
