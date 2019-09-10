package ru.ak.regex;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.regex.Pattern;

/**
 * Web-сервис для реализация интерфейса взаимодействия
 * @author a.kakushin
 */
@WebService(name = "RegexClient", serviceName = "RegexClient", portName = "RegexClientPort")
public class RegexClient {

    @WebMethod
    public boolean matches(
            @WebParam(name = "pattern") String pattern,
            @WebParam(name = "text") String text) {

        Pattern ptr = Pattern.compile(pattern);
        return ptr.matcher(text).matches();
    }

    @WebMethod
    public boolean lookingAt(
            @WebParam(name = "pattern") String pattern,
            @WebParam(name = "text") String text) {

        Pattern ptr = Pattern.compile(pattern);
        return ptr.matcher(text).lookingAt();
    }

    @WebMethod
    public boolean find(
            @WebParam(name = "pattern") String pattern,
            @WebParam(name = "text") String text) {

        Pattern ptr = Pattern.compile(pattern);
        return ptr.matcher(text).find();
    }

    @WebMethod
    public String replaceFirst(
            @WebParam(name = "pattern") String pattern,
            @WebParam(name = "text") String text,
            @WebParam(name = "replacement") String replacement) {

        Pattern ptr = Pattern.compile(pattern);
        return ptr.matcher(text).replaceFirst(replacement);
    }

    @WebMethod
    public String replaceAll(
            @WebParam(name = "pattern") String pattern,
            @WebParam(name = "text") String text,
            @WebParam(name = "replacement") String replacement) {

        Pattern ptr = Pattern.compile(pattern);
        return ptr.matcher(text).replaceAll(replacement);
    }
}