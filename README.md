# mobile-app-ws

# User CRUD Operations Documentation
## Overview
This document provides information on the CRUD operations for managing users in a RESTful web service implemented using Spring Boot 3.2.0, Java 17, and Maven.

## Table of Contents

1. [Project Structure](#project-structure)
2. [API Endpoints](#api-endpoints)
   1. [Create User](#2.1-create-user)
   2. [Read User](#2.2-get-user)
   3. [Update User](#2.3-update-user)
   4. [Delete User](#2.4-delete-user)
3. [Conclusion](#conclusion)

### Project Structure
   The project follows a standard Spring Boot structure. Key components include:

src/main/java: Contains Java source code.
src/main/resources: Contains application properties and configurations.
src/test: Contains test cases.
## API Endpoints
### 2.1 Create User
Endpoint:
```bash
POST /users
```

Request:
```json
{
   "firstName": "john",
   "lastName": "doe",
   "email": "test@test.com",
   "password": "mysupersecretpassword"
}
```

Response:
```json
{
   "userId": "9d3ad0ec-7529-4157-8dbb-b13ee2bfc13d",
   "firstName": "john",
   "lastName": "doe",
   "email": "test@test.com"
}
```

### 2.2 Get User
Endpoint:
```bash
GET /users/{userId}
```

Request:
```bash
GET /users/9d3ad0ec-7529-4157-8dbb-b13ee2bfc13d
```

Response:
```json
{
   "userId": "9d3ad0ec-7529-4157-8dbb-b13ee2bfc13d",
   "firstName": "john",
   "lastName": "doe",
   "email": "test@test.com"
}
```

### 2.3 Update User
Endpoint:
```bash
PUT /users/{userId}
```

Request:
```bash
PUT /users/9d3ad0ec-7529-4157-8dbb-b13ee2bfc13d
```

```json
{
   "firstName": "john",
   "lastName": "doe-updated"
}
```

Response:
```json
{
   "userId": "9d3ad0ec-7529-4157-8dbb-b13ee2bfc13d",
   "firstName": "john",
   "lastName": "doe-updated",
   "email": "test@test.com"
}
```

### 2.4 Delete User
Endpoint:
```bash
DELETE /users/{id}
```

Request:
```bash
DELETE /users/9d3ad0ec-7529-4157-8dbb-b13ee2bfc13d
```

Response:
```
204 No Content
```

### Conclusion
In conclusion, the mobile-app-ws project provides a robust and well-structured RESTful web service for managing user data using Spring Boot 3.2.0, Java 17, and Maven. 
The CRUD operations (Create, Read, Update, Delete) are efficiently implemented, offering a seamless experience for interacting with user information.
This documentation outlines the basic CRUD operations for managing users in a Spring Boot 3.2.0 project. 
