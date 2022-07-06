# restful-spring

In this project we are transferring the data using REST in spring via Http protocol, Here we have Cricketer Model 
and it stores basic details of a Cricketer like Name, Country and Icc-Rank. We map the request of the client to
a controller method, that will then return the response which will be represented in terms of JSON.

We can send an Object as a response, or Collection of objects directly and if we want to add some data 
in the response headers or some specific Status with the body then we can use the ResponseEntity<T> class.
