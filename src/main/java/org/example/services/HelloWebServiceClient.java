package org.example.services;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class HelloWebServiceClient {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://localhost:1986/wss/service?wsdl");
        QName qname = new QName("http://web-service.org/", "HelloWebServiceImplService");
        Service service = Service.create(url, qname);
        HelloWebService hello = service.getPort(HelloWebService.class);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the name or 0 to exit:");
            String input = scanner.nextLine();
            if (input.equals("0")) {
                System.out.println("Disconnecting...");
                break;
            }
            System.out.println(hello.predictGenderByName(input));
        }
    }
}
