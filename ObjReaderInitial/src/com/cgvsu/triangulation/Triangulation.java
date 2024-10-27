package com.cgvsu.triangulation;

import com.cgvsu.model.Polygon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangulation {

    public static List<Polygon> triangulation(List<Polygon> polygons) {
        List<Polygon> polygonsTriangulation = new ArrayList<>();
        Polygon polygonNew;
        for (Polygon polygon : polygons) {
            for (int shift = 1; shift < polygon.getVertexIndices().size() - 1; shift++) {
                polygonNew = new Polygon();
                ArrayList<Integer> vertexIndices = new ArrayList<>(Arrays.asList(
                        polygon.getVertexIndices().get(0),
                        polygon.getVertexIndices().get(shift),
                        polygon.getVertexIndices().get(shift + 1)
                ));
                polygonNew.setVertexIndices(vertexIndices);
                if (!polygon.getTextureVertexIndices().isEmpty()) {
                    ArrayList<Integer> textureVertexIndices = new ArrayList<>(Arrays.asList(
                            polygon.getTextureVertexIndices().get(0),
                            polygon.getTextureVertexIndices().get(shift),
                            polygon.getTextureVertexIndices().get(shift + 1)
                    ));
                    polygonNew.setTextureVertexIndices(textureVertexIndices);
                }
                if (!polygon.getNormalIndices().isEmpty()) {
                    ArrayList<Integer> normalIndices = new ArrayList<>(Arrays.asList(
                            polygon.getNormalIndices().get(0),
                            polygon.getNormalIndices().get(shift),
                            polygon.getNormalIndices().get(shift + 1)
                    ));
                    polygonNew.setNormalIndices(normalIndices);
                }
                polygonsTriangulation.add(polygonNew);
            }
        }
        return polygonsTriangulation;
    }
}
