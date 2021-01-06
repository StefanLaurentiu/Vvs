import java.net.Socket;

import org.apache.log4j.Logger;

import http.HttpRequest;
import http.HttpResponse;

// Clasa de thread uri care raspunde solicitarilor socket-ului
public class RequestHandler implements Runnable {

    private static Logger log = Logger.getLogger(RequestHandler.class);

    private Socket socket;

    public RequestHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            HttpRequest req = new HttpRequest(socket.getInputStream());
            HttpResponse res = new HttpResponse(req);
            res.write(socket.getOutputStream());
            socket.close();
        } catch (Exception e) {
            log.error("Runtime Error", e);
        }
    }
}
