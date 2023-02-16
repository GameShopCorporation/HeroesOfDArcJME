package com.mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.Node;
import com.jme3.scene.VertexBuffer.Type;
import com.jme3.scene.shape.Box;
import com.jme3.system.AppSettings;
import com.jme3.util.BufferUtils;

/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 * @author normenhansen
 */
public class Main extends SimpleApplication {

    public static void main(String[] args) {
        Main app = new Main();
        AppSettings settings = new AppSettings(true);
        settings.setResolution(1920,1080);
        settings.setFullscreen(false);
        app.setSettings(settings);
        app.start();
    }

    @Override
    public void simpleInitApp() {
//        Box b = new Box(1, 1, 1);
//        Geometry geom = new Geometry("Box", b);
//
//        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
//        mat.setColor("Color", ColorRGBA.Blue);
//        geom.setMaterial(mat);
//
//        rootNode.attachChild(geom);

Mesh mesh = new Mesh();

Node node = new Node("node");

Vector3f [] vertices = new Vector3f[4];
vertices[0] = new Vector3f(0,0,0);
vertices[1] = new Vector3f(3,0,0);
vertices[2] = new Vector3f(0,3,0);
vertices[3] = new Vector3f(3,3,0);

Vector2f[] texCoord = new Vector2f[4];
texCoord[0] = new Vector2f(0,0);
texCoord[1] = new Vector2f(1,0);
texCoord[2] = new Vector2f(0,1);
texCoord[3] = new Vector2f(1,1);

int [] indexes = { 2,0,1, 1,3,2 };

mesh.setBuffer(Type.Position, 3, BufferUtils.createFloatBuffer(vertices));
mesh.setBuffer(Type.TexCoord, 2, BufferUtils.createFloatBuffer(texCoord));
mesh.setBuffer(Type.Index,    3, BufferUtils.createIntBuffer(indexes));
mesh.updateBound();

Geometry geo = new Geometry("OurMesh", mesh); // using our custom mesh object
Material mat = new Material(assetManager,
    "Common/MatDefs/Misc/Unshaded.j3md");
mat.setColor("Color", ColorRGBA.Blue);
geo.setMaterial(mat);
node.attachChild(geo);
rootNode.attachChild(node);

Mesh mesh1 = new Mesh();

Node node1 = new Node("node1");

Vector3f [] vertices1 = new Vector3f[4];
vertices1[0] = new Vector3f(0,0,0);
vertices1[1] = new Vector3f(1,0,0);
vertices1[2] = new Vector3f(0,1,0);
vertices1[3] = new Vector3f(1,1,0);

Vector2f[] texCoord1 = new Vector2f[4];
texCoord1[0] = new Vector2f(0,0);
texCoord1[1] = new Vector2f(1,0);
texCoord1[2] = new Vector2f(0,1);
texCoord1[3] = new Vector2f(1,1);

int [] indexes1 = { 2,0,1, 1,3,2 };

mesh1.setBuffer(Type.Position, 3, BufferUtils.createFloatBuffer(vertices1));
mesh1.setBuffer(Type.TexCoord, 2, BufferUtils.createFloatBuffer(texCoord1));
mesh1.setBuffer(Type.Index,    3, BufferUtils.createIntBuffer(indexes1));
mesh1.updateBound();

Geometry geo1 = new Geometry("OurMesh", mesh1); // using our custom mesh object
Material mat1 = new Material(assetManager,
    "Common/MatDefs/Misc/Unshaded.j3md");
mat1.setColor("Color", ColorRGBA.Red);
geo1.setMaterial(mat1);
geo1.move(0, 0, 0.01f);

node.attachChild(geo1);





    }


    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}

