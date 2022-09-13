package org.example.services;

import org.apache.commons.io.IOUtils;
import org.example.models.NamePredict;
import org.json.JSONObject;

import javax.jws.WebService;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

@WebService(endpointInterface = "org.example.services.HelloWebService",
        targetNamespace = "http://web-service.org/")
public class HelloWebServiceImpl implements HelloWebService {

    @Override
    public NamePredict predictGenderByName(String targetName) throws IOException {
        String sURL = "https://api.genderize.io/?name="+targetName;
        NamePredict namePredict = null;
        JSONObject json = new JSONObject(IOUtils.toString(new URL(sURL), StandardCharsets.UTF_8));
        String gender = json.getString("gender");
        String name = json.getString("name");
        Double probability = json.getDouble("probability");
        namePredict = new NamePredict(gender, name, probability);
        return namePredict;
    }

}
