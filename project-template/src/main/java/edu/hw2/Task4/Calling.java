package edu.hw2.Task4;

public class Calling {
    public record CallingInfo(String className, String methodName) {

        
    }

    public static CallingInfo callingInfo() {
        String className;
        String methodName;
        return new CallingInfo();
    }
}
