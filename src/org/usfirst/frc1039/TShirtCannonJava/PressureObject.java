package org.usfirst.frc1039.TShirtCannonJava;

public class PressureObject {
	private double psi;
	public PressureObject(double psi)
	{
		this.psi = psi;
	}
	@Override
	public String toString()
	{
		return psi + " psi";
	}
}
