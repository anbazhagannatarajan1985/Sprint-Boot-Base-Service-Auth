**To run Locally**

* Install mongo DB
* Create a DB 'DB_NAME' using mongo shell 
`use DB_NAME`
* Create a DB user "DB_USER", with password as "DB_PASSWORD"
`

db.createUser(

       {
         "user": "DB_USER",
         "pwd": "DB_PASSWORD",
         "roles": [
            { "role": "read", "db": "DB_NAME" }
         ]
       } 
   )
`
`
db.users.createIndex({"username" :1 }, { unique : true })
`

* Run the music-service application as Spring Boot application
* Run the Integration Test to Create a Test User
* Login to get JWT token

````
curl -i -H "Content-Type: application/json" -X POST -d '{                                                                                                                                                                                "username": "admin",
    "password": "password"
}' http://localhost:8080/login
````
**Get User using JWT**
````
curl -i -H "Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTUzNTg2MTkwMn0.3wliHwwh0YIwNgreeG9nuKLdoQhtG-9-3Liiopa9VnPgsrffsdDspjdQi4MPskxyMFF72L9uOHGzu8o3lmr1XA" http://localhost:8080/users/2047d68c-5a1f-4098-a2f6-6f80ee3f8147
````
  
**API DOC**
http://localhost:8080/swagger-ui.html
