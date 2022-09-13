package org.example.services;

import org.example.models.NamePredict;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.io.IOException;
import java.net.MalformedURLException;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWebService {
    @WebMethod
    public NamePredict predictGenderByName(String name) throws IOException;

}