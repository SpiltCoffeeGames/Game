package com.company;

import package02.Weapon_Knife;

public class Story {

    Game game;
    UI ui;
    VisibilityManager vm;
    Player player = new Player();

    public Story(Game g, UI userInterface, VisibilityManager vManager) {
        game = g;
        ui = userInterface;
        vm = vManager;
    }

    public void defaultSetup() {

        player.hp = 10;
        ui.hpNumberLabel.setText("" + player.hp);

        player.currentWeapon = new Weapon_Knife();
        ui.weaponNameLabel.setText(player.currentWeapon.name);
    }

    public void selectPosition(String nextPosition) {

        switch (nextPosition) {
            case "townGate":townGate();break;
            case "talkGuard": talkGuard();break;
            case "attackGuard": attackGuard();break;
            case "crossRoad": crossRoad();break;
        }
    }

        public void townGate () {

            ui.mainTextArea.setText("You are at the gate of the town\nA gaurd is standing in  front of you. \n\n What do you do?\n");
            ui.choice1.setText("Talk to the guard");
            ui.choice2.setText("Attack the guard");
            ui.choice3.setText("Leave");
            ui.choice4.setText("");

            game.nextPosition1 = "talkGuard";
            game.nextPosition2 = "attackGuard";
            game.nextPosition3 = "crossRoad";
            game.nextPosition4 = "";

        }
        public void talkGuard () {
            ui.mainTextArea.setText("Guard: I don't know your face. \nI'm sorry but I can't let a stranger enter the town.");
            ui.choice1.setText(">");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "townGate";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";

        }
        public void attackGuard () {
            ui.mainTextArea.setText("He cuts your fucking head off, you idiot. \n " +
                    "Kidding, he beats  you down and tells to get the fuck out. \n(You receive 3 damage)");
                player.hp = player.hp -3;
                ui.hpNumberLabel.setText("" + player.hp);
            ui.choice1.setText("Back to town");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "townGate";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";

        }
        public void crossRoad () {
            ui.mainTextArea.setText("You are ata crossroad.\nIf you go south, you will go back to town");
            ui.choice1.setText("Go north");
            ui.choice2.setText("Go east");
            ui.choice3.setText("Go south");
            ui.choice4.setText("Go west");

            game.nextPosition1 = "north";
            game.nextPosition2 = "east";
            game.nextPosition3 = "townGate";
            game.nextPosition4 = "west";

        }
        public void north(){
            ui.mainTextArea.setText("There is a river. \nyou drink water and rest at the riverside. \n\n(Your HP is recovered by 2)");
            player.hp = player.hp + 2;
            ui.choice1.setText("Go south");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "north";
            game.nextPosition2 = "east";
            game.nextPosition3 = "townGate";
            game.nextPosition4 = "west";

        }
        public void east(){
            ui.mainTextArea.setText("You are ata crossroad.\nIf you go south, you will go back to town");
            ui.choice1.setText("Go north");
            ui.choice2.setText("Go east");
            ui.choice3.setText("Go south");
            ui.choice4.setText("Go west");

            game.nextPosition1 = "north";
            game.nextPosition2 = "east";
            game.nextPosition3 = "townGate";
            game.nextPosition4 = "west";

        }
        public void west(){
            ui.mainTextArea.setText("You are ata crossroad.\nIf you go south, you will go back to town");
            ui.choice1.setText("Go north");
            ui.choice2.setText("Go east");
            ui.choice3.setText("Go south");
            ui.choice4.setText("Go west");

            game.nextPosition1 = "north";
            game.nextPosition2 = "east";
            game.nextPosition3 = "townGate";
            game.nextPosition4 = "west";
    }
}