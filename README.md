# For Educational Purposes Only

## Week 1: HTML Frames

Frame Structure: Design a webpage for the online book store using HTML frames. Include a navigation frame, a content frame for displaying book details, and a footer frame for additional information.

**How to Run:**
Navigate to the `1_HTML_Frames` folder. Open the `index.html` file in a web browser. This file uses framesets to combine `nav.html`, `content.html`, and `footer.html`.

## Week 2: CSS Styling

Apply CSS styling to enhance the visual appeal of the frames and content. Use appropriate styles for fonts, colors, and layout.

**How to Run:**
Navigate to the `2_CSS_Styling` folder. Open the `index.html` file in a web browser. This file links to `style.css` to apply styling to the HTML structure.

## Week 3: JavaScript

a) User Registration Form: Create a registration form for users signing up on the online bookstore. Validate the following: Username (not empty, >= 5 chars), Password (not empty, >= 8 chars), Confirm Password (must match).
b) Forgot Password Form: Implement a form for users to reset their password. Validate Email Address (valid format) and provide feedback if the email is not associated with any account.
c) Dynamically Content Loading: Use JavaScript to dynamically load book details into the content frame when a user clicks on a book in the navigation frame.

**How to Run:**
Navigate to the `3_JavaScript` folder.
- For the Registration Form, open `register.html`.
- For Dynamic Content Loading, open `dynamic.html`.
- For the Forgot Password Form, open `forgot.html`.

## Week 4: Shopping Cart Functionality

Implement a simple shopping cart using JavaScript. Allow users to add books to their cart and view the cart's contents.

**How to Run:**
Navigate to the `4_Shopping_Cart` folder. Open the `shop.html` file in a web browser. This file contains JavaScript to manage a simple in-memory shopping cart.

## Week 5: XML Structure and Design

Book Catalog XML: Design an XML structure to represent the catalog of books in the online store. Include details such as book title, author, genre, price, and availability.

**How to Run:**
Navigate to the `5_Book_XML` folder. Open the `catalog.xml` file in a text editor or web browser to view the XML structure. This is a data file and does not have a direct runnable output in a browser without further processing.

## Week 6: User Account XML

Create an XML structure to store user account information, including details like username, password (encrypted), email, and purchase history.

**How to Run:**
Navigate to the `6_User_XML` folder. Open the `users.xml` file in a text editor or web browser to view the XML structure. This is a data file and does not have a direct runnable output in a browser without further processing.

## Week 7: Install and configure Apache Tomcat server in Eclipse

Install and configure Apache Tomcat server in Eclipse.

**How to Run:**
This week involves setting up your development environment.
1. Download and install the Eclipse IDE for Java EE Developers.
2. Download the Apache Tomcat server (e.g., Tomcat 9 or 10).
3. In Eclipse, go to `Window` > `Preferences` > `Server` > `Runtime Environments`.
4. Click `Add...`, select the appropriate Apache Tomcat version, and click `Next`.
5. Browse to the installation directory of your downloaded Tomcat server and click `Finish`.
6. You can now add a new server instance in the `Servers` view (`Window` > `Show View` > `Servers`) and associate your projects with it for deployment and testing.

## Week 8: Servlet for Book Retrieval

Develop a servlet that retrieves book information from a database and sends it to the content frame.

**How to Run:**
Navigate to the `8_Book_Servlet` folder. This week requires a running web server (like Tomcat, configured in Week 7) and potentially a database. The `index.html` file uses frames to display `menu.html` and the output of the `BookServlet`. You would need to deploy the servlet to your configured server and then access `index.html` through the server. (Note: I do not have access to the Servlet code itself in the provided context, but the syllabus describes its function.)

## Week 9: User Authentication

Implement user authentication using servlets and JSP. Create a login page and restrict access to certain pages for authenticated users.

**How to Run:**
This week builds upon the server-side concepts introduced in Week 8, using Servlets and JSP. You would need a running web server (Tomcat) and the deployed application. Access the login page (specific file name not available in context) through your server. (Note: I do not have access to the specific code files for this week in the provided context, but the syllabus describes the authentication functionality.)

## Week 10: Hibernate

Hibernate Entity Mapping: Create Hibernate entity classes to represent books and users. Map these entities to corresponding database tables.

**How to Run:**
This week involves setting up Hibernate for Object-Relational Mapping. This typically involves Java code (entity classes) and configuration files. Running this would require a Java development environment, Hibernate libraries, and a database. There is no single file to "run" directly from the project folders. (Note: I do not have access to the specific code files for this week in the provided context, but the syllabus describes the Hibernate mapping.)

## Week 11: CRUD Operations

Implement CRUD operations using Hibernate for managing book information in the database.

**How to Run:**
This week involves implementing Create, Read, Update, and Delete operations using the Hibernate setup from Week 10. This would involve Java code interacting with the database via Hibernate. Running this would require a Java environment, Hibernate, and a database. There is no single file to "run" directly from the project folders. (Note: I do not have access to the specific code files for this week in the provided context, but the syllabus describes the CRUD functionality.)

## Week 12: Full-Stack Integration

Integrate JavaScript with Servlets: Enhance the shopping cart functionality by integrating JavaScript with servlets. Allow users to update the cart without page refresh.

**How to Run:**
Navigate to the `12_Full_Stack` folder. Open the `index.html` file. This week integrates client-side JavaScript with server-side Servlets (like `CartServlet` mentioned in the code). You would need a running web server (Tomcat) with the deployed application including the necessary Servlets. Access `index.html` through the server.

## Week 13: Checkout Process

Implement a checkout process using servlets and JSP. Allow users to review their cart, enter shipping information, and complete the purchase.

**How to Run:**
This week implements the final checkout flow using server-side technologies (Servlets and JSP). You would need a running web server (Tomcat) with the deployed application. The checkout process would likely start from the shopping cart page (Week 12) and involve multiple steps handled by the server. (Note: I do not have access to the specific code files for this week in the provided context, but the syllabus describes the checkout process.)

## Week 14: Deployment and Advanced Features

Web Deployment: Deploy the online bookstore application to a servlet container (e.g., Apache Tomcat) on a cloud platform.

**How to Run:**
This week focuses on deploying the complete application to a production environment.
1. Ensure your project is configured correctly for deployment (e.g., as a Dynamic Web Project in Eclipse).
2. Export your project as a Web Archive (WAR) file. In Eclipse, right-click the project, select `Export` > `WAR file`.
3. Choose a cloud platform that supports Java web applications and servlet containers (e.g., AWS Elastic Beanstalk, Google App Engine, Heroku, or a VPS with Tomcat installed).
4. Follow the platform-specific instructions to deploy your WAR file to the Tomcat server instance running on the cloud.
5. Once deployed, access your application via the URL provided by the cloud platform.
