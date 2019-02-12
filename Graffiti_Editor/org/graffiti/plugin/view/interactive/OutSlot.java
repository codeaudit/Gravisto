// =============================================================================
//
//   OutSlot.java
//
//   Copyright (c) 2001-2008, Gravisto Team, University of Passau
//
// =============================================================================
// $Id$

package org.graffiti.plugin.view.interactive;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * {@code OutSlot} is annotated to slots to indicate that they are used as
 * output slots.
 * 
 * @author Andreas Glei&szlig;ner
 * @version $Revision$ $Date$
 * @see Slot
 */
@Documented
@Target( { ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface OutSlot {
}

// -----------------------------------------------------------------------------
// end of file
// -----------------------------------------------------------------------------
