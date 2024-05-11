// $ANTLR 3.4 C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g 2024-05-11 23:52:37

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ArithmeticExpressionsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AndOr", "Args", "Assigment", "BOOLEAN", "COMMENT", "Class", "ClassDec", "Condition", "Conditions", "DNUM", "DOUBLE", "Decl", "Dot", "Double_dec", "Factor", "Forloop", "Fun", "GeneralArithExpr", "INT", "Ifstmt", "Ifstmt_2", "Initialize", "Initialize_1", "Int_dec", "ML_COMMENT", "Main", "Main_METHOD", "Method", "Modifier", "NUM", "New", "Out", "Print", "Println", "RelationalOperators", "SEMICOLON", "SL_COMMENT", "STRING", "Start", "StartgeneralArithExpr", "Static", "String_Dec", "Strings", "Sys_print", "System", "TYPE", "Term", "VAR", "VOID", "Whilestmt", "WhiteSpace", "'!'", "'('", "')'", "'*'", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'/'", "'<'", "'='", "'>'", "'['", "']'", "'a'", "'else'", "'for'", "'if'", "'return'", "'while'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int AndOr=4;
    public static final int Args=5;
    public static final int Assigment=6;
    public static final int BOOLEAN=7;
    public static final int COMMENT=8;
    public static final int Class=9;
    public static final int ClassDec=10;
    public static final int Condition=11;
    public static final int Conditions=12;
    public static final int DNUM=13;
    public static final int DOUBLE=14;
    public static final int Decl=15;
    public static final int Dot=16;
    public static final int Double_dec=17;
    public static final int Factor=18;
    public static final int Forloop=19;
    public static final int Fun=20;
    public static final int GeneralArithExpr=21;
    public static final int INT=22;
    public static final int Ifstmt=23;
    public static final int Ifstmt_2=24;
    public static final int Initialize=25;
    public static final int Initialize_1=26;
    public static final int Int_dec=27;
    public static final int ML_COMMENT=28;
    public static final int Main=29;
    public static final int Main_METHOD=30;
    public static final int Method=31;
    public static final int Modifier=32;
    public static final int NUM=33;
    public static final int New=34;
    public static final int Out=35;
    public static final int Print=36;
    public static final int Println=37;
    public static final int RelationalOperators=38;
    public static final int SEMICOLON=39;
    public static final int SL_COMMENT=40;
    public static final int STRING=41;
    public static final int Start=42;
    public static final int StartgeneralArithExpr=43;
    public static final int Static=44;
    public static final int String_Dec=45;
    public static final int Strings=46;
    public static final int Sys_print=47;
    public static final int System=48;
    public static final int TYPE=49;
    public static final int Term=50;
    public static final int VAR=51;
    public static final int VOID=52;
    public static final int Whilestmt=53;
    public static final int WhiteSpace=54;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ArithmeticExpressionsParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ArithmeticExpressionsParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ArithmeticExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g"; }


    String s="";


    public static class startgeneralArithExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "startgeneralArithExpr"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:39:1: startgeneralArithExpr : ( classDec )* -> ^( Start ( classDec )* ) ;
    public final ArithmeticExpressionsParser.startgeneralArithExpr_return startgeneralArithExpr() throws RecognitionException {
        ArithmeticExpressionsParser.startgeneralArithExpr_return retval = new ArithmeticExpressionsParser.startgeneralArithExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.classDec_return classDec1 =null;


        RewriteRuleSubtreeStream stream_classDec=new RewriteRuleSubtreeStream(adaptor,"rule classDec");
        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:39:23: ( ( classDec )* -> ^( Start ( classDec )* ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:39:25: ( classDec )*
            {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:39:25: ( classDec )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Class||LA1_0==Modifier) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:39:25: classDec
            	    {
            	    pushFollow(FOLLOW_classDec_in_startgeneralArithExpr106);
            	    classDec1=classDec();

            	    state._fsp--;

            	    stream_classDec.add(classDec1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // AST REWRITE
            // elements: classDec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 39:35: -> ^( Start ( classDec )* )
            {
                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:39:38: ^( Start ( classDec )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Start, "Start")
                , root_1);

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:39:46: ( classDec )*
                while ( stream_classDec.hasNext() ) {
                    adaptor.addChild(root_1, stream_classDec.nextTree());

                }
                stream_classDec.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "startgeneralArithExpr"


    public static class classDec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDec"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:48:1: classDec : ( Modifier )? Class ( VAR )* '{' ( stmt )* '}' -> ^( ClassDec ( Modifier )? Class VAR '{' ( stmt )* '}' ) ;
    public final ArithmeticExpressionsParser.classDec_return classDec() throws RecognitionException {
        ArithmeticExpressionsParser.classDec_return retval = new ArithmeticExpressionsParser.classDec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier2=null;
        Token Class3=null;
        Token VAR4=null;
        Token char_literal5=null;
        Token char_literal7=null;
        ArithmeticExpressionsParser.stmt_return stmt6 =null;


        Object Modifier2_tree=null;
        Object Class3_tree=null;
        Object VAR4_tree=null;
        Object char_literal5_tree=null;
        Object char_literal7_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_Class=new RewriteRuleTokenStream(adaptor,"token Class");
        RewriteRuleTokenStream stream_Modifier=new RewriteRuleTokenStream(adaptor,"token Modifier");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:48:9: ( ( Modifier )? Class ( VAR )* '{' ( stmt )* '}' -> ^( ClassDec ( Modifier )? Class VAR '{' ( stmt )* '}' ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:48:11: ( Modifier )? Class ( VAR )* '{' ( stmt )* '}'
            {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:48:11: ( Modifier )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Modifier) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:48:11: Modifier
                    {
                    Modifier2=(Token)match(input,Modifier,FOLLOW_Modifier_in_classDec151);  
                    stream_Modifier.add(Modifier2);


                    }
                    break;

            }


            Class3=(Token)match(input,Class,FOLLOW_Class_in_classDec154);  
            stream_Class.add(Class3);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:48:27: ( VAR )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==VAR) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:48:27: VAR
            	    {
            	    VAR4=(Token)match(input,VAR,FOLLOW_VAR_in_classDec156);  
            	    stream_VAR.add(VAR4);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            char_literal5=(Token)match(input,78,FOLLOW_78_in_classDec159);  
            stream_78.add(char_literal5);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:48:36: ( stmt )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==BOOLEAN||LA4_0==DOUBLE||LA4_0==INT||LA4_0==Modifier||LA4_0==SEMICOLON||LA4_0==STRING||LA4_0==System||LA4_0==VAR||(LA4_0 >= 74 && LA4_0 <= 75)||LA4_0==77) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:48:36: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_classDec161);
            	    stmt6=stmt();

            	    state._fsp--;

            	    stream_stmt.add(stmt6.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            char_literal7=(Token)match(input,79,FOLLOW_79_in_classDec164);  
            stream_79.add(char_literal7);


            // AST REWRITE
            // elements: VAR, 79, Modifier, stmt, Class, 78
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 48:46: -> ^( ClassDec ( Modifier )? Class VAR '{' ( stmt )* '}' )
            {
                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:48:48: ^( ClassDec ( Modifier )? Class VAR '{' ( stmt )* '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ClassDec, "ClassDec")
                , root_1);

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:48:59: ( Modifier )?
                if ( stream_Modifier.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_Modifier.nextNode()
                    );

                }
                stream_Modifier.reset();

                adaptor.addChild(root_1, 
                stream_Class.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_VAR.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_78.nextNode()
                );

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:48:83: ( stmt )*
                while ( stream_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmt.nextTree());

                }
                stream_stmt.reset();

                adaptor.addChild(root_1, 
                stream_79.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classDec"


    public static class stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:55:1: stmt : ( decl -> ^( Decl decl ) | main_method -> ^( Main_METHOD main_method ) | ifstmt -> ^( Ifstmt ifstmt ) | whilestmt -> ^( Whilestmt whilestmt ) | forloop -> ^( Forloop forloop ) | assigment -> ^( Assigment assigment ) | method -> ^( Method method ) | string_dec -> ^( String_Dec string_dec ) | initialize -> ^( Initialize initialize ) | initialize_1 -> ^( Initialize_1 initialize_1 ) | sys_print -> ^( Sys_print sys_print ) ) ;
    public final ArithmeticExpressionsParser.stmt_return stmt() throws RecognitionException {
        ArithmeticExpressionsParser.stmt_return retval = new ArithmeticExpressionsParser.stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.decl_return decl8 =null;

        ArithmeticExpressionsParser.main_method_return main_method9 =null;

        ArithmeticExpressionsParser.ifstmt_return ifstmt10 =null;

        ArithmeticExpressionsParser.whilestmt_return whilestmt11 =null;

        ArithmeticExpressionsParser.forloop_return forloop12 =null;

        ArithmeticExpressionsParser.assigment_return assigment13 =null;

        ArithmeticExpressionsParser.method_return method14 =null;

        ArithmeticExpressionsParser.string_dec_return string_dec15 =null;

        ArithmeticExpressionsParser.initialize_return initialize16 =null;

        ArithmeticExpressionsParser.initialize_1_return initialize_117 =null;

        ArithmeticExpressionsParser.sys_print_return sys_print18 =null;


        RewriteRuleSubtreeStream stream_assigment=new RewriteRuleSubtreeStream(adaptor,"rule assigment");
        RewriteRuleSubtreeStream stream_whilestmt=new RewriteRuleSubtreeStream(adaptor,"rule whilestmt");
        RewriteRuleSubtreeStream stream_forloop=new RewriteRuleSubtreeStream(adaptor,"rule forloop");
        RewriteRuleSubtreeStream stream_decl=new RewriteRuleSubtreeStream(adaptor,"rule decl");
        RewriteRuleSubtreeStream stream_method=new RewriteRuleSubtreeStream(adaptor,"rule method");
        RewriteRuleSubtreeStream stream_ifstmt=new RewriteRuleSubtreeStream(adaptor,"rule ifstmt");
        RewriteRuleSubtreeStream stream_string_dec=new RewriteRuleSubtreeStream(adaptor,"rule string_dec");
        RewriteRuleSubtreeStream stream_initialize_1=new RewriteRuleSubtreeStream(adaptor,"rule initialize_1");
        RewriteRuleSubtreeStream stream_main_method=new RewriteRuleSubtreeStream(adaptor,"rule main_method");
        RewriteRuleSubtreeStream stream_initialize=new RewriteRuleSubtreeStream(adaptor,"rule initialize");
        RewriteRuleSubtreeStream stream_sys_print=new RewriteRuleSubtreeStream(adaptor,"rule sys_print");
        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:55:9: ( ( decl -> ^( Decl decl ) | main_method -> ^( Main_METHOD main_method ) | ifstmt -> ^( Ifstmt ifstmt ) | whilestmt -> ^( Whilestmt whilestmt ) | forloop -> ^( Forloop forloop ) | assigment -> ^( Assigment assigment ) | method -> ^( Method method ) | string_dec -> ^( String_Dec string_dec ) | initialize -> ^( Initialize initialize ) | initialize_1 -> ^( Initialize_1 initialize_1 ) | sys_print -> ^( Sys_print sys_print ) ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:55:13: ( decl -> ^( Decl decl ) | main_method -> ^( Main_METHOD main_method ) | ifstmt -> ^( Ifstmt ifstmt ) | whilestmt -> ^( Whilestmt whilestmt ) | forloop -> ^( Forloop forloop ) | assigment -> ^( Assigment assigment ) | method -> ^( Method method ) | string_dec -> ^( String_Dec string_dec ) | initialize -> ^( Initialize initialize ) | initialize_1 -> ^( Initialize_1 initialize_1 ) | sys_print -> ^( Sys_print sys_print ) )
            {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:55:13: ( decl -> ^( Decl decl ) | main_method -> ^( Main_METHOD main_method ) | ifstmt -> ^( Ifstmt ifstmt ) | whilestmt -> ^( Whilestmt whilestmt ) | forloop -> ^( Forloop forloop ) | assigment -> ^( Assigment assigment ) | method -> ^( Method method ) | string_dec -> ^( String_Dec string_dec ) | initialize -> ^( Initialize initialize ) | initialize_1 -> ^( Initialize_1 initialize_1 ) | sys_print -> ^( Sys_print sys_print ) )
            int alt5=11;
            switch ( input.LA(1) ) {
            case Modifier:
                {
                switch ( input.LA(2) ) {
                case Static:
                    {
                    alt5=2;
                    }
                    break;
                case INT:
                    {
                    int LA5_12 = input.LA(3);

                    if ( (LA5_12==VAR) ) {
                        int LA5_21 = input.LA(4);

                        if ( (LA5_21==SEMICOLON||LA5_21==62||LA5_21==68) ) {
                            alt5=1;
                        }
                        else if ( (LA5_21==VAR||LA5_21==56) ) {
                            alt5=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 21, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA5_12==56) ) {
                        alt5=7;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 12, input);

                        throw nvae;

                    }
                    }
                    break;
                case DOUBLE:
                    {
                    int LA5_13 = input.LA(3);

                    if ( (LA5_13==VAR) ) {
                        int LA5_22 = input.LA(4);

                        if ( (LA5_22==SEMICOLON||LA5_22==62||LA5_22==68) ) {
                            alt5=1;
                        }
                        else if ( (LA5_22==VAR||LA5_22==56) ) {
                            alt5=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 22, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA5_13==56) ) {
                        alt5=7;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 13, input);

                        throw nvae;

                    }
                    }
                    break;
                case STRING:
                    {
                    int LA5_14 = input.LA(3);

                    if ( (LA5_14==VAR) ) {
                        int LA5_23 = input.LA(4);

                        if ( (LA5_23==SEMICOLON||LA5_23==68) ) {
                            alt5=8;
                        }
                        else if ( (LA5_23==VAR||LA5_23==56) ) {
                            alt5=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 23, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA5_14==56) ) {
                        alt5=7;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 14, input);

                        throw nvae;

                    }
                    }
                    break;
                case BOOLEAN:
                case VAR:
                case 56:
                    {
                    alt5=7;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }

                }
                break;
            case INT:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==VAR) ) {
                    int LA5_16 = input.LA(3);

                    if ( (LA5_16==SEMICOLON||LA5_16==62||LA5_16==68) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 16, input);

                        throw nvae;

                    }
                }
                else if ( (LA5_2==70) ) {
                    alt5=9;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;

                }
                }
                break;
            case DOUBLE:
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3==VAR) ) {
                    int LA5_17 = input.LA(3);

                    if ( (LA5_17==SEMICOLON||LA5_17==62||LA5_17==68) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 17, input);

                        throw nvae;

                    }
                }
                else if ( (LA5_3==70) ) {
                    alt5=9;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;

                }
                }
                break;
            case 75:
                {
                alt5=3;
                }
                break;
            case 77:
                {
                alt5=4;
                }
                break;
            case 74:
                {
                alt5=5;
                }
                break;
            case VAR:
                {
                switch ( input.LA(2) ) {
                case 68:
                    {
                    switch ( input.LA(3) ) {
                    case VAR:
                        {
                        switch ( input.LA(4) ) {
                        case Dot:
                            {
                            int LA5_29 = input.LA(5);

                            if ( (LA5_29==VAR) ) {
                                int LA5_30 = input.LA(6);

                                if ( (LA5_30==56) ) {
                                    int LA5_31 = input.LA(7);

                                    if ( (LA5_31==NUM||LA5_31==VAR) ) {
                                        int LA5_32 = input.LA(8);

                                        if ( (LA5_32==57) ) {
                                            switch ( input.LA(9) ) {
                                            case 59:
                                            case 63:
                                                {
                                                alt5=6;
                                                }
                                                break;
                                            case SEMICOLON:
                                                {
                                                alt5=6;
                                                }
                                                break;
                                            case BOOLEAN:
                                            case DOUBLE:
                                            case INT:
                                            case Modifier:
                                            case STRING:
                                            case System:
                                            case VAR:
                                            case 73:
                                            case 74:
                                            case 75:
                                            case 76:
                                            case 77:
                                            case 79:
                                                {
                                                alt5=10;
                                                }
                                                break;
                                            default:
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 5, 33, input);

                                                throw nvae;

                                            }

                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 5, 32, input);

                                            throw nvae;

                                        }
                                    }
                                    else if ( (LA5_31==57) ) {
                                        switch ( input.LA(8) ) {
                                        case 59:
                                        case 63:
                                            {
                                            alt5=6;
                                            }
                                            break;
                                        case SEMICOLON:
                                            {
                                            alt5=6;
                                            }
                                            break;
                                        case BOOLEAN:
                                        case DOUBLE:
                                        case INT:
                                        case Modifier:
                                        case STRING:
                                        case System:
                                        case VAR:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 79:
                                            {
                                            alt5=10;
                                            }
                                            break;
                                        default:
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 5, 33, input);

                                            throw nvae;

                                        }

                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 5, 31, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 30, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 29, input);

                                throw nvae;

                            }
                            }
                            break;
                        case VAR:
                            {
                            alt5=10;
                            }
                            break;
                        case SEMICOLON:
                        case 58:
                        case 59:
                        case 63:
                        case 66:
                            {
                            alt5=6;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 26, input);

                            throw nvae;

                        }

                        }
                        break;
                    case New:
                        {
                        alt5=10;
                        }
                        break;
                    case DNUM:
                    case Fun:
                    case NUM:
                    case SEMICOLON:
                    case 56:
                    case 59:
                    case 63:
                        {
                        alt5=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 18, input);

                        throw nvae;

                    }

                    }
                    break;
                case 60:
                case 61:
                case 64:
                case 65:
                    {
                    alt5=6;
                    }
                    break;
                case SEMICOLON:
                case VAR:
                    {
                    alt5=9;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 7, input);

                    throw nvae;

                }

                }
                break;
            case STRING:
                {
                int LA5_8 = input.LA(2);

                if ( (LA5_8==VAR) ) {
                    int LA5_20 = input.LA(3);

                    if ( (LA5_20==SEMICOLON||LA5_20==68) ) {
                        alt5=8;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 20, input);

                        throw nvae;

                    }
                }
                else if ( (LA5_8==70) ) {
                    alt5=9;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 8, input);

                    throw nvae;

                }
                }
                break;
            case BOOLEAN:
            case SEMICOLON:
                {
                alt5=9;
                }
                break;
            case System:
                {
                alt5=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:56:2: decl
                    {
                    pushFollow(FOLLOW_decl_in_stmt223);
                    decl8=decl();

                    state._fsp--;

                    stream_decl.add(decl8.getTree());

                    // AST REWRITE
                    // elements: decl
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 56:7: -> ^( Decl decl )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:56:10: ^( Decl decl )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Decl, "Decl")
                        , root_1);

                        adaptor.addChild(root_1, stream_decl.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:58:3: main_method
                    {
                    pushFollow(FOLLOW_main_method_in_stmt237);
                    main_method9=main_method();

                    state._fsp--;

                    stream_main_method.add(main_method9.getTree());

                    // AST REWRITE
                    // elements: main_method
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 58:14: -> ^( Main_METHOD main_method )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:58:16: ^( Main_METHOD main_method )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Main_METHOD, "Main_METHOD")
                        , root_1);

                        adaptor.addChild(root_1, stream_main_method.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:59:3: ifstmt
                    {
                    pushFollow(FOLLOW_ifstmt_in_stmt247);
                    ifstmt10=ifstmt();

                    state._fsp--;

                    stream_ifstmt.add(ifstmt10.getTree());

                    // AST REWRITE
                    // elements: ifstmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 59:10: -> ^( Ifstmt ifstmt )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:59:13: ^( Ifstmt ifstmt )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Ifstmt, "Ifstmt")
                        , root_1);

                        adaptor.addChild(root_1, stream_ifstmt.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:60:3: whilestmt
                    {
                    pushFollow(FOLLOW_whilestmt_in_stmt259);
                    whilestmt11=whilestmt();

                    state._fsp--;

                    stream_whilestmt.add(whilestmt11.getTree());

                    // AST REWRITE
                    // elements: whilestmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 60:13: -> ^( Whilestmt whilestmt )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:60:16: ^( Whilestmt whilestmt )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Whilestmt, "Whilestmt")
                        , root_1);

                        adaptor.addChild(root_1, stream_whilestmt.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:61:3: forloop
                    {
                    pushFollow(FOLLOW_forloop_in_stmt271);
                    forloop12=forloop();

                    state._fsp--;

                    stream_forloop.add(forloop12.getTree());

                    // AST REWRITE
                    // elements: forloop
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 61:11: -> ^( Forloop forloop )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:61:14: ^( Forloop forloop )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Forloop, "Forloop")
                        , root_1);

                        adaptor.addChild(root_1, stream_forloop.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:62:3: assigment
                    {
                    pushFollow(FOLLOW_assigment_in_stmt283);
                    assigment13=assigment();

                    state._fsp--;

                    stream_assigment.add(assigment13.getTree());

                    // AST REWRITE
                    // elements: assigment
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 62:13: -> ^( Assigment assigment )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:62:16: ^( Assigment assigment )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Assigment, "Assigment")
                        , root_1);

                        adaptor.addChild(root_1, stream_assigment.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:63:3: method
                    {
                    pushFollow(FOLLOW_method_in_stmt295);
                    method14=method();

                    state._fsp--;

                    stream_method.add(method14.getTree());

                    // AST REWRITE
                    // elements: method
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 63:10: -> ^( Method method )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:63:13: ^( Method method )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Method, "Method")
                        , root_1);

                        adaptor.addChild(root_1, stream_method.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:64:3: string_dec
                    {
                    pushFollow(FOLLOW_string_dec_in_stmt307);
                    string_dec15=string_dec();

                    state._fsp--;

                    stream_string_dec.add(string_dec15.getTree());

                    // AST REWRITE
                    // elements: string_dec
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 64:14: -> ^( String_Dec string_dec )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:64:17: ^( String_Dec string_dec )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(String_Dec, "String_Dec")
                        , root_1);

                        adaptor.addChild(root_1, stream_string_dec.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 9 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:65:3: initialize
                    {
                    pushFollow(FOLLOW_initialize_in_stmt319);
                    initialize16=initialize();

                    state._fsp--;

                    stream_initialize.add(initialize16.getTree());

                    // AST REWRITE
                    // elements: initialize
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 65:14: -> ^( Initialize initialize )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:65:17: ^( Initialize initialize )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Initialize, "Initialize")
                        , root_1);

                        adaptor.addChild(root_1, stream_initialize.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 10 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:66:3: initialize_1
                    {
                    pushFollow(FOLLOW_initialize_1_in_stmt331);
                    initialize_117=initialize_1();

                    state._fsp--;

                    stream_initialize_1.add(initialize_117.getTree());

                    // AST REWRITE
                    // elements: initialize_1
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 66:16: -> ^( Initialize_1 initialize_1 )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:66:19: ^( Initialize_1 initialize_1 )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Initialize_1, "Initialize_1")
                        , root_1);

                        adaptor.addChild(root_1, stream_initialize_1.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 11 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:67:3: sys_print
                    {
                    pushFollow(FOLLOW_sys_print_in_stmt344);
                    sys_print18=sys_print();

                    state._fsp--;

                    stream_sys_print.add(sys_print18.getTree());

                    // AST REWRITE
                    // elements: sys_print
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 67:13: -> ^( Sys_print sys_print )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:67:16: ^( Sys_print sys_print )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Sys_print, "Sys_print")
                        , root_1);

                        adaptor.addChild(root_1, stream_sys_print.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stmt"


    public static class method_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:77:1: method : Modifier ( types )? ( VAR )* params '{' ( stmt )* 'return' return_type SEMICOLON '}' -> ^( Method Modifier ( types )? ( VAR )* params '{' ( stmt )* 'return' return_type SEMICOLON '}' ) ;
    public final ArithmeticExpressionsParser.method_return method() throws RecognitionException {
        ArithmeticExpressionsParser.method_return retval = new ArithmeticExpressionsParser.method_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier19=null;
        Token VAR21=null;
        Token char_literal23=null;
        Token string_literal25=null;
        Token SEMICOLON27=null;
        Token char_literal28=null;
        ArithmeticExpressionsParser.types_return types20 =null;

        ArithmeticExpressionsParser.params_return params22 =null;

        ArithmeticExpressionsParser.stmt_return stmt24 =null;

        ArithmeticExpressionsParser.return_type_return return_type26 =null;


        Object Modifier19_tree=null;
        Object VAR21_tree=null;
        Object char_literal23_tree=null;
        Object string_literal25_tree=null;
        Object SEMICOLON27_tree=null;
        Object char_literal28_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_Modifier=new RewriteRuleTokenStream(adaptor,"token Modifier");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_return_type=new RewriteRuleSubtreeStream(adaptor,"rule return_type");
        RewriteRuleSubtreeStream stream_types=new RewriteRuleSubtreeStream(adaptor,"rule types");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:77:8: ( Modifier ( types )? ( VAR )* params '{' ( stmt )* 'return' return_type SEMICOLON '}' -> ^( Method Modifier ( types )? ( VAR )* params '{' ( stmt )* 'return' return_type SEMICOLON '}' ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:78:2: Modifier ( types )? ( VAR )* params '{' ( stmt )* 'return' return_type SEMICOLON '}'
            {
            Modifier19=(Token)match(input,Modifier,FOLLOW_Modifier_in_method394);  
            stream_Modifier.add(Modifier19);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:78:11: ( types )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==BOOLEAN||LA6_0==DOUBLE||LA6_0==INT||LA6_0==STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:78:11: types
                    {
                    pushFollow(FOLLOW_types_in_method396);
                    types20=types();

                    state._fsp--;

                    stream_types.add(types20.getTree());

                    }
                    break;

            }


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:78:18: ( VAR )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==VAR) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:78:18: VAR
            	    {
            	    VAR21=(Token)match(input,VAR,FOLLOW_VAR_in_method399);  
            	    stream_VAR.add(VAR21);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            pushFollow(FOLLOW_params_in_method402);
            params22=params();

            state._fsp--;

            stream_params.add(params22.getTree());

            char_literal23=(Token)match(input,78,FOLLOW_78_in_method404);  
            stream_78.add(char_literal23);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:78:34: ( stmt )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==BOOLEAN||LA8_0==DOUBLE||LA8_0==INT||LA8_0==Modifier||LA8_0==SEMICOLON||LA8_0==STRING||LA8_0==System||LA8_0==VAR||(LA8_0 >= 74 && LA8_0 <= 75)||LA8_0==77) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:78:34: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_method406);
            	    stmt24=stmt();

            	    state._fsp--;

            	    stream_stmt.add(stmt24.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            string_literal25=(Token)match(input,76,FOLLOW_76_in_method409);  
            stream_76.add(string_literal25);


            pushFollow(FOLLOW_return_type_in_method411);
            return_type26=return_type();

            state._fsp--;

            stream_return_type.add(return_type26.getTree());

            SEMICOLON27=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_method413);  
            stream_SEMICOLON.add(SEMICOLON27);


            char_literal28=(Token)match(input,79,FOLLOW_79_in_method414);  
            stream_79.add(char_literal28);


            // AST REWRITE
            // elements: 76, stmt, 78, return_type, 79, Modifier, types, params, SEMICOLON, VAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 79:3: -> ^( Method Modifier ( types )? ( VAR )* params '{' ( stmt )* 'return' return_type SEMICOLON '}' )
            {
                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:79:6: ^( Method Modifier ( types )? ( VAR )* params '{' ( stmt )* 'return' return_type SEMICOLON '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Method, "Method")
                , root_1);

                adaptor.addChild(root_1, 
                stream_Modifier.nextNode()
                );

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:79:24: ( types )?
                if ( stream_types.hasNext() ) {
                    adaptor.addChild(root_1, stream_types.nextTree());

                }
                stream_types.reset();

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:79:31: ( VAR )*
                while ( stream_VAR.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_VAR.nextNode()
                    );

                }
                stream_VAR.reset();

                adaptor.addChild(root_1, stream_params.nextTree());

                adaptor.addChild(root_1, 
                stream_78.nextNode()
                );

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:79:47: ( stmt )*
                while ( stream_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmt.nextTree());

                }
                stream_stmt.reset();

                adaptor.addChild(root_1, 
                stream_76.nextNode()
                );

                adaptor.addChild(root_1, stream_return_type.nextTree());

                adaptor.addChild(root_1, 
                stream_SEMICOLON.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_79.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "method"


    public static class main_method_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "main_method"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:84:1: main_method : Modifier Static VOID Main '(' STRING '[' ']' 'a' ')' '{' ( print )* '}' -> ^( Main_METHOD Modifier Static VOID Main '(' STRING '[' ']' 'a' ')' '{' ( print )* '}' ) ;
    public final ArithmeticExpressionsParser.main_method_return main_method() throws RecognitionException {
        ArithmeticExpressionsParser.main_method_return retval = new ArithmeticExpressionsParser.main_method_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier29=null;
        Token Static30=null;
        Token VOID31=null;
        Token Main32=null;
        Token char_literal33=null;
        Token STRING34=null;
        Token char_literal35=null;
        Token char_literal36=null;
        Token char_literal37=null;
        Token char_literal38=null;
        Token char_literal39=null;
        Token char_literal41=null;
        ArithmeticExpressionsParser.print_return print40 =null;


        Object Modifier29_tree=null;
        Object Static30_tree=null;
        Object VOID31_tree=null;
        Object Main32_tree=null;
        Object char_literal33_tree=null;
        Object STRING34_tree=null;
        Object char_literal35_tree=null;
        Object char_literal36_tree=null;
        Object char_literal37_tree=null;
        Object char_literal38_tree=null;
        Object char_literal39_tree=null;
        Object char_literal41_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_Static=new RewriteRuleTokenStream(adaptor,"token Static");
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleTokenStream stream_Modifier=new RewriteRuleTokenStream(adaptor,"token Modifier");
        RewriteRuleTokenStream stream_Main=new RewriteRuleTokenStream(adaptor,"token Main");
        RewriteRuleSubtreeStream stream_print=new RewriteRuleSubtreeStream(adaptor,"rule print");
        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:86:2: ( Modifier Static VOID Main '(' STRING '[' ']' 'a' ')' '{' ( print )* '}' -> ^( Main_METHOD Modifier Static VOID Main '(' STRING '[' ']' 'a' ')' '{' ( print )* '}' ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:86:3: Modifier Static VOID Main '(' STRING '[' ']' 'a' ')' '{' ( print )* '}'
            {
            Modifier29=(Token)match(input,Modifier,FOLLOW_Modifier_in_main_method461);  
            stream_Modifier.add(Modifier29);


            Static30=(Token)match(input,Static,FOLLOW_Static_in_main_method463);  
            stream_Static.add(Static30);


            VOID31=(Token)match(input,VOID,FOLLOW_VOID_in_main_method465);  
            stream_VOID.add(VOID31);


            Main32=(Token)match(input,Main,FOLLOW_Main_in_main_method467);  
            stream_Main.add(Main32);


            char_literal33=(Token)match(input,56,FOLLOW_56_in_main_method469);  
            stream_56.add(char_literal33);


            STRING34=(Token)match(input,STRING,FOLLOW_STRING_in_main_method470);  
            stream_STRING.add(STRING34);


            char_literal35=(Token)match(input,70,FOLLOW_70_in_main_method472);  
            stream_70.add(char_literal35);


            char_literal36=(Token)match(input,71,FOLLOW_71_in_main_method473);  
            stream_71.add(char_literal36);


            char_literal37=(Token)match(input,72,FOLLOW_72_in_main_method475);  
            stream_72.add(char_literal37);


            char_literal38=(Token)match(input,57,FOLLOW_57_in_main_method477);  
            stream_57.add(char_literal38);


            char_literal39=(Token)match(input,78,FOLLOW_78_in_main_method479);  
            stream_78.add(char_literal39);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:86:57: ( print )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==System) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:86:57: print
            	    {
            	    pushFollow(FOLLOW_print_in_main_method480);
            	    print40=print();

            	    state._fsp--;

            	    stream_print.add(print40.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            char_literal41=(Token)match(input,79,FOLLOW_79_in_main_method482);  
            stream_79.add(char_literal41);


            // AST REWRITE
            // elements: Modifier, 56, 71, print, 72, 70, 57, STRING, 78, 79, VOID, Static, Main
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 86:66: -> ^( Main_METHOD Modifier Static VOID Main '(' STRING '[' ']' 'a' ')' '{' ( print )* '}' )
            {
                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:86:69: ^( Main_METHOD Modifier Static VOID Main '(' STRING '[' ']' 'a' ')' '{' ( print )* '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Main_METHOD, "Main_METHOD")
                , root_1);

                adaptor.addChild(root_1, 
                stream_Modifier.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_Static.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_VOID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_Main.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_56.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_STRING.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_70.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_71.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_72.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_57.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_78.nextNode()
                );

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:86:138: ( print )*
                while ( stream_print.hasNext() ) {
                    adaptor.addChild(root_1, stream_print.nextTree());

                }
                stream_print.reset();

                adaptor.addChild(root_1, 
                stream_79.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "main_method"


    public static class print_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "print"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:87:1: print : System Dot Out Dot Println '(' New VAR '(' ')' Dot VAR '(' ( NUM )? ')' ')' SEMICOLON -> ^( Print System Dot Out Dot Println '(' New VAR '(' ')' Dot VAR '(' ( NUM )? ')' ')' SEMICOLON ) ;
    public final ArithmeticExpressionsParser.print_return print() throws RecognitionException {
        ArithmeticExpressionsParser.print_return retval = new ArithmeticExpressionsParser.print_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token System42=null;
        Token Dot43=null;
        Token Out44=null;
        Token Dot45=null;
        Token Println46=null;
        Token char_literal47=null;
        Token New48=null;
        Token VAR49=null;
        Token char_literal50=null;
        Token char_literal51=null;
        Token Dot52=null;
        Token VAR53=null;
        Token char_literal54=null;
        Token NUM55=null;
        Token char_literal56=null;
        Token char_literal57=null;
        Token SEMICOLON58=null;

        Object System42_tree=null;
        Object Dot43_tree=null;
        Object Out44_tree=null;
        Object Dot45_tree=null;
        Object Println46_tree=null;
        Object char_literal47_tree=null;
        Object New48_tree=null;
        Object VAR49_tree=null;
        Object char_literal50_tree=null;
        Object char_literal51_tree=null;
        Object Dot52_tree=null;
        Object VAR53_tree=null;
        Object char_literal54_tree=null;
        Object NUM55_tree=null;
        Object char_literal56_tree=null;
        Object char_literal57_tree=null;
        Object SEMICOLON58_tree=null;
        RewriteRuleTokenStream stream_New=new RewriteRuleTokenStream(adaptor,"token New");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleTokenStream stream_Dot=new RewriteRuleTokenStream(adaptor,"token Dot");
        RewriteRuleTokenStream stream_Println=new RewriteRuleTokenStream(adaptor,"token Println");
        RewriteRuleTokenStream stream_System=new RewriteRuleTokenStream(adaptor,"token System");
        RewriteRuleTokenStream stream_Out=new RewriteRuleTokenStream(adaptor,"token Out");

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:87:7: ( System Dot Out Dot Println '(' New VAR '(' ')' Dot VAR '(' ( NUM )? ')' ')' SEMICOLON -> ^( Print System Dot Out Dot Println '(' New VAR '(' ')' Dot VAR '(' ( NUM )? ')' ')' SEMICOLON ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:87:8: System Dot Out Dot Println '(' New VAR '(' ')' Dot VAR '(' ( NUM )? ')' ')' SEMICOLON
            {
            System42=(Token)match(input,System,FOLLOW_System_in_print517);  
            stream_System.add(System42);


            Dot43=(Token)match(input,Dot,FOLLOW_Dot_in_print519);  
            stream_Dot.add(Dot43);


            Out44=(Token)match(input,Out,FOLLOW_Out_in_print521);  
            stream_Out.add(Out44);


            Dot45=(Token)match(input,Dot,FOLLOW_Dot_in_print523);  
            stream_Dot.add(Dot45);


            Println46=(Token)match(input,Println,FOLLOW_Println_in_print525);  
            stream_Println.add(Println46);


            char_literal47=(Token)match(input,56,FOLLOW_56_in_print527);  
            stream_56.add(char_literal47);


            New48=(Token)match(input,New,FOLLOW_New_in_print528);  
            stream_New.add(New48);


            VAR49=(Token)match(input,VAR,FOLLOW_VAR_in_print530);  
            stream_VAR.add(VAR49);


            char_literal50=(Token)match(input,56,FOLLOW_56_in_print532);  
            stream_56.add(char_literal50);


            char_literal51=(Token)match(input,57,FOLLOW_57_in_print533);  
            stream_57.add(char_literal51);


            Dot52=(Token)match(input,Dot,FOLLOW_Dot_in_print534);  
            stream_Dot.add(Dot52);


            VAR53=(Token)match(input,VAR,FOLLOW_VAR_in_print536);  
            stream_VAR.add(VAR53);


            char_literal54=(Token)match(input,56,FOLLOW_56_in_print538);  
            stream_56.add(char_literal54);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:87:63: ( NUM )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==NUM) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:87:63: NUM
                    {
                    NUM55=(Token)match(input,NUM,FOLLOW_NUM_in_print539);  
                    stream_NUM.add(NUM55);


                    }
                    break;

            }


            char_literal56=(Token)match(input,57,FOLLOW_57_in_print541);  
            stream_57.add(char_literal56);


            char_literal57=(Token)match(input,57,FOLLOW_57_in_print543);  
            stream_57.add(char_literal57);


            SEMICOLON58=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_print545);  
            stream_SEMICOLON.add(SEMICOLON58);


            // AST REWRITE
            // elements: System, Dot, 57, SEMICOLON, 56, VAR, 56, NUM, 57, 56, VAR, Out, New, Dot, 57, Println, Dot
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 87:84: -> ^( Print System Dot Out Dot Println '(' New VAR '(' ')' Dot VAR '(' ( NUM )? ')' ')' SEMICOLON )
            {
                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:87:86: ^( Print System Dot Out Dot Println '(' New VAR '(' ')' Dot VAR '(' ( NUM )? ')' ')' SEMICOLON )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Print, "Print")
                , root_1);

                adaptor.addChild(root_1, 
                stream_System.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_Dot.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_Out.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_Dot.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_Println.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_56.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_New.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_VAR.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_56.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_57.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_Dot.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_VAR.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_56.nextNode()
                );

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:87:149: ( NUM )?
                if ( stream_NUM.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_NUM.nextNode()
                    );

                }
                stream_NUM.reset();

                adaptor.addChild(root_1, 
                stream_57.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_57.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_SEMICOLON.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "print"


    public static class return_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_type"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:89:1: return_type : ( VAR | NUM );
    public final ArithmeticExpressionsParser.return_type_return return_type() throws RecognitionException {
        ArithmeticExpressionsParser.return_type_return retval = new ArithmeticExpressionsParser.return_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set59=null;

        Object set59_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:90:2: ( VAR | NUM )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:
            {
            root_0 = (Object)adaptor.nil();


            set59=(Token)input.LT(1);

            if ( input.LA(1)==NUM||input.LA(1)==VAR ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set59)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_type"


    public static class initialize_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initialize"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:93:1: initialize : ( types ( '[' ']' )? VAR SEMICOLON | ( VAR )* SEMICOLON ) ;
    public final ArithmeticExpressionsParser.initialize_return initialize() throws RecognitionException {
        ArithmeticExpressionsParser.initialize_return retval = new ArithmeticExpressionsParser.initialize_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal61=null;
        Token char_literal62=null;
        Token VAR63=null;
        Token SEMICOLON64=null;
        Token VAR65=null;
        Token SEMICOLON66=null;
        ArithmeticExpressionsParser.types_return types60 =null;


        Object char_literal61_tree=null;
        Object char_literal62_tree=null;
        Object VAR63_tree=null;
        Object SEMICOLON64_tree=null;
        Object VAR65_tree=null;
        Object SEMICOLON66_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:93:11: ( ( types ( '[' ']' )? VAR SEMICOLON | ( VAR )* SEMICOLON ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:93:13: ( types ( '[' ']' )? VAR SEMICOLON | ( VAR )* SEMICOLON )
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:93:13: ( types ( '[' ']' )? VAR SEMICOLON | ( VAR )* SEMICOLON )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==BOOLEAN||LA13_0==DOUBLE||LA13_0==INT||LA13_0==STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==SEMICOLON||LA13_0==VAR) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:93:14: types ( '[' ']' )? VAR SEMICOLON
                    {
                    pushFollow(FOLLOW_types_in_initialize601);
                    types60=types();

                    state._fsp--;

                    adaptor.addChild(root_0, types60.getTree());

                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:93:19: ( '[' ']' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==70) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:93:20: '[' ']'
                            {
                            char_literal61=(Token)match(input,70,FOLLOW_70_in_initialize603); 
                            char_literal61_tree = 
                            (Object)adaptor.create(char_literal61)
                            ;
                            adaptor.addChild(root_0, char_literal61_tree);


                            char_literal62=(Token)match(input,71,FOLLOW_71_in_initialize604); 
                            char_literal62_tree = 
                            (Object)adaptor.create(char_literal62)
                            ;
                            adaptor.addChild(root_0, char_literal62_tree);


                            }
                            break;

                    }


                    VAR63=(Token)match(input,VAR,FOLLOW_VAR_in_initialize608); 
                    VAR63_tree = 
                    (Object)adaptor.create(VAR63)
                    ;
                    adaptor.addChild(root_0, VAR63_tree);


                    SEMICOLON64=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_initialize610); 
                    SEMICOLON64_tree = 
                    (Object)adaptor.create(SEMICOLON64)
                    ;
                    adaptor.addChild(root_0, SEMICOLON64_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:93:43: ( VAR )* SEMICOLON
                    {
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:93:43: ( VAR )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==VAR) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:93:43: VAR
                    	    {
                    	    VAR65=(Token)match(input,VAR,FOLLOW_VAR_in_initialize612); 
                    	    VAR65_tree = 
                    	    (Object)adaptor.create(VAR65)
                    	    ;
                    	    adaptor.addChild(root_0, VAR65_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    SEMICOLON66=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_initialize615); 
                    SEMICOLON66_tree = 
                    (Object)adaptor.create(SEMICOLON66)
                    ;
                    adaptor.addChild(root_0, SEMICOLON66_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "initialize"


    public static class initialize_1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initialize_1"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:95:1: initialize_1 : VAR '=' ( New | VAR ) ( Dot )? VAR '(' ( NUM | VAR )? ')' ;
    public final ArithmeticExpressionsParser.initialize_1_return initialize_1() throws RecognitionException {
        ArithmeticExpressionsParser.initialize_1_return retval = new ArithmeticExpressionsParser.initialize_1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR67=null;
        Token char_literal68=null;
        Token set69=null;
        Token Dot70=null;
        Token VAR71=null;
        Token char_literal72=null;
        Token set73=null;
        Token char_literal74=null;

        Object VAR67_tree=null;
        Object char_literal68_tree=null;
        Object set69_tree=null;
        Object Dot70_tree=null;
        Object VAR71_tree=null;
        Object char_literal72_tree=null;
        Object set73_tree=null;
        Object char_literal74_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:96:2: ( VAR '=' ( New | VAR ) ( Dot )? VAR '(' ( NUM | VAR )? ')' )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:96:4: VAR '=' ( New | VAR ) ( Dot )? VAR '(' ( NUM | VAR )? ')'
            {
            root_0 = (Object)adaptor.nil();


            VAR67=(Token)match(input,VAR,FOLLOW_VAR_in_initialize_1625); 
            VAR67_tree = 
            (Object)adaptor.create(VAR67)
            ;
            adaptor.addChild(root_0, VAR67_tree);


            char_literal68=(Token)match(input,68,FOLLOW_68_in_initialize_1627); 
            char_literal68_tree = 
            (Object)adaptor.create(char_literal68)
            ;
            adaptor.addChild(root_0, char_literal68_tree);


            set69=(Token)input.LT(1);

            if ( input.LA(1)==New||input.LA(1)==VAR ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set69)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:96:22: ( Dot )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Dot) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:96:22: Dot
                    {
                    Dot70=(Token)match(input,Dot,FOLLOW_Dot_in_initialize_1635); 
                    Dot70_tree = 
                    (Object)adaptor.create(Dot70)
                    ;
                    adaptor.addChild(root_0, Dot70_tree);


                    }
                    break;

            }


            VAR71=(Token)match(input,VAR,FOLLOW_VAR_in_initialize_1638); 
            VAR71_tree = 
            (Object)adaptor.create(VAR71)
            ;
            adaptor.addChild(root_0, VAR71_tree);


            char_literal72=(Token)match(input,56,FOLLOW_56_in_initialize_1640); 
            char_literal72_tree = 
            (Object)adaptor.create(char_literal72)
            ;
            adaptor.addChild(root_0, char_literal72_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:96:34: ( NUM | VAR )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==NUM||LA15_0==VAR) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:
                    {
                    set73=(Token)input.LT(1);

                    if ( input.LA(1)==NUM||input.LA(1)==VAR ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set73)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            char_literal74=(Token)match(input,57,FOLLOW_57_in_initialize_1647); 
            char_literal74_tree = 
            (Object)adaptor.create(char_literal74)
            ;
            adaptor.addChild(root_0, char_literal74_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "initialize_1"


    public static class sys_print_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sys_print"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:97:1: sys_print : System Dot Out Dot Println '(' ( NUM | VAR Dot VAR '(' ( NUM )? ')' ) ')' SEMICOLON ;
    public final ArithmeticExpressionsParser.sys_print_return sys_print() throws RecognitionException {
        ArithmeticExpressionsParser.sys_print_return retval = new ArithmeticExpressionsParser.sys_print_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token System75=null;
        Token Dot76=null;
        Token Out77=null;
        Token Dot78=null;
        Token Println79=null;
        Token char_literal80=null;
        Token NUM81=null;
        Token VAR82=null;
        Token Dot83=null;
        Token VAR84=null;
        Token char_literal85=null;
        Token NUM86=null;
        Token char_literal87=null;
        Token char_literal88=null;
        Token SEMICOLON89=null;

        Object System75_tree=null;
        Object Dot76_tree=null;
        Object Out77_tree=null;
        Object Dot78_tree=null;
        Object Println79_tree=null;
        Object char_literal80_tree=null;
        Object NUM81_tree=null;
        Object VAR82_tree=null;
        Object Dot83_tree=null;
        Object VAR84_tree=null;
        Object char_literal85_tree=null;
        Object NUM86_tree=null;
        Object char_literal87_tree=null;
        Object char_literal88_tree=null;
        Object SEMICOLON89_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:98:2: ( System Dot Out Dot Println '(' ( NUM | VAR Dot VAR '(' ( NUM )? ')' ) ')' SEMICOLON )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:98:4: System Dot Out Dot Println '(' ( NUM | VAR Dot VAR '(' ( NUM )? ')' ) ')' SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            System75=(Token)match(input,System,FOLLOW_System_in_sys_print656); 
            System75_tree = 
            (Object)adaptor.create(System75)
            ;
            adaptor.addChild(root_0, System75_tree);


            Dot76=(Token)match(input,Dot,FOLLOW_Dot_in_sys_print658); 
            Dot76_tree = 
            (Object)adaptor.create(Dot76)
            ;
            adaptor.addChild(root_0, Dot76_tree);


            Out77=(Token)match(input,Out,FOLLOW_Out_in_sys_print660); 
            Out77_tree = 
            (Object)adaptor.create(Out77)
            ;
            adaptor.addChild(root_0, Out77_tree);


            Dot78=(Token)match(input,Dot,FOLLOW_Dot_in_sys_print662); 
            Dot78_tree = 
            (Object)adaptor.create(Dot78)
            ;
            adaptor.addChild(root_0, Dot78_tree);


            Println79=(Token)match(input,Println,FOLLOW_Println_in_sys_print664); 
            Println79_tree = 
            (Object)adaptor.create(Println79)
            ;
            adaptor.addChild(root_0, Println79_tree);


            char_literal80=(Token)match(input,56,FOLLOW_56_in_sys_print666); 
            char_literal80_tree = 
            (Object)adaptor.create(char_literal80)
            ;
            adaptor.addChild(root_0, char_literal80_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:98:34: ( NUM | VAR Dot VAR '(' ( NUM )? ')' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==NUM) ) {
                alt17=1;
            }
            else if ( (LA17_0==VAR) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:98:35: NUM
                    {
                    NUM81=(Token)match(input,NUM,FOLLOW_NUM_in_sys_print668); 
                    NUM81_tree = 
                    (Object)adaptor.create(NUM81)
                    ;
                    adaptor.addChild(root_0, NUM81_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:98:39: VAR Dot VAR '(' ( NUM )? ')'
                    {
                    VAR82=(Token)match(input,VAR,FOLLOW_VAR_in_sys_print670); 
                    VAR82_tree = 
                    (Object)adaptor.create(VAR82)
                    ;
                    adaptor.addChild(root_0, VAR82_tree);


                    Dot83=(Token)match(input,Dot,FOLLOW_Dot_in_sys_print672); 
                    Dot83_tree = 
                    (Object)adaptor.create(Dot83)
                    ;
                    adaptor.addChild(root_0, Dot83_tree);


                    VAR84=(Token)match(input,VAR,FOLLOW_VAR_in_sys_print674); 
                    VAR84_tree = 
                    (Object)adaptor.create(VAR84)
                    ;
                    adaptor.addChild(root_0, VAR84_tree);


                    char_literal85=(Token)match(input,56,FOLLOW_56_in_sys_print676); 
                    char_literal85_tree = 
                    (Object)adaptor.create(char_literal85)
                    ;
                    adaptor.addChild(root_0, char_literal85_tree);


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:98:54: ( NUM )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==NUM) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:98:54: NUM
                            {
                            NUM86=(Token)match(input,NUM,FOLLOW_NUM_in_sys_print677); 
                            NUM86_tree = 
                            (Object)adaptor.create(NUM86)
                            ;
                            adaptor.addChild(root_0, NUM86_tree);


                            }
                            break;

                    }


                    char_literal87=(Token)match(input,57,FOLLOW_57_in_sys_print679); 
                    char_literal87_tree = 
                    (Object)adaptor.create(char_literal87)
                    ;
                    adaptor.addChild(root_0, char_literal87_tree);


                    }
                    break;

            }


            char_literal88=(Token)match(input,57,FOLLOW_57_in_sys_print683); 
            char_literal88_tree = 
            (Object)adaptor.create(char_literal88)
            ;
            adaptor.addChild(root_0, char_literal88_tree);


            SEMICOLON89=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_sys_print685); 
            SEMICOLON89_tree = 
            (Object)adaptor.create(SEMICOLON89)
            ;
            adaptor.addChild(root_0, SEMICOLON89_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sys_print"


    public static class object_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "object"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:99:1: object : ( VAR Dot VAR '(' ( NUM | VAR )? ')' | ( VAR )? );
    public final ArithmeticExpressionsParser.object_return object() throws RecognitionException {
        ArithmeticExpressionsParser.object_return retval = new ArithmeticExpressionsParser.object_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR90=null;
        Token Dot91=null;
        Token VAR92=null;
        Token char_literal93=null;
        Token set94=null;
        Token char_literal95=null;
        Token VAR96=null;

        Object VAR90_tree=null;
        Object Dot91_tree=null;
        Object VAR92_tree=null;
        Object char_literal93_tree=null;
        Object set94_tree=null;
        Object char_literal95_tree=null;
        Object VAR96_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:99:8: ( VAR Dot VAR '(' ( NUM | VAR )? ')' | ( VAR )? )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==VAR) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==Dot) ) {
                    alt20=1;
                }
                else if ( (LA20_1==AndOr||(LA20_1 >= RelationalOperators && LA20_1 <= SEMICOLON)||LA20_1==57||LA20_1==59||LA20_1==63||LA20_1==67||LA20_1==69) ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA20_0==AndOr||(LA20_0 >= RelationalOperators && LA20_0 <= SEMICOLON)||LA20_0==57||LA20_0==59||LA20_0==63||LA20_0==67||LA20_0==69) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:99:10: VAR Dot VAR '(' ( NUM | VAR )? ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    VAR90=(Token)match(input,VAR,FOLLOW_VAR_in_object692); 
                    VAR90_tree = 
                    (Object)adaptor.create(VAR90)
                    ;
                    adaptor.addChild(root_0, VAR90_tree);


                    Dot91=(Token)match(input,Dot,FOLLOW_Dot_in_object694); 
                    Dot91_tree = 
                    (Object)adaptor.create(Dot91)
                    ;
                    adaptor.addChild(root_0, Dot91_tree);


                    VAR92=(Token)match(input,VAR,FOLLOW_VAR_in_object696); 
                    VAR92_tree = 
                    (Object)adaptor.create(VAR92)
                    ;
                    adaptor.addChild(root_0, VAR92_tree);


                    char_literal93=(Token)match(input,56,FOLLOW_56_in_object698); 
                    char_literal93_tree = 
                    (Object)adaptor.create(char_literal93)
                    ;
                    adaptor.addChild(root_0, char_literal93_tree);


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:99:26: ( NUM | VAR )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NUM||LA18_0==VAR) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:
                            {
                            set94=(Token)input.LT(1);

                            if ( input.LA(1)==NUM||input.LA(1)==VAR ) {
                                input.consume();
                                adaptor.addChild(root_0, 
                                (Object)adaptor.create(set94)
                                );
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }


                    char_literal95=(Token)match(input,57,FOLLOW_57_in_object707); 
                    char_literal95_tree = 
                    (Object)adaptor.create(char_literal95)
                    ;
                    adaptor.addChild(root_0, char_literal95_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:99:43: ( VAR )?
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:99:43: ( VAR )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==VAR) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:99:43: VAR
                            {
                            VAR96=(Token)match(input,VAR,FOLLOW_VAR_in_object711); 
                            VAR96_tree = 
                            (Object)adaptor.create(VAR96)
                            ;
                            adaptor.addChild(root_0, VAR96_tree);


                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "object"


    public static class params_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:102:1: params : '(' ( ( types VAR | VAR VAR ) ( ',' types VAR )* )? ')' ;
    public final ArithmeticExpressionsParser.params_return params() throws RecognitionException {
        ArithmeticExpressionsParser.params_return retval = new ArithmeticExpressionsParser.params_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal97=null;
        Token VAR99=null;
        Token VAR100=null;
        Token VAR101=null;
        Token char_literal102=null;
        Token VAR104=null;
        Token char_literal105=null;
        ArithmeticExpressionsParser.types_return types98 =null;

        ArithmeticExpressionsParser.types_return types103 =null;


        Object char_literal97_tree=null;
        Object VAR99_tree=null;
        Object VAR100_tree=null;
        Object VAR101_tree=null;
        Object char_literal102_tree=null;
        Object VAR104_tree=null;
        Object char_literal105_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:102:8: ( '(' ( ( types VAR | VAR VAR ) ( ',' types VAR )* )? ')' )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:102:10: '(' ( ( types VAR | VAR VAR ) ( ',' types VAR )* )? ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal97=(Token)match(input,56,FOLLOW_56_in_params721); 
            char_literal97_tree = 
            (Object)adaptor.create(char_literal97)
            ;
            adaptor.addChild(root_0, char_literal97_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:102:13: ( ( types VAR | VAR VAR ) ( ',' types VAR )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==BOOLEAN||LA23_0==DOUBLE||LA23_0==INT||LA23_0==STRING||LA23_0==VAR) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:102:14: ( types VAR | VAR VAR ) ( ',' types VAR )*
                    {
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:102:14: ( types VAR | VAR VAR )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==BOOLEAN||LA21_0==DOUBLE||LA21_0==INT||LA21_0==STRING) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==VAR) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;

                    }
                    switch (alt21) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:102:15: types VAR
                            {
                            pushFollow(FOLLOW_types_in_params724);
                            types98=types();

                            state._fsp--;

                            adaptor.addChild(root_0, types98.getTree());

                            VAR99=(Token)match(input,VAR,FOLLOW_VAR_in_params726); 
                            VAR99_tree = 
                            (Object)adaptor.create(VAR99)
                            ;
                            adaptor.addChild(root_0, VAR99_tree);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:102:25: VAR VAR
                            {
                            VAR100=(Token)match(input,VAR,FOLLOW_VAR_in_params728); 
                            VAR100_tree = 
                            (Object)adaptor.create(VAR100)
                            ;
                            adaptor.addChild(root_0, VAR100_tree);


                            VAR101=(Token)match(input,VAR,FOLLOW_VAR_in_params730); 
                            VAR101_tree = 
                            (Object)adaptor.create(VAR101)
                            ;
                            adaptor.addChild(root_0, VAR101_tree);


                            }
                            break;

                    }


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:102:34: ( ',' types VAR )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==62) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:102:35: ',' types VAR
                    	    {
                    	    char_literal102=(Token)match(input,62,FOLLOW_62_in_params734); 
                    	    char_literal102_tree = 
                    	    (Object)adaptor.create(char_literal102)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal102_tree);


                    	    pushFollow(FOLLOW_types_in_params736);
                    	    types103=types();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, types103.getTree());

                    	    VAR104=(Token)match(input,VAR,FOLLOW_VAR_in_params738); 
                    	    VAR104_tree = 
                    	    (Object)adaptor.create(VAR104)
                    	    ;
                    	    adaptor.addChild(root_0, VAR104_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal105=(Token)match(input,57,FOLLOW_57_in_params744); 
            char_literal105_tree = 
            (Object)adaptor.create(char_literal105)
            ;
            adaptor.addChild(root_0, char_literal105_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "params"


    public static class decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "decl"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:103:1: decl : ( int_dec -> ^( Int_dec int_dec ) | double_dec -> ^( Double_dec double_dec ) );
    public final ArithmeticExpressionsParser.decl_return decl() throws RecognitionException {
        ArithmeticExpressionsParser.decl_return retval = new ArithmeticExpressionsParser.decl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.int_dec_return int_dec106 =null;

        ArithmeticExpressionsParser.double_dec_return double_dec107 =null;


        RewriteRuleSubtreeStream stream_int_dec=new RewriteRuleSubtreeStream(adaptor,"rule int_dec");
        RewriteRuleSubtreeStream stream_double_dec=new RewriteRuleSubtreeStream(adaptor,"rule double_dec");
        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:103:9: ( int_dec -> ^( Int_dec int_dec ) | double_dec -> ^( Double_dec double_dec ) )
            int alt24=2;
            switch ( input.LA(1) ) {
            case Modifier:
                {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==INT) ) {
                    alt24=1;
                }
                else if ( (LA24_1==DOUBLE) ) {
                    alt24=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt24=1;
                }
                break;
            case DOUBLE:
                {
                alt24=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:104:2: int_dec
                    {
                    pushFollow(FOLLOW_int_dec_in_decl758);
                    int_dec106=int_dec();

                    state._fsp--;

                    stream_int_dec.add(int_dec106.getTree());

                    // AST REWRITE
                    // elements: int_dec
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 104:10: -> ^( Int_dec int_dec )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:104:13: ^( Int_dec int_dec )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Int_dec, "Int_dec")
                        , root_1);

                        adaptor.addChild(root_1, stream_int_dec.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:105:3: double_dec
                    {
                    pushFollow(FOLLOW_double_dec_in_decl770);
                    double_dec107=double_dec();

                    state._fsp--;

                    stream_double_dec.add(double_dec107.getTree());

                    // AST REWRITE
                    // elements: double_dec
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 105:14: -> ^( Double_dec double_dec )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:105:17: ^( Double_dec double_dec )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Double_dec, "Double_dec")
                        , root_1);

                        adaptor.addChild(root_1, stream_double_dec.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "decl"


    public static class while_condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_condition"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:107:2: while_condition : ( '(' condition ')' | object );
    public final ArithmeticExpressionsParser.while_condition_return while_condition() throws RecognitionException {
        ArithmeticExpressionsParser.while_condition_return retval = new ArithmeticExpressionsParser.while_condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal108=null;
        Token char_literal110=null;
        ArithmeticExpressionsParser.condition_return condition109 =null;

        ArithmeticExpressionsParser.object_return object111 =null;


        Object char_literal108_tree=null;
        Object char_literal110_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:108:4: ( '(' condition ')' | object )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==56) ) {
                alt25=1;
            }
            else if ( (LA25_0==AndOr||(LA25_0 >= RelationalOperators && LA25_0 <= SEMICOLON)||LA25_0==VAR||LA25_0==57||LA25_0==59||LA25_0==63||LA25_0==67||LA25_0==69) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:108:6: '(' condition ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal108=(Token)match(input,56,FOLLOW_56_in_while_condition791); 
                    char_literal108_tree = 
                    (Object)adaptor.create(char_literal108)
                    ;
                    adaptor.addChild(root_0, char_literal108_tree);


                    pushFollow(FOLLOW_condition_in_while_condition793);
                    condition109=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, condition109.getTree());

                    char_literal110=(Token)match(input,57,FOLLOW_57_in_while_condition795); 
                    char_literal110_tree = 
                    (Object)adaptor.create(char_literal110)
                    ;
                    adaptor.addChild(root_0, char_literal110_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:108:24: object
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_object_in_while_condition797);
                    object111=object();

                    state._fsp--;

                    adaptor.addChild(root_0, object111.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_condition"


    public static class whilestmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whilestmt"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:109:1: whilestmt : 'while' '(' while_condition ')' '{' ( stmt )* '}' -> ^( Whilestmt 'while' '(' while_condition ')' '{' ( stmt )* '}' ) ;
    public final ArithmeticExpressionsParser.whilestmt_return whilestmt() throws RecognitionException {
        ArithmeticExpressionsParser.whilestmt_return retval = new ArithmeticExpressionsParser.whilestmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal112=null;
        Token char_literal113=null;
        Token char_literal115=null;
        Token char_literal116=null;
        Token char_literal118=null;
        ArithmeticExpressionsParser.while_condition_return while_condition114 =null;

        ArithmeticExpressionsParser.stmt_return stmt117 =null;


        Object string_literal112_tree=null;
        Object char_literal113_tree=null;
        Object char_literal115_tree=null;
        Object char_literal116_tree=null;
        Object char_literal118_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_while_condition=new RewriteRuleSubtreeStream(adaptor,"rule while_condition");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:109:11: ( 'while' '(' while_condition ')' '{' ( stmt )* '}' -> ^( Whilestmt 'while' '(' while_condition ')' '{' ( stmt )* '}' ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:110:2: 'while' '(' while_condition ')' '{' ( stmt )* '}'
            {
            string_literal112=(Token)match(input,77,FOLLOW_77_in_whilestmt806);  
            stream_77.add(string_literal112);


            char_literal113=(Token)match(input,56,FOLLOW_56_in_whilestmt808);  
            stream_56.add(char_literal113);


            pushFollow(FOLLOW_while_condition_in_whilestmt810);
            while_condition114=while_condition();

            state._fsp--;

            stream_while_condition.add(while_condition114.getTree());

            char_literal115=(Token)match(input,57,FOLLOW_57_in_whilestmt812);  
            stream_57.add(char_literal115);


            char_literal116=(Token)match(input,78,FOLLOW_78_in_whilestmt814);  
            stream_78.add(char_literal116);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:110:38: ( stmt )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==BOOLEAN||LA26_0==DOUBLE||LA26_0==INT||LA26_0==Modifier||LA26_0==SEMICOLON||LA26_0==STRING||LA26_0==System||LA26_0==VAR||(LA26_0 >= 74 && LA26_0 <= 75)||LA26_0==77) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:110:38: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_whilestmt816);
            	    stmt117=stmt();

            	    state._fsp--;

            	    stream_stmt.add(stmt117.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            char_literal118=(Token)match(input,79,FOLLOW_79_in_whilestmt819);  
            stream_79.add(char_literal118);


            // AST REWRITE
            // elements: while_condition, 56, 78, 77, stmt, 79, 57
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 111:3: -> ^( Whilestmt 'while' '(' while_condition ')' '{' ( stmt )* '}' )
            {
                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:111:6: ^( Whilestmt 'while' '(' while_condition ')' '{' ( stmt )* '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Whilestmt, "Whilestmt")
                , root_1);

                adaptor.addChild(root_1, 
                stream_77.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_56.nextNode()
                );

                adaptor.addChild(root_1, stream_while_condition.nextTree());

                adaptor.addChild(root_1, 
                stream_57.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_78.nextNode()
                );

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:111:54: ( stmt )*
                while ( stream_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmt.nextTree());

                }
                stream_stmt.reset();

                adaptor.addChild(root_1, 
                stream_79.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whilestmt"


    public static class ifstmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifstmt"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:116:1: ifstmt : 'if' '(' ( '!' '(' )? if_cond ( ')' )? ')' ( '{' )? ( stmt )* ( '}' )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )? ;
    public final ArithmeticExpressionsParser.ifstmt_return ifstmt() throws RecognitionException {
        ArithmeticExpressionsParser.ifstmt_return retval = new ArithmeticExpressionsParser.ifstmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal119=null;
        Token char_literal120=null;
        Token char_literal121=null;
        Token char_literal122=null;
        Token char_literal124=null;
        Token char_literal125=null;
        Token char_literal126=null;
        Token char_literal128=null;
        Token string_literal129=null;
        Token char_literal130=null;
        Token char_literal132=null;
        Token string_literal133=null;
        Token char_literal134=null;
        Token char_literal136=null;
        ArithmeticExpressionsParser.if_cond_return if_cond123 =null;

        ArithmeticExpressionsParser.stmt_return stmt127 =null;

        ArithmeticExpressionsParser.stmt_return stmt131 =null;

        ArithmeticExpressionsParser.stmt_return stmt135 =null;


        Object string_literal119_tree=null;
        Object char_literal120_tree=null;
        Object char_literal121_tree=null;
        Object char_literal122_tree=null;
        Object char_literal124_tree=null;
        Object char_literal125_tree=null;
        Object char_literal126_tree=null;
        Object char_literal128_tree=null;
        Object string_literal129_tree=null;
        Object char_literal130_tree=null;
        Object char_literal132_tree=null;
        Object string_literal133_tree=null;
        Object char_literal134_tree=null;
        Object char_literal136_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:116:9: ( 'if' '(' ( '!' '(' )? if_cond ( ')' )? ')' ( '{' )? ( stmt )* ( '}' )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )? )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:2: 'if' '(' ( '!' '(' )? if_cond ( ')' )? ')' ( '{' )? ( stmt )* ( '}' )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal119=(Token)match(input,75,FOLLOW_75_in_ifstmt864); 
            string_literal119_tree = 
            (Object)adaptor.create(string_literal119)
            ;
            adaptor.addChild(root_0, string_literal119_tree);


            char_literal120=(Token)match(input,56,FOLLOW_56_in_ifstmt866); 
            char_literal120_tree = 
            (Object)adaptor.create(char_literal120)
            ;
            adaptor.addChild(root_0, char_literal120_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:11: ( '!' '(' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==55) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:12: '!' '('
                    {
                    char_literal121=(Token)match(input,55,FOLLOW_55_in_ifstmt869); 
                    char_literal121_tree = 
                    (Object)adaptor.create(char_literal121)
                    ;
                    adaptor.addChild(root_0, char_literal121_tree);


                    char_literal122=(Token)match(input,56,FOLLOW_56_in_ifstmt871); 
                    char_literal122_tree = 
                    (Object)adaptor.create(char_literal122)
                    ;
                    adaptor.addChild(root_0, char_literal122_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_if_cond_in_ifstmt875);
            if_cond123=if_cond();

            state._fsp--;

            adaptor.addChild(root_0, if_cond123.getTree());

            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:30: ( ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==57) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==57) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:31: ')'
                    {
                    char_literal124=(Token)match(input,57,FOLLOW_57_in_ifstmt878); 
                    char_literal124_tree = 
                    (Object)adaptor.create(char_literal124)
                    ;
                    adaptor.addChild(root_0, char_literal124_tree);


                    }
                    break;

            }


            char_literal125=(Token)match(input,57,FOLLOW_57_in_ifstmt882); 
            char_literal125_tree = 
            (Object)adaptor.create(char_literal125)
            ;
            adaptor.addChild(root_0, char_literal125_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:41: ( '{' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==78) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:42: '{'
                    {
                    char_literal126=(Token)match(input,78,FOLLOW_78_in_ifstmt885); 
                    char_literal126_tree = 
                    (Object)adaptor.create(char_literal126)
                    ;
                    adaptor.addChild(root_0, char_literal126_tree);


                    }
                    break;

            }


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:48: ( stmt )*
            loop30:
            do {
                int alt30=2;
                switch ( input.LA(1) ) {
                case Modifier:
                    {
                    alt30=1;
                    }
                    break;
                case INT:
                    {
                    alt30=1;
                    }
                    break;
                case DOUBLE:
                    {
                    alt30=1;
                    }
                    break;
                case 75:
                    {
                    alt30=1;
                    }
                    break;
                case 77:
                    {
                    alt30=1;
                    }
                    break;
                case 74:
                    {
                    alt30=1;
                    }
                    break;
                case VAR:
                    {
                    alt30=1;
                    }
                    break;
                case STRING:
                    {
                    alt30=1;
                    }
                    break;
                case BOOLEAN:
                    {
                    alt30=1;
                    }
                    break;
                case SEMICOLON:
                    {
                    alt30=1;
                    }
                    break;
                case System:
                    {
                    alt30=1;
                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:48: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_ifstmt889);
            	    stmt127=stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stmt127.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:54: ( '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==79) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:55: '}'
                    {
                    char_literal128=(Token)match(input,79,FOLLOW_79_in_ifstmt893); 
                    char_literal128_tree = 
                    (Object)adaptor.create(char_literal128)
                    ;
                    adaptor.addChild(root_0, char_literal128_tree);


                    }
                    break;

            }


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:61: ( 'else' ( '{' )? ( stmt )* ( '}' )? )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==73) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:62: 'else' ( '{' )? ( stmt )* ( '}' )?
                    {
                    string_literal129=(Token)match(input,73,FOLLOW_73_in_ifstmt898); 
                    string_literal129_tree = 
                    (Object)adaptor.create(string_literal129)
                    ;
                    adaptor.addChild(root_0, string_literal129_tree);


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:69: ( '{' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==78) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:70: '{'
                            {
                            char_literal130=(Token)match(input,78,FOLLOW_78_in_ifstmt901); 
                            char_literal130_tree = 
                            (Object)adaptor.create(char_literal130)
                            ;
                            adaptor.addChild(root_0, char_literal130_tree);


                            }
                            break;

                    }


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:76: ( stmt )*
                    loop33:
                    do {
                        int alt33=2;
                        switch ( input.LA(1) ) {
                        case Modifier:
                            {
                            alt33=1;
                            }
                            break;
                        case INT:
                            {
                            alt33=1;
                            }
                            break;
                        case DOUBLE:
                            {
                            alt33=1;
                            }
                            break;
                        case 75:
                            {
                            alt33=1;
                            }
                            break;
                        case 77:
                            {
                            alt33=1;
                            }
                            break;
                        case 74:
                            {
                            alt33=1;
                            }
                            break;
                        case VAR:
                            {
                            alt33=1;
                            }
                            break;
                        case STRING:
                            {
                            alt33=1;
                            }
                            break;
                        case BOOLEAN:
                            {
                            alt33=1;
                            }
                            break;
                        case SEMICOLON:
                            {
                            alt33=1;
                            }
                            break;
                        case System:
                            {
                            alt33=1;
                            }
                            break;

                        }

                        switch (alt33) {
                    	case 1 :
                    	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:76: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_ifstmt905);
                    	    stmt131=stmt();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, stmt131.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:82: ( '}' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==79) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:83: '}'
                            {
                            char_literal132=(Token)match(input,79,FOLLOW_79_in_ifstmt909); 
                            char_literal132_tree = 
                            (Object)adaptor.create(char_literal132)
                            ;
                            adaptor.addChild(root_0, char_literal132_tree);


                            }
                            break;

                    }


                    }
                    break;

            }


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:91: ( 'else' ( '{' )? ( stmt )* ( '}' )? )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==73) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:92: 'else' ( '{' )? ( stmt )* ( '}' )?
                    {
                    string_literal133=(Token)match(input,73,FOLLOW_73_in_ifstmt916); 
                    string_literal133_tree = 
                    (Object)adaptor.create(string_literal133)
                    ;
                    adaptor.addChild(root_0, string_literal133_tree);


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:99: ( '{' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==78) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:100: '{'
                            {
                            char_literal134=(Token)match(input,78,FOLLOW_78_in_ifstmt919); 
                            char_literal134_tree = 
                            (Object)adaptor.create(char_literal134)
                            ;
                            adaptor.addChild(root_0, char_literal134_tree);


                            }
                            break;

                    }


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:106: ( stmt )*
                    loop37:
                    do {
                        int alt37=2;
                        switch ( input.LA(1) ) {
                        case Modifier:
                            {
                            alt37=1;
                            }
                            break;
                        case INT:
                            {
                            alt37=1;
                            }
                            break;
                        case DOUBLE:
                            {
                            alt37=1;
                            }
                            break;
                        case 75:
                            {
                            alt37=1;
                            }
                            break;
                        case 77:
                            {
                            alt37=1;
                            }
                            break;
                        case 74:
                            {
                            alt37=1;
                            }
                            break;
                        case VAR:
                            {
                            alt37=1;
                            }
                            break;
                        case STRING:
                            {
                            alt37=1;
                            }
                            break;
                        case BOOLEAN:
                            {
                            alt37=1;
                            }
                            break;
                        case SEMICOLON:
                            {
                            alt37=1;
                            }
                            break;
                        case System:
                            {
                            alt37=1;
                            }
                            break;

                        }

                        switch (alt37) {
                    	case 1 :
                    	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:106: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_ifstmt923);
                    	    stmt135=stmt();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, stmt135.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:112: ( '}' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==79) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:113: '}'
                            {
                            char_literal136=(Token)match(input,79,FOLLOW_79_in_ifstmt927); 
                            char_literal136_tree = 
                            (Object)adaptor.create(char_literal136)
                            ;
                            adaptor.addChild(root_0, char_literal136_tree);


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifstmt"


    public static class if_cond_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_cond"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:120:2: if_cond : if_nor ;
    public final ArithmeticExpressionsParser.if_cond_return if_cond() throws RecognitionException {
        ArithmeticExpressionsParser.if_cond_return retval = new ArithmeticExpressionsParser.if_cond_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.if_nor_return if_nor137 =null;



        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:120:10: ( if_nor )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:120:13: if_nor
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_if_nor_in_if_cond945);
            if_nor137=if_nor();

            state._fsp--;

            adaptor.addChild(root_0, if_nor137.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_cond"


    public static class if_nor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_nor"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:121:2: if_nor : object ( ( '>' | '<' ) ^ object )* ;
    public final ArithmeticExpressionsParser.if_nor_return if_nor() throws RecognitionException {
        ArithmeticExpressionsParser.if_nor_return retval = new ArithmeticExpressionsParser.if_nor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set139=null;
        ArithmeticExpressionsParser.object_return object138 =null;

        ArithmeticExpressionsParser.object_return object140 =null;


        Object set139_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:121:9: ( object ( ( '>' | '<' ) ^ object )* )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:121:12: object ( ( '>' | '<' ) ^ object )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_object_in_if_nor957);
            object138=object();

            state._fsp--;

            adaptor.addChild(root_0, object138.getTree());

            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:121:19: ( ( '>' | '<' ) ^ object )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==67||LA40_0==69) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:121:20: ( '>' | '<' ) ^ object
            	    {
            	    set139=(Token)input.LT(1);

            	    set139=(Token)input.LT(1);

            	    if ( input.LA(1)==67||input.LA(1)==69 ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set139)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_object_in_if_nor972);
            	    object140=object();

            	    state._fsp--;

            	    adaptor.addChild(root_0, object140.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_nor"


    public static class forloop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forloop"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:122:1: forloop : 'for' '(' ( decl ) ( condition ) SEMICOLON ( VAR change ) ')' '{' ( stmt )* '}' ;
    public final ArithmeticExpressionsParser.forloop_return forloop() throws RecognitionException {
        ArithmeticExpressionsParser.forloop_return retval = new ArithmeticExpressionsParser.forloop_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal141=null;
        Token char_literal142=null;
        Token SEMICOLON145=null;
        Token VAR146=null;
        Token char_literal148=null;
        Token char_literal149=null;
        Token char_literal151=null;
        ArithmeticExpressionsParser.decl_return decl143 =null;

        ArithmeticExpressionsParser.condition_return condition144 =null;

        ArithmeticExpressionsParser.change_return change147 =null;

        ArithmeticExpressionsParser.stmt_return stmt150 =null;


        Object string_literal141_tree=null;
        Object char_literal142_tree=null;
        Object SEMICOLON145_tree=null;
        Object VAR146_tree=null;
        Object char_literal148_tree=null;
        Object char_literal149_tree=null;
        Object char_literal151_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:122:9: ( 'for' '(' ( decl ) ( condition ) SEMICOLON ( VAR change ) ')' '{' ( stmt )* '}' )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:123:2: 'for' '(' ( decl ) ( condition ) SEMICOLON ( VAR change ) ')' '{' ( stmt )* '}'
            {
            root_0 = (Object)adaptor.nil();


            string_literal141=(Token)match(input,74,FOLLOW_74_in_forloop986); 
            string_literal141_tree = 
            (Object)adaptor.create(string_literal141)
            ;
            adaptor.addChild(root_0, string_literal141_tree);


            char_literal142=(Token)match(input,56,FOLLOW_56_in_forloop988); 
            char_literal142_tree = 
            (Object)adaptor.create(char_literal142)
            ;
            adaptor.addChild(root_0, char_literal142_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:123:12: ( decl )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:123:13: decl
            {
            pushFollow(FOLLOW_decl_in_forloop991);
            decl143=decl();

            state._fsp--;

            adaptor.addChild(root_0, decl143.getTree());

            }


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:123:19: ( condition )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:123:20: condition
            {
            pushFollow(FOLLOW_condition_in_forloop995);
            condition144=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition144.getTree());

            }


            SEMICOLON145=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_forloop998); 
            SEMICOLON145_tree = 
            (Object)adaptor.create(SEMICOLON145)
            ;
            adaptor.addChild(root_0, SEMICOLON145_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:123:41: ( VAR change )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:123:42: VAR change
            {
            VAR146=(Token)match(input,VAR,FOLLOW_VAR_in_forloop1001); 
            VAR146_tree = 
            (Object)adaptor.create(VAR146)
            ;
            adaptor.addChild(root_0, VAR146_tree);


            pushFollow(FOLLOW_change_in_forloop1003);
            change147=change();

            state._fsp--;

            adaptor.addChild(root_0, change147.getTree());

            }


            char_literal148=(Token)match(input,57,FOLLOW_57_in_forloop1006); 
            char_literal148_tree = 
            (Object)adaptor.create(char_literal148)
            ;
            adaptor.addChild(root_0, char_literal148_tree);


            char_literal149=(Token)match(input,78,FOLLOW_78_in_forloop1008); 
            char_literal149_tree = 
            (Object)adaptor.create(char_literal149)
            ;
            adaptor.addChild(root_0, char_literal149_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:123:62: ( stmt )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==BOOLEAN||LA41_0==DOUBLE||LA41_0==INT||LA41_0==Modifier||LA41_0==SEMICOLON||LA41_0==STRING||LA41_0==System||LA41_0==VAR||(LA41_0 >= 74 && LA41_0 <= 75)||LA41_0==77) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:123:62: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_forloop1010);
            	    stmt150=stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stmt150.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            char_literal151=(Token)match(input,79,FOLLOW_79_in_forloop1013); 
            char_literal151_tree = 
            (Object)adaptor.create(char_literal151)
            ;
            adaptor.addChild(root_0, char_literal151_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "forloop"


    public static class assigment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assigment"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:125:1: assigment : assign -> ^( Assigment assign ) ;
    public final ArithmeticExpressionsParser.assigment_return assigment() throws RecognitionException {
        ArithmeticExpressionsParser.assigment_return retval = new ArithmeticExpressionsParser.assigment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.assign_return assign152 =null;


        RewriteRuleSubtreeStream stream_assign=new RewriteRuleSubtreeStream(adaptor,"rule assign");
        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:125:10: ( assign -> ^( Assigment assign ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:126:2: assign
            {
            pushFollow(FOLLOW_assign_in_assigment1025);
            assign152=assign();

            state._fsp--;

            stream_assign.add(assign152.getTree());

            // AST REWRITE
            // elements: assign
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 127:2: -> ^( Assigment assign )
            {
                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:127:5: ^( Assigment assign )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Assigment, "Assigment")
                , root_1);

                adaptor.addChild(root_1, stream_assign.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assigment"


    public static class assign_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:134:1: assign : VAR ( change | '=' generalArithExpr ) SEMICOLON ;
    public final ArithmeticExpressionsParser.assign_return assign() throws RecognitionException {
        ArithmeticExpressionsParser.assign_return retval = new ArithmeticExpressionsParser.assign_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR153=null;
        Token char_literal155=null;
        Token SEMICOLON157=null;
        ArithmeticExpressionsParser.change_return change154 =null;

        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr156 =null;


        Object VAR153_tree=null;
        Object char_literal155_tree=null;
        Object SEMICOLON157_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:134:8: ( VAR ( change | '=' generalArithExpr ) SEMICOLON )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:135:2: VAR ( change | '=' generalArithExpr ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            VAR153=(Token)match(input,VAR,FOLLOW_VAR_in_assign1069); 
            VAR153_tree = 
            (Object)adaptor.create(VAR153)
            ;
            adaptor.addChild(root_0, VAR153_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:135:6: ( change | '=' generalArithExpr )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0 >= 60 && LA42_0 <= 61)||(LA42_0 >= 64 && LA42_0 <= 65)) ) {
                alt42=1;
            }
            else if ( (LA42_0==68) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }
            switch (alt42) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:135:7: change
                    {
                    pushFollow(FOLLOW_change_in_assign1072);
                    change154=change();

                    state._fsp--;

                    adaptor.addChild(root_0, change154.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:135:14: '=' generalArithExpr
                    {
                    char_literal155=(Token)match(input,68,FOLLOW_68_in_assign1074); 
                    char_literal155_tree = 
                    (Object)adaptor.create(char_literal155)
                    ;
                    adaptor.addChild(root_0, char_literal155_tree);


                    pushFollow(FOLLOW_generalArithExpr_in_assign1076);
                    generalArithExpr156=generalArithExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, generalArithExpr156.getTree());

                    }
                    break;

            }


            SEMICOLON157=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assign1079); 
            SEMICOLON157_tree = 
            (Object)adaptor.create(SEMICOLON157)
            ;
            adaptor.addChild(root_0, SEMICOLON157_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign"


    public static class change_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "change"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:137:1: change : ( '++' | '--' | ( '+=' | '-=' ) generalArithExpr ) ;
    public final ArithmeticExpressionsParser.change_return change() throws RecognitionException {
        ArithmeticExpressionsParser.change_return retval = new ArithmeticExpressionsParser.change_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal158=null;
        Token string_literal159=null;
        Token set160=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr161 =null;


        Object string_literal158_tree=null;
        Object string_literal159_tree=null;
        Object set160_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:137:8: ( ( '++' | '--' | ( '+=' | '-=' ) generalArithExpr ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:138:2: ( '++' | '--' | ( '+=' | '-=' ) generalArithExpr )
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:138:2: ( '++' | '--' | ( '+=' | '-=' ) generalArithExpr )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt43=1;
                }
                break;
            case 64:
                {
                alt43=2;
                }
                break;
            case 61:
            case 65:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }

            switch (alt43) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:138:3: '++'
                    {
                    string_literal158=(Token)match(input,60,FOLLOW_60_in_change1090); 
                    string_literal158_tree = 
                    (Object)adaptor.create(string_literal158)
                    ;
                    adaptor.addChild(root_0, string_literal158_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:138:8: '--'
                    {
                    string_literal159=(Token)match(input,64,FOLLOW_64_in_change1092); 
                    string_literal159_tree = 
                    (Object)adaptor.create(string_literal159)
                    ;
                    adaptor.addChild(root_0, string_literal159_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:138:13: ( '+=' | '-=' ) generalArithExpr
                    {
                    set160=(Token)input.LT(1);

                    if ( input.LA(1)==61||input.LA(1)==65 ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set160)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_generalArithExpr_in_change1099);
                    generalArithExpr161=generalArithExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, generalArithExpr161.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "change"


    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:141:1: condition : generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? -> ^( Condition generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? ) ;
    public final ArithmeticExpressionsParser.condition_return condition() throws RecognitionException {
        ArithmeticExpressionsParser.condition_return retval = new ArithmeticExpressionsParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RelationalOperators163=null;
        Token AndOr165=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr162 =null;

        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr164 =null;

        ArithmeticExpressionsParser.condition_return condition166 =null;


        Object RelationalOperators163_tree=null;
        Object AndOr165_tree=null;
        RewriteRuleTokenStream stream_RelationalOperators=new RewriteRuleTokenStream(adaptor,"token RelationalOperators");
        RewriteRuleTokenStream stream_AndOr=new RewriteRuleTokenStream(adaptor,"token AndOr");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_generalArithExpr=new RewriteRuleSubtreeStream(adaptor,"rule generalArithExpr");
        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:141:10: ( generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? -> ^( Condition generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:142:2: generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )?
            {
            pushFollow(FOLLOW_generalArithExpr_in_condition1112);
            generalArithExpr162=generalArithExpr();

            state._fsp--;

            stream_generalArithExpr.add(generalArithExpr162.getTree());

            RelationalOperators163=(Token)match(input,RelationalOperators,FOLLOW_RelationalOperators_in_condition1114);  
            stream_RelationalOperators.add(RelationalOperators163);


            pushFollow(FOLLOW_generalArithExpr_in_condition1116);
            generalArithExpr164=generalArithExpr();

            state._fsp--;

            stream_generalArithExpr.add(generalArithExpr164.getTree());

            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:142:56: ( AndOr condition )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==AndOr) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:142:57: AndOr condition
                    {
                    AndOr165=(Token)match(input,AndOr,FOLLOW_AndOr_in_condition1119);  
                    stream_AndOr.add(AndOr165);


                    pushFollow(FOLLOW_condition_in_condition1121);
                    condition166=condition();

                    state._fsp--;

                    stream_condition.add(condition166.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: generalArithExpr, AndOr, RelationalOperators, generalArithExpr, condition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 143:2: -> ^( Condition generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? )
            {
                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:143:4: ^( Condition generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Condition, "Condition")
                , root_1);

                adaptor.addChild(root_1, stream_generalArithExpr.nextTree());

                adaptor.addChild(root_1, 
                stream_RelationalOperators.nextNode()
                );

                adaptor.addChild(root_1, stream_generalArithExpr.nextTree());

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:143:70: ( AndOr condition )?
                if ( stream_AndOr.hasNext()||stream_condition.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_AndOr.nextNode()
                    );

                    adaptor.addChild(root_1, stream_condition.nextTree());

                }
                stream_AndOr.reset();
                stream_condition.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition"


    public static class int_dec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "int_dec"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:150:1: int_dec : ( Modifier )? INT VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON ;
    public final ArithmeticExpressionsParser.int_dec_return int_dec() throws RecognitionException {
        ArithmeticExpressionsParser.int_dec_return retval = new ArithmeticExpressionsParser.int_dec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier167=null;
        Token INT168=null;
        Token VAR169=null;
        Token char_literal170=null;
        Token char_literal172=null;
        Token VAR173=null;
        Token SEMICOLON174=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr171 =null;


        Object Modifier167_tree=null;
        Object INT168_tree=null;
        Object VAR169_tree=null;
        Object char_literal170_tree=null;
        Object char_literal172_tree=null;
        Object VAR173_tree=null;
        Object SEMICOLON174_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:150:9: ( ( Modifier )? INT VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:152:2: ( Modifier )? INT VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:152:2: ( Modifier )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==Modifier) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:152:2: Modifier
                    {
                    Modifier167=(Token)match(input,Modifier,FOLLOW_Modifier_in_int_dec1180); 
                    Modifier167_tree = 
                    (Object)adaptor.create(Modifier167)
                    ;
                    adaptor.addChild(root_0, Modifier167_tree);


                    }
                    break;

            }


            INT168=(Token)match(input,INT,FOLLOW_INT_in_int_dec1183); 
            INT168_tree = 
            (Object)adaptor.create(INT168)
            ;
            adaptor.addChild(root_0, INT168_tree);


            VAR169=(Token)match(input,VAR,FOLLOW_VAR_in_int_dec1185); 
            VAR169_tree = 
            (Object)adaptor.create(VAR169)
            ;
            adaptor.addChild(root_0, VAR169_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:152:20: ( ( '=' generalArithExpr )? | ( ',' VAR )* )
            int alt48=2;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt48=1;
                }
                break;
            case SEMICOLON:
                {
                alt48=1;
                }
                break;
            case 62:
                {
                alt48=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }

            switch (alt48) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:152:21: ( '=' generalArithExpr )?
                    {
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:152:21: ( '=' generalArithExpr )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==68) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:152:22: '=' generalArithExpr
                            {
                            char_literal170=(Token)match(input,68,FOLLOW_68_in_int_dec1189); 
                            char_literal170_tree = 
                            (Object)adaptor.create(char_literal170)
                            ;
                            adaptor.addChild(root_0, char_literal170_tree);


                            pushFollow(FOLLOW_generalArithExpr_in_int_dec1191);
                            generalArithExpr171=generalArithExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, generalArithExpr171.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:152:45: ( ',' VAR )*
                    {
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:152:45: ( ',' VAR )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==62) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:152:46: ',' VAR
                    	    {
                    	    char_literal172=(Token)match(input,62,FOLLOW_62_in_int_dec1196); 
                    	    char_literal172_tree = 
                    	    (Object)adaptor.create(char_literal172)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal172_tree);


                    	    VAR173=(Token)match(input,VAR,FOLLOW_VAR_in_int_dec1198); 
                    	    VAR173_tree = 
                    	    (Object)adaptor.create(VAR173)
                    	    ;
                    	    adaptor.addChild(root_0, VAR173_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }


            SEMICOLON174=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_int_dec1203); 
            SEMICOLON174_tree = 
            (Object)adaptor.create(SEMICOLON174)
            ;
            adaptor.addChild(root_0, SEMICOLON174_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "int_dec"


    public static class double_dec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "double_dec"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:155:1: double_dec : ( Modifier )? DOUBLE VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON ;
    public final ArithmeticExpressionsParser.double_dec_return double_dec() throws RecognitionException {
        ArithmeticExpressionsParser.double_dec_return retval = new ArithmeticExpressionsParser.double_dec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier175=null;
        Token DOUBLE176=null;
        Token VAR177=null;
        Token char_literal178=null;
        Token char_literal180=null;
        Token VAR181=null;
        Token SEMICOLON182=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr179 =null;


        Object Modifier175_tree=null;
        Object DOUBLE176_tree=null;
        Object VAR177_tree=null;
        Object char_literal178_tree=null;
        Object char_literal180_tree=null;
        Object VAR181_tree=null;
        Object SEMICOLON182_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:155:11: ( ( Modifier )? DOUBLE VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:157:2: ( Modifier )? DOUBLE VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:157:2: ( Modifier )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==Modifier) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:157:2: Modifier
                    {
                    Modifier175=(Token)match(input,Modifier,FOLLOW_Modifier_in_double_dec1218); 
                    Modifier175_tree = 
                    (Object)adaptor.create(Modifier175)
                    ;
                    adaptor.addChild(root_0, Modifier175_tree);


                    }
                    break;

            }


            DOUBLE176=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_double_dec1221); 
            DOUBLE176_tree = 
            (Object)adaptor.create(DOUBLE176)
            ;
            adaptor.addChild(root_0, DOUBLE176_tree);


            VAR177=(Token)match(input,VAR,FOLLOW_VAR_in_double_dec1223); 
            VAR177_tree = 
            (Object)adaptor.create(VAR177)
            ;
            adaptor.addChild(root_0, VAR177_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:157:23: ( ( '=' generalArithExpr )? | ( ',' VAR )* )
            int alt52=2;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt52=1;
                }
                break;
            case SEMICOLON:
                {
                alt52=1;
                }
                break;
            case 62:
                {
                alt52=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;

            }

            switch (alt52) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:157:24: ( '=' generalArithExpr )?
                    {
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:157:24: ( '=' generalArithExpr )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==68) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:157:25: '=' generalArithExpr
                            {
                            char_literal178=(Token)match(input,68,FOLLOW_68_in_double_dec1227); 
                            char_literal178_tree = 
                            (Object)adaptor.create(char_literal178)
                            ;
                            adaptor.addChild(root_0, char_literal178_tree);


                            pushFollow(FOLLOW_generalArithExpr_in_double_dec1229);
                            generalArithExpr179=generalArithExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, generalArithExpr179.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:157:48: ( ',' VAR )*
                    {
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:157:48: ( ',' VAR )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==62) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:157:49: ',' VAR
                    	    {
                    	    char_literal180=(Token)match(input,62,FOLLOW_62_in_double_dec1234); 
                    	    char_literal180_tree = 
                    	    (Object)adaptor.create(char_literal180)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal180_tree);


                    	    VAR181=(Token)match(input,VAR,FOLLOW_VAR_in_double_dec1236); 
                    	    VAR181_tree = 
                    	    (Object)adaptor.create(VAR181)
                    	    ;
                    	    adaptor.addChild(root_0, VAR181_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }


            SEMICOLON182=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_double_dec1241); 
            SEMICOLON182_tree = 
            (Object)adaptor.create(SEMICOLON182)
            ;
            adaptor.addChild(root_0, SEMICOLON182_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "double_dec"


    public static class string_dec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "string_dec"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:160:1: string_dec : ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON -> ^( String_Dec ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON ) ;
    public final ArithmeticExpressionsParser.string_dec_return string_dec() throws RecognitionException {
        ArithmeticExpressionsParser.string_dec_return retval = new ArithmeticExpressionsParser.string_dec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier183=null;
        Token STRING184=null;
        Token VAR185=null;
        Token char_literal186=null;
        Token Strings187=null;
        Token SEMICOLON188=null;

        Object Modifier183_tree=null;
        Object STRING184_tree=null;
        Object VAR185_tree=null;
        Object char_literal186_tree=null;
        Object Strings187_tree=null;
        Object SEMICOLON188_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_Modifier=new RewriteRuleTokenStream(adaptor,"token Modifier");
        RewriteRuleTokenStream stream_Strings=new RewriteRuleTokenStream(adaptor,"token Strings");

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:160:11: ( ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON -> ^( String_Dec ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:162:2: ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON
            {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:162:2: ( Modifier )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==Modifier) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:162:2: Modifier
                    {
                    Modifier183=(Token)match(input,Modifier,FOLLOW_Modifier_in_string_dec1254);  
                    stream_Modifier.add(Modifier183);


                    }
                    break;

            }


            STRING184=(Token)match(input,STRING,FOLLOW_STRING_in_string_dec1257);  
            stream_STRING.add(STRING184);


            VAR185=(Token)match(input,VAR,FOLLOW_VAR_in_string_dec1259);  
            stream_VAR.add(VAR185);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:162:23: ( '=' Strings )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==68) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:162:24: '=' Strings
                    {
                    char_literal186=(Token)match(input,68,FOLLOW_68_in_string_dec1262);  
                    stream_68.add(char_literal186);


                    Strings187=(Token)match(input,Strings,FOLLOW_Strings_in_string_dec1264);  
                    stream_Strings.add(Strings187);


                    }
                    break;

            }


            SEMICOLON188=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_string_dec1268);  
            stream_SEMICOLON.add(SEMICOLON188);


            // AST REWRITE
            // elements: VAR, STRING, SEMICOLON, Strings, 68, Modifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 163:3: -> ^( String_Dec ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON )
            {
                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:163:6: ^( String_Dec ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(String_Dec, "String_Dec")
                , root_1);

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:163:19: ( Modifier )?
                if ( stream_Modifier.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_Modifier.nextNode()
                    );

                }
                stream_Modifier.reset();

                adaptor.addChild(root_1, 
                stream_STRING.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_VAR.nextNode()
                );

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:163:40: ( '=' Strings )?
                if ( stream_Strings.hasNext()||stream_68.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_68.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_Strings.nextNode()
                    );

                }
                stream_Strings.reset();
                stream_68.reset();

                adaptor.addChild(root_1, 
                stream_SEMICOLON.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "string_dec"


    public static class generalArithExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "generalArithExpr"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:165:1: generalArithExpr : term ( ( '+' | '-' ) ^ term )* ;
    public final ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr() throws RecognitionException {
        ArithmeticExpressionsParser.generalArithExpr_return retval = new ArithmeticExpressionsParser.generalArithExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set190=null;
        ArithmeticExpressionsParser.term_return term189 =null;

        ArithmeticExpressionsParser.term_return term191 =null;


        Object set190_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:165:17: ( term ( ( '+' | '-' ) ^ term )* )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:165:19: term ( ( '+' | '-' ) ^ term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_generalArithExpr1300);
            term189=term();

            state._fsp--;

            adaptor.addChild(root_0, term189.getTree());

            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:165:24: ( ( '+' | '-' ) ^ term )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==59||LA55_0==63) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:165:25: ( '+' | '-' ) ^ term
            	    {
            	    set190=(Token)input.LT(1);

            	    set190=(Token)input.LT(1);

            	    if ( input.LA(1)==59||input.LA(1)==63 ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set190)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_term_in_generalArithExpr1315);
            	    term191=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term191.getTree());

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "generalArithExpr"


    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:173:1: term : ( object | factor ( ( '*' | '/' ) ^ factor )* );
    public final ArithmeticExpressionsParser.term_return term() throws RecognitionException {
        ArithmeticExpressionsParser.term_return retval = new ArithmeticExpressionsParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set194=null;
        ArithmeticExpressionsParser.object_return object192 =null;

        ArithmeticExpressionsParser.factor_return factor193 =null;

        ArithmeticExpressionsParser.factor_return factor195 =null;


        Object set194_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:173:6: ( object | factor ( ( '*' | '/' ) ^ factor )* )
            int alt57=2;
            switch ( input.LA(1) ) {
            case AndOr:
            case RelationalOperators:
            case SEMICOLON:
            case VAR:
            case 57:
            case 59:
                {
                alt57=1;
                }
                break;
            case 63:
                {
                switch ( input.LA(2) ) {
                case VAR:
                    {
                    alt57=1;
                    }
                    break;
                case INT:
                    {
                    alt57=2;
                    }
                    break;
                case AndOr:
                case DNUM:
                case Fun:
                case NUM:
                case RelationalOperators:
                case SEMICOLON:
                case 56:
                case 57:
                case 59:
                case 63:
                    {
                    alt57=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 2, input);

                    throw nvae;

                }

                }
                break;
            case DNUM:
            case Fun:
            case NUM:
            case 56:
                {
                alt57=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }

            switch (alt57) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:173:7: object
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_object_in_term1352);
                    object192=object();

                    state._fsp--;

                    adaptor.addChild(root_0, object192.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:173:15: factor ( ( '*' | '/' ) ^ factor )*
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_factor_in_term1355);
                    factor193=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor193.getTree());

                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:173:22: ( ( '*' | '/' ) ^ factor )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==58||LA56_0==66) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:173:24: ( '*' | '/' ) ^ factor
                    	    {
                    	    set194=(Token)input.LT(1);

                    	    set194=(Token)input.LT(1);

                    	    if ( input.LA(1)==58||input.LA(1)==66 ) {
                    	        input.consume();
                    	        root_0 = (Object)adaptor.becomeRoot(
                    	        (Object)adaptor.create(set194)
                    	        , root_0);
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }


                    	    pushFollow(FOLLOW_factor_in_term1371);
                    	    factor195=factor();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, factor195.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:181:1: factor : ( VAR -> ^( Factor VAR ) | NUM -> ^( Factor NUM ) | DNUM -> ^( Factor DOUBLE ) | '-' VAR -> ^( Factor '-' VAR ) | '-' INT -> ^( Factor '-' INT ) | '-' DNUM -> ^( Factor '-' DOUBLE ) | '(' generalArithExpr ')' -> ^( Factor '(' generalArithExpr ')' ) | Fun '(' generalArithExpr ')' -> ^( Factor Fun '(' generalArithExpr ')' ) );
    public final ArithmeticExpressionsParser.factor_return factor() throws RecognitionException {
        ArithmeticExpressionsParser.factor_return retval = new ArithmeticExpressionsParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR196=null;
        Token NUM197=null;
        Token DNUM198=null;
        Token char_literal199=null;
        Token VAR200=null;
        Token char_literal201=null;
        Token INT202=null;
        Token char_literal203=null;
        Token DNUM204=null;
        Token char_literal205=null;
        Token char_literal207=null;
        Token Fun208=null;
        Token char_literal209=null;
        Token char_literal211=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr206 =null;

        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr210 =null;


        Object VAR196_tree=null;
        Object NUM197_tree=null;
        Object DNUM198_tree=null;
        Object char_literal199_tree=null;
        Object VAR200_tree=null;
        Object char_literal201_tree=null;
        Object INT202_tree=null;
        Object char_literal203_tree=null;
        Object DNUM204_tree=null;
        Object char_literal205_tree=null;
        Object char_literal207_tree=null;
        Object Fun208_tree=null;
        Object char_literal209_tree=null;
        Object char_literal211_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_DNUM=new RewriteRuleTokenStream(adaptor,"token DNUM");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_Fun=new RewriteRuleTokenStream(adaptor,"token Fun");
        RewriteRuleSubtreeStream stream_generalArithExpr=new RewriteRuleSubtreeStream(adaptor,"rule generalArithExpr");
        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:181:8: ( VAR -> ^( Factor VAR ) | NUM -> ^( Factor NUM ) | DNUM -> ^( Factor DOUBLE ) | '-' VAR -> ^( Factor '-' VAR ) | '-' INT -> ^( Factor '-' INT ) | '-' DNUM -> ^( Factor '-' DOUBLE ) | '(' generalArithExpr ')' -> ^( Factor '(' generalArithExpr ')' ) | Fun '(' generalArithExpr ')' -> ^( Factor Fun '(' generalArithExpr ')' ) )
            int alt58=8;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt58=1;
                }
                break;
            case NUM:
                {
                alt58=2;
                }
                break;
            case DNUM:
                {
                alt58=3;
                }
                break;
            case 63:
                {
                switch ( input.LA(2) ) {
                case VAR:
                    {
                    alt58=4;
                    }
                    break;
                case INT:
                    {
                    alt58=5;
                    }
                    break;
                case DNUM:
                    {
                    alt58=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 4, input);

                    throw nvae;

                }

                }
                break;
            case 56:
                {
                alt58=7;
                }
                break;
            case Fun:
                {
                alt58=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;

            }

            switch (alt58) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:182:2: VAR
                    {
                    VAR196=(Token)match(input,VAR,FOLLOW_VAR_in_factor1411);  
                    stream_VAR.add(VAR196);


                    // AST REWRITE
                    // elements: VAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 182:6: -> ^( Factor VAR )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:182:9: ^( Factor VAR )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_VAR.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:183:3: NUM
                    {
                    NUM197=(Token)match(input,NUM,FOLLOW_NUM_in_factor1423);  
                    stream_NUM.add(NUM197);


                    // AST REWRITE
                    // elements: NUM
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 183:7: -> ^( Factor NUM )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:183:10: ^( Factor NUM )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NUM.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:184:3: DNUM
                    {
                    DNUM198=(Token)match(input,DNUM,FOLLOW_DNUM_in_factor1435);  
                    stream_DNUM.add(DNUM198);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 184:8: -> ^( Factor DOUBLE )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:184:11: ^( Factor DOUBLE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(DOUBLE, "DOUBLE")
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:185:3: '-' VAR
                    {
                    char_literal199=(Token)match(input,63,FOLLOW_63_in_factor1447);  
                    stream_63.add(char_literal199);


                    VAR200=(Token)match(input,VAR,FOLLOW_VAR_in_factor1450);  
                    stream_VAR.add(VAR200);


                    // AST REWRITE
                    // elements: 63, VAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 185:12: -> ^( Factor '-' VAR )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:185:15: ^( Factor '-' VAR )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_63.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_VAR.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:186:3: '-' INT
                    {
                    char_literal201=(Token)match(input,63,FOLLOW_63_in_factor1465);  
                    stream_63.add(char_literal201);


                    INT202=(Token)match(input,INT,FOLLOW_INT_in_factor1468);  
                    stream_INT.add(INT202);


                    // AST REWRITE
                    // elements: INT, 63
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 186:12: -> ^( Factor '-' INT )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:186:15: ^( Factor '-' INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_63.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:187:3: '-' DNUM
                    {
                    char_literal203=(Token)match(input,63,FOLLOW_63_in_factor1483);  
                    stream_63.add(char_literal203);


                    DNUM204=(Token)match(input,DNUM,FOLLOW_DNUM_in_factor1486);  
                    stream_DNUM.add(DNUM204);


                    // AST REWRITE
                    // elements: 63
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 187:14: -> ^( Factor '-' DOUBLE )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:187:17: ^( Factor '-' DOUBLE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_63.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(DOUBLE, "DOUBLE")
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:188:3: '(' generalArithExpr ')'
                    {
                    char_literal205=(Token)match(input,56,FOLLOW_56_in_factor1502);  
                    stream_56.add(char_literal205);


                    pushFollow(FOLLOW_generalArithExpr_in_factor1504);
                    generalArithExpr206=generalArithExpr();

                    state._fsp--;

                    stream_generalArithExpr.add(generalArithExpr206.getTree());

                    char_literal207=(Token)match(input,57,FOLLOW_57_in_factor1506);  
                    stream_57.add(char_literal207);


                    // AST REWRITE
                    // elements: 57, 56, generalArithExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 188:28: -> ^( Factor '(' generalArithExpr ')' )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:188:31: ^( Factor '(' generalArithExpr ')' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_56.nextNode()
                        );

                        adaptor.addChild(root_1, stream_generalArithExpr.nextTree());

                        adaptor.addChild(root_1, 
                        stream_57.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:189:4: Fun '(' generalArithExpr ')'
                    {
                    Fun208=(Token)match(input,Fun,FOLLOW_Fun_in_factor1524);  
                    stream_Fun.add(Fun208);


                    char_literal209=(Token)match(input,56,FOLLOW_56_in_factor1526);  
                    stream_56.add(char_literal209);


                    pushFollow(FOLLOW_generalArithExpr_in_factor1528);
                    generalArithExpr210=generalArithExpr();

                    state._fsp--;

                    stream_generalArithExpr.add(generalArithExpr210.getTree());

                    char_literal211=(Token)match(input,57,FOLLOW_57_in_factor1530);  
                    stream_57.add(char_literal211);


                    // AST REWRITE
                    // elements: Fun, 56, 57, generalArithExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 189:33: -> ^( Factor Fun '(' generalArithExpr ')' )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:189:36: ^( Factor Fun '(' generalArithExpr ')' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_Fun.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_56.nextNode()
                        );

                        adaptor.addChild(root_1, stream_generalArithExpr.nextTree());

                        adaptor.addChild(root_1, 
                        stream_57.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class types_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "types"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:206:1: types : ( STRING | BOOLEAN | DOUBLE | INT );
    public final ArithmeticExpressionsParser.types_return types() throws RecognitionException {
        ArithmeticExpressionsParser.types_return retval = new ArithmeticExpressionsParser.types_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set212=null;

        Object set212_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:206:7: ( STRING | BOOLEAN | DOUBLE | INT )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:
            {
            root_0 = (Object)adaptor.nil();


            set212=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEAN||input.LA(1)==DOUBLE||input.LA(1)==INT||input.LA(1)==STRING ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set212)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "types"

    // Delegated rules


 

    public static final BitSet FOLLOW_classDec_in_startgeneralArithExpr106 = new BitSet(new long[]{0x0000000100000202L});
    public static final BitSet FOLLOW_Modifier_in_classDec151 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_Class_in_classDec154 = new BitSet(new long[]{0x0008000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_VAR_in_classDec156 = new BitSet(new long[]{0x0008000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_classDec159 = new BitSet(new long[]{0x0009028100404080L,0x000000000000AC00L});
    public static final BitSet FOLLOW_stmt_in_classDec161 = new BitSet(new long[]{0x0009028100404080L,0x000000000000AC00L});
    public static final BitSet FOLLOW_79_in_classDec164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_stmt223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_main_method_in_stmt237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstmt_in_stmt247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestmt_in_stmt259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forloop_in_stmt271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assigment_in_stmt283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_stmt295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_dec_in_stmt307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initialize_in_stmt319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initialize_1_in_stmt331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sys_print_in_stmt344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_method394 = new BitSet(new long[]{0x0108020000404080L});
    public static final BitSet FOLLOW_types_in_method396 = new BitSet(new long[]{0x0108000000000000L});
    public static final BitSet FOLLOW_VAR_in_method399 = new BitSet(new long[]{0x0108000000000000L});
    public static final BitSet FOLLOW_params_in_method402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_method404 = new BitSet(new long[]{0x0009028100404080L,0x0000000000003C00L});
    public static final BitSet FOLLOW_stmt_in_method406 = new BitSet(new long[]{0x0009028100404080L,0x0000000000003C00L});
    public static final BitSet FOLLOW_76_in_method409 = new BitSet(new long[]{0x0008000200000000L});
    public static final BitSet FOLLOW_return_type_in_method411 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_method413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_method414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_main_method461 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Static_in_main_method463 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_VOID_in_main_method465 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_Main_in_main_method467 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_main_method469 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_STRING_in_main_method470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_main_method472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_main_method473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_main_method475 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_main_method477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_main_method479 = new BitSet(new long[]{0x0001000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_print_in_main_method480 = new BitSet(new long[]{0x0001000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_main_method482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_System_in_print517 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Dot_in_print519 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_Out_in_print521 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Dot_in_print523 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_Println_in_print525 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_print527 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_New_in_print528 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_print530 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_print532 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_print533 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Dot_in_print534 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_print536 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_print538 = new BitSet(new long[]{0x0200000200000000L});
    public static final BitSet FOLLOW_NUM_in_print539 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_print541 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_print543 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_print545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_types_in_initialize601 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_initialize603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_initialize604 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_initialize608 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_initialize610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_initialize612 = new BitSet(new long[]{0x0008008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_initialize615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_initialize_1625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_initialize_1627 = new BitSet(new long[]{0x0008000400000000L});
    public static final BitSet FOLLOW_set_in_initialize_1629 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_Dot_in_initialize_1635 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_initialize_1638 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_initialize_1640 = new BitSet(new long[]{0x0208000200000000L});
    public static final BitSet FOLLOW_57_in_initialize_1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_System_in_sys_print656 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Dot_in_sys_print658 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_Out_in_sys_print660 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Dot_in_sys_print662 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_Println_in_sys_print664 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_sys_print666 = new BitSet(new long[]{0x0008000200000000L});
    public static final BitSet FOLLOW_NUM_in_sys_print668 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_VAR_in_sys_print670 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Dot_in_sys_print672 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_sys_print674 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_sys_print676 = new BitSet(new long[]{0x0200000200000000L});
    public static final BitSet FOLLOW_NUM_in_sys_print677 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_sys_print679 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_sys_print683 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_sys_print685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_object692 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Dot_in_object694 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_object696 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_object698 = new BitSet(new long[]{0x0208000200000000L});
    public static final BitSet FOLLOW_57_in_object707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_object711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_params721 = new BitSet(new long[]{0x0208020000404080L});
    public static final BitSet FOLLOW_types_in_params724 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_params726 = new BitSet(new long[]{0x4200000000000000L});
    public static final BitSet FOLLOW_VAR_in_params728 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_params730 = new BitSet(new long[]{0x4200000000000000L});
    public static final BitSet FOLLOW_62_in_params734 = new BitSet(new long[]{0x0000020000404080L});
    public static final BitSet FOLLOW_types_in_params736 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_params738 = new BitSet(new long[]{0x4200000000000000L});
    public static final BitSet FOLLOW_57_in_params744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_dec_in_decl758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_dec_in_decl770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_while_condition791 = new BitSet(new long[]{0x8108000200102000L});
    public static final BitSet FOLLOW_condition_in_while_condition793 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_while_condition795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_while_condition797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_whilestmt806 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_whilestmt808 = new BitSet(new long[]{0x0108000000000000L});
    public static final BitSet FOLLOW_while_condition_in_whilestmt810 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_whilestmt812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_whilestmt814 = new BitSet(new long[]{0x0009028100404080L,0x000000000000AC00L});
    public static final BitSet FOLLOW_stmt_in_whilestmt816 = new BitSet(new long[]{0x0009028100404080L,0x000000000000AC00L});
    public static final BitSet FOLLOW_79_in_whilestmt819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ifstmt864 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ifstmt866 = new BitSet(new long[]{0x0088000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_55_in_ifstmt869 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ifstmt871 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_if_cond_in_ifstmt875 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ifstmt878 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ifstmt882 = new BitSet(new long[]{0x0009028100404082L,0x000000000000EE00L});
    public static final BitSet FOLLOW_78_in_ifstmt885 = new BitSet(new long[]{0x0009028100404082L,0x000000000000AE00L});
    public static final BitSet FOLLOW_stmt_in_ifstmt889 = new BitSet(new long[]{0x0009028100404082L,0x000000000000AE00L});
    public static final BitSet FOLLOW_79_in_ifstmt893 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ifstmt898 = new BitSet(new long[]{0x0009028100404082L,0x000000000000EE00L});
    public static final BitSet FOLLOW_78_in_ifstmt901 = new BitSet(new long[]{0x0009028100404082L,0x000000000000AE00L});
    public static final BitSet FOLLOW_stmt_in_ifstmt905 = new BitSet(new long[]{0x0009028100404082L,0x000000000000AE00L});
    public static final BitSet FOLLOW_79_in_ifstmt909 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ifstmt916 = new BitSet(new long[]{0x0009028100404082L,0x000000000000EC00L});
    public static final BitSet FOLLOW_78_in_ifstmt919 = new BitSet(new long[]{0x0009028100404082L,0x000000000000AC00L});
    public static final BitSet FOLLOW_stmt_in_ifstmt923 = new BitSet(new long[]{0x0009028100404082L,0x000000000000AC00L});
    public static final BitSet FOLLOW_79_in_ifstmt927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_nor_in_if_cond945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_if_nor957 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000028L});
    public static final BitSet FOLLOW_set_in_if_nor960 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_object_in_if_nor972 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000028L});
    public static final BitSet FOLLOW_74_in_forloop986 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_forloop988 = new BitSet(new long[]{0x0000000100404000L});
    public static final BitSet FOLLOW_decl_in_forloop991 = new BitSet(new long[]{0x8108000200102000L});
    public static final BitSet FOLLOW_condition_in_forloop995 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_forloop998 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_forloop1001 = new BitSet(new long[]{0x3000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_change_in_forloop1003 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_forloop1006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_forloop1008 = new BitSet(new long[]{0x0009028100404080L,0x000000000000AC00L});
    public static final BitSet FOLLOW_stmt_in_forloop1010 = new BitSet(new long[]{0x0009028100404080L,0x000000000000AC00L});
    public static final BitSet FOLLOW_79_in_forloop1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_assigment1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_assign1069 = new BitSet(new long[]{0x3000000000000000L,0x0000000000000013L});
    public static final BitSet FOLLOW_change_in_assign1072 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_68_in_assign1074 = new BitSet(new long[]{0x8108000200102000L});
    public static final BitSet FOLLOW_generalArithExpr_in_assign1076 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_assign1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_change1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_change1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_change1094 = new BitSet(new long[]{0x8108000200102000L});
    public static final BitSet FOLLOW_generalArithExpr_in_change1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_generalArithExpr_in_condition1112 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RelationalOperators_in_condition1114 = new BitSet(new long[]{0x8108000200102000L});
    public static final BitSet FOLLOW_generalArithExpr_in_condition1116 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AndOr_in_condition1119 = new BitSet(new long[]{0x8108000200102000L});
    public static final BitSet FOLLOW_condition_in_condition1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_int_dec1180 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_INT_in_int_dec1183 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_int_dec1185 = new BitSet(new long[]{0x4000008000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_int_dec1189 = new BitSet(new long[]{0x8108000200102000L});
    public static final BitSet FOLLOW_generalArithExpr_in_int_dec1191 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_62_in_int_dec1196 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_int_dec1198 = new BitSet(new long[]{0x4000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_int_dec1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_double_dec1218 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DOUBLE_in_double_dec1221 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_double_dec1223 = new BitSet(new long[]{0x4000008000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_double_dec1227 = new BitSet(new long[]{0x8108000200102000L});
    public static final BitSet FOLLOW_generalArithExpr_in_double_dec1229 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_62_in_double_dec1234 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_double_dec1236 = new BitSet(new long[]{0x4000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_double_dec1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_string_dec1254 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_STRING_in_string_dec1257 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_string_dec1259 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_string_dec1262 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_Strings_in_string_dec1264 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_string_dec1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_generalArithExpr1300 = new BitSet(new long[]{0x8800000000000002L});
    public static final BitSet FOLLOW_set_in_generalArithExpr1303 = new BitSet(new long[]{0x8108000200102000L});
    public static final BitSet FOLLOW_term_in_generalArithExpr1315 = new BitSet(new long[]{0x8800000000000002L});
    public static final BitSet FOLLOW_object_in_term1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term1355 = new BitSet(new long[]{0x0400000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_term1359 = new BitSet(new long[]{0x8108000200102000L});
    public static final BitSet FOLLOW_factor_in_term1371 = new BitSet(new long[]{0x0400000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_VAR_in_factor1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_factor1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DNUM_in_factor1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_factor1447 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_factor1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_factor1465 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_INT_in_factor1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_factor1483 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DNUM_in_factor1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_factor1502 = new BitSet(new long[]{0x8108000200102000L});
    public static final BitSet FOLLOW_generalArithExpr_in_factor1504 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_factor1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Fun_in_factor1524 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_factor1526 = new BitSet(new long[]{0x8108000200102000L});
    public static final BitSet FOLLOW_generalArithExpr_in_factor1528 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_factor1530 = new BitSet(new long[]{0x0000000000000002L});

}