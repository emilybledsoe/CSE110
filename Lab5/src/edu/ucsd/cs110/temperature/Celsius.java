package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Celsius toCelsius() {
        return this;
    }

    @Override
    public Fahrenheit toFahrenheit() {
        Fahrenheit newTemp = new Fahrenheit((this.getValue() * 9/5) + 32);
        return newTemp;
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue()+" C";
    }
}