///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// */
//
//package com.mycompany.brickbearkergame;
//
///**
// *
// * @author pikachu
// */
//public class  {
//
//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//    }
//}

package com.mycompany.brickbearkergame;

import javax.swing.JFrame;
/**
 *
 * @author chinm
 */
public class BrickBearkerGame {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        GamePlay gameplay = new GamePlay();
        obj.setBounds(10,10,700,600);
        obj.setTitle("BrickBreaker");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);
        }
    }


