package com.cgvsu.triangulation;

import com.cgvsu.model.Model;
import com.cgvsu.model.ModelTriangulation;
import com.cgvsu.model.Polygon;
import com.cgvsu.objreader.ObjReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TriangulationTest {

    @Test
    public void triangulationPolygonTest(){
        List<Polygon> polygons = new ArrayList<Polygon>();
        Polygon polygon = new Polygon();
        polygon.setVertexIndices(new ArrayList<>(Arrays.asList(1, 2, 4, 3)));
        polygons.add(polygon);
        List<Polygon> polygonsTriangulation = Triangulation.triangulate(polygons);
        Assertions.assertEquals(polygonsTriangulation.size(), 2);
    }

    @Test
    public void triangulationPolygon2Test(){
        List<Polygon> polygons = new ArrayList<Polygon>();
        Polygon polygon = new Polygon();
        polygon.setVertexIndices(new ArrayList<>(Arrays.asList(1, 2, 4, 3, 5, 6)));
        polygons.add(polygon);
        List<Polygon> polygonsTriangulation = Triangulation.triangulate(polygons);
        Assertions.assertEquals(polygonsTriangulation.size(), 4);
    }

    @Test
    public void triangulationTriangleTest(){
        List<Polygon> polygons = new ArrayList<Polygon>();
        Polygon polygon = new Polygon();
        polygon.setVertexIndices(new ArrayList<>(Arrays.asList(1, 2, 3)));
        polygons.add(polygon);
        List<Polygon> polygonsTriangulation = Triangulation.triangulate(polygons);
        Assertions.assertEquals(polygonsTriangulation.size(), 1);
    }
}
