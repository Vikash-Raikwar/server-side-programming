/** 
 *Write JavaScript functions to perform basic calculations (e.g., a BMI calculator,
temperature converter).
*/

function calculateBMI(weight, height) {
  if (weight <= 0 || height <= 0) {
      return "Invalid input! Weight and height must be positive numbers.";
  }
  
  let bmi = weight / (height * height);
  
  let category = "";
  if (bmi < 18.5) {
      category = "Underweight";
  } else if (bmi >= 18.5 && bmi < 24.9) {
      category = "Normal weight";
  } else if (bmi >= 25 && bmi < 29.9) {
      category = "Overweight";
  } else {
      category = "Obese";
  }
  
  return `Your BMI is ${bmi.toFixed(2)} (${category}).`;
}

// Example-:
console.log(calculateBMI(70, 1.75)); // Output: "Your BMI is 22.86"



/**
 *temperature converter
 */
 function celsiusToFahrenheit(celsius) {
  return (celsius * 9/5) + 32;
}

function fahrenheitToCelsius(fahrenheit) {
  return (fahrenheit - 32) * 5/9;
}

// Example-:
console.log(celsiusToFahrenheit(25));  // Output: 77°F
console.log(fahrenheitToCelsius(77));  // Output: 25°C
