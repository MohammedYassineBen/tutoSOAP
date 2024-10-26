package tutoSOAP;

import jakarta.jws.WebService;

@WebService(endpointInterface = "your.package.CalculatorWebService")
public class CalculatorWebServiceImpl implements CalculatorWebService {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}
