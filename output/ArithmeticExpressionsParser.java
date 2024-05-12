// $ANTLR 3.4 E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g 2024-05-12 22:53:42

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ArithmeticExpressionsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AndOr", "Args", "Assigment", "BOOLEAN", "Big_init", "Br_close", "Br_open", "COMMENT", "Class", "ClassDec", "Condition", "Conditions", "DNUM", "DOUBLE", "Decl", "Dot", "Double_dec", "Factor", "Forloop", "Fun", "GeneralArithExpr", "INT", "Ifstmt", "Ifstmt_2", "Init_4", "Initialize", "Initialize_1", "Int_dec", "ML_COMMENT", "Main", "Main_METHOD", "Method", "Minus", "Modifier", "NUM", "New", "Out", "Plus", "Print", "Println", "RelationalOperators", "SEMICOLON", "SL_COMMENT", "STRING", "Start", "StartgeneralArithExpr", "Static", "String_Dec", "Strings", "Sys_print", "System", "TYPE", "Term", "VAR", "VOID", "Whilestmt", "WhiteSpace", "'!'", "'('", "')'", "'*'", "'++'", "'+='", "','", "'--'", "'-='", "'/'", "'<'", "'='", "'>'", "'['", "']'", "'a'", "'else if'", "'else'", "'for'", "'if'", "'return'", "'this'", "'while'"
    };

    public static final int EOF=-1;
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
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int AndOr=4;
    public static final int Args=5;
    public static final int Assigment=6;
    public static final int BOOLEAN=7;
    public static final int Big_init=8;
    public static final int Br_close=9;
    public static final int Br_open=10;
    public static final int COMMENT=11;
    public static final int Class=12;
    public static final int ClassDec=13;
    public static final int Condition=14;
    public static final int Conditions=15;
    public static final int DNUM=16;
    public static final int DOUBLE=17;
    public static final int Decl=18;
    public static final int Dot=19;
    public static final int Double_dec=20;
    public static final int Factor=21;
    public static final int Forloop=22;
    public static final int Fun=23;
    public static final int GeneralArithExpr=24;
    public static final int INT=25;
    public static final int Ifstmt=26;
    public static final int Ifstmt_2=27;
    public static final int Init_4=28;
    public static final int Initialize=29;
    public static final int Initialize_1=30;
    public static final int Int_dec=31;
    public static final int ML_COMMENT=32;
    public static final int Main=33;
    public static final int Main_METHOD=34;
    public static final int Method=35;
    public static final int Minus=36;
    public static final int Modifier=37;
    public static final int NUM=38;
    public static final int New=39;
    public static final int Out=40;
    public static final int Plus=41;
    public static final int Print=42;
    public static final int Println=43;
    public static final int RelationalOperators=44;
    public static final int SEMICOLON=45;
    public static final int SL_COMMENT=46;
    public static final int STRING=47;
    public static final int Start=48;
    public static final int StartgeneralArithExpr=49;
    public static final int Static=50;
    public static final int String_Dec=51;
    public static final int Strings=52;
    public static final int Sys_print=53;
    public static final int System=54;
    public static final int TYPE=55;
    public static final int Term=56;
    public static final int VAR=57;
    public static final int VOID=58;
    public static final int Whilestmt=59;
    public static final int WhiteSpace=60;

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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:41:1: startgeneralArithExpr : ( classDec )* -> ^( Start ( classDec )* ) ;
    public final ArithmeticExpressionsParser.startgeneralArithExpr_return startgeneralArithExpr() throws RecognitionException {
        ArithmeticExpressionsParser.startgeneralArithExpr_return retval = new ArithmeticExpressionsParser.startgeneralArithExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.classDec_return classDec1 =null;


        RewriteRuleSubtreeStream stream_classDec=new RewriteRuleSubtreeStream(adaptor,"rule classDec");
        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:41:23: ( ( classDec )* -> ^( Start ( classDec )* ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:41:25: ( classDec )*
            {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:41:25: ( classDec )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Class||LA1_0==Modifier) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:41:25: classDec
            	    {
            	    pushFollow(FOLLOW_classDec_in_startgeneralArithExpr112);
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
            // 41:35: -> ^( Start ( classDec )* )
            {
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:41:38: ^( Start ( classDec )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Start, "Start")
                , root_1);

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:41:46: ( classDec )*
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:50:1: classDec : ( Modifier )? Class ( VAR )* '{' ( stmt )* '}' -> ^( ClassDec ( Modifier )? Class VAR '{' ( stmt )* '}' ) ;
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
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_Class=new RewriteRuleTokenStream(adaptor,"token Class");
        RewriteRuleTokenStream stream_Br_open=new RewriteRuleTokenStream(adaptor,"token Br_open");
        RewriteRuleTokenStream stream_Modifier=new RewriteRuleTokenStream(adaptor,"token Modifier");
        RewriteRuleTokenStream stream_Br_close=new RewriteRuleTokenStream(adaptor,"token Br_close");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:50:9: ( ( Modifier )? Class ( VAR )* '{' ( stmt )* '}' -> ^( ClassDec ( Modifier )? Class VAR '{' ( stmt )* '}' ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:50:11: ( Modifier )? Class ( VAR )* '{' ( stmt )* '}'
            {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:50:11: ( Modifier )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Modifier) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:50:11: Modifier
                    {
                    Modifier2=(Token)match(input,Modifier,FOLLOW_Modifier_in_classDec157);  
                    stream_Modifier.add(Modifier2);


                    }
                    break;

            }


            Class3=(Token)match(input,Class,FOLLOW_Class_in_classDec160);  
            stream_Class.add(Class3);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:50:27: ( VAR )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==VAR) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:50:27: VAR
            	    {
            	    VAR4=(Token)match(input,VAR,FOLLOW_VAR_in_classDec162);  
            	    stream_VAR.add(VAR4);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            char_literal5=(Token)match(input,Br_open,FOLLOW_Br_open_in_classDec165);  
            stream_Br_open.add(char_literal5);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:50:36: ( stmt )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==BOOLEAN||LA4_0==DOUBLE||LA4_0==INT||(LA4_0 >= Modifier && LA4_0 <= NUM)||LA4_0==SEMICOLON||LA4_0==STRING||LA4_0==System||LA4_0==VAR||(LA4_0 >= 79 && LA4_0 <= 80)||LA4_0==83) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:50:36: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_classDec167);
            	    stmt6=stmt();

            	    state._fsp--;

            	    stream_stmt.add(stmt6.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            char_literal7=(Token)match(input,Br_close,FOLLOW_Br_close_in_classDec170);  
            stream_Br_close.add(char_literal7);


            // AST REWRITE
            // elements: Br_close, VAR, Class, Br_open, Modifier, stmt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 50:46: -> ^( ClassDec ( Modifier )? Class VAR '{' ( stmt )* '}' )
            {
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:50:48: ^( ClassDec ( Modifier )? Class VAR '{' ( stmt )* '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ClassDec, "ClassDec")
                , root_1);

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:50:59: ( Modifier )?
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
                stream_Br_open.nextNode()
                );

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:50:83: ( stmt )*
                while ( stream_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmt.nextTree());

                }
                stream_stmt.reset();

                adaptor.addChild(root_1, 
                stream_Br_close.nextNode()
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:57:1: stmt : ( decl -> ^( Decl decl ) | big_init -> ^( Big_init big_init ) | main_method -> ^( Main_METHOD main_method ) | whilestmt -> ^( Whilestmt whilestmt ) | forloop -> ^( Forloop forloop ) | assigment -> ^( Assigment assigment ) | big_if -> ^( Ifstmt big_if ) | method -> ^( Method method ) | string_dec -> ^( String_Dec string_dec ) | initialize -> ^( Initialize initialize ) | initialize_1 -> ^( Initialize_1 initialize_1 ) | sys_print -> ^( Sys_print sys_print ) ) ;
    public final ArithmeticExpressionsParser.stmt_return stmt() throws RecognitionException {
        ArithmeticExpressionsParser.stmt_return retval = new ArithmeticExpressionsParser.stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.decl_return decl8 =null;

        ArithmeticExpressionsParser.big_init_return big_init9 =null;

        ArithmeticExpressionsParser.main_method_return main_method10 =null;

        ArithmeticExpressionsParser.whilestmt_return whilestmt11 =null;

        ArithmeticExpressionsParser.forloop_return forloop12 =null;

        ArithmeticExpressionsParser.assigment_return assigment13 =null;

        ArithmeticExpressionsParser.big_if_return big_if14 =null;

        ArithmeticExpressionsParser.method_return method15 =null;

        ArithmeticExpressionsParser.string_dec_return string_dec16 =null;

        ArithmeticExpressionsParser.initialize_return initialize17 =null;

        ArithmeticExpressionsParser.initialize_1_return initialize_118 =null;

        ArithmeticExpressionsParser.sys_print_return sys_print19 =null;


        RewriteRuleSubtreeStream stream_assigment=new RewriteRuleSubtreeStream(adaptor,"rule assigment");
        RewriteRuleSubtreeStream stream_whilestmt=new RewriteRuleSubtreeStream(adaptor,"rule whilestmt");
        RewriteRuleSubtreeStream stream_forloop=new RewriteRuleSubtreeStream(adaptor,"rule forloop");
        RewriteRuleSubtreeStream stream_decl=new RewriteRuleSubtreeStream(adaptor,"rule decl");
        RewriteRuleSubtreeStream stream_method=new RewriteRuleSubtreeStream(adaptor,"rule method");
        RewriteRuleSubtreeStream stream_string_dec=new RewriteRuleSubtreeStream(adaptor,"rule string_dec");
        RewriteRuleSubtreeStream stream_initialize_1=new RewriteRuleSubtreeStream(adaptor,"rule initialize_1");
        RewriteRuleSubtreeStream stream_main_method=new RewriteRuleSubtreeStream(adaptor,"rule main_method");
        RewriteRuleSubtreeStream stream_initialize=new RewriteRuleSubtreeStream(adaptor,"rule initialize");
        RewriteRuleSubtreeStream stream_big_if=new RewriteRuleSubtreeStream(adaptor,"rule big_if");
        RewriteRuleSubtreeStream stream_big_init=new RewriteRuleSubtreeStream(adaptor,"rule big_init");
        RewriteRuleSubtreeStream stream_sys_print=new RewriteRuleSubtreeStream(adaptor,"rule sys_print");
        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:57:9: ( ( decl -> ^( Decl decl ) | big_init -> ^( Big_init big_init ) | main_method -> ^( Main_METHOD main_method ) | whilestmt -> ^( Whilestmt whilestmt ) | forloop -> ^( Forloop forloop ) | assigment -> ^( Assigment assigment ) | big_if -> ^( Ifstmt big_if ) | method -> ^( Method method ) | string_dec -> ^( String_Dec string_dec ) | initialize -> ^( Initialize initialize ) | initialize_1 -> ^( Initialize_1 initialize_1 ) | sys_print -> ^( Sys_print sys_print ) ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:57:13: ( decl -> ^( Decl decl ) | big_init -> ^( Big_init big_init ) | main_method -> ^( Main_METHOD main_method ) | whilestmt -> ^( Whilestmt whilestmt ) | forloop -> ^( Forloop forloop ) | assigment -> ^( Assigment assigment ) | big_if -> ^( Ifstmt big_if ) | method -> ^( Method method ) | string_dec -> ^( String_Dec string_dec ) | initialize -> ^( Initialize initialize ) | initialize_1 -> ^( Initialize_1 initialize_1 ) | sys_print -> ^( Sys_print sys_print ) )
            {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:57:13: ( decl -> ^( Decl decl ) | big_init -> ^( Big_init big_init ) | main_method -> ^( Main_METHOD main_method ) | whilestmt -> ^( Whilestmt whilestmt ) | forloop -> ^( Forloop forloop ) | assigment -> ^( Assigment assigment ) | big_if -> ^( Ifstmt big_if ) | method -> ^( Method method ) | string_dec -> ^( String_Dec string_dec ) | initialize -> ^( Initialize initialize ) | initialize_1 -> ^( Initialize_1 initialize_1 ) | sys_print -> ^( Sys_print sys_print ) )
            int alt5=12;
            switch ( input.LA(1) ) {
            case Modifier:
                {
                switch ( input.LA(2) ) {
                case Static:
                    {
                    alt5=3;
                    }
                    break;
                case INT:
                    {
                    int LA5_14 = input.LA(3);

                    if ( (LA5_14==VAR) ) {
                        int LA5_26 = input.LA(4);

                        if ( (LA5_26==SEMICOLON||LA5_26==67||LA5_26==72) ) {
                            alt5=1;
                        }
                        else if ( (LA5_26==VAR||LA5_26==62) ) {
                            alt5=8;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 26, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA5_14==62) ) {
                        alt5=8;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 14, input);

                        throw nvae;

                    }
                    }
                    break;
                case DOUBLE:
                    {
                    int LA5_15 = input.LA(3);

                    if ( (LA5_15==VAR) ) {
                        int LA5_27 = input.LA(4);

                        if ( (LA5_27==SEMICOLON||LA5_27==67||LA5_27==72) ) {
                            alt5=1;
                        }
                        else if ( (LA5_27==VAR||LA5_27==62) ) {
                            alt5=8;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 27, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA5_15==62) ) {
                        alt5=8;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 15, input);

                        throw nvae;

                    }
                    }
                    break;
                case STRING:
                    {
                    int LA5_16 = input.LA(3);

                    if ( (LA5_16==VAR) ) {
                        int LA5_28 = input.LA(4);

                        if ( (LA5_28==SEMICOLON||LA5_28==72) ) {
                            alt5=9;
                        }
                        else if ( (LA5_28==VAR||LA5_28==62) ) {
                            alt5=8;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 28, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA5_16==62) ) {
                        alt5=8;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 16, input);

                        throw nvae;

                    }
                    }
                    break;
                case BOOLEAN:
                case VAR:
                case 62:
                    {
                    alt5=8;
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
                switch ( input.LA(2) ) {
                case VAR:
                    {
                    int LA5_18 = input.LA(3);

                    if ( (LA5_18==SEMICOLON||LA5_18==67||LA5_18==72) ) {
                        alt5=1;
                    }
                    else if ( (LA5_18==BOOLEAN||LA5_18==Br_close||LA5_18==DOUBLE||LA5_18==INT||(LA5_18 >= Modifier && LA5_18 <= NUM)||LA5_18==STRING||LA5_18==System||LA5_18==VAR||(LA5_18 >= 79 && LA5_18 <= 81)||LA5_18==83) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 18, input);

                        throw nvae;

                    }
                    }
                    break;
                case NUM:
                    {
                    alt5=2;
                    }
                    break;
                case 74:
                    {
                    int LA5_19 = input.LA(3);

                    if ( (LA5_19==75) ) {
                        int LA5_30 = input.LA(4);

                        if ( (LA5_30==VAR) ) {
                            int LA5_38 = input.LA(5);

                            if ( (LA5_38==BOOLEAN||LA5_38==Br_close||LA5_38==DOUBLE||LA5_38==INT||(LA5_38 >= Modifier && LA5_38 <= NUM)||LA5_38==SEMICOLON||LA5_38==STRING||LA5_38==System||LA5_38==VAR||(LA5_38 >= 79 && LA5_38 <= 81)||LA5_38==83) ) {
                                alt5=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 38, input);

                                throw nvae;

                            }
                        }
                        else if ( (LA5_30==NUM) ) {
                            alt5=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 30, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 19, input);

                        throw nvae;

                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;

                }

                }
                break;
            case DOUBLE:
                {
                switch ( input.LA(2) ) {
                case VAR:
                    {
                    int LA5_20 = input.LA(3);

                    if ( (LA5_20==SEMICOLON||LA5_20==67||LA5_20==72) ) {
                        alt5=1;
                    }
                    else if ( (LA5_20==BOOLEAN||LA5_20==Br_close||LA5_20==DOUBLE||LA5_20==INT||(LA5_20 >= Modifier && LA5_20 <= NUM)||LA5_20==STRING||LA5_20==System||LA5_20==VAR||(LA5_20 >= 79 && LA5_20 <= 81)||LA5_20==83) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 20, input);

                        throw nvae;

                    }
                    }
                    break;
                case NUM:
                    {
                    alt5=2;
                    }
                    break;
                case 74:
                    {
                    int LA5_19 = input.LA(3);

                    if ( (LA5_19==75) ) {
                        int LA5_30 = input.LA(4);

                        if ( (LA5_30==VAR) ) {
                            int LA5_38 = input.LA(5);

                            if ( (LA5_38==BOOLEAN||LA5_38==Br_close||LA5_38==DOUBLE||LA5_38==INT||(LA5_38 >= Modifier && LA5_38 <= NUM)||LA5_38==SEMICOLON||LA5_38==STRING||LA5_38==System||LA5_38==VAR||(LA5_38 >= 79 && LA5_38 <= 81)||LA5_38==83) ) {
                                alt5=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 38, input);

                                throw nvae;

                            }
                        }
                        else if ( (LA5_30==NUM) ) {
                            alt5=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 30, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 19, input);

                        throw nvae;

                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;

                }

                }
                break;
            case VAR:
                {
                switch ( input.LA(2) ) {
                case 72:
                    {
                    switch ( input.LA(3) ) {
                    case VAR:
                        {
                        switch ( input.LA(4) ) {
                        case Dot:
                            {
                            alt5=11;
                            }
                            break;
                        case VAR:
                            {
                            alt5=2;
                            }
                            break;
                        case BOOLEAN:
                        case Br_close:
                        case DOUBLE:
                        case INT:
                        case Minus:
                        case Modifier:
                        case NUM:
                        case Plus:
                        case SEMICOLON:
                        case STRING:
                        case System:
                        case 79:
                        case 80:
                        case 81:
                        case 83:
                            {
                            alt5=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 32, input);

                            throw nvae;

                        }

                        }
                        break;
                    case NUM:
                    case 82:
                        {
                        alt5=2;
                        }
                        break;
                    case New:
                        {
                        alt5=11;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 21, input);

                        throw nvae;

                    }

                    }
                    break;
                case 74:
                    {
                    alt5=2;
                    }
                    break;
                case DNUM:
                case Dot:
                case Fun:
                case Minus:
                case NUM:
                case New:
                case 62:
                case 64:
                case 65:
                case 66:
                case 68:
                case 69:
                    {
                    alt5=6;
                    }
                    break;
                case VAR:
                    {
                    switch ( input.LA(3) ) {
                    case Minus:
                    case Plus:
                    case 62:
                    case 64:
                    case 70:
                        {
                        alt5=6;
                        }
                        break;
                    case SEMICOLON:
                        {
                        alt5=6;
                        }
                        break;
                    case VAR:
                        {
                        alt5=10;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 23, input);

                        throw nvae;

                    }

                    }
                    break;
                case SEMICOLON:
                    {
                    alt5=10;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    throw nvae;

                }

                }
                break;
            case STRING:
                {
                switch ( input.LA(2) ) {
                case VAR:
                    {
                    int LA5_24 = input.LA(3);

                    if ( (LA5_24==BOOLEAN||LA5_24==Br_close||LA5_24==DOUBLE||LA5_24==INT||(LA5_24 >= Modifier && LA5_24 <= NUM)||LA5_24==SEMICOLON||LA5_24==STRING||LA5_24==System||LA5_24==VAR||(LA5_24 >= 79 && LA5_24 <= 81)||LA5_24==83) ) {
                        alt5=2;
                    }
                    else if ( (LA5_24==72) ) {
                        alt5=9;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 24, input);

                        throw nvae;

                    }
                    }
                    break;
                case NUM:
                    {
                    alt5=2;
                    }
                    break;
                case 74:
                    {
                    int LA5_19 = input.LA(3);

                    if ( (LA5_19==75) ) {
                        int LA5_30 = input.LA(4);

                        if ( (LA5_30==VAR) ) {
                            int LA5_38 = input.LA(5);

                            if ( (LA5_38==BOOLEAN||LA5_38==Br_close||LA5_38==DOUBLE||LA5_38==INT||(LA5_38 >= Modifier && LA5_38 <= NUM)||LA5_38==SEMICOLON||LA5_38==STRING||LA5_38==System||LA5_38==VAR||(LA5_38 >= 79 && LA5_38 <= 81)||LA5_38==83) ) {
                                alt5=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 38, input);

                                throw nvae;

                            }
                        }
                        else if ( (LA5_30==NUM) ) {
                            alt5=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 30, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 19, input);

                        throw nvae;

                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 5, input);

                    throw nvae;

                }

                }
                break;
            case 83:
                {
                alt5=4;
                }
                break;
            case 79:
                {
                alt5=5;
                }
                break;
            case NUM:
                {
                alt5=2;
                }
                break;
            case 80:
                {
                alt5=7;
                }
                break;
            case BOOLEAN:
                {
                switch ( input.LA(2) ) {
                case VAR:
                    {
                    int LA5_25 = input.LA(3);

                    if ( (LA5_25==BOOLEAN||LA5_25==Br_close||LA5_25==DOUBLE||LA5_25==INT||(LA5_25 >= Modifier && LA5_25 <= NUM)||LA5_25==SEMICOLON||LA5_25==STRING||LA5_25==System||LA5_25==VAR||(LA5_25 >= 79 && LA5_25 <= 81)||LA5_25==83) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 25, input);

                        throw nvae;

                    }
                    }
                    break;
                case 74:
                    {
                    int LA5_19 = input.LA(3);

                    if ( (LA5_19==75) ) {
                        int LA5_30 = input.LA(4);

                        if ( (LA5_30==VAR) ) {
                            int LA5_38 = input.LA(5);

                            if ( (LA5_38==BOOLEAN||LA5_38==Br_close||LA5_38==DOUBLE||LA5_38==INT||(LA5_38 >= Modifier && LA5_38 <= NUM)||LA5_38==SEMICOLON||LA5_38==STRING||LA5_38==System||LA5_38==VAR||(LA5_38 >= 79 && LA5_38 <= 81)||LA5_38==83) ) {
                                alt5=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 38, input);

                                throw nvae;

                            }
                        }
                        else if ( (LA5_30==NUM) ) {
                            alt5=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 30, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 19, input);

                        throw nvae;

                    }
                    }
                    break;
                case NUM:
                    {
                    alt5=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 10, input);

                    throw nvae;

                }

                }
                break;
            case SEMICOLON:
                {
                alt5=10;
                }
                break;
            case System:
                {
                alt5=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:58:2: decl
                    {
                    pushFollow(FOLLOW_decl_in_stmt229);
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
                    // 58:7: -> ^( Decl decl )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:58:10: ^( Decl decl )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:60:3: big_init
                    {
                    pushFollow(FOLLOW_big_init_in_stmt243);
                    big_init9=big_init();

                    state._fsp--;

                    stream_big_init.add(big_init9.getTree());

                    // AST REWRITE
                    // elements: big_init
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 60:12: -> ^( Big_init big_init )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:60:15: ^( Big_init big_init )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Big_init, "Big_init")
                        , root_1);

                        adaptor.addChild(root_1, stream_big_init.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:61:3: main_method
                    {
                    pushFollow(FOLLOW_main_method_in_stmt255);
                    main_method10=main_method();

                    state._fsp--;

                    stream_main_method.add(main_method10.getTree());

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
                    // 61:14: -> ^( Main_METHOD main_method )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:61:16: ^( Main_METHOD main_method )
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
                case 4 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:62:3: whilestmt
                    {
                    pushFollow(FOLLOW_whilestmt_in_stmt265);
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
                    // 62:13: -> ^( Whilestmt whilestmt )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:62:16: ^( Whilestmt whilestmt )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:63:3: forloop
                    {
                    pushFollow(FOLLOW_forloop_in_stmt277);
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
                    // 63:11: -> ^( Forloop forloop )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:63:14: ^( Forloop forloop )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:64:3: assigment
                    {
                    pushFollow(FOLLOW_assigment_in_stmt289);
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
                    // 64:13: -> ^( Assigment assigment )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:64:16: ^( Assigment assigment )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:65:3: big_if
                    {
                    pushFollow(FOLLOW_big_if_in_stmt301);
                    big_if14=big_if();

                    state._fsp--;

                    stream_big_if.add(big_if14.getTree());

                    // AST REWRITE
                    // elements: big_if
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 65:10: -> ^( Ifstmt big_if )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:65:13: ^( Ifstmt big_if )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Ifstmt, "Ifstmt")
                        , root_1);

                        adaptor.addChild(root_1, stream_big_if.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:66:3: method
                    {
                    pushFollow(FOLLOW_method_in_stmt313);
                    method15=method();

                    state._fsp--;

                    stream_method.add(method15.getTree());

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
                    // 66:10: -> ^( Method method )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:66:13: ^( Method method )
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
                case 9 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:67:3: string_dec
                    {
                    pushFollow(FOLLOW_string_dec_in_stmt325);
                    string_dec16=string_dec();

                    state._fsp--;

                    stream_string_dec.add(string_dec16.getTree());

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
                    // 67:14: -> ^( String_Dec string_dec )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:67:17: ^( String_Dec string_dec )
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
                case 10 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:68:3: initialize
                    {
                    pushFollow(FOLLOW_initialize_in_stmt337);
                    initialize17=initialize();

                    state._fsp--;

                    stream_initialize.add(initialize17.getTree());

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
                    // 68:14: -> ^( Initialize initialize )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:68:17: ^( Initialize initialize )
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
                case 11 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:69:3: initialize_1
                    {
                    pushFollow(FOLLOW_initialize_1_in_stmt349);
                    initialize_118=initialize_1();

                    state._fsp--;

                    stream_initialize_1.add(initialize_118.getTree());

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
                    // 69:16: -> ^( Initialize_1 initialize_1 )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:69:19: ^( Initialize_1 initialize_1 )
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
                case 12 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:70:3: sys_print
                    {
                    pushFollow(FOLLOW_sys_print_in_stmt362);
                    sys_print19=sys_print();

                    state._fsp--;

                    stream_sys_print.add(sys_print19.getTree());

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
                    // 70:13: -> ^( Sys_print sys_print )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:70:16: ^( Sys_print sys_print )
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:80:1: method : Modifier ( types )? ( VAR )* params '{' ( stmt )* 'return' return_type SEMICOLON '}' -> ^( Method Modifier ( types )? ( VAR )* params '{' ( stmt )* 'return' return_type SEMICOLON '}' ) ;
    public final ArithmeticExpressionsParser.method_return method() throws RecognitionException {
        ArithmeticExpressionsParser.method_return retval = new ArithmeticExpressionsParser.method_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier20=null;
        Token VAR22=null;
        Token char_literal24=null;
        Token string_literal26=null;
        Token SEMICOLON28=null;
        Token char_literal29=null;
        ArithmeticExpressionsParser.types_return types21 =null;

        ArithmeticExpressionsParser.params_return params23 =null;

        ArithmeticExpressionsParser.stmt_return stmt25 =null;

        ArithmeticExpressionsParser.return_type_return return_type27 =null;


        Object Modifier20_tree=null;
        Object VAR22_tree=null;
        Object char_literal24_tree=null;
        Object string_literal26_tree=null;
        Object SEMICOLON28_tree=null;
        Object char_literal29_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_Br_open=new RewriteRuleTokenStream(adaptor,"token Br_open");
        RewriteRuleTokenStream stream_Modifier=new RewriteRuleTokenStream(adaptor,"token Modifier");
        RewriteRuleTokenStream stream_Br_close=new RewriteRuleTokenStream(adaptor,"token Br_close");
        RewriteRuleSubtreeStream stream_return_type=new RewriteRuleSubtreeStream(adaptor,"rule return_type");
        RewriteRuleSubtreeStream stream_types=new RewriteRuleSubtreeStream(adaptor,"rule types");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:80:8: ( Modifier ( types )? ( VAR )* params '{' ( stmt )* 'return' return_type SEMICOLON '}' -> ^( Method Modifier ( types )? ( VAR )* params '{' ( stmt )* 'return' return_type SEMICOLON '}' ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:81:2: Modifier ( types )? ( VAR )* params '{' ( stmt )* 'return' return_type SEMICOLON '}'
            {
            Modifier20=(Token)match(input,Modifier,FOLLOW_Modifier_in_method412);  
            stream_Modifier.add(Modifier20);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:81:11: ( types )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==BOOLEAN||LA6_0==DOUBLE||LA6_0==INT||LA6_0==STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:81:11: types
                    {
                    pushFollow(FOLLOW_types_in_method414);
                    types21=types();

                    state._fsp--;

                    stream_types.add(types21.getTree());

                    }
                    break;

            }


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:81:18: ( VAR )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==VAR) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:81:18: VAR
            	    {
            	    VAR22=(Token)match(input,VAR,FOLLOW_VAR_in_method417);  
            	    stream_VAR.add(VAR22);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            pushFollow(FOLLOW_params_in_method420);
            params23=params();

            state._fsp--;

            stream_params.add(params23.getTree());

            char_literal24=(Token)match(input,Br_open,FOLLOW_Br_open_in_method422);  
            stream_Br_open.add(char_literal24);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:81:34: ( stmt )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==BOOLEAN||LA8_0==DOUBLE||LA8_0==INT||(LA8_0 >= Modifier && LA8_0 <= NUM)||LA8_0==SEMICOLON||LA8_0==STRING||LA8_0==System||LA8_0==VAR||(LA8_0 >= 79 && LA8_0 <= 80)||LA8_0==83) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:81:34: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_method424);
            	    stmt25=stmt();

            	    state._fsp--;

            	    stream_stmt.add(stmt25.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            string_literal26=(Token)match(input,81,FOLLOW_81_in_method427);  
            stream_81.add(string_literal26);


            pushFollow(FOLLOW_return_type_in_method429);
            return_type27=return_type();

            state._fsp--;

            stream_return_type.add(return_type27.getTree());

            SEMICOLON28=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_method431);  
            stream_SEMICOLON.add(SEMICOLON28);


            char_literal29=(Token)match(input,Br_close,FOLLOW_Br_close_in_method432);  
            stream_Br_close.add(char_literal29);


            // AST REWRITE
            // elements: Br_close, Modifier, params, SEMICOLON, Br_open, types, stmt, return_type, 81, VAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 82:3: -> ^( Method Modifier ( types )? ( VAR )* params '{' ( stmt )* 'return' return_type SEMICOLON '}' )
            {
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:82:6: ^( Method Modifier ( types )? ( VAR )* params '{' ( stmt )* 'return' return_type SEMICOLON '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Method, "Method")
                , root_1);

                adaptor.addChild(root_1, 
                stream_Modifier.nextNode()
                );

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:82:24: ( types )?
                if ( stream_types.hasNext() ) {
                    adaptor.addChild(root_1, stream_types.nextTree());

                }
                stream_types.reset();

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:82:31: ( VAR )*
                while ( stream_VAR.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_VAR.nextNode()
                    );

                }
                stream_VAR.reset();

                adaptor.addChild(root_1, stream_params.nextTree());

                adaptor.addChild(root_1, 
                stream_Br_open.nextNode()
                );

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:82:47: ( stmt )*
                while ( stream_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmt.nextTree());

                }
                stream_stmt.reset();

                adaptor.addChild(root_1, 
                stream_81.nextNode()
                );

                adaptor.addChild(root_1, stream_return_type.nextTree());

                adaptor.addChild(root_1, 
                stream_SEMICOLON.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_Br_close.nextNode()
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:90:1: main_method : Modifier Static VOID Main '(' STRING '[' ']' 'a' ')' '{' ( print )* '}' -> ^( Main_METHOD Modifier Static VOID Main '(' STRING '[' ']' 'a' ')' '{' ( print )* '}' ) ;
    public final ArithmeticExpressionsParser.main_method_return main_method() throws RecognitionException {
        ArithmeticExpressionsParser.main_method_return retval = new ArithmeticExpressionsParser.main_method_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier30=null;
        Token Static31=null;
        Token VOID32=null;
        Token Main33=null;
        Token char_literal34=null;
        Token STRING35=null;
        Token char_literal36=null;
        Token char_literal37=null;
        Token char_literal38=null;
        Token char_literal39=null;
        Token char_literal40=null;
        Token char_literal42=null;
        ArithmeticExpressionsParser.print_return print41 =null;


        Object Modifier30_tree=null;
        Object Static31_tree=null;
        Object VOID32_tree=null;
        Object Main33_tree=null;
        Object char_literal34_tree=null;
        Object STRING35_tree=null;
        Object char_literal36_tree=null;
        Object char_literal37_tree=null;
        Object char_literal38_tree=null;
        Object char_literal39_tree=null;
        Object char_literal40_tree=null;
        Object char_literal42_tree=null;
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_Br_open=new RewriteRuleTokenStream(adaptor,"token Br_open");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_Static=new RewriteRuleTokenStream(adaptor,"token Static");
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_Modifier=new RewriteRuleTokenStream(adaptor,"token Modifier");
        RewriteRuleTokenStream stream_Main=new RewriteRuleTokenStream(adaptor,"token Main");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_Br_close=new RewriteRuleTokenStream(adaptor,"token Br_close");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_print=new RewriteRuleSubtreeStream(adaptor,"rule print");
        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:91:2: ( Modifier Static VOID Main '(' STRING '[' ']' 'a' ')' '{' ( print )* '}' -> ^( Main_METHOD Modifier Static VOID Main '(' STRING '[' ']' 'a' ')' '{' ( print )* '}' ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:91:3: Modifier Static VOID Main '(' STRING '[' ']' 'a' ')' '{' ( print )* '}'
            {
            Modifier30=(Token)match(input,Modifier,FOLLOW_Modifier_in_main_method480);  
            stream_Modifier.add(Modifier30);


            Static31=(Token)match(input,Static,FOLLOW_Static_in_main_method482);  
            stream_Static.add(Static31);


            VOID32=(Token)match(input,VOID,FOLLOW_VOID_in_main_method484);  
            stream_VOID.add(VOID32);


            Main33=(Token)match(input,Main,FOLLOW_Main_in_main_method486);  
            stream_Main.add(Main33);


            char_literal34=(Token)match(input,62,FOLLOW_62_in_main_method488);  
            stream_62.add(char_literal34);


            STRING35=(Token)match(input,STRING,FOLLOW_STRING_in_main_method489);  
            stream_STRING.add(STRING35);


            char_literal36=(Token)match(input,74,FOLLOW_74_in_main_method491);  
            stream_74.add(char_literal36);


            char_literal37=(Token)match(input,75,FOLLOW_75_in_main_method492);  
            stream_75.add(char_literal37);


            char_literal38=(Token)match(input,76,FOLLOW_76_in_main_method494);  
            stream_76.add(char_literal38);


            char_literal39=(Token)match(input,63,FOLLOW_63_in_main_method496);  
            stream_63.add(char_literal39);


            char_literal40=(Token)match(input,Br_open,FOLLOW_Br_open_in_main_method498);  
            stream_Br_open.add(char_literal40);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:91:57: ( print )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==System) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:91:57: print
            	    {
            	    pushFollow(FOLLOW_print_in_main_method499);
            	    print41=print();

            	    state._fsp--;

            	    stream_print.add(print41.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            char_literal42=(Token)match(input,Br_close,FOLLOW_Br_close_in_main_method501);  
            stream_Br_close.add(char_literal42);


            // AST REWRITE
            // elements: STRING, VOID, Main, 75, Br_close, 62, Static, print, 74, 76, 63, Br_open, Modifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 91:66: -> ^( Main_METHOD Modifier Static VOID Main '(' STRING '[' ']' 'a' ')' '{' ( print )* '}' )
            {
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:91:69: ^( Main_METHOD Modifier Static VOID Main '(' STRING '[' ']' 'a' ')' '{' ( print )* '}' )
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
                stream_62.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_STRING.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_74.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_75.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_76.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_63.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_Br_open.nextNode()
                );

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:91:138: ( print )*
                while ( stream_print.hasNext() ) {
                    adaptor.addChild(root_1, stream_print.nextTree());

                }
                stream_print.reset();

                adaptor.addChild(root_1, 
                stream_Br_close.nextNode()
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:92:1: print : System Dot Out Dot Println '(' New VAR '(' ')' Dot VAR '(' ( NUM )? ')' ')' SEMICOLON -> ^( Print System Dot Out Dot Println '(' New VAR '(' ')' Dot VAR '(' ( NUM )? ')' ')' SEMICOLON ) ;
    public final ArithmeticExpressionsParser.print_return print() throws RecognitionException {
        ArithmeticExpressionsParser.print_return retval = new ArithmeticExpressionsParser.print_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token System43=null;
        Token Dot44=null;
        Token Out45=null;
        Token Dot46=null;
        Token Println47=null;
        Token char_literal48=null;
        Token New49=null;
        Token VAR50=null;
        Token char_literal51=null;
        Token char_literal52=null;
        Token Dot53=null;
        Token VAR54=null;
        Token char_literal55=null;
        Token NUM56=null;
        Token char_literal57=null;
        Token char_literal58=null;
        Token SEMICOLON59=null;

        Object System43_tree=null;
        Object Dot44_tree=null;
        Object Out45_tree=null;
        Object Dot46_tree=null;
        Object Println47_tree=null;
        Object char_literal48_tree=null;
        Object New49_tree=null;
        Object VAR50_tree=null;
        Object char_literal51_tree=null;
        Object char_literal52_tree=null;
        Object Dot53_tree=null;
        Object VAR54_tree=null;
        Object char_literal55_tree=null;
        Object NUM56_tree=null;
        Object char_literal57_tree=null;
        Object char_literal58_tree=null;
        Object SEMICOLON59_tree=null;
        RewriteRuleTokenStream stream_New=new RewriteRuleTokenStream(adaptor,"token New");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleTokenStream stream_Dot=new RewriteRuleTokenStream(adaptor,"token Dot");
        RewriteRuleTokenStream stream_Println=new RewriteRuleTokenStream(adaptor,"token Println");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_System=new RewriteRuleTokenStream(adaptor,"token System");
        RewriteRuleTokenStream stream_Out=new RewriteRuleTokenStream(adaptor,"token Out");

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:92:7: ( System Dot Out Dot Println '(' New VAR '(' ')' Dot VAR '(' ( NUM )? ')' ')' SEMICOLON -> ^( Print System Dot Out Dot Println '(' New VAR '(' ')' Dot VAR '(' ( NUM )? ')' ')' SEMICOLON ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:92:8: System Dot Out Dot Println '(' New VAR '(' ')' Dot VAR '(' ( NUM )? ')' ')' SEMICOLON
            {
            System43=(Token)match(input,System,FOLLOW_System_in_print536);  
            stream_System.add(System43);


            Dot44=(Token)match(input,Dot,FOLLOW_Dot_in_print538);  
            stream_Dot.add(Dot44);


            Out45=(Token)match(input,Out,FOLLOW_Out_in_print540);  
            stream_Out.add(Out45);


            Dot46=(Token)match(input,Dot,FOLLOW_Dot_in_print542);  
            stream_Dot.add(Dot46);


            Println47=(Token)match(input,Println,FOLLOW_Println_in_print544);  
            stream_Println.add(Println47);


            char_literal48=(Token)match(input,62,FOLLOW_62_in_print546);  
            stream_62.add(char_literal48);


            New49=(Token)match(input,New,FOLLOW_New_in_print547);  
            stream_New.add(New49);


            VAR50=(Token)match(input,VAR,FOLLOW_VAR_in_print549);  
            stream_VAR.add(VAR50);


            char_literal51=(Token)match(input,62,FOLLOW_62_in_print551);  
            stream_62.add(char_literal51);


            char_literal52=(Token)match(input,63,FOLLOW_63_in_print552);  
            stream_63.add(char_literal52);


            Dot53=(Token)match(input,Dot,FOLLOW_Dot_in_print553);  
            stream_Dot.add(Dot53);


            VAR54=(Token)match(input,VAR,FOLLOW_VAR_in_print555);  
            stream_VAR.add(VAR54);


            char_literal55=(Token)match(input,62,FOLLOW_62_in_print557);  
            stream_62.add(char_literal55);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:92:63: ( NUM )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==NUM) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:92:63: NUM
                    {
                    NUM56=(Token)match(input,NUM,FOLLOW_NUM_in_print558);  
                    stream_NUM.add(NUM56);


                    }
                    break;

            }


            char_literal57=(Token)match(input,63,FOLLOW_63_in_print560);  
            stream_63.add(char_literal57);


            char_literal58=(Token)match(input,63,FOLLOW_63_in_print562);  
            stream_63.add(char_literal58);


            SEMICOLON59=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_print564);  
            stream_SEMICOLON.add(SEMICOLON59);


            // AST REWRITE
            // elements: 63, New, Dot, Println, 63, VAR, Out, Dot, 62, System, 62, SEMICOLON, 62, Dot, VAR, NUM, 63
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 92:84: -> ^( Print System Dot Out Dot Println '(' New VAR '(' ')' Dot VAR '(' ( NUM )? ')' ')' SEMICOLON )
            {
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:92:86: ^( Print System Dot Out Dot Println '(' New VAR '(' ')' Dot VAR '(' ( NUM )? ')' ')' SEMICOLON )
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
                stream_62.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_New.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_VAR.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_62.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_63.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_Dot.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_VAR.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_62.nextNode()
                );

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:92:149: ( NUM )?
                if ( stream_NUM.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_NUM.nextNode()
                    );

                }
                stream_NUM.reset();

                adaptor.addChild(root_1, 
                stream_63.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_63.nextNode()
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:94:1: return_type : ( VAR | NUM );
    public final ArithmeticExpressionsParser.return_type_return return_type() throws RecognitionException {
        ArithmeticExpressionsParser.return_type_return retval = new ArithmeticExpressionsParser.return_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set60=null;

        Object set60_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:95:2: ( VAR | NUM )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:
            {
            root_0 = (Object)adaptor.nil();


            set60=(Token)input.LT(1);

            if ( input.LA(1)==NUM||input.LA(1)==VAR ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set60)
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:98:1: initialize : ( types ( '[' ']' )? VAR SEMICOLON | ( VAR )* SEMICOLON ) ;
    public final ArithmeticExpressionsParser.initialize_return initialize() throws RecognitionException {
        ArithmeticExpressionsParser.initialize_return retval = new ArithmeticExpressionsParser.initialize_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal62=null;
        Token char_literal63=null;
        Token VAR64=null;
        Token SEMICOLON65=null;
        Token VAR66=null;
        Token SEMICOLON67=null;
        ArithmeticExpressionsParser.types_return types61 =null;


        Object char_literal62_tree=null;
        Object char_literal63_tree=null;
        Object VAR64_tree=null;
        Object SEMICOLON65_tree=null;
        Object VAR66_tree=null;
        Object SEMICOLON67_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:98:11: ( ( types ( '[' ']' )? VAR SEMICOLON | ( VAR )* SEMICOLON ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:98:13: ( types ( '[' ']' )? VAR SEMICOLON | ( VAR )* SEMICOLON )
            {
            root_0 = (Object)adaptor.nil();


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:98:13: ( types ( '[' ']' )? VAR SEMICOLON | ( VAR )* SEMICOLON )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:98:14: types ( '[' ']' )? VAR SEMICOLON
                    {
                    pushFollow(FOLLOW_types_in_initialize620);
                    types61=types();

                    state._fsp--;

                    adaptor.addChild(root_0, types61.getTree());

                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:98:19: ( '[' ']' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==74) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:98:20: '[' ']'
                            {
                            char_literal62=(Token)match(input,74,FOLLOW_74_in_initialize622); 
                            char_literal62_tree = 
                            (Object)adaptor.create(char_literal62)
                            ;
                            adaptor.addChild(root_0, char_literal62_tree);


                            char_literal63=(Token)match(input,75,FOLLOW_75_in_initialize623); 
                            char_literal63_tree = 
                            (Object)adaptor.create(char_literal63)
                            ;
                            adaptor.addChild(root_0, char_literal63_tree);


                            }
                            break;

                    }


                    VAR64=(Token)match(input,VAR,FOLLOW_VAR_in_initialize627); 
                    VAR64_tree = 
                    (Object)adaptor.create(VAR64)
                    ;
                    adaptor.addChild(root_0, VAR64_tree);


                    SEMICOLON65=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_initialize629); 
                    SEMICOLON65_tree = 
                    (Object)adaptor.create(SEMICOLON65)
                    ;
                    adaptor.addChild(root_0, SEMICOLON65_tree);


                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:98:43: ( VAR )* SEMICOLON
                    {
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:98:43: ( VAR )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==VAR) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:98:43: VAR
                    	    {
                    	    VAR66=(Token)match(input,VAR,FOLLOW_VAR_in_initialize631); 
                    	    VAR66_tree = 
                    	    (Object)adaptor.create(VAR66)
                    	    ;
                    	    adaptor.addChild(root_0, VAR66_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    SEMICOLON67=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_initialize634); 
                    SEMICOLON67_tree = 
                    (Object)adaptor.create(SEMICOLON67)
                    ;
                    adaptor.addChild(root_0, SEMICOLON67_tree);


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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:100:1: initialize_1 : VAR '=' ( New | VAR ) ( Dot )? VAR ( '(' )? ( NUM | VAR )? ( ',' )? ( NUM | VAR )? ( ')' )? ;
    public final ArithmeticExpressionsParser.initialize_1_return initialize_1() throws RecognitionException {
        ArithmeticExpressionsParser.initialize_1_return retval = new ArithmeticExpressionsParser.initialize_1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR68=null;
        Token char_literal69=null;
        Token set70=null;
        Token Dot71=null;
        Token VAR72=null;
        Token char_literal73=null;
        Token set74=null;
        Token char_literal75=null;
        Token set76=null;
        Token char_literal77=null;

        Object VAR68_tree=null;
        Object char_literal69_tree=null;
        Object set70_tree=null;
        Object Dot71_tree=null;
        Object VAR72_tree=null;
        Object char_literal73_tree=null;
        Object set74_tree=null;
        Object char_literal75_tree=null;
        Object set76_tree=null;
        Object char_literal77_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:101:2: ( VAR '=' ( New | VAR ) ( Dot )? VAR ( '(' )? ( NUM | VAR )? ( ',' )? ( NUM | VAR )? ( ')' )? )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:101:4: VAR '=' ( New | VAR ) ( Dot )? VAR ( '(' )? ( NUM | VAR )? ( ',' )? ( NUM | VAR )? ( ')' )?
            {
            root_0 = (Object)adaptor.nil();


            VAR68=(Token)match(input,VAR,FOLLOW_VAR_in_initialize_1644); 
            VAR68_tree = 
            (Object)adaptor.create(VAR68)
            ;
            adaptor.addChild(root_0, VAR68_tree);


            char_literal69=(Token)match(input,72,FOLLOW_72_in_initialize_1646); 
            char_literal69_tree = 
            (Object)adaptor.create(char_literal69)
            ;
            adaptor.addChild(root_0, char_literal69_tree);


            set70=(Token)input.LT(1);

            if ( input.LA(1)==New||input.LA(1)==VAR ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set70)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:101:22: ( Dot )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Dot) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:101:22: Dot
                    {
                    Dot71=(Token)match(input,Dot,FOLLOW_Dot_in_initialize_1654); 
                    Dot71_tree = 
                    (Object)adaptor.create(Dot71)
                    ;
                    adaptor.addChild(root_0, Dot71_tree);


                    }
                    break;

            }


            VAR72=(Token)match(input,VAR,FOLLOW_VAR_in_initialize_1657); 
            VAR72_tree = 
            (Object)adaptor.create(VAR72)
            ;
            adaptor.addChild(root_0, VAR72_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:101:31: ( '(' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==62) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:101:31: '('
                    {
                    char_literal73=(Token)match(input,62,FOLLOW_62_in_initialize_1659); 
                    char_literal73_tree = 
                    (Object)adaptor.create(char_literal73)
                    ;
                    adaptor.addChild(root_0, char_literal73_tree);


                    }
                    break;

            }


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:101:36: ( NUM | VAR )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==VAR) ) {
                alt16=1;
            }
            else if ( (LA16_0==NUM) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:
                    {
                    set74=(Token)input.LT(1);

                    if ( input.LA(1)==NUM||input.LA(1)==VAR ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set74)
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


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:101:46: ( ',' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==67) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:101:46: ','
                    {
                    char_literal75=(Token)match(input,67,FOLLOW_67_in_initialize_1668); 
                    char_literal75_tree = 
                    (Object)adaptor.create(char_literal75)
                    ;
                    adaptor.addChild(root_0, char_literal75_tree);


                    }
                    break;

            }


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:101:50: ( NUM | VAR )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==VAR) ) {
                alt18=1;
            }
            else if ( (LA18_0==NUM) ) {
                int LA18_3 = input.LA(2);

                if ( (LA18_3==BOOLEAN||LA18_3==Br_close||LA18_3==DOUBLE||LA18_3==INT||(LA18_3 >= Modifier && LA18_3 <= NUM)||LA18_3==SEMICOLON||LA18_3==STRING||LA18_3==System||LA18_3==VAR||LA18_3==63||(LA18_3 >= 79 && LA18_3 <= 81)||LA18_3==83) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:
                    {
                    set76=(Token)input.LT(1);

                    if ( input.LA(1)==NUM||input.LA(1)==VAR ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set76)
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


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:101:61: ( ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==63) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:101:61: ')'
                    {
                    char_literal77=(Token)match(input,63,FOLLOW_63_in_initialize_1677); 
                    char_literal77_tree = 
                    (Object)adaptor.create(char_literal77)
                    ;
                    adaptor.addChild(root_0, char_literal77_tree);


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
    // $ANTLR end "initialize_1"


    public static class sys_print_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sys_print"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:102:1: sys_print : System Dot Out Dot Println '(' ( NUM | VAR Dot VAR '(' ( NUM )? ')' ) ')' SEMICOLON ;
    public final ArithmeticExpressionsParser.sys_print_return sys_print() throws RecognitionException {
        ArithmeticExpressionsParser.sys_print_return retval = new ArithmeticExpressionsParser.sys_print_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token System78=null;
        Token Dot79=null;
        Token Out80=null;
        Token Dot81=null;
        Token Println82=null;
        Token char_literal83=null;
        Token NUM84=null;
        Token VAR85=null;
        Token Dot86=null;
        Token VAR87=null;
        Token char_literal88=null;
        Token NUM89=null;
        Token char_literal90=null;
        Token char_literal91=null;
        Token SEMICOLON92=null;

        Object System78_tree=null;
        Object Dot79_tree=null;
        Object Out80_tree=null;
        Object Dot81_tree=null;
        Object Println82_tree=null;
        Object char_literal83_tree=null;
        Object NUM84_tree=null;
        Object VAR85_tree=null;
        Object Dot86_tree=null;
        Object VAR87_tree=null;
        Object char_literal88_tree=null;
        Object NUM89_tree=null;
        Object char_literal90_tree=null;
        Object char_literal91_tree=null;
        Object SEMICOLON92_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:103:2: ( System Dot Out Dot Println '(' ( NUM | VAR Dot VAR '(' ( NUM )? ')' ) ')' SEMICOLON )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:103:4: System Dot Out Dot Println '(' ( NUM | VAR Dot VAR '(' ( NUM )? ')' ) ')' SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            System78=(Token)match(input,System,FOLLOW_System_in_sys_print687); 
            System78_tree = 
            (Object)adaptor.create(System78)
            ;
            adaptor.addChild(root_0, System78_tree);


            Dot79=(Token)match(input,Dot,FOLLOW_Dot_in_sys_print689); 
            Dot79_tree = 
            (Object)adaptor.create(Dot79)
            ;
            adaptor.addChild(root_0, Dot79_tree);


            Out80=(Token)match(input,Out,FOLLOW_Out_in_sys_print691); 
            Out80_tree = 
            (Object)adaptor.create(Out80)
            ;
            adaptor.addChild(root_0, Out80_tree);


            Dot81=(Token)match(input,Dot,FOLLOW_Dot_in_sys_print693); 
            Dot81_tree = 
            (Object)adaptor.create(Dot81)
            ;
            adaptor.addChild(root_0, Dot81_tree);


            Println82=(Token)match(input,Println,FOLLOW_Println_in_sys_print695); 
            Println82_tree = 
            (Object)adaptor.create(Println82)
            ;
            adaptor.addChild(root_0, Println82_tree);


            char_literal83=(Token)match(input,62,FOLLOW_62_in_sys_print697); 
            char_literal83_tree = 
            (Object)adaptor.create(char_literal83)
            ;
            adaptor.addChild(root_0, char_literal83_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:103:34: ( NUM | VAR Dot VAR '(' ( NUM )? ')' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==NUM) ) {
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:103:35: NUM
                    {
                    NUM84=(Token)match(input,NUM,FOLLOW_NUM_in_sys_print699); 
                    NUM84_tree = 
                    (Object)adaptor.create(NUM84)
                    ;
                    adaptor.addChild(root_0, NUM84_tree);


                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:103:39: VAR Dot VAR '(' ( NUM )? ')'
                    {
                    VAR85=(Token)match(input,VAR,FOLLOW_VAR_in_sys_print701); 
                    VAR85_tree = 
                    (Object)adaptor.create(VAR85)
                    ;
                    adaptor.addChild(root_0, VAR85_tree);


                    Dot86=(Token)match(input,Dot,FOLLOW_Dot_in_sys_print703); 
                    Dot86_tree = 
                    (Object)adaptor.create(Dot86)
                    ;
                    adaptor.addChild(root_0, Dot86_tree);


                    VAR87=(Token)match(input,VAR,FOLLOW_VAR_in_sys_print705); 
                    VAR87_tree = 
                    (Object)adaptor.create(VAR87)
                    ;
                    adaptor.addChild(root_0, VAR87_tree);


                    char_literal88=(Token)match(input,62,FOLLOW_62_in_sys_print707); 
                    char_literal88_tree = 
                    (Object)adaptor.create(char_literal88)
                    ;
                    adaptor.addChild(root_0, char_literal88_tree);


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:103:54: ( NUM )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==NUM) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:103:54: NUM
                            {
                            NUM89=(Token)match(input,NUM,FOLLOW_NUM_in_sys_print708); 
                            NUM89_tree = 
                            (Object)adaptor.create(NUM89)
                            ;
                            adaptor.addChild(root_0, NUM89_tree);


                            }
                            break;

                    }


                    char_literal90=(Token)match(input,63,FOLLOW_63_in_sys_print710); 
                    char_literal90_tree = 
                    (Object)adaptor.create(char_literal90)
                    ;
                    adaptor.addChild(root_0, char_literal90_tree);


                    }
                    break;

            }


            char_literal91=(Token)match(input,63,FOLLOW_63_in_sys_print714); 
            char_literal91_tree = 
            (Object)adaptor.create(char_literal91)
            ;
            adaptor.addChild(root_0, char_literal91_tree);


            SEMICOLON92=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_sys_print716); 
            SEMICOLON92_tree = 
            (Object)adaptor.create(SEMICOLON92)
            ;
            adaptor.addChild(root_0, SEMICOLON92_tree);


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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:104:1: object : ( ob_cho | ( VAR )? | NUM );
    public final ArithmeticExpressionsParser.object_return object() throws RecognitionException {
        ArithmeticExpressionsParser.object_return retval = new ArithmeticExpressionsParser.object_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR94=null;
        Token NUM95=null;
        ArithmeticExpressionsParser.ob_cho_return ob_cho93 =null;


        Object VAR94_tree=null;
        Object NUM95_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:104:8: ( ob_cho | ( VAR )? | NUM )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 61:
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
                else if ( (LA23_2==63) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;

                }
                }
                break;
            case 63:
                {
                alt23=2;
                }
                break;
            case NUM:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:104:10: ob_cho
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ob_cho_in_object723);
                    ob_cho93=ob_cho();

                    state._fsp--;

                    adaptor.addChild(root_0, ob_cho93.getTree());

                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:104:19: ( VAR )?
                    {
                    root_0 = (Object)adaptor.nil();


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:104:19: ( VAR )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==VAR) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:104:19: VAR
                            {
                            VAR94=(Token)match(input,VAR,FOLLOW_VAR_in_object727); 
                            VAR94_tree = 
                            (Object)adaptor.create(VAR94)
                            ;
                            adaptor.addChild(root_0, VAR94_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:104:26: NUM
                    {
                    root_0 = (Object)adaptor.nil();


                    NUM95=(Token)match(input,NUM,FOLLOW_NUM_in_object732); 
                    NUM95_tree = 
                    (Object)adaptor.create(NUM95)
                    ;
                    adaptor.addChild(root_0, NUM95_tree);


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


    public static class ob_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ob_body"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:106:1: ob_body : ( '!' )? VAR Dot VAR '(' ( NUM | VAR ) ( generalArithExpr ) ')' ;
    public final ArithmeticExpressionsParser.ob_body_return ob_body() throws RecognitionException {
        ArithmeticExpressionsParser.ob_body_return retval = new ArithmeticExpressionsParser.ob_body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal96=null;
        Token VAR97=null;
        Token Dot98=null;
        Token VAR99=null;
        Token char_literal100=null;
        Token set101=null;
        Token char_literal103=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr102 =null;


        Object char_literal96_tree=null;
        Object VAR97_tree=null;
        Object Dot98_tree=null;
        Object VAR99_tree=null;
        Object char_literal100_tree=null;
        Object set101_tree=null;
        Object char_literal103_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:106:9: ( ( '!' )? VAR Dot VAR '(' ( NUM | VAR ) ( generalArithExpr ) ')' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:106:11: ( '!' )? VAR Dot VAR '(' ( NUM | VAR ) ( generalArithExpr ) ')'
            {
            root_0 = (Object)adaptor.nil();


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:106:11: ( '!' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==61) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:106:12: '!'
                    {
                    char_literal96=(Token)match(input,61,FOLLOW_61_in_ob_body741); 
                    char_literal96_tree = 
                    (Object)adaptor.create(char_literal96)
                    ;
                    adaptor.addChild(root_0, char_literal96_tree);


                    }
                    break;

            }


            VAR97=(Token)match(input,VAR,FOLLOW_VAR_in_ob_body745); 
            VAR97_tree = 
            (Object)adaptor.create(VAR97)
            ;
            adaptor.addChild(root_0, VAR97_tree);


            Dot98=(Token)match(input,Dot,FOLLOW_Dot_in_ob_body747); 
            Dot98_tree = 
            (Object)adaptor.create(Dot98)
            ;
            adaptor.addChild(root_0, Dot98_tree);


            VAR99=(Token)match(input,VAR,FOLLOW_VAR_in_ob_body749); 
            VAR99_tree = 
            (Object)adaptor.create(VAR99)
            ;
            adaptor.addChild(root_0, VAR99_tree);


            char_literal100=(Token)match(input,62,FOLLOW_62_in_ob_body751); 
            char_literal100_tree = 
            (Object)adaptor.create(char_literal100)
            ;
            adaptor.addChild(root_0, char_literal100_tree);


            set101=(Token)input.LT(1);

            if ( input.LA(1)==NUM||input.LA(1)==VAR ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set101)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:106:45: ( generalArithExpr )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:106:46: generalArithExpr
            {
            pushFollow(FOLLOW_generalArithExpr_in_ob_body761);
            generalArithExpr102=generalArithExpr();

            state._fsp--;

            adaptor.addChild(root_0, generalArithExpr102.getTree());

            }


            char_literal103=(Token)match(input,63,FOLLOW_63_in_ob_body764); 
            char_literal103_tree = 
            (Object)adaptor.create(char_literal103)
            ;
            adaptor.addChild(root_0, char_literal103_tree);


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
    // $ANTLR end "ob_body"


    public static class ob_cho_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ob_cho"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:107:1: ob_cho : ( ( '!' )? VAR Dot VAR '(' ( NUM | VAR )? ')' | ob_body );
    public final ArithmeticExpressionsParser.ob_cho_return ob_cho() throws RecognitionException {
        ArithmeticExpressionsParser.ob_cho_return retval = new ArithmeticExpressionsParser.ob_cho_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal104=null;
        Token VAR105=null;
        Token Dot106=null;
        Token VAR107=null;
        Token char_literal108=null;
        Token set109=null;
        Token char_literal110=null;
        ArithmeticExpressionsParser.ob_body_return ob_body111 =null;


        Object char_literal104_tree=null;
        Object VAR105_tree=null;
        Object Dot106_tree=null;
        Object VAR107_tree=null;
        Object char_literal108_tree=null;
        Object set109_tree=null;
        Object char_literal110_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:107:8: ( ( '!' )? VAR Dot VAR '(' ( NUM | VAR )? ')' | ob_body )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==61) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==VAR) ) {
                    int LA27_2 = input.LA(3);

                    if ( (LA27_2==Dot) ) {
                        int LA27_3 = input.LA(4);

                        if ( (LA27_3==VAR) ) {
                            int LA27_4 = input.LA(5);

                            if ( (LA27_4==62) ) {
                                int LA27_5 = input.LA(6);

                                if ( (LA27_5==NUM||LA27_5==VAR) ) {
                                    int LA27_6 = input.LA(7);

                                    if ( (LA27_6==DNUM||LA27_6==Fun||LA27_6==Minus||LA27_6==NUM||LA27_6==VAR||LA27_6==62) ) {
                                        alt27=2;
                                    }
                                    else if ( (LA27_6==63) ) {
                                        alt27=1;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 27, 6, input);

                                        throw nvae;

                                    }
                                }
                                else if ( (LA27_5==63) ) {
                                    alt27=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 27, 5, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 27, 4, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 27, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA27_0==VAR) ) {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==Dot) ) {
                    int LA27_3 = input.LA(3);

                    if ( (LA27_3==VAR) ) {
                        int LA27_4 = input.LA(4);

                        if ( (LA27_4==62) ) {
                            int LA27_5 = input.LA(5);

                            if ( (LA27_5==NUM||LA27_5==VAR) ) {
                                int LA27_6 = input.LA(6);

                                if ( (LA27_6==DNUM||LA27_6==Fun||LA27_6==Minus||LA27_6==NUM||LA27_6==VAR||LA27_6==62) ) {
                                    alt27=2;
                                }
                                else if ( (LA27_6==63) ) {
                                    alt27=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 27, 6, input);

                                    throw nvae;

                                }
                            }
                            else if ( (LA27_5==63) ) {
                                alt27=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 27, 5, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 27, 4, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 3, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:107:9: ( '!' )? VAR Dot VAR '(' ( NUM | VAR )? ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:107:9: ( '!' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==61) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:107:10: '!'
                            {
                            char_literal104=(Token)match(input,61,FOLLOW_61_in_ob_cho771); 
                            char_literal104_tree = 
                            (Object)adaptor.create(char_literal104)
                            ;
                            adaptor.addChild(root_0, char_literal104_tree);


                            }
                            break;

                    }


                    VAR105=(Token)match(input,VAR,FOLLOW_VAR_in_ob_cho775); 
                    VAR105_tree = 
                    (Object)adaptor.create(VAR105)
                    ;
                    adaptor.addChild(root_0, VAR105_tree);


                    Dot106=(Token)match(input,Dot,FOLLOW_Dot_in_ob_cho777); 
                    Dot106_tree = 
                    (Object)adaptor.create(Dot106)
                    ;
                    adaptor.addChild(root_0, Dot106_tree);


                    VAR107=(Token)match(input,VAR,FOLLOW_VAR_in_ob_cho779); 
                    VAR107_tree = 
                    (Object)adaptor.create(VAR107)
                    ;
                    adaptor.addChild(root_0, VAR107_tree);


                    char_literal108=(Token)match(input,62,FOLLOW_62_in_ob_cho781); 
                    char_literal108_tree = 
                    (Object)adaptor.create(char_literal108)
                    ;
                    adaptor.addChild(root_0, char_literal108_tree);


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:107:32: ( NUM | VAR )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==NUM||LA26_0==VAR) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:
                            {
                            set109=(Token)input.LT(1);

                            if ( input.LA(1)==NUM||input.LA(1)==VAR ) {
                                input.consume();
                                adaptor.addChild(root_0, 
                                (Object)adaptor.create(set109)
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


                    char_literal110=(Token)match(input,63,FOLLOW_63_in_ob_cho791); 
                    char_literal110_tree = 
                    (Object)adaptor.create(char_literal110)
                    ;
                    adaptor.addChild(root_0, char_literal110_tree);


                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:107:50: ob_body
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ob_body_in_ob_cho795);
                    ob_body111=ob_body();

                    state._fsp--;

                    adaptor.addChild(root_0, ob_body111.getTree());

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
    // $ANTLR end "ob_cho"


    public static class if_head_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_head"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:109:1: if_head : 'if' '(' ( if_this | if_op ) ')' ;
    public final ArithmeticExpressionsParser.if_head_return if_head() throws RecognitionException {
        ArithmeticExpressionsParser.if_head_return retval = new ArithmeticExpressionsParser.if_head_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal112=null;
        Token char_literal113=null;
        Token char_literal116=null;
        ArithmeticExpressionsParser.if_this_return if_this114 =null;

        ArithmeticExpressionsParser.if_op_return if_op115 =null;


        Object string_literal112_tree=null;
        Object char_literal113_tree=null;
        Object char_literal116_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:109:10: ( 'if' '(' ( if_this | if_op ) ')' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:110:2: 'if' '(' ( if_this | if_op ) ')'
            {
            root_0 = (Object)adaptor.nil();


            string_literal112=(Token)match(input,80,FOLLOW_80_in_if_head810); 
            string_literal112_tree = 
            (Object)adaptor.create(string_literal112)
            ;
            adaptor.addChild(root_0, string_literal112_tree);


            char_literal113=(Token)match(input,62,FOLLOW_62_in_if_head812); 
            char_literal113_tree = 
            (Object)adaptor.create(char_literal113)
            ;
            adaptor.addChild(root_0, char_literal113_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:110:11: ( if_this | if_op )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==82) ) {
                alt28=1;
            }
            else if ( (LA28_0==DNUM||LA28_0==Fun||LA28_0==Minus||LA28_0==NUM||LA28_0==VAR||LA28_0==62) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:110:12: if_this
                    {
                    pushFollow(FOLLOW_if_this_in_if_head815);
                    if_this114=if_this();

                    state._fsp--;

                    adaptor.addChild(root_0, if_this114.getTree());

                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:110:22: if_op
                    {
                    pushFollow(FOLLOW_if_op_in_if_head819);
                    if_op115=if_op();

                    state._fsp--;

                    adaptor.addChild(root_0, if_op115.getTree());

                    }
                    break;

            }


            char_literal116=(Token)match(input,63,FOLLOW_63_in_if_head823); 
            char_literal116_tree = 
            (Object)adaptor.create(char_literal116)
            ;
            adaptor.addChild(root_0, char_literal116_tree);


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
    // $ANTLR end "if_head"


    public static class if_this_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_this"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:111:1: if_this : 'this' '.' VAR '(' var_num ( ',' var_num )? ')' ;
    public final ArithmeticExpressionsParser.if_this_return if_this() throws RecognitionException {
        ArithmeticExpressionsParser.if_this_return retval = new ArithmeticExpressionsParser.if_this_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal117=null;
        Token char_literal118=null;
        Token VAR119=null;
        Token char_literal120=null;
        Token char_literal122=null;
        Token char_literal124=null;
        ArithmeticExpressionsParser.var_num_return var_num121 =null;

        ArithmeticExpressionsParser.var_num_return var_num123 =null;


        Object string_literal117_tree=null;
        Object char_literal118_tree=null;
        Object VAR119_tree=null;
        Object char_literal120_tree=null;
        Object char_literal122_tree=null;
        Object char_literal124_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:111:9: ( 'this' '.' VAR '(' var_num ( ',' var_num )? ')' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:111:12: 'this' '.' VAR '(' var_num ( ',' var_num )? ')'
            {
            root_0 = (Object)adaptor.nil();


            string_literal117=(Token)match(input,82,FOLLOW_82_in_if_this833); 
            string_literal117_tree = 
            (Object)adaptor.create(string_literal117)
            ;
            adaptor.addChild(root_0, string_literal117_tree);


            char_literal118=(Token)match(input,Dot,FOLLOW_Dot_in_if_this834); 
            char_literal118_tree = 
            (Object)adaptor.create(char_literal118)
            ;
            adaptor.addChild(root_0, char_literal118_tree);


            VAR119=(Token)match(input,VAR,FOLLOW_VAR_in_if_this836); 
            VAR119_tree = 
            (Object)adaptor.create(VAR119)
            ;
            adaptor.addChild(root_0, VAR119_tree);


            char_literal120=(Token)match(input,62,FOLLOW_62_in_if_this838); 
            char_literal120_tree = 
            (Object)adaptor.create(char_literal120)
            ;
            adaptor.addChild(root_0, char_literal120_tree);


            pushFollow(FOLLOW_var_num_in_if_this839);
            var_num121=var_num();

            state._fsp--;

            adaptor.addChild(root_0, var_num121.getTree());

            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:111:37: ( ',' var_num )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==67) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:111:38: ',' var_num
                    {
                    char_literal122=(Token)match(input,67,FOLLOW_67_in_if_this842); 
                    char_literal122_tree = 
                    (Object)adaptor.create(char_literal122)
                    ;
                    adaptor.addChild(root_0, char_literal122_tree);


                    pushFollow(FOLLOW_var_num_in_if_this844);
                    var_num123=var_num();

                    state._fsp--;

                    adaptor.addChild(root_0, var_num123.getTree());

                    }
                    break;

            }


            char_literal124=(Token)match(input,63,FOLLOW_63_in_if_this848); 
            char_literal124_tree = 
            (Object)adaptor.create(char_literal124)
            ;
            adaptor.addChild(root_0, char_literal124_tree);


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
    // $ANTLR end "if_this"


    public static class if_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_op"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:113:1: if_op : term ( ( '<' | '>' | '=' ) ^ term )* ;
    public final ArithmeticExpressionsParser.if_op_return if_op() throws RecognitionException {
        ArithmeticExpressionsParser.if_op_return retval = new ArithmeticExpressionsParser.if_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set126=null;
        ArithmeticExpressionsParser.term_return term125 =null;

        ArithmeticExpressionsParser.term_return term127 =null;


        Object set126_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:113:6: ( term ( ( '<' | '>' | '=' ) ^ term )* )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:113:8: term ( ( '<' | '>' | '=' ) ^ term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_if_op855);
            term125=term();

            state._fsp--;

            adaptor.addChild(root_0, term125.getTree());

            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:113:13: ( ( '<' | '>' | '=' ) ^ term )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0 >= 71 && LA30_0 <= 73)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:113:14: ( '<' | '>' | '=' ) ^ term
            	    {
            	    set126=(Token)input.LT(1);

            	    set126=(Token)input.LT(1);

            	    if ( (input.LA(1) >= 71 && input.LA(1) <= 73) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set126)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_term_in_if_op874);
            	    term127=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term127.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "if_op"


    public static class if_ch_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_ch"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:116:1: if_ch : ( else_b | elseif_b | if_body );
    public final ArithmeticExpressionsParser.if_ch_return if_ch() throws RecognitionException {
        ArithmeticExpressionsParser.if_ch_return retval = new ArithmeticExpressionsParser.if_ch_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.else_b_return else_b128 =null;

        ArithmeticExpressionsParser.elseif_b_return elseif_b129 =null;

        ArithmeticExpressionsParser.if_body_return if_body130 =null;



        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:116:7: ( else_b | elseif_b | if_body )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt31=1;
                }
                break;
            case 77:
                {
                alt31=2;
                }
                break;
            case BOOLEAN:
            case Br_close:
            case Br_open:
            case DOUBLE:
            case INT:
            case Modifier:
            case NUM:
            case SEMICOLON:
            case STRING:
            case System:
            case VAR:
            case 79:
            case 80:
            case 81:
            case 83:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:116:9: else_b
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_else_b_in_if_ch886);
                    else_b128=else_b();

                    state._fsp--;

                    adaptor.addChild(root_0, else_b128.getTree());

                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:116:18: elseif_b
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_elseif_b_in_if_ch890);
                    elseif_b129=elseif_b();

                    state._fsp--;

                    adaptor.addChild(root_0, elseif_b129.getTree());

                    }
                    break;
                case 3 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:116:28: if_body
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_if_body_in_if_ch893);
                    if_body130=if_body();

                    state._fsp--;

                    adaptor.addChild(root_0, if_body130.getTree());

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
    // $ANTLR end "if_ch"


    public static class else_b_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_b"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:1: else_b : 'else' ( ( stmt )* | ( '{' ) ( stmt )* ( '}' ) ) ;
    public final ArithmeticExpressionsParser.else_b_return else_b() throws RecognitionException {
        ArithmeticExpressionsParser.else_b_return retval = new ArithmeticExpressionsParser.else_b_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal131=null;
        Token char_literal133=null;
        Token char_literal135=null;
        ArithmeticExpressionsParser.stmt_return stmt132 =null;

        ArithmeticExpressionsParser.stmt_return stmt134 =null;


        Object string_literal131_tree=null;
        Object char_literal133_tree=null;
        Object char_literal135_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:8: ( 'else' ( ( stmt )* | ( '{' ) ( stmt )* ( '}' ) ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:11: 'else' ( ( stmt )* | ( '{' ) ( stmt )* ( '}' ) )
            {
            root_0 = (Object)adaptor.nil();


            string_literal131=(Token)match(input,78,FOLLOW_78_in_else_b902); 
            string_literal131_tree = 
            (Object)adaptor.create(string_literal131)
            ;
            adaptor.addChild(root_0, string_literal131_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:18: ( ( stmt )* | ( '{' ) ( stmt )* ( '}' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==BOOLEAN||LA34_0==Br_close||LA34_0==DOUBLE||LA34_0==INT||(LA34_0 >= Modifier && LA34_0 <= NUM)||LA34_0==SEMICOLON||LA34_0==STRING||LA34_0==System||LA34_0==VAR||(LA34_0 >= 79 && LA34_0 <= 81)||LA34_0==83) ) {
                alt34=1;
            }
            else if ( (LA34_0==Br_open) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:20: ( stmt )*
                    {
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:20: ( stmt )*
                    loop32:
                    do {
                        int alt32=2;
                        switch ( input.LA(1) ) {
                        case Modifier:
                            {
                            alt32=1;
                            }
                            break;
                        case INT:
                            {
                            alt32=1;
                            }
                            break;
                        case DOUBLE:
                            {
                            alt32=1;
                            }
                            break;
                        case VAR:
                            {
                            alt32=1;
                            }
                            break;
                        case STRING:
                            {
                            alt32=1;
                            }
                            break;
                        case 83:
                            {
                            alt32=1;
                            }
                            break;
                        case 79:
                            {
                            alt32=1;
                            }
                            break;
                        case NUM:
                            {
                            alt32=1;
                            }
                            break;
                        case 80:
                            {
                            alt32=1;
                            }
                            break;
                        case BOOLEAN:
                            {
                            alt32=1;
                            }
                            break;
                        case SEMICOLON:
                            {
                            alt32=1;
                            }
                            break;
                        case System:
                            {
                            alt32=1;
                            }
                            break;

                        }

                        switch (alt32) {
                    	case 1 :
                    	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:20: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_else_b906);
                    	    stmt132=stmt();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, stmt132.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:29: ( '{' ) ( stmt )* ( '}' )
                    {
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:29: ( '{' )
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:30: '{'
                    {
                    char_literal133=(Token)match(input,Br_open,FOLLOW_Br_open_in_else_b913); 
                    char_literal133_tree = 
                    (Object)adaptor.create(char_literal133)
                    ;
                    adaptor.addChild(root_0, char_literal133_tree);


                    }


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:36: ( stmt )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==BOOLEAN||LA33_0==DOUBLE||LA33_0==INT||(LA33_0 >= Modifier && LA33_0 <= NUM)||LA33_0==SEMICOLON||LA33_0==STRING||LA33_0==System||LA33_0==VAR||(LA33_0 >= 79 && LA33_0 <= 80)||LA33_0==83) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:36: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_else_b917);
                    	    stmt134=stmt();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, stmt134.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:42: ( '}' )
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:44: '}'
                    {
                    char_literal135=(Token)match(input,Br_close,FOLLOW_Br_close_in_else_b922); 
                    char_literal135_tree = 
                    (Object)adaptor.create(char_literal135)
                    ;
                    adaptor.addChild(root_0, char_literal135_tree);


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
    // $ANTLR end "else_b"


    public static class elseif_b_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elseif_b"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:119:1: elseif_b : 'else if' '(' object ')' ( ( stmt )* | ( '{' ) ( stmt )* ( '}' ) ) ;
    public final ArithmeticExpressionsParser.elseif_b_return elseif_b() throws RecognitionException {
        ArithmeticExpressionsParser.elseif_b_return retval = new ArithmeticExpressionsParser.elseif_b_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal136=null;
        Token char_literal137=null;
        Token char_literal139=null;
        Token char_literal141=null;
        Token char_literal143=null;
        ArithmeticExpressionsParser.object_return object138 =null;

        ArithmeticExpressionsParser.stmt_return stmt140 =null;

        ArithmeticExpressionsParser.stmt_return stmt142 =null;


        Object string_literal136_tree=null;
        Object char_literal137_tree=null;
        Object char_literal139_tree=null;
        Object char_literal141_tree=null;
        Object char_literal143_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:119:11: ( 'else if' '(' object ')' ( ( stmt )* | ( '{' ) ( stmt )* ( '}' ) ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:119:14: 'else if' '(' object ')' ( ( stmt )* | ( '{' ) ( stmt )* ( '}' ) )
            {
            root_0 = (Object)adaptor.nil();


            string_literal136=(Token)match(input,77,FOLLOW_77_in_elseif_b935); 
            string_literal136_tree = 
            (Object)adaptor.create(string_literal136)
            ;
            adaptor.addChild(root_0, string_literal136_tree);


            char_literal137=(Token)match(input,62,FOLLOW_62_in_elseif_b937); 
            char_literal137_tree = 
            (Object)adaptor.create(char_literal137)
            ;
            adaptor.addChild(root_0, char_literal137_tree);


            pushFollow(FOLLOW_object_in_elseif_b939);
            object138=object();

            state._fsp--;

            adaptor.addChild(root_0, object138.getTree());

            char_literal139=(Token)match(input,63,FOLLOW_63_in_elseif_b941); 
            char_literal139_tree = 
            (Object)adaptor.create(char_literal139)
            ;
            adaptor.addChild(root_0, char_literal139_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:119:39: ( ( stmt )* | ( '{' ) ( stmt )* ( '}' ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==BOOLEAN||LA37_0==Br_close||LA37_0==DOUBLE||LA37_0==INT||(LA37_0 >= Modifier && LA37_0 <= NUM)||LA37_0==SEMICOLON||LA37_0==STRING||LA37_0==System||LA37_0==VAR||(LA37_0 >= 79 && LA37_0 <= 81)||LA37_0==83) ) {
                alt37=1;
            }
            else if ( (LA37_0==Br_open) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }
            switch (alt37) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:119:41: ( stmt )*
                    {
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:119:41: ( stmt )*
                    loop35:
                    do {
                        int alt35=2;
                        switch ( input.LA(1) ) {
                        case Modifier:
                            {
                            alt35=1;
                            }
                            break;
                        case INT:
                            {
                            alt35=1;
                            }
                            break;
                        case DOUBLE:
                            {
                            alt35=1;
                            }
                            break;
                        case VAR:
                            {
                            alt35=1;
                            }
                            break;
                        case STRING:
                            {
                            alt35=1;
                            }
                            break;
                        case 83:
                            {
                            alt35=1;
                            }
                            break;
                        case 79:
                            {
                            alt35=1;
                            }
                            break;
                        case NUM:
                            {
                            alt35=1;
                            }
                            break;
                        case 80:
                            {
                            alt35=1;
                            }
                            break;
                        case BOOLEAN:
                            {
                            alt35=1;
                            }
                            break;
                        case SEMICOLON:
                            {
                            alt35=1;
                            }
                            break;
                        case System:
                            {
                            alt35=1;
                            }
                            break;

                        }

                        switch (alt35) {
                    	case 1 :
                    	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:119:41: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_elseif_b945);
                    	    stmt140=stmt();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, stmt140.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:119:50: ( '{' ) ( stmt )* ( '}' )
                    {
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:119:50: ( '{' )
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:119:51: '{'
                    {
                    char_literal141=(Token)match(input,Br_open,FOLLOW_Br_open_in_elseif_b952); 
                    char_literal141_tree = 
                    (Object)adaptor.create(char_literal141)
                    ;
                    adaptor.addChild(root_0, char_literal141_tree);


                    }


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:119:57: ( stmt )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==BOOLEAN||LA36_0==DOUBLE||LA36_0==INT||(LA36_0 >= Modifier && LA36_0 <= NUM)||LA36_0==SEMICOLON||LA36_0==STRING||LA36_0==System||LA36_0==VAR||(LA36_0 >= 79 && LA36_0 <= 80)||LA36_0==83) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:119:57: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_elseif_b956);
                    	    stmt142=stmt();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, stmt142.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:119:63: ( '}' )
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:119:65: '}'
                    {
                    char_literal143=(Token)match(input,Br_close,FOLLOW_Br_close_in_elseif_b961); 
                    char_literal143_tree = 
                    (Object)adaptor.create(char_literal143)
                    ;
                    adaptor.addChild(root_0, char_literal143_tree);


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
    // $ANTLR end "elseif_b"


    public static class if_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_body"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:120:1: if_body : ( ( stmt )* | ( '{' ) ( stmt )* ( '}' ) ) ;
    public final ArithmeticExpressionsParser.if_body_return if_body() throws RecognitionException {
        ArithmeticExpressionsParser.if_body_return retval = new ArithmeticExpressionsParser.if_body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal145=null;
        Token char_literal147=null;
        ArithmeticExpressionsParser.stmt_return stmt144 =null;

        ArithmeticExpressionsParser.stmt_return stmt146 =null;


        Object char_literal145_tree=null;
        Object char_literal147_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:120:9: ( ( ( stmt )* | ( '{' ) ( stmt )* ( '}' ) ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:120:11: ( ( stmt )* | ( '{' ) ( stmt )* ( '}' ) )
            {
            root_0 = (Object)adaptor.nil();


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:120:11: ( ( stmt )* | ( '{' ) ( stmt )* ( '}' ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==BOOLEAN||LA40_0==Br_close||LA40_0==DOUBLE||LA40_0==INT||(LA40_0 >= Modifier && LA40_0 <= NUM)||LA40_0==SEMICOLON||LA40_0==STRING||LA40_0==System||LA40_0==VAR||(LA40_0 >= 79 && LA40_0 <= 81)||LA40_0==83) ) {
                alt40=1;
            }
            else if ( (LA40_0==Br_open) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }
            switch (alt40) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:120:13: ( stmt )*
                    {
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:120:13: ( stmt )*
                    loop38:
                    do {
                        int alt38=2;
                        switch ( input.LA(1) ) {
                        case Modifier:
                            {
                            alt38=1;
                            }
                            break;
                        case INT:
                            {
                            alt38=1;
                            }
                            break;
                        case DOUBLE:
                            {
                            alt38=1;
                            }
                            break;
                        case VAR:
                            {
                            alt38=1;
                            }
                            break;
                        case STRING:
                            {
                            alt38=1;
                            }
                            break;
                        case 83:
                            {
                            alt38=1;
                            }
                            break;
                        case 79:
                            {
                            alt38=1;
                            }
                            break;
                        case NUM:
                            {
                            alt38=1;
                            }
                            break;
                        case 80:
                            {
                            alt38=1;
                            }
                            break;
                        case BOOLEAN:
                            {
                            alt38=1;
                            }
                            break;
                        case SEMICOLON:
                            {
                            alt38=1;
                            }
                            break;
                        case System:
                            {
                            alt38=1;
                            }
                            break;

                        }

                        switch (alt38) {
                    	case 1 :
                    	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:120:13: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_if_body974);
                    	    stmt144=stmt();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, stmt144.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:120:21: ( '{' ) ( stmt )* ( '}' )
                    {
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:120:21: ( '{' )
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:120:22: '{'
                    {
                    char_literal145=(Token)match(input,Br_open,FOLLOW_Br_open_in_if_body980); 
                    char_literal145_tree = 
                    (Object)adaptor.create(char_literal145)
                    ;
                    adaptor.addChild(root_0, char_literal145_tree);


                    }


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:120:28: ( stmt )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==BOOLEAN||LA39_0==DOUBLE||LA39_0==INT||(LA39_0 >= Modifier && LA39_0 <= NUM)||LA39_0==SEMICOLON||LA39_0==STRING||LA39_0==System||LA39_0==VAR||(LA39_0 >= 79 && LA39_0 <= 80)||LA39_0==83) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:120:28: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_if_body984);
                    	    stmt146=stmt();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, stmt146.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:120:35: ( '}' )
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:120:37: '}'
                    {
                    char_literal147=(Token)match(input,Br_close,FOLLOW_Br_close_in_if_body990); 
                    char_literal147_tree = 
                    (Object)adaptor.create(char_literal147)
                    ;
                    adaptor.addChild(root_0, char_literal147_tree);


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
    // $ANTLR end "if_body"


    public static class ifstmt_1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifstmt_1"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:121:1: ifstmt_1 : if_head if_ch ;
    public final ArithmeticExpressionsParser.ifstmt_1_return ifstmt_1() throws RecognitionException {
        ArithmeticExpressionsParser.ifstmt_1_return retval = new ArithmeticExpressionsParser.ifstmt_1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.if_head_return if_head148 =null;

        ArithmeticExpressionsParser.if_ch_return if_ch149 =null;



        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:122:2: ( if_head if_ch )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:122:4: if_head if_ch
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_if_head_in_ifstmt_11003);
            if_head148=if_head();

            state._fsp--;

            adaptor.addChild(root_0, if_head148.getTree());

            pushFollow(FOLLOW_if_ch_in_ifstmt_11005);
            if_ch149=if_ch();

            state._fsp--;

            adaptor.addChild(root_0, if_ch149.getTree());

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
    // $ANTLR end "ifstmt_1"


    public static class big_if_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "big_if"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:123:1: big_if : ifstmt_1 ;
    public final ArithmeticExpressionsParser.big_if_return big_if() throws RecognitionException {
        ArithmeticExpressionsParser.big_if_return retval = new ArithmeticExpressionsParser.big_if_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.ifstmt_1_return ifstmt_1150 =null;



        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:123:8: ( ifstmt_1 )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:123:10: ifstmt_1
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_ifstmt_1_in_big_if1012);
            ifstmt_1150=ifstmt_1();

            state._fsp--;

            adaptor.addChild(root_0, ifstmt_1150.getTree());

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
    // $ANTLR end "big_if"


    public static class params_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:126:1: params : '(' ( ( types VAR | VAR VAR ) ( ',' types VAR )* )? ')' ;
    public final ArithmeticExpressionsParser.params_return params() throws RecognitionException {
        ArithmeticExpressionsParser.params_return retval = new ArithmeticExpressionsParser.params_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal151=null;
        Token VAR153=null;
        Token VAR154=null;
        Token VAR155=null;
        Token char_literal156=null;
        Token VAR158=null;
        Token char_literal159=null;
        ArithmeticExpressionsParser.types_return types152 =null;

        ArithmeticExpressionsParser.types_return types157 =null;


        Object char_literal151_tree=null;
        Object VAR153_tree=null;
        Object VAR154_tree=null;
        Object VAR155_tree=null;
        Object char_literal156_tree=null;
        Object VAR158_tree=null;
        Object char_literal159_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:126:8: ( '(' ( ( types VAR | VAR VAR ) ( ',' types VAR )* )? ')' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:126:10: '(' ( ( types VAR | VAR VAR ) ( ',' types VAR )* )? ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal151=(Token)match(input,62,FOLLOW_62_in_params1023); 
            char_literal151_tree = 
            (Object)adaptor.create(char_literal151)
            ;
            adaptor.addChild(root_0, char_literal151_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:126:13: ( ( types VAR | VAR VAR ) ( ',' types VAR )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==BOOLEAN||LA43_0==DOUBLE||LA43_0==INT||LA43_0==STRING||LA43_0==VAR) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:126:14: ( types VAR | VAR VAR ) ( ',' types VAR )*
                    {
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:126:14: ( types VAR | VAR VAR )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==BOOLEAN||LA41_0==DOUBLE||LA41_0==INT||LA41_0==STRING) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==VAR) ) {
                        alt41=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;

                    }
                    switch (alt41) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:126:15: types VAR
                            {
                            pushFollow(FOLLOW_types_in_params1026);
                            types152=types();

                            state._fsp--;

                            adaptor.addChild(root_0, types152.getTree());

                            VAR153=(Token)match(input,VAR,FOLLOW_VAR_in_params1028); 
                            VAR153_tree = 
                            (Object)adaptor.create(VAR153)
                            ;
                            adaptor.addChild(root_0, VAR153_tree);


                            }
                            break;
                        case 2 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:126:25: VAR VAR
                            {
                            VAR154=(Token)match(input,VAR,FOLLOW_VAR_in_params1030); 
                            VAR154_tree = 
                            (Object)adaptor.create(VAR154)
                            ;
                            adaptor.addChild(root_0, VAR154_tree);


                            VAR155=(Token)match(input,VAR,FOLLOW_VAR_in_params1032); 
                            VAR155_tree = 
                            (Object)adaptor.create(VAR155)
                            ;
                            adaptor.addChild(root_0, VAR155_tree);


                            }
                            break;

                    }


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:126:34: ( ',' types VAR )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==67) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:126:35: ',' types VAR
                    	    {
                    	    char_literal156=(Token)match(input,67,FOLLOW_67_in_params1036); 
                    	    char_literal156_tree = 
                    	    (Object)adaptor.create(char_literal156)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal156_tree);


                    	    pushFollow(FOLLOW_types_in_params1038);
                    	    types157=types();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, types157.getTree());

                    	    VAR158=(Token)match(input,VAR,FOLLOW_VAR_in_params1040); 
                    	    VAR158_tree = 
                    	    (Object)adaptor.create(VAR158)
                    	    ;
                    	    adaptor.addChild(root_0, VAR158_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal159=(Token)match(input,63,FOLLOW_63_in_params1046); 
            char_literal159_tree = 
            (Object)adaptor.create(char_literal159)
            ;
            adaptor.addChild(root_0, char_literal159_tree);


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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:127:1: decl : ( int_dec -> ^( Int_dec int_dec ) | double_dec -> ^( Double_dec double_dec ) );
    public final ArithmeticExpressionsParser.decl_return decl() throws RecognitionException {
        ArithmeticExpressionsParser.decl_return retval = new ArithmeticExpressionsParser.decl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.int_dec_return int_dec160 =null;

        ArithmeticExpressionsParser.double_dec_return double_dec161 =null;


        RewriteRuleSubtreeStream stream_int_dec=new RewriteRuleSubtreeStream(adaptor,"rule int_dec");
        RewriteRuleSubtreeStream stream_double_dec=new RewriteRuleSubtreeStream(adaptor,"rule double_dec");
        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:127:9: ( int_dec -> ^( Int_dec int_dec ) | double_dec -> ^( Double_dec double_dec ) )
            int alt44=2;
            switch ( input.LA(1) ) {
            case Modifier:
                {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==INT) ) {
                    alt44=1;
                }
                else if ( (LA44_1==DOUBLE) ) {
                    alt44=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt44=1;
                }
                break;
            case DOUBLE:
                {
                alt44=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }

            switch (alt44) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:128:2: int_dec
                    {
                    pushFollow(FOLLOW_int_dec_in_decl1060);
                    int_dec160=int_dec();

                    state._fsp--;

                    stream_int_dec.add(int_dec160.getTree());

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
                    // 128:10: -> ^( Int_dec int_dec )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:128:13: ^( Int_dec int_dec )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:129:3: double_dec
                    {
                    pushFollow(FOLLOW_double_dec_in_decl1072);
                    double_dec161=double_dec();

                    state._fsp--;

                    stream_double_dec.add(double_dec161.getTree());

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
                    // 129:14: -> ^( Double_dec double_dec )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:129:17: ^( Double_dec double_dec )
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:131:2: while_condition : ( '(' condition ')' | object );
    public final ArithmeticExpressionsParser.while_condition_return while_condition() throws RecognitionException {
        ArithmeticExpressionsParser.while_condition_return retval = new ArithmeticExpressionsParser.while_condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal162=null;
        Token char_literal164=null;
        ArithmeticExpressionsParser.condition_return condition163 =null;

        ArithmeticExpressionsParser.object_return object165 =null;


        Object char_literal162_tree=null;
        Object char_literal164_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:132:4: ( '(' condition ')' | object )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==62) ) {
                alt45=1;
            }
            else if ( (LA45_0==NUM||LA45_0==VAR||LA45_0==61||LA45_0==63) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }
            switch (alt45) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:132:6: '(' condition ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal162=(Token)match(input,62,FOLLOW_62_in_while_condition1093); 
                    char_literal162_tree = 
                    (Object)adaptor.create(char_literal162)
                    ;
                    adaptor.addChild(root_0, char_literal162_tree);


                    pushFollow(FOLLOW_condition_in_while_condition1095);
                    condition163=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, condition163.getTree());

                    char_literal164=(Token)match(input,63,FOLLOW_63_in_while_condition1097); 
                    char_literal164_tree = 
                    (Object)adaptor.create(char_literal164)
                    ;
                    adaptor.addChild(root_0, char_literal164_tree);


                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:132:24: object
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_object_in_while_condition1099);
                    object165=object();

                    state._fsp--;

                    adaptor.addChild(root_0, object165.getTree());

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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:133:1: whilestmt : 'while' '(' while_condition ')' '{' ( stmt )* 'return' return_type SEMICOLON '}' -> ^( Whilestmt 'while' '(' while_condition ')' '{' ( stmt )* 'return' return_type SEMICOLON '}' ) ;
    public final ArithmeticExpressionsParser.whilestmt_return whilestmt() throws RecognitionException {
        ArithmeticExpressionsParser.whilestmt_return retval = new ArithmeticExpressionsParser.whilestmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal166=null;
        Token char_literal167=null;
        Token char_literal169=null;
        Token char_literal170=null;
        Token string_literal172=null;
        Token SEMICOLON174=null;
        Token char_literal175=null;
        ArithmeticExpressionsParser.while_condition_return while_condition168 =null;

        ArithmeticExpressionsParser.stmt_return stmt171 =null;

        ArithmeticExpressionsParser.return_type_return return_type173 =null;


        Object string_literal166_tree=null;
        Object char_literal167_tree=null;
        Object char_literal169_tree=null;
        Object char_literal170_tree=null;
        Object string_literal172_tree=null;
        Object SEMICOLON174_tree=null;
        Object char_literal175_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_Br_open=new RewriteRuleTokenStream(adaptor,"token Br_open");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_Br_close=new RewriteRuleTokenStream(adaptor,"token Br_close");
        RewriteRuleSubtreeStream stream_return_type=new RewriteRuleSubtreeStream(adaptor,"rule return_type");
        RewriteRuleSubtreeStream stream_while_condition=new RewriteRuleSubtreeStream(adaptor,"rule while_condition");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:133:11: ( 'while' '(' while_condition ')' '{' ( stmt )* 'return' return_type SEMICOLON '}' -> ^( Whilestmt 'while' '(' while_condition ')' '{' ( stmt )* 'return' return_type SEMICOLON '}' ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:134:2: 'while' '(' while_condition ')' '{' ( stmt )* 'return' return_type SEMICOLON '}'
            {
            string_literal166=(Token)match(input,83,FOLLOW_83_in_whilestmt1108);  
            stream_83.add(string_literal166);


            char_literal167=(Token)match(input,62,FOLLOW_62_in_whilestmt1110);  
            stream_62.add(char_literal167);


            pushFollow(FOLLOW_while_condition_in_whilestmt1112);
            while_condition168=while_condition();

            state._fsp--;

            stream_while_condition.add(while_condition168.getTree());

            char_literal169=(Token)match(input,63,FOLLOW_63_in_whilestmt1114);  
            stream_63.add(char_literal169);


            char_literal170=(Token)match(input,Br_open,FOLLOW_Br_open_in_whilestmt1116);  
            stream_Br_open.add(char_literal170);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:134:38: ( stmt )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==BOOLEAN||LA46_0==DOUBLE||LA46_0==INT||(LA46_0 >= Modifier && LA46_0 <= NUM)||LA46_0==SEMICOLON||LA46_0==STRING||LA46_0==System||LA46_0==VAR||(LA46_0 >= 79 && LA46_0 <= 80)||LA46_0==83) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:134:38: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_whilestmt1118);
            	    stmt171=stmt();

            	    state._fsp--;

            	    stream_stmt.add(stmt171.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            string_literal172=(Token)match(input,81,FOLLOW_81_in_whilestmt1122);  
            stream_81.add(string_literal172);


            pushFollow(FOLLOW_return_type_in_whilestmt1124);
            return_type173=return_type();

            state._fsp--;

            stream_return_type.add(return_type173.getTree());

            SEMICOLON174=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_whilestmt1126);  
            stream_SEMICOLON.add(SEMICOLON174);


            char_literal175=(Token)match(input,Br_close,FOLLOW_Br_close_in_whilestmt1128);  
            stream_Br_close.add(char_literal175);


            // AST REWRITE
            // elements: 63, stmt, while_condition, Br_open, Br_close, 81, return_type, SEMICOLON, 62, 83
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 135:3: -> ^( Whilestmt 'while' '(' while_condition ')' '{' ( stmt )* 'return' return_type SEMICOLON '}' )
            {
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:135:6: ^( Whilestmt 'while' '(' while_condition ')' '{' ( stmt )* 'return' return_type SEMICOLON '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Whilestmt, "Whilestmt")
                , root_1);

                adaptor.addChild(root_1, 
                stream_83.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_62.nextNode()
                );

                adaptor.addChild(root_1, stream_while_condition.nextTree());

                adaptor.addChild(root_1, 
                stream_63.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_Br_open.nextNode()
                );

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:135:54: ( stmt )*
                while ( stream_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmt.nextTree());

                }
                stream_stmt.reset();

                adaptor.addChild(root_1, 
                stream_81.nextNode()
                );

                adaptor.addChild(root_1, stream_return_type.nextTree());

                adaptor.addChild(root_1, 
                stream_SEMICOLON.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_Br_close.nextNode()
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


    public static class forloop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forloop"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:141:1: forloop : 'for' '(' ( decl ) ( condition ) SEMICOLON ( VAR change ) ')' '{' ( stmt )* '}' ;
    public final ArithmeticExpressionsParser.forloop_return forloop() throws RecognitionException {
        ArithmeticExpressionsParser.forloop_return retval = new ArithmeticExpressionsParser.forloop_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal176=null;
        Token char_literal177=null;
        Token SEMICOLON180=null;
        Token VAR181=null;
        Token char_literal183=null;
        Token char_literal184=null;
        Token char_literal186=null;
        ArithmeticExpressionsParser.decl_return decl178 =null;

        ArithmeticExpressionsParser.condition_return condition179 =null;

        ArithmeticExpressionsParser.change_return change182 =null;

        ArithmeticExpressionsParser.stmt_return stmt185 =null;


        Object string_literal176_tree=null;
        Object char_literal177_tree=null;
        Object SEMICOLON180_tree=null;
        Object VAR181_tree=null;
        Object char_literal183_tree=null;
        Object char_literal184_tree=null;
        Object char_literal186_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:141:9: ( 'for' '(' ( decl ) ( condition ) SEMICOLON ( VAR change ) ')' '{' ( stmt )* '}' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:142:2: 'for' '(' ( decl ) ( condition ) SEMICOLON ( VAR change ) ')' '{' ( stmt )* '}'
            {
            root_0 = (Object)adaptor.nil();


            string_literal176=(Token)match(input,79,FOLLOW_79_in_forloop1178); 
            string_literal176_tree = 
            (Object)adaptor.create(string_literal176)
            ;
            adaptor.addChild(root_0, string_literal176_tree);


            char_literal177=(Token)match(input,62,FOLLOW_62_in_forloop1180); 
            char_literal177_tree = 
            (Object)adaptor.create(char_literal177)
            ;
            adaptor.addChild(root_0, char_literal177_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:142:12: ( decl )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:142:13: decl
            {
            pushFollow(FOLLOW_decl_in_forloop1183);
            decl178=decl();

            state._fsp--;

            adaptor.addChild(root_0, decl178.getTree());

            }


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:142:19: ( condition )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:142:20: condition
            {
            pushFollow(FOLLOW_condition_in_forloop1187);
            condition179=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition179.getTree());

            }


            SEMICOLON180=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_forloop1190); 
            SEMICOLON180_tree = 
            (Object)adaptor.create(SEMICOLON180)
            ;
            adaptor.addChild(root_0, SEMICOLON180_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:142:41: ( VAR change )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:142:42: VAR change
            {
            VAR181=(Token)match(input,VAR,FOLLOW_VAR_in_forloop1193); 
            VAR181_tree = 
            (Object)adaptor.create(VAR181)
            ;
            adaptor.addChild(root_0, VAR181_tree);


            pushFollow(FOLLOW_change_in_forloop1195);
            change182=change();

            state._fsp--;

            adaptor.addChild(root_0, change182.getTree());

            }


            char_literal183=(Token)match(input,63,FOLLOW_63_in_forloop1198); 
            char_literal183_tree = 
            (Object)adaptor.create(char_literal183)
            ;
            adaptor.addChild(root_0, char_literal183_tree);


            char_literal184=(Token)match(input,Br_open,FOLLOW_Br_open_in_forloop1200); 
            char_literal184_tree = 
            (Object)adaptor.create(char_literal184)
            ;
            adaptor.addChild(root_0, char_literal184_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:142:62: ( stmt )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==BOOLEAN||LA47_0==DOUBLE||LA47_0==INT||(LA47_0 >= Modifier && LA47_0 <= NUM)||LA47_0==SEMICOLON||LA47_0==STRING||LA47_0==System||LA47_0==VAR||(LA47_0 >= 79 && LA47_0 <= 80)||LA47_0==83) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:142:62: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_forloop1202);
            	    stmt185=stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stmt185.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            char_literal186=(Token)match(input,Br_close,FOLLOW_Br_close_in_forloop1205); 
            char_literal186_tree = 
            (Object)adaptor.create(char_literal186)
            ;
            adaptor.addChild(root_0, char_literal186_tree);


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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:144:1: assigment : assign -> ^( Assigment assign ) ;
    public final ArithmeticExpressionsParser.assigment_return assigment() throws RecognitionException {
        ArithmeticExpressionsParser.assigment_return retval = new ArithmeticExpressionsParser.assigment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.assign_return assign187 =null;


        RewriteRuleSubtreeStream stream_assign=new RewriteRuleSubtreeStream(adaptor,"rule assign");
        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:144:10: ( assign -> ^( Assigment assign ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:145:2: assign
            {
            pushFollow(FOLLOW_assign_in_assigment1217);
            assign187=assign();

            state._fsp--;

            stream_assign.add(assign187.getTree());

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
            // 146:2: -> ^( Assigment assign )
            {
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:146:5: ^( Assigment assign )
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
    // $ANTLR end "assigment"


    public static class initialize_2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initialize_2"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:148:1: initialize_2 : ( Dot )? VAR '(' ( NUM | VAR )? ( ',' )? ( NUM | VAR )? ')' ;
    public final ArithmeticExpressionsParser.initialize_2_return initialize_2() throws RecognitionException {
        ArithmeticExpressionsParser.initialize_2_return retval = new ArithmeticExpressionsParser.initialize_2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Dot188=null;
        Token VAR189=null;
        Token char_literal190=null;
        Token set191=null;
        Token char_literal192=null;
        Token set193=null;
        Token char_literal194=null;

        Object Dot188_tree=null;
        Object VAR189_tree=null;
        Object char_literal190_tree=null;
        Object set191_tree=null;
        Object char_literal192_tree=null;
        Object set193_tree=null;
        Object char_literal194_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:149:2: ( ( Dot )? VAR '(' ( NUM | VAR )? ( ',' )? ( NUM | VAR )? ')' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:149:5: ( Dot )? VAR '(' ( NUM | VAR )? ( ',' )? ( NUM | VAR )? ')'
            {
            root_0 = (Object)adaptor.nil();


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:149:5: ( Dot )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==Dot) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:149:5: Dot
                    {
                    Dot188=(Token)match(input,Dot,FOLLOW_Dot_in_initialize_21237); 
                    Dot188_tree = 
                    (Object)adaptor.create(Dot188)
                    ;
                    adaptor.addChild(root_0, Dot188_tree);


                    }
                    break;

            }


            VAR189=(Token)match(input,VAR,FOLLOW_VAR_in_initialize_21240); 
            VAR189_tree = 
            (Object)adaptor.create(VAR189)
            ;
            adaptor.addChild(root_0, VAR189_tree);


            char_literal190=(Token)match(input,62,FOLLOW_62_in_initialize_21242); 
            char_literal190_tree = 
            (Object)adaptor.create(char_literal190)
            ;
            adaptor.addChild(root_0, char_literal190_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:149:17: ( NUM | VAR )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==NUM||LA49_0==VAR) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:
                    {
                    set191=(Token)input.LT(1);

                    if ( input.LA(1)==NUM||input.LA(1)==VAR ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set191)
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


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:149:27: ( ',' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==67) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:149:27: ','
                    {
                    char_literal192=(Token)match(input,67,FOLLOW_67_in_initialize_21249); 
                    char_literal192_tree = 
                    (Object)adaptor.create(char_literal192)
                    ;
                    adaptor.addChild(root_0, char_literal192_tree);


                    }
                    break;

            }


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:149:31: ( NUM | VAR )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==NUM||LA51_0==VAR) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:
                    {
                    set193=(Token)input.LT(1);

                    if ( input.LA(1)==NUM||input.LA(1)==VAR ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set193)
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


            char_literal194=(Token)match(input,63,FOLLOW_63_in_initialize_21258); 
            char_literal194_tree = 
            (Object)adaptor.create(char_literal194)
            ;
            adaptor.addChild(root_0, char_literal194_tree);


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
    // $ANTLR end "initialize_2"


    public static class assign_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:159:1: assign : VAR ( ( change )? '=' VAR | ( New )? ( '*' )? ( generalArithExpr | initialize_2 ) ) SEMICOLON ;
    public final ArithmeticExpressionsParser.assign_return assign() throws RecognitionException {
        ArithmeticExpressionsParser.assign_return retval = new ArithmeticExpressionsParser.assign_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR195=null;
        Token char_literal197=null;
        Token VAR198=null;
        Token New199=null;
        Token char_literal200=null;
        Token SEMICOLON203=null;
        ArithmeticExpressionsParser.change_return change196 =null;

        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr201 =null;

        ArithmeticExpressionsParser.initialize_2_return initialize_2202 =null;


        Object VAR195_tree=null;
        Object char_literal197_tree=null;
        Object VAR198_tree=null;
        Object New199_tree=null;
        Object char_literal200_tree=null;
        Object SEMICOLON203_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:159:8: ( VAR ( ( change )? '=' VAR | ( New )? ( '*' )? ( generalArithExpr | initialize_2 ) ) SEMICOLON )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:160:3: VAR ( ( change )? '=' VAR | ( New )? ( '*' )? ( generalArithExpr | initialize_2 ) ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            VAR195=(Token)match(input,VAR,FOLLOW_VAR_in_assign1298); 
            VAR195_tree = 
            (Object)adaptor.create(VAR195)
            ;
            adaptor.addChild(root_0, VAR195_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:160:7: ( ( change )? '=' VAR | ( New )? ( '*' )? ( generalArithExpr | initialize_2 ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0 >= 65 && LA56_0 <= 66)||(LA56_0 >= 68 && LA56_0 <= 69)||LA56_0==72) ) {
                alt56=1;
            }
            else if ( (LA56_0==DNUM||LA56_0==Dot||LA56_0==Fun||LA56_0==Minus||(LA56_0 >= NUM && LA56_0 <= New)||LA56_0==VAR||LA56_0==62||LA56_0==64) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }
            switch (alt56) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:160:8: ( change )? '=' VAR
                    {
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:160:8: ( change )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( ((LA52_0 >= 65 && LA52_0 <= 66)||(LA52_0 >= 68 && LA52_0 <= 69)) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:160:8: change
                            {
                            pushFollow(FOLLOW_change_in_assign1301);
                            change196=change();

                            state._fsp--;

                            adaptor.addChild(root_0, change196.getTree());

                            }
                            break;

                    }


                    char_literal197=(Token)match(input,72,FOLLOW_72_in_assign1303); 
                    char_literal197_tree = 
                    (Object)adaptor.create(char_literal197)
                    ;
                    adaptor.addChild(root_0, char_literal197_tree);


                    VAR198=(Token)match(input,VAR,FOLLOW_VAR_in_assign1306); 
                    VAR198_tree = 
                    (Object)adaptor.create(VAR198)
                    ;
                    adaptor.addChild(root_0, VAR198_tree);


                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:160:26: ( New )? ( '*' )? ( generalArithExpr | initialize_2 )
                    {
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:160:26: ( New )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==New) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:160:26: New
                            {
                            New199=(Token)match(input,New,FOLLOW_New_in_assign1310); 
                            New199_tree = 
                            (Object)adaptor.create(New199)
                            ;
                            adaptor.addChild(root_0, New199_tree);


                            }
                            break;

                    }


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:160:31: ( '*' )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==64) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:160:32: '*'
                            {
                            char_literal200=(Token)match(input,64,FOLLOW_64_in_assign1314); 
                            char_literal200_tree = 
                            (Object)adaptor.create(char_literal200)
                            ;
                            adaptor.addChild(root_0, char_literal200_tree);


                            }
                            break;

                    }


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:160:38: ( generalArithExpr | initialize_2 )
                    int alt55=2;
                    switch ( input.LA(1) ) {
                    case VAR:
                        {
                        int LA55_1 = input.LA(2);

                        if ( (LA55_1==62) ) {
                            alt55=2;
                        }
                        else if ( (LA55_1==Minus||LA55_1==Plus||LA55_1==SEMICOLON||LA55_1==64||LA55_1==70) ) {
                            alt55=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 55, 1, input);

                            throw nvae;

                        }
                        }
                        break;
                    case DNUM:
                    case Fun:
                    case Minus:
                    case NUM:
                    case 62:
                        {
                        alt55=1;
                        }
                        break;
                    case Dot:
                        {
                        alt55=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;

                    }

                    switch (alt55) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:160:40: generalArithExpr
                            {
                            pushFollow(FOLLOW_generalArithExpr_in_assign1320);
                            generalArithExpr201=generalArithExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, generalArithExpr201.getTree());

                            }
                            break;
                        case 2 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:160:58: initialize_2
                            {
                            pushFollow(FOLLOW_initialize_2_in_assign1323);
                            initialize_2202=initialize_2();

                            state._fsp--;

                            adaptor.addChild(root_0, initialize_2202.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            SEMICOLON203=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assign1327); 
            SEMICOLON203_tree = 
            (Object)adaptor.create(SEMICOLON203)
            ;
            adaptor.addChild(root_0, SEMICOLON203_tree);


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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:162:1: change : ( '++' | '--' | ( '+=' | '-=' ) generalArithExpr ) ;
    public final ArithmeticExpressionsParser.change_return change() throws RecognitionException {
        ArithmeticExpressionsParser.change_return retval = new ArithmeticExpressionsParser.change_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal204=null;
        Token string_literal205=null;
        Token set206=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr207 =null;


        Object string_literal204_tree=null;
        Object string_literal205_tree=null;
        Object set206_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:162:8: ( ( '++' | '--' | ( '+=' | '-=' ) generalArithExpr ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:163:2: ( '++' | '--' | ( '+=' | '-=' ) generalArithExpr )
            {
            root_0 = (Object)adaptor.nil();


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:163:2: ( '++' | '--' | ( '+=' | '-=' ) generalArithExpr )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt57=1;
                }
                break;
            case 68:
                {
                alt57=2;
                }
                break;
            case 66:
            case 69:
                {
                alt57=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }

            switch (alt57) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:163:3: '++'
                    {
                    string_literal204=(Token)match(input,65,FOLLOW_65_in_change1339); 
                    string_literal204_tree = 
                    (Object)adaptor.create(string_literal204)
                    ;
                    adaptor.addChild(root_0, string_literal204_tree);


                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:163:8: '--'
                    {
                    string_literal205=(Token)match(input,68,FOLLOW_68_in_change1341); 
                    string_literal205_tree = 
                    (Object)adaptor.create(string_literal205)
                    ;
                    adaptor.addChild(root_0, string_literal205_tree);


                    }
                    break;
                case 3 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:163:13: ( '+=' | '-=' ) generalArithExpr
                    {
                    set206=(Token)input.LT(1);

                    if ( input.LA(1)==66||input.LA(1)==69 ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set206)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_generalArithExpr_in_change1348);
                    generalArithExpr207=generalArithExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, generalArithExpr207.getTree());

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


    public static class op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "op"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:165:1: op : ( Plus | Minus );
    public final ArithmeticExpressionsParser.op_return op() throws RecognitionException {
        ArithmeticExpressionsParser.op_return retval = new ArithmeticExpressionsParser.op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set208=null;

        Object set208_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:165:4: ( Plus | Minus )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:
            {
            root_0 = (Object)adaptor.nil();


            set208=(Token)input.LT(1);

            if ( input.LA(1)==Minus||input.LA(1)==Plus ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set208)
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
    // $ANTLR end "op"


    public static class init_1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_1"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:166:2: init_1 : var_num '=' 'this' '.' VAR '(' ( VAR | NUM )? ')' ( SEMICOLON )? ;
    public final ArithmeticExpressionsParser.init_1_return init_1() throws RecognitionException {
        ArithmeticExpressionsParser.init_1_return retval = new ArithmeticExpressionsParser.init_1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal210=null;
        Token string_literal211=null;
        Token char_literal212=null;
        Token VAR213=null;
        Token char_literal214=null;
        Token set215=null;
        Token char_literal216=null;
        Token SEMICOLON217=null;
        ArithmeticExpressionsParser.var_num_return var_num209 =null;


        Object char_literal210_tree=null;
        Object string_literal211_tree=null;
        Object char_literal212_tree=null;
        Object VAR213_tree=null;
        Object char_literal214_tree=null;
        Object set215_tree=null;
        Object char_literal216_tree=null;
        Object SEMICOLON217_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:166:9: ( var_num '=' 'this' '.' VAR '(' ( VAR | NUM )? ')' ( SEMICOLON )? )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:166:10: var_num '=' 'this' '.' VAR '(' ( VAR | NUM )? ')' ( SEMICOLON )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_var_num_in_init_11367);
            var_num209=var_num();

            state._fsp--;

            adaptor.addChild(root_0, var_num209.getTree());

            char_literal210=(Token)match(input,72,FOLLOW_72_in_init_11369); 
            char_literal210_tree = 
            (Object)adaptor.create(char_literal210)
            ;
            adaptor.addChild(root_0, char_literal210_tree);


            string_literal211=(Token)match(input,82,FOLLOW_82_in_init_11371); 
            string_literal211_tree = 
            (Object)adaptor.create(string_literal211)
            ;
            adaptor.addChild(root_0, string_literal211_tree);


            char_literal212=(Token)match(input,Dot,FOLLOW_Dot_in_init_11373); 
            char_literal212_tree = 
            (Object)adaptor.create(char_literal212)
            ;
            adaptor.addChild(root_0, char_literal212_tree);


            VAR213=(Token)match(input,VAR,FOLLOW_VAR_in_init_11375); 
            VAR213_tree = 
            (Object)adaptor.create(VAR213)
            ;
            adaptor.addChild(root_0, VAR213_tree);


            char_literal214=(Token)match(input,62,FOLLOW_62_in_init_11377); 
            char_literal214_tree = 
            (Object)adaptor.create(char_literal214)
            ;
            adaptor.addChild(root_0, char_literal214_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:166:41: ( VAR | NUM )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==NUM||LA58_0==VAR) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:
                    {
                    set215=(Token)input.LT(1);

                    if ( input.LA(1)==NUM||input.LA(1)==VAR ) {
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
                    break;

            }


            char_literal216=(Token)match(input,63,FOLLOW_63_in_init_11385); 
            char_literal216_tree = 
            (Object)adaptor.create(char_literal216)
            ;
            adaptor.addChild(root_0, char_literal216_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:166:55: ( SEMICOLON )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==SEMICOLON) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:166:55: SEMICOLON
                    {
                    SEMICOLON217=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_init_11387); 
                    SEMICOLON217_tree = 
                    (Object)adaptor.create(SEMICOLON217)
                    ;
                    adaptor.addChild(root_0, SEMICOLON217_tree);


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
    // $ANTLR end "init_1"


    public static class init_2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_2"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:167:2: init_2 : types var_num ( SEMICOLON )? ;
    public final ArithmeticExpressionsParser.init_2_return init_2() throws RecognitionException {
        ArithmeticExpressionsParser.init_2_return retval = new ArithmeticExpressionsParser.init_2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMICOLON220=null;
        ArithmeticExpressionsParser.types_return types218 =null;

        ArithmeticExpressionsParser.var_num_return var_num219 =null;


        Object SEMICOLON220_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:167:9: ( types var_num ( SEMICOLON )? )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:167:10: types var_num ( SEMICOLON )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_types_in_init_21395);
            types218=types();

            state._fsp--;

            adaptor.addChild(root_0, types218.getTree());

            pushFollow(FOLLOW_var_num_in_init_21397);
            var_num219=var_num();

            state._fsp--;

            adaptor.addChild(root_0, var_num219.getTree());

            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:167:24: ( SEMICOLON )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==SEMICOLON) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:167:24: SEMICOLON
                    {
                    SEMICOLON220=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_init_21399); 
                    SEMICOLON220_tree = 
                    (Object)adaptor.create(SEMICOLON220)
                    ;
                    adaptor.addChild(root_0, SEMICOLON220_tree);


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
    // $ANTLR end "init_2"


    public static class init_3_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_3"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:168:2: init_3 : types '[' ']' var_num ( SEMICOLON )? ;
    public final ArithmeticExpressionsParser.init_3_return init_3() throws RecognitionException {
        ArithmeticExpressionsParser.init_3_return retval = new ArithmeticExpressionsParser.init_3_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal222=null;
        Token char_literal223=null;
        Token SEMICOLON225=null;
        ArithmeticExpressionsParser.types_return types221 =null;

        ArithmeticExpressionsParser.var_num_return var_num224 =null;


        Object char_literal222_tree=null;
        Object char_literal223_tree=null;
        Object SEMICOLON225_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:168:9: ( types '[' ']' var_num ( SEMICOLON )? )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:168:10: types '[' ']' var_num ( SEMICOLON )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_types_in_init_31407);
            types221=types();

            state._fsp--;

            adaptor.addChild(root_0, types221.getTree());

            char_literal222=(Token)match(input,74,FOLLOW_74_in_init_31409); 
            char_literal222_tree = 
            (Object)adaptor.create(char_literal222)
            ;
            adaptor.addChild(root_0, char_literal222_tree);


            char_literal223=(Token)match(input,75,FOLLOW_75_in_init_31411); 
            char_literal223_tree = 
            (Object)adaptor.create(char_literal223)
            ;
            adaptor.addChild(root_0, char_literal223_tree);


            pushFollow(FOLLOW_var_num_in_init_31412);
            var_num224=var_num();

            state._fsp--;

            adaptor.addChild(root_0, var_num224.getTree());

            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:168:31: ( SEMICOLON )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==SEMICOLON) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:168:31: SEMICOLON
                    {
                    SEMICOLON225=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_init_31414); 
                    SEMICOLON225_tree = 
                    (Object)adaptor.create(SEMICOLON225)
                    ;
                    adaptor.addChild(root_0, SEMICOLON225_tree);


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
    // $ANTLR end "init_3"


    public static class init_4_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_4"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:169:2: init_4 : var_num '=' var_num op var_num ( SEMICOLON )? ;
    public final ArithmeticExpressionsParser.init_4_return init_4() throws RecognitionException {
        ArithmeticExpressionsParser.init_4_return retval = new ArithmeticExpressionsParser.init_4_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal227=null;
        Token SEMICOLON231=null;
        ArithmeticExpressionsParser.var_num_return var_num226 =null;

        ArithmeticExpressionsParser.var_num_return var_num228 =null;

        ArithmeticExpressionsParser.op_return op229 =null;

        ArithmeticExpressionsParser.var_num_return var_num230 =null;


        Object char_literal227_tree=null;
        Object SEMICOLON231_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:169:9: ( var_num '=' var_num op var_num ( SEMICOLON )? )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:169:10: var_num '=' var_num op var_num ( SEMICOLON )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_var_num_in_init_41422);
            var_num226=var_num();

            state._fsp--;

            adaptor.addChild(root_0, var_num226.getTree());

            char_literal227=(Token)match(input,72,FOLLOW_72_in_init_41424); 
            char_literal227_tree = 
            (Object)adaptor.create(char_literal227)
            ;
            adaptor.addChild(root_0, char_literal227_tree);


            pushFollow(FOLLOW_var_num_in_init_41425);
            var_num228=var_num();

            state._fsp--;

            adaptor.addChild(root_0, var_num228.getTree());

            pushFollow(FOLLOW_op_in_init_41427);
            op229=op();

            state._fsp--;

            adaptor.addChild(root_0, op229.getTree());

            pushFollow(FOLLOW_var_num_in_init_41429);
            var_num230=var_num();

            state._fsp--;

            adaptor.addChild(root_0, var_num230.getTree());

            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:169:40: ( SEMICOLON )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==SEMICOLON) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:169:40: SEMICOLON
                    {
                    SEMICOLON231=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_init_41431); 
                    SEMICOLON231_tree = 
                    (Object)adaptor.create(SEMICOLON231)
                    ;
                    adaptor.addChild(root_0, SEMICOLON231_tree);


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
    // $ANTLR end "init_4"


    public static class init_5_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_5"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:171:2: init_5 : var_num '=' var_num ( SEMICOLON )? ;
    public final ArithmeticExpressionsParser.init_5_return init_5() throws RecognitionException {
        ArithmeticExpressionsParser.init_5_return retval = new ArithmeticExpressionsParser.init_5_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal233=null;
        Token SEMICOLON235=null;
        ArithmeticExpressionsParser.var_num_return var_num232 =null;

        ArithmeticExpressionsParser.var_num_return var_num234 =null;


        Object char_literal233_tree=null;
        Object SEMICOLON235_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:171:9: ( var_num '=' var_num ( SEMICOLON )? )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:171:10: var_num '=' var_num ( SEMICOLON )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_var_num_in_init_51441);
            var_num232=var_num();

            state._fsp--;

            adaptor.addChild(root_0, var_num232.getTree());

            char_literal233=(Token)match(input,72,FOLLOW_72_in_init_51443); 
            char_literal233_tree = 
            (Object)adaptor.create(char_literal233)
            ;
            adaptor.addChild(root_0, char_literal233_tree);


            pushFollow(FOLLOW_var_num_in_init_51445);
            var_num234=var_num();

            state._fsp--;

            adaptor.addChild(root_0, var_num234.getTree());

            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:171:30: ( SEMICOLON )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==SEMICOLON) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:171:30: SEMICOLON
                    {
                    SEMICOLON235=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_init_51447); 
                    SEMICOLON235_tree = 
                    (Object)adaptor.create(SEMICOLON235)
                    ;
                    adaptor.addChild(root_0, SEMICOLON235_tree);


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
    // $ANTLR end "init_5"


    public static class init_6_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_6"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:172:2: init_6 : var_num '[' var_num ']' '=' var_num op var_num ( SEMICOLON )? ;
    public final ArithmeticExpressionsParser.init_6_return init_6() throws RecognitionException {
        ArithmeticExpressionsParser.init_6_return retval = new ArithmeticExpressionsParser.init_6_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal237=null;
        Token char_literal239=null;
        Token char_literal240=null;
        Token SEMICOLON244=null;
        ArithmeticExpressionsParser.var_num_return var_num236 =null;

        ArithmeticExpressionsParser.var_num_return var_num238 =null;

        ArithmeticExpressionsParser.var_num_return var_num241 =null;

        ArithmeticExpressionsParser.op_return op242 =null;

        ArithmeticExpressionsParser.var_num_return var_num243 =null;


        Object char_literal237_tree=null;
        Object char_literal239_tree=null;
        Object char_literal240_tree=null;
        Object SEMICOLON244_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:172:9: ( var_num '[' var_num ']' '=' var_num op var_num ( SEMICOLON )? )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:172:10: var_num '[' var_num ']' '=' var_num op var_num ( SEMICOLON )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_var_num_in_init_61456);
            var_num236=var_num();

            state._fsp--;

            adaptor.addChild(root_0, var_num236.getTree());

            char_literal237=(Token)match(input,74,FOLLOW_74_in_init_61458); 
            char_literal237_tree = 
            (Object)adaptor.create(char_literal237)
            ;
            adaptor.addChild(root_0, char_literal237_tree);


            pushFollow(FOLLOW_var_num_in_init_61459);
            var_num238=var_num();

            state._fsp--;

            adaptor.addChild(root_0, var_num238.getTree());

            char_literal239=(Token)match(input,75,FOLLOW_75_in_init_61461); 
            char_literal239_tree = 
            (Object)adaptor.create(char_literal239)
            ;
            adaptor.addChild(root_0, char_literal239_tree);


            char_literal240=(Token)match(input,72,FOLLOW_72_in_init_61462); 
            char_literal240_tree = 
            (Object)adaptor.create(char_literal240)
            ;
            adaptor.addChild(root_0, char_literal240_tree);


            pushFollow(FOLLOW_var_num_in_init_61463);
            var_num241=var_num();

            state._fsp--;

            adaptor.addChild(root_0, var_num241.getTree());

            pushFollow(FOLLOW_op_in_init_61465);
            op242=op();

            state._fsp--;

            adaptor.addChild(root_0, op242.getTree());

            pushFollow(FOLLOW_var_num_in_init_61467);
            var_num243=var_num();

            state._fsp--;

            adaptor.addChild(root_0, var_num243.getTree());

            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:172:54: ( SEMICOLON )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==SEMICOLON) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:172:54: SEMICOLON
                    {
                    SEMICOLON244=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_init_61469); 
                    SEMICOLON244_tree = 
                    (Object)adaptor.create(SEMICOLON244)
                    ;
                    adaptor.addChild(root_0, SEMICOLON244_tree);


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
    // $ANTLR end "init_6"


    public static class var_num_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var_num"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:173:1: var_num : ( VAR | NUM );
    public final ArithmeticExpressionsParser.var_num_return var_num() throws RecognitionException {
        ArithmeticExpressionsParser.var_num_return retval = new ArithmeticExpressionsParser.var_num_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set245=null;

        Object set245_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:173:8: ( VAR | NUM )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:
            {
            root_0 = (Object)adaptor.nil();


            set245=(Token)input.LT(1);

            if ( input.LA(1)==NUM||input.LA(1)==VAR ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set245)
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
    // $ANTLR end "var_num"


    public static class big_init_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "big_init"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:175:2: big_init : ( init_1 | init_2 | init_3 | init_4 | init_5 | init_6 );
    public final ArithmeticExpressionsParser.big_init_return big_init() throws RecognitionException {
        ArithmeticExpressionsParser.big_init_return retval = new ArithmeticExpressionsParser.big_init_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.init_1_return init_1246 =null;

        ArithmeticExpressionsParser.init_2_return init_2247 =null;

        ArithmeticExpressionsParser.init_3_return init_3248 =null;

        ArithmeticExpressionsParser.init_4_return init_4249 =null;

        ArithmeticExpressionsParser.init_5_return init_5250 =null;

        ArithmeticExpressionsParser.init_6_return init_6251 =null;



        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:176:3: ( init_1 | init_2 | init_3 | init_4 | init_5 | init_6 )
            int alt65=6;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==NUM||LA65_0==VAR) ) {
                int LA65_1 = input.LA(2);

                if ( (LA65_1==72) ) {
                    int LA65_3 = input.LA(3);

                    if ( (LA65_3==82) ) {
                        alt65=1;
                    }
                    else if ( (LA65_3==NUM||LA65_3==VAR) ) {
                        int LA65_8 = input.LA(4);

                        if ( (LA65_8==Minus||LA65_8==Plus) ) {
                            alt65=4;
                        }
                        else if ( (LA65_8==BOOLEAN||LA65_8==Br_close||LA65_8==DOUBLE||LA65_8==INT||(LA65_8 >= Modifier && LA65_8 <= NUM)||LA65_8==SEMICOLON||LA65_8==STRING||LA65_8==System||LA65_8==VAR||(LA65_8 >= 79 && LA65_8 <= 81)||LA65_8==83) ) {
                            alt65=5;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 3, input);

                        throw nvae;

                    }
                }
                else if ( (LA65_1==74) ) {
                    alt65=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA65_0==BOOLEAN||LA65_0==DOUBLE||LA65_0==INT||LA65_0==STRING) ) {
                int LA65_2 = input.LA(2);

                if ( (LA65_2==NUM||LA65_2==VAR) ) {
                    alt65=2;
                }
                else if ( (LA65_2==74) ) {
                    alt65=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }
            switch (alt65) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:176:4: init_1
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_init_1_in_big_init1488);
                    init_1246=init_1();

                    state._fsp--;

                    adaptor.addChild(root_0, init_1246.getTree());

                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:176:11: init_2
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_init_2_in_big_init1490);
                    init_2247=init_2();

                    state._fsp--;

                    adaptor.addChild(root_0, init_2247.getTree());

                    }
                    break;
                case 3 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:176:18: init_3
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_init_3_in_big_init1492);
                    init_3248=init_3();

                    state._fsp--;

                    adaptor.addChild(root_0, init_3248.getTree());

                    }
                    break;
                case 4 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:176:25: init_4
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_init_4_in_big_init1494);
                    init_4249=init_4();

                    state._fsp--;

                    adaptor.addChild(root_0, init_4249.getTree());

                    }
                    break;
                case 5 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:176:32: init_5
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_init_5_in_big_init1496);
                    init_5250=init_5();

                    state._fsp--;

                    adaptor.addChild(root_0, init_5250.getTree());

                    }
                    break;
                case 6 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:176:39: init_6
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_init_6_in_big_init1498);
                    init_6251=init_6();

                    state._fsp--;

                    adaptor.addChild(root_0, init_6251.getTree());

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
    // $ANTLR end "big_init"


    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:180:1: condition : generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? -> ^( Condition generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? ) ;
    public final ArithmeticExpressionsParser.condition_return condition() throws RecognitionException {
        ArithmeticExpressionsParser.condition_return retval = new ArithmeticExpressionsParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RelationalOperators253=null;
        Token AndOr255=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr252 =null;

        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr254 =null;

        ArithmeticExpressionsParser.condition_return condition256 =null;


        Object RelationalOperators253_tree=null;
        Object AndOr255_tree=null;
        RewriteRuleTokenStream stream_RelationalOperators=new RewriteRuleTokenStream(adaptor,"token RelationalOperators");
        RewriteRuleTokenStream stream_AndOr=new RewriteRuleTokenStream(adaptor,"token AndOr");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_generalArithExpr=new RewriteRuleSubtreeStream(adaptor,"rule generalArithExpr");
        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:180:10: ( generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? -> ^( Condition generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:181:2: generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )?
            {
            pushFollow(FOLLOW_generalArithExpr_in_condition1511);
            generalArithExpr252=generalArithExpr();

            state._fsp--;

            stream_generalArithExpr.add(generalArithExpr252.getTree());

            RelationalOperators253=(Token)match(input,RelationalOperators,FOLLOW_RelationalOperators_in_condition1513);  
            stream_RelationalOperators.add(RelationalOperators253);


            pushFollow(FOLLOW_generalArithExpr_in_condition1515);
            generalArithExpr254=generalArithExpr();

            state._fsp--;

            stream_generalArithExpr.add(generalArithExpr254.getTree());

            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:181:56: ( AndOr condition )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==AndOr) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:181:57: AndOr condition
                    {
                    AndOr255=(Token)match(input,AndOr,FOLLOW_AndOr_in_condition1518);  
                    stream_AndOr.add(AndOr255);


                    pushFollow(FOLLOW_condition_in_condition1520);
                    condition256=condition();

                    state._fsp--;

                    stream_condition.add(condition256.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: generalArithExpr, generalArithExpr, RelationalOperators, AndOr, condition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 182:2: -> ^( Condition generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? )
            {
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:182:4: ^( Condition generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? )
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

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:182:70: ( AndOr condition )?
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:189:1: int_dec : ( Modifier )? INT VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON ;
    public final ArithmeticExpressionsParser.int_dec_return int_dec() throws RecognitionException {
        ArithmeticExpressionsParser.int_dec_return retval = new ArithmeticExpressionsParser.int_dec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier257=null;
        Token INT258=null;
        Token VAR259=null;
        Token char_literal260=null;
        Token char_literal262=null;
        Token VAR263=null;
        Token SEMICOLON264=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr261 =null;


        Object Modifier257_tree=null;
        Object INT258_tree=null;
        Object VAR259_tree=null;
        Object char_literal260_tree=null;
        Object char_literal262_tree=null;
        Object VAR263_tree=null;
        Object SEMICOLON264_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:189:9: ( ( Modifier )? INT VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:191:2: ( Modifier )? INT VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:191:2: ( Modifier )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==Modifier) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:191:2: Modifier
                    {
                    Modifier257=(Token)match(input,Modifier,FOLLOW_Modifier_in_int_dec1579); 
                    Modifier257_tree = 
                    (Object)adaptor.create(Modifier257)
                    ;
                    adaptor.addChild(root_0, Modifier257_tree);


                    }
                    break;

            }


            INT258=(Token)match(input,INT,FOLLOW_INT_in_int_dec1582); 
            INT258_tree = 
            (Object)adaptor.create(INT258)
            ;
            adaptor.addChild(root_0, INT258_tree);


            VAR259=(Token)match(input,VAR,FOLLOW_VAR_in_int_dec1584); 
            VAR259_tree = 
            (Object)adaptor.create(VAR259)
            ;
            adaptor.addChild(root_0, VAR259_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:191:20: ( ( '=' generalArithExpr )? | ( ',' VAR )* )
            int alt70=2;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt70=1;
                }
                break;
            case SEMICOLON:
                {
                alt70=1;
                }
                break;
            case 67:
                {
                alt70=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;

            }

            switch (alt70) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:191:21: ( '=' generalArithExpr )?
                    {
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:191:21: ( '=' generalArithExpr )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==72) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:191:22: '=' generalArithExpr
                            {
                            char_literal260=(Token)match(input,72,FOLLOW_72_in_int_dec1588); 
                            char_literal260_tree = 
                            (Object)adaptor.create(char_literal260)
                            ;
                            adaptor.addChild(root_0, char_literal260_tree);


                            pushFollow(FOLLOW_generalArithExpr_in_int_dec1590);
                            generalArithExpr261=generalArithExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, generalArithExpr261.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:191:45: ( ',' VAR )*
                    {
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:191:45: ( ',' VAR )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==67) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:191:46: ',' VAR
                    	    {
                    	    char_literal262=(Token)match(input,67,FOLLOW_67_in_int_dec1595); 
                    	    char_literal262_tree = 
                    	    (Object)adaptor.create(char_literal262)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal262_tree);


                    	    VAR263=(Token)match(input,VAR,FOLLOW_VAR_in_int_dec1597); 
                    	    VAR263_tree = 
                    	    (Object)adaptor.create(VAR263)
                    	    ;
                    	    adaptor.addChild(root_0, VAR263_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);


                    }
                    break;

            }


            SEMICOLON264=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_int_dec1602); 
            SEMICOLON264_tree = 
            (Object)adaptor.create(SEMICOLON264)
            ;
            adaptor.addChild(root_0, SEMICOLON264_tree);


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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:194:1: double_dec : ( Modifier )? DOUBLE VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON ;
    public final ArithmeticExpressionsParser.double_dec_return double_dec() throws RecognitionException {
        ArithmeticExpressionsParser.double_dec_return retval = new ArithmeticExpressionsParser.double_dec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier265=null;
        Token DOUBLE266=null;
        Token VAR267=null;
        Token char_literal268=null;
        Token char_literal270=null;
        Token VAR271=null;
        Token SEMICOLON272=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr269 =null;


        Object Modifier265_tree=null;
        Object DOUBLE266_tree=null;
        Object VAR267_tree=null;
        Object char_literal268_tree=null;
        Object char_literal270_tree=null;
        Object VAR271_tree=null;
        Object SEMICOLON272_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:194:11: ( ( Modifier )? DOUBLE VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:196:2: ( Modifier )? DOUBLE VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:196:2: ( Modifier )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==Modifier) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:196:2: Modifier
                    {
                    Modifier265=(Token)match(input,Modifier,FOLLOW_Modifier_in_double_dec1617); 
                    Modifier265_tree = 
                    (Object)adaptor.create(Modifier265)
                    ;
                    adaptor.addChild(root_0, Modifier265_tree);


                    }
                    break;

            }


            DOUBLE266=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_double_dec1620); 
            DOUBLE266_tree = 
            (Object)adaptor.create(DOUBLE266)
            ;
            adaptor.addChild(root_0, DOUBLE266_tree);


            VAR267=(Token)match(input,VAR,FOLLOW_VAR_in_double_dec1622); 
            VAR267_tree = 
            (Object)adaptor.create(VAR267)
            ;
            adaptor.addChild(root_0, VAR267_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:196:23: ( ( '=' generalArithExpr )? | ( ',' VAR )* )
            int alt74=2;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt74=1;
                }
                break;
            case SEMICOLON:
                {
                alt74=1;
                }
                break;
            case 67:
                {
                alt74=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;

            }

            switch (alt74) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:196:24: ( '=' generalArithExpr )?
                    {
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:196:24: ( '=' generalArithExpr )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==72) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:196:25: '=' generalArithExpr
                            {
                            char_literal268=(Token)match(input,72,FOLLOW_72_in_double_dec1626); 
                            char_literal268_tree = 
                            (Object)adaptor.create(char_literal268)
                            ;
                            adaptor.addChild(root_0, char_literal268_tree);


                            pushFollow(FOLLOW_generalArithExpr_in_double_dec1628);
                            generalArithExpr269=generalArithExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, generalArithExpr269.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:196:48: ( ',' VAR )*
                    {
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:196:48: ( ',' VAR )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==67) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:196:49: ',' VAR
                    	    {
                    	    char_literal270=(Token)match(input,67,FOLLOW_67_in_double_dec1633); 
                    	    char_literal270_tree = 
                    	    (Object)adaptor.create(char_literal270)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal270_tree);


                    	    VAR271=(Token)match(input,VAR,FOLLOW_VAR_in_double_dec1635); 
                    	    VAR271_tree = 
                    	    (Object)adaptor.create(VAR271)
                    	    ;
                    	    adaptor.addChild(root_0, VAR271_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);


                    }
                    break;

            }


            SEMICOLON272=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_double_dec1640); 
            SEMICOLON272_tree = 
            (Object)adaptor.create(SEMICOLON272)
            ;
            adaptor.addChild(root_0, SEMICOLON272_tree);


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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:199:1: string_dec : ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON -> ^( String_Dec ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON ) ;
    public final ArithmeticExpressionsParser.string_dec_return string_dec() throws RecognitionException {
        ArithmeticExpressionsParser.string_dec_return retval = new ArithmeticExpressionsParser.string_dec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier273=null;
        Token STRING274=null;
        Token VAR275=null;
        Token char_literal276=null;
        Token Strings277=null;
        Token SEMICOLON278=null;

        Object Modifier273_tree=null;
        Object STRING274_tree=null;
        Object VAR275_tree=null;
        Object char_literal276_tree=null;
        Object Strings277_tree=null;
        Object SEMICOLON278_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_Modifier=new RewriteRuleTokenStream(adaptor,"token Modifier");
        RewriteRuleTokenStream stream_Strings=new RewriteRuleTokenStream(adaptor,"token Strings");

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:199:11: ( ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON -> ^( String_Dec ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:201:2: ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON
            {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:201:2: ( Modifier )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==Modifier) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:201:2: Modifier
                    {
                    Modifier273=(Token)match(input,Modifier,FOLLOW_Modifier_in_string_dec1653);  
                    stream_Modifier.add(Modifier273);


                    }
                    break;

            }


            STRING274=(Token)match(input,STRING,FOLLOW_STRING_in_string_dec1656);  
            stream_STRING.add(STRING274);


            VAR275=(Token)match(input,VAR,FOLLOW_VAR_in_string_dec1658);  
            stream_VAR.add(VAR275);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:201:23: ( '=' Strings )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==72) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:201:24: '=' Strings
                    {
                    char_literal276=(Token)match(input,72,FOLLOW_72_in_string_dec1661);  
                    stream_72.add(char_literal276);


                    Strings277=(Token)match(input,Strings,FOLLOW_Strings_in_string_dec1663);  
                    stream_Strings.add(Strings277);


                    }
                    break;

            }


            SEMICOLON278=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_string_dec1667);  
            stream_SEMICOLON.add(SEMICOLON278);


            // AST REWRITE
            // elements: Modifier, Strings, STRING, 72, SEMICOLON, VAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 202:3: -> ^( String_Dec ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON )
            {
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:202:6: ^( String_Dec ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(String_Dec, "String_Dec")
                , root_1);

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:202:19: ( Modifier )?
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

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:202:40: ( '=' Strings )?
                if ( stream_Strings.hasNext()||stream_72.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_72.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_Strings.nextNode()
                    );

                }
                stream_Strings.reset();
                stream_72.reset();

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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:204:1: generalArithExpr : term ( ( '+' | '-' ) ^ term )* ;
    public final ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr() throws RecognitionException {
        ArithmeticExpressionsParser.generalArithExpr_return retval = new ArithmeticExpressionsParser.generalArithExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set280=null;
        ArithmeticExpressionsParser.term_return term279 =null;

        ArithmeticExpressionsParser.term_return term281 =null;


        Object set280_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:204:17: ( term ( ( '+' | '-' ) ^ term )* )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:204:19: term ( ( '+' | '-' ) ^ term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_generalArithExpr1699);
            term279=term();

            state._fsp--;

            adaptor.addChild(root_0, term279.getTree());

            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:204:24: ( ( '+' | '-' ) ^ term )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==Minus||LA77_0==Plus) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:204:25: ( '+' | '-' ) ^ term
            	    {
            	    set280=(Token)input.LT(1);

            	    set280=(Token)input.LT(1);

            	    if ( input.LA(1)==Minus||input.LA(1)==Plus ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set280)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_term_in_generalArithExpr1714);
            	    term281=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term281.getTree());

            	    }
            	    break;

            	default :
            	    break loop77;
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:212:1: term : factor ( ( '*' | '/' ) ^ factor )* ;
    public final ArithmeticExpressionsParser.term_return term() throws RecognitionException {
        ArithmeticExpressionsParser.term_return retval = new ArithmeticExpressionsParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set283=null;
        ArithmeticExpressionsParser.factor_return factor282 =null;

        ArithmeticExpressionsParser.factor_return factor284 =null;


        Object set283_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:212:6: ( factor ( ( '*' | '/' ) ^ factor )* )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:212:8: factor ( ( '*' | '/' ) ^ factor )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1752);
            factor282=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor282.getTree());

            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:212:15: ( ( '*' | '/' ) ^ factor )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==64||LA78_0==70) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:212:17: ( '*' | '/' ) ^ factor
            	    {
            	    set283=(Token)input.LT(1);

            	    set283=(Token)input.LT(1);

            	    if ( input.LA(1)==64||input.LA(1)==70 ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set283)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_factor_in_term1768);
            	    factor284=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor284.getTree());

            	    }
            	    break;

            	default :
            	    break loop78;
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
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:220:1: factor : ( VAR -> ^( Factor VAR ) | NUM -> ^( Factor NUM ) | DNUM -> ^( Factor DOUBLE ) | '-' VAR -> ^( Factor '-' VAR ) | '-' INT -> ^( Factor '-' INT ) | '-' DNUM -> ^( Factor '-' DOUBLE ) | '(' generalArithExpr ')' -> ^( Factor '(' generalArithExpr ')' ) | Fun '(' generalArithExpr ')' -> ^( Factor Fun '(' generalArithExpr ')' ) );
    public final ArithmeticExpressionsParser.factor_return factor() throws RecognitionException {
        ArithmeticExpressionsParser.factor_return retval = new ArithmeticExpressionsParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR285=null;
        Token NUM286=null;
        Token DNUM287=null;
        Token char_literal288=null;
        Token VAR289=null;
        Token char_literal290=null;
        Token INT291=null;
        Token char_literal292=null;
        Token DNUM293=null;
        Token char_literal294=null;
        Token char_literal296=null;
        Token Fun297=null;
        Token char_literal298=null;
        Token char_literal300=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr295 =null;

        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr299 =null;


        Object VAR285_tree=null;
        Object NUM286_tree=null;
        Object DNUM287_tree=null;
        Object char_literal288_tree=null;
        Object VAR289_tree=null;
        Object char_literal290_tree=null;
        Object INT291_tree=null;
        Object char_literal292_tree=null;
        Object DNUM293_tree=null;
        Object char_literal294_tree=null;
        Object char_literal296_tree=null;
        Object Fun297_tree=null;
        Object char_literal298_tree=null;
        Object char_literal300_tree=null;
        RewriteRuleTokenStream stream_DNUM=new RewriteRuleTokenStream(adaptor,"token DNUM");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_Minus=new RewriteRuleTokenStream(adaptor,"token Minus");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_Fun=new RewriteRuleTokenStream(adaptor,"token Fun");
        RewriteRuleSubtreeStream stream_generalArithExpr=new RewriteRuleSubtreeStream(adaptor,"rule generalArithExpr");
        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:220:8: ( VAR -> ^( Factor VAR ) | NUM -> ^( Factor NUM ) | DNUM -> ^( Factor DOUBLE ) | '-' VAR -> ^( Factor '-' VAR ) | '-' INT -> ^( Factor '-' INT ) | '-' DNUM -> ^( Factor '-' DOUBLE ) | '(' generalArithExpr ')' -> ^( Factor '(' generalArithExpr ')' ) | Fun '(' generalArithExpr ')' -> ^( Factor Fun '(' generalArithExpr ')' ) )
            int alt79=8;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt79=1;
                }
                break;
            case NUM:
                {
                alt79=2;
                }
                break;
            case DNUM:
                {
                alt79=3;
                }
                break;
            case Minus:
                {
                switch ( input.LA(2) ) {
                case VAR:
                    {
                    alt79=4;
                    }
                    break;
                case INT:
                    {
                    alt79=5;
                    }
                    break;
                case DNUM:
                    {
                    alt79=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 4, input);

                    throw nvae;

                }

                }
                break;
            case 62:
                {
                alt79=7;
                }
                break;
            case Fun:
                {
                alt79=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;

            }

            switch (alt79) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:221:2: VAR
                    {
                    VAR285=(Token)match(input,VAR,FOLLOW_VAR_in_factor1808);  
                    stream_VAR.add(VAR285);


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
                    // 221:6: -> ^( Factor VAR )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:221:9: ^( Factor VAR )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:222:3: NUM
                    {
                    NUM286=(Token)match(input,NUM,FOLLOW_NUM_in_factor1820);  
                    stream_NUM.add(NUM286);


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
                    // 222:7: -> ^( Factor NUM )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:222:10: ^( Factor NUM )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:223:3: DNUM
                    {
                    DNUM287=(Token)match(input,DNUM,FOLLOW_DNUM_in_factor1832);  
                    stream_DNUM.add(DNUM287);


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
                    // 223:8: -> ^( Factor DOUBLE )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:223:11: ^( Factor DOUBLE )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:224:3: '-' VAR
                    {
                    char_literal288=(Token)match(input,Minus,FOLLOW_Minus_in_factor1844);  
                    stream_Minus.add(char_literal288);


                    VAR289=(Token)match(input,VAR,FOLLOW_VAR_in_factor1847);  
                    stream_VAR.add(VAR289);


                    // AST REWRITE
                    // elements: Minus, VAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 224:12: -> ^( Factor '-' VAR )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:224:15: ^( Factor '-' VAR )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_Minus.nextNode()
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:225:3: '-' INT
                    {
                    char_literal290=(Token)match(input,Minus,FOLLOW_Minus_in_factor1862);  
                    stream_Minus.add(char_literal290);


                    INT291=(Token)match(input,INT,FOLLOW_INT_in_factor1865);  
                    stream_INT.add(INT291);


                    // AST REWRITE
                    // elements: Minus, INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 225:12: -> ^( Factor '-' INT )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:225:15: ^( Factor '-' INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_Minus.nextNode()
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:226:3: '-' DNUM
                    {
                    char_literal292=(Token)match(input,Minus,FOLLOW_Minus_in_factor1880);  
                    stream_Minus.add(char_literal292);


                    DNUM293=(Token)match(input,DNUM,FOLLOW_DNUM_in_factor1883);  
                    stream_DNUM.add(DNUM293);


                    // AST REWRITE
                    // elements: Minus
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 226:14: -> ^( Factor '-' DOUBLE )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:226:17: ^( Factor '-' DOUBLE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_Minus.nextNode()
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:227:3: '(' generalArithExpr ')'
                    {
                    char_literal294=(Token)match(input,62,FOLLOW_62_in_factor1899);  
                    stream_62.add(char_literal294);


                    pushFollow(FOLLOW_generalArithExpr_in_factor1901);
                    generalArithExpr295=generalArithExpr();

                    state._fsp--;

                    stream_generalArithExpr.add(generalArithExpr295.getTree());

                    char_literal296=(Token)match(input,63,FOLLOW_63_in_factor1903);  
                    stream_63.add(char_literal296);


                    // AST REWRITE
                    // elements: 62, 63, generalArithExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 227:28: -> ^( Factor '(' generalArithExpr ')' )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:227:31: ^( Factor '(' generalArithExpr ')' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_62.nextNode()
                        );

                        adaptor.addChild(root_1, stream_generalArithExpr.nextTree());

                        adaptor.addChild(root_1, 
                        stream_63.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:228:4: Fun '(' generalArithExpr ')'
                    {
                    Fun297=(Token)match(input,Fun,FOLLOW_Fun_in_factor1921);  
                    stream_Fun.add(Fun297);


                    char_literal298=(Token)match(input,62,FOLLOW_62_in_factor1923);  
                    stream_62.add(char_literal298);


                    pushFollow(FOLLOW_generalArithExpr_in_factor1925);
                    generalArithExpr299=generalArithExpr();

                    state._fsp--;

                    stream_generalArithExpr.add(generalArithExpr299.getTree());

                    char_literal300=(Token)match(input,63,FOLLOW_63_in_factor1927);  
                    stream_63.add(char_literal300);


                    // AST REWRITE
                    // elements: 62, generalArithExpr, Fun, 63
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 228:33: -> ^( Factor Fun '(' generalArithExpr ')' )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:228:36: ^( Factor Fun '(' generalArithExpr ')' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_Fun.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_62.nextNode()
                        );

                        adaptor.addChild(root_1, stream_generalArithExpr.nextTree());

                        adaptor.addChild(root_1, 
                        stream_63.nextNode()
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:248:1: types : ( STRING | BOOLEAN | DOUBLE | INT );
    public final ArithmeticExpressionsParser.types_return types() throws RecognitionException {
        ArithmeticExpressionsParser.types_return retval = new ArithmeticExpressionsParser.types_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set301=null;

        Object set301_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:248:7: ( STRING | BOOLEAN | DOUBLE | INT )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:
            {
            root_0 = (Object)adaptor.nil();


            set301=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEAN||input.LA(1)==DOUBLE||input.LA(1)==INT||input.LA(1)==STRING ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set301)
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


 

    public static final BitSet FOLLOW_classDec_in_startgeneralArithExpr112 = new BitSet(new long[]{0x0000002000001002L});
    public static final BitSet FOLLOW_Modifier_in_classDec157 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_Class_in_classDec160 = new BitSet(new long[]{0x0200000000000400L});
    public static final BitSet FOLLOW_VAR_in_classDec162 = new BitSet(new long[]{0x0200000000000400L});
    public static final BitSet FOLLOW_Br_open_in_classDec165 = new BitSet(new long[]{0x0240A06002020280L,0x0000000000098000L});
    public static final BitSet FOLLOW_stmt_in_classDec167 = new BitSet(new long[]{0x0240A06002020280L,0x0000000000098000L});
    public static final BitSet FOLLOW_Br_close_in_classDec170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_stmt229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_big_init_in_stmt243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_main_method_in_stmt255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestmt_in_stmt265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forloop_in_stmt277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assigment_in_stmt289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_big_if_in_stmt301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_stmt313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_dec_in_stmt325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initialize_in_stmt337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initialize_1_in_stmt349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sys_print_in_stmt362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_method412 = new BitSet(new long[]{0x4200800002020080L});
    public static final BitSet FOLLOW_types_in_method414 = new BitSet(new long[]{0x4200000000000000L});
    public static final BitSet FOLLOW_VAR_in_method417 = new BitSet(new long[]{0x4200000000000000L});
    public static final BitSet FOLLOW_params_in_method420 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_Br_open_in_method422 = new BitSet(new long[]{0x0240A06002020080L,0x00000000000B8000L});
    public static final BitSet FOLLOW_stmt_in_method424 = new BitSet(new long[]{0x0240A06002020080L,0x00000000000B8000L});
    public static final BitSet FOLLOW_81_in_method427 = new BitSet(new long[]{0x0200004000000000L});
    public static final BitSet FOLLOW_return_type_in_method429 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_method431 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_Br_close_in_method432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_main_method480 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_Static_in_main_method482 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_VOID_in_main_method484 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_Main_in_main_method486 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_main_method488 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_STRING_in_main_method489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_main_method491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_main_method492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_main_method494 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_main_method496 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_Br_open_in_main_method498 = new BitSet(new long[]{0x0040000000000200L});
    public static final BitSet FOLLOW_print_in_main_method499 = new BitSet(new long[]{0x0040000000000200L});
    public static final BitSet FOLLOW_Br_close_in_main_method501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_System_in_print536 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Dot_in_print538 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_Out_in_print540 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Dot_in_print542 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_Println_in_print544 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_print546 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_New_in_print547 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_VAR_in_print549 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_print551 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_print552 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Dot_in_print553 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_VAR_in_print555 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_print557 = new BitSet(new long[]{0x8000004000000000L});
    public static final BitSet FOLLOW_NUM_in_print558 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_print560 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_print562 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_print564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_types_in_initialize620 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_initialize622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_initialize623 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_VAR_in_initialize627 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_initialize629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_initialize631 = new BitSet(new long[]{0x0200200000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_initialize634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_initialize_1644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_initialize_1646 = new BitSet(new long[]{0x0200008000000000L});
    public static final BitSet FOLLOW_set_in_initialize_1648 = new BitSet(new long[]{0x0200000000080000L});
    public static final BitSet FOLLOW_Dot_in_initialize_1654 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_VAR_in_initialize_1657 = new BitSet(new long[]{0xC200004000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_62_in_initialize_1659 = new BitSet(new long[]{0x8200004000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_initialize_1668 = new BitSet(new long[]{0x8200004000000002L});
    public static final BitSet FOLLOW_63_in_initialize_1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_System_in_sys_print687 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Dot_in_sys_print689 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_Out_in_sys_print691 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Dot_in_sys_print693 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_Println_in_sys_print695 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_sys_print697 = new BitSet(new long[]{0x0200004000000000L});
    public static final BitSet FOLLOW_NUM_in_sys_print699 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_VAR_in_sys_print701 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Dot_in_sys_print703 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_VAR_in_sys_print705 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_sys_print707 = new BitSet(new long[]{0x8000004000000000L});
    public static final BitSet FOLLOW_NUM_in_sys_print708 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_sys_print710 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_sys_print714 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_sys_print716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ob_cho_in_object723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_object727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_object732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ob_body741 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_VAR_in_ob_body745 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Dot_in_ob_body747 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_VAR_in_ob_body749 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ob_body751 = new BitSet(new long[]{0x0200004000000000L});
    public static final BitSet FOLLOW_set_in_ob_body753 = new BitSet(new long[]{0x4200005000810000L});
    public static final BitSet FOLLOW_generalArithExpr_in_ob_body761 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ob_body764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ob_cho771 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_VAR_in_ob_cho775 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Dot_in_ob_cho777 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_VAR_in_ob_cho779 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ob_cho781 = new BitSet(new long[]{0x8200004000000000L});
    public static final BitSet FOLLOW_63_in_ob_cho791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ob_body_in_ob_cho795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_if_head810 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_if_head812 = new BitSet(new long[]{0x4200005000810000L,0x0000000000040000L});
    public static final BitSet FOLLOW_if_this_in_if_head815 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_if_op_in_if_head819 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_if_head823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_if_this833 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Dot_in_if_this834 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_VAR_in_if_this836 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_if_this838 = new BitSet(new long[]{0x0200004000000000L});
    public static final BitSet FOLLOW_var_num_in_if_this839 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_if_this842 = new BitSet(new long[]{0x0200004000000000L});
    public static final BitSet FOLLOW_var_num_in_if_this844 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_if_this848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_if_op855 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000380L});
    public static final BitSet FOLLOW_set_in_if_op858 = new BitSet(new long[]{0x4200005000810000L});
    public static final BitSet FOLLOW_term_in_if_op874 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000380L});
    public static final BitSet FOLLOW_else_b_in_if_ch886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elseif_b_in_if_ch890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_body_in_if_ch893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_else_b902 = new BitSet(new long[]{0x0240A06002020482L,0x0000000000098000L});
    public static final BitSet FOLLOW_stmt_in_else_b906 = new BitSet(new long[]{0x0240A06002020082L,0x0000000000098000L});
    public static final BitSet FOLLOW_Br_open_in_else_b913 = new BitSet(new long[]{0x0240A06002020280L,0x0000000000098000L});
    public static final BitSet FOLLOW_stmt_in_else_b917 = new BitSet(new long[]{0x0240A06002020280L,0x0000000000098000L});
    public static final BitSet FOLLOW_Br_close_in_else_b922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_elseif_b935 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_elseif_b937 = new BitSet(new long[]{0xA200004000000000L});
    public static final BitSet FOLLOW_object_in_elseif_b939 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_elseif_b941 = new BitSet(new long[]{0x0240A06002020482L,0x0000000000098000L});
    public static final BitSet FOLLOW_stmt_in_elseif_b945 = new BitSet(new long[]{0x0240A06002020082L,0x0000000000098000L});
    public static final BitSet FOLLOW_Br_open_in_elseif_b952 = new BitSet(new long[]{0x0240A06002020280L,0x0000000000098000L});
    public static final BitSet FOLLOW_stmt_in_elseif_b956 = new BitSet(new long[]{0x0240A06002020280L,0x0000000000098000L});
    public static final BitSet FOLLOW_Br_close_in_elseif_b961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_if_body974 = new BitSet(new long[]{0x0240A06002020082L,0x0000000000098000L});
    public static final BitSet FOLLOW_Br_open_in_if_body980 = new BitSet(new long[]{0x0240A06002020280L,0x0000000000098000L});
    public static final BitSet FOLLOW_stmt_in_if_body984 = new BitSet(new long[]{0x0240A06002020280L,0x0000000000098000L});
    public static final BitSet FOLLOW_Br_close_in_if_body990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_head_in_ifstmt_11003 = new BitSet(new long[]{0x0240A06002020480L,0x000000000009E000L});
    public static final BitSet FOLLOW_if_ch_in_ifstmt_11005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstmt_1_in_big_if1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_params1023 = new BitSet(new long[]{0x8200800002020080L});
    public static final BitSet FOLLOW_types_in_params1026 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_VAR_in_params1028 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_in_params1030 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_VAR_in_params1032 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_params1036 = new BitSet(new long[]{0x0000800002020080L});
    public static final BitSet FOLLOW_types_in_params1038 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_VAR_in_params1040 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_63_in_params1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_dec_in_decl1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_dec_in_decl1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_while_condition1093 = new BitSet(new long[]{0x4200005000810000L});
    public static final BitSet FOLLOW_condition_in_while_condition1095 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_while_condition1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_while_condition1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_whilestmt1108 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_whilestmt1110 = new BitSet(new long[]{0x6200004000000000L});
    public static final BitSet FOLLOW_while_condition_in_whilestmt1112 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_whilestmt1114 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_Br_open_in_whilestmt1116 = new BitSet(new long[]{0x0240A06002020080L,0x00000000000B8000L});
    public static final BitSet FOLLOW_stmt_in_whilestmt1118 = new BitSet(new long[]{0x0240A06002020080L,0x00000000000B8000L});
    public static final BitSet FOLLOW_81_in_whilestmt1122 = new BitSet(new long[]{0x0200004000000000L});
    public static final BitSet FOLLOW_return_type_in_whilestmt1124 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_whilestmt1126 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_Br_close_in_whilestmt1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_forloop1178 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_forloop1180 = new BitSet(new long[]{0x0000002002020000L});
    public static final BitSet FOLLOW_decl_in_forloop1183 = new BitSet(new long[]{0x4200005000810000L});
    public static final BitSet FOLLOW_condition_in_forloop1187 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_forloop1190 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_VAR_in_forloop1193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000036L});
    public static final BitSet FOLLOW_change_in_forloop1195 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_forloop1198 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_Br_open_in_forloop1200 = new BitSet(new long[]{0x0240A06002020280L,0x0000000000098000L});
    public static final BitSet FOLLOW_stmt_in_forloop1202 = new BitSet(new long[]{0x0240A06002020280L,0x0000000000098000L});
    public static final BitSet FOLLOW_Br_close_in_forloop1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_assigment1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Dot_in_initialize_21237 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_VAR_in_initialize_21240 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_initialize_21242 = new BitSet(new long[]{0x8200004000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_initialize_21249 = new BitSet(new long[]{0x8200004000000000L});
    public static final BitSet FOLLOW_63_in_initialize_21258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_assign1298 = new BitSet(new long[]{0x420000D000890000L,0x0000000000000137L});
    public static final BitSet FOLLOW_change_in_assign1301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_assign1303 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_VAR_in_assign1306 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_New_in_assign1310 = new BitSet(new long[]{0x4200005000890000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_assign1314 = new BitSet(new long[]{0x4200005000890000L});
    public static final BitSet FOLLOW_generalArithExpr_in_assign1320 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_initialize_2_in_assign1323 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_assign1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_change1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_change1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_change1343 = new BitSet(new long[]{0x4200005000810000L});
    public static final BitSet FOLLOW_generalArithExpr_in_change1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_num_in_init_11367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_init_11369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_init_11371 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Dot_in_init_11373 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_VAR_in_init_11375 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_init_11377 = new BitSet(new long[]{0x8200004000000000L});
    public static final BitSet FOLLOW_63_in_init_11385 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_init_11387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_types_in_init_21395 = new BitSet(new long[]{0x0200004000000000L});
    public static final BitSet FOLLOW_var_num_in_init_21397 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_init_21399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_types_in_init_31407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_init_31409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_init_31411 = new BitSet(new long[]{0x0200004000000000L});
    public static final BitSet FOLLOW_var_num_in_init_31412 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_init_31414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_num_in_init_41422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_init_41424 = new BitSet(new long[]{0x0200004000000000L});
    public static final BitSet FOLLOW_var_num_in_init_41425 = new BitSet(new long[]{0x0000021000000000L});
    public static final BitSet FOLLOW_op_in_init_41427 = new BitSet(new long[]{0x0200004000000000L});
    public static final BitSet FOLLOW_var_num_in_init_41429 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_init_41431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_num_in_init_51441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_init_51443 = new BitSet(new long[]{0x0200004000000000L});
    public static final BitSet FOLLOW_var_num_in_init_51445 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_init_51447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_num_in_init_61456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_init_61458 = new BitSet(new long[]{0x0200004000000000L});
    public static final BitSet FOLLOW_var_num_in_init_61459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_init_61461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_init_61462 = new BitSet(new long[]{0x0200004000000000L});
    public static final BitSet FOLLOW_var_num_in_init_61463 = new BitSet(new long[]{0x0000021000000000L});
    public static final BitSet FOLLOW_op_in_init_61465 = new BitSet(new long[]{0x0200004000000000L});
    public static final BitSet FOLLOW_var_num_in_init_61467 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_init_61469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_1_in_big_init1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_2_in_big_init1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_3_in_big_init1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_4_in_big_init1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_5_in_big_init1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_6_in_big_init1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_generalArithExpr_in_condition1511 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RelationalOperators_in_condition1513 = new BitSet(new long[]{0x4200005000810000L});
    public static final BitSet FOLLOW_generalArithExpr_in_condition1515 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AndOr_in_condition1518 = new BitSet(new long[]{0x4200005000810000L});
    public static final BitSet FOLLOW_condition_in_condition1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_int_dec1579 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_int_dec1582 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_VAR_in_int_dec1584 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000108L});
    public static final BitSet FOLLOW_72_in_int_dec1588 = new BitSet(new long[]{0x4200005000810000L});
    public static final BitSet FOLLOW_generalArithExpr_in_int_dec1590 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_67_in_int_dec1595 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_VAR_in_int_dec1597 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMICOLON_in_int_dec1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_double_dec1617 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DOUBLE_in_double_dec1620 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_VAR_in_double_dec1622 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000108L});
    public static final BitSet FOLLOW_72_in_double_dec1626 = new BitSet(new long[]{0x4200005000810000L});
    public static final BitSet FOLLOW_generalArithExpr_in_double_dec1628 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_67_in_double_dec1633 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_VAR_in_double_dec1635 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMICOLON_in_double_dec1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_string_dec1653 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_STRING_in_string_dec1656 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_VAR_in_string_dec1658 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_string_dec1661 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_Strings_in_string_dec1663 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_string_dec1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_generalArithExpr1699 = new BitSet(new long[]{0x0000021000000002L});
    public static final BitSet FOLLOW_set_in_generalArithExpr1702 = new BitSet(new long[]{0x4200005000810000L});
    public static final BitSet FOLLOW_term_in_generalArithExpr1714 = new BitSet(new long[]{0x0000021000000002L});
    public static final BitSet FOLLOW_factor_in_term1752 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000041L});
    public static final BitSet FOLLOW_set_in_term1756 = new BitSet(new long[]{0x4200005000810000L});
    public static final BitSet FOLLOW_factor_in_term1768 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000041L});
    public static final BitSet FOLLOW_VAR_in_factor1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_factor1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DNUM_in_factor1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Minus_in_factor1844 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_VAR_in_factor1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Minus_in_factor1862 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_factor1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Minus_in_factor1880 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DNUM_in_factor1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_factor1899 = new BitSet(new long[]{0x4200005000810000L});
    public static final BitSet FOLLOW_generalArithExpr_in_factor1901 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_factor1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Fun_in_factor1921 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_factor1923 = new BitSet(new long[]{0x4200005000810000L});
    public static final BitSet FOLLOW_generalArithExpr_in_factor1925 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_factor1927 = new BitSet(new long[]{0x0000000000000002L});

}