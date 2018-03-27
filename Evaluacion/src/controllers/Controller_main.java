package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.*;
import views.*;


public class Controller_main implements ActionListener{

    private View_main view_main;
    private View_area view_area;
    private View_volumen view_volumen;
    
    
    public Controller_main(View_main view_main, View_area view_area, View_volumen view_volumen){
        this.view_main=view_main;
        this.view_area=view_area;
        this.view_volumen=view_volumen;
        
        this.view_main.jmi_area.addActionListener(this);
        this.view_main.jmi_volumen.addActionListener(this);
        
        initView();
    }
    
     private void initView(){
        this.view_main.setTitle("elias");
        this.view_main.setLocationRelativeTo(null);
        this.view_main.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
   
        if(e.getSource()==view_main.jmi_area){
            jmi_areaActionPerformed();
        }
        else if(e.getSource()==view_main.jmi_volumen){
            jmi_volumenActionPerformed();
        }
    }
     public void jmi_areaActionPerformed(){
        this.view_main.setContentPane(view_area);
        this.view_main.revalidate();
        this.view_main.repaint();
    }
    public void jmi_volumenActionPerformed(){
        this.view_main.setContentPane(view_volumen);
        this.view_main.revalidate();
        this.view_main.repaint();
    }
}
