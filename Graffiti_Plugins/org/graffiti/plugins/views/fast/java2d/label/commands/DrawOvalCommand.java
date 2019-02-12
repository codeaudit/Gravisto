// =============================================================================
//
//   DrawOvalCommand.java
//
//   Copyright (c) 2001-2007, Gravisto Team, University of Passau
//
// =============================================================================
// $Id$

package org.graffiti.plugins.views.fast.java2d.label.commands;

/**
 * @author Andreas Glei&szlig;ner
 * @version $Revision$ $Date$
 */
public class DrawOvalCommand extends Java2DLabelCommand {
    private int x;
    private int y;
    private int width;
    private int height;

    public DrawOvalCommand(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void execute(CommandContext commandContext) {
        commandContext.graphics.drawOval(x, y, width, height);
    }
}

// -----------------------------------------------------------------------------
// end of file
// -----------------------------------------------------------------------------
