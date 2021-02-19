package com.DataStrPlusAlgoritms.findApath;


import java.util.ArrayDeque;
import java.util.HashMap;

public class FindPath {

    Integer[][] maze;
    int minPath;
    HashMap<String, Integer> passed;
    ArrayDeque<Integer[]> nextSteps;

    public FindPath(Integer[][] maze) {
        this.maze = maze;
        this.minPath = maze.length * maze[0].length + 1;

        // lets add first point to nextWave stack
        nextSteps = new ArrayDeque<Integer[]>();
        Integer[] nextDot = {0, 0, 0};
        nextSteps.add(nextDot);

        // Lets flag point (0, 0) as passed:
        String currPoint = "0-0";
        passed = new HashMap<String, Integer>();
        passed.put(currPoint, 0);

    }

    private void moveUp(int x, int y, int way) {
        String nextPoint = String.format("%d-%d", x - 1, y);
        //System.out.println("moveUp31: " + nextPoint);

        if (x - 1 < 0 || maze[x - 1][y] == 1 || passed.containsKey(nextPoint)) {
            return;
        }

        if (way + 1 > minPath) {
            System.out.println("We already have shorter path. 38");
        } else if (maze[x - 1][y] == 9) {
            minPath = way + 1;
        } else if (maze[x - 1][y] == 0) {
            passed.put(nextPoint, way + 1);
            Integer[] nextDot = {x - 1, y, way + 1};
            nextSteps.addLast(nextDot);
        } else {
            System.out.println("Error##46. Should't be. x=" + x + ", y=" + y + ", way=" + way);
        }
    }

    private void moveDown(int x, int y, int way) {
        String nextPoint = String.format("%d-%d", x + 1, y);
        //System.out.println("moveDown53: " + nextPoint);

        if (x + 1 > maze.length - 1 || maze[x + 1][y] == 1 || passed.containsKey(nextPoint))
            return;

        if (way + 1 > minPath) {
            System.out.println("We already have shorter path. 59");
        } else if (maze[x + 1][y] == 9) {
            minPath = way + 1;
        } else if (maze[x + 1][y] == 0) {
            passed.put(nextPoint, way + 1);
            Integer[] nextDot = {x + 1, y, way + 1};
            nextSteps.addLast(nextDot);
        } else {
            System.out.println("Error67. Should't be. x=" + x + ", y=" + y + ", way=" + way);
        }

    }

    private void moveLeft(int x, int y, int way) {
        String nextPoint = String.format("%d-%d", x, y - 1);
        //System.out.println("moveLeft: " + nextPoint);

        if (y - 1 < 0 || maze[x][y - 1] == 1 || passed.containsKey(nextPoint))
            return;

        if (way + 1 > minPath) {

            System.out.println("We already have shorter path. 81");

        } else if (maze[x][y - 1] == 9) {

            minPath = way + 1;
            System.out.println("Found path. Min length is " + minPath + " now");

        } else if (maze[x][y - 1] == 0) {

            passed.put(nextPoint, way + 1);
            Integer[] nextDot = {x, y - 1, way + 1};
            nextSteps.addLast(nextDot);

        } else {
            System.out.println("Error95. Should't be. x=" + x + ", y=" + y + ", way=" + way);
        }

    }

    private void moveRight(int x, int y, int way) {
        String nextPoint = String.format("%d-%d", x, y + 1);
        System.out.println("moveRight: " + nextPoint);

        if (y + 1 > maze[0].length - 1 || maze[x][y + 1] == 1 || passed.containsKey(nextPoint))
            return;

        if (way + 1 > minPath) {
            System.out.println("We already have shorter path. 108");
        } else if (maze[x][y + 1] == 9) {

            minPath = way + 1;
            System.out.println("Found path. Min length is " + minPath + " now");

        } else if (maze[x][y + 1] == 0) {

            passed.put(nextPoint, way + 1);
            Integer[] nextDot = {x, y + 1, way + 1};
            nextSteps.addLast(nextDot);

        } else {
            System.out.println("Error121. Should't be. x=" + x + ", y=" + y + ", way=" + way);
        }

    }

    public int findAPath() {
        Integer[] currStep;
        int queueSize = nextSteps.size();
        int count = 0;
        System.out.println("Count0: " + queueSize);
        Integer[] currDot;

        while (queueSize > 0) {
            count++;
            currDot = nextSteps.pop();
            System.out.println("Step: " + count + ", queue.size: " + queueSize + ", Dot: " +
                    currDot[0] + " - " + currDot[1] + " - " + currDot[2]);
            moveUp(currDot[0], currDot[1], currDot[2]);
            moveDown(currDot[0], currDot[1], currDot[2]);
            moveLeft(currDot[0], currDot[1], currDot[2]);
            moveRight(currDot[0], currDot[1], currDot[2]);

            queueSize = nextSteps.size();
        }

        return minPath;
    }

}
