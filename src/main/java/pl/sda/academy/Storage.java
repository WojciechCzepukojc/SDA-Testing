package pl.sda.academy;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private List<Object> data = new ArrayList<>();

    private Connection connection;

    public Storage(Connection connection) {
        this.connection = connection;
    }

    public int addValue(Object value) {
        if (connection.isClosed()) {
            throw new StorageConnectionException("Connection is closed so data cannot be added");
        }

        data.add(value);
        return data.size();
    }

    public boolean removeValue(Object value) {
        if (connection.isClosed()) {
            throw new StorageConnectionException("Connection is closed so data cannot be removed");
        }

        return data.remove(value);
    }

    public List<Object> getData() {
        if (connection.isClosed()) {
            throw new StorageConnectionException("Connection is closed so data cannot be retrieved");
        }

        return data;
    }
}