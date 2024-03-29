package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Celsius toCelsius() {
        Celsius newTemp = new Celsius((this.getValue() - 32) * 9/5);
        return newTemp;
    }

    @Override
    public Fahrenheit toFahrenheit() {
        return this;
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue()+" F";
    }
}