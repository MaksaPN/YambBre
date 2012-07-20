/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yamb;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Maksa
 */
public class Dice extends ImageView {

    private int diceValue;
    private Image[] images = new Image[]{new Image("images/one.jpg"), new Image("images/two.jpg"), new Image("images/three.jpg"),
        new Image("images/four.jpg"), new Image("images/five.jpg"), new Image("images/six.jpg")};
    private boolean hold = false;
    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public boolean isHeld() {
        return hold;
    }

    public void setHold(boolean hold) {
        this.hold = hold;
    }

    public int getValue() {
        return diceValue;
    }

    public void setValue(int value) {
        diceValue = value;
    }

    public ImageView roll() {
        if (hold == false && counter <= 3) {
            int val = (int) (6 * Math.random() + 1);
            setValue(val);
            if (val == 1) {
                this.setImage(images[0]);
            }
            if (val == 2) {
                this.setImage(images[1]);
            }
            if (val == 3) {
                this.setImage(images[2]);
            }
            if (val == 4) {
                this.setImage(images[3]);
            }
            if (val == 5) {
                this.setImage(images[4]);
            }
            if (val == 6) {
                this.setImage(images[5]);
            }
            counter++;
        }
        return this;
    }
}
