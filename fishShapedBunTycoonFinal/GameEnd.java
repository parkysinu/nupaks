package fishShapedBunTycoonFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameEnd extends JFrame {


    ImageIcon gameOver = new ImageIcon((Main.class.getResource("../image/gameover.png")));
    ImageIcon gameOverEntered = new ImageIcon((Main.class.getResource("../image/gameoverEntered.png")));
    ImageIcon gameStartButtonBasic = new ImageIcon((Main.class.getResource("../image/gameStartButtonBasic.jpg")));
    ImageIcon gameStartButtonEntered = new ImageIcon((Main.class.getResource("../image/gameStartButtonEntered.jpg")));

    GameEnd(){



        setSize(900,650);
        Color backgroundColor = new Color(255, 255, 255);
        setBackground(backgroundColor);
        JLabel gameOverBackground = new JLabel();
        JLabel score = new JLabel();

        JButton gameStartButton = new JButton();



        gameOverBackground.setIcon(gameOver);
        gameOverBackground.setBounds(0,150,900,400);

        gameStartButton.setIcon(gameStartButtonBasic);
        gameStartButton.setBounds(0,550,900,100);


        score.setBounds(0,50,900,100);
        score.setFont(new Font("Arial",Font.PLAIN,40));
        score.setText("score : "+Integer.toString(Player.money));



        setBackground(null);
        setLayout(null);
        setResizable(false); //화면 크기 변경 가능 여부
        setLocationRelativeTo(null); //JFrame의 위치 지정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 메소드가 종료 되면 자바 머신도 종료 시킨다.
        setVisible(true);


        gameOverBackground.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                System.exit(0);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                gameOverBackground.setIcon(gameOverEntered);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                gameOverBackground.setIcon(gameOver);
            }
        });

        add(gameOverBackground);
//        add(gameStartButton);
        add(score);

    }


}
