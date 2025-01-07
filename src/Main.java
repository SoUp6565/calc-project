import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        new CalcFrame();

    }
}
class CalcFrame extends JFrame {

    public StringBuilder partx(StringBuilder helperSb){
        int posx = helperSb.indexOf("*");

        int posPrecedente = posx-1;
        while ( (helperSb.charAt(posPrecedente) != '*') && (helperSb.charAt(posPrecedente) != '+') && (helperSb.charAt(posPrecedente) != '-') && (helperSb.charAt(posPrecedente) != '/')){
            if (posPrecedente == 0){
                break;
            }else {
                posPrecedente--;
            }
        }
        if (posPrecedente != 0){
            posPrecedente++;
        }

        int posSuccessiva = posx+1;
        while ( (helperSb.charAt(posSuccessiva) != '*') && (helperSb.charAt(posSuccessiva) != '+') && (helperSb.charAt(posSuccessiva) != '-') && (helperSb.charAt(posSuccessiva) != '/')){
            if (posSuccessiva == helperSb.length()-1){
                break;
            }else {
                posSuccessiva++;
            }
        }
        if (posSuccessiva != helperSb.length()-1){
            posSuccessiva--;
        }

        String subString;

        if (helperSb.indexOf(".")==-1){
            posSuccessiva++;
            subString = helperSb.substring(posPrecedente, posSuccessiva);
        }else {
            subString = helperSb.substring(posPrecedente, posSuccessiva+1);
        }

        double n1;
        double n2;
        char operator;



        int posOperator = subString.indexOf("*");

        n1 =Double.parseDouble(subString.substring(0, posOperator));
        n2 =Double.parseDouble(subString.substring(posOperator+1, subString.length()));

        double  nTot = n1 * n2;

        String result = String.valueOf(nTot);
        String replace = helperSb.toString();
        replace = replace.replace(subString, result);
        helperSb = new StringBuilder(replace);

        return helperSb;
    }

    public StringBuilder partd(StringBuilder helperSb){
        int posd = helperSb.indexOf("/");
        int posPrecedente = posd-1;

        while ( (helperSb.charAt(posPrecedente) != '*') && (helperSb.charAt(posPrecedente) != '+') && (helperSb.charAt(posPrecedente) != '-') && (helperSb.charAt(posPrecedente) != '/')){
            if (posPrecedente == 0){
                break;
            }else {
                posPrecedente--;
            }
        }
        if (posPrecedente != 0){
            posPrecedente++;
        }

        int posSuccessiva = posd+1;
        while ( (helperSb.charAt(posSuccessiva) != '*') && (helperSb.charAt(posSuccessiva) != '+') && (helperSb.charAt(posSuccessiva) != '-') && (helperSb.charAt(posSuccessiva) != '/')){
            if (posSuccessiva == helperSb.length()-1){
                break;
            }else {
                posSuccessiva++;
            }
        }
        if (posSuccessiva != helperSb.length()-1){
            posSuccessiva--;
        }

        String subString;

        if (helperSb.indexOf(".")==-1){
            posSuccessiva++;
            subString = helperSb.substring(posPrecedente, posSuccessiva);
        }else {
            subString = helperSb.substring(posPrecedente, posSuccessiva+1);
        }

        double n1;
        double n2;
        char operator;

        int posOperator = subString.indexOf("/");

        n1 =Double.parseDouble(subString.substring(0, posOperator));
        n2 =Double.parseDouble(subString.substring(posOperator+1, subString.length()));

        double  nTot = n1 / n2;

        String result = String.valueOf(nTot);
        String replace = helperSb.toString();
        replace = replace.replace(subString, result);
        helperSb = new StringBuilder(replace);
        return helperSb;
    }

    public StringBuilder partp(StringBuilder helperSb){
        int posp = helperSb.indexOf("+");
        int posPrecedente = posp-1;

        while ( (helperSb.charAt(posPrecedente) != '*') && (helperSb.charAt(posPrecedente) != '+') && (helperSb.charAt(posPrecedente) != '-') && (helperSb.charAt(posPrecedente) != '/')){
            if (posPrecedente == 0){
                break;
            }else {
                posPrecedente--;
            }
        }
        if (posPrecedente != 0){
            posPrecedente++;
        }

        int posSuccessiva = posp+1;
        while ( (helperSb.charAt(posSuccessiva) != '*') && (helperSb.charAt(posSuccessiva) != '+') && (helperSb.charAt(posSuccessiva) != '-') && (helperSb.charAt(posSuccessiva) != '/')){
            if (posSuccessiva == helperSb.length()-1){
                break;
            }else {
                posSuccessiva++;
            }
        }
        if (posSuccessiva != helperSb.length()-1){
            posSuccessiva--;
        }
        String subString;

        if (helperSb.indexOf(".")==-1){
            posSuccessiva++;
            subString = helperSb.substring(posPrecedente, posSuccessiva);
        }else {
            subString = helperSb.substring(posPrecedente, posSuccessiva+1);
        }


        int a = subString.length();

        double n1;
        double n2;
        char operator;

        int posOperator = subString.indexOf("+");


        n1 =Double.parseDouble(subString.substring(0, posOperator));
        n2 =Double.parseDouble(subString.substring(posOperator+1, subString.length()));


        double  nTot = n1 + n2;

        String result = String.valueOf(nTot);
        String replace = helperSb.toString();
        replace = replace.replace(subString, result);
        helperSb = new StringBuilder(replace);
        return helperSb;
    }

    public StringBuilder partm(StringBuilder helperSb){
        int posm = helperSb.indexOf("-");
        int posPrecedente = posm-1;

        if (posPrecedente == -1){
            posPrecedente = 0;
        }

        while ( (helperSb.charAt(posPrecedente) != '*') && (helperSb.charAt(posPrecedente) != '+') && (helperSb.charAt(posPrecedente) != '-') && (helperSb.charAt(posPrecedente) != '/')){
            if (posPrecedente == 0){
                break;
            }else {
                posPrecedente--;
            }
        }
        if (posPrecedente != 0){
            posPrecedente++;
        }

        int posSuccessiva = posm+1;
        while ( (helperSb.charAt(posSuccessiva) != '*') && (helperSb.charAt(posSuccessiva) != '+') && (helperSb.charAt(posSuccessiva) != '-') && (helperSb.charAt(posSuccessiva) != '/')){
            if (posSuccessiva == helperSb.length()-1){
                break;
            }else {
                posSuccessiva++;
            }
        }
        if (posSuccessiva != helperSb.length()-1){
            posSuccessiva--;
        }
        String subString;

        if (helperSb.indexOf(".")==-1){
            posSuccessiva++;
            subString = helperSb.substring(posPrecedente, posSuccessiva);
        }else {
            subString = helperSb.substring(posPrecedente, posSuccessiva+1);
        }


        int a = subString.length();

        double n1;
        double n2;
        char operator;

        int posOperator = subString.indexOf("-");


        n1 =Double.parseDouble(subString.substring(0, posOperator));
        n2 =Double.parseDouble(subString.substring(posOperator+1, subString.length()));


        double  nTot = n1 - n2;

        String result = String.valueOf(nTot);
        String replace = helperSb.toString();
        replace = replace.replace(subString, result);
        helperSb = new StringBuilder(replace);
        return helperSb;
    }

//    public boolean checkForWhile(StringBuilder helperSb){
//
//    };

    public CalcFrame(){
        super("calcBase");


        this.setLayout( new BorderLayout());

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        //p1
        JTextArea rigaDiTesto1 = new JTextArea(2, 20);
        rigaDiTesto1.setEditable(false);
        p1.add(rigaDiTesto1);

        //p2
        p2.setLayout(new GridLayout(5,4));
        //p2 creation button
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b0 = new JButton("0");
        JButton bx = new JButton("*");
        JButton bp = new JButton("+");
        JButton bm = new JButton("-");
        JButton bd = new JButton("/");
        JButton bCE = new JButton("CE");
        JButton bu = new JButton("=");


        //p2 add button to p2
        p2.add(b9);
        p2.add(b8);
        p2.add(bx);
        p2.add(b7);
        p2.add(b6);
        p2.add(bm);
        p2.add(b5);
        p2.add(b4);
        p2.add(bp);
        p2.add(b3);
        p2.add(b2);
        p2.add(bd);
        p2.add(b1);
        p2.add(b0);
        p2.add(bu);

        //p2 creation activationListener for button
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rigaDiTesto1.append("1");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rigaDiTesto1.append("2");
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rigaDiTesto1.append("3");
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rigaDiTesto1.append("4");
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rigaDiTesto1.append("5");
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rigaDiTesto1.append("6");
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rigaDiTesto1.append("7");
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rigaDiTesto1.append("8");
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rigaDiTesto1.append("9");
            }
        });
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rigaDiTesto1.append("0");
            }
        });
        bx.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rigaDiTesto1.append("*");
            }
        });
        bd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rigaDiTesto1.append("/");
            }
        });
        bp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rigaDiTesto1.append("+");
            }
        });
        bm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rigaDiTesto1.append("-");
            }
        });
        bu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String helper = rigaDiTesto1.getText();
                StringBuilder helperSb = new StringBuilder(helper);
                while (helperSb.indexOf("*") != -1 || helperSb.indexOf("+") != -1 || helperSb.indexOf("-") != -1 || helperSb.indexOf("/") != -1 ){// controlla che non ci siano piu operatori
                    while (helperSb.indexOf("*") != -1 || helperSb.indexOf("/") != -1){// prima * e /
                        if (helperSb.indexOf("*")<helperSb.indexOf("/")){
                            if (helperSb.indexOf("*") != -1) {
                                helperSb = partx(helperSb);
                            }   if (helperSb.indexOf("/") != -1) {
                                helperSb = partd(helperSb);
                            }
                        } else if (helperSb.indexOf("*") == helperSb.indexOf("/")) {

                        }else{
                            if (helperSb.indexOf("/") != -1){
                                helperSb = partd(helperSb);
                            }  if (helperSb.indexOf("*") != -1) {
                                helperSb = partx(helperSb);
                            }
                        }
                    }

                    if (helperSb.indexOf("+")<helperSb.indexOf("-")){
                        if (helperSb.indexOf("+") != -1){
                            helperSb = partp(helperSb);
                        }  if (helperSb.indexOf("-") != -1) {
                            helperSb = partm(helperSb);
                        }
                    } else if (helperSb.indexOf("+") == helperSb.indexOf("-")) {

                    }else{
                        if (helperSb.indexOf("-") != -1){
                            helperSb = partm(helperSb);
                        }  if (helperSb.indexOf("+") != -1) {
                            helperSb = partp(helperSb);
                        }
                    }

                }
                rigaDiTesto1.setText(helperSb.toString());
            }
        });




        this.add(new JScrollPane(p1), BorderLayout.PAGE_START);
        this.add(p2, BorderLayout.CENTER);






        setSize(500, 500);
        //frame.setLocation(200, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}


