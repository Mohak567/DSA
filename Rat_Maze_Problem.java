public class Rat_Maze_Problem {
    static boolean isnotblocked(int[][] maze, int row, int col) {
        if (row < maze.length && col < maze[row].length && maze[row][col] == 1) {
            return true;
        }
        return false;
    }

    static boolean RatInMaze(int[][] maze, int row, int col, int[][] path) {
        if (row == maze.length - 1 && col == maze.length - 1) {// termination case
            path[row][col] = 1;
            return true;
        }
        if (isnotblocked(maze, row, col)) {
            path[row][col] = 1;
            if (RatInMaze(maze, row + 1, col, path)) {// inside loop or checking it for reaching at the end
                return true;
            }
            if (RatInMaze(maze, row, col + 1, path)) {// inside loop or checking it for reaching at the end
                return true;
            }
            // undo the change
            path[row][col] = 0;// if above if does not reach at the end
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] maze = {
                { 1, 0, 1, 0, 1 },
                { 1, 1, 0, 1, 1 },
                { 0, 1, 1, 1, 1 },
                { 1, 0, 1, 1, 1 },
                { 1, 1, 1, 1, 1 }
        };
        int[][] path = new int[maze.length][maze.length];
        boolean result = RatInMaze(maze, 0, 0, path);
        if (result) {
            System.out.println("Rat reached");
            for (int i = 0; i < path.length; i++) {
                for (int j = 0; j < path.length; j++) {
                    System.out.print(path[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("not reached");
        }
    }
}
