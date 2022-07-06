# restful-spring

In this project we are transferring the data using REST in spring via Http protocol, Here we have Cricketer Model 
and it stores basic details of a Cricketer like Name, Country and Icc-Rank. We map the request of the client to
a controller method, that will then return the response which will be represented in terms of JSON.

We can send an Object as a response, or Collection of objects directly and if we want to add some data 
in the response headers or some specific Status with the body then we can use the ResponseEntity<T> class.

In order to send data from client to server, in my case sending a new Cricketer through the request-body
because there is more data, so it is better to send it via the body. On the Controller action method
we have to mark RequestBody annotation so that the Spring knows that the data which is incoming as JSON
(default format in Spring REST) object, it has to Un-marshal it into the plain POJO which is Cricketer.
It will try to do it and if the conversion was un-successful then it throws an exception saying Bad Request.
The fields need to be exactly same as that of the Java Object which we have created in order to do the conversion.