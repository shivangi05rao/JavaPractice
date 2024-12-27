package complete_coding_interview_guidebook.solidprinciples.dependencyinversion;

public interface JdbcUrl {
    public String get();
}

class PostgresSQLJdbcUrl implements JdbcUrl {

    private final String dbName;

    public PostgresSQLJdbcUrl(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public String get() {
        return "jdbc://..." + this.dbName;
    }
}

class ConnectDatabase {
    public void connect(JdbcUrl jdbcUrl) {
        System.out.println("Connecting to " + jdbcUrl.get());
    }
}
