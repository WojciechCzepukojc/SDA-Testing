package pl.sda.academy;

public class Connection {

    private boolean state;

    public void open() throws InterruptedException {
        Thread.sleep(500L);
        state = true;
    }

    public void close() throws InterruptedException {
        Thread.sleep(500L);
        state = false;
    }

    public boolean isOpened() {
        return state;
    }

    public boolean isClosed() {
        return !isOpened();
    }

    public void refresh() {
        System.out.println("Refreshing the connection...");
    }
}