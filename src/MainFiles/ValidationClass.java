/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainFiles;

import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;
import MainFiles.ValidationClass;

/**
 *
 * @author Ekanayaketw
 */
public class ValidationClass {
    
    JTextComponent Textbox1;
    char TypeCheck1;


    public  boolean ValidationCheck(JTextComponent Textbox,boolean IsEmptyCheck,int LenghtCheck,char TypeCheck){
        Textbox1=Textbox;
        TypeCheck1=TypeCheck;
        //Check if it is empty 
        if(IsEmptyCheck){
         
            if(Textbox1.getText().equals("")){
                JOptionPane.showMessageDialog(null, Textbox1.getName()+" Empty textbox ", 
                        "InfoBox: " + "titleBar", JOptionPane.ERROR_MESSAGE);
            }
        
            else{  
                //Lenght checking
                if(LenghtCheck<0){
            
                    if(Textbox1.getText().length()>=Math.abs(LenghtCheck)){
                    JOptionPane.showMessageDialog(null, Textbox1.getName()+" = textbox lenth error;should be < "
                            + ""+Math.abs(LenghtCheck), "InfoBox: " + "titleBar",JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                    if(typecheck()){return true;}
                    }
                }
                else if (LenghtCheck>0){
                    if(Textbox1.getText().length()<=Math.abs(LenghtCheck)){
                    JOptionPane.showMessageDialog(null, Textbox1.getName()+" = textbox lenth error;should be > "
                            + ""+Math.abs(LenghtCheck), "InfoBox: " + "titleBar",JOptionPane.ERROR_MESSAGE);
                    }
                    else {
                   if(typecheck()){return true;}
                   
                    }
                }else {
                if(typecheck()){return true;}
                }
 
            }
    
        }
        else {
        return true;
        }

    return false;
        
    } 
    

  private boolean typecheck(){
        //Type check if it's a number
        if(Character.isDigit(TypeCheck1)){
            boolean l=false;
            String tem=Textbox1.getText();
            int count=0;
            while(count<tem.length()){
            if(Character.isDigit(tem.charAt(count))||Character.isWhitespace(tem.charAt(count))){
                // do nothing
                count++;
            }
            else{
                l=true;
                count++;
            }
            }
            if(l){
            JOptionPane.showMessageDialog(null, "type error- only digit= textbox "+Textbox1.getName(),
                    "InfoBox: " + "titleBar",JOptionPane.ERROR_MESSAGE);
            return false;
            }
        }
        
         //Type check if it's a letter
        else if(Character.isAlphabetic(TypeCheck1)){
             boolean l=false;
            String tem=Textbox1.getText();
            int count=0;
            while(count<tem.length()){
            if(Character.isAlphabetic(tem.charAt(count))||Character.isWhitespace(tem.charAt(count))){
                // do nothing
                count++;
            }
            else{
                l=true;
                count++;
            }
            }
            if(l){
            JOptionPane.showMessageDialog(null, "type error- only alphabetic= textbox "+Textbox1.getName(), 
                    "InfoBox: " + "titleBar",JOptionPane.ERROR_MESSAGE);
            return false;
            }
        }
        else {
        //do nothing 
        //accept any input 
        
        
        }
    return true;
  }
  
  // This method is used to validate Email address
   public boolean isValidEmailAddress(String email) {
           String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\."
                   + "[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+"
                   + "[a-zA-Z]{2,}))$";
           java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
           java.util.regex.Matcher m = p.matcher(email);
           return m.matches();
    }
}
    

