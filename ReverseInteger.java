package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 12
     * -2,147,483,648 -> exception, error message
     */

    public int reverse(int inputNumber) {
        //Task implementation
        if (inputNumber < -2_147_483_648 || inputNumber > 2_147_483_647){
            throw new IllegalArgumentException("Incorrect number");
        }
        int result = 0;
        int temp = Math.abs(inputNumber);
        while(temp > 0) {
            result = result * 10 + temp % 10;
            temp /= 10;
        }
        if (inputNumber < 0){
            result -= result * 2;
        }
        return result;
    }
}
