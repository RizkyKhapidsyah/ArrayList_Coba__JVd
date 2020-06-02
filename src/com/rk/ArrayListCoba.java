package com.rk;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ArrayListCoba extends JFrame {
    public static void main(String args[]) {
        new ArrayListCoba();
    }

    //membuat object arraylist
    ArrayList al = new ArrayList();

    ArrayListCoba() {
        al.add("Test Array List"); // Object String
        al.add(1); // Object Integer
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        setTitle("Test ArrayList");
    }

    public void paint(Graphics g) {
        g.drawString("Banyaknya Elemen di ArrayList adalah : " + String.valueOf(al.size()), 10, 50);
        g.drawString("Isinya Adalah Sebagai berikut : ", 10, 100);
        g.drawString("Elemen Ke-0 : " + (String) al.get(0), 10, 150);
        g.drawString("Elemen Ke-1 : " + String.valueOf(al.get(1)), 10, 200);
        al.remove(0); // menghapus elemen ke-0
        al.add(1, "Tets");
        g.drawString("Banyaknya Elemen di ArrayList Setelah di Hapus adalah : " + String.valueOf(al.size()), 10, 250);
        g.drawString("Elemen Ke-1 : " + String.valueOf(al.get(1)), 10, 300);
        al.clear(); // menghapus semua elemen
        g.drawString("Method isEmpty() : " + String.valueOf(al.isEmpty()), 10, 350);
    }
}
