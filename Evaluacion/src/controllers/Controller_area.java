package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Model_area;
import views.View_area;

public class Controller_area implements ActionListener {

   Model_area model_area;
   View_area view_area;
    
   
   public Controller_area(View_area view_area,Model_area model_area){
       this.model_area= model_area;
       this.view_area= view_area;
       
       this.view_area.jbtn_calcCub.addActionListener(this);
       this.view_area.jbtn_calcPris.addActionListener(this);
       this.view_area.jbtn_CalcPira.addActionListener(this);
   }
    public void actionPerformed(ActionEvent e) {
    
        if(e.getSource()==view_area.jbtn_calcPris){
            jbtn_CalcPris_actionPerformed();
        }
   else if(e.getSource()==view_area.jbtn_calcCub){
            jbtn_calcCub_actionPerformed();
        }
   else if(e.getSource()==view_area.jbtn_CalcPira){
            jbtn_Piramide_actionPerformed();
        }
    }
    public void jbtn_calcCub_actionPerformed(){
     double num1= Double.parseDouble(this.view_area.jtx_areaCuad.getText());
        this.model_area.setAreaAlCuadrado(num1);
        this.view_area.jtx_areaCub.setText(""+this.model_area.AreaCubo()); 
    }
    public void jbtn_CalcPris_actionPerformed(){
     double num1= Double.parseDouble(this.view_area.jtx_alturaPris.getText());
        double num2 = Double.parseDouble(this.view_area.jtx_areabPris.getText());
        double num3 = Double.parseDouble(this.view_area.jtx_perimbPris.getText());
        this.model_area.setAltura(num1);
        this.model_area.setAreaBase(num2);
        this.model_area.setPerimBase(num3);
        this.view_area.jtx_areaPris.setText(""+this.model_area.AreaPrisma()); 
    }
    public void jbtn_Piramide_actionPerformed(){
     double num1= Double.parseDouble(this.view_area.jtx_perimBase.getText());
        double num2 = Double.parseDouble(this.view_area.jtx_aplat.getText());
        double num3 = Double.parseDouble(this.view_area.jtx_areabas.getText());
        this.model_area.setPerimBasePira(num1);
        this.model_area.setAplat(num2);
        this.model_area.setAreaBasePira(num3);
        this.view_area.jtx_areaPiramide.setText(""+this.model_area.AreaPiramide()); 
    }
    
}
