package fishShapedBunTycoon3rd;

import fishShapedBunTycoon.GUIMain;

import javax.swing.*;

public class Dialog extends JLabel {

    ImageIcon dialogImage =  new ImageIcon((GUIMain.class.getResource("../image/dialog.png")));
    ImageIcon blankDialogImage =  new ImageIcon((GUIMain.class.getResource("../image/blankDialog.png")));



    Dialog(){


        setLayout(null);
        setIcon(blankDialogImage);


    }


}
