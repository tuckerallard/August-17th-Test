package ssa.tiy.week3.day12.august17th.test;

public class Car extends Vehicle
{
	//States (5)
	private String color = null;
	private String carModel = null;
	private int numOfWheels = 0;
	private int numOfDoors = 0;
	private int numOfSeats = 0;
	
	//Behaviors (2)
	private boolean isParked = false;
	private boolean isFueledUp = false;
	
	//Constructor extends (2) behaviors from Vehicle Class + (2) behaviors and (5) states from Car class
	public Car(boolean isOn, boolean isNew, String color, String carModel, int numOfWheels, int numOfDoors,
			int numOfSeats, boolean isParked, boolean isFueledUp)
	{
		super(isOn, isNew);
		this.color = color;
		this.carModel = carModel;
		this.numOfWheels = numOfWheels;
		this.numOfDoors = numOfDoors;
		this.numOfSeats = numOfSeats;
		this.isParked = isParked;
		this.isFueledUp = isFueledUp;
	}

	public Car(boolean isOn, boolean isNew)
	{
		super(isOn, isNew);
	}

	//Getters and Setters
	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public String getCarModel()
	{
		return carModel;
	}

	public void setCarModel(String carModel)
	{
		this.carModel = carModel;
	}

	public int getNumOfWheels()
	{
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels)
	{
		this.numOfWheels = numOfWheels;
	}

	public int getNumOfDoors()
	{
		return numOfDoors;
	}

	public void setNumOfDoors(int numOfDoors)
	{
		this.numOfDoors = numOfDoors;
	}

	public int getNumOfSeats()
	{
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats)
	{
		this.numOfSeats = numOfSeats;
	}

	public boolean isParked()
	{
		return isParked;
	}

	public void setParked(boolean isParked)
	{
		this.isParked = isParked;
	}

	public boolean isFueledUp()
	{
		return isFueledUp;
	}

	public void setFueledUp(boolean isFueledUp)
	{
		this.isFueledUp = isFueledUp;
	}
	
}
