public class App {
    public static void main(String[] args) {
        Connection conn = new Connection();
        conn.enviarMsg(args[0], args[1], args[2]);
    }
}
