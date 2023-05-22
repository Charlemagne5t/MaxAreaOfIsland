package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        return bfsTraversal(grid);
    }

    private int bfsTraversal(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        int maxIsland = 0;



        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(!visited[i][j] && grid[i][j] == 1) {
                    visited[i][j] = true;
                    maxIsland = Math.max(maxIsland, bfsIslandTraversal(grid, visited, new Coordinate(i, j)));
                }
            }
        }

        return maxIsland;
    }

    private int bfsIslandTraversal(int[][] grid, boolean[][] visited, Coordinate coordinate) {
        Queue<Coordinate> queue = new LinkedList<>();
        int islandSize = 0;
        queue.add(coordinate);

        while (!queue.isEmpty()) {
            Coordinate currentCoordinate = queue.poll();
            if (grid[currentCoordinate.i][currentCoordinate.j] == 1) islandSize++;
            //NORTH
            if (currentCoordinate.i != 0 &&
                    !visited[currentCoordinate.i - 1][currentCoordinate.j]
                    && grid[currentCoordinate.i - 1][currentCoordinate.j] == 1) {
                queue.add(new Coordinate(currentCoordinate.i - 1, currentCoordinate.j));
                visited[currentCoordinate.i - 1][currentCoordinate.j] = true;
            }
            //SOUTH

            if (currentCoordinate.i != grid.length - 1 &&
                    !visited[currentCoordinate.i + 1][currentCoordinate.j]
                    && grid[currentCoordinate.i + 1][currentCoordinate.j] == 1) {
                queue.add(new Coordinate(currentCoordinate.i + 1, currentCoordinate.j));
                visited[currentCoordinate.i + 1][currentCoordinate.j] = true;
            }

            //WEST

            if (currentCoordinate.j != 0 &&
                    !visited[currentCoordinate.i][currentCoordinate.j - 1]
                    && grid[currentCoordinate.i][currentCoordinate.j - 1] == 1) {
                queue.add(new Coordinate(currentCoordinate.i, currentCoordinate.j - 1));
                visited[currentCoordinate.i][currentCoordinate.j - 1] = true;
            }

            //EAST
            if (currentCoordinate.j != grid[0].length - 1 &&
                    !visited[currentCoordinate.i][currentCoordinate.j + 1]
                    && grid[currentCoordinate.i][currentCoordinate.j + 1] == 1) {
                queue.add(new Coordinate(currentCoordinate.i, currentCoordinate.j + 1));
                visited[currentCoordinate.i][currentCoordinate.j + 1] = true;
            }

        }


        return islandSize;
    }
}

class Coordinate {
    int i;
    int j;

    public Coordinate(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coordinate that = (Coordinate) o;

        if (i != that.i) return false;
        return j == that.j;
    }

    @Override
    public int hashCode() {
        int result = i;
        result = 31 * result + j;
        return result;
    }
}