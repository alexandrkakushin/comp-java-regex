package ru.ak.regex;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.regex.*;

/**
 * Web-сервис для реализация интерфейса взаимодействия
 * @author a.kakushin
 */
@WebService(name = "RegexClient", serviceName = "RegexClient", portName = "RegexClientPort")
public class RegexClient {

    @WebMethod
    public boolean check(
            @WebParam(name = "pattern") String pattern,
            @WebParam(name = "text") String text) {

        Pattern ptr = Pattern.compile(pattern);
        return ptr.matcher(text).matches();
    }
}
