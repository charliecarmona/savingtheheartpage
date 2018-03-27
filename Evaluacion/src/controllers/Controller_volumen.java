package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Model_volumen;
import views.View_volumen;

public class Controller_volumen implements ActionListener {

   Model_volumen model_volumen;
   View_volumen view_volumen;
    
   
   public Controller_volumen(View_volumen view_volumen,Model_volumen model_volumen){
       this.model_volumen= model_volumen;
       this.view_volumen= view_volumen;
       
       this.view_volumen.jbtn_calcCub.addActionListener(this);
       this.view_volumen.jbtn_calcPris.addActionListener(this);
       this.view_volumen.jbtn_CalcPira.addActionListener(this);
   }
    public void actionPerformed(ActionEvent e) {
    
        if(e.getSource()==view_volumen.jbtn_calcPris){
            jbtn_CalcPris_actionPerformed();
        }
   else if(e.getSource()==view_volumen.jbtn_calcCub){
            jbtn_calcCub_actionPerformed();
        }
   else if(e.getSource()==view_volumen.jbtn_CalcPira){
            jbtn_Piramide_actionPerformed();
        }
    }
    public void jbtn_calcCub_actionPerformed(){
     double num1= Double.parseDouble(this.view_volumen.jtx_areaLad.getText());
        this.model_volumen.setAreaLad(num1);
        this.view_volumen.jtx_volumenCub.setText(""+this.model_volumen.VolumenCubo()); 
    }
    public void jbtn_CalcPris_actionPerformed(){
     double num1= Double.parseDouble(this.view_volumen.jtx_alturaPris.getText());
        double num2 = Double.parseDouble(this.view_volumen.jtx_areabPris.getText());
        this.model_volumen.setAlturaPris(num1);
        this.model_volumen.setAreabPris(num2);
        this.view_volumen.jtx_volumenPris.setText(""+this.model_volumen.VolumenPrisma()); 
    }
    public void jbtn_Piramide_actionPerformed(){
     double num1= Double.parseDouble(this.view_volumen.jtx_alturaPira.getText());
        double num2 = Double.parseDouble(this.view_volumen.jtx_areaBasePira.getText());
        this.model_volumen.setAlturaPira(num1);
        this.model_volumen.setAreaBPira(num2);
        this.view_volumen.jtx_volumenPiramide.setText(""+this.model_volumen.VolumenPiramide()); 
    }
    
}

