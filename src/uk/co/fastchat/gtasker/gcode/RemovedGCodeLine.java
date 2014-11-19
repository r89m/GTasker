package uk.co.fastchat.gtasker.gcode;

/**
 * Created by Richard on 13/11/2014.
 */
public class RemovedGCodeLine extends ProcessedGCodeLine {

    public RemovedGCodeLine(){

        lineAction = LineAction.REMOVED;
    }
}
