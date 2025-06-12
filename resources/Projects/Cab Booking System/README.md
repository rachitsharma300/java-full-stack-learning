# 1. Cab Booking System (Java Console App)

##  2. Description
<p> A console-based cab booking system built using Java.
 The project focuses on solid OOP design principles, Java Collections, and Lambda expressions.
</p>


##  3. Project Structure
```
CabBookingService/
│
├── README.md
└── src/
    └── main/
        └── java/
            └── com/
                └── cabbooking/
                    ├── model/
                    │   ├── Cab.java
                    │   ├── Driver.java
                    │   └── Rider.java
                    │
                    ├── service/
                    │   ├── BookingService.java
                    │   ├── DriverService.java
                    │   └── PaymentService.java
                    │
                    ├── util/
                    │   ├── DistanceCalculator.java
                    │   └── TimeUtils.java
                    │
                    └── app/
                        └── MainApp.java
```
## 4. Folder Breakdown
### model/
- Contains POJOs (Plain Old Java Objects).
- Cab.java – Cab details (type, number, status)
- Driver.java – Driver details (name, license number, assigned cab)
- Rider.java – Rider/user details (name, userId, location)

### service/
- Contains business logic.
- BookingService.java – Handles cab booking logic.
- PaymentService.java – Manages fare calculation and payments.
- DriverService.java – Driver onboarding, availability, assignment.

### util/
- Utility classes to support core logic.
- DistanceCalculator.java – Calculate distance between two locations.
- TimeUtils.java – Time-related helpers (e.g., current time, ETA calculation).

### app/
- MainApp.java – Entry point of the application.
- Runs the whole flow: creates sample data, simulates booking, etc.


## 5. Technologies
- Java 17+

- IntelliJ IDEA

- Java Collections
- Lambda Expressions

- OOPs Concepts

## 6. How To Run

1. Clone the repo or open in IntelliJ.
2. Navigate to app/Main.java.
3. Run Main to start the console app.

## 7. Learning Goals
- Deepen understanding of OOP: Inheritance, Encapsulation, Polymorphism, Abstraction
- Hands-on with Java Collections like List, Map
- Use Lambda expressions for filtering and sorting

## 8. Future Scope
- Add database integration
- REST API using Spring Boot
- Frontend UI using JavaFX or web tech



