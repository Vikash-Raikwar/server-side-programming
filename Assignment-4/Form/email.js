function validateForm() {
  let valid = true;

  // Clear previous errors
  document.getElementById("nameError").textContent = "";
  document.getElementById("emailError").textContent = "";
  document.getElementById("phoneError").textContent = "";
  document.getElementById("passwordError").textContent = "";

  // Get values
  const name = document.getElementById("name").value.trim();
  const email = document.getElementById("email").value.trim();
  const phone = document.getElementById("phone").value.trim();
  const password = document.getElementById("password").value.trim();

  // Name validation
  if (name === "") {
      document.getElementById("nameError").textContent = "Name is required.";
      valid = false;
  }

  // Email validation
  const emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
  if (email === "") {
      document.getElementById("emailError").textContent = "Email is required.";
      valid = false;
  } else if (!emailPattern.test(email)) {
      document.getElementById("emailError").textContent = "Please enter a valid email address.";
      valid = false;
  }

  // Phone number validation
  const phonePattern = /^[0-9]{10}$/; // 10-digit phone number
  if (phone === "") {
      document.getElementById("phoneError").textContent = "Phone number is required.";
      valid = false;
  } else if (!phonePattern.test(phone)) {
      document.getElementById("phoneError").textContent = "Please enter a valid 10-digit phone number.";
      valid = false;
  }

  // Password validation
  if (password === "") {
      document.getElementById("passwordError").textContent = "Password is required.";
      valid = false;
  } else if (password.length < 6) {
      document.getElementById("passwordError").textContent = "Password must be at least 6 characters long.";
      valid = false;
  }

  if (valid) {
      alert("Registration successful!");
      document.getElementById("registrationForm").reset();
  }
}
