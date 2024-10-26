package tutoSOAP;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;

@WebService
public interface CalculatorWebService {
    @WebMethod
    int add(int a, int b);

    @WebMethod
    int subtract(int a, int b);
}
