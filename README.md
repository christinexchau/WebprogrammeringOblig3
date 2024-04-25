OsloMet brukernavn: chtra2129

GitHub brukernavn: christinexchau

Fullt navn: Christine Ngoc Tran 

GitHub repo URL: https://github.com/christinexchau/WebprogrammeringOblig3

Youtube URL: https://www.youtube.com/watch?v=sgv7Hcd9wpY

This program is a ticket registration system designed to facilitate the purchase of tickets for various movies. 
Users can input their first name, last name, email, phone number, select a movie from a dropdown menu,
and specify the quantity of tickets they wish to buy.

The inputs are validated to ensure that all required fields are filled out correctly before a ticket
purchase is processed. Upon submission, the ticket information is stored as objects in an array.

Users can view all purchased tickets, including details such as name, email, phone number, 
selected movie, and ticket quantity. Additionally, there is functionality to clear all
tickets from the list. The program utilizes Javascript (and jQuuery) for input validation, ticket 
registration, and rendering ticket information on the webpage.

In this update of the mandatory task 1, the storage of orders has been transferred
from the client to the server using Spring Boot and Java. Originally, orders were stored
in an array on the server, but this is now replaced with a table in a relational database. 
At the same time, the client application is styled with Bootstrap for an improved user interface.
