/*
/*
Transport Fare Calculator
🔹 Objective:
Demonstrate method overriding by implementing different fare calculation logic for various transport types.
________________________________________
📝 Problem Statement:
Create a base class Transport and derive classes Bus, Train, and Taxi.
Each subclass should override the calculateFare(int distance) method with its own pricing logic.
________________________________________
🔧 Requirements:
1.	Base Class: Transport
o	Method: public double calculateFare(int distance)
o	Default logic: fare = distance * 1.0
2.	Derived Classes:
o	Bus: fare = distance * 0.5
o	Train: fare = distance * 0.8
o	Taxi: fare = base fare 50 + distance * 2.0
3.	Create a main() method to:
o	Instantiate each type
o	Call calculateFare() for a sample distance
o	Print the output with transport type
📥 Sample Input:
int distance = 20;

📤 Expected Output:
Bus Fare for 20 km: ₹10.0
Train Fare for 20 km: ₹16.0
Taxi Fare for 20 km: ₹90.0
 */
// Base class
import java.util.Scanner;
class Transport
{
    public double calculateFare(int distance)
    {
        return distance * 1.0;
    }
}

class Bus extends Transport
{
    @Override
    public double calculateFare(int distance)
    {
        return distance * 0.5;
    }
}

class Train extends Transport
{
    @Override
    public double calculateFare(int distance)
    {
        return distance * 0.8;
    }
}

class Taxi extends Transport
{
    @Override
    public double calculateFare(int distance)
    {
        return 50 + distance * 2.0;
    }
}

public class TransportFareCalculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int distance = scan.nextInt();

        Transport bus = new Bus();
        Transport train = new Train();
        Transport taxi = new Taxi();

        System.out.println("Bus Fare for " + distance + " km: ₹" + bus.calculateFare(distance));
        System.out.println("Train Fare for " + distance + " km: ₹" + train.calculateFare(distance));
        System.out.println("Taxi Fare for " + distance + " km: ₹" + taxi.calculateFare(distance));
        scan.close();
    }
}
