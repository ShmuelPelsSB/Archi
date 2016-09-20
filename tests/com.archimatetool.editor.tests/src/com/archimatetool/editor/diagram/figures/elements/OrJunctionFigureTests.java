/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.editor.diagram.figures.elements;

import com.archimatetool.model.IArchimateFactory;
import com.archimatetool.model.IDiagramModelArchimateObject;

import junit.framework.JUnit4TestAdapter;



public class OrJunctionFigureTests extends AndJunctionFigureTests {
    
    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(OrJunctionFigureTests.class);
    }
    
    @Override
    protected OrJunctionFigure createFigure() {
        // Add a DiagramModelObject
        IDiagramModelArchimateObject dmo = IArchimateFactory.eINSTANCE.createDiagramModelArchimateObject();
        dmo.setBounds(IArchimateFactory.eINSTANCE.createBounds());
        dmo.setArchimateElement(IArchimateFactory.eINSTANCE.createOrJunction());
        dm.getChildren().add(dmo);
        
        // Layout
        editor.layoutPendingUpdates();
        
        return (OrJunctionFigure)editor.findFigure(dmo);
    }

}