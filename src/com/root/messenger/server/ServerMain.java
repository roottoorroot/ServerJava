package server;

import org.omg.CORBA.SystemException;

/**
 * Created by root on 29.06.2017.
 */
public class ServerMain {
    private int port;
    private Server server;

    public ServerMain(int port) {
        this.port = port;
        new Server(port);
    }

    public static void main(String[] args) {
        int port;
        if (args.length != 1) {
            System.out.println("Use: java -jar program.jar [port]");
            System.exit(1);
        }
        port = Integer.parseInt(args[0]);
        new ServerMain(port);
    }

}
