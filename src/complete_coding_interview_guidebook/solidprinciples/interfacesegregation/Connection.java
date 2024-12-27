package complete_coding_interview_guidebook.solidprinciples.interfacesegregation;

public interface Connection {
    public void connect();
}

interface HttpConnection extends Connection {
    public void http();
}

interface SocketConnection extends Connection {
    public void socket();
}

class WwwConnection implements HttpConnection {

    private final String www;

    public WwwConnection(String www) {
        this.www = www;
    }

    @Override
    public void http() {
        System.out.println("Setup http connection to " + www);
    }

    @Override
    public void connect() {
        System.out.println("Connect to " + www);
    }
}

