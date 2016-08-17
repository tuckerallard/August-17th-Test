package ssa.tiy.week3.day12.august17th.test;

public class Vehicle
{
	//Behaviors (2)
	protected boolean isOn = false;
	protected boolean isNew = false;
	
	//Constructor
	public Vehicle(boolean isOn, boolean isNew)
	{
		this.isOn = isOn;
		this.isNew = isNew;
	}

	public Vehicle()
	{
	}

	//Getters and Setters
	public boolean isOn()
	{
		return isOn;
	}

	public void setOn(boolean isOn)
	{
		this.isOn = isOn;
	}

	public boolean isNew()
	{
		return isNew;
	}

	public void setNew(boolean isNew)
	{
		this.isNew = isNew;
	}

}
