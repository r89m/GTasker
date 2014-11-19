package uk.co.fastchat.gtasker.gcode;

import java.util.ArrayList;

/**
 * Created by Richard on 13/11/2014.
 */
public class GCodeFile {

    private String filename;
    private ArrayList<GCodeLine> lines = new ArrayList<GCodeLine>();

    public void open(){

    }

    public void save(){

        saveAs(filename);
    }

    public void saveAs(String filename){

    }

    public void setFilename(String filename){

        this.filename = filename;
    }
}
