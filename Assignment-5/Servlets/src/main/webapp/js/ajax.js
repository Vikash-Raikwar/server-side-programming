function submitForm() {
  const form = document.getElementById('loginForm');
  const formData = new FormData(form);

  fetch('LoginServlet', {
      method: 'POST',
      body: formData
  })
  .then(response => response.redirected ? window.location.href = response.url : response.text())
  .catch(error => console.error('Error:', error));
}