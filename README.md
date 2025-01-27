# Tolls and Vehicles (*308)

## Giacomo F5 Classroom  
**Date Assigned:** Jan 20  
**Backend:** Java  
**Points:** 100  

---

## Project Description  
This project involves creating a Java program to model a toll system. The system tracks toll stations, the vehicles that pass through them, and calculates toll fees based on vehicle types. It also maintains a record of the total tolls collected and provides a summary at the end.

---

## Requirements  

### Functional Requirements  
1. **Toll Stations:**  
   - Each toll station has a name, a city, and a numerical value representing the total tolls collected.
2. **Vehicles:**  
   - Each vehicle is identified by a license plate.
   - Toll charges depend on the type of vehicle:
     - **Car:** $100  
     - **Motorcycle:** $50  
     - **Truck:** $50 per axle
3. **Calculations:**  
   - The system calculates the toll for each vehicle as it arrives.
   - A total accumulated toll amount is maintained and displayed.

### Deliverables  
- **GitHub Repository**: The source code of the program.  
- **Class Diagram**:  
  - A UML diagram illustrating the design of the program.  
  - Either a screenshot or a public link to the diagrams.net file.  
- **Unit Tests**:  
  - Mandatory test coverage of **at least 70%**.  
  - A screenshot of the testing section in Visual Studio Code showing test coverage and the number of tests performed.  

---

## Technical Details  

### Constraints  
- **Framework**: Java (No Spring Boot).  
- **Testing**: Use a testing framework like JUnit to achieve the required coverage.  
- **IDE**: Visual Studio Code or another Java-compatible IDE.  

### Classes and Features  
- **TollStation**  
  - Attributes: `name`, `city`, `totalCollected`.  
  - Methods:  
    - Add vehicle and calculate toll.  
    - Get the list of all vehicles processed.  
    - Get the total amount collected.  
- **Vehicle**  
  - Attributes: `licensePlate`, `type`, and `axles` (for trucks).  
  - Methods:  
    - Constructor to initialize vehicle attributes.  
- **Main Application**  
  - Accept user input for vehicles arriving at the toll.  
  - Display the summary of vehicles and the total collected.  

---

## Development Steps  

1. **Plan the Application**  
   - Create the UML class diagram.  

2. **Set Up the Repository**  
   - Initialize a GitHub repository.  

3. **Implement the Program**  
   - Write the classes and methods according to the UML diagram.  

4. **Write Unit Tests**  
   - Ensure all classes and methods are covered by tests.  
   - Target at least **70% test coverage**.  

5. **Document the Results**  
   - Add a screenshot of the class diagram.  
   - Capture the testing section in VSCode showing coverage and the number of tests.  

---

## Example Output  

**Input:**  
- Car, license plate: ABC123  
- Motorcycle, license plate: XYZ789  
- Truck, license plate: TRK456, 4 axles  

**Output:**  
