package edu.hw2.Task3;

import edu.hw2.Task3.Connection;
import javax.naming.CommunicationException;

public interface ConnectionManager {
    Connection getConnection() throws CommunicationException;
}
