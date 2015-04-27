package asnmt5;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class asnmt5 implements ActionListener {
        private JLabel name;
        private JLabel assignment;
        private JLabel midterm;
        private JLabel project;
        private JLabel finalproj;
        private JLabel finalgrade;
        private JLabel studentname1;
        private JLabel subject;
        private JLabel weightlabel;
        private JLabel scorelabel;
        private JLabel finalscore;
        private JLabel finalweight;
        
        JFrame frame;
        JButton button;
        JLabel label;
        JPanel studentname;
        JPanel panel1 = new JPanel();
        JPanel score1 = new JPanel();
        JPanel weightpanel = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel calc = new JPanel();
        
        JTextField [] txt = new JTextField[10];
        JTextField [] txtf1 = new JTextField[10];

public asnmt5(){
        frame = new JFrame("Score Calculator");
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        name = new JLabel();
        name.setText("Student name");

        
        assignment = new JLabel();
        assignment.setText("Assignments");
        
        midterm = new JLabel();
        midterm.setText("Midterm");
        
        project = new JLabel();
        project.setText("Project");
        finalproj = new JLabel();
        finalproj.setText("Final");
        finalgrade = new JLabel();
        finalgrade.setText("");
        studentname1 = new JLabel();
        studentname1.setText("Name: ");
        finalscore = new JLabel();
        finalscore.setText("Average Score: ");
        finalweight = new JLabel();
        finalweight.setText("Letter Grade: ");
        subject = new JLabel();
        subject.setText("Subject");
        weightlabel = new JLabel();
        weightlabel.setText("                                       Weight");
        scorelabel = new JLabel();
        scorelabel.setText("                       Score");
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(6,1));
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1,3));
        score1 = new JPanel();
        score1.setLayout(new GridLayout(6,1));
        weightpanel = new JPanel();
        weightpanel.setLayout(new GridLayout(6,1));
        calc = new JPanel();
        calc.setBackground(Color.gray);
        calc.setLayout(new GridLayout(1,4));
        button = new JButton("Calculate");
        button.addActionListener(this);
        txt[0] = new JTextField(1);
        txt[1] = new JTextField(1);
        txt[2] = new JTextField(1);
        txt[3] = new JTextField(1);
        txt[4] = new JTextField(1);
        txt[5] = new JTextField(1);
        txt[6] = new JTextField(1);
        txtf1[0] = new JTextField(3);
        txtf1[1] = new JTextField(3);
        txtf1[2] = new JTextField(3);
        txtf1[3] = new JTextField(3);
        txtf1[4] = new JTextField(3);
        txtf1[5] = new JTextField(3);
        txtf1[6] = new JTextField(3);
        
        frame.add(panel1, BorderLayout.WEST);
        frame.add(score1, BorderLayout.CENTER);
        frame.add(weightpanel, BorderLayout.EAST);
        frame.add(panel2, BorderLayout.PAGE_START);
        frame.add(calc, BorderLayout.AFTER_LAST_LINE);
        panel1.add(name);
        panel1.add(assignment);
        panel1.add(midterm);
        panel1.add(project);
        panel1.add(finalproj);
        panel2.add(subject);
        panel2.add(scorelabel);
        panel2.add(weightlabel);
        score1.add(txt[0]);
        score1.add(txt[1]);
        score1.add(txt[2]);
        score1.add(txt[3]);
        score1.add(txt[4]);
        weightpanel.add(finalgrade);
        weightpanel.add(txtf1[1]);
        weightpanel.add(txtf1[2]);
        weightpanel.add(txtf1[3]);
        weightpanel.add(txtf1[4]);
        calc.add(button);
        calc.add(studentname1);
        calc.add(finalscore);
        calc.add(finalweight);
}     
        public void actionPerformed(ActionEvent arg0) {

                String score1 = txt[0].getText();
                double score2 = Double.parseDouble(txt[1].getText());
                double score3 = Double.parseDouble(txt[2].getText());
                double score4 = Double.parseDouble(txt[3].getText());
                double score5 = Double.parseDouble(txt[4].getText());
                double weight2 = Double.parseDouble(txtf1[1].getText());
                double weight3 = Double.parseDouble(txtf1[2].getText());
                double weight4 = Double.parseDouble(txtf1[3].getText());
                double weight5 = Double.parseDouble(txtf1[4].getText());
                double total2= score2*(weight2);
                double total3= score3*(weight3);
                double total4= score4*(weight4);
                double total5= score5*(weight5);
                studentname1.setText(score1);
                double avgscore= total2+total3+total4+total5;
                finalscore.setText(String.valueOf("Average Score: " + avgscore));
                if(avgscore>=90) {
                        finalweight.setText(String.valueOf("Letter Grade: " + "A"));
                } else if (avgscore>=80){
                        finalweight.setText(String.valueOf("Letter Grade: " + "B"));
                } else if (avgscore>=70){
                        finalweight.setText(String.valueOf("Letter Grade: " + "C"));
                }else if (avgscore>=60){
                        finalweight.setText(String.valueOf("Letter Grade: " + "D"));
                } else if (avgscore>=0){
                        finalweight.setText(String.valueOf("Letter Grade: " + "F"));
                }
        }
}