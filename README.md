# JavaSocketTesting
A quick project done within minutes to help conceptualize everything after the 3rd layer of networking. Helps understand sockets which are bound to a specific port in order to recieve or send data between hosts.

From the tutorial [here](https://www.youtube.com/watch?v=bWKbdPAovFA&list=PLoW9ZoLJX39Xcdaa4Dn5WLREHblolbji4&ab_channel=AbhayRedkar
). 

Java was chosen due to the its VM and my aversion to using <winsock2.h> for C/C++

# Anatomy
The program(s) comes in two parts: 
<ul><li>The client jar and the server jar.</li></lu>

The client jar creates a socket and attempts to the ServerSocket (which is assumed to already be running).

Afterwards, the user on the client side types in a string which is sent to the server and uppercased.

The server than creates a socket which will be used to send the result back to the client via it's output stream.

The result is printed on the client's console.
