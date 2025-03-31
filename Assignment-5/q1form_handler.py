import cgi

# HTTP Header
print("Content-Type: text/html\n")

# Form Data Handling
form = cgi.FieldStorage()
name = form.getvalue("name")
email = form.getvalue("email")

# Display the form data
print(f"""
<html>
<head><title>CGI Form Submission</title></head>
<body>
    <h2>CGI Form Submission Result</h2>
    <p>Name: {name}</p>
    <p>Email: {email}</p>
</body>
</html>
""")