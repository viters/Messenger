import java.io.IOException;
import java.net.ServerSocket;

/**
 * Created by sir.viters on 11.10.2016.
 */
class Server extends Service {
    private int port;
    private ServerSocket socket;

    Server(int port) throws IOException {
        this.port = port;
        socket = new ServerSocket(port);

        runService();
    }

    protected final void connect() throws IOException {
        System.out.println("Waiting for connection...");
        connection = socket.accept();
        System.out.println("Connection established.");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
