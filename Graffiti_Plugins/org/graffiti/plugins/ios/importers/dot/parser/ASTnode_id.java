/* Generated By:JJTree: Do not edit this line. ASTnode_id.java */

package org.graffiti.plugins.ios.importers.dot.parser;

public class ASTnode_id extends SimpleNode {
    public ASTnode_id(int id) {
        super(id);
    }

    public ASTnode_id(DOTParser p, int id) {
        super(p, id);
    }

    /** Accept the visitor. **/
    @Override
    public Object jjtAccept(DOTParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
