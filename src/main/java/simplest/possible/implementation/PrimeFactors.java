package simplest.possible.implementation;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List<Integer> of(int num) {
        List<Integer> primeFactors = new ArrayList<>();
        if (num > 1) {
            primeFactors.add(2);
        }
        return primeFactors;
    }
}
