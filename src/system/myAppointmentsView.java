/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author aline
 */
public class myAppointmentsView extends JFrame {
    
    
     myAppointmentsController myApp;
     private JButton logoutButton;
     JButton cancelButton = null;
     JButton cancel2Button = null;
     JButton cancel3Button = null;
     
    public myAppointmentsView (myAppointmentsController myApp){
    
        this.myApp = myApp;
        myAppointmentsSetter();
        validation4();
        
    
    }
    

    public void myAppointmentsSetter(){

        this.setVisible(true);
        this.setSize(370,360);
        this.setTitle("My Appointments");
        BorderLayout fLay = new BorderLayout();
        this.setLayout(fLay);
        setLocationRelativeTo(null);
        
        
        //PANEL PRINCIPAL ONDE VAI TODOS OS PANELS
        JPanel painelPrincipal = new JPanel();
            this.add(painelPrincipal, BorderLayout.CENTER);
//            painelPrincipal.setBackground(Color.red);

            
        //FLOWLAYOUT CENTRAL
        FlowLayout centerLayout = new FlowLayout();
            painelPrincipal.setLayout(centerLayout);
            centerLayout.setAlignment(FlowLayout.TRAILING);
            
            

        //PANEL DO TOPO PRINCIPAL
         JPanel painelTopo = new JPanel();
            this.add(painelTopo, BorderLayout.PAGE_START); 
//            painelTopo.setBackground(Color.blue);
            painelTopo.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            
            
        //LABEL DO TOPO
        FlowLayout labelLoginFlow = new FlowLayout();
        labelLoginFlow.setAlignment(FlowLayout.LEFT);
        JLabel labelTopo = new JLabel("Login User: ");
            painelTopo.add(labelTopo);
            painelTopo.setLayout(labelLoginFlow);
            
         //GRIDLAYOUT
         GridLayout minhaGrid = new GridLayout(6,1);
            painelPrincipal.setLayout(minhaGrid);
            painelTopo.setLayout(minhaGrid);
            
            
        //BOTAO DO LOGOUT
        FlowLayout logOutFlow = new FlowLayout();
        logOutFlow.setAlignment(FlowLayout.RIGHT);
        painelPrincipal.add(painelTopo);
        logoutButton = new JButton("LogOut");
        painelTopo.add(logoutButton);
        painelTopo.setLayout(logOutFlow);
        logoutButton.setPreferredSize(new Dimension(80,20));
        logoutButton.setActionCommand("LogOut");
        logoutButton.addActionListener(myApp);

        //PANEL DO TOPO COM OS DOIS BOTOES
          JPanel appointPanel = new JPanel();
          painelPrincipal.add(appointPanel);
          FlowLayout appointFlow = new FlowLayout();
          appointPanel.setLayout(appointFlow);
          appointFlow.setAlignment(FlowLayout.CENTER);
           
          JButton makeAppoint = new JButton("Make an Appointment");
          JButton myAppoint = new JButton("My Appointments");
          appointPanel.add(makeAppoint);
          appointPanel.add(myAppoint);
          makeAppoint.addActionListener(myApp);
          makeAppoint.setActionCommand("makeapp");
//          appointPanel.setBackground(Color.green);
//          appointPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
          
         
          JPanel appInfo1 = new JPanel();
          painelPrincipal.add(appInfo1);
//          appInfo1.setBackground(Color.yellow);
          JLabel info1 = new JLabel("Location: 38, Upper Street - D01");
          JLabel info2 = new JLabel("Hairdresser: Hairdresser01");
          JLabel info3 = new JLabel("Date: 00/00/00 Time: 00:00");
          appInfo1.setLayout(new GridBagLayout());
          GridBagConstraints gbc = new GridBagConstraints();
          gbc.gridwidth = GridBagConstraints.REMAINDER;
          appInfo1.add(info1, gbc);
          appInfo1.add(info2,gbc);
          appInfo1.add(info3,gbc);
          appInfo1.setBorder(BorderFactory.createLineBorder(Color.gray));
          
            FlowLayout cancelFlow = new FlowLayout();
            cancelFlow.setAlignment(FlowLayout.RIGHT);
            painelPrincipal.add(appInfo1);
            cancelButton = new JButton("Cancel");
            appInfo1.add(cancelButton);
            appInfo1.setLayout(cancelFlow);
            cancelButton.setPreferredSize(new Dimension(80,20));
            cancelButton.setActionCommand("Cancel");
            cancelButton.addActionListener(myApp);
   
          
          JPanel appInfo2 = new JPanel();
          painelPrincipal.add(appInfo2);
//          appInfo2.setBackground(Color.GREEN);
          JLabel info11 = new JLabel("Location: 38, Upper Street - D01");
          JLabel info12 = new JLabel("Hairdresser: Hairdresser01");
          JLabel info13 = new JLabel("Date: 00/00/00 Time: 00:00");
          appInfo2.setLayout(new GridBagLayout());
          GridBagConstraints gbc1 = new GridBagConstraints();
          gbc1.gridwidth = GridBagConstraints.REMAINDER;
          appInfo2.add(info11, gbc1);
          appInfo2.add(info12,gbc1);
          appInfo2.add(info13,gbc1);
          appInfo2.setBorder(BorderFactory.createLineBorder(Color.GRAY));
          
          
            painelPrincipal.add(appInfo2);
            cancel2Button = new JButton("Cancel");
            appInfo2.add(cancel2Button);
            appInfo2.setLayout(cancelFlow);
            cancel2Button.setPreferredSize(new Dimension(80,20));
            cancel2Button.setActionCommand("Cancel");
            cancel2Button.addActionListener(myApp);
          
          
          
          JPanel appInfo3 = new JPanel();
          painelPrincipal.add(appInfo3);
//          appInfo3.setBackground(Color.magenta);
          JLabel info21 = new JLabel("Location: 38, Upper Street - D01");
          JLabel info22 = new JLabel("Hairdresser: Hairdresser01");
          JLabel info23 = new JLabel("Date: 00/00/00 Time: 00:00");
          appInfo3.setLayout(new GridBagLayout());
          GridBagConstraints gbc2 = new GridBagConstraints();
          gbc2.gridwidth = GridBagConstraints.REMAINDER;
          appInfo3.add(info21, gbc2);
          appInfo3.add(info22,gbc2);
          appInfo3.add(info23,gbc2);
          appInfo3.setBorder(BorderFactory.createLineBorder(Color.gray));
          
            painelPrincipal.add(appInfo3);
            cancel3Button = new JButton("Cancel");
            appInfo3.add(cancel3Button);
            appInfo3.setLayout(cancelFlow);
            cancel3Button.setPreferredSize(new Dimension(80,20));
            cancel3Button.setActionCommand("Cancel");
            cancel3Button.addActionListener(myApp);
            
            
            //BOTAO PARA USUARIO DEIXAR OS COMENTARIOS SOBRE O ATENDIMENTO
            //ESSE BOTAO IRA ABRIR UMA OUTRA JANELA MENOR COM O ULTIMO NEGOCIO QUE O PROFESSOR ENSINOU
            JButton makeComment = new JButton("Make Comments");
            painelPrincipal.add(makeComment);
            makeComment.addActionListener(myApp);
            makeComment.setActionCommand("makeComments");
}

    public void validation4(){
        this.validate();
        this.repaint();
}
}