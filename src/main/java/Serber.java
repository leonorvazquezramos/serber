import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

public class Serber {

    InetSocketAddress address;
    ServerSocket server;
    Socket socket;
    String body;
    BufferedReader reader;

    Serber(InetSocketAddress addressAndPort) {
        this.address = addressAndPort;
        try {
            this.server = new ServerSocket(address.getPort());
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
    public HttpBody listen() throws IOException {
        socket = server.accept();
        reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), Charset.defaultCharset()));
        return HttpBody.getFor(reader.lines());
    }
     **/



}
