
# REST API Springboot Project

This project implements a simple Spring Boot RESTful API for managing courses. It provides endpoints to perform basic CRUD operations on courses.

## Endpoints
### Insert a course
- Method: POST http://localhost:8080/course
```
    {
        "name" : "Java",
        "price" : 60000
    }
```

### Get all cources
- Method: GET http://localhost:8080/courses

### Get course by Id
- Method: GET http://localhost:8080/course/1

### Update a course
- Method: PUT http://localhost:8080/course
```
    {
    "cid" : 1,
    "name" : "springboot",
    "price" : 600000
    }
```

### Delete a course by id
- DELETE http://localhost:8080/course/2
