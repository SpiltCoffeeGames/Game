package com.company;



        import java.awt.event.ActionListener;
        import java.awt.event.ActionEvent;

public class Game {

    ChoiceHandler cHandler = new ChoiceHandler();
    UI ui = new UI();
    VisibilityManager vm = new VisibilityManager(ui);
    Story story = new Story(this, ui, vm);

     String nextPosition1, nextPosition2, nextPosition3, nextPosition4;

    public static void main (String argos[])   {

        new Game();
    }
    public Game(){

        ui.createUI(cHandler);
       story.defaultSetup();

       // vm.titleToTown();
        vm.showTitleScreen();
       // story.defaultSetup();
    }

    public class ChoiceHandler implements ActionListener {

        public void actionPerformed(ActionEvent event){
            String yourChoice = event.getActionCommand();

            switch ( yourChoice){
                case "start":vm.titleToTown();story.townGate();break;
                //case "c1":vm.titleToTown();break;
                case "c1":story.selectPosition(nextPosition1);break;
                case "c2":story.selectPosition(nextPosition2);break;
                case "c3":story.selectPosition(nextPosition3);break;
                case "c4":story.selectPosition(nextPosition4);break;
            }

        }

    }
}
