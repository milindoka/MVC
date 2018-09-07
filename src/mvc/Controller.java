package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private Model model;
    private View view;
    private ActionListener actionListener;
    
    public Controller(){
    	
    	model=new Model(); view=new View();
        
       // String path;
	     System.out.println(model.getJarPath()); ///set JAR path in model variable path;
    }
    
    public void contol()
    {        
        actionListener = new ActionListener()
        {
              public void actionPerformed(ActionEvent actionEvent) {                  
                  linkBtnAndLabel();
              }
        };                
        view.getButton().addActionListener(actionListener);   
    }
    
    private void linkBtnAndLabel()
    {
        model.incX();
        int number=model.getX();
        view.setText(String.format("%02d", number));
       
    }    
}