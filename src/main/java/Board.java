
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhana
 */
public class Board extends javax.swing.JFrame {

    private String startGame="X";
    private int xCount=0;
    private int oCount=0;
    boolean checker;
    public Board() {
        initComponents();
    }
    private void gameScore()
    {
        playerx.setText(String.valueOf(xCount));
        playero.setText(String.valueOf(oCount));
    }
    
     private void choose_a_player()
    {
       if(startGame.equalsIgnoreCase("X"))
       {
           startGame="O";   
       }
       else
       {
           startGame="X";   
       }
    }
     
     private void winningGame()
     {
         String b1=tic1.getText();
         String b2=tic2.getText();
         String b3=tic3.getText();
         String b4=tic4.getText();
         String b5=tic5.getText();
         String b6=tic6.getText();
         String b7=tic7.getText();
         String b8=tic8.getText();
         String b9=tic9.getText();
         
         if(b1==("X") && b2==("X") && b3==("X"))
         {
             JOptionPane.showMessageDialog(this,"Player X wins","TIc Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             tic1.setBackground(Color.orange);
             tic2.setBackground(Color.orange);
             tic3.setBackground(Color.orange);
             xCount++;
             gameScore();
         }
          if(b4==("X") && b5==("X") && b6==("X"))
         {
             JOptionPane.showMessageDialog(this,"Player X wins","TIc Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             tic4.setBackground(Color.orange);
             tic5.setBackground(Color.orange);
             tic6.setBackground(Color.orange);
             xCount++;
             gameScore();
         }
          if(b7==("X") && b8==("X") && b9==("X"))
         { 
             JOptionPane.showMessageDialog(this,"Player X wins","TIc Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             tic7.setBackground(Color.orange);
             tic8.setBackground(Color.orange);
             tic9.setBackground(Color.orange);
             xCount++;
             gameScore();
         }
           if(b1==("X") && b4==("X") && b7==("X"))
         {
             JOptionPane.showMessageDialog(this,"Player X wins","TIc Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             tic1.setBackground(Color.orange);
             tic4.setBackground(Color.orange);
             tic7.setBackground(Color.orange);
             xCount++;
             gameScore();
         }
          if(b2==("X") && b5==("X") && b8==("X"))
         {
             JOptionPane.showMessageDialog(this,"Player X wins","TIc Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             tic2.setBackground(Color.orange);
             tic5.setBackground(Color.orange);
             tic8.setBackground(Color.orange);
             xCount++;
             gameScore();
         }
          if(b3==("X") && b6==("X") && b9==("X"))
         { 
             JOptionPane.showMessageDialog(this,"Player X wins","TIc Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             tic3.setBackground(Color.orange);
             tic6.setBackground(Color.orange);
             tic9.setBackground(Color.orange);
             xCount++;
             gameScore();
         }
           if(b1==("X") && b5==("X") && b9==("X"))
         {
             JOptionPane.showMessageDialog(this,"Player X wins","TIc Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             tic1.setBackground(Color.orange);
             tic5.setBackground(Color.orange);
             tic9.setBackground(Color.orange);
             xCount++;
             gameScore();
         }
          if(b3==("X") && b5==("X") && b7==("X"))
         { 
             JOptionPane.showMessageDialog(this,"Player X wins","TIc Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             tic3.setBackground(Color.orange);
             tic5.setBackground(Color.orange);
             tic7.setBackground(Color.orange);
             xCount++;
             gameScore();
         }
         if(b1==("O") && b2==("O") && b3==("O"))
         {
             JOptionPane.showMessageDialog(this,"Player O wins","TIc Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             tic1.setBackground(Color.green);
             tic2.setBackground(Color.green);
             tic3.setBackground(Color.green);
             oCount++;
             gameScore();
         }
          if(b4==("O") && b5==("O") && b6==("O"))
         {
             JOptionPane.showMessageDialog(this,"Player O wins","TIc Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             tic4.setBackground(Color.green);
             tic5.setBackground(Color.green);
             tic6.setBackground(Color.green);
             oCount++;
             gameScore();
         }
          if(b7==("O") && b8==("O") && b9==("O"))
         { 
             JOptionPane.showMessageDialog(this,"Player O wins","TIc Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             tic7.setBackground(Color.green);
             tic8.setBackground(Color.green);
             tic9.setBackground(Color.green);
             oCount++;
             gameScore();
         }
           if(b1==("O") && b4==("O") && b7==("O"))
         {
             JOptionPane.showMessageDialog(this,"Player O wins","TIc Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             tic1.setBackground(Color.green);
             tic4.setBackground(Color.green);
             tic7.setBackground(Color.green);
             oCount++;
             gameScore();
         }
          if(b2==("O") && b5==("O") && b8==("O"))
         {
             JOptionPane.showMessageDialog(this,"Player O wins","TIc Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             tic2.setBackground(Color.green);
             tic5.setBackground(Color.green);
             tic8.setBackground(Color.green);
             oCount++;
             gameScore();
         }
          if(b3==("O") && b6==("O") && b9==("O"))
         { 
             JOptionPane.showMessageDialog(this,"Player O wins","TIc Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             tic3.setBackground(Color.green);
             tic6.setBackground(Color.green);
             tic9.setBackground(Color.green);
             oCount++;
             gameScore();
         }
           if(b1==("O") && b5==("O") && b9==("O"))
         {
             JOptionPane.showMessageDialog(this,"Player O wins","TIc Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             tic1.setBackground(Color.green);
             tic5.setBackground(Color.green);
             tic9.setBackground(Color.green);
             oCount++;
             gameScore();
         }
          if(b3==("O") && b5==("O") && b7==("O"))
         { 
             JOptionPane.showMessageDialog(this,"Player O wins","TIc Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             tic3.setBackground(Color.green);
             tic5.setBackground(Color.green);
             tic7.setBackground(Color.green);
             oCount++;
             gameScore();
         }
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tic1 = new javax.swing.JButton();
        tic3 = new javax.swing.JButton();
        tic2 = new javax.swing.JButton();
        tic5 = new javax.swing.JButton();
        tic6 = new javax.swing.JButton();
        tic9 = new javax.swing.JButton();
        tic4 = new javax.swing.JButton();
        tic7 = new javax.swing.JButton();
        tic8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        playero = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        newgame = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));

        jPanel1.setBackground(new java.awt.Color(95, 158, 160));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(0, 102, 102), null, new java.awt.Color(0, 102, 102)));

        tic1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        tic1.setMaximumSize(new java.awt.Dimension(200, 158));
        tic1.setMinimumSize(new java.awt.Dimension(200, 158));
        tic1.setPreferredSize(new java.awt.Dimension(200, 158));
        tic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic1ActionPerformed(evt);
            }
        });

        tic3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        tic3.setMaximumSize(new java.awt.Dimension(200, 158));
        tic3.setMinimumSize(new java.awt.Dimension(200, 158));
        tic3.setPreferredSize(new java.awt.Dimension(200, 158));
        tic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic3ActionPerformed(evt);
            }
        });

        tic2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        tic2.setMaximumSize(new java.awt.Dimension(200, 158));
        tic2.setMinimumSize(new java.awt.Dimension(200, 158));
        tic2.setPreferredSize(new java.awt.Dimension(200, 158));
        tic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic2ActionPerformed(evt);
            }
        });

        tic5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        tic5.setMaximumSize(new java.awt.Dimension(200, 158));
        tic5.setMinimumSize(new java.awt.Dimension(200, 158));
        tic5.setPreferredSize(new java.awt.Dimension(200, 158));
        tic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic5ActionPerformed(evt);
            }
        });

        tic6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        tic6.setMaximumSize(new java.awt.Dimension(200, 158));
        tic6.setMinimumSize(new java.awt.Dimension(200, 158));
        tic6.setPreferredSize(new java.awt.Dimension(200, 158));
        tic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic6ActionPerformed(evt);
            }
        });

        tic9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        tic9.setMaximumSize(new java.awt.Dimension(200, 158));
        tic9.setMinimumSize(new java.awt.Dimension(200, 158));
        tic9.setPreferredSize(new java.awt.Dimension(200, 158));
        tic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic9ActionPerformed(evt);
            }
        });

        tic4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        tic4.setMaximumSize(new java.awt.Dimension(200, 158));
        tic4.setMinimumSize(new java.awt.Dimension(200, 158));
        tic4.setPreferredSize(new java.awt.Dimension(200, 158));
        tic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic4ActionPerformed(evt);
            }
        });

        tic7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        tic7.setMaximumSize(new java.awt.Dimension(200, 158));
        tic7.setMinimumSize(new java.awt.Dimension(200, 158));
        tic7.setPreferredSize(new java.awt.Dimension(200, 158));
        tic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic7ActionPerformed(evt);
            }
        });

        tic8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        tic8.setMaximumSize(new java.awt.Dimension(200, 158));
        tic8.setMinimumSize(new java.awt.Dimension(200, 158));
        tic8.setPreferredSize(new java.awt.Dimension(200, 158));
        tic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tic1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tic4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tic2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tic5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tic7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tic8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tic3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tic6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tic9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tic2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tic1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tic3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tic6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tic4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tic5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tic9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tic8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tic7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(95, 158, 160));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(0, 102, 102), null, new java.awt.Color(0, 102, 102)));

        jPanel6.setBackground(new java.awt.Color(95, 158, 160));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(0, 102, 102), null, new java.awt.Color(0, 102, 102)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel1.setText("Player O:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel2.setText("Player X:");
        jLabel2.setToolTipText("");

        playerx.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        playerx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerx.setText("0");
        playerx.setToolTipText("");
        playerx.setOpaque(true);

        playero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        playero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playero.setText("0");
        playero.setOpaque(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(95, 158, 160));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(0, 102, 102), null, new java.awt.Color(0, 102, 102)));

        exit.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        exit.setText("Exit");
        exit.setMaximumSize(new java.awt.Dimension(200, 158));
        exit.setMinimumSize(new java.awt.Dimension(200, 158));
        exit.setPreferredSize(new java.awt.Dimension(200, 158));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        newgame.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        newgame.setText("New Game");
        newgame.setMaximumSize(new java.awt.Dimension(200, 158));
        newgame.setMinimumSize(new java.awt.Dimension(200, 158));
        newgame.setPreferredSize(new java.awt.Dimension(200, 158));
        newgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newgameActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        reset.setText("Reset");
        reset.setMaximumSize(new java.awt.Dimension(200, 158));
        reset.setMinimumSize(new java.awt.Dimension(200, 158));
        reset.setPreferredSize(new java.awt.Dimension(200, 158));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(newgame, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newgame, javax.swing.GroupLayout.PREFERRED_SIZE, 101, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(95, 158, 160));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(0, 102, 102), null, new java.awt.Color(0, 102, 102)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TIC TAC TOE GAME");
        jLabel3.setToolTipText("");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 470, 70));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 1090, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tic2ActionPerformed
        // TODO add your handling code here:
        String s=tic2.getText();
         if(s==("X")||s==("O"))
        {
             JOptionPane.showMessageDialog(this,"Invalid move","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
         else
             
         {
             tic2.setText(startGame);
        if(startGame.equalsIgnoreCase(("X")))
        {
            checker=false;
        }
        else
        {
            checker=true;
        }
        choose_a_player();
        winningGame();
         }
         
    }//GEN-LAST:event_tic2ActionPerformed

    private void tic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tic6ActionPerformed
        // TODO add your handling code here:
        String s=tic6.getText();
         if(s==("X")||s==("O"))
        {
             JOptionPane.showMessageDialog(this,"Invalid move","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
         else
         {
         tic6.setText(startGame);
        if(startGame.equalsIgnoreCase(("X")))
        {
            checker=false;
        }
        else
        {
            checker=true;
        }
        choose_a_player();
        winningGame();}
    }//GEN-LAST:event_tic6ActionPerformed
   
 private JFrame frame;
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
                      // TODO add your handling code here:
                      frame = new JFrame("Exit");
                      if(JOptionPane.showConfirmDialog(frame,"confirm if you want to exit","Tic TAC Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
                      {
                          System.exit(0);
                      }
    }//GEN-LAST:event_exitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
                       // TODO add your handling code here:
                       tic1.setEnabled(true);
                       tic2.setEnabled(true);
                       tic3.setEnabled(true);
                       tic4.setEnabled(true);
                       tic5.setEnabled(true);
                       tic6.setEnabled(true);
                       tic7.setEnabled(true);
                       tic8.setEnabled(true);
                       tic9.setEnabled(true);
                       
                       tic1.setText("");
                       tic2.setText("");
                       tic3.setText("");
                       tic4.setText("");
                       tic5.setText("");
                       tic6.setText("");
                       tic7.setText("");
                       tic8.setText("");
                       tic9.setText("");
                
                       tic1.setBackground(Color.LIGHT_GRAY);
                       tic2.setBackground(Color.LIGHT_GRAY);
                       tic3.setBackground(Color.LIGHT_GRAY);
                       tic4.setBackground(Color.LIGHT_GRAY);
                       tic5.setBackground(Color.LIGHT_GRAY);
                       tic6.setBackground(Color.LIGHT_GRAY);
                       tic7.setBackground(Color.LIGHT_GRAY);
                       tic8.setBackground(Color.LIGHT_GRAY); 
                       tic9.setBackground(Color.LIGHT_GRAY);
           
    }//GEN-LAST:event_resetActionPerformed

    private void newgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newgameActionPerformed
        // TODO add your handling code here:
                       tic1.setEnabled(true);
                       tic2.setEnabled(true);
                       tic3.setEnabled(true);
                       tic4.setEnabled(true);
                       tic5.setEnabled(true);
                       tic6.setEnabled(true);
                       tic7.setEnabled(true);
                       tic8.setEnabled(true);
                       tic9.setEnabled(true);
                       
                       playerx.setText("0");
                       playero.setText("0");
                       
                       tic1.setText("");
                       tic2.setText("");
                       tic3.setText("");
                       tic4.setText("");
                       tic5.setText("");
                       tic6.setText("");
                       tic7.setText("");
                       tic8.setText("");
                       tic9.setText("");
                
                       tic1.setBackground(Color.LIGHT_GRAY);
                       tic2.setBackground(Color.LIGHT_GRAY);
                       tic3.setBackground(Color.LIGHT_GRAY);
                       tic4.setBackground(Color.LIGHT_GRAY);
                       tic5.setBackground(Color.LIGHT_GRAY);
                       tic6.setBackground(Color.LIGHT_GRAY);
                       tic7.setBackground(Color.LIGHT_GRAY);
                       tic8.setBackground(Color.LIGHT_GRAY); 
                       tic9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_newgameActionPerformed

    private void tic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tic1ActionPerformed
        // TODO add your handling code here:
        String s=tic1.getText();
         if(s==("X")||s==("O"))
        {
             JOptionPane.showMessageDialog(this,"Invalid move","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
         else
         {
        tic1.setText(startGame);
        if(startGame.equalsIgnoreCase(("X")))
        {
            checker=false;
        }
        else
        {
            checker=true;
        }
        choose_a_player();
        winningGame();}
    }//GEN-LAST:event_tic1ActionPerformed

    private void tic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tic3ActionPerformed
        // TODO add your handling code here:
        String s=tic3.getText();
         if(s==("X")||s==("O"))
        {
             JOptionPane.showMessageDialog(this,"Invalid move","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
         else{
         tic3.setText(startGame);
        if(startGame.equalsIgnoreCase(("X")))
        {
            checker=false;
        }
        else
        {
            checker=true;
        }
        choose_a_player();
        winningGame();}
    }//GEN-LAST:event_tic3ActionPerformed

    private void tic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tic4ActionPerformed
        // TODO add your handling code here:
        String s=tic4.getText();
         if(s==("X")||s==("O"))
        {
             JOptionPane.showMessageDialog(this,"Invalid move","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
         else{
         tic4.setText(startGame);
        if(startGame.equalsIgnoreCase(("X")))
        {
            checker=false;
        }
        else
        {
            checker=true;
        }
        choose_a_player();
        winningGame();}
    }//GEN-LAST:event_tic4ActionPerformed

    private void tic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tic5ActionPerformed
        // TODO add your handling code here:
        String s=tic5.getText();
         if(s==("X")||s==("O"))
        {
             JOptionPane.showMessageDialog(this,"Invalid move","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
         else{
         tic5.setText(startGame);
        if(startGame.equalsIgnoreCase(("X")))
        {
            checker=false;
        }
        else
        {
            checker=true;
        }
        choose_a_player();
        winningGame();}
    }//GEN-LAST:event_tic5ActionPerformed

    private void tic7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tic7ActionPerformed
        // TODO add your handling code here:
        String s=tic7.getText();
         if(s==("X")||s==("O"))
        {
             JOptionPane.showMessageDialog(this,"Invalid move","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
         else
         {
         tic7.setText(startGame);
        if(startGame.equalsIgnoreCase(("X")))
        {
            checker=false;
        }
        else
        {
            checker=true;
        }
        choose_a_player();
        winningGame();}
    }//GEN-LAST:event_tic7ActionPerformed

    private void tic8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tic8ActionPerformed
        // TODO add your handling code here:
        String s=tic8.getText();
         if(s==("X")||s==("O"))
        {
             JOptionPane.showMessageDialog(this,"Invalid move","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
         else
         {
         tic8.setText(startGame);
        if(startGame.equalsIgnoreCase(("X")))
        {
            checker=false;
        }
        else
        {
            checker=true;
        }
        choose_a_player();
        winningGame();}
    }//GEN-LAST:event_tic8ActionPerformed

    private void tic9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tic9ActionPerformed
        // TODO add your handling code here:
        String s=tic9.getText();
         if(s==("X")||s==("O"))
        {
             JOptionPane.showMessageDialog(this,"Invalid move","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
         else
         {
         tic9.setText(startGame);
        if(startGame.equalsIgnoreCase(("X")))
        {
            checker=false;
        }
        else
        {
            checker=true;
        }
        choose_a_player();
        winningGame();}
    }//GEN-LAST:event_tic9ActionPerformed

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
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Board().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton newgame;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerx;
    private javax.swing.JButton reset;
    private javax.swing.JButton tic1;
    private javax.swing.JButton tic2;
    private javax.swing.JButton tic3;
    private javax.swing.JButton tic4;
    private javax.swing.JButton tic5;
    private javax.swing.JButton tic6;
    private javax.swing.JButton tic7;
    private javax.swing.JButton tic8;
    private javax.swing.JButton tic9;
    // End of variables declaration//GEN-END:variables
}
