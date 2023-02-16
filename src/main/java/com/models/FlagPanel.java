/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

import com.jme3.app.SimpleApplication;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.poly.CurrencyMesh;
import com.poly.Poly;
import java.util.ArrayList;

/**
 *
 * @author lyndenjayevans
 */
public class FlagPanel extends CurrencyMesh {
    
    public FlagPanel(SimpleApplication app) {
        super(app);
        
        
        this.vertices.clear();
        
        vertices.add(new ArrayList<Vector3f>());
        
       vertices.get(0).add(new Vector3f(0,0,0));
       vertices.get(0).add(new Vector3f(4,0,0));
       vertices.get(0).add(new Vector3f(0,4,0));
       vertices.get(0).add(new Vector3f(4,4,0));
       
       polys.add(new Poly(app, vertices.get(0), texCoord, indexes, ColorRGBA.fromRGBA255(0, 0, 128, 0)));
    }
    
     
}
