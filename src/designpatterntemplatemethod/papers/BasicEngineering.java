/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterntemplatemethod.papers;

/**
 *
 * @author rocket
 */
public abstract class BasicEngineering {
    
    public void papers(){
        math();
        softSkills();
        specialPaper();
    }
    
    // already implemented by Template class
    private void math(){
        System.out.println("Mathematics");
    }
    
    // already implemented by Template class
    private void softSkills(){
        System.out.println("Soft Skills");
    }
    
    //abstract method must be implemented by the derived class
    public abstract void specialPaper();

   
}
