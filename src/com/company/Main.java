package com.company;

import java.util.LinkedList;

public class Main {
    static LinkedList<Integer[]> fibRepo = new LinkedList<Integer[]>();

    public static void main(String[] args) {
        //dynamic

/*        System.out.println(isPrime(17));
        System.out.println(isPrime(2));
        System.out.println(isPrime(117));
        try {
            System.out.println(isPrime(1));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(isPrime(-1));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }*/
//        System.out.println(primeFactors(17));
//        System.out.println(toBase(17, 16));
//        System.out.println(sin(3.141, 0.01));
//        System.out.println(countPolynomial(2, 4, new double[]{2, -3, 1, -2, 3}));
//        System.out.println(countPolynomialHorners(2, 4, new double[]{2, -3, 1, -2, 3}));
            System.out.println(fibonnaciDynamic(0));
            System.out.println(fibonnaciDynamic(1));
            System.out.println(fibonnaciDynamic(10));
            System.out.println(fibonnaciDynamic(20));
            System.out.println(fibonnaciDynamic(15));
            System.out.println(fibonnaciDynamic(18));
            System.out.println(fibonnaciDynamic(30));
    }

    static int fibonnaciDynamic(int number) {
        if (number < 0)
            throw new IllegalArgumentException("Can't find fibbonaci from a negative number");

        int f0 = 0;
        int f1 = 1;
        int answer = number;
        int closestLowerNumber = 2;
        //finding the best option in the stored answers
        for (int i = 0; i < fibRepo.size(); i++) {
            if (fibRepo.get(i)[2] < number && fibRepo.get(i)[2] > closestLowerNumber) {
                f0 = fibRepo.get(i)[0];
                f1 = fibRepo.get(i)[1];
                closestLowerNumber = fibRepo.get(i)[2];
            }
        }
        if(number > 1) {
            System.out.println("Start calculating from fibbonnaci of " + closestLowerNumber);
        }

        for (int i = closestLowerNumber; i <= number; i++) {
            answer = f0 + f1;
            if (i != number) {
                f0 = f1;
                f1 = answer;
            }
        }
        if (number > 1) {
            fibRepo.add(new Integer[]{f0, f1, number});
        }
        return answer;
    }

    static int fib(int number) {
        if (number < 1)
            throw new IllegalArgumentException("Can't find fibbonaci from a negative number");
        int f0 = 0;
        int f1 = 1;
        int answer = number;
        for (int i = 2; i <= number; i++) {
            answer = f0 + f1;
            f0 = f1;
            f1 = answer;
        }
        return answer;
    }

    static boolean isPrime(int number) throws IllegalArgumentException {
        int iterator = 2;
        if (number <= 1)
            throw new IllegalArgumentException("Negative numbers are not in the set of natural numbers or the entered number is 0 or 1");
        while (iterator <= number / 2) {
            if (number % iterator == 0) return false;
            iterator++;
        }
        /*for(int i = 2; i <= number / 2; i++){
            if(number % i == 0) return false;
        }*/
        return true;
    }

    static LinkedList primeFactors(int number) {
        LinkedList<Integer> factors = new LinkedList<Integer>();
        int currPrime = 2;
        while (currPrime < number) {
            if (number % currPrime == 0) {
                factors.add(currPrime);
                number /= currPrime;
                currPrime = 2;
            } else {
                currPrime = nextPrime(currPrime);
            }
        }
        factors.add(number);
        if (factors.size() == 1) factors.add(1);
        return factors;
    }

    static int nextPrime(int currentPrime) {
        currentPrime++;
        while (!isPrime(currentPrime)) {
            currentPrime++;
        }
        return currentPrime;
    }

    static String toBase(int num, int base) {
        StringBuilder buffer = new StringBuilder();
        while (num > 0) {
            if (num % base < 10) buffer.append(num % base);
            else buffer.append((char) num % base + 10);
            num /= base;
        }
        return buffer.reverse().toString();
    }

    static double sin(double x, double eps) {
        double prev = x;
        double res = 0;
        int iterator = 1;
        boolean sign = true;
        while (Math.abs(prev - res) > eps) {
            prev = res;
            if (sign == true) res += Math.pow(x, iterator) / factorial(iterator);
            else res -= Math.pow(x, iterator) / factorial(iterator);
            iterator += 2;
            sign = !sign;
        }
        return res;
    }

    static int factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    static double countPolynomial(double x, int degree, double[] coeffitients) {
        double answer = 0;
        if (coeffitients.length != degree + 1) {
            throw new IllegalArgumentException("Wrong number of coeffitients!");
        } else {
            for (int i = 0; i < coeffitients.length; i++) {
                answer += coeffitients[i] * Math.pow(x, degree - i);
            }
            return answer;
        }
    }

    static double countPolynomialHorners(double x, int degree, double[] coeffitients) {
        double answer = x;
        if (coeffitients.length != degree + 1) {
            throw new IllegalArgumentException("Wrong number of coeffitients!");
        } else {
            for (int i = 1; i < coeffitients.length; i++) {
                answer = coeffitients[i] + answer * x;
            }
            return answer;
        }
    }

}