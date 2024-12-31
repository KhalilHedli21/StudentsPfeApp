Student Group Registration Web Application
This is a Java-based web application developed as part of a mini-project for the Distributed Information Systems module (L3 ISIL) at Université 20 Août 1955, Skikda. The application allows students to register their final-year project groups, providing an overview of groups for both undergraduate (License) and postgraduate (Master) levels.

Features
MVC Architecture: Organized using the Model-View-Controller design pattern.
CRUD Operations:
Create: Add new student groups with member details.
Read: View a list of registered groups.
Update: Modify group information.
Delete: Remove a group from the database.
Interactive Interface:
User-friendly JSP pages styled with CSS.
Forms for data entry and interaction.
Requirements
Java (JDK 8 or above)
Apache Tomcat (or another servlet container)
MySQL Database
JSP & Servlets for the web layer
Setup Instructions

1. Clone the Repository:
bash
Copy code
git clone https://github.com/<your-username>/<your-repository-name>.git
cd <your-repository-name>

2. Configure the Database:
Create a MySQL database (e.g., student_groups).
Import the SQL file located in the /database directory into your MySQL instance.
Update database connection settings in the project configuration file.

3. Deploy the Application:
Build the project using your IDE (e.g., NetBeans).
Deploy the WAR file to Apache Tomcat.
Access the application at http://localhost:8080/student-groups.
Usage
Open the application in a web browser.
Use the forms to register groups by providing:
Group Members' Names
Supervisor Name
Academic Level (License or Master)
Manage groups via the CRUD interface.

Additional Features:
Responsive Design: Improved UI using CSS for a better user experience.
Group Statistics: View the total number of groups categorized by academic level.

Contributing
Feel free to contribute by submitting a pull request. Any additional ideas or functionalities are welcome!
