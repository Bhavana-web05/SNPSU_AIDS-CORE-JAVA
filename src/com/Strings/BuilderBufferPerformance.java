package com.Strings;

public class BuilderBufferPerformance {
        public static void main(String[] args) {
            int iterations = 10_000_000;

            // --- StringBuffer Performance ---
            long startTime = System.currentTimeMillis();
            StringBuffer sbf = new StringBuffer("Deepa Loves Bhavana");
            for (int i = 0; i < iterations; i++) {
                sbf.append("Sc ft KS");
            }
            long sbfTime = System.currentTimeMillis() - startTime;
            System.out.println("Time taken by StringBuffer: " + sbfTime + "ms");

            // --- StringBuilder Performance ---
            startTime = System.currentTimeMillis();
            StringBuilder sbl = new StringBuilder("Deepa Loves Bhavana");
            for (int i = 0; i < iterations; i++) {
                sbl.append("Sc ft KS");
            }
            long sblTime = System.currentTimeMillis() - startTime;
            System.out.println("Time taken by StringBuilder: " + sblTime + "ms");
        }
    }




