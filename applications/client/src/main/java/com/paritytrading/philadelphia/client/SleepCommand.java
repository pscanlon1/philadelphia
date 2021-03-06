package com.paritytrading.philadelphia.client;

import java.util.Scanner;

class SleepCommand implements Command {

    @Override
    public void execute(TerminalClient client, Scanner arguments) {
        if (!arguments.hasNext())
            throw new IllegalArgumentException();

        long millis = arguments.nextLong();

        if (arguments.hasNext())
            throw new IllegalArgumentException();

        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
        }
    }

    @Override
    public String getName() {
        return "sleep";
    }

    @Override
    public String getDescription() {
        return "Sleep for a number of milliseconds";
    }

    @Override
    public String getUsage() {
        return "sleep <milliseconds>";
    }

}
