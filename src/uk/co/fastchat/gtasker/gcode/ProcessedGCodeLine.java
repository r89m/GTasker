package uk.co.fastchat.gtasker.gcode;

/**
 * Created by Richard on 13/11/2014.
 */
public class ProcessedGCodeLine extends GCodeLine {

    public static enum LineAction {NO_CHANGE, ADDED, EDITED, REMOVED};



    protected LineAction lineAction;

    public LineAction getLineAction(){

        return lineAction;
    }
}
