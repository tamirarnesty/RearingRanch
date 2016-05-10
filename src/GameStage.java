import javax.swing.*;

/**
 * The GameStage class acts as a parent class for ColorChooser, Animal Classifier and
 * Arithmetic classes. It handles all of animal drawing, reading the input from the
 * input bar as well as declaring the means for checking whether that input is legal or not.
 *
 * <b>Global Variables: </b>
 * </p>
 * <b>animals </b> Contains the instance of all the animals in the current barn.
 *
 * Created by sketch204 on 2016-05-09.
 *
 * Things i should probably think about in the future:
 * This class should probably handle all of the Game UI.
 */
public abstract class GameStage extends JPanel {
    protected Animal [] animals;

    /**
     * Initiates the playing process by filling the array with random
     * generated instance of animal classes and draws them in their proper positions.
     *
     */
    public GameStage (int difficulty) {
        generateBackground();
        generateAnimals(difficulty);
    }

    /**
     * Automatically checks whether the animal with the passed id has been drawn
     * and if it was, then it will be erased. After that the method draws the animal with the passed
     * id placing it top-left corner at the passed x, y coordinates.
     *
     * @param x Holds the value for the x coordinate of the top-left corner of the image.
     * @param y Holds the value for the x coordinate of the top-left corner of the image.
     * @param id Holds the value for the id number of the animal to be drawn.
     */
    protected void drawAnimal (int x, int y, int id) {

    }

    /**
     * Erases the animal with the passed id number.
     *
     * @param id Holds the value for the id number of the animal to be erased.
     */
    protected void eraseAnimal (int id) {

    }

    /**
     * Return the instance of the animal under the passed animal id.
     *
     * @param id The id number of the animal to be returned.
     * @return The animal under the passed id number.
     */
    protected Animal getAnimal (int id) {
        return animals [id];
    }

    /**
     * Returns the input form the input bar.
     *
     * @return The input that is entered into the input bar.
     */
    protected String readInput () {
        return "";
    }

    /**
     * Randomly generates the animals according to the difficulty parameter,
     * numbers them from 0 to n and draws them on the screen accordingly from top to bottom, left to right.
     * @param difficulty the difficulty of the game that is to be filled with animals.
     */
    private void generateAnimals (int difficulty) {

    }

    /**
     * Randomly chooses a background from the resources and draws it on the scene.
     */
    private void generateBackground () {

    }

    /**
     * Checks whether the input from the input bar is legal and return true if so.
     *
     * @return Returns true if, and only if the input from the input bar is legal.
     */
    protected abstract boolean inputLegal();
}
