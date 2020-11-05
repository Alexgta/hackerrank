package com.IKMnet.Second28;

import java.util.Optional;

public class Quastion51 {

    public void oldProcess() {
        System.out.println("Old process");
        Optional<String> newProcessingRequired = Optional.ofNullable(System.getProperty("newProcession"));
        // C
        if (newProcessingRequired.filter(t -> t.equals("true")).isPresent())
            newProcess();

        /*A - doesn't Work
        Optional<String> newProcessingRequired = Optional.ofNullable(System.getProperty("newProcession"));
        newProcessingRequired.filter(t -> t.equals("true")).ifPresent(s -> s.indexOf('0'));*/

        /*B - doesn't Work
        if (args[0] == "newProcessing") */

        /*C - working corectly
        Optional<String> newProcessingRequired = Optional.ofNullable(System.getProperty("newProcession"));
        if (newProcessingRequired.filter(t -> t.equals("true")).isPresent())*/

        /*D - doesn't work. Should be !newP...
        String newProcessingRequired = System.getProperty("newProcessing");
        if (newProcessingRequired != null && newProcessingRequired.equals("true"))*/

        /*E - doesn't work
        if (args[0] == "newProcessing")*/
    }

    private void newProcess() {
        System.out.println("New Process");
    }

    public static void main(String[] args) {
        Quastion51 testClass = new Quastion51();
        testClass.oldProcess();
    }

}
