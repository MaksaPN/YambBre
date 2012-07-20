/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yamb;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Maksa
 */
public class Main extends Application {

    private int counter = 0;
    private int total = 0;
    private int bonus = 0;
    private boolean summed1 = false;
    private boolean summed2 = false;
    private boolean summed3 = false;
    private boolean summed4 = false;
    private boolean summed5 = false;
    private Dice dice1 = new Dice();
    private Dice dice2 = new Dice();
    private Dice dice3 = new Dice();
    private Dice dice4 = new Dice();
    private Dice dice5 = new Dice();
    private Dice dice6 = new Dice();
    private Label both = new Label("Both\nways");
    private Label topBotom = new Label("Top-\nbottom");
    private Label botomTop = new Label("Botom-\n top");
    private Label call = new Label("Call");
    private Label firstHand = new Label("First\nhand");
    private Label[] labels = new Label[]{new Label("1 (ones)"), new Label("2 (twos)"), new Label("3 (threes)"), new Label("4 (fours)"), new Label("5 (fives)"),
        new Label("6 (sixes)"), new Label("SUM"), new Label("MAX"), new Label("MIN"), new Label("MAX-MIN"), new Label("Straight"), new Label("3 of a kind"),
        new Label("Full House"), new Label("4 of a kind"), new Label("5 of a kind"), new Label("TOTAL")};
    private Label score = new Label("Your score is: " + String.valueOf(total));
    private Label[] labels1 = new Label[16];
    private Label[] labels2 = new Label[16];
    private Label[] labels3 = new Label[16];
    private Label[] labels4 = new Label[16];
    private Label[] labels5 = new Label[16];
    private Button roll = new Button("Roll");
    private Button reset = new Button("New Turn!");
    private ToggleGroup radioGroup = new ToggleGroup();
    private RadioButton[] radioButtons = new RadioButton[16];

    @Override
    public void start(Stage stage) {

        setLayouts();

        //setting hold event
        dice1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (dice1.isHeld() == false) {
                    dice1.setHold(true);
                } else {
                    dice1.setHold(false);
                }
            }
        });
        dice2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (dice2.isHeld() == false) {
                    dice2.setHold(true);
                } else {
                    dice2.setHold(false);
                }
            }
        });
        dice3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (dice3.isHeld() == false) {
                    dice3.setHold(true);
                } else {
                    dice3.setHold(false);
                }
            }
        });
        dice4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (dice4.isHeld() == false) {
                    dice4.setHold(true);
                } else {
                    dice4.setHold(false);
                }
            }
        });
        dice5.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (dice5.isHeld() == false) {
                    dice5.setHold(true);
                } else {
                    dice5.setHold(false);
                }
            }
        });
        dice6.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (dice6.isHeld() == false) {
                    dice6.setHold(true);
                } else {
                    dice6.setHold(false);
                }
            }
        });

        roll.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                dice1.setDisable(false);
                dice2.setDisable(false);
                dice3.setDisable(false);
                dice4.setDisable(false);
                dice5.setDisable(false);
                dice6.setDisable(false);
                labels1[6].setDisable(false);
                labels2[6].setDisable(false);
                labels2[0].setDisable(false);
                labels3[6].setDisable(false);
                labels3[14].setDisable(false);
                labels4[6].setDisable(false);
                labels5[6].setDisable(false);
                labels1[15].setDisable(false);
                labels2[15].setDisable(false);
                labels3[15].setDisable(false);
                labels4[15].setDisable(false);
                labels5[15].setDisable(false);
                for (int i = 0; i < 16; i++) {
                    radioButtons[i].setDisable(true);
                }
                for (int i = 0; i < 7; i++) {
                    if (labels1[i].getText().equals("")) {
                        labels1[i].setDisable(false);
                    }
                    if (labels2[i].getText().equals("")) {
                        labels2[i].setDisable(false);
                    }
                    if (labels3[i].getText().equals("")) {
                        labels3[i].setDisable(false);
                    }
                    if (labels4[i].getText().equals("")) {
                        labels4[i].setDisable(false);
                    }
                    if (labels5[i].getText().equals("")) {
                        labels5[i].setDisable(false);
                    }
                }
                if (dice1.isHeld() == false) {
                    dice1.roll();
                }
                if (dice2.isHeld() == false) {
                    dice2.roll();
                }
                if (dice3.isHeld() == false) {
                    dice3.roll();
                }
                if (dice4.isHeld() == false) {
                    dice4.roll();
                }
                if (dice5.isHeld() == false) {
                    dice5.roll();
                }
                if (dice6.isHeld() == false) {
                    dice6.roll();
                }
                counter++;
//                if (counter==1){
//                    for (int i = 0; i < 15; i++) {
//                        if (i != 6) {
//                            labels5[i].setDisable(false);
//                        }
//                    }
//                }
                if (counter != 1) {
                    for (int i = 0; i < 15; i++) {
                        if (i != 6) {
                            labels5[i].setDisable(true);
                        }
                    }
                }
                if (counter == 3) {
                    reset.setVisible(true);
                    roll.setDisable(true);
                    dice1.setDisable(true);
                    dice2.setDisable(true);
                    dice3.setDisable(true);
                    dice4.setDisable(true);
                    dice5.setDisable(true);
                    dice6.setDisable(true);
                }
                for (int i = 1; i < 6; i++) {
                    if (!labels2[i - 1].getText().equals("")) {
                        labels2[i].setDisable(false);
                    }
                }
                for (int i = 6; i > 1; i--) {
                    if (!labels2[i + 1].getText().equals("")) {
                        labels2[i].setDisable(false);
                    }
                }
                if (straight() != 0 && !(summed1 || summed2 || summed3 || summed4 || summed5)) {
                    labels1[10].setDisable(false);
                    if (counter == 1) {
                        labels5[10].setDisable(false);
                    }
                    if (!labels2[9].getText().equals("")) {
                        labels2[10].setDisable(false);
                    }
                    if (!labels3[11].getText().equals("")) {
                        labels2[10].setDisable(false);
                    }
                }
                if (threeOfAKind() != 0 && !(summed1 || summed2 || summed3 || summed4 || summed5)) {
                    labels1[11].setDisable(false);
                    if (counter == 1) {
                        labels5[11].setDisable(false);
                    }
                    if (!labels2[10].getText().equals("")) {
                        labels2[11].setDisable(false);
                    }
                    if (!labels3[12].getText().equals("")) {
                        labels2[11].setDisable(false);
                    }
                }
                if (fullHouse() != 0 && !(summed1 || summed2 || summed3 || summed4 || summed5)) {
                    labels1[12].setDisable(false);
                    if (counter == 1) {
                        labels5[12].setDisable(false);
                    }
                    if (!labels2[11].getText().equals("")) {
                        labels2[12].setDisable(false);
                    }
                    if (!labels3[13].getText().equals("")) {
                        labels2[12].setDisable(false);
                    }
                }
                if (fourOfAKind() != 0 && !(summed1 || summed2 || summed3 || summed4 || summed5)) {
                    labels1[13].setDisable(false);
                    if (counter == 1) {
                        labels5[13].setDisable(false);
                    }
                    if (!labels2[12].getText().equals("")) {
                        labels2[13].setDisable(false);
                    }
                    if (!labels3[14].getText().equals("")) {
                        labels2[13].setDisable(false);
                    }
                }
                if (fiveOfAKind() != 0 && !(summed1 || summed2 || summed3 || summed4 || summed5)) {
                    labels1[14].setDisable(false);
                    if (counter == 1) {
                        labels5[14].setDisable(false);
                    }
                    if (!labels2[13].getText().equals("")) {
                        labels2[14].setDisable(false);
                    }
                    if (!labels3[15].getText().equals("")) {
                        labels2[14].setDisable(false);
                    }
                }
                for (int i = 0; i < 16; i++) {
                    if (radioButtons[i].isSelected()) {
                        labels4[i].setDisable(false);
                        for (int j = 0; j < 16; j++) {
                            if (j != i) {
                                labels4[j].setDisable(true);
                            }
                            labels1[j].setDisable(true);
                            labels2[j].setDisable(true);
                            labels3[j].setDisable(true);
                            labels5[j].setDisable(true);

                        }
                    }
                    else{
                        labels4[i].setDisable(true);
                    }
                }

            }
        });

        reset.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                dice1.setCounter(0);
                dice2.setCounter(0);
                dice3.setCounter(0);
                dice4.setCounter(0);
                dice5.setCounter(0);
                dice6.setCounter(0);
                counter = 0;
                reset.setVisible(false);
                roll.setDisable(false);
                reset();
            }
        });

        for (int i = 0; i < 15; i++) {
            if (i != 7 && i != 8 && i != 9) {
                writeResultB(labels1[i]);
                writeResultB(labels2[i]);
                writeResultB(labels3[i]);
                writeResultB(labels4[i]);
                writeResultB(labels5[i]);
            }

        }

        writeResultN(labels1[0]);
        writeResultN(labels1[1]);
        writeResultN(labels1[2]);
        writeResultN(labels1[3]);
        writeResultN(labels1[4]);
        writeResultN(labels1[5]);

        writeResultN(labels2[0]);
        writeResultN(labels2[1]);
        writeResultN(labels2[2]);
        writeResultN(labels2[3]);
        writeResultN(labels2[4]);
        writeResultN(labels2[5]);

        writeResultN(labels3[0]);
        writeResultN(labels3[1]);
        writeResultN(labels3[2]);
        writeResultN(labels3[3]);
        writeResultN(labels3[4]);
        writeResultN(labels3[5]);

        writeResultN(labels4[0]);
        writeResultN(labels4[1]);
        writeResultN(labels4[2]);
        writeResultN(labels4[3]);
        writeResultN(labels4[4]);
        writeResultN(labels4[5]);

        writeResultN(labels5[0]);
        writeResultN(labels5[1]);
        writeResultN(labels5[2]);
        writeResultN(labels5[3]);
        writeResultN(labels5[4]);
        writeResultN(labels5[5]);


        sumMinMax(labels1);
        sumMinMax(labels2);
        sumMinMax(labels3);
        sumMinMax(labels4);
        sumMinMax(labels5);

        sumBonuses(labels1);
        sumBonuses(labels2);
        sumBonuses(labels3);
        sumBonuses(labels4);
        sumBonuses(labels5);


        Group root = new Group();
        root.getChildren().addAll(dice1, dice2, dice3, dice4, dice5, dice6);
        root.getChildren().addAll(roll, reset);
        root.getChildren().addAll(both, topBotom, botomTop, call, firstHand, score);
        for (int i = 0; i < 16; i++) {
            root.getChildren().add(labels[i]);
            root.getChildren().add(labels1[i]);
            root.getChildren().add(labels2[i]);
            root.getChildren().add(labels3[i]);
            root.getChildren().add(labels4[i]);
            root.getChildren().add(labels5[i]);
            root.getChildren().add(radioButtons[i]);
        }

        Scene scene = new Scene(root, 1000, 800);
        scene.setFill(Color.GHOSTWHITE);
        stage.setTitle("YambBre!");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private void setLayouts() {
        for (int i = 0; i < 16; i++) {
            labels1[i] = new Label("");
            labels1[i].setGraphic(new ImageView(new Image("images/check.jpg")));
            labels2[i] = new Label("");
            labels2[i].setGraphic(new ImageView(new Image("images/check.jpg")));
            labels3[i] = new Label("");
            labels3[i].setGraphic(new ImageView(new Image("images/check.jpg")));
            labels4[i] = new Label("");
            labels4[i].setGraphic(new ImageView(new Image("images/check.jpg")));
            labels5[i] = new Label("");
            labels5[i].setGraphic(new ImageView(new Image("images/check.jpg")));

        }

        for (int i = 0; i < 16; i++) {
            radioButtons[i] = new RadioButton();
            radioButtons[i].setToggleGroup(radioGroup);
            radioButtons[i].setSelected(false);
            radioButtons[i].setDisable(false);
            radioButtons[i].setTranslateX(750);
            radioButtons[i].setTranslateY(40 * i + 78);
        }

        dice1.setTranslateX(10);
        dice1.setTranslateY(10);
        dice1.setImage(new Image("images/start1.jpg"));
        dice1.setDisable(true);
        dice2.setTranslateX(10);
        dice2.setTranslateY(150);
        dice2.setImage(new Image("images/start3.jpg"));
        dice2.setDisable(true);
        dice3.setTranslateX(10);
        dice3.setTranslateY(290);
        dice3.setImage(new Image("images/start5.jpg"));
        dice3.setDisable(true);
        dice4.setTranslateX(150);
        dice4.setTranslateY(10);
        dice4.setImage(new Image("images/start2.jpg"));
        dice4.setDisable(true);
        dice5.setTranslateX(150);
        dice5.setTranslateY(150);
        dice5.setImage(new Image("images/start4.jpg"));
        dice5.setDisable(true);
        dice6.setTranslateX(150);
        dice6.setTranslateY(290);
        dice6.setImage(new Image("images/start6.jpg"));
        dice6.setDisable(true);
        roll.setTranslateX(110);
        roll.setTranslateY(430);
        roll.setFont(new Font(24));
        reset.setTranslateX(100);
        reset.setTranslateY(480);
        reset.setFont(new Font(24));
        reset.setVisible(false);


        both.setTranslateX(400);
        both.setTranslateY(10);
        both.setFont(new Font(16));

        topBotom.setTranslateX(520);
        topBotom.setTranslateY(10);
        topBotom.setFont(new Font(16));

        botomTop.setTranslateX(640);
        botomTop.setTranslateY(10);
        botomTop.setFont(new Font(16));

        call.setTranslateX(760);
        call.setTranslateY(10);
        call.setFont(new Font(16));

        firstHand.setTranslateX(880);
        firstHand.setTranslateY(10);
        firstHand.setFont(new Font(16));

        score.setTranslateX(650);
        score.setTranslateY(730);
        score.setFont(new Font(20));

        for (int i = 0; i < 16; i++) {
            labels[i].setTranslateX(305);
            labels[i].setTranslateY(40 * i + 75);
            labels[i].setFont(new Font(16));
            labels1[i].setTranslateX(415);
            labels1[i].setTranslateY(40 * i + 75);
            labels2[i].setTranslateX(535);
            labels2[i].setTranslateY(40 * i + 75);
            labels3[i].setTranslateX(655);
            labels3[i].setTranslateY(40 * i + 75);
            labels4[i].setTranslateX(775);
            labels4[i].setTranslateY(40 * i + 75);
            labels5[i].setTranslateX(895);
            labels5[i].setTranslateY(40 * i + 75);
            labels1[i].setDisable(true);
            labels2[i].setDisable(true);
            labels3[i].setDisable(true);
            labels4[i].setDisable(true);
            labels5[i].setDisable(true);

        }


    }

    private void reset() {
        dice1.setImage(new Image("images/start1.jpg"));
        dice1.setDisable(true);
        dice1.setHold(false);
        dice2.setImage(new Image("images/start3.jpg"));
        dice2.setDisable(true);
        dice2.setHold(false);
        dice3.setImage(new Image("images/start5.jpg"));
        dice3.setDisable(true);
        dice3.setHold(false);
        dice4.setImage(new Image("images/start2.jpg"));
        dice4.setDisable(true);
        dice4.setHold(false);
        dice5.setImage(new Image("images/start4.jpg"));
        dice5.setDisable(true);
        dice5.setHold(false);
        dice6.setImage(new Image("images/start6.jpg"));
        dice6.setDisable(true);
        dice6.setHold(false);
        for (int i = 0; i < 16; i++) {
            labels1[i].setDisable(true);
            labels2[i].setDisable(true);
            labels3[i].setDisable(true);
            labels4[i].setDisable(true);
            labels5[i].setDisable(true);
            radioButtons[i].setSelected(false);
            radioButtons[i].setDisable(false);
        }
    }

    private int[] countValues() {
        int ones = 0;
        if (dice1.getValue() == 1) {
            ones++;
        }
        if (dice2.getValue() == 1) {
            ones++;
        }
        if (dice3.getValue() == 1) {
            ones++;
        }
        if (dice4.getValue() == 1) {
            ones++;
        }
        if (dice5.getValue() == 1) {
            ones++;
        }
        if (dice6.getValue() == 1) {
            ones++;
        }

        int twos = 0;
        if (dice1.getValue() == 2) {
            twos++;
        }
        if (dice2.getValue() == 2) {
            twos++;
        }
        if (dice3.getValue() == 2) {
            twos++;
        }
        if (dice4.getValue() == 2) {
            twos++;
        }
        if (dice5.getValue() == 2) {
            twos++;
        }
        if (dice6.getValue() == 2) {
            twos++;
        }

        int threes = 0;
        if (dice1.getValue() == 3) {
            threes++;
        }
        if (dice2.getValue() == 3) {
            threes++;
        }
        if (dice3.getValue() == 3) {
            threes++;
        }
        if (dice4.getValue() == 3) {
            threes++;
        }
        if (dice5.getValue() == 3) {
            threes++;
        }
        if (dice6.getValue() == 3) {
            threes++;
        }

        int fours = 0;
        if (dice1.getValue() == 4) {
            fours++;
        }
        if (dice2.getValue() == 4) {
            fours++;
        }
        if (dice3.getValue() == 4) {
            fours++;
        }
        if (dice4.getValue() == 4) {
            fours++;
        }
        if (dice5.getValue() == 4) {
            fours++;
        }
        if (dice6.getValue() == 4) {
            fours++;
        }

        int fives = 0;
        if (dice1.getValue() == 5) {
            fives++;
        }
        if (dice2.getValue() == 5) {
            fives++;
        }
        if (dice3.getValue() == 5) {
            fives++;
        }
        if (dice4.getValue() == 5) {
            fives++;
        }
        if (dice5.getValue() == 5) {
            fives++;
        }
        if (dice6.getValue() == 5) {
            fives++;
        }

        int sixes = 0;
        if (dice1.getValue() == 6) {
            sixes++;
        }
        if (dice2.getValue() == 6) {
            sixes++;
        }
        if (dice3.getValue() == 6) {
            sixes++;
        }
        if (dice4.getValue() == 6) {
            sixes++;
        }
        if (dice5.getValue() == 6) {
            sixes++;
        }
        if (dice6.getValue() == 6) {
            sixes++;
        }

        return new int[]{ones, twos, threes, fours, fives, sixes};
    }

    private void writeResultN(final Label label) {
        label.setOnMouseClicked(new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                if (label == labels1[0] || label == labels2[0] || label == labels3[0] || label == labels4[0] || label == labels5[0]) {
                    label.setText(String.valueOf(countValues()[0]));
                    total += countValues()[0];
                }
                if (label == labels1[1] || label == labels2[1] || label == labels3[1] || label == labels4[1] || label == labels5[1]) {
                    label.setText(String.valueOf(countValues()[1] * 2));
                    total += countValues()[1] * 2;
                }
                if (label == labels1[2] || label == labels2[2] || label == labels3[2] || label == labels4[2] || label == labels5[2]) {
                    label.setText(String.valueOf(countValues()[2] * 3));
                    total += countValues()[2] * 3;
                }
                if (label == labels1[3] || label == labels2[3] || label == labels3[3] || label == labels4[3] || label == labels5[3]) {
                    label.setText(String.valueOf(countValues()[3] * 4));
                    total += countValues()[3] * 4;
                }
                if (label == labels1[4] || label == labels2[4] || label == labels3[4] || label == labels4[4] || label == labels5[4]) {
                    label.setText(String.valueOf(countValues()[4] * 5));
                    total += countValues()[4] * 5;
                }
                if (label == labels1[5] || label == labels2[5] || label == labels3[5] || label == labels4[5] || label == labels5[5]) {
                    label.setText(String.valueOf(countValues()[5] * 6));
                    total += countValues()[5] * 6;
                }

                for (int i = 0; i < 16; i++) {
                    labels1[i].setDisable(true);
                    labels2[i].setDisable(true);
                    labels3[i].setDisable(true);
                    labels4[i].setDisable(true);
                    labels5[i].setDisable(true);
                }
                reset.setVisible(true);
                roll.setDisable(true);
                score.setText("Your score is: " + String.valueOf(total));
            }
        });
    }

    private void writeResultB(final Label label) {
        label.setOnMouseClicked(new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                bonus = 0;
                if ((label == labels1[10]) || (label == labels2[10]) || (label == labels3[10]) || (label == labels4[10]) || (label == labels5[10])) {
                    bonus = allTheBonuses()[0];
                }
                if ((label == labels1[11]) || (label == labels2[11]) || (label == labels3[11]) || (label == labels4[11]) || (label == labels5[11])) {
                    bonus = allTheBonuses()[1];
                }
                if ((label == labels1[12]) || (label == labels2[12]) || (label == labels3[12]) || (label == labels4[12]) || (label == labels5[12])) {
                    bonus = allTheBonuses()[2];
                }
                if ((label == labels1[13]) || (label == labels2[13]) || (label == labels3[13]) || (label == labels4[13]) || (label == labels5[13])) {
                    bonus = allTheBonuses()[3];
                }
                if ((label == labels1[14]) || (label == labels2[14]) || (label == labels3[14]) || (label == labels4[14]) || (label == labels5[14])) {
                    bonus = allTheBonuses()[4];
                }
                for (int i = 0; i < 16; i++) {
                    labels1[i].setDisable(true);
                    labels2[i].setDisable(true);
                    labels3[i].setDisable(true);
                    labels4[i].setDisable(true);
                    labels5[i].setDisable(true);
                }
                reset.setVisible(true);
                roll.setDisable(true);
                label.setText(String.valueOf(bonus));
                total += bonus;
                score.setText("Your score is: " + String.valueOf(total));
            }
        });
    }

    private void sumMinMax(final Label[] column) {
        column[6].setOnMouseClicked(new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                int sum = 0;
                int max = 0;
                int min = Integer.MAX_VALUE;
                for (int i = 0; i < 6; i++) {
                    column[i].setDisable(true);
                    if (column[i].getText().equals("")) {
                        column[i].setText("0");
                    }
                    sum += Integer.parseInt(column[i].getText());
                    if (Integer.parseInt(column[i].getText()) > max) {
                        max = Integer.parseInt(column[i].getText());
                    }
                    if (Integer.parseInt(column[i].getText()) < min && Integer.parseInt(column[i].getText()) != 0) {
                        min = Integer.parseInt(column[i].getText());
                    }

                }
                for (int i = 0; i < 6; i++) {
                    if (column[i].getText().equals("0")) {
                        column[7].setText("/");
                        column[8].setText("/");
                        column[9].setText("/");
                        score.setText("Your score is: " + String.valueOf(sum));
                        break;
                    } else {
                        if (max != 0 && min != Integer.MAX_VALUE) {
                            column[7].setText(String.valueOf(max));
                            column[8].setText(String.valueOf(min));
                            column[9].setText(String.valueOf(max - min));
                            score.setText("Your score is: " + String.valueOf(sum + max - min));
                        } else {
                            column[7].setText("/");
                            column[8].setText("/");
                            column[9].setText("/");
                            score.setText("Your score is: " + String.valueOf(sum));
                        }
                    }
                }
                column[6].setText(String.valueOf(sum));
            }
        });
    }

    private void sumBonuses(final Label[] column) {
        column[15].setOnMouseClicked(new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                if (column == labels1) {
                    summed1 = true;
                }
                if (column == labels2) {
                    summed1 = true;
                }
                if (column == labels3) {
                    summed1 = true;
                }
                if (column == labels4) {
                    summed1 = true;
                }
                if (column == labels5) {
                    summed1 = true;
                }
                int sum = 0;
                for (int i = 10; i < 15; i++) {
                    column[i].setDisable(true);
                    if (column[i].getText().equals("")) {
                        column[i].setText("0");
                    }
                    sum += Integer.parseInt(column[i].getText());
                }
                column[15].setText(String.valueOf(sum));
                column[15].setDisable(true);
            }
        });
    }

    private int straight() {
        if ((countValues()[0] >= 1 && countValues()[1] >= 1 && countValues()[2] >= 1 && countValues()[3] >= 1 && countValues()[4] >= 1)
                || (countValues()[1] >= 1 && countValues()[2] >= 1 && countValues()[3] >= 1 && countValues()[4] >= 1 && countValues()[5] >= 1)) {
            if (counter == 1) {
                return 66;
            }
            if (counter == 2) {
                return 56;
            }
            if (counter == 3) {
                return 46;
            }
        }
        return 0;
    }

    private int threeOfAKind() {
        if (countValues()[0] >= 3) {
            return 23;
        }
        if (countValues()[1] >= 3) {
            return 26;
        }
        if (countValues()[2] >= 3) {
            return 29;
        }
        if (countValues()[3] >= 3) {
            return 32;
        }
        if (countValues()[4] >= 3) {
            return 35;
        }
        if (countValues()[5] >= 3) {
            return 38;
        }

        return 0;
    }

    private int fullHouse() {
        int[] i = countValues();
        if ((i[0] >= 3 && i[1] >= 2)) {
            return 37;
        }
        if ((i[0] >= 3 && i[2] >= 2)) {
            return 39;
        }
        if ((i[0] >= 3 && i[3] >= 2) || (i[2] >= 3 && i[0] >= 2)) {
            return 41;
        }
        if ((i[0] >= 3 && i[4] >= 2) || (i[2] >= 3 && i[1] >= 2)) {
            return 43;
        }
        if ((i[0] >= 3 && i[5] >= 2)) {
            return 45;
        }

        if ((i[1] >= 3 && i[0] >= 2)) {
            return 38;
        }
        if ((i[1] >= 3 && i[2] >= 2)) {
            return 42;
        }
        if ((i[1] >= 3 && i[3] >= 2) || (i[3] >= 3 && i[0] >= 2)) {
            return 44;
        }
        if ((i[1] >= 3 && i[4] >= 2) || (i[3] >= 3 && i[1] >= 2)) {
            return 46;
        }
        if ((i[1] >= 3 && i[5] >= 2) || (i[3] >= 3 && i[2] >= 2)) {
            return 48;
        }

        if ((i[2] >= 3 && i[3] >= 2) || (i[4] >= 3 && i[0] >= 2)) {
            return 47;
        }
        if ((i[2] >= 3 && i[4] >= 2) || (i[4] >= 3 && i[1] >= 2)) {
            return 49;
        }
        if ((i[2] >= 3 && i[5] >= 2) || (i[4] >= 3 && i[2] >= 2)) {
            return 51;
        }

        if ((i[3] >= 3 && i[4] >= 2) || (i[5] >= 3 && i[1] >= 2)) {
            return 52;
        }
        if ((i[3] >= 3 && i[5] >= 2) || (i[5] >= 3 && i[2] >= 2)) {
            return 54;
        }

        if ((i[4] >= 3 && i[3] >= 2)) {
            return 53;
        }
        if ((i[4] >= 3 && i[5] >= 2)) {
            return 57;
        }

        if ((i[5] >= 3 && i[0] >= 2)) {
            return 50;
        }
        if ((i[5] >= 3 && i[3] >= 2)) {
            return 56;
        }
        if ((i[5] >= 3 && i[4] >= 2)) {
            return 58;
        }

        return 0;
    }

    private int fourOfAKind() {
        if (countValues()[0] >= 4) {
            return 44;
        }
        if (countValues()[1] >= 4) {
            return 48;
        }
        if (countValues()[2] >= 4) {
            return 52;
        }
        if (countValues()[3] >= 4) {
            return 56;
        }
        if (countValues()[4] >= 4) {
            return 60;
        }
        if (countValues()[5] >= 4) {
            return 64;
        }

        return 0;
    }

    private int fiveOfAKind() {
        if (countValues()[0] >= 5) {
            return 55;
        }
        if (countValues()[1] >= 5) {
            return 60;
        }
        if (countValues()[2] >= 5) {
            return 65;
        }
        if (countValues()[3] >= 5) {
            return 70;
        }
        if (countValues()[4] >= 5) {
            return 75;
        }
        if (countValues()[5] >= 5) {
            return 80;
        }

        return 0;
    }

    private int[] allTheBonuses() {
        int[] bonuses = new int[5];
        bonuses[0] = straight();
        bonuses[1] = threeOfAKind();
        bonuses[2] = fullHouse();
        bonuses[3] = fourOfAKind();
        bonuses[4] = fiveOfAKind();
        return bonuses;
    }
}
