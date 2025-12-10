 # eCommerce Backend API

A robust, scalable eCommerce backend API designed to handle products, orders, payments, inventory, user management, and more. 
Built with clean architecture, modular design, and best engineering practices to support both mobile and web storefronts.

## Features
### Product Management

. Create, update, delete products

. Categories & subcategories

. Search, filtering & sorting

. Image support (via storage service)

### User & Authentication

. User registration & login

. JWT-based authentication

. Role-based access control (Admin / Customer)

### Shopping Cart & Checkout

. Add/remove/update cart items

. Cart persistence per user

. Checkout flow (order creation)

### Order Management

. Create and track orders

. Update order status (Admin)

. Order history per user

### Payment Integration

. Supports payment gateway integration  [Stripe/PayPal]

. Payment verification

### Admin Dashboard Support

. Manage products, categories, and orders

. View analytics endpoints for dashboards

### Additional Features

. API versioning

. Global exception handling

. Secure password hashing

. Logging & request validation

## Tech Stack
| Layer        | Technology           |
|--------------|-----------------------|
| Language     | Java                  |
| Framework    | Spring Boot           |
| Database     | MySQL / PostgreSQL    |
| Security     | Spring Security + JWT |
| Build Tool   | Maven / Gradle        |
| Documentation| Swagger / OpenAPI     |
