public class DatabaseConn {
    private static volatile DatabaseConn instance;

    private DatabaseConn() {
    }

    public static DatabaseConn getInstance() {
        if (instance != null) {
            return instance;
        } else {
            synchronized (DatabaseConn.class) {
                if (instance == null) {
                    instance = new DatabaseConn();
                }
                return instance;
            }
        }
    }
}
