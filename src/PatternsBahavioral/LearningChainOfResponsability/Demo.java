package PatternsBahavioral.LearningChainOfResponsability;

import PatternsBahavioral.LearningChainOfResponsability.middleware.Middleware;
import PatternsBahavioral.LearningChainOfResponsability.middleware.RoleCheckMiddleware;
import PatternsBahavioral.LearningChainOfResponsability.middleware.ThrottlingMiddleware;
import PatternsBahavioral.LearningChainOfResponsability.middleware.UserExistsMiddleware;
import PatternsBahavioral.LearningChainOfResponsability.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;
    public static void init(){
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.printf("Enter email:");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        }while (!success);
    }
}
