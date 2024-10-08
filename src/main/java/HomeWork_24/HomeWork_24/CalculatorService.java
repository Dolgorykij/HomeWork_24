package HomeWork_24.HomeWork_24;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int plus (int numA, int numB) {
        return numA+numB;
    }
    public int minus (int numA, int numB) {
        return numA-numB;
    }
    public int multiply (int numA, int numB) {
        return numA*numB;
    }
    public int divide (int numA, int numB) {
        if (numB == 0) {
            throw new IllegalArgumentException("делить на 0 нельзя");
        }
        return numA / numB;
    }
}
