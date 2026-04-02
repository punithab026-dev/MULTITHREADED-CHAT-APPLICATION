# MULTITHREADED-CHAT-APPLICATION

*COMPANY NAME*: CODTECH IT SOLUTIONS 

*NAME*: B.PUNITHA

*INTERN ID*: CTIS7838

*DOMAIN*: JAVA PROGRAMMING

*DURATION*: 4 WEEKS 

*MENTOR*: NEELA SANTHOSH KUMAR

*ABOUT THE APPLICATION*:

***This Multithreaded Chat Application is developed using Java Socket Programming and is designed to enable real-time communication between multiple clients connected to a single server. The application follows a client-server architecture where the server acts as a central hub and clients connect to it to send and receive messages. The main functionality of this application is to allow multiple users to chat simultaneously, which is achieved using multithreading.

The server-side program uses the ServerSocket class to listen for incoming client connections on a specific port (for example, 1234). When a client tries to connect, the server accepts the connection using the accept() method, which returns a Socket object. For each connected client, a new thread is created using the Runnable interface. This is an important concept because it allows the server to handle multiple clients at the same time without blocking other connections. Each client is managed by a separate ClientHandler thread.

The ClientHandler class is responsible for handling communication between the server and a specific client. It uses BufferedReader to read messages from the client and PrintWriter to send messages back. The readLine() method is used to continuously listen for incoming messages from the client. Whenever a message is received, the server uses a broadcast() function to send that message to all other connected clients. This broadcast mechanism is a key feature of the application.

On the client side, the program uses the Socket class to connect to the server using the server's IP address (usually localhost) and port number. Once connected, the client can send messages using PrintWriter and receive messages using BufferedReader. To ensure that sending and receiving can happen simultaneously, the client program also uses multithreading. One thread is dedicated to sending messages (taking input from the user using System.in), while another thread continuously listens for incoming messages from the server.

Some important keywords and concepts used in this project include ServerSocket, Socket, Thread, Runnable, BufferedReader, InputStreamReader, PrintWriter, readLine(), println(), accept(), and broadcast(). These components work together to establish communication channels, handle multiple users, and ensure smooth data transmission between the server and clients.

Overall, this application demonstrates the core concepts of networking and concurrency in Java. It is a simple yet effective example of how real-time chat systems work, similar to messaging platforms, and can be further enhanced by adding features like usernames, private messaging, and graphical user interfaces.

*OUTPUT*:

<img width="1110" height="256" alt="Image" src="https://github.com/user-attachments/assets/19031f53-377c-49c3-bf3a-003b88ed7104" />

<img width="1110" height="256" alt="Image" src="https://github.com/user-attachments/assets/b2bab19a-60cc-4e19-b533-c0b808f5bb04" />

<img width="1100" height="225" alt="Image" src="https://github.com/user-attachments/assets/f7001b1c-9be5-4df6-ab70-520505f5279b" />



