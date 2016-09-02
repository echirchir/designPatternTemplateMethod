/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterntemplatemethod;

import designpatterntemplatemethod.papers.BasicEngineering;
import designpatterntemplatemethod.papers.ComputerScience;
import designpatterntemplatemethod.papers.Electronics;

public class DesignPatternTemplateMethod {

    public static void main(String[] args) {
        
        System.out.println("Template Method design pattern demo");
        
        BasicEngineering be = new ComputerScience();
        
        System.out.println("Computer Science Papers: ");
        
        be.papers();
        
        System.out.println("");
        
        be = new Electronics();
        
        System.out.println("Electronics Papers: ");
        
        be.papers();
    }
    
}
