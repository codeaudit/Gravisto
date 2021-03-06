//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Wed Jul 22 11:54:46 CEST 2009
//----------------------------------------------------

package org.graffiti.plugins.algorithms.chebyshev.iterations;

/**
 * CUP v0.10k generated parser.
 * 
 * @version Wed Jul 22 11:54:46 CEST 2009
 */
public class Parser extends java_cup.runtime.lr_parser {

    /** Default constructor. */
    public Parser() {
        super();
    }

    /** Constructor which sets the default scanner. */
    public Parser(java_cup.runtime.Scanner s) {
        super(s);
    }

    /** Production table. */
    protected static final short _production_table[][] = unpackFromStrings(new String[] { "\000\007\000\002\004\003\000\002\002\004\000\002\004"
            + "\004\000\002\003\003\000\002\003\005\000\002\003\005"
            + "\000\002\003\005" });

    /** Access to production table. */
    @Override
    public short[][] production_table() {
        return _production_table;
    }

    /** Parse-action table. */
    protected static final short[][] _action_table = unpackFromStrings(new String[] { "\000\016\000\010\004\010\007\004\010\005\001\002\000"
            + "\016\002\ufffe\004\ufffe\005\ufffe\006\ufffe\007\ufffe\010\ufffe"
            + "\001\002\000\004\006\017\001\002\000\016\002\001\004"
            + "\001\005\001\006\014\007\001\010\001\001\002\000\012"
            + "\002\016\004\010\007\004\010\005\001\002\000\010\004"
            + "\010\007\004\010\005\001\002\000\012\004\010\005\012"
            + "\007\004\010\005\001\002\000\016\002\ufffb\004\ufffb\005"
            + "\ufffb\006\ufffb\007\ufffb\010\ufffb\001\002\000\016\002\uffff"
            + "\004\uffff\005\uffff\006\014\007\uffff\010\uffff\001\002\000"
            + "\004\010\015\001\002\000\016\002\ufffc\004\ufffc\005\ufffc"
            + "\006\ufffc\007\ufffc\010\ufffc\001\002\000\004\002\000\001"
            + "\002\000\010\004\010\007\004\010\005\001\002\000\016"
            + "\002\ufffd\004\ufffd\005\ufffd\006\ufffd\007\ufffd\010\ufffd\001"
            + "\002" });

    /** Access to parse-action table. */
    @Override
    public short[][] action_table() {
        return _action_table;
    }

    /** <code>reduce_goto</code> table. */
    protected static final short[][] _reduce_table = unpackFromStrings(new String[] { "\000\016\000\006\003\005\004\006\001\001\000\002\001"
            + "\001\000\002\001\001\000\002\001\001\000\004\003\012"
            + "\001\001\000\006\003\005\004\010\001\001\000\004\003"
            + "\012\001\001\000\002\001\001\000\002\001\001\000\002"
            + "\001\001\000\002\001\001\000\002\001\001\000\004\003"
            + "\017\001\001\000\002\001\001" });

    /** Access to <code>reduce_goto</code> table. */
    @Override
    public short[][] reduce_table() {
        return _reduce_table;
    }

    /** Instance of action encapsulation class. */
    protected CUP$Parser$actions action_obj;

    /** Action encapsulation object initializer. */
    @Override
    protected void init_actions() {
        action_obj = new CUP$Parser$actions(this);
    }

    /** Invoke a user supplied parse action. */
    @Override
    @SuppressWarnings("unchecked")
    public java_cup.runtime.Symbol do_action(int act_num,
            java_cup.runtime.lr_parser parser, java.util.Stack stack, int top)
            throws java.lang.Exception {
        /* call code in generated class */
        return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
    }

    /** Indicates start state. */
    @Override
    public int start_state() {
        return 0;
    }

    /** Indicates start production. */
    @Override
    public int start_production() {
        return 1;
    }

    /** <code>EOF</code> Symbol index. */
    @Override
    public int EOF_sym() {
        return 0;
    }

    /** <code>error</code> Symbol index. */
    @Override
    public int error_sym() {
        return 1;
    }

}

/** Cup generated class to encapsulate user supplied action code. */
class CUP$Parser$actions {

    /** Constructor */
    CUP$Parser$actions(Parser parser) {
    }

    /** Method with the actual generated action code. */
    public final java_cup.runtime.Symbol CUP$Parser$do_action(
            int CUP$Parser$act_num,
            java_cup.runtime.lr_parser CUP$Parser$parser,
            java.util.Stack<?> CUP$Parser$stack, int CUP$Parser$top)
            throws java.lang.Exception {
        /* Symbol object for return from actions */
        java_cup.runtime.Symbol CUP$Parser$result;

        /* select the action based on the action number */
        switch (CUP$Parser$act_num) {
        /* . . . . . . . . . . . . . . . . . . . . */
        case 6: // unit ::= LPAREN list RPAREN
        {
            StepList RESULT = null;
            StepList a = (StepList) ((java_cup.runtime.Symbol) CUP$Parser$stack
                    .elementAt(CUP$Parser$top - 1)).value;
            RESULT = a;
            CUP$Parser$result = new java_cup.runtime.Symbol(1/* unit */,
                    ((java_cup.runtime.Symbol) CUP$Parser$stack
                            .elementAt(CUP$Parser$top - 2)).left,
                    ((java_cup.runtime.Symbol) CUP$Parser$stack
                            .elementAt(CUP$Parser$top - 0)).right, RESULT);
        }
            return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
        case 5: // unit ::= unit TIMES NUMBER
        {
            StepList RESULT = null;
            StepList a = (StepList) ((java_cup.runtime.Symbol) CUP$Parser$stack
                    .elementAt(CUP$Parser$top - 2)).value;
            Integer n = (Integer) ((java_cup.runtime.Symbol) CUP$Parser$stack
                    .elementAt(CUP$Parser$top - 0)).value;
            RESULT = new StepList();
            for (int i = 0; i < n; i++) {
                RESULT.addAll(a);
            }
            CUP$Parser$result = new java_cup.runtime.Symbol(1/* unit */,
                    ((java_cup.runtime.Symbol) CUP$Parser$stack
                            .elementAt(CUP$Parser$top - 2)).left,
                    ((java_cup.runtime.Symbol) CUP$Parser$stack
                            .elementAt(CUP$Parser$top - 0)).right, RESULT);
        }
            return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
        case 4: // unit ::= NUMBER TIMES unit
        {
            StepList RESULT = null;
            Integer n = (Integer) ((java_cup.runtime.Symbol) CUP$Parser$stack
                    .elementAt(CUP$Parser$top - 2)).value;
            StepList a = (StepList) ((java_cup.runtime.Symbol) CUP$Parser$stack
                    .elementAt(CUP$Parser$top - 0)).value;
            RESULT = new StepList();
            for (int i = 0; i < n; i++) {
                RESULT.addAll(a);
            }
            CUP$Parser$result = new java_cup.runtime.Symbol(1/* unit */,
                    ((java_cup.runtime.Symbol) CUP$Parser$stack
                            .elementAt(CUP$Parser$top - 2)).left,
                    ((java_cup.runtime.Symbol) CUP$Parser$stack
                            .elementAt(CUP$Parser$top - 0)).right, RESULT);
        }
            return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
        case 3: // unit ::= ID
        {
            StepList RESULT = null;
            String a = (String) ((java_cup.runtime.Symbol) CUP$Parser$stack
                    .elementAt(CUP$Parser$top - 0)).value;
            RESULT = IterationParser.create(a);
            CUP$Parser$result = new java_cup.runtime.Symbol(1/* unit */,
                    ((java_cup.runtime.Symbol) CUP$Parser$stack
                            .elementAt(CUP$Parser$top - 0)).left,
                    ((java_cup.runtime.Symbol) CUP$Parser$stack
                            .elementAt(CUP$Parser$top - 0)).right, RESULT);
        }
            return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
        case 2: // list ::= list unit
        {
            StepList RESULT = null;
            StepList a = (StepList) ((java_cup.runtime.Symbol) CUP$Parser$stack
                    .elementAt(CUP$Parser$top - 1)).value;
            StepList b = (StepList) ((java_cup.runtime.Symbol) CUP$Parser$stack
                    .elementAt(CUP$Parser$top - 0)).value;
            RESULT = a;
            RESULT.addAll(b);
            CUP$Parser$result = new java_cup.runtime.Symbol(2/* list */,
                    ((java_cup.runtime.Symbol) CUP$Parser$stack
                            .elementAt(CUP$Parser$top - 1)).left,
                    ((java_cup.runtime.Symbol) CUP$Parser$stack
                            .elementAt(CUP$Parser$top - 0)).right, RESULT);
        }
            return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
        case 1: // $START ::= list EOF
        {
            Object RESULT = null;
            StepList start_val = (StepList) ((java_cup.runtime.Symbol) CUP$Parser$stack
                    .elementAt(CUP$Parser$top - 1)).value;
            RESULT = start_val;
            CUP$Parser$result = new java_cup.runtime.Symbol(0/* $START */,
                    ((java_cup.runtime.Symbol) CUP$Parser$stack
                            .elementAt(CUP$Parser$top - 1)).left,
                    ((java_cup.runtime.Symbol) CUP$Parser$stack
                            .elementAt(CUP$Parser$top - 0)).right, RESULT);
        }
            /* ACCEPT */
            CUP$Parser$parser.done_parsing();
            return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
        case 0: // list ::= unit
        {
            StepList RESULT = null;
            StepList a = (StepList) ((java_cup.runtime.Symbol) CUP$Parser$stack
                    .elementAt(CUP$Parser$top - 0)).value;
            RESULT = a;
            CUP$Parser$result = new java_cup.runtime.Symbol(2/* list */,
                    ((java_cup.runtime.Symbol) CUP$Parser$stack
                            .elementAt(CUP$Parser$top - 0)).left,
                    ((java_cup.runtime.Symbol) CUP$Parser$stack
                            .elementAt(CUP$Parser$top - 0)).right, RESULT);
        }
            return CUP$Parser$result;

            /* . . . . . . */
        default:
            throw new Exception(
                    "Invalid action number found in internal parse table");

        }
    }
}
