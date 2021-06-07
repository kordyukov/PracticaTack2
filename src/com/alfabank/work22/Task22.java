package com.alfabank.work22;

public class Task22 {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        long sec = currentTime % 60;
          currentTime /= 60;
        long minute = currentTime  % 60;
        currentTime /= 60;
        long houre = currentTime % 24;
        currentTime /= 24;

        System.out.println("dd:hh:mm:ss "+ currentTime+":"+houre+":"+minute+":"+sec+":");

    }
}
