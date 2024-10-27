package com.cgvsu.model;

import com.cgvsu.math.Vector2f;
import com.cgvsu.math.Vector3f;
import com.cgvsu.triangulation.Triangulation;

import java.util.ArrayList;

public class ModelTriangulation extends Model {

    public ModelTriangulation(Model model) {
        this.vertices = model.vertices;
        this.textureVertices = model.textureVertices;
        this.normals = model.normals;
        this.polygons = (ArrayList<Polygon>) Triangulation.triangulation(model.polygons);
    }
}
