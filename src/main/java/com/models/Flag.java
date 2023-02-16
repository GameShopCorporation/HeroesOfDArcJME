/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

import com.jme3.app.SimpleApplication;
import com.jme3.math.Vector3f;
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
        
        
    }
    
    
    
}
