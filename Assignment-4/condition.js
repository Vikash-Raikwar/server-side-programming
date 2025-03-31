/** 
 * if-else condition
*/
function validateInput(input) {
  if (input >= 0 && input <= 100) {
    return "Input is valid";
  } else {
    return "Input is invalid";
  }
}


/**
 * switch case 
 */
function validateInput(input) {
  switch (true) {
    case input >= 0 && input <= 100:
      return "Input is valid";
    default:
      return "Input is invalid";
  }
}