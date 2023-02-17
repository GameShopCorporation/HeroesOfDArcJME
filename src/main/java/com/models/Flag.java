/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

import com.jme3.app.SimpleApplication;
import com.jme3.math.ColorRGBA;
import com.poly.CurrencyMesh;
import com.poly.Poly;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author lyndenjayevans
 */
public class Flag extends CurrencyMesh {
    
    public Flag(SimpleApplication app){
        
        super(app);
        
        FlagPanel flagPanel = new FlagPanel(app);
        node.attachChild(flagPanel.node);
        
        boolean outer = true;
        
        for (int y = 0; y < 9; y++){
        
            for (int x = 0; x < 6; x++){
            
                if (outer || (!outer && x  < 5)){
                Star star = new Star(app);
                star.polys.get(0).geo.scale(.025f);
             
                node.attachChild(star.node);
                //  star.node.move(.2f, .2f, .1f);
//               // star.polys.get(0).updateRender();
//                star.polys.get(0).geo.move(star.node.getLocalTranslation());
//                
//                if (x == 0 && y == 0){
//                last = star.node.getLocalTranslation();
//                } else {
                
                    if (outer){
                         star.node.move((.7f * (x + 1)) -.5f, (.4f * (y + 1)) , .1f);
               // star.polys.get(0).updateRender();
                star.polys.get(0).geo.move(star.node.getLocalTranslation());
                    } else {
                        if(x < 5){
                     star.node.move((.7f * (x + 1)) -.15f, (.4f * (y + 1)), .1f);
               // star.polys.get(0).updateRender();
                star.polys.get(0).geo.move(star.node.getLocalTranslation());
                        }
                    }
                    
                }
            }
            outer = !outer;
        }
        
        
        boolean red = true;
        for (int i = 0; i < 13; i++){
        
            if (red){
            
                Stripe stripe = new Stripe(app, ColorRGBA.Red);
                node.attachChild(stripe.node);
                stripe.node.move(0, (-i * .5f) + 3.5f, -.1f);
                stripe.polys.get(0).geo.move(stripe.node.getLocalTranslation());
            } else {
            
                Stripe stripe = new Stripe(app, ColorRGBA.White);
                node.attachChild(stripe.node);
                stripe.node.move(0, (-i * .5f) + 3.5f, -.1f);
                stripe.polys.get(0).geo.move(stripe.node.getLocalTranslation());
            }
            red = !red;
        }
   //     Star star = new Star(app);
   //     node.attachChild(star.node);
       
        //star.polys.get(0).geo.scale(.1f);
        
    }
    
    
    
}
