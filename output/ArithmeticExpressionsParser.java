// $ANTLR 3.4 E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g 2024-05-12 00:45:10

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ArithmeticExpressionsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AndOr", "Args", "Assigment", "BOOLEAN", "COMMENT", "Class", "ClassDec", "Condition", "Conditions", "DNUM", "DOUBLE", "Decl", "Dot", "Double_dec", "Factor", "Forloop", "Fun", "GeneralArithExpr", "INT", "Ifstmt", "Ifstmt_2", "Initialize", "Initialize_1", "Int_dec", "ML_COMMENT", "Main", "Main_METHOD", "Method", "Modifier", "NUM", "New", "Out", "Print", "Println", "RelationalOperators", "SEMICOLON", "SL_COMMENT", "STRING", "Start", "StartgeneralArithExpr", "Static", "String_Dec", "Strings", "Sys_print", "System", "TYPE", "Term", "VAR", "VOID", "Whilestmt", "WhiteSpace", "'('", "')'", "'*'", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'/'", "'<'", "'='", "'>'", "'['", "']'", "'a'", "'else'", "'for'", "'if'", "'return'", "'while'", "'{'", "'}'"
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
    public String getGrammarFileName() { return "E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g"; }


    String s="";


    public static class startgeneralArithExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "startgeneralArithExpr"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:39:1: startgeneralArithExpr : ( classDec )* -> ^( Start ( classDec )* ) ;
    public final ArithmeticExpressionsParser.startgeneralArithExpr_return startgeneralArithExpr() throws RecognitionException {
        ArithmeticExpressionsParser.startgeneralArithExpr_return retval = new ArithmeticExpressionsParser.startgeneralArithExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.classDec_return classDec1 =null;


        RewriteRuleSubtreeStream stream_classDec=new RewriteRuleSubtreeStream(adaptor,"rule classDec");
        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:39:23: ( ( classDec )* -> ^( Start ( classDec )* ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:39:25: ( classDec )*
            {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:39:25: ( classDec )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Class||LA1_0==Modifier) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:39:25: classDec
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
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:39:38: ^( Start ( classDec )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Start, "Start")
                , root_1);

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:39:46: ( classDec )*
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:48:1: classDec : ( Modifier )? Class ( VAR )* '{' ( stmt )* '}' -> ^( ClassDec ( Modifier )? Class VAR '{' ( stmt )* '}' ) ;
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
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_Class=new RewriteRuleTokenStream(adaptor,"token Class");
        RewriteRuleTokenStream stream_Modifier=new RewriteRuleTokenStream(adaptor,"token Modifier");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:48:9: ( ( Modifier )? Class ( VAR )* '{' ( stmt )* '}' -> ^( ClassDec ( Modifier )? Class VAR '{' ( stmt )* '}' ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:48:11: ( Modifier )? Class ( VAR )* '{' ( stmt )* '}'
            {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:48:11: ( Modifier )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Modifier) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:48:11: Modifier
                    {
                    Modifier2=(Token)match(input,Modifier,FOLLOW_Modifier_in_classDec151);  
                    stream_Modifier.add(Modifier2);


                    }
                    break;

            }


            Class3=(Token)match(input,Class,FOLLOW_Class_in_classDec154);  
            stream_Class.add(Class3);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:48:27: ( VAR )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==VAR) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:48:27: VAR
            	    {
            	    VAR4=(Token)match(input,VAR,FOLLOW_VAR_in_classDec156);  
            	    stream_VAR.add(VAR4);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            char_literal5=(Token)match(input,77,FOLLOW_77_in_classDec159);  
            stream_77.add(char_literal5);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:48:36: ( stmt )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==BOOLEAN||LA4_0==DOUBLE||LA4_0==INT||LA4_0==Modifier||LA4_0==SEMICOLON||LA4_0==STRING||LA4_0==System||LA4_0==VAR||(LA4_0 >= 73 && LA4_0 <= 74)||LA4_0==76) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:48:36: stmt
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


            char_literal7=(Token)match(input,78,FOLLOW_78_in_classDec164);  
            stream_78.add(char_literal7);


            // AST REWRITE
            // elements: 78, 77, VAR, stmt, Class, Modifier
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
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:48:48: ^( ClassDec ( Modifier )? Class VAR '{' ( stmt )* '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ClassDec, "ClassDec")
                , root_1);

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:48:59: ( Modifier )?
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
                stream_77.nextNode()
                );

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:48:83: ( stmt )*
                while ( stream_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmt.nextTree());

                }
                stream_stmt.reset();

                adaptor.addChild(root_1, 
                stream_78.nextNode()
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:55:1: stmt : ( decl -> ^( Decl decl ) | main_method -> ^( Main_METHOD main_method ) | ifstmt -> ^( Ifstmt ifstmt ) | whilestmt -> ^( Whilestmt whilestmt ) | forloop -> ^( Forloop forloop ) | assigment -> ^( Assigment assigment ) | method -> ^( Method method ) | string_dec -> ^( String_Dec string_dec ) | initialize -> ^( Initialize initialize ) | initialize_1 -> ^( Initialize_1 initialize_1 ) | sys_print -> ^( Sys_print sys_print ) ) ;
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
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:55:9: ( ( decl -> ^( Decl decl ) | main_method -> ^( Main_METHOD main_method ) | ifstmt -> ^( Ifstmt ifstmt ) | whilestmt -> ^( Whilestmt whilestmt ) | forloop -> ^( Forloop forloop ) | assigment -> ^( Assigment assigment ) | method -> ^( Method method ) | string_dec -> ^( String_Dec string_dec ) | initialize -> ^( Initialize initialize ) | initialize_1 -> ^( Initialize_1 initialize_1 ) | sys_print -> ^( Sys_print sys_print ) ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:55:13: ( decl -> ^( Decl decl ) | main_method -> ^( Main_METHOD main_method ) | ifstmt -> ^( Ifstmt ifstmt ) | whilestmt -> ^( Whilestmt whilestmt ) | forloop -> ^( Forloop forloop ) | assigment -> ^( Assigment assigment ) | method -> ^( Method method ) | string_dec -> ^( String_Dec string_dec ) | initialize -> ^( Initialize initialize ) | initialize_1 -> ^( Initialize_1 initialize_1 ) | sys_print -> ^( Sys_print sys_print ) )
            {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:55:13: ( decl -> ^( Decl decl ) | main_method -> ^( Main_METHOD main_method ) | ifstmt -> ^( Ifstmt ifstmt ) | whilestmt -> ^( Whilestmt whilestmt ) | forloop -> ^( Forloop forloop ) | assigment -> ^( Assigment assigment ) | method -> ^( Method method ) | string_dec -> ^( String_Dec string_dec ) | initialize -> ^( Initialize initialize ) | initialize_1 -> ^( Initialize_1 initialize_1 ) | sys_print -> ^( Sys_print sys_print ) )
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

                        if ( (LA5_21==SEMICOLON||LA5_21==61||LA5_21==67) ) {
                            alt5=1;
                        }
                        else if ( (LA5_21==VAR||LA5_21==55) ) {
                            alt5=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 21, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA5_12==55) ) {
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

                        if ( (LA5_22==SEMICOLON||LA5_22==61||LA5_22==67) ) {
                            alt5=1;
                        }
                        else if ( (LA5_22==VAR||LA5_22==55) ) {
                            alt5=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 22, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA5_13==55) ) {
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

                        if ( (LA5_23==SEMICOLON||LA5_23==67) ) {
                            alt5=8;
                        }
                        else if ( (LA5_23==VAR||LA5_23==55) ) {
                            alt5=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 23, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA5_14==55) ) {
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
                case 55:
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

                    if ( (LA5_16==SEMICOLON||LA5_16==61||LA5_16==67) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 16, input);

                        throw nvae;

                    }
                }
                else if ( (LA5_2==69) ) {
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

                    if ( (LA5_17==SEMICOLON||LA5_17==61||LA5_17==67) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 17, input);

                        throw nvae;

                    }
                }
                else if ( (LA5_3==69) ) {
                    alt5=9;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;

                }
                }
                break;
            case 74:
                {
                alt5=3;
                }
                break;
            case 76:
                {
                alt5=4;
                }
                break;
            case 73:
                {
                alt5=5;
                }
                break;
            case VAR:
                {
                switch ( input.LA(2) ) {
                case 67:
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

                                if ( (LA5_30==55) ) {
                                    int LA5_31 = input.LA(7);

                                    if ( (LA5_31==NUM||LA5_31==VAR) ) {
                                        int LA5_32 = input.LA(8);

                                        if ( (LA5_32==56) ) {
                                            switch ( input.LA(9) ) {
                                            case 58:
                                            case 62:
                                                {
                                                alt5=6;
                                                }
                                                break;
                                            case SEMICOLON:
                                                {
                                                alt5=6;
                                                }
                                                break;
                                            case EOF:
                                            case BOOLEAN:
                                            case DOUBLE:
                                            case INT:
                                            case Modifier:
                                            case STRING:
                                            case System:
                                            case VAR:
                                            case 72:
                                            case 73:
                                            case 74:
                                            case 75:
                                            case 76:
                                            case 78:
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
                                    else if ( (LA5_31==56) ) {
                                        switch ( input.LA(8) ) {
                                        case 58:
                                        case 62:
                                            {
                                            alt5=6;
                                            }
                                            break;
                                        case SEMICOLON:
                                            {
                                            alt5=6;
                                            }
                                            break;
                                        case EOF:
                                        case BOOLEAN:
                                        case DOUBLE:
                                        case INT:
                                        case Modifier:
                                        case STRING:
                                        case System:
                                        case VAR:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 78:
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
                        case 57:
                        case 58:
                        case 62:
                        case 65:
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
                    case 55:
                    case 62:
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
                case 59:
                case 60:
                case 63:
                case 64:
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

                    if ( (LA5_20==SEMICOLON||LA5_20==67) ) {
                        alt5=8;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 20, input);

                        throw nvae;

                    }
                }
                else if ( (LA5_8==69) ) {
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:56:2: decl
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
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:56:10: ^( Decl decl )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:58:3: main_method
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
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:58:16: ^( Main_METHOD main_method )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:59:3: ifstmt
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
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:59:13: ^( Ifstmt ifstmt )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:60:3: whilestmt
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
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:60:16: ^( Whilestmt whilestmt )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:61:3: forloop
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
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:61:14: ^( Forloop forloop )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:62:3: assigment
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
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:62:16: ^( Assigment assigment )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:63:3: method
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
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:63:13: ^( Method method )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:64:3: string_dec
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
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:64:17: ^( String_Dec string_dec )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:65:3: initialize
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
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:65:17: ^( Initialize initialize )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:66:3: initialize_1
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
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:66:19: ^( Initialize_1 initialize_1 )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:67:3: sys_print
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
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:67:16: ^( Sys_print sys_print )
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:77:1: method : Modifier ( types )? ( VAR )* params '{' ( stmt )* 'return' return_type SEMICOLON '}' -> ^( Method Modifier ( types )? ( VAR )* params '{' ( stmt )* 'return' return_type SEMICOLON '}' ) ;
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
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_Modifier=new RewriteRuleTokenStream(adaptor,"token Modifier");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_return_type=new RewriteRuleSubtreeStream(adaptor,"rule return_type");
        RewriteRuleSubtreeStream stream_types=new RewriteRuleSubtreeStream(adaptor,"rule types");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:77:8: ( Modifier ( types )? ( VAR )* params '{' ( stmt )* 'return' return_type SEMICOLON '}' -> ^( Method Modifier ( types )? ( VAR )* params '{' ( stmt )* 'return' return_type SEMICOLON '}' ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:78:2: Modifier ( types )? ( VAR )* params '{' ( stmt )* 'return' return_type SEMICOLON '}'
            {
            Modifier19=(Token)match(input,Modifier,FOLLOW_Modifier_in_method394);  
            stream_Modifier.add(Modifier19);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:78:11: ( types )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==BOOLEAN||LA6_0==DOUBLE||LA6_0==INT||LA6_0==STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:78:11: types
                    {
                    pushFollow(FOLLOW_types_in_method396);
                    types20=types();

                    state._fsp--;

                    stream_types.add(types20.getTree());

                    }
                    break;

            }


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:78:18: ( VAR )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==VAR) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:78:18: VAR
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

            char_literal23=(Token)match(input,77,FOLLOW_77_in_method404);  
            stream_77.add(char_literal23);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:78:34: ( stmt )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==BOOLEAN||LA8_0==DOUBLE||LA8_0==INT||LA8_0==Modifier||LA8_0==SEMICOLON||LA8_0==STRING||LA8_0==System||LA8_0==VAR||(LA8_0 >= 73 && LA8_0 <= 74)||LA8_0==76) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:78:34: stmt
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


            string_literal25=(Token)match(input,75,FOLLOW_75_in_method409);  
            stream_75.add(string_literal25);


            pushFollow(FOLLOW_return_type_in_method411);
            return_type26=return_type();

            state._fsp--;

            stream_return_type.add(return_type26.getTree());

            SEMICOLON27=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_method413);  
            stream_SEMICOLON.add(SEMICOLON27);


            char_literal28=(Token)match(input,78,FOLLOW_78_in_method414);  
            stream_78.add(char_literal28);


            // AST REWRITE
            // elements: VAR, 78, stmt, params, Modifier, types, 77, 75, return_type, SEMICOLON
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
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:79:6: ^( Method Modifier ( types )? ( VAR )* params '{' ( stmt )* 'return' return_type SEMICOLON '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Method, "Method")
                , root_1);

                adaptor.addChild(root_1, 
                stream_Modifier.nextNode()
                );

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:79:24: ( types )?
                if ( stream_types.hasNext() ) {
                    adaptor.addChild(root_1, stream_types.nextTree());

                }
                stream_types.reset();

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:79:31: ( VAR )*
                while ( stream_VAR.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_VAR.nextNode()
                    );

                }
                stream_VAR.reset();

                adaptor.addChild(root_1, stream_params.nextTree());

                adaptor.addChild(root_1, 
                stream_77.nextNode()
                );

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:79:47: ( stmt )*
                while ( stream_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmt.nextTree());

                }
                stream_stmt.reset();

                adaptor.addChild(root_1, 
                stream_75.nextNode()
                );

                adaptor.addChild(root_1, stream_return_type.nextTree());

                adaptor.addChild(root_1, 
                stream_SEMICOLON.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_78.nextNode()
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:84:1: main_method : Modifier Static VOID Main '(' STRING '[' ']' 'a' ')' '{' ( print )* '}' -> ^( Main_METHOD Modifier Static VOID Main '(' STRING '[' ']' 'a' ')' '{' ( print )* '}' ) ;
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
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_Static=new RewriteRuleTokenStream(adaptor,"token Static");
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleTokenStream stream_Modifier=new RewriteRuleTokenStream(adaptor,"token Modifier");
        RewriteRuleTokenStream stream_Main=new RewriteRuleTokenStream(adaptor,"token Main");
        RewriteRuleSubtreeStream stream_print=new RewriteRuleSubtreeStream(adaptor,"rule print");
        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:86:2: ( Modifier Static VOID Main '(' STRING '[' ']' 'a' ')' '{' ( print )* '}' -> ^( Main_METHOD Modifier Static VOID Main '(' STRING '[' ']' 'a' ')' '{' ( print )* '}' ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:86:3: Modifier Static VOID Main '(' STRING '[' ']' 'a' ')' '{' ( print )* '}'
            {
            Modifier29=(Token)match(input,Modifier,FOLLOW_Modifier_in_main_method461);  
            stream_Modifier.add(Modifier29);


            Static30=(Token)match(input,Static,FOLLOW_Static_in_main_method463);  
            stream_Static.add(Static30);


            VOID31=(Token)match(input,VOID,FOLLOW_VOID_in_main_method465);  
            stream_VOID.add(VOID31);


            Main32=(Token)match(input,Main,FOLLOW_Main_in_main_method467);  
            stream_Main.add(Main32);


            char_literal33=(Token)match(input,55,FOLLOW_55_in_main_method469);  
            stream_55.add(char_literal33);


            STRING34=(Token)match(input,STRING,FOLLOW_STRING_in_main_method470);  
            stream_STRING.add(STRING34);


            char_literal35=(Token)match(input,69,FOLLOW_69_in_main_method472);  
            stream_69.add(char_literal35);


            char_literal36=(Token)match(input,70,FOLLOW_70_in_main_method473);  
            stream_70.add(char_literal36);


            char_literal37=(Token)match(input,71,FOLLOW_71_in_main_method475);  
            stream_71.add(char_literal37);


            char_literal38=(Token)match(input,56,FOLLOW_56_in_main_method477);  
            stream_56.add(char_literal38);


            char_literal39=(Token)match(input,77,FOLLOW_77_in_main_method479);  
            stream_77.add(char_literal39);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:86:57: ( print )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==System) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:86:57: print
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


            char_literal41=(Token)match(input,78,FOLLOW_78_in_main_method482);  
            stream_78.add(char_literal41);


            // AST REWRITE
            // elements: 71, Static, 77, 69, 78, 55, Modifier, Main, STRING, print, 70, VOID, 56
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
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:86:69: ^( Main_METHOD Modifier Static VOID Main '(' STRING '[' ']' 'a' ')' '{' ( print )* '}' )
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
                stream_55.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_STRING.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_69.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_70.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_71.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_56.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_77.nextNode()
                );

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:86:138: ( print )*
                while ( stream_print.hasNext() ) {
                    adaptor.addChild(root_1, stream_print.nextTree());

                }
                stream_print.reset();

                adaptor.addChild(root_1, 
                stream_78.nextNode()
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:87:1: print : System Dot Out Dot Println '(' New VAR '(' ')' Dot VAR '(' ( NUM )? ')' ')' SEMICOLON -> ^( Print System Dot Out Dot Println '(' New VAR '(' ')' Dot VAR '(' ( NUM )? ')' ')' SEMICOLON ) ;
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
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_New=new RewriteRuleTokenStream(adaptor,"token New");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleTokenStream stream_Dot=new RewriteRuleTokenStream(adaptor,"token Dot");
        RewriteRuleTokenStream stream_Println=new RewriteRuleTokenStream(adaptor,"token Println");
        RewriteRuleTokenStream stream_System=new RewriteRuleTokenStream(adaptor,"token System");
        RewriteRuleTokenStream stream_Out=new RewriteRuleTokenStream(adaptor,"token Out");

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:87:7: ( System Dot Out Dot Println '(' New VAR '(' ')' Dot VAR '(' ( NUM )? ')' ')' SEMICOLON -> ^( Print System Dot Out Dot Println '(' New VAR '(' ')' Dot VAR '(' ( NUM )? ')' ')' SEMICOLON ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:87:8: System Dot Out Dot Println '(' New VAR '(' ')' Dot VAR '(' ( NUM )? ')' ')' SEMICOLON
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


            char_literal47=(Token)match(input,55,FOLLOW_55_in_print527);  
            stream_55.add(char_literal47);


            New48=(Token)match(input,New,FOLLOW_New_in_print528);  
            stream_New.add(New48);


            VAR49=(Token)match(input,VAR,FOLLOW_VAR_in_print530);  
            stream_VAR.add(VAR49);


            char_literal50=(Token)match(input,55,FOLLOW_55_in_print532);  
            stream_55.add(char_literal50);


            char_literal51=(Token)match(input,56,FOLLOW_56_in_print533);  
            stream_56.add(char_literal51);


            Dot52=(Token)match(input,Dot,FOLLOW_Dot_in_print534);  
            stream_Dot.add(Dot52);


            VAR53=(Token)match(input,VAR,FOLLOW_VAR_in_print536);  
            stream_VAR.add(VAR53);


            char_literal54=(Token)match(input,55,FOLLOW_55_in_print538);  
            stream_55.add(char_literal54);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:87:63: ( NUM )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==NUM) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:87:63: NUM
                    {
                    NUM55=(Token)match(input,NUM,FOLLOW_NUM_in_print539);  
                    stream_NUM.add(NUM55);


                    }
                    break;

            }


            char_literal56=(Token)match(input,56,FOLLOW_56_in_print541);  
            stream_56.add(char_literal56);


            char_literal57=(Token)match(input,56,FOLLOW_56_in_print543);  
            stream_56.add(char_literal57);


            SEMICOLON58=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_print545);  
            stream_SEMICOLON.add(SEMICOLON58);


            // AST REWRITE
            // elements: SEMICOLON, Println, New, VAR, 55, Out, Dot, Dot, NUM, System, 55, 56, 55, 56, 56, Dot, VAR
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
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:87:86: ^( Print System Dot Out Dot Println '(' New VAR '(' ')' Dot VAR '(' ( NUM )? ')' ')' SEMICOLON )
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
                stream_55.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_New.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_VAR.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_55.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_56.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_Dot.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_VAR.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_55.nextNode()
                );

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:87:149: ( NUM )?
                if ( stream_NUM.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_NUM.nextNode()
                    );

                }
                stream_NUM.reset();

                adaptor.addChild(root_1, 
                stream_56.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_56.nextNode()
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:89:1: return_type : ( VAR | NUM );
    public final ArithmeticExpressionsParser.return_type_return return_type() throws RecognitionException {
        ArithmeticExpressionsParser.return_type_return retval = new ArithmeticExpressionsParser.return_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set59=null;

        Object set59_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:90:2: ( VAR | NUM )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:93:1: initialize : ( types ( '[' ']' )? VAR SEMICOLON | ( VAR )* SEMICOLON ) ;
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
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:93:11: ( ( types ( '[' ']' )? VAR SEMICOLON | ( VAR )* SEMICOLON ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:93:13: ( types ( '[' ']' )? VAR SEMICOLON | ( VAR )* SEMICOLON )
            {
            root_0 = (Object)adaptor.nil();


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:93:13: ( types ( '[' ']' )? VAR SEMICOLON | ( VAR )* SEMICOLON )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:93:14: types ( '[' ']' )? VAR SEMICOLON
                    {
                    pushFollow(FOLLOW_types_in_initialize601);
                    types60=types();

                    state._fsp--;

                    adaptor.addChild(root_0, types60.getTree());

                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:93:19: ( '[' ']' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==69) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:93:20: '[' ']'
                            {
                            char_literal61=(Token)match(input,69,FOLLOW_69_in_initialize603); 
                            char_literal61_tree = 
                            (Object)adaptor.create(char_literal61)
                            ;
                            adaptor.addChild(root_0, char_literal61_tree);


                            char_literal62=(Token)match(input,70,FOLLOW_70_in_initialize604); 
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:93:43: ( VAR )* SEMICOLON
                    {
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:93:43: ( VAR )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==VAR) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:93:43: VAR
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:95:1: initialize_1 : VAR '=' ( New | VAR ) ( Dot )? VAR '(' ( NUM | VAR )? ')' ;
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
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:96:2: ( VAR '=' ( New | VAR ) ( Dot )? VAR '(' ( NUM | VAR )? ')' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:96:4: VAR '=' ( New | VAR ) ( Dot )? VAR '(' ( NUM | VAR )? ')'
            {
            root_0 = (Object)adaptor.nil();


            VAR67=(Token)match(input,VAR,FOLLOW_VAR_in_initialize_1625); 
            VAR67_tree = 
            (Object)adaptor.create(VAR67)
            ;
            adaptor.addChild(root_0, VAR67_tree);


            char_literal68=(Token)match(input,67,FOLLOW_67_in_initialize_1627); 
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


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:96:22: ( Dot )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Dot) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:96:22: Dot
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


            char_literal72=(Token)match(input,55,FOLLOW_55_in_initialize_1640); 
            char_literal72_tree = 
            (Object)adaptor.create(char_literal72)
            ;
            adaptor.addChild(root_0, char_literal72_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:96:34: ( NUM | VAR )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==NUM||LA15_0==VAR) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:
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


            char_literal74=(Token)match(input,56,FOLLOW_56_in_initialize_1647); 
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:97:1: sys_print : System Dot Out Dot Println '(' ( NUM | VAR Dot VAR '(' ( NUM )? ')' ) ')' SEMICOLON ;
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
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:98:2: ( System Dot Out Dot Println '(' ( NUM | VAR Dot VAR '(' ( NUM )? ')' ) ')' SEMICOLON )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:98:4: System Dot Out Dot Println '(' ( NUM | VAR Dot VAR '(' ( NUM )? ')' ) ')' SEMICOLON
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


            char_literal80=(Token)match(input,55,FOLLOW_55_in_sys_print666); 
            char_literal80_tree = 
            (Object)adaptor.create(char_literal80)
            ;
            adaptor.addChild(root_0, char_literal80_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:98:34: ( NUM | VAR Dot VAR '(' ( NUM )? ')' )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:98:35: NUM
                    {
                    NUM81=(Token)match(input,NUM,FOLLOW_NUM_in_sys_print668); 
                    NUM81_tree = 
                    (Object)adaptor.create(NUM81)
                    ;
                    adaptor.addChild(root_0, NUM81_tree);


                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:98:39: VAR Dot VAR '(' ( NUM )? ')'
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


                    char_literal85=(Token)match(input,55,FOLLOW_55_in_sys_print676); 
                    char_literal85_tree = 
                    (Object)adaptor.create(char_literal85)
                    ;
                    adaptor.addChild(root_0, char_literal85_tree);


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:98:54: ( NUM )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==NUM) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:98:54: NUM
                            {
                            NUM86=(Token)match(input,NUM,FOLLOW_NUM_in_sys_print677); 
                            NUM86_tree = 
                            (Object)adaptor.create(NUM86)
                            ;
                            adaptor.addChild(root_0, NUM86_tree);


                            }
                            break;

                    }


                    char_literal87=(Token)match(input,56,FOLLOW_56_in_sys_print679); 
                    char_literal87_tree = 
                    (Object)adaptor.create(char_literal87)
                    ;
                    adaptor.addChild(root_0, char_literal87_tree);


                    }
                    break;

            }


            char_literal88=(Token)match(input,56,FOLLOW_56_in_sys_print683); 
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:99:1: object : VAR Dot VAR '(' ( NUM | VAR )? ')' ;
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

        Object VAR90_tree=null;
        Object Dot91_tree=null;
        Object VAR92_tree=null;
        Object char_literal93_tree=null;
        Object set94_tree=null;
        Object char_literal95_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:99:8: ( VAR Dot VAR '(' ( NUM | VAR )? ')' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:99:10: VAR Dot VAR '(' ( NUM | VAR )? ')'
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


            char_literal93=(Token)match(input,55,FOLLOW_55_in_object698); 
            char_literal93_tree = 
            (Object)adaptor.create(char_literal93)
            ;
            adaptor.addChild(root_0, char_literal93_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:99:26: ( NUM | VAR )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==NUM||LA18_0==VAR) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:
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


            char_literal95=(Token)match(input,56,FOLLOW_56_in_object707); 
            char_literal95_tree = 
            (Object)adaptor.create(char_literal95)
            ;
            adaptor.addChild(root_0, char_literal95_tree);


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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:102:1: params : '(' ( ( types VAR | VAR VAR ) ( ',' types VAR )* )? ')' ;
    public final ArithmeticExpressionsParser.params_return params() throws RecognitionException {
        ArithmeticExpressionsParser.params_return retval = new ArithmeticExpressionsParser.params_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal96=null;
        Token VAR98=null;
        Token VAR99=null;
        Token VAR100=null;
        Token char_literal101=null;
        Token VAR103=null;
        Token char_literal104=null;
        ArithmeticExpressionsParser.types_return types97 =null;

        ArithmeticExpressionsParser.types_return types102 =null;


        Object char_literal96_tree=null;
        Object VAR98_tree=null;
        Object VAR99_tree=null;
        Object VAR100_tree=null;
        Object char_literal101_tree=null;
        Object VAR103_tree=null;
        Object char_literal104_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:102:8: ( '(' ( ( types VAR | VAR VAR ) ( ',' types VAR )* )? ')' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:102:10: '(' ( ( types VAR | VAR VAR ) ( ',' types VAR )* )? ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal96=(Token)match(input,55,FOLLOW_55_in_params716); 
            char_literal96_tree = 
            (Object)adaptor.create(char_literal96)
            ;
            adaptor.addChild(root_0, char_literal96_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:102:13: ( ( types VAR | VAR VAR ) ( ',' types VAR )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==BOOLEAN||LA21_0==DOUBLE||LA21_0==INT||LA21_0==STRING||LA21_0==VAR) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:102:14: ( types VAR | VAR VAR ) ( ',' types VAR )*
                    {
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:102:14: ( types VAR | VAR VAR )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==BOOLEAN||LA19_0==DOUBLE||LA19_0==INT||LA19_0==STRING) ) {
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
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:102:15: types VAR
                            {
                            pushFollow(FOLLOW_types_in_params719);
                            types97=types();

                            state._fsp--;

                            adaptor.addChild(root_0, types97.getTree());

                            VAR98=(Token)match(input,VAR,FOLLOW_VAR_in_params721); 
                            VAR98_tree = 
                            (Object)adaptor.create(VAR98)
                            ;
                            adaptor.addChild(root_0, VAR98_tree);


                            }
                            break;
                        case 2 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:102:25: VAR VAR
                            {
                            VAR99=(Token)match(input,VAR,FOLLOW_VAR_in_params723); 
                            VAR99_tree = 
                            (Object)adaptor.create(VAR99)
                            ;
                            adaptor.addChild(root_0, VAR99_tree);


                            VAR100=(Token)match(input,VAR,FOLLOW_VAR_in_params725); 
                            VAR100_tree = 
                            (Object)adaptor.create(VAR100)
                            ;
                            adaptor.addChild(root_0, VAR100_tree);


                            }
                            break;

                    }


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:102:34: ( ',' types VAR )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==61) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:102:35: ',' types VAR
                    	    {
                    	    char_literal101=(Token)match(input,61,FOLLOW_61_in_params729); 
                    	    char_literal101_tree = 
                    	    (Object)adaptor.create(char_literal101)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal101_tree);


                    	    pushFollow(FOLLOW_types_in_params731);
                    	    types102=types();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, types102.getTree());

                    	    VAR103=(Token)match(input,VAR,FOLLOW_VAR_in_params733); 
                    	    VAR103_tree = 
                    	    (Object)adaptor.create(VAR103)
                    	    ;
                    	    adaptor.addChild(root_0, VAR103_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal104=(Token)match(input,56,FOLLOW_56_in_params739); 
            char_literal104_tree = 
            (Object)adaptor.create(char_literal104)
            ;
            adaptor.addChild(root_0, char_literal104_tree);


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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:103:1: decl : ( int_dec -> ^( Int_dec int_dec ) | double_dec -> ^( Double_dec double_dec ) );
    public final ArithmeticExpressionsParser.decl_return decl() throws RecognitionException {
        ArithmeticExpressionsParser.decl_return retval = new ArithmeticExpressionsParser.decl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.int_dec_return int_dec105 =null;

        ArithmeticExpressionsParser.double_dec_return double_dec106 =null;


        RewriteRuleSubtreeStream stream_int_dec=new RewriteRuleSubtreeStream(adaptor,"rule int_dec");
        RewriteRuleSubtreeStream stream_double_dec=new RewriteRuleSubtreeStream(adaptor,"rule double_dec");
        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:103:9: ( int_dec -> ^( Int_dec int_dec ) | double_dec -> ^( Double_dec double_dec ) )
            int alt22=2;
            switch ( input.LA(1) ) {
            case Modifier:
                {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==INT) ) {
                    alt22=1;
                }
                else if ( (LA22_1==DOUBLE) ) {
                    alt22=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt22=1;
                }
                break;
            case DOUBLE:
                {
                alt22=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:104:2: int_dec
                    {
                    pushFollow(FOLLOW_int_dec_in_decl753);
                    int_dec105=int_dec();

                    state._fsp--;

                    stream_int_dec.add(int_dec105.getTree());

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
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:104:13: ^( Int_dec int_dec )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:105:3: double_dec
                    {
                    pushFollow(FOLLOW_double_dec_in_decl765);
                    double_dec106=double_dec();

                    state._fsp--;

                    stream_double_dec.add(double_dec106.getTree());

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
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:105:17: ^( Double_dec double_dec )
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


    public static class whilestmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whilestmt"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:107:1: whilestmt : 'while' '(' condition ')' '{' ( stmt )* '}' -> ^( Whilestmt 'while' '(' condition ')' '{' ( stmt )* '}' ) ;
    public final ArithmeticExpressionsParser.whilestmt_return whilestmt() throws RecognitionException {
        ArithmeticExpressionsParser.whilestmt_return retval = new ArithmeticExpressionsParser.whilestmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal107=null;
        Token char_literal108=null;
        Token char_literal110=null;
        Token char_literal111=null;
        Token char_literal113=null;
        ArithmeticExpressionsParser.condition_return condition109 =null;

        ArithmeticExpressionsParser.stmt_return stmt112 =null;


        Object string_literal107_tree=null;
        Object char_literal108_tree=null;
        Object char_literal110_tree=null;
        Object char_literal111_tree=null;
        Object char_literal113_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:107:11: ( 'while' '(' condition ')' '{' ( stmt )* '}' -> ^( Whilestmt 'while' '(' condition ')' '{' ( stmt )* '}' ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:108:2: 'while' '(' condition ')' '{' ( stmt )* '}'
            {
            string_literal107=(Token)match(input,76,FOLLOW_76_in_whilestmt784);  
            stream_76.add(string_literal107);


            char_literal108=(Token)match(input,55,FOLLOW_55_in_whilestmt786);  
            stream_55.add(char_literal108);


            pushFollow(FOLLOW_condition_in_whilestmt788);
            condition109=condition();

            state._fsp--;

            stream_condition.add(condition109.getTree());

            char_literal110=(Token)match(input,56,FOLLOW_56_in_whilestmt790);  
            stream_56.add(char_literal110);


            char_literal111=(Token)match(input,77,FOLLOW_77_in_whilestmt792);  
            stream_77.add(char_literal111);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:108:32: ( stmt )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==BOOLEAN||LA23_0==DOUBLE||LA23_0==INT||LA23_0==Modifier||LA23_0==SEMICOLON||LA23_0==STRING||LA23_0==System||LA23_0==VAR||(LA23_0 >= 73 && LA23_0 <= 74)||LA23_0==76) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:108:32: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_whilestmt794);
            	    stmt112=stmt();

            	    state._fsp--;

            	    stream_stmt.add(stmt112.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            char_literal113=(Token)match(input,78,FOLLOW_78_in_whilestmt797);  
            stream_78.add(char_literal113);


            // AST REWRITE
            // elements: stmt, 76, 55, condition, 78, 56, 77
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 109:3: -> ^( Whilestmt 'while' '(' condition ')' '{' ( stmt )* '}' )
            {
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:109:6: ^( Whilestmt 'while' '(' condition ')' '{' ( stmt )* '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Whilestmt, "Whilestmt")
                , root_1);

                adaptor.addChild(root_1, 
                stream_76.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_55.nextNode()
                );

                adaptor.addChild(root_1, stream_condition.nextTree());

                adaptor.addChild(root_1, 
                stream_56.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_77.nextNode()
                );

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:109:48: ( stmt )*
                while ( stream_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmt.nextTree());

                }
                stream_stmt.reset();

                adaptor.addChild(root_1, 
                stream_78.nextNode()
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:111:1: ifstmt : 'if' '(' if_condition ')' ( '{' )? ( stmt )* ( '}' )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )? ;
    public final ArithmeticExpressionsParser.ifstmt_return ifstmt() throws RecognitionException {
        ArithmeticExpressionsParser.ifstmt_return retval = new ArithmeticExpressionsParser.ifstmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal114=null;
        Token char_literal115=null;
        Token char_literal117=null;
        Token char_literal118=null;
        Token char_literal120=null;
        Token string_literal121=null;
        Token char_literal122=null;
        Token char_literal124=null;
        ArithmeticExpressionsParser.if_condition_return if_condition116 =null;

        ArithmeticExpressionsParser.stmt_return stmt119 =null;

        ArithmeticExpressionsParser.stmt_return stmt123 =null;


        Object string_literal114_tree=null;
        Object char_literal115_tree=null;
        Object char_literal117_tree=null;
        Object char_literal118_tree=null;
        Object char_literal120_tree=null;
        Object string_literal121_tree=null;
        Object char_literal122_tree=null;
        Object char_literal124_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:111:9: ( 'if' '(' if_condition ')' ( '{' )? ( stmt )* ( '}' )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )? )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:112:2: 'if' '(' if_condition ')' ( '{' )? ( stmt )* ( '}' )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal114=(Token)match(input,74,FOLLOW_74_in_ifstmt836); 
            string_literal114_tree = 
            (Object)adaptor.create(string_literal114)
            ;
            adaptor.addChild(root_0, string_literal114_tree);


            char_literal115=(Token)match(input,55,FOLLOW_55_in_ifstmt838); 
            char_literal115_tree = 
            (Object)adaptor.create(char_literal115)
            ;
            adaptor.addChild(root_0, char_literal115_tree);


            pushFollow(FOLLOW_if_condition_in_ifstmt840);
            if_condition116=if_condition();

            state._fsp--;

            adaptor.addChild(root_0, if_condition116.getTree());

            char_literal117=(Token)match(input,56,FOLLOW_56_in_ifstmt842); 
            char_literal117_tree = 
            (Object)adaptor.create(char_literal117)
            ;
            adaptor.addChild(root_0, char_literal117_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:112:28: ( '{' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==77) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:112:29: '{'
                    {
                    char_literal118=(Token)match(input,77,FOLLOW_77_in_ifstmt845); 
                    char_literal118_tree = 
                    (Object)adaptor.create(char_literal118)
                    ;
                    adaptor.addChild(root_0, char_literal118_tree);


                    }
                    break;

            }


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:112:35: ( stmt )*
            loop25:
            do {
                int alt25=2;
                switch ( input.LA(1) ) {
                case Modifier:
                    {
                    alt25=1;
                    }
                    break;
                case INT:
                    {
                    alt25=1;
                    }
                    break;
                case DOUBLE:
                    {
                    alt25=1;
                    }
                    break;
                case 74:
                    {
                    alt25=1;
                    }
                    break;
                case 76:
                    {
                    alt25=1;
                    }
                    break;
                case 73:
                    {
                    alt25=1;
                    }
                    break;
                case VAR:
                    {
                    alt25=1;
                    }
                    break;
                case STRING:
                    {
                    alt25=1;
                    }
                    break;
                case BOOLEAN:
                    {
                    alt25=1;
                    }
                    break;
                case SEMICOLON:
                    {
                    alt25=1;
                    }
                    break;
                case System:
                    {
                    alt25=1;
                    }
                    break;

                }

                switch (alt25) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:112:35: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_ifstmt849);
            	    stmt119=stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stmt119.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:112:41: ( '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==78) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:112:42: '}'
                    {
                    char_literal120=(Token)match(input,78,FOLLOW_78_in_ifstmt853); 
                    char_literal120_tree = 
                    (Object)adaptor.create(char_literal120)
                    ;
                    adaptor.addChild(root_0, char_literal120_tree);


                    }
                    break;

            }


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:112:47: ( 'else' ( '{' )? ( stmt )* ( '}' )? )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==72) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:112:48: 'else' ( '{' )? ( stmt )* ( '}' )?
                    {
                    string_literal121=(Token)match(input,72,FOLLOW_72_in_ifstmt857); 
                    string_literal121_tree = 
                    (Object)adaptor.create(string_literal121)
                    ;
                    adaptor.addChild(root_0, string_literal121_tree);


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:112:55: ( '{' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==77) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:112:56: '{'
                            {
                            char_literal122=(Token)match(input,77,FOLLOW_77_in_ifstmt860); 
                            char_literal122_tree = 
                            (Object)adaptor.create(char_literal122)
                            ;
                            adaptor.addChild(root_0, char_literal122_tree);


                            }
                            break;

                    }


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:112:62: ( stmt )*
                    loop28:
                    do {
                        int alt28=2;
                        switch ( input.LA(1) ) {
                        case Modifier:
                            {
                            alt28=1;
                            }
                            break;
                        case INT:
                            {
                            alt28=1;
                            }
                            break;
                        case DOUBLE:
                            {
                            alt28=1;
                            }
                            break;
                        case 74:
                            {
                            alt28=1;
                            }
                            break;
                        case 76:
                            {
                            alt28=1;
                            }
                            break;
                        case 73:
                            {
                            alt28=1;
                            }
                            break;
                        case VAR:
                            {
                            alt28=1;
                            }
                            break;
                        case STRING:
                            {
                            alt28=1;
                            }
                            break;
                        case BOOLEAN:
                            {
                            alt28=1;
                            }
                            break;
                        case SEMICOLON:
                            {
                            alt28=1;
                            }
                            break;
                        case System:
                            {
                            alt28=1;
                            }
                            break;

                        }

                        switch (alt28) {
                    	case 1 :
                    	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:112:62: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_ifstmt864);
                    	    stmt123=stmt();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, stmt123.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:112:68: ( '}' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==78) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:112:69: '}'
                            {
                            char_literal124=(Token)match(input,78,FOLLOW_78_in_ifstmt868); 
                            char_literal124_tree = 
                            (Object)adaptor.create(char_literal124)
                            ;
                            adaptor.addChild(root_0, char_literal124_tree);


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


    public static class ifstmt_2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifstmt_2"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:113:2: ifstmt_2 : 'if' '(' if_cond ')' ( '{' )? ( stmt )* ( '}' )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )? ;
    public final ArithmeticExpressionsParser.ifstmt_2_return ifstmt_2() throws RecognitionException {
        ArithmeticExpressionsParser.ifstmt_2_return retval = new ArithmeticExpressionsParser.ifstmt_2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal125=null;
        Token char_literal126=null;
        Token char_literal128=null;
        Token char_literal129=null;
        Token char_literal131=null;
        Token string_literal132=null;
        Token char_literal133=null;
        Token char_literal135=null;
        ArithmeticExpressionsParser.if_cond_return if_cond127 =null;

        ArithmeticExpressionsParser.stmt_return stmt130 =null;

        ArithmeticExpressionsParser.stmt_return stmt134 =null;


        Object string_literal125_tree=null;
        Object char_literal126_tree=null;
        Object char_literal128_tree=null;
        Object char_literal129_tree=null;
        Object char_literal131_tree=null;
        Object string_literal132_tree=null;
        Object char_literal133_tree=null;
        Object char_literal135_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:113:12: ( 'if' '(' if_cond ')' ( '{' )? ( stmt )* ( '}' )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )? )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:114:2: 'if' '(' if_cond ')' ( '{' )? ( stmt )* ( '}' )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal125=(Token)match(input,74,FOLLOW_74_in_ifstmt_2886); 
            string_literal125_tree = 
            (Object)adaptor.create(string_literal125)
            ;
            adaptor.addChild(root_0, string_literal125_tree);


            char_literal126=(Token)match(input,55,FOLLOW_55_in_ifstmt_2888); 
            char_literal126_tree = 
            (Object)adaptor.create(char_literal126)
            ;
            adaptor.addChild(root_0, char_literal126_tree);


            pushFollow(FOLLOW_if_cond_in_ifstmt_2890);
            if_cond127=if_cond();

            state._fsp--;

            adaptor.addChild(root_0, if_cond127.getTree());

            char_literal128=(Token)match(input,56,FOLLOW_56_in_ifstmt_2892); 
            char_literal128_tree = 
            (Object)adaptor.create(char_literal128)
            ;
            adaptor.addChild(root_0, char_literal128_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:114:23: ( '{' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==77) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:114:24: '{'
                    {
                    char_literal129=(Token)match(input,77,FOLLOW_77_in_ifstmt_2895); 
                    char_literal129_tree = 
                    (Object)adaptor.create(char_literal129)
                    ;
                    adaptor.addChild(root_0, char_literal129_tree);


                    }
                    break;

            }


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:114:30: ( stmt )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==BOOLEAN||LA32_0==DOUBLE||LA32_0==INT||LA32_0==Modifier||LA32_0==SEMICOLON||LA32_0==STRING||LA32_0==System||LA32_0==VAR||(LA32_0 >= 73 && LA32_0 <= 74)||LA32_0==76) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:114:30: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_ifstmt_2899);
            	    stmt130=stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stmt130.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:114:36: ( '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==78) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:114:37: '}'
                    {
                    char_literal131=(Token)match(input,78,FOLLOW_78_in_ifstmt_2903); 
                    char_literal131_tree = 
                    (Object)adaptor.create(char_literal131)
                    ;
                    adaptor.addChild(root_0, char_literal131_tree);


                    }
                    break;

            }


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:114:42: ( 'else' ( '{' )? ( stmt )* ( '}' )? )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==72) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:114:43: 'else' ( '{' )? ( stmt )* ( '}' )?
                    {
                    string_literal132=(Token)match(input,72,FOLLOW_72_in_ifstmt_2907); 
                    string_literal132_tree = 
                    (Object)adaptor.create(string_literal132)
                    ;
                    adaptor.addChild(root_0, string_literal132_tree);


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:114:50: ( '{' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==77) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:114:51: '{'
                            {
                            char_literal133=(Token)match(input,77,FOLLOW_77_in_ifstmt_2910); 
                            char_literal133_tree = 
                            (Object)adaptor.create(char_literal133)
                            ;
                            adaptor.addChild(root_0, char_literal133_tree);


                            }
                            break;

                    }


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:114:57: ( stmt )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==BOOLEAN||LA35_0==DOUBLE||LA35_0==INT||LA35_0==Modifier||LA35_0==SEMICOLON||LA35_0==STRING||LA35_0==System||LA35_0==VAR||(LA35_0 >= 73 && LA35_0 <= 74)||LA35_0==76) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:114:57: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_ifstmt_2914);
                    	    stmt134=stmt();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, stmt134.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:114:63: ( '}' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==78) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:114:64: '}'
                            {
                            char_literal135=(Token)match(input,78,FOLLOW_78_in_ifstmt_2918); 
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
    // $ANTLR end "ifstmt_2"


    public static class if_condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_condition"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:115:3: if_condition : ( '(' if_cond ')' | object );
    public final ArithmeticExpressionsParser.if_condition_return if_condition() throws RecognitionException {
        ArithmeticExpressionsParser.if_condition_return retval = new ArithmeticExpressionsParser.if_condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal136=null;
        Token char_literal138=null;
        ArithmeticExpressionsParser.if_cond_return if_cond137 =null;

        ArithmeticExpressionsParser.object_return object139 =null;


        Object char_literal136_tree=null;
        Object char_literal138_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:116:4: ( '(' if_cond ')' | object )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==55) ) {
                alt38=1;
            }
            else if ( (LA38_0==VAR) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:116:6: '(' if_cond ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal136=(Token)match(input,55,FOLLOW_55_in_if_condition935); 
                    char_literal136_tree = 
                    (Object)adaptor.create(char_literal136)
                    ;
                    adaptor.addChild(root_0, char_literal136_tree);


                    pushFollow(FOLLOW_if_cond_in_if_condition937);
                    if_cond137=if_cond();

                    state._fsp--;

                    adaptor.addChild(root_0, if_cond137.getTree());

                    char_literal138=(Token)match(input,56,FOLLOW_56_in_if_condition939); 
                    char_literal138_tree = 
                    (Object)adaptor.create(char_literal138)
                    ;
                    adaptor.addChild(root_0, char_literal138_tree);


                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:116:22: object
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_object_in_if_condition941);
                    object139=object();

                    state._fsp--;

                    adaptor.addChild(root_0, object139.getTree());

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
    // $ANTLR end "if_condition"


    public static class if_cond_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_cond"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:117:2: if_cond : VAR ( ( '>' | '<' ) ^ VAR )* ;
    public final ArithmeticExpressionsParser.if_cond_return if_cond() throws RecognitionException {
        ArithmeticExpressionsParser.if_cond_return retval = new ArithmeticExpressionsParser.if_cond_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR140=null;
        Token set141=null;
        Token VAR142=null;

        Object VAR140_tree=null;
        Object set141_tree=null;
        Object VAR142_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:117:10: ( VAR ( ( '>' | '<' ) ^ VAR )* )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:117:11: VAR ( ( '>' | '<' ) ^ VAR )*
            {
            root_0 = (Object)adaptor.nil();


            VAR140=(Token)match(input,VAR,FOLLOW_VAR_in_if_cond948); 
            VAR140_tree = 
            (Object)adaptor.create(VAR140)
            ;
            adaptor.addChild(root_0, VAR140_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:117:15: ( ( '>' | '<' ) ^ VAR )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==66||LA39_0==68) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:117:16: ( '>' | '<' ) ^ VAR
            	    {
            	    set141=(Token)input.LT(1);

            	    set141=(Token)input.LT(1);

            	    if ( input.LA(1)==66||input.LA(1)==68 ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set141)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    VAR142=(Token)match(input,VAR,FOLLOW_VAR_in_if_cond963); 
            	    VAR142_tree = 
            	    (Object)adaptor.create(VAR142)
            	    ;
            	    adaptor.addChild(root_0, VAR142_tree);


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // $ANTLR end "if_cond"


    public static class forloop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forloop"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:1: forloop : 'for' '(' ( decl ) ( condition ) SEMICOLON ( VAR change ) ')' '{' ( stmt )* '}' ;
    public final ArithmeticExpressionsParser.forloop_return forloop() throws RecognitionException {
        ArithmeticExpressionsParser.forloop_return retval = new ArithmeticExpressionsParser.forloop_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal143=null;
        Token char_literal144=null;
        Token SEMICOLON147=null;
        Token VAR148=null;
        Token char_literal150=null;
        Token char_literal151=null;
        Token char_literal153=null;
        ArithmeticExpressionsParser.decl_return decl145 =null;

        ArithmeticExpressionsParser.condition_return condition146 =null;

        ArithmeticExpressionsParser.change_return change149 =null;

        ArithmeticExpressionsParser.stmt_return stmt152 =null;


        Object string_literal143_tree=null;
        Object char_literal144_tree=null;
        Object SEMICOLON147_tree=null;
        Object VAR148_tree=null;
        Object char_literal150_tree=null;
        Object char_literal151_tree=null;
        Object char_literal153_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:9: ( 'for' '(' ( decl ) ( condition ) SEMICOLON ( VAR change ) ')' '{' ( stmt )* '}' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:119:2: 'for' '(' ( decl ) ( condition ) SEMICOLON ( VAR change ) ')' '{' ( stmt )* '}'
            {
            root_0 = (Object)adaptor.nil();


            string_literal143=(Token)match(input,73,FOLLOW_73_in_forloop978); 
            string_literal143_tree = 
            (Object)adaptor.create(string_literal143)
            ;
            adaptor.addChild(root_0, string_literal143_tree);


            char_literal144=(Token)match(input,55,FOLLOW_55_in_forloop980); 
            char_literal144_tree = 
            (Object)adaptor.create(char_literal144)
            ;
            adaptor.addChild(root_0, char_literal144_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:119:12: ( decl )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:119:13: decl
            {
            pushFollow(FOLLOW_decl_in_forloop983);
            decl145=decl();

            state._fsp--;

            adaptor.addChild(root_0, decl145.getTree());

            }


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:119:19: ( condition )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:119:20: condition
            {
            pushFollow(FOLLOW_condition_in_forloop987);
            condition146=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition146.getTree());

            }


            SEMICOLON147=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_forloop990); 
            SEMICOLON147_tree = 
            (Object)adaptor.create(SEMICOLON147)
            ;
            adaptor.addChild(root_0, SEMICOLON147_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:119:41: ( VAR change )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:119:42: VAR change
            {
            VAR148=(Token)match(input,VAR,FOLLOW_VAR_in_forloop993); 
            VAR148_tree = 
            (Object)adaptor.create(VAR148)
            ;
            adaptor.addChild(root_0, VAR148_tree);


            pushFollow(FOLLOW_change_in_forloop995);
            change149=change();

            state._fsp--;

            adaptor.addChild(root_0, change149.getTree());

            }


            char_literal150=(Token)match(input,56,FOLLOW_56_in_forloop998); 
            char_literal150_tree = 
            (Object)adaptor.create(char_literal150)
            ;
            adaptor.addChild(root_0, char_literal150_tree);


            char_literal151=(Token)match(input,77,FOLLOW_77_in_forloop1000); 
            char_literal151_tree = 
            (Object)adaptor.create(char_literal151)
            ;
            adaptor.addChild(root_0, char_literal151_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:119:62: ( stmt )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==BOOLEAN||LA40_0==DOUBLE||LA40_0==INT||LA40_0==Modifier||LA40_0==SEMICOLON||LA40_0==STRING||LA40_0==System||LA40_0==VAR||(LA40_0 >= 73 && LA40_0 <= 74)||LA40_0==76) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:119:62: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_forloop1002);
            	    stmt152=stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stmt152.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            char_literal153=(Token)match(input,78,FOLLOW_78_in_forloop1005); 
            char_literal153_tree = 
            (Object)adaptor.create(char_literal153)
            ;
            adaptor.addChild(root_0, char_literal153_tree);


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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:121:1: assigment : assign -> ^( Assigment assign ) ;
    public final ArithmeticExpressionsParser.assigment_return assigment() throws RecognitionException {
        ArithmeticExpressionsParser.assigment_return retval = new ArithmeticExpressionsParser.assigment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.assign_return assign154 =null;


        RewriteRuleSubtreeStream stream_assign=new RewriteRuleSubtreeStream(adaptor,"rule assign");
        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:121:10: ( assign -> ^( Assigment assign ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:122:2: assign
            {
            pushFollow(FOLLOW_assign_in_assigment1017);
            assign154=assign();

            state._fsp--;

            stream_assign.add(assign154.getTree());

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
            // 123:2: -> ^( Assigment assign )
            {
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:123:5: ^( Assigment assign )
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:130:1: assign : VAR ( change | '=' generalArithExpr ) SEMICOLON ;
    public final ArithmeticExpressionsParser.assign_return assign() throws RecognitionException {
        ArithmeticExpressionsParser.assign_return retval = new ArithmeticExpressionsParser.assign_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR155=null;
        Token char_literal157=null;
        Token SEMICOLON159=null;
        ArithmeticExpressionsParser.change_return change156 =null;

        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr158 =null;


        Object VAR155_tree=null;
        Object char_literal157_tree=null;
        Object SEMICOLON159_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:130:8: ( VAR ( change | '=' generalArithExpr ) SEMICOLON )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:131:2: VAR ( change | '=' generalArithExpr ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            VAR155=(Token)match(input,VAR,FOLLOW_VAR_in_assign1061); 
            VAR155_tree = 
            (Object)adaptor.create(VAR155)
            ;
            adaptor.addChild(root_0, VAR155_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:131:6: ( change | '=' generalArithExpr )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0 >= 59 && LA41_0 <= 60)||(LA41_0 >= 63 && LA41_0 <= 64)) ) {
                alt41=1;
            }
            else if ( (LA41_0==67) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }
            switch (alt41) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:131:7: change
                    {
                    pushFollow(FOLLOW_change_in_assign1064);
                    change156=change();

                    state._fsp--;

                    adaptor.addChild(root_0, change156.getTree());

                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:131:14: '=' generalArithExpr
                    {
                    char_literal157=(Token)match(input,67,FOLLOW_67_in_assign1066); 
                    char_literal157_tree = 
                    (Object)adaptor.create(char_literal157)
                    ;
                    adaptor.addChild(root_0, char_literal157_tree);


                    pushFollow(FOLLOW_generalArithExpr_in_assign1068);
                    generalArithExpr158=generalArithExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, generalArithExpr158.getTree());

                    }
                    break;

            }


            SEMICOLON159=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assign1071); 
            SEMICOLON159_tree = 
            (Object)adaptor.create(SEMICOLON159)
            ;
            adaptor.addChild(root_0, SEMICOLON159_tree);


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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:133:1: change : ( '++' | '--' | ( '+=' | '-=' ) generalArithExpr ) ;
    public final ArithmeticExpressionsParser.change_return change() throws RecognitionException {
        ArithmeticExpressionsParser.change_return retval = new ArithmeticExpressionsParser.change_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal160=null;
        Token string_literal161=null;
        Token set162=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr163 =null;


        Object string_literal160_tree=null;
        Object string_literal161_tree=null;
        Object set162_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:133:8: ( ( '++' | '--' | ( '+=' | '-=' ) generalArithExpr ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:134:2: ( '++' | '--' | ( '+=' | '-=' ) generalArithExpr )
            {
            root_0 = (Object)adaptor.nil();


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:134:2: ( '++' | '--' | ( '+=' | '-=' ) generalArithExpr )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt42=1;
                }
                break;
            case 63:
                {
                alt42=2;
                }
                break;
            case 60:
            case 64:
                {
                alt42=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }

            switch (alt42) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:134:3: '++'
                    {
                    string_literal160=(Token)match(input,59,FOLLOW_59_in_change1082); 
                    string_literal160_tree = 
                    (Object)adaptor.create(string_literal160)
                    ;
                    adaptor.addChild(root_0, string_literal160_tree);


                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:134:8: '--'
                    {
                    string_literal161=(Token)match(input,63,FOLLOW_63_in_change1084); 
                    string_literal161_tree = 
                    (Object)adaptor.create(string_literal161)
                    ;
                    adaptor.addChild(root_0, string_literal161_tree);


                    }
                    break;
                case 3 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:134:13: ( '+=' | '-=' ) generalArithExpr
                    {
                    set162=(Token)input.LT(1);

                    if ( input.LA(1)==60||input.LA(1)==64 ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set162)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_generalArithExpr_in_change1091);
                    generalArithExpr163=generalArithExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, generalArithExpr163.getTree());

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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:137:1: condition : generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? -> ^( Condition generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? ) ;
    public final ArithmeticExpressionsParser.condition_return condition() throws RecognitionException {
        ArithmeticExpressionsParser.condition_return retval = new ArithmeticExpressionsParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RelationalOperators165=null;
        Token AndOr167=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr164 =null;

        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr166 =null;

        ArithmeticExpressionsParser.condition_return condition168 =null;


        Object RelationalOperators165_tree=null;
        Object AndOr167_tree=null;
        RewriteRuleTokenStream stream_RelationalOperators=new RewriteRuleTokenStream(adaptor,"token RelationalOperators");
        RewriteRuleTokenStream stream_AndOr=new RewriteRuleTokenStream(adaptor,"token AndOr");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_generalArithExpr=new RewriteRuleSubtreeStream(adaptor,"rule generalArithExpr");
        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:137:10: ( generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? -> ^( Condition generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:138:2: generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )?
            {
            pushFollow(FOLLOW_generalArithExpr_in_condition1104);
            generalArithExpr164=generalArithExpr();

            state._fsp--;

            stream_generalArithExpr.add(generalArithExpr164.getTree());

            RelationalOperators165=(Token)match(input,RelationalOperators,FOLLOW_RelationalOperators_in_condition1106);  
            stream_RelationalOperators.add(RelationalOperators165);


            pushFollow(FOLLOW_generalArithExpr_in_condition1108);
            generalArithExpr166=generalArithExpr();

            state._fsp--;

            stream_generalArithExpr.add(generalArithExpr166.getTree());

            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:138:56: ( AndOr condition )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==AndOr) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:138:57: AndOr condition
                    {
                    AndOr167=(Token)match(input,AndOr,FOLLOW_AndOr_in_condition1111);  
                    stream_AndOr.add(AndOr167);


                    pushFollow(FOLLOW_condition_in_condition1113);
                    condition168=condition();

                    state._fsp--;

                    stream_condition.add(condition168.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: condition, generalArithExpr, AndOr, RelationalOperators, generalArithExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 139:2: -> ^( Condition generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? )
            {
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:139:4: ^( Condition generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? )
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

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:139:70: ( AndOr condition )?
                if ( stream_condition.hasNext()||stream_AndOr.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_AndOr.nextNode()
                    );

                    adaptor.addChild(root_1, stream_condition.nextTree());

                }
                stream_condition.reset();
                stream_AndOr.reset();

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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:146:1: int_dec : ( Modifier )? INT VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON ;
    public final ArithmeticExpressionsParser.int_dec_return int_dec() throws RecognitionException {
        ArithmeticExpressionsParser.int_dec_return retval = new ArithmeticExpressionsParser.int_dec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier169=null;
        Token INT170=null;
        Token VAR171=null;
        Token char_literal172=null;
        Token char_literal174=null;
        Token VAR175=null;
        Token SEMICOLON176=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr173 =null;


        Object Modifier169_tree=null;
        Object INT170_tree=null;
        Object VAR171_tree=null;
        Object char_literal172_tree=null;
        Object char_literal174_tree=null;
        Object VAR175_tree=null;
        Object SEMICOLON176_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:146:9: ( ( Modifier )? INT VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:148:2: ( Modifier )? INT VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:148:2: ( Modifier )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Modifier) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:148:2: Modifier
                    {
                    Modifier169=(Token)match(input,Modifier,FOLLOW_Modifier_in_int_dec1172); 
                    Modifier169_tree = 
                    (Object)adaptor.create(Modifier169)
                    ;
                    adaptor.addChild(root_0, Modifier169_tree);


                    }
                    break;

            }


            INT170=(Token)match(input,INT,FOLLOW_INT_in_int_dec1175); 
            INT170_tree = 
            (Object)adaptor.create(INT170)
            ;
            adaptor.addChild(root_0, INT170_tree);


            VAR171=(Token)match(input,VAR,FOLLOW_VAR_in_int_dec1177); 
            VAR171_tree = 
            (Object)adaptor.create(VAR171)
            ;
            adaptor.addChild(root_0, VAR171_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:148:20: ( ( '=' generalArithExpr )? | ( ',' VAR )* )
            int alt47=2;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt47=1;
                }
                break;
            case SEMICOLON:
                {
                alt47=1;
                }
                break;
            case 61:
                {
                alt47=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }

            switch (alt47) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:148:21: ( '=' generalArithExpr )?
                    {
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:148:21: ( '=' generalArithExpr )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==67) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:148:22: '=' generalArithExpr
                            {
                            char_literal172=(Token)match(input,67,FOLLOW_67_in_int_dec1181); 
                            char_literal172_tree = 
                            (Object)adaptor.create(char_literal172)
                            ;
                            adaptor.addChild(root_0, char_literal172_tree);


                            pushFollow(FOLLOW_generalArithExpr_in_int_dec1183);
                            generalArithExpr173=generalArithExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, generalArithExpr173.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:148:45: ( ',' VAR )*
                    {
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:148:45: ( ',' VAR )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==61) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:148:46: ',' VAR
                    	    {
                    	    char_literal174=(Token)match(input,61,FOLLOW_61_in_int_dec1188); 
                    	    char_literal174_tree = 
                    	    (Object)adaptor.create(char_literal174)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal174_tree);


                    	    VAR175=(Token)match(input,VAR,FOLLOW_VAR_in_int_dec1190); 
                    	    VAR175_tree = 
                    	    (Object)adaptor.create(VAR175)
                    	    ;
                    	    adaptor.addChild(root_0, VAR175_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }


            SEMICOLON176=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_int_dec1195); 
            SEMICOLON176_tree = 
            (Object)adaptor.create(SEMICOLON176)
            ;
            adaptor.addChild(root_0, SEMICOLON176_tree);


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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:151:1: double_dec : ( Modifier )? DOUBLE VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON ;
    public final ArithmeticExpressionsParser.double_dec_return double_dec() throws RecognitionException {
        ArithmeticExpressionsParser.double_dec_return retval = new ArithmeticExpressionsParser.double_dec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier177=null;
        Token DOUBLE178=null;
        Token VAR179=null;
        Token char_literal180=null;
        Token char_literal182=null;
        Token VAR183=null;
        Token SEMICOLON184=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr181 =null;


        Object Modifier177_tree=null;
        Object DOUBLE178_tree=null;
        Object VAR179_tree=null;
        Object char_literal180_tree=null;
        Object char_literal182_tree=null;
        Object VAR183_tree=null;
        Object SEMICOLON184_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:151:11: ( ( Modifier )? DOUBLE VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:153:2: ( Modifier )? DOUBLE VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:153:2: ( Modifier )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==Modifier) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:153:2: Modifier
                    {
                    Modifier177=(Token)match(input,Modifier,FOLLOW_Modifier_in_double_dec1210); 
                    Modifier177_tree = 
                    (Object)adaptor.create(Modifier177)
                    ;
                    adaptor.addChild(root_0, Modifier177_tree);


                    }
                    break;

            }


            DOUBLE178=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_double_dec1213); 
            DOUBLE178_tree = 
            (Object)adaptor.create(DOUBLE178)
            ;
            adaptor.addChild(root_0, DOUBLE178_tree);


            VAR179=(Token)match(input,VAR,FOLLOW_VAR_in_double_dec1215); 
            VAR179_tree = 
            (Object)adaptor.create(VAR179)
            ;
            adaptor.addChild(root_0, VAR179_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:153:23: ( ( '=' generalArithExpr )? | ( ',' VAR )* )
            int alt51=2;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt51=1;
                }
                break;
            case SEMICOLON:
                {
                alt51=1;
                }
                break;
            case 61:
                {
                alt51=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }

            switch (alt51) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:153:24: ( '=' generalArithExpr )?
                    {
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:153:24: ( '=' generalArithExpr )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==67) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:153:25: '=' generalArithExpr
                            {
                            char_literal180=(Token)match(input,67,FOLLOW_67_in_double_dec1219); 
                            char_literal180_tree = 
                            (Object)adaptor.create(char_literal180)
                            ;
                            adaptor.addChild(root_0, char_literal180_tree);


                            pushFollow(FOLLOW_generalArithExpr_in_double_dec1221);
                            generalArithExpr181=generalArithExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, generalArithExpr181.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:153:48: ( ',' VAR )*
                    {
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:153:48: ( ',' VAR )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==61) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:153:49: ',' VAR
                    	    {
                    	    char_literal182=(Token)match(input,61,FOLLOW_61_in_double_dec1226); 
                    	    char_literal182_tree = 
                    	    (Object)adaptor.create(char_literal182)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal182_tree);


                    	    VAR183=(Token)match(input,VAR,FOLLOW_VAR_in_double_dec1228); 
                    	    VAR183_tree = 
                    	    (Object)adaptor.create(VAR183)
                    	    ;
                    	    adaptor.addChild(root_0, VAR183_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }


            SEMICOLON184=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_double_dec1233); 
            SEMICOLON184_tree = 
            (Object)adaptor.create(SEMICOLON184)
            ;
            adaptor.addChild(root_0, SEMICOLON184_tree);


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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:156:1: string_dec : ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON -> ^( String_Dec ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON ) ;
    public final ArithmeticExpressionsParser.string_dec_return string_dec() throws RecognitionException {
        ArithmeticExpressionsParser.string_dec_return retval = new ArithmeticExpressionsParser.string_dec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier185=null;
        Token STRING186=null;
        Token VAR187=null;
        Token char_literal188=null;
        Token Strings189=null;
        Token SEMICOLON190=null;

        Object Modifier185_tree=null;
        Object STRING186_tree=null;
        Object VAR187_tree=null;
        Object char_literal188_tree=null;
        Object Strings189_tree=null;
        Object SEMICOLON190_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_Modifier=new RewriteRuleTokenStream(adaptor,"token Modifier");
        RewriteRuleTokenStream stream_Strings=new RewriteRuleTokenStream(adaptor,"token Strings");

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:156:11: ( ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON -> ^( String_Dec ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:158:2: ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON
            {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:158:2: ( Modifier )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==Modifier) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:158:2: Modifier
                    {
                    Modifier185=(Token)match(input,Modifier,FOLLOW_Modifier_in_string_dec1246);  
                    stream_Modifier.add(Modifier185);


                    }
                    break;

            }


            STRING186=(Token)match(input,STRING,FOLLOW_STRING_in_string_dec1249);  
            stream_STRING.add(STRING186);


            VAR187=(Token)match(input,VAR,FOLLOW_VAR_in_string_dec1251);  
            stream_VAR.add(VAR187);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:158:23: ( '=' Strings )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==67) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:158:24: '=' Strings
                    {
                    char_literal188=(Token)match(input,67,FOLLOW_67_in_string_dec1254);  
                    stream_67.add(char_literal188);


                    Strings189=(Token)match(input,Strings,FOLLOW_Strings_in_string_dec1256);  
                    stream_Strings.add(Strings189);


                    }
                    break;

            }


            SEMICOLON190=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_string_dec1260);  
            stream_SEMICOLON.add(SEMICOLON190);


            // AST REWRITE
            // elements: 67, VAR, STRING, SEMICOLON, Modifier, Strings
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 159:3: -> ^( String_Dec ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON )
            {
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:159:6: ^( String_Dec ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(String_Dec, "String_Dec")
                , root_1);

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:159:19: ( Modifier )?
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

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:159:40: ( '=' Strings )?
                if ( stream_67.hasNext()||stream_Strings.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_67.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_Strings.nextNode()
                    );

                }
                stream_67.reset();
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:161:1: generalArithExpr : term ( ( '+' | '-' ) ^ term )* ;
    public final ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr() throws RecognitionException {
        ArithmeticExpressionsParser.generalArithExpr_return retval = new ArithmeticExpressionsParser.generalArithExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set192=null;
        ArithmeticExpressionsParser.term_return term191 =null;

        ArithmeticExpressionsParser.term_return term193 =null;


        Object set192_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:161:17: ( term ( ( '+' | '-' ) ^ term )* )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:161:19: term ( ( '+' | '-' ) ^ term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_generalArithExpr1292);
            term191=term();

            state._fsp--;

            adaptor.addChild(root_0, term191.getTree());

            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:161:24: ( ( '+' | '-' ) ^ term )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==58||LA54_0==62) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:161:25: ( '+' | '-' ) ^ term
            	    {
            	    set192=(Token)input.LT(1);

            	    set192=(Token)input.LT(1);

            	    if ( input.LA(1)==58||input.LA(1)==62 ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set192)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_term_in_generalArithExpr1307);
            	    term193=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term193.getTree());

            	    }
            	    break;

            	default :
            	    break loop54;
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:169:1: term : ( object | factor ( ( '*' | '/' ) ^ factor )* );
    public final ArithmeticExpressionsParser.term_return term() throws RecognitionException {
        ArithmeticExpressionsParser.term_return retval = new ArithmeticExpressionsParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set196=null;
        ArithmeticExpressionsParser.object_return object194 =null;

        ArithmeticExpressionsParser.factor_return factor195 =null;

        ArithmeticExpressionsParser.factor_return factor197 =null;


        Object set196_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:169:6: ( object | factor ( ( '*' | '/' ) ^ factor )* )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==VAR) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==Dot) ) {
                    alt56=1;
                }
                else if ( (LA56_1==AndOr||(LA56_1 >= RelationalOperators && LA56_1 <= SEMICOLON)||(LA56_1 >= 56 && LA56_1 <= 58)||LA56_1==62||LA56_1==65) ) {
                    alt56=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA56_0==DNUM||LA56_0==Fun||LA56_0==NUM||LA56_0==55||LA56_0==62) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }
            switch (alt56) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:169:7: object
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_object_in_term1344);
                    object194=object();

                    state._fsp--;

                    adaptor.addChild(root_0, object194.getTree());

                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:169:15: factor ( ( '*' | '/' ) ^ factor )*
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_factor_in_term1347);
                    factor195=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor195.getTree());

                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:169:22: ( ( '*' | '/' ) ^ factor )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==57||LA55_0==65) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:169:24: ( '*' | '/' ) ^ factor
                    	    {
                    	    set196=(Token)input.LT(1);

                    	    set196=(Token)input.LT(1);

                    	    if ( input.LA(1)==57||input.LA(1)==65 ) {
                    	        input.consume();
                    	        root_0 = (Object)adaptor.becomeRoot(
                    	        (Object)adaptor.create(set196)
                    	        , root_0);
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }


                    	    pushFollow(FOLLOW_factor_in_term1363);
                    	    factor197=factor();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, factor197.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop55;
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:177:1: factor : ( VAR -> ^( Factor VAR ) | NUM -> ^( Factor NUM ) | DNUM -> ^( Factor DOUBLE ) | '-' VAR -> ^( Factor '-' VAR ) | '-' INT -> ^( Factor '-' INT ) | '-' DNUM -> ^( Factor '-' DOUBLE ) | '(' generalArithExpr ')' -> ^( Factor '(' generalArithExpr ')' ) | Fun '(' generalArithExpr ')' -> ^( Factor Fun '(' generalArithExpr ')' ) );
    public final ArithmeticExpressionsParser.factor_return factor() throws RecognitionException {
        ArithmeticExpressionsParser.factor_return retval = new ArithmeticExpressionsParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR198=null;
        Token NUM199=null;
        Token DNUM200=null;
        Token char_literal201=null;
        Token VAR202=null;
        Token char_literal203=null;
        Token INT204=null;
        Token char_literal205=null;
        Token DNUM206=null;
        Token char_literal207=null;
        Token char_literal209=null;
        Token Fun210=null;
        Token char_literal211=null;
        Token char_literal213=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr208 =null;

        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr212 =null;


        Object VAR198_tree=null;
        Object NUM199_tree=null;
        Object DNUM200_tree=null;
        Object char_literal201_tree=null;
        Object VAR202_tree=null;
        Object char_literal203_tree=null;
        Object INT204_tree=null;
        Object char_literal205_tree=null;
        Object DNUM206_tree=null;
        Object char_literal207_tree=null;
        Object char_literal209_tree=null;
        Object Fun210_tree=null;
        Object char_literal211_tree=null;
        Object char_literal213_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_DNUM=new RewriteRuleTokenStream(adaptor,"token DNUM");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_Fun=new RewriteRuleTokenStream(adaptor,"token Fun");
        RewriteRuleSubtreeStream stream_generalArithExpr=new RewriteRuleSubtreeStream(adaptor,"rule generalArithExpr");
        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:177:8: ( VAR -> ^( Factor VAR ) | NUM -> ^( Factor NUM ) | DNUM -> ^( Factor DOUBLE ) | '-' VAR -> ^( Factor '-' VAR ) | '-' INT -> ^( Factor '-' INT ) | '-' DNUM -> ^( Factor '-' DOUBLE ) | '(' generalArithExpr ')' -> ^( Factor '(' generalArithExpr ')' ) | Fun '(' generalArithExpr ')' -> ^( Factor Fun '(' generalArithExpr ')' ) )
            int alt57=8;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt57=1;
                }
                break;
            case NUM:
                {
                alt57=2;
                }
                break;
            case DNUM:
                {
                alt57=3;
                }
                break;
            case 62:
                {
                switch ( input.LA(2) ) {
                case VAR:
                    {
                    alt57=4;
                    }
                    break;
                case INT:
                    {
                    alt57=5;
                    }
                    break;
                case DNUM:
                    {
                    alt57=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 4, input);

                    throw nvae;

                }

                }
                break;
            case 55:
                {
                alt57=7;
                }
                break;
            case Fun:
                {
                alt57=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }

            switch (alt57) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:178:2: VAR
                    {
                    VAR198=(Token)match(input,VAR,FOLLOW_VAR_in_factor1403);  
                    stream_VAR.add(VAR198);


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
                    // 178:6: -> ^( Factor VAR )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:178:9: ^( Factor VAR )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:179:3: NUM
                    {
                    NUM199=(Token)match(input,NUM,FOLLOW_NUM_in_factor1415);  
                    stream_NUM.add(NUM199);


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
                    // 179:7: -> ^( Factor NUM )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:179:10: ^( Factor NUM )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:180:3: DNUM
                    {
                    DNUM200=(Token)match(input,DNUM,FOLLOW_DNUM_in_factor1427);  
                    stream_DNUM.add(DNUM200);


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
                    // 180:8: -> ^( Factor DOUBLE )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:180:11: ^( Factor DOUBLE )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:181:3: '-' VAR
                    {
                    char_literal201=(Token)match(input,62,FOLLOW_62_in_factor1439);  
                    stream_62.add(char_literal201);


                    VAR202=(Token)match(input,VAR,FOLLOW_VAR_in_factor1442);  
                    stream_VAR.add(VAR202);


                    // AST REWRITE
                    // elements: 62, VAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 181:12: -> ^( Factor '-' VAR )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:181:15: ^( Factor '-' VAR )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_62.nextNode()
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:182:3: '-' INT
                    {
                    char_literal203=(Token)match(input,62,FOLLOW_62_in_factor1457);  
                    stream_62.add(char_literal203);


                    INT204=(Token)match(input,INT,FOLLOW_INT_in_factor1460);  
                    stream_INT.add(INT204);


                    // AST REWRITE
                    // elements: 62, INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 182:12: -> ^( Factor '-' INT )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:182:15: ^( Factor '-' INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_62.nextNode()
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:183:3: '-' DNUM
                    {
                    char_literal205=(Token)match(input,62,FOLLOW_62_in_factor1475);  
                    stream_62.add(char_literal205);


                    DNUM206=(Token)match(input,DNUM,FOLLOW_DNUM_in_factor1478);  
                    stream_DNUM.add(DNUM206);


                    // AST REWRITE
                    // elements: 62
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 183:14: -> ^( Factor '-' DOUBLE )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:183:17: ^( Factor '-' DOUBLE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_62.nextNode()
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:184:3: '(' generalArithExpr ')'
                    {
                    char_literal207=(Token)match(input,55,FOLLOW_55_in_factor1494);  
                    stream_55.add(char_literal207);


                    pushFollow(FOLLOW_generalArithExpr_in_factor1496);
                    generalArithExpr208=generalArithExpr();

                    state._fsp--;

                    stream_generalArithExpr.add(generalArithExpr208.getTree());

                    char_literal209=(Token)match(input,56,FOLLOW_56_in_factor1498);  
                    stream_56.add(char_literal209);


                    // AST REWRITE
                    // elements: 56, 55, generalArithExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 184:28: -> ^( Factor '(' generalArithExpr ')' )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:184:31: ^( Factor '(' generalArithExpr ')' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_55.nextNode()
                        );

                        adaptor.addChild(root_1, stream_generalArithExpr.nextTree());

                        adaptor.addChild(root_1, 
                        stream_56.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:185:4: Fun '(' generalArithExpr ')'
                    {
                    Fun210=(Token)match(input,Fun,FOLLOW_Fun_in_factor1516);  
                    stream_Fun.add(Fun210);


                    char_literal211=(Token)match(input,55,FOLLOW_55_in_factor1518);  
                    stream_55.add(char_literal211);


                    pushFollow(FOLLOW_generalArithExpr_in_factor1520);
                    generalArithExpr212=generalArithExpr();

                    state._fsp--;

                    stream_generalArithExpr.add(generalArithExpr212.getTree());

                    char_literal213=(Token)match(input,56,FOLLOW_56_in_factor1522);  
                    stream_56.add(char_literal213);


                    // AST REWRITE
                    // elements: 55, generalArithExpr, Fun, 56
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 185:33: -> ^( Factor Fun '(' generalArithExpr ')' )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:185:36: ^( Factor Fun '(' generalArithExpr ')' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_Fun.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_55.nextNode()
                        );

                        adaptor.addChild(root_1, stream_generalArithExpr.nextTree());

                        adaptor.addChild(root_1, 
                        stream_56.nextNode()
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:202:1: types : ( STRING | BOOLEAN | DOUBLE | INT );
    public final ArithmeticExpressionsParser.types_return types() throws RecognitionException {
        ArithmeticExpressionsParser.types_return retval = new ArithmeticExpressionsParser.types_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set214=null;

        Object set214_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:202:7: ( STRING | BOOLEAN | DOUBLE | INT )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:
            {
            root_0 = (Object)adaptor.nil();


            set214=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEAN||input.LA(1)==DOUBLE||input.LA(1)==INT||input.LA(1)==STRING ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set214)
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
    public static final BitSet FOLLOW_Class_in_classDec154 = new BitSet(new long[]{0x0008000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_VAR_in_classDec156 = new BitSet(new long[]{0x0008000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_classDec159 = new BitSet(new long[]{0x0009028100404080L,0x0000000000005600L});
    public static final BitSet FOLLOW_stmt_in_classDec161 = new BitSet(new long[]{0x0009028100404080L,0x0000000000005600L});
    public static final BitSet FOLLOW_78_in_classDec164 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_Modifier_in_method394 = new BitSet(new long[]{0x0088020000404080L});
    public static final BitSet FOLLOW_types_in_method396 = new BitSet(new long[]{0x0088000000000000L});
    public static final BitSet FOLLOW_VAR_in_method399 = new BitSet(new long[]{0x0088000000000000L});
    public static final BitSet FOLLOW_params_in_method402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_method404 = new BitSet(new long[]{0x0009028100404080L,0x0000000000001E00L});
    public static final BitSet FOLLOW_stmt_in_method406 = new BitSet(new long[]{0x0009028100404080L,0x0000000000001E00L});
    public static final BitSet FOLLOW_75_in_method409 = new BitSet(new long[]{0x0008000200000000L});
    public static final BitSet FOLLOW_return_type_in_method411 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_method413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_method414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_main_method461 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Static_in_main_method463 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_VOID_in_main_method465 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_Main_in_main_method467 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_main_method469 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_STRING_in_main_method470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_main_method472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_main_method473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_main_method475 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_main_method477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_main_method479 = new BitSet(new long[]{0x0001000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_print_in_main_method480 = new BitSet(new long[]{0x0001000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_main_method482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_System_in_print517 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Dot_in_print519 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_Out_in_print521 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Dot_in_print523 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_Println_in_print525 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_print527 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_New_in_print528 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_print530 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_print532 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_print533 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Dot_in_print534 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_print536 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_print538 = new BitSet(new long[]{0x0100000200000000L});
    public static final BitSet FOLLOW_NUM_in_print539 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_print541 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_print543 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_print545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_types_in_initialize601 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_initialize603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_initialize604 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_initialize608 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_initialize610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_initialize612 = new BitSet(new long[]{0x0008008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_initialize615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_initialize_1625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_initialize_1627 = new BitSet(new long[]{0x0008000400000000L});
    public static final BitSet FOLLOW_set_in_initialize_1629 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_Dot_in_initialize_1635 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_initialize_1638 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_initialize_1640 = new BitSet(new long[]{0x0108000200000000L});
    public static final BitSet FOLLOW_56_in_initialize_1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_System_in_sys_print656 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Dot_in_sys_print658 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_Out_in_sys_print660 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Dot_in_sys_print662 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_Println_in_sys_print664 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_sys_print666 = new BitSet(new long[]{0x0008000200000000L});
    public static final BitSet FOLLOW_NUM_in_sys_print668 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_VAR_in_sys_print670 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Dot_in_sys_print672 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_sys_print674 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_sys_print676 = new BitSet(new long[]{0x0100000200000000L});
    public static final BitSet FOLLOW_NUM_in_sys_print677 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_sys_print679 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_sys_print683 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_sys_print685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_object692 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Dot_in_object694 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_object696 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_object698 = new BitSet(new long[]{0x0108000200000000L});
    public static final BitSet FOLLOW_56_in_object707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_params716 = new BitSet(new long[]{0x0108020000404080L});
    public static final BitSet FOLLOW_types_in_params719 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_params721 = new BitSet(new long[]{0x2100000000000000L});
    public static final BitSet FOLLOW_VAR_in_params723 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_params725 = new BitSet(new long[]{0x2100000000000000L});
    public static final BitSet FOLLOW_61_in_params729 = new BitSet(new long[]{0x0000020000404080L});
    public static final BitSet FOLLOW_types_in_params731 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_params733 = new BitSet(new long[]{0x2100000000000000L});
    public static final BitSet FOLLOW_56_in_params739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_dec_in_decl753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_dec_in_decl765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_whilestmt784 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_whilestmt786 = new BitSet(new long[]{0x4088000200102000L});
    public static final BitSet FOLLOW_condition_in_whilestmt788 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_whilestmt790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_whilestmt792 = new BitSet(new long[]{0x0009028100404080L,0x0000000000005600L});
    public static final BitSet FOLLOW_stmt_in_whilestmt794 = new BitSet(new long[]{0x0009028100404080L,0x0000000000005600L});
    public static final BitSet FOLLOW_78_in_whilestmt797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ifstmt836 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ifstmt838 = new BitSet(new long[]{0x0088000000000000L});
    public static final BitSet FOLLOW_if_condition_in_ifstmt840 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ifstmt842 = new BitSet(new long[]{0x0009028100404082L,0x0000000000007700L});
    public static final BitSet FOLLOW_77_in_ifstmt845 = new BitSet(new long[]{0x0009028100404082L,0x0000000000005700L});
    public static final BitSet FOLLOW_stmt_in_ifstmt849 = new BitSet(new long[]{0x0009028100404082L,0x0000000000005700L});
    public static final BitSet FOLLOW_78_in_ifstmt853 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ifstmt857 = new BitSet(new long[]{0x0009028100404082L,0x0000000000007600L});
    public static final BitSet FOLLOW_77_in_ifstmt860 = new BitSet(new long[]{0x0009028100404082L,0x0000000000005600L});
    public static final BitSet FOLLOW_stmt_in_ifstmt864 = new BitSet(new long[]{0x0009028100404082L,0x0000000000005600L});
    public static final BitSet FOLLOW_78_in_ifstmt868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ifstmt_2886 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ifstmt_2888 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_if_cond_in_ifstmt_2890 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ifstmt_2892 = new BitSet(new long[]{0x0009028100404082L,0x0000000000007700L});
    public static final BitSet FOLLOW_77_in_ifstmt_2895 = new BitSet(new long[]{0x0009028100404082L,0x0000000000005700L});
    public static final BitSet FOLLOW_stmt_in_ifstmt_2899 = new BitSet(new long[]{0x0009028100404082L,0x0000000000005700L});
    public static final BitSet FOLLOW_78_in_ifstmt_2903 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ifstmt_2907 = new BitSet(new long[]{0x0009028100404082L,0x0000000000007600L});
    public static final BitSet FOLLOW_77_in_ifstmt_2910 = new BitSet(new long[]{0x0009028100404082L,0x0000000000005600L});
    public static final BitSet FOLLOW_stmt_in_ifstmt_2914 = new BitSet(new long[]{0x0009028100404082L,0x0000000000005600L});
    public static final BitSet FOLLOW_78_in_ifstmt_2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_if_condition935 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_if_cond_in_if_condition937 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_if_condition939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_if_condition941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_if_cond948 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000014L});
    public static final BitSet FOLLOW_set_in_if_cond951 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_if_cond963 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000014L});
    public static final BitSet FOLLOW_73_in_forloop978 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_forloop980 = new BitSet(new long[]{0x0000000100404000L});
    public static final BitSet FOLLOW_decl_in_forloop983 = new BitSet(new long[]{0x4088000200102000L});
    public static final BitSet FOLLOW_condition_in_forloop987 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_forloop990 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_forloop993 = new BitSet(new long[]{0x9800000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_change_in_forloop995 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_forloop998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_forloop1000 = new BitSet(new long[]{0x0009028100404080L,0x0000000000005600L});
    public static final BitSet FOLLOW_stmt_in_forloop1002 = new BitSet(new long[]{0x0009028100404080L,0x0000000000005600L});
    public static final BitSet FOLLOW_78_in_forloop1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_assigment1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_assign1061 = new BitSet(new long[]{0x9800000000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_change_in_assign1064 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_67_in_assign1066 = new BitSet(new long[]{0x4088000200102000L});
    public static final BitSet FOLLOW_generalArithExpr_in_assign1068 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_assign1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_change1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_change1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_change1086 = new BitSet(new long[]{0x4088000200102000L});
    public static final BitSet FOLLOW_generalArithExpr_in_change1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_generalArithExpr_in_condition1104 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RelationalOperators_in_condition1106 = new BitSet(new long[]{0x4088000200102000L});
    public static final BitSet FOLLOW_generalArithExpr_in_condition1108 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AndOr_in_condition1111 = new BitSet(new long[]{0x4088000200102000L});
    public static final BitSet FOLLOW_condition_in_condition1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_int_dec1172 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_INT_in_int_dec1175 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_int_dec1177 = new BitSet(new long[]{0x2000008000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_int_dec1181 = new BitSet(new long[]{0x4088000200102000L});
    public static final BitSet FOLLOW_generalArithExpr_in_int_dec1183 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_61_in_int_dec1188 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_int_dec1190 = new BitSet(new long[]{0x2000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_int_dec1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_double_dec1210 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DOUBLE_in_double_dec1213 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_double_dec1215 = new BitSet(new long[]{0x2000008000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_double_dec1219 = new BitSet(new long[]{0x4088000200102000L});
    public static final BitSet FOLLOW_generalArithExpr_in_double_dec1221 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_61_in_double_dec1226 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_double_dec1228 = new BitSet(new long[]{0x2000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_double_dec1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_string_dec1246 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_STRING_in_string_dec1249 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_string_dec1251 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_string_dec1254 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_Strings_in_string_dec1256 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_string_dec1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_generalArithExpr1292 = new BitSet(new long[]{0x4400000000000002L});
    public static final BitSet FOLLOW_set_in_generalArithExpr1295 = new BitSet(new long[]{0x4088000200102000L});
    public static final BitSet FOLLOW_term_in_generalArithExpr1307 = new BitSet(new long[]{0x4400000000000002L});
    public static final BitSet FOLLOW_object_in_term1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term1347 = new BitSet(new long[]{0x0200000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_term1351 = new BitSet(new long[]{0x4088000200102000L});
    public static final BitSet FOLLOW_factor_in_term1363 = new BitSet(new long[]{0x0200000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_factor1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_factor1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DNUM_in_factor1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_factor1439 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_factor1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_factor1457 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_INT_in_factor1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_factor1475 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DNUM_in_factor1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_factor1494 = new BitSet(new long[]{0x4088000200102000L});
    public static final BitSet FOLLOW_generalArithExpr_in_factor1496 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_factor1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Fun_in_factor1516 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_factor1518 = new BitSet(new long[]{0x4088000200102000L});
    public static final BitSet FOLLOW_generalArithExpr_in_factor1520 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_factor1522 = new BitSet(new long[]{0x0000000000000002L});

}