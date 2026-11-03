package org.nimecraft;

import java.awt.*;
import java.util.Queue;

import com.jme3.asset.AssetManager;
import com.jme3.bounding.BoundingVolume;
import com.jme3.collision.Collidable;
import com.jme3.collision.CollisionResults;
import com.jme3.collision.UnsupportedCollisionException;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.SceneGraphVisitor;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;
public class Block extends Spatial {

     @Override
     public void updateModelBound(){

     }

     @Override
     public void setModelBound(BoundingVolume modelBound) {

     }

     @Override
     public int getVertexCount() {
          return 0;
     }

     @Override
     public int getTriangleCount() {
          return 0;
     }

     @Override
     public void depthFirstTraversal(SceneGraphVisitor visitor, DFSMode mode) {

     }

     @Override
     protected void breadthFirstTraversal(SceneGraphVisitor visitor, Queue<Spatial> queue) {

     }

     final  Dimension dimension = new Dimension(1,1);

     Block (AssetManager myManger){
          Box b = new Box(1,1,1);
          Geometry g = new Geometry("mine" , b);
            ;
          Material m = new Material(myManger, "Common/MatDefs/Misc/Unshaded.j3md");
          m.setColor("Color" , ColorRGBA.Red);
          g.setMaterial(m);


     }


     @Override
     public int collideWith(Collidable other, CollisionResults results) throws UnsupportedCollisionException {
          return 0;
     }
}
