
#######################
This is a Spring Boot Kafka consumer application that can receive messages from the topic named message-topic. If you want to provide your own topic name and consumer group ID, you can do so by updating the application.properties file at the location src/main/resources/application.properties

After consuming the messages, the application processes them and saves them to an embedded H2 database while maintaining the order of the messages. You can check the messages in the H2 database table by navigating to the URL http://localhost:port/h2-console in your browser. If prompted for credentials, use the username: sa and password: password.

You can run this application in Eclipse as a Spring Boot application, and it will run on a dynamic port. Please note down the port number, as you will need it when checking the H2 database table through the console URL provided above.
#######################
