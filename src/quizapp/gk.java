package quizapp;
import java.awt.*;
import javax.swing.*;

public class gk extends javax.swing.JFrame {

String[] question = {
    "Q1.  International Domain of Sri Lanka is?",
    "Q2.  Who is the Current Prime Minister of Sri Lanka?",
    "Q3.  The year of Sri Lanka won Cricket World Cup firstly",
    "Q4.  The most popular sport in Sri Lanka is?",
    "Q5.  Who is the 9th President of Sri Lanka?",
    "Q6.  The official language of Sri Lanka is?",
    "Q7.  The total land area of Sri Lanka?",
    "Q8.  International Calling Code of Sri Lanka is?",
    "Q9.  The Capital City of Sri Lanka is?",
    "Q10.  Total Population of Sri Lanka in 2022 is?",
    "Q11.  Official Currency of Sri Lanka is called?",
    "Q12.  In Sri Lanka Legislature House is called?",
    "Q13.  Main religion in Sri Lanka is?",
    "Q14.  When did Sri Lanka become independent country?",
    "Q15.  How was Sri Lanka formerly known?",
    "Q16.  Which strait seperates Sri Lanka from India?",
    "Q17.  Which is the longest river in Sri Lanka?",
    "Q18.  Which is the highest point in Sri Lanka?",
    "Q19.  Who was the Portuguese captain landed Colombo in 1505?",
    "Q20.  When did the British conquer Sri Lanka from the Dutch?",
    "Q21.  When did the economic crisis of Sri Lanka start?",
    "Q22.  The new tourism slogan of Sri Lanka from 2018?",
    "Q23.  Issuance of national identity cards in Sri Lanka started,",
    "Q24.  The 17th Governor of the Central Bank of Sri Lanka",
    "Q25.  Who is the Father of Free Education in Sri Lanka?"
    };


//fourth item is the correct answer
String[][] options = {
/*1*/ {".sk",".snow",".sl,",".lk"},
/*2*/ {"Mr. Mahinda Rajapakshe","Mr. Ranil Wickremesinghe","Mr. Sajith Premadasa","Mr. Dinesh Gunawardena"},
/*3*/ {"2004","2000","1992","1996"},
/*4*/ {"Football","Tennis","Volleyball","Cricket"},
/*5*/ {"Mr. Mahinda Rajapakshe","Mr. Gotabhaya Rajapakshe","Mr. Maithripala Sirisena","Mr. Ranil Wickremesinghe"},
/*6*/ {"Italian","Portugese","Spanish","Sinhala, Tamil"},
/*7*/ {"64,610 sq. km.","65,332 sq. km.","64,332 sq. km.","65,610 sq. km."},
/*8*/ {"+96","+92","+90","+94"},
/*9*/ {"Kandy","Negombo","Colombo","Sri Jayawardenepra Kotte"},
/*10*/ {"21,847,664","21,773,441","21,715,079","21,832,143"},
/*11*/ {"Euro","Dollar","Pound","Rupee"},
/*12*/ {"National Assembly","Senate","Congress","Parliament"},
/*13*/ {"Hinduism","Islam","Christianity","Buddhism"},
/*14*/ {"30th June 1942","4th July 1956","2nd December 1971","4th February 1948"},
/*15*/ {"Burma","Formosa","Nyasaland","Ceylon"},
/*16*/ {"Davis Strait","Johore Strait","Cook Strait","Palk Strait"},
/*17*/ {"Cauvery river","Amban river","Padma river","Mahaweli river"},
/*18*/ {"Adam's Peak","Kirigalpotta","Godwin Austin","Pidurutalagala"},
/*19*/ {"Vasco De Gama","Pedro Alvares Cabral","Francisco De Almeida","Lourenco De Almeida"},
/*20*/ {"1815","1848","1776","1796"},
/*21*/ {"2012","2005","2022","2019"},
/*22*/ {"Wonder of Asia","Incredible Sri Lanka","Paradise in Asia","So Sri Lanka"},
/*23*/ {"1989","1971","1970","1972"},
/*24*/ {"Mr. Ajith Nivard Cabraal","Mr. Arjuna Mahendran","Mr. A S Jayawardena","Mr. Nandalal Weerasinghe"},
/*25*/ {"Mr. J. R. Jayewardene","Dr. N. M. Perera","Mr. D.S. Senanayake","Mr. C.W.W. Kannangara"}
   
};

    int index = 0, correct = 0;
    ButtonGroup bg = new ButtonGroup();
        
    public gk() {
        initComponents();
        
        ImageIcon imagebg = new ImageIcon(new ImageIcon("p3.png").getImage().getScaledInstance(jLabel2.getWidth(),jLabel2.getHeight(), Image.SCALE_DEFAULT));
         jLabel2.setIcon(imagebg);
        
        bg.add(btn1);
        bg.add(btn2);
        bg.add(btn3);
        bg.add(btn4);
        
        nextActionPerformed(null);
    }
    
    
    public void getSelectedOption(JRadioButton bbtn){
        //to get selected value from the radio button
        //increament the index
        //display radio buttons
        //check if the user selected the correct ans
        
        System.out.println(bbtn.getText());
        System.out.println(options[index][3]);
                
        if(bbtn.getText().equals(options[index][3]))
        {
            correct++;
        }
        
        index++;
        enableradiobtns(false);
    }
    
    //enable/ disable radiobuttons
    public void enableradiobtns(boolean yesno){
        btn1.setEnabled(yesno);
        btn2.setEnabled(yesno);
        btn3.setEnabled(yesno);
        btn4.setEnabled(yesno);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn1 = new javax.swing.JRadioButton();
        btn2 = new javax.swing.JRadioButton();
        btn3 = new javax.swing.JRadioButton();
        btn4 = new javax.swing.JRadioButton();
        ques = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        next = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(120, 59, 241));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tekton Pro Ext", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quizz Time - General Knowledge");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 70));

        btn1.setBackground(new java.awt.Color(204, 204, 204));
        btn1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn1.setText("btn1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 330, 30));

        btn2.setBackground(new java.awt.Color(204, 204, 204));
        btn2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn2.setText("btn2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 330, 30));

        btn3.setBackground(new java.awt.Color(204, 204, 204));
        btn3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn3.setText("btn3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 330, 30));

        btn4.setBackground(new java.awt.Color(204, 204, 204));
        btn4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn4.setText("btn4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 330, 30));

        ques.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ques.setText("ques");
        jPanel1.add(ques, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 550, 140));

        back.setBackground(new java.awt.Color(51, 51, 51));
        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("BACK");
        back.setToolTipText("Click Here To Go To Quiz Time Dashboard");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 110, 34));

        next.setBackground(new java.awt.Color(51, 51, 51));
        next.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        next.setForeground(new java.awt.Color(255, 255, 255));
        next.setText("NEXT");
        next.setToolTipText("Choose An Answer And Click Here To Go To Next Quiz");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel1.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 420, 110, 34));

        jLabel2.setText("jLabel1");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 220, 210));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        //increament to go to next question
        getSelectedOption(btn1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        getSelectedOption(btn2);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        getSelectedOption(btn3);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        getSelectedOption(btn4);
    }//GEN-LAST:event_btn4ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        setVisible(false);
        f2 back = new f2();
        back.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed

        if(next.getText().equals("RESTART"))
        {
            //restart the quiz
            next.setText("NEXT");
            jPanel1.setBackground(Color.WHITE);
            index = 0;
            correct = 0;
        }

        if(index == question.length)
        {
            //display the user score
            //ques.setText("Your Score: " + correct + " / " + question.length);

            if(correct >= 15)
            {
                JOptionPane optpanel = new JOptionPane();

                optpanel.setBackground(Color.GREEN);
                optpanel.showMessageDialog(null,"Congratulations!  Your Score is : " + correct + " / " + question.length,
                    "Quiz Finished", optpanel.PLAIN_MESSAGE);

                //System.exit(0);
            }

            else{
                JOptionPane optpanel2 = new JOptionPane();
                optpanel2.setBackground(Color.RED);

                optpanel2.showMessageDialog(null,"Sorry!  Your Score is : " + correct + " / " + question.length,
                    "Quiz Finished", optpanel2.PLAIN_MESSAGE);

                ques.setText("");
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
            }

            next.setText("RESTART");
        }

        else
        {
            //enable radio btns
            enableradiobtns(true);

            //display next question
            ques.setText(question[index]);

            btn1.setText(options[index][0]);
            btn2.setText(options[index][1]);
            btn3.setText(options[index][2]);
            btn4.setText(options[index][3]);

            if(index == question.length - 1)
            {
                next.setText("SUBMIT");
            }

        }

        //clear the selection
        bg.clearSelection();

    }//GEN-LAST:event_nextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JRadioButton btn1;
    private javax.swing.JRadioButton btn2;
    private javax.swing.JRadioButton btn3;
    private javax.swing.JRadioButton btn4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton next;
    private javax.swing.JLabel ques;
    // End of variables declaration//GEN-END:variables
}
