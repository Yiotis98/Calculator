import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public String Res;
    public String P;
    public String P2;
    public Double x,x1,x2,result;
    public int firstcalc=1,eq=0;
    public String lastcalc;
    private JPanel panel;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton buttonResult;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton buttonMinus;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton buttonPlus;
    private JButton buttonDieresi;
    private JButton buttonPolsmos;
    private JButton a0Button;
    private JButton buttonDot;
    private JButton CEButton;
    private JButton cButton;
    private JTextField printresult;
    private JTextField currentnum;

    public Calculator() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("1");
                if (eq==1){
                    P=null;
                    firstcalc=1;
                    result=null;
                    currentnum.setText(null);
                    printresult.setText(null);
                    eq=0;
                }
                if (P==null)
                    P="1";
                else
                    P=(P+"1");
                currentnum.setText(P);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("2");
                if (eq==1){
                    P=null;
                    firstcalc=1;
                    result=null;
                    currentnum.setText(null);
                    printresult.setText(null);
                    eq=0;
                }
                if (P==null)
                    P="2";
                else
                    P=(P+"2");
                currentnum.setText(P);

            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("3");
                if (eq==1){
                    P=null;
                    firstcalc=1;
                    result=null;
                    currentnum.setText(null);
                    printresult.setText(null);
                    eq=0;
                }
                if (P==null)
                    P="3";
                else
                    P=(P+"3");
                currentnum.setText(P);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("4");
                if (eq==1){
                    P=null;
                    firstcalc=1;
                    result=null;
                    currentnum.setText(null);
                    printresult.setText(null);
                    eq=0;
                }
                if (P==null)
                    P="4";
                else
                    P=(P+"4");
                currentnum.setText(P);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("5");
                if (eq==1){
                    P=null;
                    firstcalc=1;
                    result=null;
                    currentnum.setText(null);
                    printresult.setText(null);
                    eq=0;
                }
                if (P==null)
                    P="5";
                else
                    P=(P+"5");
                currentnum.setText(P);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("6");
                if (eq==1){
                    P=null;
                    firstcalc=1;
                    result=null;
                    currentnum.setText(null);
                    printresult.setText(null);
                    eq=0;
                }
                if (P==null)
                    P="6";
                else
                    P=(P+"6");
                currentnum.setText(P);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("7");
                if (eq==1){
                    P=null;
                    firstcalc=1;
                    result=null;
                    currentnum.setText(null);
                    printresult.setText(null);
                    eq=0;
                }
                if (P==null)
                    P="7";
                else
                    P=(P+"7");
                currentnum.setText(P);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("8");
                if (eq==1){
                    P=null;
                    firstcalc=1;
                    result=null;
                    currentnum.setText(null);
                    printresult.setText(null);
                    eq=0;
                }
                if (P==null)
                    P="8";
                else
                    P=(P+"8");
                currentnum.setText(P);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("9");
                if (eq==1){
                    P=null;
                    firstcalc=1;
                    result=null;
                    currentnum.setText(null);
                    printresult.setText(null);
                    eq=0;
                }
                if (P==null)
                    P="9";
                else
                    P=(P+"9");
                currentnum.setText(P);
            }
        });
        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("+");
               if (firstcalc==1){
                   result=Double.parseDouble(P);
                   Res=Double.toString(result);
                   printresult.setText(Res);
                   P=null;
                   firstcalc=0;
               }
               else if(firstcalc==2){
                   eq=0;
               }
               else{
                   x=Double.parseDouble(P);
                   P=null;
                   result=result+x;
               }
                currentnum.setText(P);
                lastcalc="plus";
            }
        });
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("-");
                if (firstcalc==1){
                    result=Double.parseDouble(P);
                    Res=Double.toString(result);
                    printresult.setText(Res);
                    P=null;
                    firstcalc=0;
                }
                else if(firstcalc==2){
                    eq=0;
                }
                else{
                    x=Double.parseDouble(P);
                    P=null;
                    result=result-x;
                }
                currentnum.setText(P);
                lastcalc="minus";
            }
        });
        buttonDieresi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("/");
                if (firstcalc==1){
                    result=Double.parseDouble(P);
                    Res=Double.toString(result);
                    printresult.setText(Res);
                    P=null;
                    firstcalc=0;
                }
                else if(firstcalc==2){
                    eq=0;
                }
                else{
                    x=Double.parseDouble(P);
                    P=null;
                    result=result/x;
                }
                currentnum.setText(P);
                lastcalc="divide";

            }
        });
        buttonPolsmos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("*");
                if (firstcalc==1){
                    result=Double.parseDouble(P);
                    Res=Double.toString(result);
                    printresult.setText(Res);
                    P=null;
                    firstcalc=0;
                }
                else if(firstcalc==2){
                    eq=0;
                }
                else{
                    x=Double.parseDouble(P);
                    P=null;
                    result=result*x;
                }
                currentnum.setText(P);
                lastcalc="multiply";
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("0");
                if (eq==1){
                    P=null;
                    firstcalc=1;
                    result=null;
                    currentnum.setText(null);
                    printresult.setText(null);
                    eq=0;
                }
                if (P!=null) {
                    P = (P + "0");
                    currentnum.setText(P);
                }
                else
                    currentnum.setText("0");

            }
        });
        buttonDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println(".");
                if (eq==1){
                    P=null;
                    firstcalc=1;
                    result=null;
                    currentnum.setText(null);
                    printresult.setText(null);
                    eq=0;
                }
                if (P == null)
                    P = "0.";
                else
                    P = (P + ".");
                currentnum.setText(P);
            }
        });
        buttonResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("=");
                if (lastcalc.equals(("plus"))){
                    x=Double.parseDouble(P);
                    P=null;
                    result=result+x;
                }
                else if(lastcalc.equals("minus")){
                    x=Double.parseDouble(P);
                    P=null;
                    result=result-x;
                }
                else if(lastcalc.equals("multiply")){
                    x=Double.parseDouble(P);
                    P=null;
                    result=result*x;
                }
                else if(lastcalc.equals("divide")){
                    x=Double.parseDouble(P);
                    P=null;
                    result=result/x;
                }
                eq=1;
                firstcalc=2;
                Res=Double.toString(result);
                printresult.setText(Res);
                currentnum.setText(Res);
                System.out.println("Output:" + result);
            }
        });
        CEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("ce");
                P=null;
                currentnum.setText(P);
            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("c");
                P=null;
                firstcalc=1;
                result=null;
                currentnum.setText(null);
                printresult.setText(null);
            }
        });
    }
    public static void main (String args[]){
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


