/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly;

import com.jme3.math.Vector3f;
import java.util.ArrayList;

/**
 *
 * @author lyndenjayevans
 */
public class LinePathing {
    
    public ArrayList<Vector3f> lines;
    
    public enum Mode {STRICT, CURVE};
    
    public Mode mode;
    
    public int iterations;
    
    public LinePathing(int iterations){
    
        this.lines = new ArrayList<Vector3f>();
        this.mode = Mode.CURVE;
        this.iterations = iterations;
        
        lines.add(new Vector3f(0,0,0));
        lines.add(new Vector3f(0,1,0));
        lines.add(new Vector3f(1,1,0));
        lines.add(new Vector3f(1,0,0));
        
        for(Vector3f line: lines){
        
            System.out.println(line.toString());
        }
        System.out.println("start");
        
        for (int i = 0; i <= iterations; i++){
        
            
        }
        
    }
    
    
}
