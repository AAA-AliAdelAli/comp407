// $ANTLR 3.4 C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g 2024-05-12 00:26:35

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ArithmeticExpressionsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AndOr", "Args", "Assigment", "BOOLEAN", "COMMENT", "Class", "ClassDec", "Condition", "Conditions", "DNUM", "DOUBLE", "Decl", "Dot", "Double_dec", "Factor", "Forloop", "Fun", "GeneralArithExpr", "INT", "Ifstmt", "Ifstmt_2", "Initialize", "Initialize_1", "Int_dec", "ML_COMMENT", "Main", "Main_METHOD", "Method", "Modifier", "NUM", "New", "Out", "Print", "Println", "RelationalOperators", "SEMICOLON", "SL_COMMENT", "STRING", "Start", "StartgeneralArithExpr", "Static", "String_Dec", "Strings", "Sys_print", "System", "TYPE", "Term", "VAR", "VOID", "Whilestmt", "WhiteSpace", "'!'", "'&&'", "'('", "')'", "'*'", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'/'", "'<'", "'='", "'>'", "'['", "']'", "'a'", "'else'", "'for'", "'if'", "'return'", "'while'", "'{'", "'}'"
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
    public static final int T__80=80;
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
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
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


            char_literal5=(Token)match(input,79,FOLLOW_79_in_classDec159);  
            stream_79.add(char_literal5);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:48:36: ( stmt )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==BOOLEAN||LA4_0==DOUBLE||LA4_0==INT||LA4_0==Modifier||LA4_0==SEMICOLON||LA4_0==STRING||LA4_0==System||LA4_0==VAR||(LA4_0 >= 75 && LA4_0 <= 76)||LA4_0==78) ) {
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


            char_literal7=(Token)match(input,80,FOLLOW_80_in_classDec164);  
            stream_80.add(char_literal7);


            // AST REWRITE
            // elements: Class, VAR, 79, stmt, 80, Modifier
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
                stream_79.nextNode()
                );

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:48:83: ( stmt )*
                while ( stream_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmt.nextTree());

                }
                stream_stmt.reset();

                adaptor.addChild(root_1, 
                stream_80.nextNode()
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

                        if ( (LA5_21==SEMICOLON||LA5_21==63||LA5_21==69) ) {
                            alt5=1;
                        }
                        else if ( (LA5_21==VAR||LA5_21==57) ) {
                            alt5=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 21, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA5_12==57) ) {
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

                        if ( (LA5_22==SEMICOLON||LA5_22==63||LA5_22==69) ) {
                            alt5=1;
                        }
                        else if ( (LA5_22==VAR||LA5_22==57) ) {
                            alt5=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 22, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA5_13==57) ) {
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

                        if ( (LA5_23==SEMICOLON||LA5_23==69) ) {
                            alt5=8;
                        }
                        else if ( (LA5_23==VAR||LA5_23==57) ) {
                            alt5=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 23, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA5_14==57) ) {
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
                case 57:
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

                    if ( (LA5_16==SEMICOLON||LA5_16==63||LA5_16==69) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 16, input);

                        throw nvae;

                    }
                }
                else if ( (LA5_2==71) ) {
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

                    if ( (LA5_17==SEMICOLON||LA5_17==63||LA5_17==69) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 17, input);

                        throw nvae;

                    }
                }
                else if ( (LA5_3==71) ) {
                    alt5=9;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;

                }
                }
                break;
            case 76:
                {
                alt5=3;
                }
                break;
            case 78:
                {
                alt5=4;
                }
                break;
            case 75:
                {
                alt5=5;
                }
                break;
            case VAR:
                {
                switch ( input.LA(2) ) {
                case 69:
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

                                if ( (LA5_30==57) ) {
                                    switch ( input.LA(7) ) {
                                    case NUM:
                                    case VAR:
                                        {
                                        int LA5_32 = input.LA(8);

                                        if ( (LA5_32==58) ) {
                                            switch ( input.LA(9) ) {
                                            case 60:
                                            case 64:
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
                                            case 74:
                                            case 75:
                                            case 76:
                                            case 77:
                                            case 78:
                                            case 80:
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
                                        else if ( (LA5_32==NUM||LA5_32==VAR||LA5_32==63) ) {
                                            alt5=10;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 5, 32, input);

                                            throw nvae;

                                        }
                                        }
                                        break;
                                    case 58:
                                        {
                                        switch ( input.LA(8) ) {
                                        case 60:
                                        case 64:
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
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 80:
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
                                        break;
                                    case 63:
                                        {
                                        alt5=10;
                                        }
                                        break;
                                    default:
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
                        case 59:
                        case 60:
                        case 64:
                        case 67:
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
                    case DNUM:
                    case Fun:
                    case NUM:
                    case SEMICOLON:
                    case 55:
                    case 57:
                    case 60:
                    case 64:
                        {
                        alt5=6;
                        }
                        break;
                    case New:
                        {
                        alt5=10;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 18, input);

                        throw nvae;

                    }

                    }
                    break;
                case 61:
                case 62:
                case 65:
                case 66:
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

                    if ( (LA5_20==SEMICOLON||LA5_20==69) ) {
                        alt5=8;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 20, input);

                        throw nvae;

                    }
                }
                else if ( (LA5_8==71) ) {
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
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_Modifier=new RewriteRuleTokenStream(adaptor,"token Modifier");
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

            char_literal23=(Token)match(input,79,FOLLOW_79_in_method404);  
            stream_79.add(char_literal23);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:78:34: ( stmt )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==BOOLEAN||LA8_0==DOUBLE||LA8_0==INT||LA8_0==Modifier||LA8_0==SEMICOLON||LA8_0==STRING||LA8_0==System||LA8_0==VAR||(LA8_0 >= 75 && LA8_0 <= 76)||LA8_0==78) ) {
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


            string_literal25=(Token)match(input,77,FOLLOW_77_in_method409);  
            stream_77.add(string_literal25);


            pushFollow(FOLLOW_return_type_in_method411);
            return_type26=return_type();

            state._fsp--;

            stream_return_type.add(return_type26.getTree());

            SEMICOLON27=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_method413);  
            stream_SEMICOLON.add(SEMICOLON27);


            char_literal28=(Token)match(input,80,FOLLOW_80_in_method414);  
            stream_80.add(char_literal28);


            // AST REWRITE
            // elements: 77, VAR, 79, SEMICOLON, params, return_type, Modifier, 80, types, stmt
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
                stream_79.nextNode()
                );

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:79:47: ( stmt )*
                while ( stream_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmt.nextTree());

                }
                stream_stmt.reset();

                adaptor.addChild(root_1, 
                stream_77.nextNode()
                );

                adaptor.addChild(root_1, stream_return_type.nextTree());

                adaptor.addChild(root_1, 
                stream_SEMICOLON.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_80.nextNode()
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
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_Static=new RewriteRuleTokenStream(adaptor,"token Static");
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
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


            char_literal33=(Token)match(input,57,FOLLOW_57_in_main_method469);  
            stream_57.add(char_literal33);


            STRING34=(Token)match(input,STRING,FOLLOW_STRING_in_main_method470);  
            stream_STRING.add(STRING34);


            char_literal35=(Token)match(input,71,FOLLOW_71_in_main_method472);  
            stream_71.add(char_literal35);


            char_literal36=(Token)match(input,72,FOLLOW_72_in_main_method473);  
            stream_72.add(char_literal36);


            char_literal37=(Token)match(input,73,FOLLOW_73_in_main_method475);  
            stream_73.add(char_literal37);


            char_literal38=(Token)match(input,58,FOLLOW_58_in_main_method477);  
            stream_58.add(char_literal38);


            char_literal39=(Token)match(input,79,FOLLOW_79_in_main_method479);  
            stream_79.add(char_literal39);


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


            char_literal41=(Token)match(input,80,FOLLOW_80_in_main_method482);  
            stream_80.add(char_literal41);


            // AST REWRITE
            // elements: STRING, 72, 73, 71, 58, VOID, Modifier, print, 57, 79, Static, 80, Main
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
                stream_57.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_STRING.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_71.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_72.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_73.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_58.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_79.nextNode()
                );

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:86:138: ( print )*
                while ( stream_print.hasNext() ) {
                    adaptor.addChild(root_1, stream_print.nextTree());

                }
                stream_print.reset();

                adaptor.addChild(root_1, 
                stream_80.nextNode()
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
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
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


            char_literal47=(Token)match(input,57,FOLLOW_57_in_print527);  
            stream_57.add(char_literal47);


            New48=(Token)match(input,New,FOLLOW_New_in_print528);  
            stream_New.add(New48);


            VAR49=(Token)match(input,VAR,FOLLOW_VAR_in_print530);  
            stream_VAR.add(VAR49);


            char_literal50=(Token)match(input,57,FOLLOW_57_in_print532);  
            stream_57.add(char_literal50);


            char_literal51=(Token)match(input,58,FOLLOW_58_in_print533);  
            stream_58.add(char_literal51);


            Dot52=(Token)match(input,Dot,FOLLOW_Dot_in_print534);  
            stream_Dot.add(Dot52);


            VAR53=(Token)match(input,VAR,FOLLOW_VAR_in_print536);  
            stream_VAR.add(VAR53);


            char_literal54=(Token)match(input,57,FOLLOW_57_in_print538);  
            stream_57.add(char_literal54);


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


            char_literal56=(Token)match(input,58,FOLLOW_58_in_print541);  
            stream_58.add(char_literal56);


            char_literal57=(Token)match(input,58,FOLLOW_58_in_print543);  
            stream_58.add(char_literal57);


            SEMICOLON58=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_print545);  
            stream_SEMICOLON.add(SEMICOLON58);


            // AST REWRITE
            // elements: Dot, Dot, NUM, Out, VAR, New, 58, SEMICOLON, 58, Println, 57, 58, VAR, System, Dot, 57, 57
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
                stream_57.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_New.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_VAR.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_57.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_58.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_Dot.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_VAR.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_57.nextNode()
                );

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:87:149: ( NUM )?
                if ( stream_NUM.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_NUM.nextNode()
                    );

                }
                stream_NUM.reset();

                adaptor.addChild(root_1, 
                stream_58.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_58.nextNode()
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

                    if ( (LA11_0==71) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:93:20: '[' ']'
                            {
                            char_literal61=(Token)match(input,71,FOLLOW_71_in_initialize603); 
                            char_literal61_tree = 
                            (Object)adaptor.create(char_literal61)
                            ;
                            adaptor.addChild(root_0, char_literal61_tree);


                            char_literal62=(Token)match(input,72,FOLLOW_72_in_initialize604); 
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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:95:1: initialize_1 : VAR '=' ( New | VAR ) ( Dot )? VAR '(' ( NUM | VAR )? ( ',' )? ( NUM | VAR )? ')' ;
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
        Token set75=null;
        Token char_literal76=null;

        Object VAR67_tree=null;
        Object char_literal68_tree=null;
        Object set69_tree=null;
        Object Dot70_tree=null;
        Object VAR71_tree=null;
        Object char_literal72_tree=null;
        Object set73_tree=null;
        Object char_literal74_tree=null;
        Object set75_tree=null;
        Object char_literal76_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:96:2: ( VAR '=' ( New | VAR ) ( Dot )? VAR '(' ( NUM | VAR )? ( ',' )? ( NUM | VAR )? ')' )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:96:4: VAR '=' ( New | VAR ) ( Dot )? VAR '(' ( NUM | VAR )? ( ',' )? ( NUM | VAR )? ')'
            {
            root_0 = (Object)adaptor.nil();


            VAR67=(Token)match(input,VAR,FOLLOW_VAR_in_initialize_1625); 
            VAR67_tree = 
            (Object)adaptor.create(VAR67)
            ;
            adaptor.addChild(root_0, VAR67_tree);


            char_literal68=(Token)match(input,69,FOLLOW_69_in_initialize_1627); 
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


            char_literal72=(Token)match(input,57,FOLLOW_57_in_initialize_1640); 
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


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:96:44: ( ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==63) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:96:44: ','
                    {
                    char_literal74=(Token)match(input,63,FOLLOW_63_in_initialize_1647); 
                    char_literal74_tree = 
                    (Object)adaptor.create(char_literal74)
                    ;
                    adaptor.addChild(root_0, char_literal74_tree);


                    }
                    break;

            }


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:96:48: ( NUM | VAR )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==NUM||LA17_0==VAR) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:
                    {
                    set75=(Token)input.LT(1);

                    if ( input.LA(1)==NUM||input.LA(1)==VAR ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set75)
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


            char_literal76=(Token)match(input,58,FOLLOW_58_in_initialize_1656); 
            char_literal76_tree = 
            (Object)adaptor.create(char_literal76)
            ;
            adaptor.addChild(root_0, char_literal76_tree);


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

        Token System77=null;
        Token Dot78=null;
        Token Out79=null;
        Token Dot80=null;
        Token Println81=null;
        Token char_literal82=null;
        Token NUM83=null;
        Token VAR84=null;
        Token Dot85=null;
        Token VAR86=null;
        Token char_literal87=null;
        Token NUM88=null;
        Token char_literal89=null;
        Token char_literal90=null;
        Token SEMICOLON91=null;

        Object System77_tree=null;
        Object Dot78_tree=null;
        Object Out79_tree=null;
        Object Dot80_tree=null;
        Object Println81_tree=null;
        Object char_literal82_tree=null;
        Object NUM83_tree=null;
        Object VAR84_tree=null;
        Object Dot85_tree=null;
        Object VAR86_tree=null;
        Object char_literal87_tree=null;
        Object NUM88_tree=null;
        Object char_literal89_tree=null;
        Object char_literal90_tree=null;
        Object SEMICOLON91_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:98:2: ( System Dot Out Dot Println '(' ( NUM | VAR Dot VAR '(' ( NUM )? ')' ) ')' SEMICOLON )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:98:4: System Dot Out Dot Println '(' ( NUM | VAR Dot VAR '(' ( NUM )? ')' ) ')' SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            System77=(Token)match(input,System,FOLLOW_System_in_sys_print665); 
            System77_tree = 
            (Object)adaptor.create(System77)
            ;
            adaptor.addChild(root_0, System77_tree);


            Dot78=(Token)match(input,Dot,FOLLOW_Dot_in_sys_print667); 
            Dot78_tree = 
            (Object)adaptor.create(Dot78)
            ;
            adaptor.addChild(root_0, Dot78_tree);


            Out79=(Token)match(input,Out,FOLLOW_Out_in_sys_print669); 
            Out79_tree = 
            (Object)adaptor.create(Out79)
            ;
            adaptor.addChild(root_0, Out79_tree);


            Dot80=(Token)match(input,Dot,FOLLOW_Dot_in_sys_print671); 
            Dot80_tree = 
            (Object)adaptor.create(Dot80)
            ;
            adaptor.addChild(root_0, Dot80_tree);


            Println81=(Token)match(input,Println,FOLLOW_Println_in_sys_print673); 
            Println81_tree = 
            (Object)adaptor.create(Println81)
            ;
            adaptor.addChild(root_0, Println81_tree);


            char_literal82=(Token)match(input,57,FOLLOW_57_in_sys_print675); 
            char_literal82_tree = 
            (Object)adaptor.create(char_literal82)
            ;
            adaptor.addChild(root_0, char_literal82_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:98:34: ( NUM | VAR Dot VAR '(' ( NUM )? ')' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==NUM) ) {
                alt19=1;
            }
            else if ( (LA19_0==VAR) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:98:35: NUM
                    {
                    NUM83=(Token)match(input,NUM,FOLLOW_NUM_in_sys_print677); 
                    NUM83_tree = 
                    (Object)adaptor.create(NUM83)
                    ;
                    adaptor.addChild(root_0, NUM83_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:98:39: VAR Dot VAR '(' ( NUM )? ')'
                    {
                    VAR84=(Token)match(input,VAR,FOLLOW_VAR_in_sys_print679); 
                    VAR84_tree = 
                    (Object)adaptor.create(VAR84)
                    ;
                    adaptor.addChild(root_0, VAR84_tree);


                    Dot85=(Token)match(input,Dot,FOLLOW_Dot_in_sys_print681); 
                    Dot85_tree = 
                    (Object)adaptor.create(Dot85)
                    ;
                    adaptor.addChild(root_0, Dot85_tree);


                    VAR86=(Token)match(input,VAR,FOLLOW_VAR_in_sys_print683); 
                    VAR86_tree = 
                    (Object)adaptor.create(VAR86)
                    ;
                    adaptor.addChild(root_0, VAR86_tree);


                    char_literal87=(Token)match(input,57,FOLLOW_57_in_sys_print685); 
                    char_literal87_tree = 
                    (Object)adaptor.create(char_literal87)
                    ;
                    adaptor.addChild(root_0, char_literal87_tree);


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:98:54: ( NUM )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NUM) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:98:54: NUM
                            {
                            NUM88=(Token)match(input,NUM,FOLLOW_NUM_in_sys_print686); 
                            NUM88_tree = 
                            (Object)adaptor.create(NUM88)
                            ;
                            adaptor.addChild(root_0, NUM88_tree);


                            }
                            break;

                    }


                    char_literal89=(Token)match(input,58,FOLLOW_58_in_sys_print688); 
                    char_literal89_tree = 
                    (Object)adaptor.create(char_literal89)
                    ;
                    adaptor.addChild(root_0, char_literal89_tree);


                    }
                    break;

            }


            char_literal90=(Token)match(input,58,FOLLOW_58_in_sys_print692); 
            char_literal90_tree = 
            (Object)adaptor.create(char_literal90)
            ;
            adaptor.addChild(root_0, char_literal90_tree);


            SEMICOLON91=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_sys_print694); 
            SEMICOLON91_tree = 
            (Object)adaptor.create(SEMICOLON91)
            ;
            adaptor.addChild(root_0, SEMICOLON91_tree);


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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:99:1: object : ( ( '!' )? VAR Dot VAR '(' ( NUM | VAR )? ')' | ( VAR )? );
    public final ArithmeticExpressionsParser.object_return object() throws RecognitionException {
        ArithmeticExpressionsParser.object_return retval = new ArithmeticExpressionsParser.object_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal92=null;
        Token VAR93=null;
        Token Dot94=null;
        Token VAR95=null;
        Token char_literal96=null;
        Token set97=null;
        Token char_literal98=null;
        Token VAR99=null;

        Object char_literal92_tree=null;
        Object VAR93_tree=null;
        Object Dot94_tree=null;
        Object VAR95_tree=null;
        Object char_literal96_tree=null;
        Object set97_tree=null;
        Object char_literal98_tree=null;
        Object VAR99_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:99:8: ( ( '!' )? VAR Dot VAR '(' ( NUM | VAR )? ')' | ( VAR )? )
            int alt23=2;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt23=1;
                }
                break;
            case VAR:
                {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==Dot) ) {
                    alt23=1;
                }
                else if ( (LA23_2==AndOr||(LA23_2 >= RelationalOperators && LA23_2 <= SEMICOLON)||LA23_2==56||LA23_2==58||LA23_2==60||LA23_2==64||LA23_2==68||LA23_2==70) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;

                }
                }
                break;
            case AndOr:
            case RelationalOperators:
            case SEMICOLON:
            case 56:
            case 58:
            case 60:
            case 64:
            case 68:
            case 70:
                {
                alt23=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:99:10: ( '!' )? VAR Dot VAR '(' ( NUM | VAR )? ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:99:10: ( '!' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==55) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:99:11: '!'
                            {
                            char_literal92=(Token)match(input,55,FOLLOW_55_in_object702); 
                            char_literal92_tree = 
                            (Object)adaptor.create(char_literal92)
                            ;
                            adaptor.addChild(root_0, char_literal92_tree);


                            }
                            break;

                    }


                    VAR93=(Token)match(input,VAR,FOLLOW_VAR_in_object706); 
                    VAR93_tree = 
                    (Object)adaptor.create(VAR93)
                    ;
                    adaptor.addChild(root_0, VAR93_tree);


                    Dot94=(Token)match(input,Dot,FOLLOW_Dot_in_object708); 
                    Dot94_tree = 
                    (Object)adaptor.create(Dot94)
                    ;
                    adaptor.addChild(root_0, Dot94_tree);


                    VAR95=(Token)match(input,VAR,FOLLOW_VAR_in_object710); 
                    VAR95_tree = 
                    (Object)adaptor.create(VAR95)
                    ;
                    adaptor.addChild(root_0, VAR95_tree);


                    char_literal96=(Token)match(input,57,FOLLOW_57_in_object712); 
                    char_literal96_tree = 
                    (Object)adaptor.create(char_literal96)
                    ;
                    adaptor.addChild(root_0, char_literal96_tree);


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:99:33: ( NUM | VAR )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==NUM||LA21_0==VAR) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:
                            {
                            set97=(Token)input.LT(1);

                            if ( input.LA(1)==NUM||input.LA(1)==VAR ) {
                                input.consume();
                                adaptor.addChild(root_0, 
                                (Object)adaptor.create(set97)
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


                    char_literal98=(Token)match(input,58,FOLLOW_58_in_object721); 
                    char_literal98_tree = 
                    (Object)adaptor.create(char_literal98)
                    ;
                    adaptor.addChild(root_0, char_literal98_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:99:50: ( VAR )?
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:99:50: ( VAR )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==VAR) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:99:50: VAR
                            {
                            VAR99=(Token)match(input,VAR,FOLLOW_VAR_in_object725); 
                            VAR99_tree = 
                            (Object)adaptor.create(VAR99)
                            ;
                            adaptor.addChild(root_0, VAR99_tree);


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

        Token char_literal100=null;
        Token VAR102=null;
        Token VAR103=null;
        Token VAR104=null;
        Token char_literal105=null;
        Token VAR107=null;
        Token char_literal108=null;
        ArithmeticExpressionsParser.types_return types101 =null;

        ArithmeticExpressionsParser.types_return types106 =null;


        Object char_literal100_tree=null;
        Object VAR102_tree=null;
        Object VAR103_tree=null;
        Object VAR104_tree=null;
        Object char_literal105_tree=null;
        Object VAR107_tree=null;
        Object char_literal108_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:102:8: ( '(' ( ( types VAR | VAR VAR ) ( ',' types VAR )* )? ')' )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:102:10: '(' ( ( types VAR | VAR VAR ) ( ',' types VAR )* )? ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal100=(Token)match(input,57,FOLLOW_57_in_params735); 
            char_literal100_tree = 
            (Object)adaptor.create(char_literal100)
            ;
            adaptor.addChild(root_0, char_literal100_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:102:13: ( ( types VAR | VAR VAR ) ( ',' types VAR )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==BOOLEAN||LA26_0==DOUBLE||LA26_0==INT||LA26_0==STRING||LA26_0==VAR) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:102:14: ( types VAR | VAR VAR ) ( ',' types VAR )*
                    {
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:102:14: ( types VAR | VAR VAR )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==BOOLEAN||LA24_0==DOUBLE||LA24_0==INT||LA24_0==STRING) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==VAR) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;

                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:102:15: types VAR
                            {
                            pushFollow(FOLLOW_types_in_params738);
                            types101=types();

                            state._fsp--;

                            adaptor.addChild(root_0, types101.getTree());

                            VAR102=(Token)match(input,VAR,FOLLOW_VAR_in_params740); 
                            VAR102_tree = 
                            (Object)adaptor.create(VAR102)
                            ;
                            adaptor.addChild(root_0, VAR102_tree);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:102:25: VAR VAR
                            {
                            VAR103=(Token)match(input,VAR,FOLLOW_VAR_in_params742); 
                            VAR103_tree = 
                            (Object)adaptor.create(VAR103)
                            ;
                            adaptor.addChild(root_0, VAR103_tree);


                            VAR104=(Token)match(input,VAR,FOLLOW_VAR_in_params744); 
                            VAR104_tree = 
                            (Object)adaptor.create(VAR104)
                            ;
                            adaptor.addChild(root_0, VAR104_tree);


                            }
                            break;

                    }


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:102:34: ( ',' types VAR )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==63) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:102:35: ',' types VAR
                    	    {
                    	    char_literal105=(Token)match(input,63,FOLLOW_63_in_params748); 
                    	    char_literal105_tree = 
                    	    (Object)adaptor.create(char_literal105)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal105_tree);


                    	    pushFollow(FOLLOW_types_in_params750);
                    	    types106=types();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, types106.getTree());

                    	    VAR107=(Token)match(input,VAR,FOLLOW_VAR_in_params752); 
                    	    VAR107_tree = 
                    	    (Object)adaptor.create(VAR107)
                    	    ;
                    	    adaptor.addChild(root_0, VAR107_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal108=(Token)match(input,58,FOLLOW_58_in_params758); 
            char_literal108_tree = 
            (Object)adaptor.create(char_literal108)
            ;
            adaptor.addChild(root_0, char_literal108_tree);


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

        ArithmeticExpressionsParser.int_dec_return int_dec109 =null;

        ArithmeticExpressionsParser.double_dec_return double_dec110 =null;


        RewriteRuleSubtreeStream stream_int_dec=new RewriteRuleSubtreeStream(adaptor,"rule int_dec");
        RewriteRuleSubtreeStream stream_double_dec=new RewriteRuleSubtreeStream(adaptor,"rule double_dec");
        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:103:9: ( int_dec -> ^( Int_dec int_dec ) | double_dec -> ^( Double_dec double_dec ) )
            int alt27=2;
            switch ( input.LA(1) ) {
            case Modifier:
                {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==INT) ) {
                    alt27=1;
                }
                else if ( (LA27_1==DOUBLE) ) {
                    alt27=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt27=1;
                }
                break;
            case DOUBLE:
                {
                alt27=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:104:2: int_dec
                    {
                    pushFollow(FOLLOW_int_dec_in_decl772);
                    int_dec109=int_dec();

                    state._fsp--;

                    stream_int_dec.add(int_dec109.getTree());

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
                    pushFollow(FOLLOW_double_dec_in_decl784);
                    double_dec110=double_dec();

                    state._fsp--;

                    stream_double_dec.add(double_dec110.getTree());

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

        Token char_literal111=null;
        Token char_literal113=null;
        ArithmeticExpressionsParser.condition_return condition112 =null;

        ArithmeticExpressionsParser.object_return object114 =null;


        Object char_literal111_tree=null;
        Object char_literal113_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:108:4: ( '(' condition ')' | object )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==57) ) {
                alt28=1;
            }
            else if ( (LA28_0==AndOr||(LA28_0 >= RelationalOperators && LA28_0 <= SEMICOLON)||LA28_0==VAR||(LA28_0 >= 55 && LA28_0 <= 56)||LA28_0==58||LA28_0==60||LA28_0==64||LA28_0==68||LA28_0==70) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:108:6: '(' condition ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal111=(Token)match(input,57,FOLLOW_57_in_while_condition805); 
                    char_literal111_tree = 
                    (Object)adaptor.create(char_literal111)
                    ;
                    adaptor.addChild(root_0, char_literal111_tree);


                    pushFollow(FOLLOW_condition_in_while_condition807);
                    condition112=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, condition112.getTree());

                    char_literal113=(Token)match(input,58,FOLLOW_58_in_while_condition809); 
                    char_literal113_tree = 
                    (Object)adaptor.create(char_literal113)
                    ;
                    adaptor.addChild(root_0, char_literal113_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:108:24: object
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_object_in_while_condition811);
                    object114=object();

                    state._fsp--;

                    adaptor.addChild(root_0, object114.getTree());

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

        Token string_literal115=null;
        Token char_literal116=null;
        Token char_literal118=null;
        Token char_literal119=null;
        Token char_literal121=null;
        ArithmeticExpressionsParser.while_condition_return while_condition117 =null;

        ArithmeticExpressionsParser.stmt_return stmt120 =null;


        Object string_literal115_tree=null;
        Object char_literal116_tree=null;
        Object char_literal118_tree=null;
        Object char_literal119_tree=null;
        Object char_literal121_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleSubtreeStream stream_while_condition=new RewriteRuleSubtreeStream(adaptor,"rule while_condition");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:109:11: ( 'while' '(' while_condition ')' '{' ( stmt )* '}' -> ^( Whilestmt 'while' '(' while_condition ')' '{' ( stmt )* '}' ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:110:2: 'while' '(' while_condition ')' '{' ( stmt )* '}'
            {
            string_literal115=(Token)match(input,78,FOLLOW_78_in_whilestmt820);  
            stream_78.add(string_literal115);


            char_literal116=(Token)match(input,57,FOLLOW_57_in_whilestmt822);  
            stream_57.add(char_literal116);


            pushFollow(FOLLOW_while_condition_in_whilestmt824);
            while_condition117=while_condition();

            state._fsp--;

            stream_while_condition.add(while_condition117.getTree());

            char_literal118=(Token)match(input,58,FOLLOW_58_in_whilestmt826);  
            stream_58.add(char_literal118);


            char_literal119=(Token)match(input,79,FOLLOW_79_in_whilestmt828);  
            stream_79.add(char_literal119);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:110:38: ( stmt )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==BOOLEAN||LA29_0==DOUBLE||LA29_0==INT||LA29_0==Modifier||LA29_0==SEMICOLON||LA29_0==STRING||LA29_0==System||LA29_0==VAR||(LA29_0 >= 75 && LA29_0 <= 76)||LA29_0==78) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:110:38: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_whilestmt830);
            	    stmt120=stmt();

            	    state._fsp--;

            	    stream_stmt.add(stmt120.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            char_literal121=(Token)match(input,80,FOLLOW_80_in_whilestmt833);  
            stream_80.add(char_literal121);


            // AST REWRITE
            // elements: 78, while_condition, stmt, 80, 79, 57, 58
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
                stream_78.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_57.nextNode()
                );

                adaptor.addChild(root_1, stream_while_condition.nextTree());

                adaptor.addChild(root_1, 
                stream_58.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_79.nextNode()
                );

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:111:54: ( stmt )*
                while ( stream_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmt.nextTree());

                }
                stream_stmt.reset();

                adaptor.addChild(root_1, 
                stream_80.nextNode()
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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:116:1: ifstmt : 'if' '(' ( '!' )? ( '(' )? if_cond ( ')' )? ')' ( '{' )? ( stmt )* ( '}' )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )? ;
    public final ArithmeticExpressionsParser.ifstmt_return ifstmt() throws RecognitionException {
        ArithmeticExpressionsParser.ifstmt_return retval = new ArithmeticExpressionsParser.ifstmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal122=null;
        Token char_literal123=null;
        Token char_literal124=null;
        Token char_literal125=null;
        Token char_literal127=null;
        Token char_literal128=null;
        Token char_literal129=null;
        Token char_literal131=null;
        Token string_literal132=null;
        Token char_literal133=null;
        Token char_literal135=null;
        Token string_literal136=null;
        Token char_literal137=null;
        Token char_literal139=null;
        ArithmeticExpressionsParser.if_cond_return if_cond126 =null;

        ArithmeticExpressionsParser.stmt_return stmt130 =null;

        ArithmeticExpressionsParser.stmt_return stmt134 =null;

        ArithmeticExpressionsParser.stmt_return stmt138 =null;


        Object string_literal122_tree=null;
        Object char_literal123_tree=null;
        Object char_literal124_tree=null;
        Object char_literal125_tree=null;
        Object char_literal127_tree=null;
        Object char_literal128_tree=null;
        Object char_literal129_tree=null;
        Object char_literal131_tree=null;
        Object string_literal132_tree=null;
        Object char_literal133_tree=null;
        Object char_literal135_tree=null;
        Object string_literal136_tree=null;
        Object char_literal137_tree=null;
        Object char_literal139_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:116:9: ( 'if' '(' ( '!' )? ( '(' )? if_cond ( ')' )? ')' ( '{' )? ( stmt )* ( '}' )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )? )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:2: 'if' '(' ( '!' )? ( '(' )? if_cond ( ')' )? ')' ( '{' )? ( stmt )* ( '}' )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal122=(Token)match(input,76,FOLLOW_76_in_ifstmt878); 
            string_literal122_tree = 
            (Object)adaptor.create(string_literal122)
            ;
            adaptor.addChild(root_0, string_literal122_tree);


            char_literal123=(Token)match(input,57,FOLLOW_57_in_ifstmt880); 
            char_literal123_tree = 
            (Object)adaptor.create(char_literal123)
            ;
            adaptor.addChild(root_0, char_literal123_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:11: ( '!' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==55) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:12: '!'
                    {
                    char_literal124=(Token)match(input,55,FOLLOW_55_in_ifstmt883); 
                    char_literal124_tree = 
                    (Object)adaptor.create(char_literal124)
                    ;
                    adaptor.addChild(root_0, char_literal124_tree);


                    }
                    break;

            }


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:19: ( '(' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==57) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:20: '('
                    {
                    char_literal125=(Token)match(input,57,FOLLOW_57_in_ifstmt889); 
                    char_literal125_tree = 
                    (Object)adaptor.create(char_literal125)
                    ;
                    adaptor.addChild(root_0, char_literal125_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_if_cond_in_ifstmt893);
            if_cond126=if_cond();

            state._fsp--;

            adaptor.addChild(root_0, if_cond126.getTree());

            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:34: ( ')' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==58) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==58) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:35: ')'
                    {
                    char_literal127=(Token)match(input,58,FOLLOW_58_in_ifstmt896); 
                    char_literal127_tree = 
                    (Object)adaptor.create(char_literal127)
                    ;
                    adaptor.addChild(root_0, char_literal127_tree);


                    }
                    break;

            }


            char_literal128=(Token)match(input,58,FOLLOW_58_in_ifstmt900); 
            char_literal128_tree = 
            (Object)adaptor.create(char_literal128)
            ;
            adaptor.addChild(root_0, char_literal128_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:45: ( '{' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==79) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:46: '{'
                    {
                    char_literal129=(Token)match(input,79,FOLLOW_79_in_ifstmt903); 
                    char_literal129_tree = 
                    (Object)adaptor.create(char_literal129)
                    ;
                    adaptor.addChild(root_0, char_literal129_tree);


                    }
                    break;

            }


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:52: ( stmt )*
            loop34:
            do {
                int alt34=2;
                switch ( input.LA(1) ) {
                case Modifier:
                    {
                    alt34=1;
                    }
                    break;
                case INT:
                    {
                    alt34=1;
                    }
                    break;
                case DOUBLE:
                    {
                    alt34=1;
                    }
                    break;
                case 76:
                    {
                    alt34=1;
                    }
                    break;
                case 78:
                    {
                    alt34=1;
                    }
                    break;
                case 75:
                    {
                    alt34=1;
                    }
                    break;
                case VAR:
                    {
                    alt34=1;
                    }
                    break;
                case STRING:
                    {
                    alt34=1;
                    }
                    break;
                case BOOLEAN:
                    {
                    alt34=1;
                    }
                    break;
                case SEMICOLON:
                    {
                    alt34=1;
                    }
                    break;
                case System:
                    {
                    alt34=1;
                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:52: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_ifstmt907);
            	    stmt130=stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stmt130.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:58: ( '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==80) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:59: '}'
                    {
                    char_literal131=(Token)match(input,80,FOLLOW_80_in_ifstmt911); 
                    char_literal131_tree = 
                    (Object)adaptor.create(char_literal131)
                    ;
                    adaptor.addChild(root_0, char_literal131_tree);


                    }
                    break;

            }


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:65: ( 'else' ( '{' )? ( stmt )* ( '}' )? )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==74) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:66: 'else' ( '{' )? ( stmt )* ( '}' )?
                    {
                    string_literal132=(Token)match(input,74,FOLLOW_74_in_ifstmt916); 
                    string_literal132_tree = 
                    (Object)adaptor.create(string_literal132)
                    ;
                    adaptor.addChild(root_0, string_literal132_tree);


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:73: ( '{' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==79) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:74: '{'
                            {
                            char_literal133=(Token)match(input,79,FOLLOW_79_in_ifstmt919); 
                            char_literal133_tree = 
                            (Object)adaptor.create(char_literal133)
                            ;
                            adaptor.addChild(root_0, char_literal133_tree);


                            }
                            break;

                    }


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:80: ( stmt )*
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
                        case 76:
                            {
                            alt37=1;
                            }
                            break;
                        case 78:
                            {
                            alt37=1;
                            }
                            break;
                        case 75:
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
                    	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:80: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_ifstmt923);
                    	    stmt134=stmt();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, stmt134.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:86: ( '}' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==80) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:87: '}'
                            {
                            char_literal135=(Token)match(input,80,FOLLOW_80_in_ifstmt927); 
                            char_literal135_tree = 
                            (Object)adaptor.create(char_literal135)
                            ;
                            adaptor.addChild(root_0, char_literal135_tree);


                            }
                            break;

                    }


                    }
                    break;

            }


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:95: ( 'else' ( '{' )? ( stmt )* ( '}' )? )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==74) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:96: 'else' ( '{' )? ( stmt )* ( '}' )?
                    {
                    string_literal136=(Token)match(input,74,FOLLOW_74_in_ifstmt934); 
                    string_literal136_tree = 
                    (Object)adaptor.create(string_literal136)
                    ;
                    adaptor.addChild(root_0, string_literal136_tree);


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:103: ( '{' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==79) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:104: '{'
                            {
                            char_literal137=(Token)match(input,79,FOLLOW_79_in_ifstmt937); 
                            char_literal137_tree = 
                            (Object)adaptor.create(char_literal137)
                            ;
                            adaptor.addChild(root_0, char_literal137_tree);


                            }
                            break;

                    }


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:110: ( stmt )*
                    loop41:
                    do {
                        int alt41=2;
                        switch ( input.LA(1) ) {
                        case Modifier:
                            {
                            alt41=1;
                            }
                            break;
                        case INT:
                            {
                            alt41=1;
                            }
                            break;
                        case DOUBLE:
                            {
                            alt41=1;
                            }
                            break;
                        case 76:
                            {
                            alt41=1;
                            }
                            break;
                        case 78:
                            {
                            alt41=1;
                            }
                            break;
                        case 75:
                            {
                            alt41=1;
                            }
                            break;
                        case VAR:
                            {
                            alt41=1;
                            }
                            break;
                        case STRING:
                            {
                            alt41=1;
                            }
                            break;
                        case BOOLEAN:
                            {
                            alt41=1;
                            }
                            break;
                        case SEMICOLON:
                            {
                            alt41=1;
                            }
                            break;
                        case System:
                            {
                            alt41=1;
                            }
                            break;

                        }

                        switch (alt41) {
                    	case 1 :
                    	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:110: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_ifstmt941);
                    	    stmt138=stmt();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, stmt138.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:116: ( '}' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==80) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:117: '}'
                            {
                            char_literal139=(Token)match(input,80,FOLLOW_80_in_ifstmt945); 
                            char_literal139_tree = 
                            (Object)adaptor.create(char_literal139)
                            ;
                            adaptor.addChild(root_0, char_literal139_tree);


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

        ArithmeticExpressionsParser.if_nor_return if_nor140 =null;



        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:120:10: ( if_nor )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:120:13: if_nor
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_if_nor_in_if_cond963);
            if_nor140=if_nor();

            state._fsp--;

            adaptor.addChild(root_0, if_nor140.getTree());

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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:121:2: if_nor : object ( ( '>' | '<' | '&&' ) ^ object )* ;
    public final ArithmeticExpressionsParser.if_nor_return if_nor() throws RecognitionException {
        ArithmeticExpressionsParser.if_nor_return retval = new ArithmeticExpressionsParser.if_nor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set142=null;
        ArithmeticExpressionsParser.object_return object141 =null;

        ArithmeticExpressionsParser.object_return object143 =null;


        Object set142_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:121:9: ( object ( ( '>' | '<' | '&&' ) ^ object )* )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:121:12: object ( ( '>' | '<' | '&&' ) ^ object )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_object_in_if_nor975);
            object141=object();

            state._fsp--;

            adaptor.addChild(root_0, object141.getTree());

            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:121:19: ( ( '>' | '<' | '&&' ) ^ object )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==56||LA44_0==68||LA44_0==70) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:121:20: ( '>' | '<' | '&&' ) ^ object
            	    {
            	    set142=(Token)input.LT(1);

            	    set142=(Token)input.LT(1);

            	    if ( input.LA(1)==56||input.LA(1)==68||input.LA(1)==70 ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set142)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_object_in_if_nor993);
            	    object143=object();

            	    state._fsp--;

            	    adaptor.addChild(root_0, object143.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
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

        Token string_literal144=null;
        Token char_literal145=null;
        Token SEMICOLON148=null;
        Token VAR149=null;
        Token char_literal151=null;
        Token char_literal152=null;
        Token char_literal154=null;
        ArithmeticExpressionsParser.decl_return decl146 =null;

        ArithmeticExpressionsParser.condition_return condition147 =null;

        ArithmeticExpressionsParser.change_return change150 =null;

        ArithmeticExpressionsParser.stmt_return stmt153 =null;


        Object string_literal144_tree=null;
        Object char_literal145_tree=null;
        Object SEMICOLON148_tree=null;
        Object VAR149_tree=null;
        Object char_literal151_tree=null;
        Object char_literal152_tree=null;
        Object char_literal154_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:122:9: ( 'for' '(' ( decl ) ( condition ) SEMICOLON ( VAR change ) ')' '{' ( stmt )* '}' )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:123:2: 'for' '(' ( decl ) ( condition ) SEMICOLON ( VAR change ) ')' '{' ( stmt )* '}'
            {
            root_0 = (Object)adaptor.nil();


            string_literal144=(Token)match(input,75,FOLLOW_75_in_forloop1007); 
            string_literal144_tree = 
            (Object)adaptor.create(string_literal144)
            ;
            adaptor.addChild(root_0, string_literal144_tree);


            char_literal145=(Token)match(input,57,FOLLOW_57_in_forloop1009); 
            char_literal145_tree = 
            (Object)adaptor.create(char_literal145)
            ;
            adaptor.addChild(root_0, char_literal145_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:123:12: ( decl )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:123:13: decl
            {
            pushFollow(FOLLOW_decl_in_forloop1012);
            decl146=decl();

            state._fsp--;

            adaptor.addChild(root_0, decl146.getTree());

            }


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:123:19: ( condition )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:123:20: condition
            {
            pushFollow(FOLLOW_condition_in_forloop1016);
            condition147=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition147.getTree());

            }


            SEMICOLON148=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_forloop1019); 
            SEMICOLON148_tree = 
            (Object)adaptor.create(SEMICOLON148)
            ;
            adaptor.addChild(root_0, SEMICOLON148_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:123:41: ( VAR change )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:123:42: VAR change
            {
            VAR149=(Token)match(input,VAR,FOLLOW_VAR_in_forloop1022); 
            VAR149_tree = 
            (Object)adaptor.create(VAR149)
            ;
            adaptor.addChild(root_0, VAR149_tree);


            pushFollow(FOLLOW_change_in_forloop1024);
            change150=change();

            state._fsp--;

            adaptor.addChild(root_0, change150.getTree());

            }


            char_literal151=(Token)match(input,58,FOLLOW_58_in_forloop1027); 
            char_literal151_tree = 
            (Object)adaptor.create(char_literal151)
            ;
            adaptor.addChild(root_0, char_literal151_tree);


            char_literal152=(Token)match(input,79,FOLLOW_79_in_forloop1029); 
            char_literal152_tree = 
            (Object)adaptor.create(char_literal152)
            ;
            adaptor.addChild(root_0, char_literal152_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:123:62: ( stmt )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==BOOLEAN||LA45_0==DOUBLE||LA45_0==INT||LA45_0==Modifier||LA45_0==SEMICOLON||LA45_0==STRING||LA45_0==System||LA45_0==VAR||(LA45_0 >= 75 && LA45_0 <= 76)||LA45_0==78) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:123:62: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_forloop1031);
            	    stmt153=stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stmt153.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            char_literal154=(Token)match(input,80,FOLLOW_80_in_forloop1034); 
            char_literal154_tree = 
            (Object)adaptor.create(char_literal154)
            ;
            adaptor.addChild(root_0, char_literal154_tree);


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

        ArithmeticExpressionsParser.assign_return assign155 =null;


        RewriteRuleSubtreeStream stream_assign=new RewriteRuleSubtreeStream(adaptor,"rule assign");
        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:125:10: ( assign -> ^( Assigment assign ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:126:2: assign
            {
            pushFollow(FOLLOW_assign_in_assigment1046);
            assign155=assign();

            state._fsp--;

            stream_assign.add(assign155.getTree());

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

        Token VAR156=null;
        Token char_literal158=null;
        Token SEMICOLON160=null;
        ArithmeticExpressionsParser.change_return change157 =null;

        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr159 =null;


        Object VAR156_tree=null;
        Object char_literal158_tree=null;
        Object SEMICOLON160_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:134:8: ( VAR ( change | '=' generalArithExpr ) SEMICOLON )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:135:2: VAR ( change | '=' generalArithExpr ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            VAR156=(Token)match(input,VAR,FOLLOW_VAR_in_assign1090); 
            VAR156_tree = 
            (Object)adaptor.create(VAR156)
            ;
            adaptor.addChild(root_0, VAR156_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:135:6: ( change | '=' generalArithExpr )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0 >= 61 && LA46_0 <= 62)||(LA46_0 >= 65 && LA46_0 <= 66)) ) {
                alt46=1;
            }
            else if ( (LA46_0==69) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }
            switch (alt46) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:135:7: change
                    {
                    pushFollow(FOLLOW_change_in_assign1093);
                    change157=change();

                    state._fsp--;

                    adaptor.addChild(root_0, change157.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:135:14: '=' generalArithExpr
                    {
                    char_literal158=(Token)match(input,69,FOLLOW_69_in_assign1095); 
                    char_literal158_tree = 
                    (Object)adaptor.create(char_literal158)
                    ;
                    adaptor.addChild(root_0, char_literal158_tree);


                    pushFollow(FOLLOW_generalArithExpr_in_assign1097);
                    generalArithExpr159=generalArithExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, generalArithExpr159.getTree());

                    }
                    break;

            }


            SEMICOLON160=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assign1100); 
            SEMICOLON160_tree = 
            (Object)adaptor.create(SEMICOLON160)
            ;
            adaptor.addChild(root_0, SEMICOLON160_tree);


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

        Token string_literal161=null;
        Token string_literal162=null;
        Token set163=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr164 =null;


        Object string_literal161_tree=null;
        Object string_literal162_tree=null;
        Object set163_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:137:8: ( ( '++' | '--' | ( '+=' | '-=' ) generalArithExpr ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:138:2: ( '++' | '--' | ( '+=' | '-=' ) generalArithExpr )
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:138:2: ( '++' | '--' | ( '+=' | '-=' ) generalArithExpr )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt47=1;
                }
                break;
            case 65:
                {
                alt47=2;
                }
                break;
            case 62:
            case 66:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }

            switch (alt47) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:138:3: '++'
                    {
                    string_literal161=(Token)match(input,61,FOLLOW_61_in_change1111); 
                    string_literal161_tree = 
                    (Object)adaptor.create(string_literal161)
                    ;
                    adaptor.addChild(root_0, string_literal161_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:138:8: '--'
                    {
                    string_literal162=(Token)match(input,65,FOLLOW_65_in_change1113); 
                    string_literal162_tree = 
                    (Object)adaptor.create(string_literal162)
                    ;
                    adaptor.addChild(root_0, string_literal162_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:138:13: ( '+=' | '-=' ) generalArithExpr
                    {
                    set163=(Token)input.LT(1);

                    if ( input.LA(1)==62||input.LA(1)==66 ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set163)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_generalArithExpr_in_change1120);
                    generalArithExpr164=generalArithExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, generalArithExpr164.getTree());

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

        Token RelationalOperators166=null;
        Token AndOr168=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr165 =null;

        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr167 =null;

        ArithmeticExpressionsParser.condition_return condition169 =null;


        Object RelationalOperators166_tree=null;
        Object AndOr168_tree=null;
        RewriteRuleTokenStream stream_RelationalOperators=new RewriteRuleTokenStream(adaptor,"token RelationalOperators");
        RewriteRuleTokenStream stream_AndOr=new RewriteRuleTokenStream(adaptor,"token AndOr");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_generalArithExpr=new RewriteRuleSubtreeStream(adaptor,"rule generalArithExpr");
        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:141:10: ( generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? -> ^( Condition generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:142:2: generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )?
            {
            pushFollow(FOLLOW_generalArithExpr_in_condition1133);
            generalArithExpr165=generalArithExpr();

            state._fsp--;

            stream_generalArithExpr.add(generalArithExpr165.getTree());

            RelationalOperators166=(Token)match(input,RelationalOperators,FOLLOW_RelationalOperators_in_condition1135);  
            stream_RelationalOperators.add(RelationalOperators166);


            pushFollow(FOLLOW_generalArithExpr_in_condition1137);
            generalArithExpr167=generalArithExpr();

            state._fsp--;

            stream_generalArithExpr.add(generalArithExpr167.getTree());

            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:142:56: ( AndOr condition )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==AndOr) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:142:57: AndOr condition
                    {
                    AndOr168=(Token)match(input,AndOr,FOLLOW_AndOr_in_condition1140);  
                    stream_AndOr.add(AndOr168);


                    pushFollow(FOLLOW_condition_in_condition1142);
                    condition169=condition();

                    state._fsp--;

                    stream_condition.add(condition169.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: AndOr, RelationalOperators, condition, generalArithExpr, generalArithExpr
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

        Token Modifier170=null;
        Token INT171=null;
        Token VAR172=null;
        Token char_literal173=null;
        Token char_literal175=null;
        Token VAR176=null;
        Token SEMICOLON177=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr174 =null;


        Object Modifier170_tree=null;
        Object INT171_tree=null;
        Object VAR172_tree=null;
        Object char_literal173_tree=null;
        Object char_literal175_tree=null;
        Object VAR176_tree=null;
        Object SEMICOLON177_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:150:9: ( ( Modifier )? INT VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:152:2: ( Modifier )? INT VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:152:2: ( Modifier )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==Modifier) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:152:2: Modifier
                    {
                    Modifier170=(Token)match(input,Modifier,FOLLOW_Modifier_in_int_dec1201); 
                    Modifier170_tree = 
                    (Object)adaptor.create(Modifier170)
                    ;
                    adaptor.addChild(root_0, Modifier170_tree);


                    }
                    break;

            }


            INT171=(Token)match(input,INT,FOLLOW_INT_in_int_dec1204); 
            INT171_tree = 
            (Object)adaptor.create(INT171)
            ;
            adaptor.addChild(root_0, INT171_tree);


            VAR172=(Token)match(input,VAR,FOLLOW_VAR_in_int_dec1206); 
            VAR172_tree = 
            (Object)adaptor.create(VAR172)
            ;
            adaptor.addChild(root_0, VAR172_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:152:20: ( ( '=' generalArithExpr )? | ( ',' VAR )* )
            int alt52=2;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt52=1;
                }
                break;
            case SEMICOLON:
                {
                alt52=1;
                }
                break;
            case 63:
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
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:152:21: ( '=' generalArithExpr )?
                    {
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:152:21: ( '=' generalArithExpr )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==69) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:152:22: '=' generalArithExpr
                            {
                            char_literal173=(Token)match(input,69,FOLLOW_69_in_int_dec1210); 
                            char_literal173_tree = 
                            (Object)adaptor.create(char_literal173)
                            ;
                            adaptor.addChild(root_0, char_literal173_tree);


                            pushFollow(FOLLOW_generalArithExpr_in_int_dec1212);
                            generalArithExpr174=generalArithExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, generalArithExpr174.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:152:45: ( ',' VAR )*
                    {
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:152:45: ( ',' VAR )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==63) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:152:46: ',' VAR
                    	    {
                    	    char_literal175=(Token)match(input,63,FOLLOW_63_in_int_dec1217); 
                    	    char_literal175_tree = 
                    	    (Object)adaptor.create(char_literal175)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal175_tree);


                    	    VAR176=(Token)match(input,VAR,FOLLOW_VAR_in_int_dec1219); 
                    	    VAR176_tree = 
                    	    (Object)adaptor.create(VAR176)
                    	    ;
                    	    adaptor.addChild(root_0, VAR176_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }


            SEMICOLON177=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_int_dec1224); 
            SEMICOLON177_tree = 
            (Object)adaptor.create(SEMICOLON177)
            ;
            adaptor.addChild(root_0, SEMICOLON177_tree);


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

        Token Modifier178=null;
        Token DOUBLE179=null;
        Token VAR180=null;
        Token char_literal181=null;
        Token char_literal183=null;
        Token VAR184=null;
        Token SEMICOLON185=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr182 =null;


        Object Modifier178_tree=null;
        Object DOUBLE179_tree=null;
        Object VAR180_tree=null;
        Object char_literal181_tree=null;
        Object char_literal183_tree=null;
        Object VAR184_tree=null;
        Object SEMICOLON185_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:155:11: ( ( Modifier )? DOUBLE VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:157:2: ( Modifier )? DOUBLE VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:157:2: ( Modifier )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==Modifier) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:157:2: Modifier
                    {
                    Modifier178=(Token)match(input,Modifier,FOLLOW_Modifier_in_double_dec1239); 
                    Modifier178_tree = 
                    (Object)adaptor.create(Modifier178)
                    ;
                    adaptor.addChild(root_0, Modifier178_tree);


                    }
                    break;

            }


            DOUBLE179=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_double_dec1242); 
            DOUBLE179_tree = 
            (Object)adaptor.create(DOUBLE179)
            ;
            adaptor.addChild(root_0, DOUBLE179_tree);


            VAR180=(Token)match(input,VAR,FOLLOW_VAR_in_double_dec1244); 
            VAR180_tree = 
            (Object)adaptor.create(VAR180)
            ;
            adaptor.addChild(root_0, VAR180_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:157:23: ( ( '=' generalArithExpr )? | ( ',' VAR )* )
            int alt56=2;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt56=1;
                }
                break;
            case SEMICOLON:
                {
                alt56=1;
                }
                break;
            case 63:
                {
                alt56=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }

            switch (alt56) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:157:24: ( '=' generalArithExpr )?
                    {
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:157:24: ( '=' generalArithExpr )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==69) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:157:25: '=' generalArithExpr
                            {
                            char_literal181=(Token)match(input,69,FOLLOW_69_in_double_dec1248); 
                            char_literal181_tree = 
                            (Object)adaptor.create(char_literal181)
                            ;
                            adaptor.addChild(root_0, char_literal181_tree);


                            pushFollow(FOLLOW_generalArithExpr_in_double_dec1250);
                            generalArithExpr182=generalArithExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, generalArithExpr182.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:157:48: ( ',' VAR )*
                    {
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:157:48: ( ',' VAR )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==63) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:157:49: ',' VAR
                    	    {
                    	    char_literal183=(Token)match(input,63,FOLLOW_63_in_double_dec1255); 
                    	    char_literal183_tree = 
                    	    (Object)adaptor.create(char_literal183)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal183_tree);


                    	    VAR184=(Token)match(input,VAR,FOLLOW_VAR_in_double_dec1257); 
                    	    VAR184_tree = 
                    	    (Object)adaptor.create(VAR184)
                    	    ;
                    	    adaptor.addChild(root_0, VAR184_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);


                    }
                    break;

            }


            SEMICOLON185=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_double_dec1262); 
            SEMICOLON185_tree = 
            (Object)adaptor.create(SEMICOLON185)
            ;
            adaptor.addChild(root_0, SEMICOLON185_tree);


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

        Token Modifier186=null;
        Token STRING187=null;
        Token VAR188=null;
        Token char_literal189=null;
        Token Strings190=null;
        Token SEMICOLON191=null;

        Object Modifier186_tree=null;
        Object STRING187_tree=null;
        Object VAR188_tree=null;
        Object char_literal189_tree=null;
        Object Strings190_tree=null;
        Object SEMICOLON191_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
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
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==Modifier) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:162:2: Modifier
                    {
                    Modifier186=(Token)match(input,Modifier,FOLLOW_Modifier_in_string_dec1275);  
                    stream_Modifier.add(Modifier186);


                    }
                    break;

            }


            STRING187=(Token)match(input,STRING,FOLLOW_STRING_in_string_dec1278);  
            stream_STRING.add(STRING187);


            VAR188=(Token)match(input,VAR,FOLLOW_VAR_in_string_dec1280);  
            stream_VAR.add(VAR188);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:162:23: ( '=' Strings )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==69) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:162:24: '=' Strings
                    {
                    char_literal189=(Token)match(input,69,FOLLOW_69_in_string_dec1283);  
                    stream_69.add(char_literal189);


                    Strings190=(Token)match(input,Strings,FOLLOW_Strings_in_string_dec1285);  
                    stream_Strings.add(Strings190);


                    }
                    break;

            }


            SEMICOLON191=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_string_dec1289);  
            stream_SEMICOLON.add(SEMICOLON191);


            // AST REWRITE
            // elements: STRING, 69, Strings, Modifier, VAR, SEMICOLON
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
                if ( stream_69.hasNext()||stream_Strings.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_69.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_Strings.nextNode()
                    );

                }
                stream_69.reset();
                stream_Strings.reset();

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

        Token set193=null;
        ArithmeticExpressionsParser.term_return term192 =null;

        ArithmeticExpressionsParser.term_return term194 =null;


        Object set193_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:165:17: ( term ( ( '+' | '-' ) ^ term )* )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:165:19: term ( ( '+' | '-' ) ^ term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_generalArithExpr1321);
            term192=term();

            state._fsp--;

            adaptor.addChild(root_0, term192.getTree());

            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:165:24: ( ( '+' | '-' ) ^ term )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==60||LA59_0==64) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:165:25: ( '+' | '-' ) ^ term
            	    {
            	    set193=(Token)input.LT(1);

            	    set193=(Token)input.LT(1);

            	    if ( input.LA(1)==60||input.LA(1)==64 ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set193)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_term_in_generalArithExpr1336);
            	    term194=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term194.getTree());

            	    }
            	    break;

            	default :
            	    break loop59;
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

        Token set197=null;
        ArithmeticExpressionsParser.object_return object195 =null;

        ArithmeticExpressionsParser.factor_return factor196 =null;

        ArithmeticExpressionsParser.factor_return factor198 =null;


        Object set197_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:173:6: ( object | factor ( ( '*' | '/' ) ^ factor )* )
            int alt61=2;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt61=1;
                }
                break;
            case AndOr:
            case RelationalOperators:
            case SEMICOLON:
            case VAR:
            case 58:
            case 60:
                {
                alt61=1;
                }
                break;
            case 64:
                {
                switch ( input.LA(2) ) {
                case VAR:
                    {
                    alt61=1;
                    }
                    break;
                case INT:
                    {
                    alt61=2;
                    }
                    break;
                case AndOr:
                case DNUM:
                case Fun:
                case NUM:
                case RelationalOperators:
                case SEMICOLON:
                case 55:
                case 57:
                case 58:
                case 60:
                case 64:
                    {
                    alt61=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 3, input);

                    throw nvae;

                }

                }
                break;
            case DNUM:
            case Fun:
            case NUM:
            case 57:
                {
                alt61=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }

            switch (alt61) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:173:7: object
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_object_in_term1373);
                    object195=object();

                    state._fsp--;

                    adaptor.addChild(root_0, object195.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:173:15: factor ( ( '*' | '/' ) ^ factor )*
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_factor_in_term1376);
                    factor196=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor196.getTree());

                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:173:22: ( ( '*' | '/' ) ^ factor )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==59||LA60_0==67) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:173:24: ( '*' | '/' ) ^ factor
                    	    {
                    	    set197=(Token)input.LT(1);

                    	    set197=(Token)input.LT(1);

                    	    if ( input.LA(1)==59||input.LA(1)==67 ) {
                    	        input.consume();
                    	        root_0 = (Object)adaptor.becomeRoot(
                    	        (Object)adaptor.create(set197)
                    	        , root_0);
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }


                    	    pushFollow(FOLLOW_factor_in_term1392);
                    	    factor198=factor();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, factor198.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop60;
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

        Token VAR199=null;
        Token NUM200=null;
        Token DNUM201=null;
        Token char_literal202=null;
        Token VAR203=null;
        Token char_literal204=null;
        Token INT205=null;
        Token char_literal206=null;
        Token DNUM207=null;
        Token char_literal208=null;
        Token char_literal210=null;
        Token Fun211=null;
        Token char_literal212=null;
        Token char_literal214=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr209 =null;

        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr213 =null;


        Object VAR199_tree=null;
        Object NUM200_tree=null;
        Object DNUM201_tree=null;
        Object char_literal202_tree=null;
        Object VAR203_tree=null;
        Object char_literal204_tree=null;
        Object INT205_tree=null;
        Object char_literal206_tree=null;
        Object DNUM207_tree=null;
        Object char_literal208_tree=null;
        Object char_literal210_tree=null;
        Object Fun211_tree=null;
        Object char_literal212_tree=null;
        Object char_literal214_tree=null;
        RewriteRuleTokenStream stream_DNUM=new RewriteRuleTokenStream(adaptor,"token DNUM");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_Fun=new RewriteRuleTokenStream(adaptor,"token Fun");
        RewriteRuleSubtreeStream stream_generalArithExpr=new RewriteRuleSubtreeStream(adaptor,"rule generalArithExpr");
        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:181:8: ( VAR -> ^( Factor VAR ) | NUM -> ^( Factor NUM ) | DNUM -> ^( Factor DOUBLE ) | '-' VAR -> ^( Factor '-' VAR ) | '-' INT -> ^( Factor '-' INT ) | '-' DNUM -> ^( Factor '-' DOUBLE ) | '(' generalArithExpr ')' -> ^( Factor '(' generalArithExpr ')' ) | Fun '(' generalArithExpr ')' -> ^( Factor Fun '(' generalArithExpr ')' ) )
            int alt62=8;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt62=1;
                }
                break;
            case NUM:
                {
                alt62=2;
                }
                break;
            case DNUM:
                {
                alt62=3;
                }
                break;
            case 64:
                {
                switch ( input.LA(2) ) {
                case VAR:
                    {
                    alt62=4;
                    }
                    break;
                case INT:
                    {
                    alt62=5;
                    }
                    break;
                case DNUM:
                    {
                    alt62=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 4, input);

                    throw nvae;

                }

                }
                break;
            case 57:
                {
                alt62=7;
                }
                break;
            case Fun:
                {
                alt62=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;

            }

            switch (alt62) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:182:2: VAR
                    {
                    VAR199=(Token)match(input,VAR,FOLLOW_VAR_in_factor1432);  
                    stream_VAR.add(VAR199);


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
                    NUM200=(Token)match(input,NUM,FOLLOW_NUM_in_factor1444);  
                    stream_NUM.add(NUM200);


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
                    DNUM201=(Token)match(input,DNUM,FOLLOW_DNUM_in_factor1456);  
                    stream_DNUM.add(DNUM201);


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
                    char_literal202=(Token)match(input,64,FOLLOW_64_in_factor1468);  
                    stream_64.add(char_literal202);


                    VAR203=(Token)match(input,VAR,FOLLOW_VAR_in_factor1471);  
                    stream_VAR.add(VAR203);


                    // AST REWRITE
                    // elements: 64, VAR
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
                        stream_64.nextNode()
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
                    char_literal204=(Token)match(input,64,FOLLOW_64_in_factor1486);  
                    stream_64.add(char_literal204);


                    INT205=(Token)match(input,INT,FOLLOW_INT_in_factor1489);  
                    stream_INT.add(INT205);


                    // AST REWRITE
                    // elements: 64, INT
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
                        stream_64.nextNode()
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
                    char_literal206=(Token)match(input,64,FOLLOW_64_in_factor1504);  
                    stream_64.add(char_literal206);


                    DNUM207=(Token)match(input,DNUM,FOLLOW_DNUM_in_factor1507);  
                    stream_DNUM.add(DNUM207);


                    // AST REWRITE
                    // elements: 64
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
                        stream_64.nextNode()
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
                    char_literal208=(Token)match(input,57,FOLLOW_57_in_factor1523);  
                    stream_57.add(char_literal208);


                    pushFollow(FOLLOW_generalArithExpr_in_factor1525);
                    generalArithExpr209=generalArithExpr();

                    state._fsp--;

                    stream_generalArithExpr.add(generalArithExpr209.getTree());

                    char_literal210=(Token)match(input,58,FOLLOW_58_in_factor1527);  
                    stream_58.add(char_literal210);


                    // AST REWRITE
                    // elements: 57, generalArithExpr, 58
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
                        stream_57.nextNode()
                        );

                        adaptor.addChild(root_1, stream_generalArithExpr.nextTree());

                        adaptor.addChild(root_1, 
                        stream_58.nextNode()
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
                    Fun211=(Token)match(input,Fun,FOLLOW_Fun_in_factor1545);  
                    stream_Fun.add(Fun211);


                    char_literal212=(Token)match(input,57,FOLLOW_57_in_factor1547);  
                    stream_57.add(char_literal212);


                    pushFollow(FOLLOW_generalArithExpr_in_factor1549);
                    generalArithExpr213=generalArithExpr();

                    state._fsp--;

                    stream_generalArithExpr.add(generalArithExpr213.getTree());

                    char_literal214=(Token)match(input,58,FOLLOW_58_in_factor1551);  
                    stream_58.add(char_literal214);


                    // AST REWRITE
                    // elements: 57, 58, Fun, generalArithExpr
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
                        stream_57.nextNode()
                        );

                        adaptor.addChild(root_1, stream_generalArithExpr.nextTree());

                        adaptor.addChild(root_1, 
                        stream_58.nextNode()
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

        Token set215=null;

        Object set215_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:206:7: ( STRING | BOOLEAN | DOUBLE | INT )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:
            {
            root_0 = (Object)adaptor.nil();


            set215=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEAN||input.LA(1)==DOUBLE||input.LA(1)==INT||input.LA(1)==STRING ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set215)
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
    public static final BitSet FOLLOW_Class_in_classDec154 = new BitSet(new long[]{0x0008000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_VAR_in_classDec156 = new BitSet(new long[]{0x0008000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_classDec159 = new BitSet(new long[]{0x0009028100404080L,0x0000000000015800L});
    public static final BitSet FOLLOW_stmt_in_classDec161 = new BitSet(new long[]{0x0009028100404080L,0x0000000000015800L});
    public static final BitSet FOLLOW_80_in_classDec164 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_Modifier_in_method394 = new BitSet(new long[]{0x0208020000404080L});
    public static final BitSet FOLLOW_types_in_method396 = new BitSet(new long[]{0x0208000000000000L});
    public static final BitSet FOLLOW_VAR_in_method399 = new BitSet(new long[]{0x0208000000000000L});
    public static final BitSet FOLLOW_params_in_method402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_method404 = new BitSet(new long[]{0x0009028100404080L,0x0000000000007800L});
    public static final BitSet FOLLOW_stmt_in_method406 = new BitSet(new long[]{0x0009028100404080L,0x0000000000007800L});
    public static final BitSet FOLLOW_77_in_method409 = new BitSet(new long[]{0x0008000200000000L});
    public static final BitSet FOLLOW_return_type_in_method411 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_method413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_method414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_main_method461 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Static_in_main_method463 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_VOID_in_main_method465 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_Main_in_main_method467 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_main_method469 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_STRING_in_main_method470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_main_method472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_main_method473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_main_method475 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_main_method477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_main_method479 = new BitSet(new long[]{0x0001000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_print_in_main_method480 = new BitSet(new long[]{0x0001000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_main_method482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_System_in_print517 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Dot_in_print519 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_Out_in_print521 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Dot_in_print523 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_Println_in_print525 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_print527 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_New_in_print528 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_print530 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_print532 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_print533 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Dot_in_print534 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_print536 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_print538 = new BitSet(new long[]{0x0400000200000000L});
    public static final BitSet FOLLOW_NUM_in_print539 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_print541 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_print543 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_print545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_types_in_initialize601 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_initialize603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_initialize604 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_initialize608 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_initialize610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_initialize612 = new BitSet(new long[]{0x0008008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_initialize615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_initialize_1625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_initialize_1627 = new BitSet(new long[]{0x0008000400000000L});
    public static final BitSet FOLLOW_set_in_initialize_1629 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_Dot_in_initialize_1635 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_initialize_1638 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_initialize_1640 = new BitSet(new long[]{0x8408000200000000L});
    public static final BitSet FOLLOW_63_in_initialize_1647 = new BitSet(new long[]{0x0408000200000000L});
    public static final BitSet FOLLOW_58_in_initialize_1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_System_in_sys_print665 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Dot_in_sys_print667 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_Out_in_sys_print669 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Dot_in_sys_print671 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_Println_in_sys_print673 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_sys_print675 = new BitSet(new long[]{0x0008000200000000L});
    public static final BitSet FOLLOW_NUM_in_sys_print677 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_VAR_in_sys_print679 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Dot_in_sys_print681 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_sys_print683 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_sys_print685 = new BitSet(new long[]{0x0400000200000000L});
    public static final BitSet FOLLOW_NUM_in_sys_print686 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_sys_print688 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_sys_print692 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_sys_print694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_object702 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_object706 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Dot_in_object708 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_object710 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_object712 = new BitSet(new long[]{0x0408000200000000L});
    public static final BitSet FOLLOW_58_in_object721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_object725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_params735 = new BitSet(new long[]{0x0408020000404080L});
    public static final BitSet FOLLOW_types_in_params738 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_params740 = new BitSet(new long[]{0x8400000000000000L});
    public static final BitSet FOLLOW_VAR_in_params742 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_params744 = new BitSet(new long[]{0x8400000000000000L});
    public static final BitSet FOLLOW_63_in_params748 = new BitSet(new long[]{0x0000020000404080L});
    public static final BitSet FOLLOW_types_in_params750 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_params752 = new BitSet(new long[]{0x8400000000000000L});
    public static final BitSet FOLLOW_58_in_params758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_dec_in_decl772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_dec_in_decl784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_while_condition805 = new BitSet(new long[]{0x0288000200102000L,0x0000000000000001L});
    public static final BitSet FOLLOW_condition_in_while_condition807 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_while_condition809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_while_condition811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_whilestmt820 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_whilestmt822 = new BitSet(new long[]{0x0288000000000000L});
    public static final BitSet FOLLOW_while_condition_in_whilestmt824 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_whilestmt826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_whilestmt828 = new BitSet(new long[]{0x0009028100404080L,0x0000000000015800L});
    public static final BitSet FOLLOW_stmt_in_whilestmt830 = new BitSet(new long[]{0x0009028100404080L,0x0000000000015800L});
    public static final BitSet FOLLOW_80_in_whilestmt833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ifstmt878 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ifstmt880 = new BitSet(new long[]{0x0388000000000000L,0x0000000000000050L});
    public static final BitSet FOLLOW_55_in_ifstmt883 = new BitSet(new long[]{0x0388000000000000L,0x0000000000000050L});
    public static final BitSet FOLLOW_57_in_ifstmt889 = new BitSet(new long[]{0x0188000000000000L,0x0000000000000050L});
    public static final BitSet FOLLOW_if_cond_in_ifstmt893 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ifstmt896 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ifstmt900 = new BitSet(new long[]{0x0009028100404082L,0x000000000001DC00L});
    public static final BitSet FOLLOW_79_in_ifstmt903 = new BitSet(new long[]{0x0009028100404082L,0x0000000000015C00L});
    public static final BitSet FOLLOW_stmt_in_ifstmt907 = new BitSet(new long[]{0x0009028100404082L,0x0000000000015C00L});
    public static final BitSet FOLLOW_80_in_ifstmt911 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ifstmt916 = new BitSet(new long[]{0x0009028100404082L,0x000000000001DC00L});
    public static final BitSet FOLLOW_79_in_ifstmt919 = new BitSet(new long[]{0x0009028100404082L,0x0000000000015C00L});
    public static final BitSet FOLLOW_stmt_in_ifstmt923 = new BitSet(new long[]{0x0009028100404082L,0x0000000000015C00L});
    public static final BitSet FOLLOW_80_in_ifstmt927 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ifstmt934 = new BitSet(new long[]{0x0009028100404082L,0x000000000001D800L});
    public static final BitSet FOLLOW_79_in_ifstmt937 = new BitSet(new long[]{0x0009028100404082L,0x0000000000015800L});
    public static final BitSet FOLLOW_stmt_in_ifstmt941 = new BitSet(new long[]{0x0009028100404082L,0x0000000000015800L});
    public static final BitSet FOLLOW_80_in_ifstmt945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_nor_in_if_cond963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_if_nor975 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000050L});
    public static final BitSet FOLLOW_set_in_if_nor978 = new BitSet(new long[]{0x0188000000000000L,0x0000000000000050L});
    public static final BitSet FOLLOW_object_in_if_nor993 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000050L});
    public static final BitSet FOLLOW_75_in_forloop1007 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_forloop1009 = new BitSet(new long[]{0x0000000100404000L});
    public static final BitSet FOLLOW_decl_in_forloop1012 = new BitSet(new long[]{0x0288000200102000L,0x0000000000000001L});
    public static final BitSet FOLLOW_condition_in_forloop1016 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_forloop1019 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_forloop1022 = new BitSet(new long[]{0x6000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_change_in_forloop1024 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_forloop1027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_forloop1029 = new BitSet(new long[]{0x0009028100404080L,0x0000000000015800L});
    public static final BitSet FOLLOW_stmt_in_forloop1031 = new BitSet(new long[]{0x0009028100404080L,0x0000000000015800L});
    public static final BitSet FOLLOW_80_in_forloop1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_assigment1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_assign1090 = new BitSet(new long[]{0x6000000000000000L,0x0000000000000026L});
    public static final BitSet FOLLOW_change_in_assign1093 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_69_in_assign1095 = new BitSet(new long[]{0x0288000200102000L,0x0000000000000001L});
    public static final BitSet FOLLOW_generalArithExpr_in_assign1097 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_assign1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_change1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_change1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_change1115 = new BitSet(new long[]{0x0288000200102000L,0x0000000000000001L});
    public static final BitSet FOLLOW_generalArithExpr_in_change1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_generalArithExpr_in_condition1133 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RelationalOperators_in_condition1135 = new BitSet(new long[]{0x0288000200102000L,0x0000000000000001L});
    public static final BitSet FOLLOW_generalArithExpr_in_condition1137 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AndOr_in_condition1140 = new BitSet(new long[]{0x0288000200102000L,0x0000000000000001L});
    public static final BitSet FOLLOW_condition_in_condition1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_int_dec1201 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_INT_in_int_dec1204 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_int_dec1206 = new BitSet(new long[]{0x8000008000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_int_dec1210 = new BitSet(new long[]{0x0288000200102000L,0x0000000000000001L});
    public static final BitSet FOLLOW_generalArithExpr_in_int_dec1212 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_63_in_int_dec1217 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_int_dec1219 = new BitSet(new long[]{0x8000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_int_dec1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_double_dec1239 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DOUBLE_in_double_dec1242 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_double_dec1244 = new BitSet(new long[]{0x8000008000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_double_dec1248 = new BitSet(new long[]{0x0288000200102000L,0x0000000000000001L});
    public static final BitSet FOLLOW_generalArithExpr_in_double_dec1250 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_63_in_double_dec1255 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_double_dec1257 = new BitSet(new long[]{0x8000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_double_dec1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_string_dec1275 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_STRING_in_string_dec1278 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_string_dec1280 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_string_dec1283 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_Strings_in_string_dec1285 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_string_dec1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_generalArithExpr1321 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_set_in_generalArithExpr1324 = new BitSet(new long[]{0x0288000200102000L,0x0000000000000001L});
    public static final BitSet FOLLOW_term_in_generalArithExpr1336 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_object_in_term1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term1376 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_term1380 = new BitSet(new long[]{0x0208000200102000L,0x0000000000000001L});
    public static final BitSet FOLLOW_factor_in_term1392 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_in_factor1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_factor1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DNUM_in_factor1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_factor1468 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_factor1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_factor1486 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_INT_in_factor1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_factor1504 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DNUM_in_factor1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_factor1523 = new BitSet(new long[]{0x0288000200102000L,0x0000000000000001L});
    public static final BitSet FOLLOW_generalArithExpr_in_factor1525 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_factor1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Fun_in_factor1545 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_factor1547 = new BitSet(new long[]{0x0288000200102000L,0x0000000000000001L});
    public static final BitSet FOLLOW_generalArithExpr_in_factor1549 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_factor1551 = new BitSet(new long[]{0x0000000000000002L});

}