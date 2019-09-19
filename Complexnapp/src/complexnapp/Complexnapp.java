/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnapp;

/**
 *
 * @author user
 */
public class Complexnapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      complexn cn1 = new complexn();
      complexn cn2 = new complexn(3.0,2.0);
      complexn cn3 = new complexn(1.0,1.0);
      complexn cn4 = new complexn (5.0,0.0);
      
      System.out.println(cn1.toString());
      System.out.println(cn2.toString());
      System.out.println(cn3.toString());
      System.out.println(cn4.toString());
      System.out.println();
      
      System.out.println("The imaginary coefficient of cn2 is "+ cn2.getImaginary());
      System.out.println("The real coefficient of cn2 is "+ cn2.getReal()+"\n");
      
      cn2.setReal(300.0);
      cn2.setImaginary(50.0);
      System.out.println(cn2.toString()+"\n");
      
      System.out.println(cn2+" multiplied by "+cn3+" is "+cn2.multiply(cn3)+"\n");
      
      System.out.println(cn2+" added to "+cn3+" is "+cn2.add(cn3));
      System.out.println(cn3+" subrtacted from "+cn4+" is "+cn3.subtract(cn4)+"\n");
      
      complexn cn5 = new complexn(7.0,-2.0);
      System.out.println(cn5.toString()+"\n");
      
      complexn cn6 = new complexn(8.0);
      System.out.println(cn6.toString()+"\n");
      
      complexn cn7 = new complexn (cn3);
      System.out.println(cn7.toString()+"\n");
      
      cn5.multEqual(cn2);
      System.out.println("cn5 *= cn2 changes cn5 to "+cn5); 
    }
    
}






        
