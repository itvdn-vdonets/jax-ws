package org.example;
import org.example.services.HelloWebServiceImpl;

import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:1986/wss/service?wsdl", new HelloWebServiceImpl());
    }
}