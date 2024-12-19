# Z-Car Rental Application

Z-Car is a vehicle rental application that allows users to rent cars and bikes, with role-based access for Users, Admins, and Drivers. The application supports login, signup, and comprehensive management of vehicle rentals, including invoice generation.

---

## Features

### User Role Management
- **Users**:
  - Login or sign up.
  - Rent cars or bikes.
- **Admins**:
  - Manage services for users, drivers, and vehicles.
  - Add or remove cars and bikes.
- **Drivers**:
  - Manage their assigned services.

### Vehicle Rental
- Users can rent cars or bikes from the available options.
- Automatic driver assignment for users without a valid license.

### Invoice Generation
- Rental invoices are generated based on:
  - Number of rental days.
  - Inclusion of a driver.

### Admin and Driver Services
- Admins can:
  - Add or manage bikes and cars.
  - Manage users and drivers.
- Drivers can:
  - View and manage their services.

---

## Classes and Methods

### 1. **User**
Handles user registration, login, and data management.

#### Methods:
- `login()`: Validates user login.
- `signup()`: Handles user registration.
- `getlicence()`: Checks the user's license type.

### 2. **Admin**
Manages the system services for users, drivers, cars, and bikes.

#### Methods:
- `login()`: Validates admin login.
- `services()`: Admin's dashboard for managing the system.

### 3. **Driver**
Manages driver login and assigned services.

#### Methods:
- `login()`: Validates driver login.
- `services()`: Driver's dashboard for managing services.

### 4. **Car**
Manages car-related rentals.

#### Methods:
- `displayVehicles()`: Displays available cars.
- `addCar()`: Adds new cars to the system.
- `carFull()`: Processes car rentals and generates invoices.

### 5. **Bike**
Manages bike-related rentals.

#### Methods:
- `displayVehicles()`: Displays available bikes.
- `addBike()`: Adds new bikes to the system.
- `bikeFull()`: Processes bike rentals and generates invoices.

### 6. **Invoice**
Generates rental invoices for cars and bikes.

#### Methods:
- `generateinvoicecar()`: Generates an invoice for car rentals.
- `generateinvoicebike()`: Generates an invoice for bike rentals.

### 7. **RideDetails**
Stores details about the rental ride.

#### Methods:
- `getStartaddress()`: Returns the start address.
- `getNoofdays()`: Returns the number of rental days.
- `getDate()`: Returns the rental date.

---

## How to Run

1. Clone the repository or download the code files.
2. Compile and run the `Main` class in your Java IDE or terminal.
   ```bash
   javac Main.java
   java Main
   ```
3. Follow the prompts:
   - Choose your role (User, Admin, Driver).
   - Login or sign up.
   - Select the vehicle you want to rent (Car or Bike).
   - Complete the rental process and view the invoice.

---

## Example Usage

### User Login
```plaintext
Enter type of Account:
If User enter 1
If Admin enter 2
If Driver enter 3
1

Login OR SignUp
For Login enter 1
For SignUp enter 2
1
```

### Admin Services
```plaintext
Enter type of Account:
If User enter 1
If Admin enter 2
If Driver enter 3
2

Login OR SignUp
For Login enter 1
For SignUp enter 2
1
```

### Renting a Vehicle
```plaintext
Enter the type of Vehicle you want to rent:
If Car press 1...
If Bike press 2...
1
```

### Invoice Generation
```plaintext
Invoice:
Name            : John Doe
Email           : johndoe@example.com
No of Days      : 3
Date            : 2024-12-20
Total Amount    : 12000
```

---

## License

This project is open-source and available under the [MIT License](LICENSE).

