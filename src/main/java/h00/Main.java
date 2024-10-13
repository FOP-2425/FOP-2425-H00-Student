package h00;

import fopbot.Direction;
import fopbot.Robot;
import fopbot.RobotFamily;
import fopbot.World;

/**
 * Main entry point in executing the program.
 */
public class Main {

    /**
     * The subtask to run.
     */
    public static int runToSubtask = -1;

    /**
     * The world speed in milliseconds.
     */
    public static int delay = 300;

    /**
     * Main entry point in executing the program.
     *
     * @param args program arguments, currently ignored
     */
    public static void main(String[] args) {
        // This sets up the FOPBot World with a 4x4 grid. (DO NOT TOUCH)
        setupWorld();

        // TODO: H0.4 - Initializing FOPBot


        if (runToSubtask == 0) return; // DO NOT TOUCH!
        // TODO: H0.5.1 - Turning with repeated instructions


        if (runToSubtask == 1) return; // DO NOT TOUCH!
        // TODO: H0.5.2 - Turning with for-loop


        if (runToSubtask == 2) return; // DO NOT TOUCH!
        // TODO: H0.5.3 - Turning with while-loop


        if (runToSubtask == 3) return; // DO NOT TOUCH!
        // TODO: H0.6.1 - Put with repeated instructions


        if (runToSubtask == 4) return; // DO NOT TOUCH!
        // TODO: H0.6.2 - Pick with repeated instructions


        if (runToSubtask == 5) return; // DO NOT TOUCH!
        // TODO: H0.6.3 - Put with for-loop


        if (runToSubtask == 6) return; // DO NOT TOUCH!
        // TODO: H0.7.1 - Pick with while-loop


        if (runToSubtask == 7) return; // DO NOT TOUCH!
        // TODO: H0.7.2 - Pick and put with while-loop


        if (runToSubtask == 8) return; // DO NOT TOUCH!
        // TODO: H0.7.3 - Put with reversed for-loop


    }

    public static void setupWorld() {
        // variable representing width/size of world
        final int worldSize = 4;

        // setting world size symmetrical, meaning height = width
        World.setSize(worldSize, worldSize);

        // speed of how fast the world gets refreshed (e.g. how fast the robot(s) act)
        // the lower the number, the faster the refresh
        World.setDelay(delay);

        // make it possible to see the world window
        World.setVisible(true);
    }
}
