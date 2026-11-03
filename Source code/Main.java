// Study philosophy of design called ECS

package org.nimecraft;

import com.jme3.app.SimpleApplication;
import com.jme3.asset.AssetManager;
import com.jme3.light.AmbientLight;
import com.jme3.light.DirectionalLight;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Node;
import com.jme3.scene.debug.WireBox;
import com.jme3.scene.shape.Sphere;
import com.jme3.system.AppSettings;

import java.math.BigInteger;


public class Main extends SimpleApplication {
    @Override
    public void simpleInitApp() {

//       UI starterMenu = new UI (this);
//
//       starterMenu.loadStarterUI();

        Block redblock = new Block(assetManager);

//        rootNode.attachChild(redblock.g);










    }


    public static void main(String[] args)
    {
        {

            Main Nimecraft = new Main();

            AppSettings settings = new AppSettings(true);
            settings.setResolution(1280,720);
            settings.setTitle("My first game ever");
            Nimecraft.setSettings(settings);
            Nimecraft.setShowSettings(true);





            Nimecraft.start();









        }
    }








}










