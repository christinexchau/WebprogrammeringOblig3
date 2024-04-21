OsloMet brukernavn: chtra2129 

GitHub brukernavn: christinexchau

Fullt navn: Christine Ngoc Tran 

GitHub repo URL: https://github.com/christinexchau/WebprogrammeringOblig3/tree/master

This program is a ticket registration system designed to facilitate the purchase of tickets for various movies. 
Users can input their first name, last name, email, phone number, select a movie from a dropdown menu,
and specify the quantity of tickets they wish to buy.

The inputs are validated to ensure that all required fields are filled out correctly before a ticket
purchase is processed. Upon submission, the ticket information is stored as objects in an array.

Users can view all purchased tickets, including details such as name, email, phone number, 
selected movie, and ticket quantity. Additionally, there is functionality to clear all
tickets from the list. The program utilizes Javascript (and jQuuery) for input validation, ticket 
registration, and rendering ticket information on the webpage.

We have also "styled" the application on the client with Boot Strap, 
where the layout of the website is more clear. We have also moved the
input information to a table in a relational database, so the
registered inputs are sent to the table. The information will be displayed on the website, 
but also on the table on this website: http://localhost:8080/h2-console. 
Here you can enter SELECT * FROM Billett, and then you will get to se all your registered tickets.
