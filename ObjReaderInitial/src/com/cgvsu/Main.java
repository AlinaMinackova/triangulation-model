package com.cgvsu;

import com.cgvsu.triangulation.Triangulation;
import com.cgvsu.model.Model;
import com.cgvsu.model.ModelTriangulation;
import com.cgvsu.model.Polygon;
import com.cgvsu.objreader.ObjReader;
import com.cgvsu.objwriter.ObjWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        Path fileName = Path.of("3DModels/CaracalCube/square.obj");
        String fileContent = Files.readString(fileName);

        System.out.println("Loading model ...");
        ModelTriangulation modelTriangulation = new ModelTriangulation(ObjReader.read(fileContent));
        ObjWriter.write(modelTriangulation);
    }
}
