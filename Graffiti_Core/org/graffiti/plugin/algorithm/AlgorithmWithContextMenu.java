// =============================================================================
//
//   AlgorithmWithContextMenu.java
//
//   Copyright (c) 2001-2006 Gravisto Team, University of Passau
//
// =============================================================================
// $Id: AlgorithmWithContextMenu.java 5767 2010-05-07 18:42:02Z gleissner $

package org.graffiti.plugin.algorithm;

import javax.swing.JMenuItem;

/**
 * DOCUMENT ME!
 * 
 * @author $Author: gleissner $
 * @version $Revision: 5767 $
 */
public interface AlgorithmWithContextMenu {

    /**
     * This method should be implemented, as that it returns the desired
     * Context-MenuItem for the Plugin. It will be added on the fly to a newly
     * created context menu, when the user right-clicks an EditorFrame. The
     * plugin should implement the Interface <code>SelectionListener</code> if
     * the menu item should be variable to the current selection. You could also
     * return a MenuItem that contains a subMenu.
     * 
     * @return <code>MenuItem</code> the menu item for the context menu
     */
    public JMenuItem getCurrentContextMenuItem();
}

// -----------------------------------------------------------------------------
// end of file
// -----------------------------------------------------------------------------
