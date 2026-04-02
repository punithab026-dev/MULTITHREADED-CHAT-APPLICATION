import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1234);
            System.out.println("Connected to server");

            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader serverIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Thread for receiving messages
            new Thread(() -> {
                String msg;
                try {
                    while ((msg = serverIn.readLine()) != null) {
                        System.out.println("Message: " + msg);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

            // Sending messages
            String userMsg;
            while ((userMsg = input.readLine()) != null) {
                out.println(userMsg);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}