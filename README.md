# ShopCart

A Spring Boot e-commerce application for managing and shopping products. ShopCart provides a simple and intuitive interface for viewing products, adding items to cart, and managing purchases.

## Project Overview

ShopCart is a web application built with Spring Boot that allows users to:
- View a list of available products
- Add products to their shopping cart
- Edit and delete items from the cart
- View the total price of items in the cart
- Manage product inventory

## Technologies Used

- **Framework:** Spring Boot 4.0.2
- **Language:** Java 25
- **Database:** MySQL
- **Build Tool:** Maven
- **Web Template:** Thymeleaf
- **ORM:** Spring Data JPA
- **Packaging:** WAR (Web Application Archive)

## Project Structure

```
ShopCart/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── tn/enis/
│   │   │       ├── ShopCartApplication.java          # Main Spring Boot application class
│   │   │       ├── ServletInitializer.java           # Tomcat initialization
│   │   │       ├── controller/
│   │   │       │   └── ProductController.java        # REST endpoints for products
│   │   │       ├── dto/
│   │   │       │   └── ProductDto.java               # Data transfer object for products
│   │   │       ├── Service/
│   │   │       │   └── ProductService.java           # Business logic for products
│   │   │       └── shopcart/
│   │   └── resources/
│   │       ├── application.properties                # Configuration properties
│   │       ├── static/                               # Static resources (CSS, JS, images)
│   │       └── templates/
│   │           └── products.html                     # Thymeleaf template for products page
│   └── test/
│       └── java/tn/enis/                             # Unit tests
├── pom.xml                                            # Maven configuration
├── mvnw & mvnw.cmd                                   # Maven wrapper scripts
└── README.md                                          # This file

```

## Key Components

### ProductController
Handles HTTP requests for product operations:
- `GET /products` - Display all products and shopping cart
- `POST /products/add` - Add a product to the cart
- `GET /products/delete/{index}` - Remove a product from the cart
- `GET /products/edit/{index}` - Display product editing form
- `POST /products/update` - Update a product in the cart

### ProductService
Core business logic for product management:
- `getAll()` - Retrieve all products in the cart
- `add(ProductDto)` - Add a new product to the cart
- `delete(int)` - Remove a product by index
- `get(int)` - Retrieve a specific product
- `update(int, ProductDto)` - Update product details
- `getTotal()` - Calculate the total price

### ProductDto
Data transfer object containing:
- Product name
- Price
- Quantity
- Description (optional)

## Prerequisites

- Java 25 or higher
- Maven 3.6+
- MySQL 8.0+ (for database)

## Getting Started

### 1. Clone the Repository
```bash
git clone <repository-url>
cd ShopCart
```

### 2. Configure Database Connection
Edit `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/shopcart_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### 3. Build the Project
```bash
mvn clean install
```

Or using the Maven wrapper:
```bash
./mvnw clean install
```

### 4. Run the Application
```bash
mvn spring-boot:run
```

Or:
```bash
./mvnw spring-boot:run
```

The application will start on `http://localhost:8080`

### 5. Access the Application
Navigate to `http://localhost:8080/products` in your web browser to access the ShopCart application.

## Available Maven Commands

- `mvn clean` - Clean the target directory
- `mvn compile` - Compile the project
- `mvn test` - Run unit tests
- `mvn package` - Package the application as WAR
- `mvn spring-boot:run` - Run the application directly
- `mvn clean install` - Clean, compile, test, and package the project

## Features

- **Product Management:** Add, edit, and delete products
- **Shopping Cart:** Manage items in your shopping cart
- **Price Calculation:** Automatic calculation of total cart price
- **Responsive Design:** User-friendly web interface using Thymeleaf
- **Persistent Storage:** Database integration with MySQL using JPA

## Development

### Code Structure
- **Controller Layer:** Handles HTTP requests/responses
- **Service Layer:** Implements business logic
- **DTO Layer:** Data transfer objects for API communication
- **View Layer:** Thymeleaf templates for UI rendering

### Testing
Run tests with:
```bash
mvn test
```

## Packaging

To create a deployable WAR file:
```bash
mvn clean package
```

The WAR file will be located in the `target/` directory and can be deployed to any Tomcat application server.

## Dependencies

Key dependencies managed by Spring Boot 4.0.2:
- `spring-boot-starter-data-jpa` - Data access with JPA/Hibernate
- `spring-boot-starter-webmvc` - Web MVC framework
- `spring-boot-starter-thymeleaf` - Template engine
- `mysql-connector-j` - MySQL JDBC driver
- `spring-boot-devtools` - Development utilities

## Troubleshooting

### Database Connection Issues
- Ensure MySQL is running and accessible
- Verify database credentials in `application.properties`
- Create the database if it doesn't exist

### Port Already in Use
- Change the server port in `application.properties`:
```properties
server.port=8081
```

### Build Failures
- Clear the Maven cache: `mvn clean -U`
- Ensure Java 25 is installed: `java -version`

## Contributing

1. Create a feature branch
2. Make your changes
3. Run tests to ensure quality
4. Submit a pull request

## License

This project is open source and available under the MIT License.

## Contact

For issues, questions, or suggestions, please open an issue in the repository or contact the development team.

## Additional Resources

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Spring Data JPA Guide](https://spring.io/guides/gs/accessing-data-jpa/)
- [Thymeleaf Documentation](https://www.thymeleaf.org/)
- [Maven Documentation](https://maven.apache.org/guides/index.html)

---

**Last Updated:** February 2026  
**Version:** 0.0.1-SNAPSHOT

