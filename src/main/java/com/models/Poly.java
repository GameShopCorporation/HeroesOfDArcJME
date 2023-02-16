/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.Node;
import com.jme3.scene.VertexBuffer.Type;
import com.jme3.util.BufferUtils;
import java.util.ArrayList;
import java.util.function.ToDoubleFunction;

/**
 *
 * @author lyndenjayevans
 */
public class Poly {
   
    public ArrayList<Vector3f> vertices;
    public ArrayList<Vector2f> texCoord;
    public ArrayList<Integer> indexes;
    public Mesh mesh ;
    public Node node ;
    
    public Poly(SimpleApplication app, ArrayList<Vector3f> vertices, ArrayList<Vector2f> texCoord, ArrayList<Integer> indexes){
    
        
 mesh = new Mesh();

 node = new Node("node");

 
 this.vertices = new ArrayList<Vector3f>() ;
     this.texCoord = new ArrayList<Vector2f>();
     this.indexes = new ArrayList<Integer>();
    
 this.vertices = vertices;
 this.texCoord = texCoord;
 this.indexes = indexes;
 


updateRender();


Geometry geo = new Geometry("OurMesh", mesh); // using our custom mesh object
Material mat = new Material(app.getAssetManager(),
    "Common/MatDefs/Misc/Unshaded.j3md");
mat.setColor("Color", ColorRGBA.Blue);
geo.setMaterial(mat);
node.attachChild(geo);
app.getRootNode().attachChild(node);
    }
    
    public void updateRender(){
        
        Vector3f arr[] = new Vector3f[vertices.size()];
        
        arr = vertices.toArray(arr);
        
        Vector2f arr1[] = new Vector2f[texCoord.size()];
        
        arr1 = texCoord.toArray(arr1);
        
        
        
       
        
        mesh.setBuffer(Type.Position, 3, BufferUtils.createFloatBuffer(arr));
mesh.setBuffer(Type.TexCoord, 2, BufferUtils.createFloatBuffer(arr1));
mesh.setBuffer(Type.Index,    3, BufferUtils.createIntBuffer(indexes.stream().mapToInt(Integer::intValue).toArray()));

mesh.updateBound();
    }
}
