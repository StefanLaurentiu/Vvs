import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebServer {

    private static Logger log = Logger.getLogger(WebServer.class);

    private static final int DEFAULT_PORT = 8080;

    private static final int N_THREADS = 3;

    public static void main(String args[]) {
        try {
            new WebServer().start(getValidPortParam(args));
        } catch (Exception e) {
            log.error("Startup Error", e);
        }
    }

    public void start(int port) throws IOException {
        ServerSocket s = new ServerSocket(port);
        System.out.println("Web server listening on port " + port );
        ExecutorService executor = Executors.newFixedThreadPool(N_THREADS);
        while (true) {
            executor.submit(new RequestHandler(s.accept()));
        }
    }

    static int getValidPortParam(String args[]) throws NumberFormatException {
        if (args.length > 0) {
            int port = Integer.parseInt(args[0]);
            if (port > 0 && port < 65535) {
                return port;
            } else {
                throw new IllegalArgumentException("Invalid port! Port value is a number between 0 and 65535");
            }
        }
        return DEFAULT_PORT;
    }
}
