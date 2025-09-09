# A02 - Mothership Mayhem
![iss056e201248~large](https://github.com/user-attachments/assets/66cc6b28-eb04-4e6f-b82f-5b7070028cce)

Welcome aboard captain! Your team at UNC Deep Space Systems wants to build 
a modular mothership capable of swapping power sources on the fly, firing thrusters, and
running science experiment. You'll build tiny modules that communicate cleanly with proper 
encapsulation. You'll use dependency injection to refuel or change your power source mid-mission
without touching mothership code! 🚀

---

## Novice

This stage is where we lay the **foundation**: base class + propulsion.

## ShipModule (`ShipModule.java`)

Create an **abstract** class called `ShipModule`. 
This class will be your base class that all other modules will inherit from.  

### Methods

This class will have a single **concrete** (non-abstract) method called `StatusReport` with the following parameters:

- `String moduleName`
- `String moduleState`
- `boolean workingCorrectly`

Your method should have the following implementation:
1. Print a baseline line which reports the state of the current module.
2. Check if everything is working as planned and act accordingly. 

Example output:

`Attention Captain Thruster is Initializing`

`All systems are working correctly nothing is inccorect.`
OR
`Thruster needs immediate attention!`

Remember that abstract classes can contain both abstract and concrete methods. 
Subclasses of `ShipModule` can override `StatusReport` and add their own module-specific 
details. This exists as a base implementation which you can call using `super.StatusReport(...);`

## Thruster (`Thruster.java`)

Create a subclass of `ShipModule` called `Thruster`.

### Fields:

-  `int fuel` - which will initially have a value of `100`
- `boolean lastFired` - which will initially be `false`

Note: initilize you fields in your constructor
```java
public Thruster();
```

### Methods:

1. Modify `StatusReport` to make it print the amount of fuel remaining in thruster as well as whether it  
last fired. Then, call your base implementation to print the remaining information. 

Example output: 

`Thruster: 80 units of fuel remaining. Last fired: Yes`

2. Create a method called `Thrust` which takes `int availablePower` as a parameter and returns a boolean.
```java
public boolean Thrust(int availablePower);
```
- This method performs a thrust each time it is called. 
- For a successful thrust, you need to have at least 5 units of fuel and 5 units of available power.
- If you have enough fuel and power, use 5 units of fuel and set lastFired to true.
- Each time you thrust, you need to decrement you fuel value
- Print the following line `"ALERT Captain: 5 fuel used for propulsion maneuver."`
- Return `true`
- Otherwise, set lastFired to false, print `"Thruster: Not enough power or fuel to fire."` and return false.

--- 

## Adept

In this stage of the assignment, you will create your generators!

## IPowerGenerator (`IPowerGenerator.java`)

Create an interface called `IPowerGenerator` with a single method:
- `int GeneratePower()` 

Now, you'll create two classes that inherit from both `IPowerGenerator` and `ShipModule`.

## SolarGenerator (`SolarGenerator.java`)

### Methods:
1. Similar to how you did `Thruster`, modify `StatusReport` to print the following solar 
generator specific line:

`"Solar Generators will never die"`

Then, print the lines from your base implementation.

2. Implement `GeneratePower` to return a power of 10. 


## FuelGenerator (`FuelGenerator.java`)

### Fields:
-  `int fuel` - initialize as a constructor parameter

### Methods:
1. Once again, modify `StatusReport` to print the following fuel
   generator specific line:

`"FuelGenerator: 50 units of fuel remaining."`

Then, print the lines from your base implementation.

2. Implement `GeneratePower` as follows:

- If `fuel >= 10`, return ***10*** and decrement fuel. 
- Otherwise, return the remaining fuel and set fuel to 0. 

Simple reference:

| Class          | GeneratePower()                           | Tracks State | StatusReport adds…               |
| -------------- | ----------------------------------------- | ------------ | -------------------------------- |
| SolarGenerator | Constant output (e.g., 10)                | No           | Solar note, then base report     |
| FuelGenerator  | Consumes fuel in chunks (10 or remainder) | Yes (fuel)   | Fuel remaining, then base report |

---

## Jedi

Now, for the fun part where everything comes together!

## ExperimentModule (`ExperimentModule.java`)

### Fields:
- `String experimentName`
- `double[] parameters` — clone on input 
- `double result`
- `boolean hasRun`

Constructor:
```java
public ExperimentModule(String experimentName, double[] parameters) {
  // Store name, clone parameters, set hasRun to false
}
```

### Methods:

1. `void RunExperiment()` - Set hasRun to `true` and increment result by the list of 
parameters each multiplied by a random number. (use `Math.random()`)
2. `String GetSummary()` - This method should return one of the two following lines depending
on the status of `hasRun`: 
```java
return "Experiment not run yet.";
```
```java 
return "Experiment '" + experimentName + "' result: " + result;
```
3. `StatusReport` - override this method to print the following:
`ExperimentModule: {experimentName} completed.` OR `ExperimentModule: {experimentName} pending.`
depending on the status of hasRun. Then, print the lines from your base implementation.

## Mothership (`Mothership.java`)

### Fields:
- Create private instances of `IPowerGenerator`, `Thruster`, `ExperimentModuel`, and an ArrayList
of `ShipModule`. 

Use constructor injection to initialize these fields and add them to your List of ShipModules:

```java
public Mothership(IPowerGenerator powerGenerator, Thruster thruster, ExperimentModule experimentModule);
```

### Methods:
1. `int requestPower()` - this method requests power from your power generator
2. `boolean fireThruster(int availablePower)` - this method uses your thruster to thrust forward
3. `void runExperiment()` - delegate to your experiment module
4. `void printStatusReports()` - iterate modules and call StatusReport("Normal", true, moduleName)

## Extra Credit
Now, it's time to get creative!

Now that you have showed sucessful mastery of inheritance, polymorthism, encapulation, and dependcy injection you have the option of earning some extra points.
For your implementation to be concidered for extra creidt it must do the following things.
1. Be passed into `Mothership.java`
2. Inherit from the `ShipModule` Abstract class
3. Be fun and unique. Our hope for this is that you make this porject your own and try somthing your interested in

For this part, show your new module to a TA for extra credit!
