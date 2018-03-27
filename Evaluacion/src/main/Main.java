package main;

import models.*;
import views.*;
import controllers.*;
public class Main {

   
    public static void main(String[] args) {
        Model_area model_area = new Model_area();
        Model_volumen model_volumen = new Model_volumen();
   
        View_main view_main = new View_main();
        View_area view_area = new View_area();
        View_volumen view_volumen = new View_volumen();
       
        
        Controller_area controller_area = new Controller_area(view_area, model_area);
        Controller_volumen controller_volumen = new Controller_volumen(view_volumen, model_volumen);
        Controller_main controller_main = new Controller_main(view_main, view_area, view_volumen);
        }
    
    
}