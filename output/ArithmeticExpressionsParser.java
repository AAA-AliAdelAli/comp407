// $ANTLR 3.4 C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g 2024-05-12 20:16:31

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ArithmeticExpressionsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AndOr", "Args", "Assigment", "BOOLEAN", "Big_init", "COMMENT", "Class", "ClassDec", "Condition", "Conditions", "DNUM", "DOUBLE", "Decl", "Dot", "Double_dec", "Factor", "Forloop", "Fun", "GeneralArithExpr", "INT", "Ifstmt", "Ifstmt_2", "Init_4", "Initialize", "Initialize_1", "Int_dec", "ML_COMMENT", "Main", "Main_METHOD", "Method", "Minus", "Modifier", "NUM", "New", "Out", "Plus", "Print", "Println", "RelationalOperators", "SEMICOLON", "SL_COMMENT", "STRING", "Start", "StartgeneralArithExpr", "Static", "String_Dec", "Strings", "Sys_print", "System", "TYPE", "Term", "VAR", "VOID", "Whilestmt", "WhiteSpace", "'!'", "'&&'", "'('", "')'", "'*'", "'++'", "'+='", "','", "'--'", "'-='", "'/'", "'<'", "'='", "'>'", "'['", "']'", "'a'", "'else'", "'for'", "'if'", "'return'", "'this'", "'while'", "'{'", "'}'"
    };

    public static final int EOF=-1;
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
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int AndOr=4;
    public static final int Args=5;
    public static final int Assigment=6;
    public static final int BOOLEAN=7;
    public static final int Big_init=8;
    public static final int COMMENT=9;
    public static final int Class=10;
    public static final int ClassDec=11;
    public static final int Condition=12;
    public static final int Conditions=13;
    public static final int DNUM=14;
    public static final int DOUBLE=15;
    public static final int Decl=16;
    public static final int Dot=17;
    public static final int Double_dec=18;
    public static final int Factor=19;
    public static final int Forloop=20;
    public static final int Fun=21;
    public static final int GeneralArithExpr=22;
    public static final int INT=23;
    public static final int Ifstmt=24;
    public static final int Ifstmt_2=25;
    public static final int Init_4=26;
    public static final int Initialize=27;
    public static final int Initialize_1=28;
    public static final int Int_dec=29;
    public static final int ML_COMMENT=30;
    public static final int Main=31;
    public static final int Main_METHOD=32;
    public static final int Method=33;
    public static final int Minus=34;
    public static final int Modifier=35;
    public static final int NUM=36;
    public static final int New=37;
    public static final int Out=38;
    public static final int Plus=39;
    public static final int Print=40;
    public static final int Println=41;
    public static final int RelationalOperators=42;
    public static final int SEMICOLON=43;
    public static final int SL_COMMENT=44;
    public static final int STRING=45;
    public static final int Start=46;
    public static final int StartgeneralArithExpr=47;
    public static final int Static=48;
    public static final int String_Dec=49;
    public static final int Strings=50;
    public static final int Sys_print=51;
    public static final int System=52;
    public static final int TYPE=53;
    public static final int Term=54;
    public static final int VAR=55;
    public static final int VOID=56;
    public static final int Whilestmt=57;
    public static final int WhiteSpace=58;

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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:41:1: startgeneralArithExpr : ( classDec )* -> ^( Start ( classDec )* ) ;
    public final ArithmeticExpressionsParser.startgeneralArithExpr_return startgeneralArithExpr() throws RecognitionException {
        ArithmeticExpressionsParser.startgeneralArithExpr_return retval = new ArithmeticExpressionsParser.startgeneralArithExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.classDec_return classDec1 =null;


        RewriteRuleSubtreeStream stream_classDec=new RewriteRuleSubtreeStream(adaptor,"rule classDec");
        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:41:23: ( ( classDec )* -> ^( Start ( classDec )* ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:41:25: ( classDec )*
            {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:41:25: ( classDec )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Class||LA1_0==Modifier) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:41:25: classDec
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
                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:41:38: ^( Start ( classDec )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Start, "Start")
                , root_1);

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:41:46: ( classDec )*
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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:50:1: classDec : ( Modifier )? Class ( VAR )* '{' ( stmt )* '}' -> ^( ClassDec ( Modifier )? Class VAR '{' ( stmt )* '}' ) ;
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
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_Class=new RewriteRuleTokenStream(adaptor,"token Class");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_Modifier=new RewriteRuleTokenStream(adaptor,"token Modifier");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:50:9: ( ( Modifier )? Class ( VAR )* '{' ( stmt )* '}' -> ^( ClassDec ( Modifier )? Class VAR '{' ( stmt )* '}' ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:50:11: ( Modifier )? Class ( VAR )* '{' ( stmt )* '}'
            {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:50:11: ( Modifier )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Modifier) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:50:11: Modifier
                    {
                    Modifier2=(Token)match(input,Modifier,FOLLOW_Modifier_in_classDec157);  
                    stream_Modifier.add(Modifier2);


                    }
                    break;

            }


            Class3=(Token)match(input,Class,FOLLOW_Class_in_classDec160);  
            stream_Class.add(Class3);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:50:27: ( VAR )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==VAR) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:50:27: VAR
            	    {
            	    VAR4=(Token)match(input,VAR,FOLLOW_VAR_in_classDec162);  
            	    stream_VAR.add(VAR4);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            char_literal5=(Token)match(input,82,FOLLOW_82_in_classDec165);  
            stream_82.add(char_literal5);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:50:36: ( stmt )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==BOOLEAN||LA4_0==DOUBLE||LA4_0==INT||(LA4_0 >= Modifier && LA4_0 <= NUM)||LA4_0==SEMICOLON||LA4_0==STRING||LA4_0==System||LA4_0==VAR||(LA4_0 >= 77 && LA4_0 <= 78)||LA4_0==81) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:50:36: stmt
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


            char_literal7=(Token)match(input,83,FOLLOW_83_in_classDec170);  
            stream_83.add(char_literal7);


            // AST REWRITE
            // elements: 83, Class, stmt, VAR, Modifier, 82
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
                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:50:48: ^( ClassDec ( Modifier )? Class VAR '{' ( stmt )* '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ClassDec, "ClassDec")
                , root_1);

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:50:59: ( Modifier )?
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
                stream_82.nextNode()
                );

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:50:83: ( stmt )*
                while ( stream_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmt.nextTree());

                }
                stream_stmt.reset();

                adaptor.addChild(root_1, 
                stream_83.nextNode()
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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:57:1: stmt : ( decl -> ^( Decl decl ) | init_4 -> ^( Init_4 init_4 ) | big_init -> ^( Big_init big_init ) | main_method -> ^( Main_METHOD main_method ) | ifstmt -> ^( Ifstmt ifstmt ) | whilestmt -> ^( Whilestmt whilestmt ) | forloop -> ^( Forloop forloop ) | assigment -> ^( Assigment assigment ) | method -> ^( Method method ) | string_dec -> ^( String_Dec string_dec ) | initialize -> ^( Initialize initialize ) | initialize_1 -> ^( Initialize_1 initialize_1 ) | sys_print -> ^( Sys_print sys_print ) ) ;
    public final ArithmeticExpressionsParser.stmt_return stmt() throws RecognitionException {
        ArithmeticExpressionsParser.stmt_return retval = new ArithmeticExpressionsParser.stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.decl_return decl8 =null;

        ArithmeticExpressionsParser.init_4_return init_49 =null;

        ArithmeticExpressionsParser.big_init_return big_init10 =null;

        ArithmeticExpressionsParser.main_method_return main_method11 =null;

        ArithmeticExpressionsParser.ifstmt_return ifstmt12 =null;

        ArithmeticExpressionsParser.whilestmt_return whilestmt13 =null;

        ArithmeticExpressionsParser.forloop_return forloop14 =null;

        ArithmeticExpressionsParser.assigment_return assigment15 =null;

        ArithmeticExpressionsParser.method_return method16 =null;

        ArithmeticExpressionsParser.string_dec_return string_dec17 =null;

        ArithmeticExpressionsParser.initialize_return initialize18 =null;

        ArithmeticExpressionsParser.initialize_1_return initialize_119 =null;

        ArithmeticExpressionsParser.sys_print_return sys_print20 =null;


        RewriteRuleSubtreeStream stream_decl=new RewriteRuleSubtreeStream(adaptor,"rule decl");
        RewriteRuleSubtreeStream stream_method=new RewriteRuleSubtreeStream(adaptor,"rule method");
        RewriteRuleSubtreeStream stream_ifstmt=new RewriteRuleSubtreeStream(adaptor,"rule ifstmt");
        RewriteRuleSubtreeStream stream_initialize_1=new RewriteRuleSubtreeStream(adaptor,"rule initialize_1");
        RewriteRuleSubtreeStream stream_init_4=new RewriteRuleSubtreeStream(adaptor,"rule init_4");
        RewriteRuleSubtreeStream stream_sys_print=new RewriteRuleSubtreeStream(adaptor,"rule sys_print");
        RewriteRuleSubtreeStream stream_assigment=new RewriteRuleSubtreeStream(adaptor,"rule assigment");
        RewriteRuleSubtreeStream stream_whilestmt=new RewriteRuleSubtreeStream(adaptor,"rule whilestmt");
        RewriteRuleSubtreeStream stream_forloop=new RewriteRuleSubtreeStream(adaptor,"rule forloop");
        RewriteRuleSubtreeStream stream_string_dec=new RewriteRuleSubtreeStream(adaptor,"rule string_dec");
        RewriteRuleSubtreeStream stream_main_method=new RewriteRuleSubtreeStream(adaptor,"rule main_method");
        RewriteRuleSubtreeStream stream_initialize=new RewriteRuleSubtreeStream(adaptor,"rule initialize");
        RewriteRuleSubtreeStream stream_big_init=new RewriteRuleSubtreeStream(adaptor,"rule big_init");
        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:57:9: ( ( decl -> ^( Decl decl ) | init_4 -> ^( Init_4 init_4 ) | big_init -> ^( Big_init big_init ) | main_method -> ^( Main_METHOD main_method ) | ifstmt -> ^( Ifstmt ifstmt ) | whilestmt -> ^( Whilestmt whilestmt ) | forloop -> ^( Forloop forloop ) | assigment -> ^( Assigment assigment ) | method -> ^( Method method ) | string_dec -> ^( String_Dec string_dec ) | initialize -> ^( Initialize initialize ) | initialize_1 -> ^( Initialize_1 initialize_1 ) | sys_print -> ^( Sys_print sys_print ) ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:57:13: ( decl -> ^( Decl decl ) | init_4 -> ^( Init_4 init_4 ) | big_init -> ^( Big_init big_init ) | main_method -> ^( Main_METHOD main_method ) | ifstmt -> ^( Ifstmt ifstmt ) | whilestmt -> ^( Whilestmt whilestmt ) | forloop -> ^( Forloop forloop ) | assigment -> ^( Assigment assigment ) | method -> ^( Method method ) | string_dec -> ^( String_Dec string_dec ) | initialize -> ^( Initialize initialize ) | initialize_1 -> ^( Initialize_1 initialize_1 ) | sys_print -> ^( Sys_print sys_print ) )
            {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:57:13: ( decl -> ^( Decl decl ) | init_4 -> ^( Init_4 init_4 ) | big_init -> ^( Big_init big_init ) | main_method -> ^( Main_METHOD main_method ) | ifstmt -> ^( Ifstmt ifstmt ) | whilestmt -> ^( Whilestmt whilestmt ) | forloop -> ^( Forloop forloop ) | assigment -> ^( Assigment assigment ) | method -> ^( Method method ) | string_dec -> ^( String_Dec string_dec ) | initialize -> ^( Initialize initialize ) | initialize_1 -> ^( Initialize_1 initialize_1 ) | sys_print -> ^( Sys_print sys_print ) )
            int alt5=13;
            switch ( input.LA(1) ) {
            case Modifier:
                {
                switch ( input.LA(2) ) {
                case Static:
                    {
                    alt5=4;
                    }
                    break;
                case INT:
                    {
                    int LA5_14 = input.LA(3);

                    if ( (LA5_14==VAR) ) {
                        int LA5_28 = input.LA(4);

                        if ( (LA5_28==SEMICOLON||LA5_28==66||LA5_28==71) ) {
                            alt5=1;
                        }
                        else if ( (LA5_28==VAR||LA5_28==61) ) {
                            alt5=9;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 28, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA5_14==61) ) {
                        alt5=9;
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
                        int LA5_29 = input.LA(4);

                        if ( (LA5_29==SEMICOLON||LA5_29==66||LA5_29==71) ) {
                            alt5=1;
                        }
                        else if ( (LA5_29==VAR||LA5_29==61) ) {
                            alt5=9;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 29, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA5_15==61) ) {
                        alt5=9;
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
                        int LA5_30 = input.LA(4);

                        if ( (LA5_30==SEMICOLON||LA5_30==71) ) {
                            alt5=10;
                        }
                        else if ( (LA5_30==VAR||LA5_30==61) ) {
                            alt5=9;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 30, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA5_16==61) ) {
                        alt5=9;
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
                case 61:
                    {
                    alt5=9;
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

                    if ( (LA5_18==SEMICOLON||LA5_18==66||LA5_18==71) ) {
                        alt5=1;
                    }
                    else if ( (LA5_18==BOOLEAN||LA5_18==DOUBLE||LA5_18==INT||(LA5_18 >= Modifier && LA5_18 <= NUM)||LA5_18==STRING||LA5_18==System||LA5_18==VAR||(LA5_18 >= 76 && LA5_18 <= 79)||LA5_18==81||LA5_18==83) ) {
                        alt5=3;
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
                    alt5=3;
                    }
                    break;
                case 73:
                    {
                    int LA5_20 = input.LA(3);

                    if ( (LA5_20==74) ) {
                        int LA5_32 = input.LA(4);

                        if ( (LA5_32==VAR) ) {
                            int LA5_41 = input.LA(5);

                            if ( (LA5_41==SEMICOLON) ) {
                                alt5=3;
                            }
                            else if ( (LA5_41==BOOLEAN||LA5_41==DOUBLE||LA5_41==INT||(LA5_41 >= Modifier && LA5_41 <= NUM)||LA5_41==STRING||LA5_41==System||LA5_41==VAR||(LA5_41 >= 76 && LA5_41 <= 79)||LA5_41==81||LA5_41==83) ) {
                                alt5=3;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 41, input);

                                throw nvae;

                            }
                        }
                        else if ( (LA5_32==NUM) ) {
                            alt5=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 32, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 20, input);

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
                    int LA5_21 = input.LA(3);

                    if ( (LA5_21==SEMICOLON||LA5_21==66||LA5_21==71) ) {
                        alt5=1;
                    }
                    else if ( (LA5_21==BOOLEAN||LA5_21==DOUBLE||LA5_21==INT||(LA5_21 >= Modifier && LA5_21 <= NUM)||LA5_21==STRING||LA5_21==System||LA5_21==VAR||(LA5_21 >= 76 && LA5_21 <= 79)||LA5_21==81||LA5_21==83) ) {
                        alt5=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 21, input);

                        throw nvae;

                    }
                    }
                    break;
                case NUM:
                    {
                    alt5=3;
                    }
                    break;
                case 73:
                    {
                    int LA5_20 = input.LA(3);

                    if ( (LA5_20==74) ) {
                        int LA5_32 = input.LA(4);

                        if ( (LA5_32==VAR) ) {
                            int LA5_41 = input.LA(5);

                            if ( (LA5_41==SEMICOLON) ) {
                                alt5=3;
                            }
                            else if ( (LA5_41==BOOLEAN||LA5_41==DOUBLE||LA5_41==INT||(LA5_41 >= Modifier && LA5_41 <= NUM)||LA5_41==STRING||LA5_41==System||LA5_41==VAR||(LA5_41 >= 76 && LA5_41 <= 79)||LA5_41==81||LA5_41==83) ) {
                                alt5=3;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 41, input);

                                throw nvae;

                            }
                        }
                        else if ( (LA5_32==NUM) ) {
                            alt5=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 32, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 20, input);

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
                case 71:
                    {
                    switch ( input.LA(3) ) {
                    case VAR:
                        {
                        switch ( input.LA(4) ) {
                        case Dot:
                            {
                            alt5=12;
                            }
                            break;
                        case VAR:
                            {
                            int LA5_42 = input.LA(5);

                            if ( (LA5_42==61) ) {
                                switch ( input.LA(6) ) {
                                case VAR:
                                    {
                                    switch ( input.LA(7) ) {
                                    case NUM:
                                    case VAR:
                                    case 66:
                                        {
                                        alt5=12;
                                        }
                                        break;
                                    case 62:
                                        {
                                        int LA5_49 = input.LA(8);

                                        if ( (LA5_49==BOOLEAN||LA5_49==DOUBLE||LA5_49==INT||(LA5_49 >= Modifier && LA5_49 <= NUM)||LA5_49==STRING||LA5_49==System||LA5_49==VAR||(LA5_49 >= 76 && LA5_49 <= 79)||LA5_49==81||LA5_49==83) ) {
                                            alt5=12;
                                        }
                                        else if ( (LA5_49==Minus||LA5_49==Plus||LA5_49==SEMICOLON||LA5_49==63||LA5_49==69) ) {
                                            alt5=3;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 5, 49, input);

                                            throw nvae;

                                        }
                                        }
                                        break;
                                    case Minus:
                                    case Plus:
                                    case 63:
                                    case 69:
                                        {
                                        alt5=3;
                                        }
                                        break;
                                    default:
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 5, 47, input);

                                        throw nvae;

                                    }

                                    }
                                    break;
                                case 62:
                                case 66:
                                    {
                                    alt5=12;
                                    }
                                    break;
                                case NUM:
                                    {
                                    switch ( input.LA(7) ) {
                                    case NUM:
                                    case VAR:
                                    case 66:
                                        {
                                        alt5=12;
                                        }
                                        break;
                                    case 62:
                                        {
                                        int LA5_49 = input.LA(8);

                                        if ( (LA5_49==BOOLEAN||LA5_49==DOUBLE||LA5_49==INT||(LA5_49 >= Modifier && LA5_49 <= NUM)||LA5_49==STRING||LA5_49==System||LA5_49==VAR||(LA5_49 >= 76 && LA5_49 <= 79)||LA5_49==81||LA5_49==83) ) {
                                            alt5=12;
                                        }
                                        else if ( (LA5_49==Minus||LA5_49==Plus||LA5_49==SEMICOLON||LA5_49==63||LA5_49==69) ) {
                                            alt5=3;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 5, 49, input);

                                            throw nvae;

                                        }
                                        }
                                        break;
                                    case Minus:
                                    case Plus:
                                    case 63:
                                    case 69:
                                        {
                                        alt5=3;
                                        }
                                        break;
                                    default:
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 5, 48, input);

                                        throw nvae;

                                    }

                                    }
                                    break;
                                case DNUM:
                                case Fun:
                                case Minus:
                                case 61:
                                    {
                                    alt5=3;
                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 45, input);

                                    throw nvae;

                                }

                            }
                            else if ( (LA5_42==DNUM||LA5_42==Dot||LA5_42==Fun||LA5_42==Minus||(LA5_42 >= NUM && LA5_42 <= New)||LA5_42==SEMICOLON||LA5_42==VAR||(LA5_42 >= 63 && LA5_42 <= 65)||(LA5_42 >= 67 && LA5_42 <= 68)||LA5_42==71||LA5_42==73) ) {
                                alt5=3;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 42, input);

                                throw nvae;

                            }
                            }
                            break;
                        case BOOLEAN:
                        case DOUBLE:
                        case INT:
                        case Modifier:
                        case NUM:
                        case SEMICOLON:
                        case STRING:
                        case System:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 81:
                        case 83:
                            {
                            alt5=3;
                            }
                            break;
                        case Minus:
                        case Plus:
                            {
                            int LA5_44 = input.LA(5);

                            if ( (LA5_44==NUM||LA5_44==VAR) ) {
                                alt5=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 44, input);

                                throw nvae;

                            }
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 34, input);

                            throw nvae;

                        }

                        }
                        break;
                    case 80:
                        {
                        alt5=3;
                        }
                        break;
                    case New:
                        {
                        alt5=12;
                        }
                        break;
                    case NUM:
                        {
                        int LA5_36 = input.LA(4);

                        if ( (LA5_36==Minus||LA5_36==Plus) ) {
                            int LA5_44 = input.LA(5);

                            if ( (LA5_44==NUM||LA5_44==VAR) ) {
                                alt5=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 44, input);

                                throw nvae;

                            }
                        }
                        else if ( (LA5_36==BOOLEAN||LA5_36==DOUBLE||LA5_36==INT||(LA5_36 >= Modifier && LA5_36 <= NUM)||LA5_36==SEMICOLON||LA5_36==STRING||LA5_36==System||LA5_36==VAR||(LA5_36 >= 76 && LA5_36 <= 79)||LA5_36==81||LA5_36==83) ) {
                            alt5=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 36, input);

                            throw nvae;

                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 22, input);

                        throw nvae;

                    }

                    }
                    break;
                case 73:
                    {
                    alt5=3;
                    }
                    break;
                case DNUM:
                case Dot:
                case Fun:
                case Minus:
                case NUM:
                case New:
                case 61:
                case 63:
                case 64:
                case 65:
                case 67:
                case 68:
                    {
                    alt5=8;
                    }
                    break;
                case VAR:
                    {
                    switch ( input.LA(3) ) {
                    case Minus:
                    case Plus:
                    case 61:
                    case 63:
                    case 69:
                        {
                        alt5=8;
                        }
                        break;
                    case SEMICOLON:
                        {
                        alt5=8;
                        }
                        break;
                    case VAR:
                        {
                        alt5=11;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 24, input);

                        throw nvae;

                    }

                    }
                    break;
                case SEMICOLON:
                    {
                    alt5=11;
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
                    int LA5_25 = input.LA(3);

                    if ( (LA5_25==BOOLEAN||LA5_25==DOUBLE||LA5_25==INT||(LA5_25 >= Modifier && LA5_25 <= NUM)||LA5_25==SEMICOLON||LA5_25==STRING||LA5_25==System||LA5_25==VAR||(LA5_25 >= 76 && LA5_25 <= 79)||LA5_25==81||LA5_25==83) ) {
                        alt5=3;
                    }
                    else if ( (LA5_25==71) ) {
                        alt5=10;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 25, input);

                        throw nvae;

                    }
                    }
                    break;
                case NUM:
                    {
                    alt5=3;
                    }
                    break;
                case 73:
                    {
                    int LA5_20 = input.LA(3);

                    if ( (LA5_20==74) ) {
                        int LA5_32 = input.LA(4);

                        if ( (LA5_32==VAR) ) {
                            int LA5_41 = input.LA(5);

                            if ( (LA5_41==SEMICOLON) ) {
                                alt5=3;
                            }
                            else if ( (LA5_41==BOOLEAN||LA5_41==DOUBLE||LA5_41==INT||(LA5_41 >= Modifier && LA5_41 <= NUM)||LA5_41==STRING||LA5_41==System||LA5_41==VAR||(LA5_41 >= 76 && LA5_41 <= 79)||LA5_41==81||LA5_41==83) ) {
                                alt5=3;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 41, input);

                                throw nvae;

                            }
                        }
                        else if ( (LA5_32==NUM) ) {
                            alt5=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 32, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 20, input);

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
            case 78:
                {
                alt5=5;
                }
                break;
            case 81:
                {
                alt5=6;
                }
                break;
            case 77:
                {
                alt5=7;
                }
                break;
            case NUM:
                {
                int LA5_9 = input.LA(2);

                if ( (LA5_9==71) ) {
                    int LA5_26 = input.LA(3);

                    if ( (LA5_26==80) ) {
                        alt5=3;
                    }
                    else if ( (LA5_26==NUM||LA5_26==VAR) ) {
                        int LA5_36 = input.LA(4);

                        if ( (LA5_36==Minus||LA5_36==Plus) ) {
                            int LA5_44 = input.LA(5);

                            if ( (LA5_44==NUM||LA5_44==VAR) ) {
                                alt5=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 44, input);

                                throw nvae;

                            }
                        }
                        else if ( (LA5_36==BOOLEAN||LA5_36==DOUBLE||LA5_36==INT||(LA5_36 >= Modifier && LA5_36 <= NUM)||LA5_36==SEMICOLON||LA5_36==STRING||LA5_36==System||LA5_36==VAR||(LA5_36 >= 76 && LA5_36 <= 79)||LA5_36==81||LA5_36==83) ) {
                            alt5=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 36, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 26, input);

                        throw nvae;

                    }
                }
                else if ( (LA5_9==73) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 9, input);

                    throw nvae;

                }
                }
                break;
            case BOOLEAN:
                {
                switch ( input.LA(2) ) {
                case VAR:
                    {
                    int LA5_27 = input.LA(3);

                    if ( (LA5_27==BOOLEAN||LA5_27==DOUBLE||LA5_27==INT||(LA5_27 >= Modifier && LA5_27 <= NUM)||LA5_27==SEMICOLON||LA5_27==STRING||LA5_27==System||LA5_27==VAR||(LA5_27 >= 76 && LA5_27 <= 79)||LA5_27==81||LA5_27==83) ) {
                        alt5=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 27, input);

                        throw nvae;

                    }
                    }
                    break;
                case 73:
                    {
                    int LA5_20 = input.LA(3);

                    if ( (LA5_20==74) ) {
                        int LA5_32 = input.LA(4);

                        if ( (LA5_32==VAR) ) {
                            int LA5_41 = input.LA(5);

                            if ( (LA5_41==SEMICOLON) ) {
                                alt5=3;
                            }
                            else if ( (LA5_41==BOOLEAN||LA5_41==DOUBLE||LA5_41==INT||(LA5_41 >= Modifier && LA5_41 <= NUM)||LA5_41==STRING||LA5_41==System||LA5_41==VAR||(LA5_41 >= 76 && LA5_41 <= 79)||LA5_41==81||LA5_41==83) ) {
                                alt5=3;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 41, input);

                                throw nvae;

                            }
                        }
                        else if ( (LA5_32==NUM) ) {
                            alt5=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 32, input);

                            throw nvae;

                        }
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
                    alt5=3;
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
                alt5=11;
                }
                break;
            case System:
                {
                alt5=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:58:2: decl
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
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:58:10: ^( Decl decl )
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
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:60:1: init_4
                    {
                    pushFollow(FOLLOW_init_4_in_stmt242);
                    init_49=init_4();

                    state._fsp--;

                    stream_init_4.add(init_49.getTree());

                    // AST REWRITE
                    // elements: init_4
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 60:8: -> ^( Init_4 init_4 )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:60:11: ^( Init_4 init_4 )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Init_4, "Init_4")
                        , root_1);

                        adaptor.addChild(root_1, stream_init_4.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:61:3: big_init
                    {
                    pushFollow(FOLLOW_big_init_in_stmt254);
                    big_init10=big_init();

                    state._fsp--;

                    stream_big_init.add(big_init10.getTree());

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
                    // 61:12: -> ^( Big_init big_init )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:61:15: ^( Big_init big_init )
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
                case 4 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:62:3: main_method
                    {
                    pushFollow(FOLLOW_main_method_in_stmt266);
                    main_method11=main_method();

                    state._fsp--;

                    stream_main_method.add(main_method11.getTree());

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
                    // 62:14: -> ^( Main_METHOD main_method )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:62:16: ^( Main_METHOD main_method )
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
                case 5 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:63:3: ifstmt
                    {
                    pushFollow(FOLLOW_ifstmt_in_stmt276);
                    ifstmt12=ifstmt();

                    state._fsp--;

                    stream_ifstmt.add(ifstmt12.getTree());

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
                    // 63:10: -> ^( Ifstmt ifstmt )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:63:13: ^( Ifstmt ifstmt )
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
                case 6 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:64:3: whilestmt
                    {
                    pushFollow(FOLLOW_whilestmt_in_stmt288);
                    whilestmt13=whilestmt();

                    state._fsp--;

                    stream_whilestmt.add(whilestmt13.getTree());

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
                    // 64:13: -> ^( Whilestmt whilestmt )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:64:16: ^( Whilestmt whilestmt )
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
                case 7 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:65:3: forloop
                    {
                    pushFollow(FOLLOW_forloop_in_stmt300);
                    forloop14=forloop();

                    state._fsp--;

                    stream_forloop.add(forloop14.getTree());

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
                    // 65:11: -> ^( Forloop forloop )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:65:14: ^( Forloop forloop )
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
                case 8 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:66:3: assigment
                    {
                    pushFollow(FOLLOW_assigment_in_stmt312);
                    assigment15=assigment();

                    state._fsp--;

                    stream_assigment.add(assigment15.getTree());

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
                    // 66:13: -> ^( Assigment assigment )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:66:16: ^( Assigment assigment )
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
                case 9 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:67:3: method
                    {
                    pushFollow(FOLLOW_method_in_stmt324);
                    method16=method();

                    state._fsp--;

                    stream_method.add(method16.getTree());

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
                    // 67:10: -> ^( Method method )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:67:13: ^( Method method )
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
                case 10 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:68:3: string_dec
                    {
                    pushFollow(FOLLOW_string_dec_in_stmt336);
                    string_dec17=string_dec();

                    state._fsp--;

                    stream_string_dec.add(string_dec17.getTree());

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
                    // 68:14: -> ^( String_Dec string_dec )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:68:17: ^( String_Dec string_dec )
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
                case 11 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:69:3: initialize
                    {
                    pushFollow(FOLLOW_initialize_in_stmt348);
                    initialize18=initialize();

                    state._fsp--;

                    stream_initialize.add(initialize18.getTree());

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
                    // 69:14: -> ^( Initialize initialize )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:69:17: ^( Initialize initialize )
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
                case 12 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:70:3: initialize_1
                    {
                    pushFollow(FOLLOW_initialize_1_in_stmt360);
                    initialize_119=initialize_1();

                    state._fsp--;

                    stream_initialize_1.add(initialize_119.getTree());

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
                    // 70:16: -> ^( Initialize_1 initialize_1 )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:70:19: ^( Initialize_1 initialize_1 )
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
                case 13 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:71:3: sys_print
                    {
                    pushFollow(FOLLOW_sys_print_in_stmt373);
                    sys_print20=sys_print();

                    state._fsp--;

                    stream_sys_print.add(sys_print20.getTree());

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
                    // 71:13: -> ^( Sys_print sys_print )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:71:16: ^( Sys_print sys_print )
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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:81:1: method : Modifier ( types )? ( VAR )* params '{' ( stmt )* 'return' return_type SEMICOLON '}' -> ^( Method Modifier ( types )? ( VAR )* params '{' ( stmt )* 'return' return_type SEMICOLON '}' ) ;
    public final ArithmeticExpressionsParser.method_return method() throws RecognitionException {
        ArithmeticExpressionsParser.method_return retval = new ArithmeticExpressionsParser.method_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier21=null;
        Token VAR23=null;
        Token char_literal25=null;
        Token string_literal27=null;
        Token SEMICOLON29=null;
        Token char_literal30=null;
        ArithmeticExpressionsParser.types_return types22 =null;

        ArithmeticExpressionsParser.params_return params24 =null;

        ArithmeticExpressionsParser.stmt_return stmt26 =null;

        ArithmeticExpressionsParser.return_type_return return_type28 =null;


        Object Modifier21_tree=null;
        Object VAR23_tree=null;
        Object char_literal25_tree=null;
        Object string_literal27_tree=null;
        Object SEMICOLON29_tree=null;
        Object char_literal30_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_Modifier=new RewriteRuleTokenStream(adaptor,"token Modifier");
        RewriteRuleSubtreeStream stream_return_type=new RewriteRuleSubtreeStream(adaptor,"rule return_type");
        RewriteRuleSubtreeStream stream_types=new RewriteRuleSubtreeStream(adaptor,"rule types");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:81:8: ( Modifier ( types )? ( VAR )* params '{' ( stmt )* 'return' return_type SEMICOLON '}' -> ^( Method Modifier ( types )? ( VAR )* params '{' ( stmt )* 'return' return_type SEMICOLON '}' ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:82:2: Modifier ( types )? ( VAR )* params '{' ( stmt )* 'return' return_type SEMICOLON '}'
            {
            Modifier21=(Token)match(input,Modifier,FOLLOW_Modifier_in_method423);  
            stream_Modifier.add(Modifier21);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:82:11: ( types )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==BOOLEAN||LA6_0==DOUBLE||LA6_0==INT||LA6_0==STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:82:11: types
                    {
                    pushFollow(FOLLOW_types_in_method425);
                    types22=types();

                    state._fsp--;

                    stream_types.add(types22.getTree());

                    }
                    break;

            }


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:82:18: ( VAR )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==VAR) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:82:18: VAR
            	    {
            	    VAR23=(Token)match(input,VAR,FOLLOW_VAR_in_method428);  
            	    stream_VAR.add(VAR23);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            pushFollow(FOLLOW_params_in_method431);
            params24=params();

            state._fsp--;

            stream_params.add(params24.getTree());

            char_literal25=(Token)match(input,82,FOLLOW_82_in_method433);  
            stream_82.add(char_literal25);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:82:34: ( stmt )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==BOOLEAN||LA8_0==DOUBLE||LA8_0==INT||(LA8_0 >= Modifier && LA8_0 <= NUM)||LA8_0==SEMICOLON||LA8_0==STRING||LA8_0==System||LA8_0==VAR||(LA8_0 >= 77 && LA8_0 <= 78)||LA8_0==81) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:82:34: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_method435);
            	    stmt26=stmt();

            	    state._fsp--;

            	    stream_stmt.add(stmt26.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            string_literal27=(Token)match(input,79,FOLLOW_79_in_method438);  
            stream_79.add(string_literal27);


            pushFollow(FOLLOW_return_type_in_method440);
            return_type28=return_type();

            state._fsp--;

            stream_return_type.add(return_type28.getTree());

            SEMICOLON29=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_method442);  
            stream_SEMICOLON.add(SEMICOLON29);


            char_literal30=(Token)match(input,83,FOLLOW_83_in_method443);  
            stream_83.add(char_literal30);


            // AST REWRITE
            // elements: types, params, VAR, SEMICOLON, Modifier, stmt, return_type, 79, 83, 82
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 83:3: -> ^( Method Modifier ( types )? ( VAR )* params '{' ( stmt )* 'return' return_type SEMICOLON '}' )
            {
                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:83:6: ^( Method Modifier ( types )? ( VAR )* params '{' ( stmt )* 'return' return_type SEMICOLON '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Method, "Method")
                , root_1);

                adaptor.addChild(root_1, 
                stream_Modifier.nextNode()
                );

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:83:24: ( types )?
                if ( stream_types.hasNext() ) {
                    adaptor.addChild(root_1, stream_types.nextTree());

                }
                stream_types.reset();

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:83:31: ( VAR )*
                while ( stream_VAR.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_VAR.nextNode()
                    );

                }
                stream_VAR.reset();

                adaptor.addChild(root_1, stream_params.nextTree());

                adaptor.addChild(root_1, 
                stream_82.nextNode()
                );

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:83:47: ( stmt )*
                while ( stream_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmt.nextTree());

                }
                stream_stmt.reset();

                adaptor.addChild(root_1, 
                stream_79.nextNode()
                );

                adaptor.addChild(root_1, stream_return_type.nextTree());

                adaptor.addChild(root_1, 
                stream_SEMICOLON.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_83.nextNode()
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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:91:1: main_method : Modifier Static VOID Main '(' STRING '[' ']' 'a' ')' '{' ( print )* '}' -> ^( Main_METHOD Modifier Static VOID Main '(' STRING '[' ']' 'a' ')' '{' ( print )* '}' ) ;
    public final ArithmeticExpressionsParser.main_method_return main_method() throws RecognitionException {
        ArithmeticExpressionsParser.main_method_return retval = new ArithmeticExpressionsParser.main_method_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier31=null;
        Token Static32=null;
        Token VOID33=null;
        Token Main34=null;
        Token char_literal35=null;
        Token STRING36=null;
        Token char_literal37=null;
        Token char_literal38=null;
        Token char_literal39=null;
        Token char_literal40=null;
        Token char_literal41=null;
        Token char_literal43=null;
        ArithmeticExpressionsParser.print_return print42 =null;


        Object Modifier31_tree=null;
        Object Static32_tree=null;
        Object VOID33_tree=null;
        Object Main34_tree=null;
        Object char_literal35_tree=null;
        Object STRING36_tree=null;
        Object char_literal37_tree=null;
        Object char_literal38_tree=null;
        Object char_literal39_tree=null;
        Object char_literal40_tree=null;
        Object char_literal41_tree=null;
        Object char_literal43_tree=null;
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_Static=new RewriteRuleTokenStream(adaptor,"token Static");
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_Modifier=new RewriteRuleTokenStream(adaptor,"token Modifier");
        RewriteRuleTokenStream stream_Main=new RewriteRuleTokenStream(adaptor,"token Main");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_print=new RewriteRuleSubtreeStream(adaptor,"rule print");
        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:92:2: ( Modifier Static VOID Main '(' STRING '[' ']' 'a' ')' '{' ( print )* '}' -> ^( Main_METHOD Modifier Static VOID Main '(' STRING '[' ']' 'a' ')' '{' ( print )* '}' ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:92:3: Modifier Static VOID Main '(' STRING '[' ']' 'a' ')' '{' ( print )* '}'
            {
            Modifier31=(Token)match(input,Modifier,FOLLOW_Modifier_in_main_method491);  
            stream_Modifier.add(Modifier31);


            Static32=(Token)match(input,Static,FOLLOW_Static_in_main_method493);  
            stream_Static.add(Static32);


            VOID33=(Token)match(input,VOID,FOLLOW_VOID_in_main_method495);  
            stream_VOID.add(VOID33);


            Main34=(Token)match(input,Main,FOLLOW_Main_in_main_method497);  
            stream_Main.add(Main34);


            char_literal35=(Token)match(input,61,FOLLOW_61_in_main_method499);  
            stream_61.add(char_literal35);


            STRING36=(Token)match(input,STRING,FOLLOW_STRING_in_main_method500);  
            stream_STRING.add(STRING36);


            char_literal37=(Token)match(input,73,FOLLOW_73_in_main_method502);  
            stream_73.add(char_literal37);


            char_literal38=(Token)match(input,74,FOLLOW_74_in_main_method503);  
            stream_74.add(char_literal38);


            char_literal39=(Token)match(input,75,FOLLOW_75_in_main_method505);  
            stream_75.add(char_literal39);


            char_literal40=(Token)match(input,62,FOLLOW_62_in_main_method507);  
            stream_62.add(char_literal40);


            char_literal41=(Token)match(input,82,FOLLOW_82_in_main_method509);  
            stream_82.add(char_literal41);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:92:57: ( print )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==System) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:92:57: print
            	    {
            	    pushFollow(FOLLOW_print_in_main_method510);
            	    print42=print();

            	    state._fsp--;

            	    stream_print.add(print42.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            char_literal43=(Token)match(input,83,FOLLOW_83_in_main_method512);  
            stream_83.add(char_literal43);


            // AST REWRITE
            // elements: Modifier, 75, Static, VOID, 83, Main, 61, 74, STRING, 73, 82, 62, print
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 92:66: -> ^( Main_METHOD Modifier Static VOID Main '(' STRING '[' ']' 'a' ')' '{' ( print )* '}' )
            {
                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:92:69: ^( Main_METHOD Modifier Static VOID Main '(' STRING '[' ']' 'a' ')' '{' ( print )* '}' )
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
                stream_61.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_STRING.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_73.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_74.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_75.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_62.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_82.nextNode()
                );

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:92:138: ( print )*
                while ( stream_print.hasNext() ) {
                    adaptor.addChild(root_1, stream_print.nextTree());

                }
                stream_print.reset();

                adaptor.addChild(root_1, 
                stream_83.nextNode()
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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:93:1: print : System Dot Out Dot Println '(' New VAR '(' ')' Dot VAR '(' ( NUM )? ')' ')' SEMICOLON -> ^( Print System Dot Out Dot Println '(' New VAR '(' ')' Dot VAR '(' ( NUM )? ')' ')' SEMICOLON ) ;
    public final ArithmeticExpressionsParser.print_return print() throws RecognitionException {
        ArithmeticExpressionsParser.print_return retval = new ArithmeticExpressionsParser.print_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token System44=null;
        Token Dot45=null;
        Token Out46=null;
        Token Dot47=null;
        Token Println48=null;
        Token char_literal49=null;
        Token New50=null;
        Token VAR51=null;
        Token char_literal52=null;
        Token char_literal53=null;
        Token Dot54=null;
        Token VAR55=null;
        Token char_literal56=null;
        Token NUM57=null;
        Token char_literal58=null;
        Token char_literal59=null;
        Token SEMICOLON60=null;

        Object System44_tree=null;
        Object Dot45_tree=null;
        Object Out46_tree=null;
        Object Dot47_tree=null;
        Object Println48_tree=null;
        Object char_literal49_tree=null;
        Object New50_tree=null;
        Object VAR51_tree=null;
        Object char_literal52_tree=null;
        Object char_literal53_tree=null;
        Object Dot54_tree=null;
        Object VAR55_tree=null;
        Object char_literal56_tree=null;
        Object NUM57_tree=null;
        Object char_literal58_tree=null;
        Object char_literal59_tree=null;
        Object SEMICOLON60_tree=null;
        RewriteRuleTokenStream stream_New=new RewriteRuleTokenStream(adaptor,"token New");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleTokenStream stream_Dot=new RewriteRuleTokenStream(adaptor,"token Dot");
        RewriteRuleTokenStream stream_Println=new RewriteRuleTokenStream(adaptor,"token Println");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_System=new RewriteRuleTokenStream(adaptor,"token System");
        RewriteRuleTokenStream stream_Out=new RewriteRuleTokenStream(adaptor,"token Out");

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:93:7: ( System Dot Out Dot Println '(' New VAR '(' ')' Dot VAR '(' ( NUM )? ')' ')' SEMICOLON -> ^( Print System Dot Out Dot Println '(' New VAR '(' ')' Dot VAR '(' ( NUM )? ')' ')' SEMICOLON ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:93:8: System Dot Out Dot Println '(' New VAR '(' ')' Dot VAR '(' ( NUM )? ')' ')' SEMICOLON
            {
            System44=(Token)match(input,System,FOLLOW_System_in_print547);  
            stream_System.add(System44);


            Dot45=(Token)match(input,Dot,FOLLOW_Dot_in_print549);  
            stream_Dot.add(Dot45);


            Out46=(Token)match(input,Out,FOLLOW_Out_in_print551);  
            stream_Out.add(Out46);


            Dot47=(Token)match(input,Dot,FOLLOW_Dot_in_print553);  
            stream_Dot.add(Dot47);


            Println48=(Token)match(input,Println,FOLLOW_Println_in_print555);  
            stream_Println.add(Println48);


            char_literal49=(Token)match(input,61,FOLLOW_61_in_print557);  
            stream_61.add(char_literal49);


            New50=(Token)match(input,New,FOLLOW_New_in_print558);  
            stream_New.add(New50);


            VAR51=(Token)match(input,VAR,FOLLOW_VAR_in_print560);  
            stream_VAR.add(VAR51);


            char_literal52=(Token)match(input,61,FOLLOW_61_in_print562);  
            stream_61.add(char_literal52);


            char_literal53=(Token)match(input,62,FOLLOW_62_in_print563);  
            stream_62.add(char_literal53);


            Dot54=(Token)match(input,Dot,FOLLOW_Dot_in_print564);  
            stream_Dot.add(Dot54);


            VAR55=(Token)match(input,VAR,FOLLOW_VAR_in_print566);  
            stream_VAR.add(VAR55);


            char_literal56=(Token)match(input,61,FOLLOW_61_in_print568);  
            stream_61.add(char_literal56);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:93:63: ( NUM )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==NUM) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:93:63: NUM
                    {
                    NUM57=(Token)match(input,NUM,FOLLOW_NUM_in_print569);  
                    stream_NUM.add(NUM57);


                    }
                    break;

            }


            char_literal58=(Token)match(input,62,FOLLOW_62_in_print571);  
            stream_62.add(char_literal58);


            char_literal59=(Token)match(input,62,FOLLOW_62_in_print573);  
            stream_62.add(char_literal59);


            SEMICOLON60=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_print575);  
            stream_SEMICOLON.add(SEMICOLON60);


            // AST REWRITE
            // elements: System, 62, Out, Dot, New, 62, Println, VAR, 62, 61, SEMICOLON, 61, Dot, 61, Dot, VAR, NUM
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 93:84: -> ^( Print System Dot Out Dot Println '(' New VAR '(' ')' Dot VAR '(' ( NUM )? ')' ')' SEMICOLON )
            {
                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:93:86: ^( Print System Dot Out Dot Println '(' New VAR '(' ')' Dot VAR '(' ( NUM )? ')' ')' SEMICOLON )
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
                stream_61.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_New.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_VAR.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_61.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_62.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_Dot.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_VAR.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_61.nextNode()
                );

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:93:149: ( NUM )?
                if ( stream_NUM.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_NUM.nextNode()
                    );

                }
                stream_NUM.reset();

                adaptor.addChild(root_1, 
                stream_62.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_62.nextNode()
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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:95:1: return_type : ( VAR | NUM );
    public final ArithmeticExpressionsParser.return_type_return return_type() throws RecognitionException {
        ArithmeticExpressionsParser.return_type_return retval = new ArithmeticExpressionsParser.return_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set61=null;

        Object set61_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:96:2: ( VAR | NUM )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:
            {
            root_0 = (Object)adaptor.nil();


            set61=(Token)input.LT(1);

            if ( input.LA(1)==NUM||input.LA(1)==VAR ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set61)
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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:99:1: initialize : ( types ( '[' ']' )? VAR SEMICOLON | ( VAR )* SEMICOLON ) ;
    public final ArithmeticExpressionsParser.initialize_return initialize() throws RecognitionException {
        ArithmeticExpressionsParser.initialize_return retval = new ArithmeticExpressionsParser.initialize_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal63=null;
        Token char_literal64=null;
        Token VAR65=null;
        Token SEMICOLON66=null;
        Token VAR67=null;
        Token SEMICOLON68=null;
        ArithmeticExpressionsParser.types_return types62 =null;


        Object char_literal63_tree=null;
        Object char_literal64_tree=null;
        Object VAR65_tree=null;
        Object SEMICOLON66_tree=null;
        Object VAR67_tree=null;
        Object SEMICOLON68_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:99:11: ( ( types ( '[' ']' )? VAR SEMICOLON | ( VAR )* SEMICOLON ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:99:13: ( types ( '[' ']' )? VAR SEMICOLON | ( VAR )* SEMICOLON )
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:99:13: ( types ( '[' ']' )? VAR SEMICOLON | ( VAR )* SEMICOLON )
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
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:99:14: types ( '[' ']' )? VAR SEMICOLON
                    {
                    pushFollow(FOLLOW_types_in_initialize631);
                    types62=types();

                    state._fsp--;

                    adaptor.addChild(root_0, types62.getTree());

                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:99:19: ( '[' ']' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==73) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:99:20: '[' ']'
                            {
                            char_literal63=(Token)match(input,73,FOLLOW_73_in_initialize633); 
                            char_literal63_tree = 
                            (Object)adaptor.create(char_literal63)
                            ;
                            adaptor.addChild(root_0, char_literal63_tree);


                            char_literal64=(Token)match(input,74,FOLLOW_74_in_initialize634); 
                            char_literal64_tree = 
                            (Object)adaptor.create(char_literal64)
                            ;
                            adaptor.addChild(root_0, char_literal64_tree);


                            }
                            break;

                    }


                    VAR65=(Token)match(input,VAR,FOLLOW_VAR_in_initialize638); 
                    VAR65_tree = 
                    (Object)adaptor.create(VAR65)
                    ;
                    adaptor.addChild(root_0, VAR65_tree);


                    SEMICOLON66=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_initialize640); 
                    SEMICOLON66_tree = 
                    (Object)adaptor.create(SEMICOLON66)
                    ;
                    adaptor.addChild(root_0, SEMICOLON66_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:99:43: ( VAR )* SEMICOLON
                    {
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:99:43: ( VAR )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==VAR) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:99:43: VAR
                    	    {
                    	    VAR67=(Token)match(input,VAR,FOLLOW_VAR_in_initialize642); 
                    	    VAR67_tree = 
                    	    (Object)adaptor.create(VAR67)
                    	    ;
                    	    adaptor.addChild(root_0, VAR67_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    SEMICOLON68=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_initialize645); 
                    SEMICOLON68_tree = 
                    (Object)adaptor.create(SEMICOLON68)
                    ;
                    adaptor.addChild(root_0, SEMICOLON68_tree);


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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:101:1: initialize_1 : VAR '=' ( New | VAR ) ( Dot )? VAR '(' ( NUM | VAR )? ( ',' )? ( NUM | VAR )? ')' ;
    public final ArithmeticExpressionsParser.initialize_1_return initialize_1() throws RecognitionException {
        ArithmeticExpressionsParser.initialize_1_return retval = new ArithmeticExpressionsParser.initialize_1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR69=null;
        Token char_literal70=null;
        Token set71=null;
        Token Dot72=null;
        Token VAR73=null;
        Token char_literal74=null;
        Token set75=null;
        Token char_literal76=null;
        Token set77=null;
        Token char_literal78=null;

        Object VAR69_tree=null;
        Object char_literal70_tree=null;
        Object set71_tree=null;
        Object Dot72_tree=null;
        Object VAR73_tree=null;
        Object char_literal74_tree=null;
        Object set75_tree=null;
        Object char_literal76_tree=null;
        Object set77_tree=null;
        Object char_literal78_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:102:2: ( VAR '=' ( New | VAR ) ( Dot )? VAR '(' ( NUM | VAR )? ( ',' )? ( NUM | VAR )? ')' )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:102:4: VAR '=' ( New | VAR ) ( Dot )? VAR '(' ( NUM | VAR )? ( ',' )? ( NUM | VAR )? ')'
            {
            root_0 = (Object)adaptor.nil();


            VAR69=(Token)match(input,VAR,FOLLOW_VAR_in_initialize_1655); 
            VAR69_tree = 
            (Object)adaptor.create(VAR69)
            ;
            adaptor.addChild(root_0, VAR69_tree);


            char_literal70=(Token)match(input,71,FOLLOW_71_in_initialize_1657); 
            char_literal70_tree = 
            (Object)adaptor.create(char_literal70)
            ;
            adaptor.addChild(root_0, char_literal70_tree);


            set71=(Token)input.LT(1);

            if ( input.LA(1)==New||input.LA(1)==VAR ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set71)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:102:22: ( Dot )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Dot) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:102:22: Dot
                    {
                    Dot72=(Token)match(input,Dot,FOLLOW_Dot_in_initialize_1665); 
                    Dot72_tree = 
                    (Object)adaptor.create(Dot72)
                    ;
                    adaptor.addChild(root_0, Dot72_tree);


                    }
                    break;

            }


            VAR73=(Token)match(input,VAR,FOLLOW_VAR_in_initialize_1668); 
            VAR73_tree = 
            (Object)adaptor.create(VAR73)
            ;
            adaptor.addChild(root_0, VAR73_tree);


            char_literal74=(Token)match(input,61,FOLLOW_61_in_initialize_1670); 
            char_literal74_tree = 
            (Object)adaptor.create(char_literal74)
            ;
            adaptor.addChild(root_0, char_literal74_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:102:34: ( NUM | VAR )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==NUM||LA15_0==VAR) ) {
                alt15=1;
            }
            switch (alt15) {
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


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:102:44: ( ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==66) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:102:44: ','
                    {
                    char_literal76=(Token)match(input,66,FOLLOW_66_in_initialize_1677); 
                    char_literal76_tree = 
                    (Object)adaptor.create(char_literal76)
                    ;
                    adaptor.addChild(root_0, char_literal76_tree);


                    }
                    break;

            }


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:102:48: ( NUM | VAR )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==NUM||LA17_0==VAR) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:
                    {
                    set77=(Token)input.LT(1);

                    if ( input.LA(1)==NUM||input.LA(1)==VAR ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set77)
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


            char_literal78=(Token)match(input,62,FOLLOW_62_in_initialize_1686); 
            char_literal78_tree = 
            (Object)adaptor.create(char_literal78)
            ;
            adaptor.addChild(root_0, char_literal78_tree);


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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:103:1: sys_print : System Dot Out Dot Println '(' ( NUM | VAR Dot VAR '(' ( NUM )? ')' ) ')' SEMICOLON ;
    public final ArithmeticExpressionsParser.sys_print_return sys_print() throws RecognitionException {
        ArithmeticExpressionsParser.sys_print_return retval = new ArithmeticExpressionsParser.sys_print_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token System79=null;
        Token Dot80=null;
        Token Out81=null;
        Token Dot82=null;
        Token Println83=null;
        Token char_literal84=null;
        Token NUM85=null;
        Token VAR86=null;
        Token Dot87=null;
        Token VAR88=null;
        Token char_literal89=null;
        Token NUM90=null;
        Token char_literal91=null;
        Token char_literal92=null;
        Token SEMICOLON93=null;

        Object System79_tree=null;
        Object Dot80_tree=null;
        Object Out81_tree=null;
        Object Dot82_tree=null;
        Object Println83_tree=null;
        Object char_literal84_tree=null;
        Object NUM85_tree=null;
        Object VAR86_tree=null;
        Object Dot87_tree=null;
        Object VAR88_tree=null;
        Object char_literal89_tree=null;
        Object NUM90_tree=null;
        Object char_literal91_tree=null;
        Object char_literal92_tree=null;
        Object SEMICOLON93_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:104:2: ( System Dot Out Dot Println '(' ( NUM | VAR Dot VAR '(' ( NUM )? ')' ) ')' SEMICOLON )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:104:4: System Dot Out Dot Println '(' ( NUM | VAR Dot VAR '(' ( NUM )? ')' ) ')' SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            System79=(Token)match(input,System,FOLLOW_System_in_sys_print695); 
            System79_tree = 
            (Object)adaptor.create(System79)
            ;
            adaptor.addChild(root_0, System79_tree);


            Dot80=(Token)match(input,Dot,FOLLOW_Dot_in_sys_print697); 
            Dot80_tree = 
            (Object)adaptor.create(Dot80)
            ;
            adaptor.addChild(root_0, Dot80_tree);


            Out81=(Token)match(input,Out,FOLLOW_Out_in_sys_print699); 
            Out81_tree = 
            (Object)adaptor.create(Out81)
            ;
            adaptor.addChild(root_0, Out81_tree);


            Dot82=(Token)match(input,Dot,FOLLOW_Dot_in_sys_print701); 
            Dot82_tree = 
            (Object)adaptor.create(Dot82)
            ;
            adaptor.addChild(root_0, Dot82_tree);


            Println83=(Token)match(input,Println,FOLLOW_Println_in_sys_print703); 
            Println83_tree = 
            (Object)adaptor.create(Println83)
            ;
            adaptor.addChild(root_0, Println83_tree);


            char_literal84=(Token)match(input,61,FOLLOW_61_in_sys_print705); 
            char_literal84_tree = 
            (Object)adaptor.create(char_literal84)
            ;
            adaptor.addChild(root_0, char_literal84_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:104:34: ( NUM | VAR Dot VAR '(' ( NUM )? ')' )
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
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:104:35: NUM
                    {
                    NUM85=(Token)match(input,NUM,FOLLOW_NUM_in_sys_print707); 
                    NUM85_tree = 
                    (Object)adaptor.create(NUM85)
                    ;
                    adaptor.addChild(root_0, NUM85_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:104:39: VAR Dot VAR '(' ( NUM )? ')'
                    {
                    VAR86=(Token)match(input,VAR,FOLLOW_VAR_in_sys_print709); 
                    VAR86_tree = 
                    (Object)adaptor.create(VAR86)
                    ;
                    adaptor.addChild(root_0, VAR86_tree);


                    Dot87=(Token)match(input,Dot,FOLLOW_Dot_in_sys_print711); 
                    Dot87_tree = 
                    (Object)adaptor.create(Dot87)
                    ;
                    adaptor.addChild(root_0, Dot87_tree);


                    VAR88=(Token)match(input,VAR,FOLLOW_VAR_in_sys_print713); 
                    VAR88_tree = 
                    (Object)adaptor.create(VAR88)
                    ;
                    adaptor.addChild(root_0, VAR88_tree);


                    char_literal89=(Token)match(input,61,FOLLOW_61_in_sys_print715); 
                    char_literal89_tree = 
                    (Object)adaptor.create(char_literal89)
                    ;
                    adaptor.addChild(root_0, char_literal89_tree);


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:104:54: ( NUM )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NUM) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:104:54: NUM
                            {
                            NUM90=(Token)match(input,NUM,FOLLOW_NUM_in_sys_print716); 
                            NUM90_tree = 
                            (Object)adaptor.create(NUM90)
                            ;
                            adaptor.addChild(root_0, NUM90_tree);


                            }
                            break;

                    }


                    char_literal91=(Token)match(input,62,FOLLOW_62_in_sys_print718); 
                    char_literal91_tree = 
                    (Object)adaptor.create(char_literal91)
                    ;
                    adaptor.addChild(root_0, char_literal91_tree);


                    }
                    break;

            }


            char_literal92=(Token)match(input,62,FOLLOW_62_in_sys_print722); 
            char_literal92_tree = 
            (Object)adaptor.create(char_literal92)
            ;
            adaptor.addChild(root_0, char_literal92_tree);


            SEMICOLON93=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_sys_print724); 
            SEMICOLON93_tree = 
            (Object)adaptor.create(SEMICOLON93)
            ;
            adaptor.addChild(root_0, SEMICOLON93_tree);


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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:105:1: object : ( ob_cho | ( VAR )? | NUM );
    public final ArithmeticExpressionsParser.object_return object() throws RecognitionException {
        ArithmeticExpressionsParser.object_return retval = new ArithmeticExpressionsParser.object_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR95=null;
        Token NUM96=null;
        ArithmeticExpressionsParser.ob_cho_return ob_cho94 =null;


        Object VAR95_tree=null;
        Object NUM96_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:105:8: ( ob_cho | ( VAR )? | NUM )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt21=1;
                }
                break;
            case VAR:
                {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==Dot) ) {
                    alt21=1;
                }
                else if ( (LA21_2==EOF||LA21_2==60||LA21_2==62||LA21_2==70||LA21_2==72) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;

                }
                }
                break;
            case EOF:
            case 60:
            case 62:
            case 70:
            case 72:
                {
                alt21=2;
                }
                break;
            case NUM:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:105:10: ob_cho
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ob_cho_in_object731);
                    ob_cho94=ob_cho();

                    state._fsp--;

                    adaptor.addChild(root_0, ob_cho94.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:105:19: ( VAR )?
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:105:19: ( VAR )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==VAR) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:105:19: VAR
                            {
                            VAR95=(Token)match(input,VAR,FOLLOW_VAR_in_object735); 
                            VAR95_tree = 
                            (Object)adaptor.create(VAR95)
                            ;
                            adaptor.addChild(root_0, VAR95_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:105:26: NUM
                    {
                    root_0 = (Object)adaptor.nil();


                    NUM96=(Token)match(input,NUM,FOLLOW_NUM_in_object740); 
                    NUM96_tree = 
                    (Object)adaptor.create(NUM96)
                    ;
                    adaptor.addChild(root_0, NUM96_tree);


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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:107:1: ob_body : ( '!' )? VAR Dot VAR '(' ( NUM | VAR ) ( generalArithExpr ) ')' ;
    public final ArithmeticExpressionsParser.ob_body_return ob_body() throws RecognitionException {
        ArithmeticExpressionsParser.ob_body_return retval = new ArithmeticExpressionsParser.ob_body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal97=null;
        Token VAR98=null;
        Token Dot99=null;
        Token VAR100=null;
        Token char_literal101=null;
        Token set102=null;
        Token char_literal104=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr103 =null;


        Object char_literal97_tree=null;
        Object VAR98_tree=null;
        Object Dot99_tree=null;
        Object VAR100_tree=null;
        Object char_literal101_tree=null;
        Object set102_tree=null;
        Object char_literal104_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:107:9: ( ( '!' )? VAR Dot VAR '(' ( NUM | VAR ) ( generalArithExpr ) ')' )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:107:11: ( '!' )? VAR Dot VAR '(' ( NUM | VAR ) ( generalArithExpr ) ')'
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:107:11: ( '!' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==59) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:107:12: '!'
                    {
                    char_literal97=(Token)match(input,59,FOLLOW_59_in_ob_body749); 
                    char_literal97_tree = 
                    (Object)adaptor.create(char_literal97)
                    ;
                    adaptor.addChild(root_0, char_literal97_tree);


                    }
                    break;

            }


            VAR98=(Token)match(input,VAR,FOLLOW_VAR_in_ob_body753); 
            VAR98_tree = 
            (Object)adaptor.create(VAR98)
            ;
            adaptor.addChild(root_0, VAR98_tree);


            Dot99=(Token)match(input,Dot,FOLLOW_Dot_in_ob_body755); 
            Dot99_tree = 
            (Object)adaptor.create(Dot99)
            ;
            adaptor.addChild(root_0, Dot99_tree);


            VAR100=(Token)match(input,VAR,FOLLOW_VAR_in_ob_body757); 
            VAR100_tree = 
            (Object)adaptor.create(VAR100)
            ;
            adaptor.addChild(root_0, VAR100_tree);


            char_literal101=(Token)match(input,61,FOLLOW_61_in_ob_body759); 
            char_literal101_tree = 
            (Object)adaptor.create(char_literal101)
            ;
            adaptor.addChild(root_0, char_literal101_tree);


            set102=(Token)input.LT(1);

            if ( input.LA(1)==NUM||input.LA(1)==VAR ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set102)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:107:45: ( generalArithExpr )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:107:46: generalArithExpr
            {
            pushFollow(FOLLOW_generalArithExpr_in_ob_body769);
            generalArithExpr103=generalArithExpr();

            state._fsp--;

            adaptor.addChild(root_0, generalArithExpr103.getTree());

            }


            char_literal104=(Token)match(input,62,FOLLOW_62_in_ob_body772); 
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
    // $ANTLR end "ob_body"


    public static class ob_cho_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ob_cho"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:108:1: ob_cho : ( ( '!' )? VAR Dot VAR '(' ( NUM | VAR )? ')' | ob_body );
    public final ArithmeticExpressionsParser.ob_cho_return ob_cho() throws RecognitionException {
        ArithmeticExpressionsParser.ob_cho_return retval = new ArithmeticExpressionsParser.ob_cho_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal105=null;
        Token VAR106=null;
        Token Dot107=null;
        Token VAR108=null;
        Token char_literal109=null;
        Token set110=null;
        Token char_literal111=null;
        ArithmeticExpressionsParser.ob_body_return ob_body112 =null;


        Object char_literal105_tree=null;
        Object VAR106_tree=null;
        Object Dot107_tree=null;
        Object VAR108_tree=null;
        Object char_literal109_tree=null;
        Object set110_tree=null;
        Object char_literal111_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:108:8: ( ( '!' )? VAR Dot VAR '(' ( NUM | VAR )? ')' | ob_body )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==59) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==VAR) ) {
                    int LA25_2 = input.LA(3);

                    if ( (LA25_2==Dot) ) {
                        int LA25_3 = input.LA(4);

                        if ( (LA25_3==VAR) ) {
                            int LA25_4 = input.LA(5);

                            if ( (LA25_4==61) ) {
                                int LA25_5 = input.LA(6);

                                if ( (LA25_5==NUM||LA25_5==VAR) ) {
                                    int LA25_6 = input.LA(7);

                                    if ( (LA25_6==DNUM||LA25_6==Fun||LA25_6==Minus||LA25_6==NUM||LA25_6==VAR||LA25_6==61) ) {
                                        alt25=2;
                                    }
                                    else if ( (LA25_6==62) ) {
                                        alt25=1;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 25, 6, input);

                                        throw nvae;

                                    }
                                }
                                else if ( (LA25_5==62) ) {
                                    alt25=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 25, 5, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 25, 4, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 25, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA25_0==VAR) ) {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==Dot) ) {
                    int LA25_3 = input.LA(3);

                    if ( (LA25_3==VAR) ) {
                        int LA25_4 = input.LA(4);

                        if ( (LA25_4==61) ) {
                            int LA25_5 = input.LA(5);

                            if ( (LA25_5==NUM||LA25_5==VAR) ) {
                                int LA25_6 = input.LA(6);

                                if ( (LA25_6==DNUM||LA25_6==Fun||LA25_6==Minus||LA25_6==NUM||LA25_6==VAR||LA25_6==61) ) {
                                    alt25=2;
                                }
                                else if ( (LA25_6==62) ) {
                                    alt25=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 25, 6, input);

                                    throw nvae;

                                }
                            }
                            else if ( (LA25_5==62) ) {
                                alt25=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 25, 5, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 25, 4, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 3, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:108:9: ( '!' )? VAR Dot VAR '(' ( NUM | VAR )? ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:108:9: ( '!' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==59) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:108:10: '!'
                            {
                            char_literal105=(Token)match(input,59,FOLLOW_59_in_ob_cho779); 
                            char_literal105_tree = 
                            (Object)adaptor.create(char_literal105)
                            ;
                            adaptor.addChild(root_0, char_literal105_tree);


                            }
                            break;

                    }


                    VAR106=(Token)match(input,VAR,FOLLOW_VAR_in_ob_cho783); 
                    VAR106_tree = 
                    (Object)adaptor.create(VAR106)
                    ;
                    adaptor.addChild(root_0, VAR106_tree);


                    Dot107=(Token)match(input,Dot,FOLLOW_Dot_in_ob_cho785); 
                    Dot107_tree = 
                    (Object)adaptor.create(Dot107)
                    ;
                    adaptor.addChild(root_0, Dot107_tree);


                    VAR108=(Token)match(input,VAR,FOLLOW_VAR_in_ob_cho787); 
                    VAR108_tree = 
                    (Object)adaptor.create(VAR108)
                    ;
                    adaptor.addChild(root_0, VAR108_tree);


                    char_literal109=(Token)match(input,61,FOLLOW_61_in_ob_cho789); 
                    char_literal109_tree = 
                    (Object)adaptor.create(char_literal109)
                    ;
                    adaptor.addChild(root_0, char_literal109_tree);


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:108:32: ( NUM | VAR )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==NUM||LA24_0==VAR) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:
                            {
                            set110=(Token)input.LT(1);

                            if ( input.LA(1)==NUM||input.LA(1)==VAR ) {
                                input.consume();
                                adaptor.addChild(root_0, 
                                (Object)adaptor.create(set110)
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


                    char_literal111=(Token)match(input,62,FOLLOW_62_in_ob_cho799); 
                    char_literal111_tree = 
                    (Object)adaptor.create(char_literal111)
                    ;
                    adaptor.addChild(root_0, char_literal111_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:108:50: ob_body
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ob_body_in_ob_cho803);
                    ob_body112=ob_body();

                    state._fsp--;

                    adaptor.addChild(root_0, ob_body112.getTree());

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


    public static class params_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:109:1: params : '(' ( ( types VAR | VAR VAR ) ( ',' types VAR )* )? ')' ;
    public final ArithmeticExpressionsParser.params_return params() throws RecognitionException {
        ArithmeticExpressionsParser.params_return retval = new ArithmeticExpressionsParser.params_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal113=null;
        Token VAR115=null;
        Token VAR116=null;
        Token VAR117=null;
        Token char_literal118=null;
        Token VAR120=null;
        Token char_literal121=null;
        ArithmeticExpressionsParser.types_return types114 =null;

        ArithmeticExpressionsParser.types_return types119 =null;


        Object char_literal113_tree=null;
        Object VAR115_tree=null;
        Object VAR116_tree=null;
        Object VAR117_tree=null;
        Object char_literal118_tree=null;
        Object VAR120_tree=null;
        Object char_literal121_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:109:8: ( '(' ( ( types VAR | VAR VAR ) ( ',' types VAR )* )? ')' )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:109:10: '(' ( ( types VAR | VAR VAR ) ( ',' types VAR )* )? ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal113=(Token)match(input,61,FOLLOW_61_in_params811); 
            char_literal113_tree = 
            (Object)adaptor.create(char_literal113)
            ;
            adaptor.addChild(root_0, char_literal113_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:109:13: ( ( types VAR | VAR VAR ) ( ',' types VAR )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==BOOLEAN||LA28_0==DOUBLE||LA28_0==INT||LA28_0==STRING||LA28_0==VAR) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:109:14: ( types VAR | VAR VAR ) ( ',' types VAR )*
                    {
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:109:14: ( types VAR | VAR VAR )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==BOOLEAN||LA26_0==DOUBLE||LA26_0==INT||LA26_0==STRING) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==VAR) ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;

                    }
                    switch (alt26) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:109:15: types VAR
                            {
                            pushFollow(FOLLOW_types_in_params814);
                            types114=types();

                            state._fsp--;

                            adaptor.addChild(root_0, types114.getTree());

                            VAR115=(Token)match(input,VAR,FOLLOW_VAR_in_params816); 
                            VAR115_tree = 
                            (Object)adaptor.create(VAR115)
                            ;
                            adaptor.addChild(root_0, VAR115_tree);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:109:25: VAR VAR
                            {
                            VAR116=(Token)match(input,VAR,FOLLOW_VAR_in_params818); 
                            VAR116_tree = 
                            (Object)adaptor.create(VAR116)
                            ;
                            adaptor.addChild(root_0, VAR116_tree);


                            VAR117=(Token)match(input,VAR,FOLLOW_VAR_in_params820); 
                            VAR117_tree = 
                            (Object)adaptor.create(VAR117)
                            ;
                            adaptor.addChild(root_0, VAR117_tree);


                            }
                            break;

                    }


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:109:34: ( ',' types VAR )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==66) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:109:35: ',' types VAR
                    	    {
                    	    char_literal118=(Token)match(input,66,FOLLOW_66_in_params824); 
                    	    char_literal118_tree = 
                    	    (Object)adaptor.create(char_literal118)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal118_tree);


                    	    pushFollow(FOLLOW_types_in_params826);
                    	    types119=types();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, types119.getTree());

                    	    VAR120=(Token)match(input,VAR,FOLLOW_VAR_in_params828); 
                    	    VAR120_tree = 
                    	    (Object)adaptor.create(VAR120)
                    	    ;
                    	    adaptor.addChild(root_0, VAR120_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal121=(Token)match(input,62,FOLLOW_62_in_params834); 
            char_literal121_tree = 
            (Object)adaptor.create(char_literal121)
            ;
            adaptor.addChild(root_0, char_literal121_tree);


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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:110:1: decl : ( int_dec -> ^( Int_dec int_dec ) | double_dec -> ^( Double_dec double_dec ) );
    public final ArithmeticExpressionsParser.decl_return decl() throws RecognitionException {
        ArithmeticExpressionsParser.decl_return retval = new ArithmeticExpressionsParser.decl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.int_dec_return int_dec122 =null;

        ArithmeticExpressionsParser.double_dec_return double_dec123 =null;


        RewriteRuleSubtreeStream stream_int_dec=new RewriteRuleSubtreeStream(adaptor,"rule int_dec");
        RewriteRuleSubtreeStream stream_double_dec=new RewriteRuleSubtreeStream(adaptor,"rule double_dec");
        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:110:9: ( int_dec -> ^( Int_dec int_dec ) | double_dec -> ^( Double_dec double_dec ) )
            int alt29=2;
            switch ( input.LA(1) ) {
            case Modifier:
                {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==INT) ) {
                    alt29=1;
                }
                else if ( (LA29_1==DOUBLE) ) {
                    alt29=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt29=1;
                }
                break;
            case DOUBLE:
                {
                alt29=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:111:2: int_dec
                    {
                    pushFollow(FOLLOW_int_dec_in_decl848);
                    int_dec122=int_dec();

                    state._fsp--;

                    stream_int_dec.add(int_dec122.getTree());

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
                    // 111:10: -> ^( Int_dec int_dec )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:111:13: ^( Int_dec int_dec )
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
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:112:3: double_dec
                    {
                    pushFollow(FOLLOW_double_dec_in_decl860);
                    double_dec123=double_dec();

                    state._fsp--;

                    stream_double_dec.add(double_dec123.getTree());

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
                    // 112:14: -> ^( Double_dec double_dec )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:112:17: ^( Double_dec double_dec )
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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:114:2: while_condition : ( '(' condition ')' | object );
    public final ArithmeticExpressionsParser.while_condition_return while_condition() throws RecognitionException {
        ArithmeticExpressionsParser.while_condition_return retval = new ArithmeticExpressionsParser.while_condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal124=null;
        Token char_literal126=null;
        ArithmeticExpressionsParser.condition_return condition125 =null;

        ArithmeticExpressionsParser.object_return object127 =null;


        Object char_literal124_tree=null;
        Object char_literal126_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:115:4: ( '(' condition ')' | object )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==61) ) {
                alt30=1;
            }
            else if ( (LA30_0==EOF||LA30_0==NUM||LA30_0==VAR||(LA30_0 >= 59 && LA30_0 <= 60)||LA30_0==62||LA30_0==70||LA30_0==72) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:115:6: '(' condition ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal124=(Token)match(input,61,FOLLOW_61_in_while_condition881); 
                    char_literal124_tree = 
                    (Object)adaptor.create(char_literal124)
                    ;
                    adaptor.addChild(root_0, char_literal124_tree);


                    pushFollow(FOLLOW_condition_in_while_condition883);
                    condition125=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, condition125.getTree());

                    char_literal126=(Token)match(input,62,FOLLOW_62_in_while_condition885); 
                    char_literal126_tree = 
                    (Object)adaptor.create(char_literal126)
                    ;
                    adaptor.addChild(root_0, char_literal126_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:115:24: object
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_object_in_while_condition887);
                    object127=object();

                    state._fsp--;

                    adaptor.addChild(root_0, object127.getTree());

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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:116:1: whilestmt : 'while' '(' while_condition ')' '{' ( stmt )* '}' -> ^( Whilestmt 'while' '(' while_condition ')' '{' ( stmt )* '}' ) ;
    public final ArithmeticExpressionsParser.whilestmt_return whilestmt() throws RecognitionException {
        ArithmeticExpressionsParser.whilestmt_return retval = new ArithmeticExpressionsParser.whilestmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal128=null;
        Token char_literal129=null;
        Token char_literal131=null;
        Token char_literal132=null;
        Token char_literal134=null;
        ArithmeticExpressionsParser.while_condition_return while_condition130 =null;

        ArithmeticExpressionsParser.stmt_return stmt133 =null;


        Object string_literal128_tree=null;
        Object char_literal129_tree=null;
        Object char_literal131_tree=null;
        Object char_literal132_tree=null;
        Object char_literal134_tree=null;
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleSubtreeStream stream_while_condition=new RewriteRuleSubtreeStream(adaptor,"rule while_condition");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:116:11: ( 'while' '(' while_condition ')' '{' ( stmt )* '}' -> ^( Whilestmt 'while' '(' while_condition ')' '{' ( stmt )* '}' ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:2: 'while' '(' while_condition ')' '{' ( stmt )* '}'
            {
            string_literal128=(Token)match(input,81,FOLLOW_81_in_whilestmt896);  
            stream_81.add(string_literal128);


            char_literal129=(Token)match(input,61,FOLLOW_61_in_whilestmt898);  
            stream_61.add(char_literal129);


            pushFollow(FOLLOW_while_condition_in_whilestmt900);
            while_condition130=while_condition();

            state._fsp--;

            stream_while_condition.add(while_condition130.getTree());

            char_literal131=(Token)match(input,62,FOLLOW_62_in_whilestmt902);  
            stream_62.add(char_literal131);


            char_literal132=(Token)match(input,82,FOLLOW_82_in_whilestmt904);  
            stream_82.add(char_literal132);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:38: ( stmt )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==BOOLEAN||LA31_0==DOUBLE||LA31_0==INT||(LA31_0 >= Modifier && LA31_0 <= NUM)||LA31_0==SEMICOLON||LA31_0==STRING||LA31_0==System||LA31_0==VAR||(LA31_0 >= 77 && LA31_0 <= 78)||LA31_0==81) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:117:38: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_whilestmt906);
            	    stmt133=stmt();

            	    state._fsp--;

            	    stream_stmt.add(stmt133.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            char_literal134=(Token)match(input,83,FOLLOW_83_in_whilestmt909);  
            stream_83.add(char_literal134);


            // AST REWRITE
            // elements: 81, 62, 83, 82, stmt, while_condition, 61
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 118:3: -> ^( Whilestmt 'while' '(' while_condition ')' '{' ( stmt )* '}' )
            {
                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:118:6: ^( Whilestmt 'while' '(' while_condition ')' '{' ( stmt )* '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Whilestmt, "Whilestmt")
                , root_1);

                adaptor.addChild(root_1, 
                stream_81.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_61.nextNode()
                );

                adaptor.addChild(root_1, stream_while_condition.nextTree());

                adaptor.addChild(root_1, 
                stream_62.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_82.nextNode()
                );

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:118:54: ( stmt )*
                while ( stream_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmt.nextTree());

                }
                stream_stmt.reset();

                adaptor.addChild(root_1, 
                stream_83.nextNode()
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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:123:1: ifstmt : 'if' '(' ( '!' )? ( '(' )? if_nor ( ')' )? ')' ( '{' )? ( stmt )* ( '}' )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )? ;
    public final ArithmeticExpressionsParser.ifstmt_return ifstmt() throws RecognitionException {
        ArithmeticExpressionsParser.ifstmt_return retval = new ArithmeticExpressionsParser.ifstmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal135=null;
        Token char_literal136=null;
        Token char_literal137=null;
        Token char_literal138=null;
        Token char_literal140=null;
        Token char_literal141=null;
        Token char_literal142=null;
        Token char_literal144=null;
        Token string_literal145=null;
        Token char_literal146=null;
        Token char_literal148=null;
        Token string_literal149=null;
        Token char_literal150=null;
        Token char_literal152=null;
        ArithmeticExpressionsParser.if_nor_return if_nor139 =null;

        ArithmeticExpressionsParser.stmt_return stmt143 =null;

        ArithmeticExpressionsParser.stmt_return stmt147 =null;

        ArithmeticExpressionsParser.stmt_return stmt151 =null;


        Object string_literal135_tree=null;
        Object char_literal136_tree=null;
        Object char_literal137_tree=null;
        Object char_literal138_tree=null;
        Object char_literal140_tree=null;
        Object char_literal141_tree=null;
        Object char_literal142_tree=null;
        Object char_literal144_tree=null;
        Object string_literal145_tree=null;
        Object char_literal146_tree=null;
        Object char_literal148_tree=null;
        Object string_literal149_tree=null;
        Object char_literal150_tree=null;
        Object char_literal152_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:123:9: ( 'if' '(' ( '!' )? ( '(' )? if_nor ( ')' )? ')' ( '{' )? ( stmt )* ( '}' )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )? )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:2: 'if' '(' ( '!' )? ( '(' )? if_nor ( ')' )? ')' ( '{' )? ( stmt )* ( '}' )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal135=(Token)match(input,78,FOLLOW_78_in_ifstmt954); 
            string_literal135_tree = 
            (Object)adaptor.create(string_literal135)
            ;
            adaptor.addChild(root_0, string_literal135_tree);


            char_literal136=(Token)match(input,61,FOLLOW_61_in_ifstmt956); 
            char_literal136_tree = 
            (Object)adaptor.create(char_literal136)
            ;
            adaptor.addChild(root_0, char_literal136_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:11: ( '!' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==59) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:12: '!'
                    {
                    char_literal137=(Token)match(input,59,FOLLOW_59_in_ifstmt959); 
                    char_literal137_tree = 
                    (Object)adaptor.create(char_literal137)
                    ;
                    adaptor.addChild(root_0, char_literal137_tree);


                    }
                    break;

            }


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:19: ( '(' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==61) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:20: '('
                    {
                    char_literal138=(Token)match(input,61,FOLLOW_61_in_ifstmt965); 
                    char_literal138_tree = 
                    (Object)adaptor.create(char_literal138)
                    ;
                    adaptor.addChild(root_0, char_literal138_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_if_nor_in_ifstmt969);
            if_nor139=if_nor();

            state._fsp--;

            adaptor.addChild(root_0, if_nor139.getTree());

            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:33: ( ')' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==62) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==62) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:34: ')'
                    {
                    char_literal140=(Token)match(input,62,FOLLOW_62_in_ifstmt972); 
                    char_literal140_tree = 
                    (Object)adaptor.create(char_literal140)
                    ;
                    adaptor.addChild(root_0, char_literal140_tree);


                    }
                    break;

            }


            char_literal141=(Token)match(input,62,FOLLOW_62_in_ifstmt976); 
            char_literal141_tree = 
            (Object)adaptor.create(char_literal141)
            ;
            adaptor.addChild(root_0, char_literal141_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:44: ( '{' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==82) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:45: '{'
                    {
                    char_literal142=(Token)match(input,82,FOLLOW_82_in_ifstmt979); 
                    char_literal142_tree = 
                    (Object)adaptor.create(char_literal142)
                    ;
                    adaptor.addChild(root_0, char_literal142_tree);


                    }
                    break;

            }


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:51: ( stmt )*
            loop36:
            do {
                int alt36=2;
                switch ( input.LA(1) ) {
                case Modifier:
                    {
                    alt36=1;
                    }
                    break;
                case INT:
                    {
                    alt36=1;
                    }
                    break;
                case DOUBLE:
                    {
                    alt36=1;
                    }
                    break;
                case VAR:
                    {
                    alt36=1;
                    }
                    break;
                case STRING:
                    {
                    alt36=1;
                    }
                    break;
                case 78:
                    {
                    alt36=1;
                    }
                    break;
                case 81:
                    {
                    alt36=1;
                    }
                    break;
                case 77:
                    {
                    alt36=1;
                    }
                    break;
                case NUM:
                    {
                    alt36=1;
                    }
                    break;
                case BOOLEAN:
                    {
                    alt36=1;
                    }
                    break;
                case SEMICOLON:
                    {
                    alt36=1;
                    }
                    break;
                case System:
                    {
                    alt36=1;
                    }
                    break;

                }

                switch (alt36) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:51: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_ifstmt983);
            	    stmt143=stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stmt143.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:57: ( '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==83) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:58: '}'
                    {
                    char_literal144=(Token)match(input,83,FOLLOW_83_in_ifstmt987); 
                    char_literal144_tree = 
                    (Object)adaptor.create(char_literal144)
                    ;
                    adaptor.addChild(root_0, char_literal144_tree);


                    }
                    break;

            }


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:64: ( 'else' ( '{' )? ( stmt )* ( '}' )? )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==76) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:65: 'else' ( '{' )? ( stmt )* ( '}' )?
                    {
                    string_literal145=(Token)match(input,76,FOLLOW_76_in_ifstmt992); 
                    string_literal145_tree = 
                    (Object)adaptor.create(string_literal145)
                    ;
                    adaptor.addChild(root_0, string_literal145_tree);


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:72: ( '{' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==82) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:73: '{'
                            {
                            char_literal146=(Token)match(input,82,FOLLOW_82_in_ifstmt995); 
                            char_literal146_tree = 
                            (Object)adaptor.create(char_literal146)
                            ;
                            adaptor.addChild(root_0, char_literal146_tree);


                            }
                            break;

                    }


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:79: ( stmt )*
                    loop39:
                    do {
                        int alt39=2;
                        switch ( input.LA(1) ) {
                        case Modifier:
                            {
                            alt39=1;
                            }
                            break;
                        case INT:
                            {
                            alt39=1;
                            }
                            break;
                        case DOUBLE:
                            {
                            alt39=1;
                            }
                            break;
                        case VAR:
                            {
                            alt39=1;
                            }
                            break;
                        case STRING:
                            {
                            alt39=1;
                            }
                            break;
                        case 78:
                            {
                            alt39=1;
                            }
                            break;
                        case 81:
                            {
                            alt39=1;
                            }
                            break;
                        case 77:
                            {
                            alt39=1;
                            }
                            break;
                        case NUM:
                            {
                            alt39=1;
                            }
                            break;
                        case BOOLEAN:
                            {
                            alt39=1;
                            }
                            break;
                        case SEMICOLON:
                            {
                            alt39=1;
                            }
                            break;
                        case System:
                            {
                            alt39=1;
                            }
                            break;

                        }

                        switch (alt39) {
                    	case 1 :
                    	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:79: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_ifstmt999);
                    	    stmt147=stmt();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, stmt147.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:85: ( '}' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==83) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:86: '}'
                            {
                            char_literal148=(Token)match(input,83,FOLLOW_83_in_ifstmt1003); 
                            char_literal148_tree = 
                            (Object)adaptor.create(char_literal148)
                            ;
                            adaptor.addChild(root_0, char_literal148_tree);


                            }
                            break;

                    }


                    }
                    break;

            }


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:94: ( 'else' ( '{' )? ( stmt )* ( '}' )? )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==76) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:95: 'else' ( '{' )? ( stmt )* ( '}' )?
                    {
                    string_literal149=(Token)match(input,76,FOLLOW_76_in_ifstmt1010); 
                    string_literal149_tree = 
                    (Object)adaptor.create(string_literal149)
                    ;
                    adaptor.addChild(root_0, string_literal149_tree);


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:102: ( '{' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==82) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:103: '{'
                            {
                            char_literal150=(Token)match(input,82,FOLLOW_82_in_ifstmt1013); 
                            char_literal150_tree = 
                            (Object)adaptor.create(char_literal150)
                            ;
                            adaptor.addChild(root_0, char_literal150_tree);


                            }
                            break;

                    }


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:109: ( stmt )*
                    loop43:
                    do {
                        int alt43=2;
                        switch ( input.LA(1) ) {
                        case Modifier:
                            {
                            alt43=1;
                            }
                            break;
                        case INT:
                            {
                            alt43=1;
                            }
                            break;
                        case DOUBLE:
                            {
                            alt43=1;
                            }
                            break;
                        case VAR:
                            {
                            alt43=1;
                            }
                            break;
                        case STRING:
                            {
                            alt43=1;
                            }
                            break;
                        case 78:
                            {
                            alt43=1;
                            }
                            break;
                        case 81:
                            {
                            alt43=1;
                            }
                            break;
                        case 77:
                            {
                            alt43=1;
                            }
                            break;
                        case NUM:
                            {
                            alt43=1;
                            }
                            break;
                        case BOOLEAN:
                            {
                            alt43=1;
                            }
                            break;
                        case SEMICOLON:
                            {
                            alt43=1;
                            }
                            break;
                        case System:
                            {
                            alt43=1;
                            }
                            break;

                        }

                        switch (alt43) {
                    	case 1 :
                    	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:109: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_ifstmt1017);
                    	    stmt151=stmt();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, stmt151.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:115: ( '}' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==83) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:124:116: '}'
                            {
                            char_literal152=(Token)match(input,83,FOLLOW_83_in_ifstmt1021); 
                            char_literal152_tree = 
                            (Object)adaptor.create(char_literal152)
                            ;
                            adaptor.addChild(root_0, char_literal152_tree);


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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:127:2: if_cond : if_nor ;
    public final ArithmeticExpressionsParser.if_cond_return if_cond() throws RecognitionException {
        ArithmeticExpressionsParser.if_cond_return retval = new ArithmeticExpressionsParser.if_cond_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.if_nor_return if_nor153 =null;



        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:127:9: ( if_nor )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:127:12: if_nor
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_if_nor_in_if_cond1038);
            if_nor153=if_nor();

            state._fsp--;

            adaptor.addChild(root_0, if_nor153.getTree());

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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:128:2: if_nor : object ( ( '>' | '<' | '&&' ) ^ object )* ;
    public final ArithmeticExpressionsParser.if_nor_return if_nor() throws RecognitionException {
        ArithmeticExpressionsParser.if_nor_return retval = new ArithmeticExpressionsParser.if_nor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set155=null;
        ArithmeticExpressionsParser.object_return object154 =null;

        ArithmeticExpressionsParser.object_return object156 =null;


        Object set155_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:128:9: ( object ( ( '>' | '<' | '&&' ) ^ object )* )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:128:12: object ( ( '>' | '<' | '&&' ) ^ object )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_object_in_if_nor1050);
            object154=object();

            state._fsp--;

            adaptor.addChild(root_0, object154.getTree());

            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:128:19: ( ( '>' | '<' | '&&' ) ^ object )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==60||LA46_0==70||LA46_0==72) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:128:20: ( '>' | '<' | '&&' ) ^ object
            	    {
            	    set155=(Token)input.LT(1);

            	    set155=(Token)input.LT(1);

            	    if ( input.LA(1)==60||input.LA(1)==70||input.LA(1)==72 ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set155)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_object_in_if_nor1068);
            	    object156=object();

            	    state._fsp--;

            	    adaptor.addChild(root_0, object156.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:129:1: forloop : 'for' '(' ( decl ) ( condition ) SEMICOLON ( VAR change ) ')' '{' ( stmt )* '}' ;
    public final ArithmeticExpressionsParser.forloop_return forloop() throws RecognitionException {
        ArithmeticExpressionsParser.forloop_return retval = new ArithmeticExpressionsParser.forloop_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal157=null;
        Token char_literal158=null;
        Token SEMICOLON161=null;
        Token VAR162=null;
        Token char_literal164=null;
        Token char_literal165=null;
        Token char_literal167=null;
        ArithmeticExpressionsParser.decl_return decl159 =null;

        ArithmeticExpressionsParser.condition_return condition160 =null;

        ArithmeticExpressionsParser.change_return change163 =null;

        ArithmeticExpressionsParser.stmt_return stmt166 =null;


        Object string_literal157_tree=null;
        Object char_literal158_tree=null;
        Object SEMICOLON161_tree=null;
        Object VAR162_tree=null;
        Object char_literal164_tree=null;
        Object char_literal165_tree=null;
        Object char_literal167_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:129:9: ( 'for' '(' ( decl ) ( condition ) SEMICOLON ( VAR change ) ')' '{' ( stmt )* '}' )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:130:2: 'for' '(' ( decl ) ( condition ) SEMICOLON ( VAR change ) ')' '{' ( stmt )* '}'
            {
            root_0 = (Object)adaptor.nil();


            string_literal157=(Token)match(input,77,FOLLOW_77_in_forloop1083); 
            string_literal157_tree = 
            (Object)adaptor.create(string_literal157)
            ;
            adaptor.addChild(root_0, string_literal157_tree);


            char_literal158=(Token)match(input,61,FOLLOW_61_in_forloop1085); 
            char_literal158_tree = 
            (Object)adaptor.create(char_literal158)
            ;
            adaptor.addChild(root_0, char_literal158_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:130:12: ( decl )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:130:13: decl
            {
            pushFollow(FOLLOW_decl_in_forloop1088);
            decl159=decl();

            state._fsp--;

            adaptor.addChild(root_0, decl159.getTree());

            }


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:130:19: ( condition )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:130:20: condition
            {
            pushFollow(FOLLOW_condition_in_forloop1092);
            condition160=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition160.getTree());

            }


            SEMICOLON161=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_forloop1095); 
            SEMICOLON161_tree = 
            (Object)adaptor.create(SEMICOLON161)
            ;
            adaptor.addChild(root_0, SEMICOLON161_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:130:41: ( VAR change )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:130:42: VAR change
            {
            VAR162=(Token)match(input,VAR,FOLLOW_VAR_in_forloop1098); 
            VAR162_tree = 
            (Object)adaptor.create(VAR162)
            ;
            adaptor.addChild(root_0, VAR162_tree);


            pushFollow(FOLLOW_change_in_forloop1100);
            change163=change();

            state._fsp--;

            adaptor.addChild(root_0, change163.getTree());

            }


            char_literal164=(Token)match(input,62,FOLLOW_62_in_forloop1103); 
            char_literal164_tree = 
            (Object)adaptor.create(char_literal164)
            ;
            adaptor.addChild(root_0, char_literal164_tree);


            char_literal165=(Token)match(input,82,FOLLOW_82_in_forloop1105); 
            char_literal165_tree = 
            (Object)adaptor.create(char_literal165)
            ;
            adaptor.addChild(root_0, char_literal165_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:130:62: ( stmt )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==BOOLEAN||LA47_0==DOUBLE||LA47_0==INT||(LA47_0 >= Modifier && LA47_0 <= NUM)||LA47_0==SEMICOLON||LA47_0==STRING||LA47_0==System||LA47_0==VAR||(LA47_0 >= 77 && LA47_0 <= 78)||LA47_0==81) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:130:62: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_forloop1107);
            	    stmt166=stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stmt166.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            char_literal167=(Token)match(input,83,FOLLOW_83_in_forloop1110); 
            char_literal167_tree = 
            (Object)adaptor.create(char_literal167)
            ;
            adaptor.addChild(root_0, char_literal167_tree);


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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:132:1: assigment : assign -> ^( Assigment assign ) ;
    public final ArithmeticExpressionsParser.assigment_return assigment() throws RecognitionException {
        ArithmeticExpressionsParser.assigment_return retval = new ArithmeticExpressionsParser.assigment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.assign_return assign168 =null;


        RewriteRuleSubtreeStream stream_assign=new RewriteRuleSubtreeStream(adaptor,"rule assign");
        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:132:10: ( assign -> ^( Assigment assign ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:133:2: assign
            {
            pushFollow(FOLLOW_assign_in_assigment1122);
            assign168=assign();

            state._fsp--;

            stream_assign.add(assign168.getTree());

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
            // 134:2: -> ^( Assigment assign )
            {
                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:134:5: ^( Assigment assign )
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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:136:1: initialize_2 : ( Dot )? VAR '(' ( NUM | VAR )? ( ',' )? ( NUM | VAR )? ')' ;
    public final ArithmeticExpressionsParser.initialize_2_return initialize_2() throws RecognitionException {
        ArithmeticExpressionsParser.initialize_2_return retval = new ArithmeticExpressionsParser.initialize_2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Dot169=null;
        Token VAR170=null;
        Token char_literal171=null;
        Token set172=null;
        Token char_literal173=null;
        Token set174=null;
        Token char_literal175=null;

        Object Dot169_tree=null;
        Object VAR170_tree=null;
        Object char_literal171_tree=null;
        Object set172_tree=null;
        Object char_literal173_tree=null;
        Object set174_tree=null;
        Object char_literal175_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:137:2: ( ( Dot )? VAR '(' ( NUM | VAR )? ( ',' )? ( NUM | VAR )? ')' )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:137:5: ( Dot )? VAR '(' ( NUM | VAR )? ( ',' )? ( NUM | VAR )? ')'
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:137:5: ( Dot )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==Dot) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:137:5: Dot
                    {
                    Dot169=(Token)match(input,Dot,FOLLOW_Dot_in_initialize_21142); 
                    Dot169_tree = 
                    (Object)adaptor.create(Dot169)
                    ;
                    adaptor.addChild(root_0, Dot169_tree);


                    }
                    break;

            }


            VAR170=(Token)match(input,VAR,FOLLOW_VAR_in_initialize_21145); 
            VAR170_tree = 
            (Object)adaptor.create(VAR170)
            ;
            adaptor.addChild(root_0, VAR170_tree);


            char_literal171=(Token)match(input,61,FOLLOW_61_in_initialize_21147); 
            char_literal171_tree = 
            (Object)adaptor.create(char_literal171)
            ;
            adaptor.addChild(root_0, char_literal171_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:137:17: ( NUM | VAR )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==NUM||LA49_0==VAR) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:
                    {
                    set172=(Token)input.LT(1);

                    if ( input.LA(1)==NUM||input.LA(1)==VAR ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set172)
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


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:137:27: ( ',' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==66) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:137:27: ','
                    {
                    char_literal173=(Token)match(input,66,FOLLOW_66_in_initialize_21154); 
                    char_literal173_tree = 
                    (Object)adaptor.create(char_literal173)
                    ;
                    adaptor.addChild(root_0, char_literal173_tree);


                    }
                    break;

            }


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:137:31: ( NUM | VAR )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==NUM||LA51_0==VAR) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:
                    {
                    set174=(Token)input.LT(1);

                    if ( input.LA(1)==NUM||input.LA(1)==VAR ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set174)
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


            char_literal175=(Token)match(input,62,FOLLOW_62_in_initialize_21163); 
            char_literal175_tree = 
            (Object)adaptor.create(char_literal175)
            ;
            adaptor.addChild(root_0, char_literal175_tree);


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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:147:1: assign : VAR ( ( change )? '=' VAR | ( New )? ( '*' )? ( generalArithExpr | initialize_2 ) ) SEMICOLON ;
    public final ArithmeticExpressionsParser.assign_return assign() throws RecognitionException {
        ArithmeticExpressionsParser.assign_return retval = new ArithmeticExpressionsParser.assign_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR176=null;
        Token char_literal178=null;
        Token VAR179=null;
        Token New180=null;
        Token char_literal181=null;
        Token SEMICOLON184=null;
        ArithmeticExpressionsParser.change_return change177 =null;

        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr182 =null;

        ArithmeticExpressionsParser.initialize_2_return initialize_2183 =null;


        Object VAR176_tree=null;
        Object char_literal178_tree=null;
        Object VAR179_tree=null;
        Object New180_tree=null;
        Object char_literal181_tree=null;
        Object SEMICOLON184_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:147:8: ( VAR ( ( change )? '=' VAR | ( New )? ( '*' )? ( generalArithExpr | initialize_2 ) ) SEMICOLON )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:148:3: VAR ( ( change )? '=' VAR | ( New )? ( '*' )? ( generalArithExpr | initialize_2 ) ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            VAR176=(Token)match(input,VAR,FOLLOW_VAR_in_assign1203); 
            VAR176_tree = 
            (Object)adaptor.create(VAR176)
            ;
            adaptor.addChild(root_0, VAR176_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:148:7: ( ( change )? '=' VAR | ( New )? ( '*' )? ( generalArithExpr | initialize_2 ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0 >= 64 && LA56_0 <= 65)||(LA56_0 >= 67 && LA56_0 <= 68)||LA56_0==71) ) {
                alt56=1;
            }
            else if ( (LA56_0==DNUM||LA56_0==Dot||LA56_0==Fun||LA56_0==Minus||(LA56_0 >= NUM && LA56_0 <= New)||LA56_0==VAR||LA56_0==61||LA56_0==63) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }
            switch (alt56) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:148:8: ( change )? '=' VAR
                    {
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:148:8: ( change )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( ((LA52_0 >= 64 && LA52_0 <= 65)||(LA52_0 >= 67 && LA52_0 <= 68)) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:148:8: change
                            {
                            pushFollow(FOLLOW_change_in_assign1206);
                            change177=change();

                            state._fsp--;

                            adaptor.addChild(root_0, change177.getTree());

                            }
                            break;

                    }


                    char_literal178=(Token)match(input,71,FOLLOW_71_in_assign1208); 
                    char_literal178_tree = 
                    (Object)adaptor.create(char_literal178)
                    ;
                    adaptor.addChild(root_0, char_literal178_tree);


                    VAR179=(Token)match(input,VAR,FOLLOW_VAR_in_assign1211); 
                    VAR179_tree = 
                    (Object)adaptor.create(VAR179)
                    ;
                    adaptor.addChild(root_0, VAR179_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:148:26: ( New )? ( '*' )? ( generalArithExpr | initialize_2 )
                    {
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:148:26: ( New )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==New) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:148:26: New
                            {
                            New180=(Token)match(input,New,FOLLOW_New_in_assign1215); 
                            New180_tree = 
                            (Object)adaptor.create(New180)
                            ;
                            adaptor.addChild(root_0, New180_tree);


                            }
                            break;

                    }


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:148:31: ( '*' )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==63) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:148:32: '*'
                            {
                            char_literal181=(Token)match(input,63,FOLLOW_63_in_assign1219); 
                            char_literal181_tree = 
                            (Object)adaptor.create(char_literal181)
                            ;
                            adaptor.addChild(root_0, char_literal181_tree);


                            }
                            break;

                    }


                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:148:38: ( generalArithExpr | initialize_2 )
                    int alt55=2;
                    switch ( input.LA(1) ) {
                    case VAR:
                        {
                        int LA55_1 = input.LA(2);

                        if ( (LA55_1==61) ) {
                            alt55=2;
                        }
                        else if ( (LA55_1==Minus||LA55_1==Plus||LA55_1==SEMICOLON||LA55_1==63||LA55_1==69) ) {
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
                    case 61:
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
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:148:40: generalArithExpr
                            {
                            pushFollow(FOLLOW_generalArithExpr_in_assign1225);
                            generalArithExpr182=generalArithExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, generalArithExpr182.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:148:58: initialize_2
                            {
                            pushFollow(FOLLOW_initialize_2_in_assign1228);
                            initialize_2183=initialize_2();

                            state._fsp--;

                            adaptor.addChild(root_0, initialize_2183.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            SEMICOLON184=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assign1232); 
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
    // $ANTLR end "assign"


    public static class change_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "change"
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:150:1: change : ( '++' | '--' | ( '+=' | '-=' ) generalArithExpr ) ;
    public final ArithmeticExpressionsParser.change_return change() throws RecognitionException {
        ArithmeticExpressionsParser.change_return retval = new ArithmeticExpressionsParser.change_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal185=null;
        Token string_literal186=null;
        Token set187=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr188 =null;


        Object string_literal185_tree=null;
        Object string_literal186_tree=null;
        Object set187_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:150:8: ( ( '++' | '--' | ( '+=' | '-=' ) generalArithExpr ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:151:2: ( '++' | '--' | ( '+=' | '-=' ) generalArithExpr )
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:151:2: ( '++' | '--' | ( '+=' | '-=' ) generalArithExpr )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt57=1;
                }
                break;
            case 67:
                {
                alt57=2;
                }
                break;
            case 65:
            case 68:
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
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:151:3: '++'
                    {
                    string_literal185=(Token)match(input,64,FOLLOW_64_in_change1244); 
                    string_literal185_tree = 
                    (Object)adaptor.create(string_literal185)
                    ;
                    adaptor.addChild(root_0, string_literal185_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:151:8: '--'
                    {
                    string_literal186=(Token)match(input,67,FOLLOW_67_in_change1246); 
                    string_literal186_tree = 
                    (Object)adaptor.create(string_literal186)
                    ;
                    adaptor.addChild(root_0, string_literal186_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:151:13: ( '+=' | '-=' ) generalArithExpr
                    {
                    set187=(Token)input.LT(1);

                    if ( input.LA(1)==65||input.LA(1)==68 ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set187)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_generalArithExpr_in_change1253);
                    generalArithExpr188=generalArithExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, generalArithExpr188.getTree());

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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:153:1: op : ( Plus | Minus );
    public final ArithmeticExpressionsParser.op_return op() throws RecognitionException {
        ArithmeticExpressionsParser.op_return retval = new ArithmeticExpressionsParser.op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set189=null;

        Object set189_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:153:4: ( Plus | Minus )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:
            {
            root_0 = (Object)adaptor.nil();


            set189=(Token)input.LT(1);

            if ( input.LA(1)==Minus||input.LA(1)==Plus ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set189)
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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:154:2: init_1 : var_num '=' 'this' '.' VAR '(' ( VAR | NUM )? ')' ;
    public final ArithmeticExpressionsParser.init_1_return init_1() throws RecognitionException {
        ArithmeticExpressionsParser.init_1_return retval = new ArithmeticExpressionsParser.init_1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal191=null;
        Token string_literal192=null;
        Token char_literal193=null;
        Token VAR194=null;
        Token char_literal195=null;
        Token set196=null;
        Token char_literal197=null;
        ArithmeticExpressionsParser.var_num_return var_num190 =null;


        Object char_literal191_tree=null;
        Object string_literal192_tree=null;
        Object char_literal193_tree=null;
        Object VAR194_tree=null;
        Object char_literal195_tree=null;
        Object set196_tree=null;
        Object char_literal197_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:154:9: ( var_num '=' 'this' '.' VAR '(' ( VAR | NUM )? ')' )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:154:10: var_num '=' 'this' '.' VAR '(' ( VAR | NUM )? ')'
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_var_num_in_init_11272);
            var_num190=var_num();

            state._fsp--;

            adaptor.addChild(root_0, var_num190.getTree());

            char_literal191=(Token)match(input,71,FOLLOW_71_in_init_11274); 
            char_literal191_tree = 
            (Object)adaptor.create(char_literal191)
            ;
            adaptor.addChild(root_0, char_literal191_tree);


            string_literal192=(Token)match(input,80,FOLLOW_80_in_init_11276); 
            string_literal192_tree = 
            (Object)adaptor.create(string_literal192)
            ;
            adaptor.addChild(root_0, string_literal192_tree);


            char_literal193=(Token)match(input,Dot,FOLLOW_Dot_in_init_11278); 
            char_literal193_tree = 
            (Object)adaptor.create(char_literal193)
            ;
            adaptor.addChild(root_0, char_literal193_tree);


            VAR194=(Token)match(input,VAR,FOLLOW_VAR_in_init_11280); 
            VAR194_tree = 
            (Object)adaptor.create(VAR194)
            ;
            adaptor.addChild(root_0, VAR194_tree);


            char_literal195=(Token)match(input,61,FOLLOW_61_in_init_11282); 
            char_literal195_tree = 
            (Object)adaptor.create(char_literal195)
            ;
            adaptor.addChild(root_0, char_literal195_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:154:41: ( VAR | NUM )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==NUM||LA58_0==VAR) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:
                    {
                    set196=(Token)input.LT(1);

                    if ( input.LA(1)==NUM||input.LA(1)==VAR ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set196)
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


            char_literal197=(Token)match(input,62,FOLLOW_62_in_init_11290); 
            char_literal197_tree = 
            (Object)adaptor.create(char_literal197)
            ;
            adaptor.addChild(root_0, char_literal197_tree);


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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:155:2: init_2 : types var_num ;
    public final ArithmeticExpressionsParser.init_2_return init_2() throws RecognitionException {
        ArithmeticExpressionsParser.init_2_return retval = new ArithmeticExpressionsParser.init_2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.types_return types198 =null;

        ArithmeticExpressionsParser.var_num_return var_num199 =null;



        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:155:9: ( types var_num )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:155:10: types var_num
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_types_in_init_21297);
            types198=types();

            state._fsp--;

            adaptor.addChild(root_0, types198.getTree());

            pushFollow(FOLLOW_var_num_in_init_21299);
            var_num199=var_num();

            state._fsp--;

            adaptor.addChild(root_0, var_num199.getTree());

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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:156:2: init_3 : types '[' ']' var_num ;
    public final ArithmeticExpressionsParser.init_3_return init_3() throws RecognitionException {
        ArithmeticExpressionsParser.init_3_return retval = new ArithmeticExpressionsParser.init_3_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal201=null;
        Token char_literal202=null;
        ArithmeticExpressionsParser.types_return types200 =null;

        ArithmeticExpressionsParser.var_num_return var_num203 =null;


        Object char_literal201_tree=null;
        Object char_literal202_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:156:9: ( types '[' ']' var_num )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:156:10: types '[' ']' var_num
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_types_in_init_31306);
            types200=types();

            state._fsp--;

            adaptor.addChild(root_0, types200.getTree());

            char_literal201=(Token)match(input,73,FOLLOW_73_in_init_31308); 
            char_literal201_tree = 
            (Object)adaptor.create(char_literal201)
            ;
            adaptor.addChild(root_0, char_literal201_tree);


            char_literal202=(Token)match(input,74,FOLLOW_74_in_init_31310); 
            char_literal202_tree = 
            (Object)adaptor.create(char_literal202)
            ;
            adaptor.addChild(root_0, char_literal202_tree);


            pushFollow(FOLLOW_var_num_in_init_31311);
            var_num203=var_num();

            state._fsp--;

            adaptor.addChild(root_0, var_num203.getTree());

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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:157:2: init_4 : var_num '=' var_num op var_num ;
    public final ArithmeticExpressionsParser.init_4_return init_4() throws RecognitionException {
        ArithmeticExpressionsParser.init_4_return retval = new ArithmeticExpressionsParser.init_4_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal205=null;
        ArithmeticExpressionsParser.var_num_return var_num204 =null;

        ArithmeticExpressionsParser.var_num_return var_num206 =null;

        ArithmeticExpressionsParser.op_return op207 =null;

        ArithmeticExpressionsParser.var_num_return var_num208 =null;


        Object char_literal205_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:157:9: ( var_num '=' var_num op var_num )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:157:10: var_num '=' var_num op var_num
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_var_num_in_init_41318);
            var_num204=var_num();

            state._fsp--;

            adaptor.addChild(root_0, var_num204.getTree());

            char_literal205=(Token)match(input,71,FOLLOW_71_in_init_41320); 
            char_literal205_tree = 
            (Object)adaptor.create(char_literal205)
            ;
            adaptor.addChild(root_0, char_literal205_tree);


            pushFollow(FOLLOW_var_num_in_init_41321);
            var_num206=var_num();

            state._fsp--;

            adaptor.addChild(root_0, var_num206.getTree());

            pushFollow(FOLLOW_op_in_init_41323);
            op207=op();

            state._fsp--;

            adaptor.addChild(root_0, op207.getTree());

            pushFollow(FOLLOW_var_num_in_init_41325);
            var_num208=var_num();

            state._fsp--;

            adaptor.addChild(root_0, var_num208.getTree());

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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:159:2: init_5 : var_num '=' var_num ;
    public final ArithmeticExpressionsParser.init_5_return init_5() throws RecognitionException {
        ArithmeticExpressionsParser.init_5_return retval = new ArithmeticExpressionsParser.init_5_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal210=null;
        ArithmeticExpressionsParser.var_num_return var_num209 =null;

        ArithmeticExpressionsParser.var_num_return var_num211 =null;


        Object char_literal210_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:159:9: ( var_num '=' var_num )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:159:10: var_num '=' var_num
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_var_num_in_init_51334);
            var_num209=var_num();

            state._fsp--;

            adaptor.addChild(root_0, var_num209.getTree());

            char_literal210=(Token)match(input,71,FOLLOW_71_in_init_51336); 
            char_literal210_tree = 
            (Object)adaptor.create(char_literal210)
            ;
            adaptor.addChild(root_0, char_literal210_tree);


            pushFollow(FOLLOW_var_num_in_init_51338);
            var_num211=var_num();

            state._fsp--;

            adaptor.addChild(root_0, var_num211.getTree());

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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:160:2: init_6 : var_num '[' var_num ']' '=' var_num op var_num ;
    public final ArithmeticExpressionsParser.init_6_return init_6() throws RecognitionException {
        ArithmeticExpressionsParser.init_6_return retval = new ArithmeticExpressionsParser.init_6_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal213=null;
        Token char_literal215=null;
        Token char_literal216=null;
        ArithmeticExpressionsParser.var_num_return var_num212 =null;

        ArithmeticExpressionsParser.var_num_return var_num214 =null;

        ArithmeticExpressionsParser.var_num_return var_num217 =null;

        ArithmeticExpressionsParser.op_return op218 =null;

        ArithmeticExpressionsParser.var_num_return var_num219 =null;


        Object char_literal213_tree=null;
        Object char_literal215_tree=null;
        Object char_literal216_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:160:9: ( var_num '[' var_num ']' '=' var_num op var_num )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:160:10: var_num '[' var_num ']' '=' var_num op var_num
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_var_num_in_init_61346);
            var_num212=var_num();

            state._fsp--;

            adaptor.addChild(root_0, var_num212.getTree());

            char_literal213=(Token)match(input,73,FOLLOW_73_in_init_61348); 
            char_literal213_tree = 
            (Object)adaptor.create(char_literal213)
            ;
            adaptor.addChild(root_0, char_literal213_tree);


            pushFollow(FOLLOW_var_num_in_init_61349);
            var_num214=var_num();

            state._fsp--;

            adaptor.addChild(root_0, var_num214.getTree());

            char_literal215=(Token)match(input,74,FOLLOW_74_in_init_61351); 
            char_literal215_tree = 
            (Object)adaptor.create(char_literal215)
            ;
            adaptor.addChild(root_0, char_literal215_tree);


            char_literal216=(Token)match(input,71,FOLLOW_71_in_init_61352); 
            char_literal216_tree = 
            (Object)adaptor.create(char_literal216)
            ;
            adaptor.addChild(root_0, char_literal216_tree);


            pushFollow(FOLLOW_var_num_in_init_61353);
            var_num217=var_num();

            state._fsp--;

            adaptor.addChild(root_0, var_num217.getTree());

            pushFollow(FOLLOW_op_in_init_61355);
            op218=op();

            state._fsp--;

            adaptor.addChild(root_0, op218.getTree());

            pushFollow(FOLLOW_var_num_in_init_61357);
            var_num219=var_num();

            state._fsp--;

            adaptor.addChild(root_0, var_num219.getTree());

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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:161:1: var_num : ( VAR | NUM );
    public final ArithmeticExpressionsParser.var_num_return var_num() throws RecognitionException {
        ArithmeticExpressionsParser.var_num_return retval = new ArithmeticExpressionsParser.var_num_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set220=null;

        Object set220_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:161:8: ( VAR | NUM )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:
            {
            root_0 = (Object)adaptor.nil();


            set220=(Token)input.LT(1);

            if ( input.LA(1)==NUM||input.LA(1)==VAR ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set220)
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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:162:2: big_init : ( init_1 | init_2 | init_3 | init_4 | init_5 | init_6 );
    public final ArithmeticExpressionsParser.big_init_return big_init() throws RecognitionException {
        ArithmeticExpressionsParser.big_init_return retval = new ArithmeticExpressionsParser.big_init_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.init_1_return init_1221 =null;

        ArithmeticExpressionsParser.init_2_return init_2222 =null;

        ArithmeticExpressionsParser.init_3_return init_3223 =null;

        ArithmeticExpressionsParser.init_4_return init_4224 =null;

        ArithmeticExpressionsParser.init_5_return init_5225 =null;

        ArithmeticExpressionsParser.init_6_return init_6226 =null;



        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:163:3: ( init_1 | init_2 | init_3 | init_4 | init_5 | init_6 )
            int alt59=6;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==NUM||LA59_0==VAR) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==71) ) {
                    int LA59_3 = input.LA(3);

                    if ( (LA59_3==80) ) {
                        alt59=1;
                    }
                    else if ( (LA59_3==NUM||LA59_3==VAR) ) {
                        int LA59_8 = input.LA(4);

                        if ( (LA59_8==Minus||LA59_8==Plus) ) {
                            alt59=4;
                        }
                        else if ( (LA59_8==BOOLEAN||LA59_8==DOUBLE||LA59_8==INT||(LA59_8 >= Modifier && LA59_8 <= NUM)||LA59_8==SEMICOLON||LA59_8==STRING||LA59_8==System||LA59_8==VAR||(LA59_8 >= 76 && LA59_8 <= 79)||LA59_8==81||LA59_8==83) ) {
                            alt59=5;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 59, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 3, input);

                        throw nvae;

                    }
                }
                else if ( (LA59_1==73) ) {
                    alt59=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA59_0==BOOLEAN||LA59_0==DOUBLE||LA59_0==INT||LA59_0==STRING) ) {
                int LA59_2 = input.LA(2);

                if ( (LA59_2==NUM||LA59_2==VAR) ) {
                    alt59=2;
                }
                else if ( (LA59_2==73) ) {
                    alt59=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;

            }
            switch (alt59) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:163:4: init_1
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_init_1_in_big_init1374);
                    init_1221=init_1();

                    state._fsp--;

                    adaptor.addChild(root_0, init_1221.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:163:11: init_2
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_init_2_in_big_init1376);
                    init_2222=init_2();

                    state._fsp--;

                    adaptor.addChild(root_0, init_2222.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:163:18: init_3
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_init_3_in_big_init1378);
                    init_3223=init_3();

                    state._fsp--;

                    adaptor.addChild(root_0, init_3223.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:163:25: init_4
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_init_4_in_big_init1380);
                    init_4224=init_4();

                    state._fsp--;

                    adaptor.addChild(root_0, init_4224.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:163:32: init_5
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_init_5_in_big_init1382);
                    init_5225=init_5();

                    state._fsp--;

                    adaptor.addChild(root_0, init_5225.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:163:39: init_6
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_init_6_in_big_init1384);
                    init_6226=init_6();

                    state._fsp--;

                    adaptor.addChild(root_0, init_6226.getTree());

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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:168:1: condition : generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? -> ^( Condition generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? ) ;
    public final ArithmeticExpressionsParser.condition_return condition() throws RecognitionException {
        ArithmeticExpressionsParser.condition_return retval = new ArithmeticExpressionsParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RelationalOperators228=null;
        Token AndOr230=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr227 =null;

        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr229 =null;

        ArithmeticExpressionsParser.condition_return condition231 =null;


        Object RelationalOperators228_tree=null;
        Object AndOr230_tree=null;
        RewriteRuleTokenStream stream_RelationalOperators=new RewriteRuleTokenStream(adaptor,"token RelationalOperators");
        RewriteRuleTokenStream stream_AndOr=new RewriteRuleTokenStream(adaptor,"token AndOr");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_generalArithExpr=new RewriteRuleSubtreeStream(adaptor,"rule generalArithExpr");
        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:168:10: ( generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? -> ^( Condition generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:169:2: generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )?
            {
            pushFollow(FOLLOW_generalArithExpr_in_condition1399);
            generalArithExpr227=generalArithExpr();

            state._fsp--;

            stream_generalArithExpr.add(generalArithExpr227.getTree());

            RelationalOperators228=(Token)match(input,RelationalOperators,FOLLOW_RelationalOperators_in_condition1401);  
            stream_RelationalOperators.add(RelationalOperators228);


            pushFollow(FOLLOW_generalArithExpr_in_condition1403);
            generalArithExpr229=generalArithExpr();

            state._fsp--;

            stream_generalArithExpr.add(generalArithExpr229.getTree());

            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:169:56: ( AndOr condition )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==AndOr) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:169:57: AndOr condition
                    {
                    AndOr230=(Token)match(input,AndOr,FOLLOW_AndOr_in_condition1406);  
                    stream_AndOr.add(AndOr230);


                    pushFollow(FOLLOW_condition_in_condition1408);
                    condition231=condition();

                    state._fsp--;

                    stream_condition.add(condition231.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: RelationalOperators, generalArithExpr, generalArithExpr, AndOr, condition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 170:2: -> ^( Condition generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? )
            {
                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:170:4: ^( Condition generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? )
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

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:170:70: ( AndOr condition )?
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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:177:1: int_dec : ( Modifier )? INT VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON ;
    public final ArithmeticExpressionsParser.int_dec_return int_dec() throws RecognitionException {
        ArithmeticExpressionsParser.int_dec_return retval = new ArithmeticExpressionsParser.int_dec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier232=null;
        Token INT233=null;
        Token VAR234=null;
        Token char_literal235=null;
        Token char_literal237=null;
        Token VAR238=null;
        Token SEMICOLON239=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr236 =null;


        Object Modifier232_tree=null;
        Object INT233_tree=null;
        Object VAR234_tree=null;
        Object char_literal235_tree=null;
        Object char_literal237_tree=null;
        Object VAR238_tree=null;
        Object SEMICOLON239_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:177:9: ( ( Modifier )? INT VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:179:2: ( Modifier )? INT VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:179:2: ( Modifier )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==Modifier) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:179:2: Modifier
                    {
                    Modifier232=(Token)match(input,Modifier,FOLLOW_Modifier_in_int_dec1467); 
                    Modifier232_tree = 
                    (Object)adaptor.create(Modifier232)
                    ;
                    adaptor.addChild(root_0, Modifier232_tree);


                    }
                    break;

            }


            INT233=(Token)match(input,INT,FOLLOW_INT_in_int_dec1470); 
            INT233_tree = 
            (Object)adaptor.create(INT233)
            ;
            adaptor.addChild(root_0, INT233_tree);


            VAR234=(Token)match(input,VAR,FOLLOW_VAR_in_int_dec1472); 
            VAR234_tree = 
            (Object)adaptor.create(VAR234)
            ;
            adaptor.addChild(root_0, VAR234_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:179:20: ( ( '=' generalArithExpr )? | ( ',' VAR )* )
            int alt64=2;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt64=1;
                }
                break;
            case SEMICOLON:
                {
                alt64=1;
                }
                break;
            case 66:
                {
                alt64=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }

            switch (alt64) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:179:21: ( '=' generalArithExpr )?
                    {
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:179:21: ( '=' generalArithExpr )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==71) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:179:22: '=' generalArithExpr
                            {
                            char_literal235=(Token)match(input,71,FOLLOW_71_in_int_dec1476); 
                            char_literal235_tree = 
                            (Object)adaptor.create(char_literal235)
                            ;
                            adaptor.addChild(root_0, char_literal235_tree);


                            pushFollow(FOLLOW_generalArithExpr_in_int_dec1478);
                            generalArithExpr236=generalArithExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, generalArithExpr236.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:179:45: ( ',' VAR )*
                    {
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:179:45: ( ',' VAR )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==66) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:179:46: ',' VAR
                    	    {
                    	    char_literal237=(Token)match(input,66,FOLLOW_66_in_int_dec1483); 
                    	    char_literal237_tree = 
                    	    (Object)adaptor.create(char_literal237)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal237_tree);


                    	    VAR238=(Token)match(input,VAR,FOLLOW_VAR_in_int_dec1485); 
                    	    VAR238_tree = 
                    	    (Object)adaptor.create(VAR238)
                    	    ;
                    	    adaptor.addChild(root_0, VAR238_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);


                    }
                    break;

            }


            SEMICOLON239=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_int_dec1490); 
            SEMICOLON239_tree = 
            (Object)adaptor.create(SEMICOLON239)
            ;
            adaptor.addChild(root_0, SEMICOLON239_tree);


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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:182:1: double_dec : ( Modifier )? DOUBLE VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON ;
    public final ArithmeticExpressionsParser.double_dec_return double_dec() throws RecognitionException {
        ArithmeticExpressionsParser.double_dec_return retval = new ArithmeticExpressionsParser.double_dec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier240=null;
        Token DOUBLE241=null;
        Token VAR242=null;
        Token char_literal243=null;
        Token char_literal245=null;
        Token VAR246=null;
        Token SEMICOLON247=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr244 =null;


        Object Modifier240_tree=null;
        Object DOUBLE241_tree=null;
        Object VAR242_tree=null;
        Object char_literal243_tree=null;
        Object char_literal245_tree=null;
        Object VAR246_tree=null;
        Object SEMICOLON247_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:182:11: ( ( Modifier )? DOUBLE VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:184:2: ( Modifier )? DOUBLE VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:184:2: ( Modifier )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==Modifier) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:184:2: Modifier
                    {
                    Modifier240=(Token)match(input,Modifier,FOLLOW_Modifier_in_double_dec1505); 
                    Modifier240_tree = 
                    (Object)adaptor.create(Modifier240)
                    ;
                    adaptor.addChild(root_0, Modifier240_tree);


                    }
                    break;

            }


            DOUBLE241=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_double_dec1508); 
            DOUBLE241_tree = 
            (Object)adaptor.create(DOUBLE241)
            ;
            adaptor.addChild(root_0, DOUBLE241_tree);


            VAR242=(Token)match(input,VAR,FOLLOW_VAR_in_double_dec1510); 
            VAR242_tree = 
            (Object)adaptor.create(VAR242)
            ;
            adaptor.addChild(root_0, VAR242_tree);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:184:23: ( ( '=' generalArithExpr )? | ( ',' VAR )* )
            int alt68=2;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt68=1;
                }
                break;
            case SEMICOLON:
                {
                alt68=1;
                }
                break;
            case 66:
                {
                alt68=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;

            }

            switch (alt68) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:184:24: ( '=' generalArithExpr )?
                    {
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:184:24: ( '=' generalArithExpr )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==71) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:184:25: '=' generalArithExpr
                            {
                            char_literal243=(Token)match(input,71,FOLLOW_71_in_double_dec1514); 
                            char_literal243_tree = 
                            (Object)adaptor.create(char_literal243)
                            ;
                            adaptor.addChild(root_0, char_literal243_tree);


                            pushFollow(FOLLOW_generalArithExpr_in_double_dec1516);
                            generalArithExpr244=generalArithExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, generalArithExpr244.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:184:48: ( ',' VAR )*
                    {
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:184:48: ( ',' VAR )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==66) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:184:49: ',' VAR
                    	    {
                    	    char_literal245=(Token)match(input,66,FOLLOW_66_in_double_dec1521); 
                    	    char_literal245_tree = 
                    	    (Object)adaptor.create(char_literal245)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal245_tree);


                    	    VAR246=(Token)match(input,VAR,FOLLOW_VAR_in_double_dec1523); 
                    	    VAR246_tree = 
                    	    (Object)adaptor.create(VAR246)
                    	    ;
                    	    adaptor.addChild(root_0, VAR246_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);


                    }
                    break;

            }


            SEMICOLON247=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_double_dec1528); 
            SEMICOLON247_tree = 
            (Object)adaptor.create(SEMICOLON247)
            ;
            adaptor.addChild(root_0, SEMICOLON247_tree);


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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:187:1: string_dec : ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON -> ^( String_Dec ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON ) ;
    public final ArithmeticExpressionsParser.string_dec_return string_dec() throws RecognitionException {
        ArithmeticExpressionsParser.string_dec_return retval = new ArithmeticExpressionsParser.string_dec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier248=null;
        Token STRING249=null;
        Token VAR250=null;
        Token char_literal251=null;
        Token Strings252=null;
        Token SEMICOLON253=null;

        Object Modifier248_tree=null;
        Object STRING249_tree=null;
        Object VAR250_tree=null;
        Object char_literal251_tree=null;
        Object Strings252_tree=null;
        Object SEMICOLON253_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_Modifier=new RewriteRuleTokenStream(adaptor,"token Modifier");
        RewriteRuleTokenStream stream_Strings=new RewriteRuleTokenStream(adaptor,"token Strings");

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:187:11: ( ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON -> ^( String_Dec ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON ) )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:189:2: ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON
            {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:189:2: ( Modifier )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==Modifier) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:189:2: Modifier
                    {
                    Modifier248=(Token)match(input,Modifier,FOLLOW_Modifier_in_string_dec1541);  
                    stream_Modifier.add(Modifier248);


                    }
                    break;

            }


            STRING249=(Token)match(input,STRING,FOLLOW_STRING_in_string_dec1544);  
            stream_STRING.add(STRING249);


            VAR250=(Token)match(input,VAR,FOLLOW_VAR_in_string_dec1546);  
            stream_VAR.add(VAR250);


            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:189:23: ( '=' Strings )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==71) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:189:24: '=' Strings
                    {
                    char_literal251=(Token)match(input,71,FOLLOW_71_in_string_dec1549);  
                    stream_71.add(char_literal251);


                    Strings252=(Token)match(input,Strings,FOLLOW_Strings_in_string_dec1551);  
                    stream_Strings.add(Strings252);


                    }
                    break;

            }


            SEMICOLON253=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_string_dec1555);  
            stream_SEMICOLON.add(SEMICOLON253);


            // AST REWRITE
            // elements: Modifier, VAR, 71, STRING, SEMICOLON, Strings
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 190:3: -> ^( String_Dec ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON )
            {
                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:190:6: ^( String_Dec ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(String_Dec, "String_Dec")
                , root_1);

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:190:19: ( Modifier )?
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

                // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:190:40: ( '=' Strings )?
                if ( stream_71.hasNext()||stream_Strings.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_71.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_Strings.nextNode()
                    );

                }
                stream_71.reset();
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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:192:1: generalArithExpr : term ( ( '+' | '-' ) ^ term )* ;
    public final ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr() throws RecognitionException {
        ArithmeticExpressionsParser.generalArithExpr_return retval = new ArithmeticExpressionsParser.generalArithExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set255=null;
        ArithmeticExpressionsParser.term_return term254 =null;

        ArithmeticExpressionsParser.term_return term256 =null;


        Object set255_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:192:17: ( term ( ( '+' | '-' ) ^ term )* )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:192:19: term ( ( '+' | '-' ) ^ term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_generalArithExpr1587);
            term254=term();

            state._fsp--;

            adaptor.addChild(root_0, term254.getTree());

            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:192:24: ( ( '+' | '-' ) ^ term )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==Minus||LA71_0==Plus) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:192:25: ( '+' | '-' ) ^ term
            	    {
            	    set255=(Token)input.LT(1);

            	    set255=(Token)input.LT(1);

            	    if ( input.LA(1)==Minus||input.LA(1)==Plus ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set255)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_term_in_generalArithExpr1602);
            	    term256=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term256.getTree());

            	    }
            	    break;

            	default :
            	    break loop71;
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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:200:1: term : factor ( ( '*' | '/' ) ^ factor )* ;
    public final ArithmeticExpressionsParser.term_return term() throws RecognitionException {
        ArithmeticExpressionsParser.term_return retval = new ArithmeticExpressionsParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set258=null;
        ArithmeticExpressionsParser.factor_return factor257 =null;

        ArithmeticExpressionsParser.factor_return factor259 =null;


        Object set258_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:200:6: ( factor ( ( '*' | '/' ) ^ factor )* )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:200:8: factor ( ( '*' | '/' ) ^ factor )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1640);
            factor257=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor257.getTree());

            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:200:15: ( ( '*' | '/' ) ^ factor )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==63||LA72_0==69) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:200:17: ( '*' | '/' ) ^ factor
            	    {
            	    set258=(Token)input.LT(1);

            	    set258=(Token)input.LT(1);

            	    if ( input.LA(1)==63||input.LA(1)==69 ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set258)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_factor_in_term1656);
            	    factor259=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor259.getTree());

            	    }
            	    break;

            	default :
            	    break loop72;
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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:208:1: factor : ( VAR -> ^( Factor VAR ) | NUM -> ^( Factor NUM ) | DNUM -> ^( Factor DOUBLE ) | '-' VAR -> ^( Factor '-' VAR ) | '-' INT -> ^( Factor '-' INT ) | '-' DNUM -> ^( Factor '-' DOUBLE ) | '(' generalArithExpr ')' -> ^( Factor '(' generalArithExpr ')' ) | Fun '(' generalArithExpr ')' -> ^( Factor Fun '(' generalArithExpr ')' ) );
    public final ArithmeticExpressionsParser.factor_return factor() throws RecognitionException {
        ArithmeticExpressionsParser.factor_return retval = new ArithmeticExpressionsParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR260=null;
        Token NUM261=null;
        Token DNUM262=null;
        Token char_literal263=null;
        Token VAR264=null;
        Token char_literal265=null;
        Token INT266=null;
        Token char_literal267=null;
        Token DNUM268=null;
        Token char_literal269=null;
        Token char_literal271=null;
        Token Fun272=null;
        Token char_literal273=null;
        Token char_literal275=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr270 =null;

        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr274 =null;


        Object VAR260_tree=null;
        Object NUM261_tree=null;
        Object DNUM262_tree=null;
        Object char_literal263_tree=null;
        Object VAR264_tree=null;
        Object char_literal265_tree=null;
        Object INT266_tree=null;
        Object char_literal267_tree=null;
        Object DNUM268_tree=null;
        Object char_literal269_tree=null;
        Object char_literal271_tree=null;
        Object Fun272_tree=null;
        Object char_literal273_tree=null;
        Object char_literal275_tree=null;
        RewriteRuleTokenStream stream_DNUM=new RewriteRuleTokenStream(adaptor,"token DNUM");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_Minus=new RewriteRuleTokenStream(adaptor,"token Minus");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_Fun=new RewriteRuleTokenStream(adaptor,"token Fun");
        RewriteRuleSubtreeStream stream_generalArithExpr=new RewriteRuleSubtreeStream(adaptor,"rule generalArithExpr");
        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:208:8: ( VAR -> ^( Factor VAR ) | NUM -> ^( Factor NUM ) | DNUM -> ^( Factor DOUBLE ) | '-' VAR -> ^( Factor '-' VAR ) | '-' INT -> ^( Factor '-' INT ) | '-' DNUM -> ^( Factor '-' DOUBLE ) | '(' generalArithExpr ')' -> ^( Factor '(' generalArithExpr ')' ) | Fun '(' generalArithExpr ')' -> ^( Factor Fun '(' generalArithExpr ')' ) )
            int alt73=8;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt73=1;
                }
                break;
            case NUM:
                {
                alt73=2;
                }
                break;
            case DNUM:
                {
                alt73=3;
                }
                break;
            case Minus:
                {
                switch ( input.LA(2) ) {
                case VAR:
                    {
                    alt73=4;
                    }
                    break;
                case INT:
                    {
                    alt73=5;
                    }
                    break;
                case DNUM:
                    {
                    alt73=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 4, input);

                    throw nvae;

                }

                }
                break;
            case 61:
                {
                alt73=7;
                }
                break;
            case Fun:
                {
                alt73=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;

            }

            switch (alt73) {
                case 1 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:209:2: VAR
                    {
                    VAR260=(Token)match(input,VAR,FOLLOW_VAR_in_factor1696);  
                    stream_VAR.add(VAR260);


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
                    // 209:6: -> ^( Factor VAR )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:209:9: ^( Factor VAR )
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
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:210:3: NUM
                    {
                    NUM261=(Token)match(input,NUM,FOLLOW_NUM_in_factor1708);  
                    stream_NUM.add(NUM261);


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
                    // 210:7: -> ^( Factor NUM )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:210:10: ^( Factor NUM )
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
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:211:3: DNUM
                    {
                    DNUM262=(Token)match(input,DNUM,FOLLOW_DNUM_in_factor1720);  
                    stream_DNUM.add(DNUM262);


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
                    // 211:8: -> ^( Factor DOUBLE )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:211:11: ^( Factor DOUBLE )
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
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:212:3: '-' VAR
                    {
                    char_literal263=(Token)match(input,Minus,FOLLOW_Minus_in_factor1732);  
                    stream_Minus.add(char_literal263);


                    VAR264=(Token)match(input,VAR,FOLLOW_VAR_in_factor1735);  
                    stream_VAR.add(VAR264);


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
                    // 212:12: -> ^( Factor '-' VAR )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:212:15: ^( Factor '-' VAR )
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
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:213:3: '-' INT
                    {
                    char_literal265=(Token)match(input,Minus,FOLLOW_Minus_in_factor1750);  
                    stream_Minus.add(char_literal265);


                    INT266=(Token)match(input,INT,FOLLOW_INT_in_factor1753);  
                    stream_INT.add(INT266);


                    // AST REWRITE
                    // elements: INT, Minus
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 213:12: -> ^( Factor '-' INT )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:213:15: ^( Factor '-' INT )
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
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:214:3: '-' DNUM
                    {
                    char_literal267=(Token)match(input,Minus,FOLLOW_Minus_in_factor1768);  
                    stream_Minus.add(char_literal267);


                    DNUM268=(Token)match(input,DNUM,FOLLOW_DNUM_in_factor1771);  
                    stream_DNUM.add(DNUM268);


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
                    // 214:14: -> ^( Factor '-' DOUBLE )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:214:17: ^( Factor '-' DOUBLE )
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
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:215:3: '(' generalArithExpr ')'
                    {
                    char_literal269=(Token)match(input,61,FOLLOW_61_in_factor1787);  
                    stream_61.add(char_literal269);


                    pushFollow(FOLLOW_generalArithExpr_in_factor1789);
                    generalArithExpr270=generalArithExpr();

                    state._fsp--;

                    stream_generalArithExpr.add(generalArithExpr270.getTree());

                    char_literal271=(Token)match(input,62,FOLLOW_62_in_factor1791);  
                    stream_62.add(char_literal271);


                    // AST REWRITE
                    // elements: generalArithExpr, 61, 62
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 215:28: -> ^( Factor '(' generalArithExpr ')' )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:215:31: ^( Factor '(' generalArithExpr ')' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_61.nextNode()
                        );

                        adaptor.addChild(root_1, stream_generalArithExpr.nextTree());

                        adaptor.addChild(root_1, 
                        stream_62.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:216:4: Fun '(' generalArithExpr ')'
                    {
                    Fun272=(Token)match(input,Fun,FOLLOW_Fun_in_factor1809);  
                    stream_Fun.add(Fun272);


                    char_literal273=(Token)match(input,61,FOLLOW_61_in_factor1811);  
                    stream_61.add(char_literal273);


                    pushFollow(FOLLOW_generalArithExpr_in_factor1813);
                    generalArithExpr274=generalArithExpr();

                    state._fsp--;

                    stream_generalArithExpr.add(generalArithExpr274.getTree());

                    char_literal275=(Token)match(input,62,FOLLOW_62_in_factor1815);  
                    stream_62.add(char_literal275);


                    // AST REWRITE
                    // elements: Fun, 61, generalArithExpr, 62
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 216:33: -> ^( Factor Fun '(' generalArithExpr ')' )
                    {
                        // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:216:36: ^( Factor Fun '(' generalArithExpr ')' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_Fun.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_61.nextNode()
                        );

                        adaptor.addChild(root_1, stream_generalArithExpr.nextTree());

                        adaptor.addChild(root_1, 
                        stream_62.nextNode()
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
    // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:235:1: types : ( STRING | BOOLEAN | DOUBLE | INT );
    public final ArithmeticExpressionsParser.types_return types() throws RecognitionException {
        ArithmeticExpressionsParser.types_return retval = new ArithmeticExpressionsParser.types_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set276=null;

        Object set276_tree=null;

        try {
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:235:7: ( STRING | BOOLEAN | DOUBLE | INT )
            // C:\\Users\\hazem\\Desktop\\SECOND TERM\\CS407 compiler\\project\\comp407\\ArithmeticExpressions.g:
            {
            root_0 = (Object)adaptor.nil();


            set276=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEAN||input.LA(1)==DOUBLE||input.LA(1)==INT||input.LA(1)==STRING ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set276)
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


 

    public static final BitSet FOLLOW_classDec_in_startgeneralArithExpr112 = new BitSet(new long[]{0x0000000800000402L});
    public static final BitSet FOLLOW_Modifier_in_classDec157 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_Class_in_classDec160 = new BitSet(new long[]{0x0080000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_VAR_in_classDec162 = new BitSet(new long[]{0x0080000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_classDec165 = new BitSet(new long[]{0x0090281800808080L,0x00000000000A6000L});
    public static final BitSet FOLLOW_stmt_in_classDec167 = new BitSet(new long[]{0x0090281800808080L,0x00000000000A6000L});
    public static final BitSet FOLLOW_83_in_classDec170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_stmt229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_4_in_stmt242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_big_init_in_stmt254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_main_method_in_stmt266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstmt_in_stmt276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestmt_in_stmt288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forloop_in_stmt300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assigment_in_stmt312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_stmt324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_dec_in_stmt336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initialize_in_stmt348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initialize_1_in_stmt360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sys_print_in_stmt373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_method423 = new BitSet(new long[]{0x2080200000808080L});
    public static final BitSet FOLLOW_types_in_method425 = new BitSet(new long[]{0x2080000000000000L});
    public static final BitSet FOLLOW_VAR_in_method428 = new BitSet(new long[]{0x2080000000000000L});
    public static final BitSet FOLLOW_params_in_method431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_method433 = new BitSet(new long[]{0x0090281800808080L,0x000000000002E000L});
    public static final BitSet FOLLOW_stmt_in_method435 = new BitSet(new long[]{0x0090281800808080L,0x000000000002E000L});
    public static final BitSet FOLLOW_79_in_method438 = new BitSet(new long[]{0x0080001000000000L});
    public static final BitSet FOLLOW_return_type_in_method440 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_method442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_method443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_main_method491 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Static_in_main_method493 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_VOID_in_main_method495 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Main_in_main_method497 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_main_method499 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_STRING_in_main_method500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_main_method502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_main_method503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_main_method505 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_main_method507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_main_method509 = new BitSet(new long[]{0x0010000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_print_in_main_method510 = new BitSet(new long[]{0x0010000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_main_method512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_System_in_print547 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Dot_in_print549 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_Out_in_print551 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Dot_in_print553 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Println_in_print555 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_print557 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_New_in_print558 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_VAR_in_print560 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_print562 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_print563 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Dot_in_print564 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_VAR_in_print566 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_print568 = new BitSet(new long[]{0x4000001000000000L});
    public static final BitSet FOLLOW_NUM_in_print569 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_print571 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_print573 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_print575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_types_in_initialize631 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_initialize633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_initialize634 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_VAR_in_initialize638 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_initialize640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_initialize642 = new BitSet(new long[]{0x0080080000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_initialize645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_initialize_1655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_initialize_1657 = new BitSet(new long[]{0x0080002000000000L});
    public static final BitSet FOLLOW_set_in_initialize_1659 = new BitSet(new long[]{0x0080000000020000L});
    public static final BitSet FOLLOW_Dot_in_initialize_1665 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_VAR_in_initialize_1668 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_initialize_1670 = new BitSet(new long[]{0x4080001000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_initialize_1677 = new BitSet(new long[]{0x4080001000000000L});
    public static final BitSet FOLLOW_62_in_initialize_1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_System_in_sys_print695 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Dot_in_sys_print697 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_Out_in_sys_print699 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Dot_in_sys_print701 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Println_in_sys_print703 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_sys_print705 = new BitSet(new long[]{0x0080001000000000L});
    public static final BitSet FOLLOW_NUM_in_sys_print707 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_VAR_in_sys_print709 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Dot_in_sys_print711 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_VAR_in_sys_print713 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_sys_print715 = new BitSet(new long[]{0x4000001000000000L});
    public static final BitSet FOLLOW_NUM_in_sys_print716 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_sys_print718 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_sys_print722 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_sys_print724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ob_cho_in_object731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_object735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_object740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ob_body749 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_VAR_in_ob_body753 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Dot_in_ob_body755 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_VAR_in_ob_body757 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ob_body759 = new BitSet(new long[]{0x0080001000000000L});
    public static final BitSet FOLLOW_set_in_ob_body761 = new BitSet(new long[]{0x2080001400204000L});
    public static final BitSet FOLLOW_generalArithExpr_in_ob_body769 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ob_body772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ob_cho779 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_VAR_in_ob_cho783 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Dot_in_ob_cho785 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_VAR_in_ob_cho787 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ob_cho789 = new BitSet(new long[]{0x4080001000000000L});
    public static final BitSet FOLLOW_62_in_ob_cho799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ob_body_in_ob_cho803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_params811 = new BitSet(new long[]{0x4080200000808080L});
    public static final BitSet FOLLOW_types_in_params814 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_VAR_in_params816 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_VAR_in_params818 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_VAR_in_params820 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_params824 = new BitSet(new long[]{0x0000200000808080L});
    public static final BitSet FOLLOW_types_in_params826 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_VAR_in_params828 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_62_in_params834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_dec_in_decl848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_dec_in_decl860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_while_condition881 = new BitSet(new long[]{0x2080001400204000L});
    public static final BitSet FOLLOW_condition_in_while_condition883 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_while_condition885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_while_condition887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_whilestmt896 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_whilestmt898 = new BitSet(new long[]{0x2880001000000000L});
    public static final BitSet FOLLOW_while_condition_in_whilestmt900 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_whilestmt902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_whilestmt904 = new BitSet(new long[]{0x0090281800808080L,0x00000000000A6000L});
    public static final BitSet FOLLOW_stmt_in_whilestmt906 = new BitSet(new long[]{0x0090281800808080L,0x00000000000A6000L});
    public static final BitSet FOLLOW_83_in_whilestmt909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ifstmt954 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ifstmt956 = new BitSet(new long[]{0x3880001000000000L,0x0000000000000140L});
    public static final BitSet FOLLOW_59_in_ifstmt959 = new BitSet(new long[]{0x3880001000000000L,0x0000000000000140L});
    public static final BitSet FOLLOW_61_in_ifstmt965 = new BitSet(new long[]{0x1880001000000000L,0x0000000000000140L});
    public static final BitSet FOLLOW_if_nor_in_ifstmt969 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ifstmt972 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ifstmt976 = new BitSet(new long[]{0x0090281800808082L,0x00000000000E7000L});
    public static final BitSet FOLLOW_82_in_ifstmt979 = new BitSet(new long[]{0x0090281800808082L,0x00000000000A7000L});
    public static final BitSet FOLLOW_stmt_in_ifstmt983 = new BitSet(new long[]{0x0090281800808082L,0x00000000000A7000L});
    public static final BitSet FOLLOW_83_in_ifstmt987 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ifstmt992 = new BitSet(new long[]{0x0090281800808082L,0x00000000000E7000L});
    public static final BitSet FOLLOW_82_in_ifstmt995 = new BitSet(new long[]{0x0090281800808082L,0x00000000000A7000L});
    public static final BitSet FOLLOW_stmt_in_ifstmt999 = new BitSet(new long[]{0x0090281800808082L,0x00000000000A7000L});
    public static final BitSet FOLLOW_83_in_ifstmt1003 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ifstmt1010 = new BitSet(new long[]{0x0090281800808082L,0x00000000000E6000L});
    public static final BitSet FOLLOW_82_in_ifstmt1013 = new BitSet(new long[]{0x0090281800808082L,0x00000000000A6000L});
    public static final BitSet FOLLOW_stmt_in_ifstmt1017 = new BitSet(new long[]{0x0090281800808082L,0x00000000000A6000L});
    public static final BitSet FOLLOW_83_in_ifstmt1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_nor_in_if_cond1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_if_nor1050 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000140L});
    public static final BitSet FOLLOW_set_in_if_nor1053 = new BitSet(new long[]{0x1880001000000000L,0x0000000000000140L});
    public static final BitSet FOLLOW_object_in_if_nor1068 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000140L});
    public static final BitSet FOLLOW_77_in_forloop1083 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_forloop1085 = new BitSet(new long[]{0x0000000800808000L});
    public static final BitSet FOLLOW_decl_in_forloop1088 = new BitSet(new long[]{0x2080001400204000L});
    public static final BitSet FOLLOW_condition_in_forloop1092 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_forloop1095 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_VAR_in_forloop1098 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001BL});
    public static final BitSet FOLLOW_change_in_forloop1100 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_forloop1103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_forloop1105 = new BitSet(new long[]{0x0090281800808080L,0x00000000000A6000L});
    public static final BitSet FOLLOW_stmt_in_forloop1107 = new BitSet(new long[]{0x0090281800808080L,0x00000000000A6000L});
    public static final BitSet FOLLOW_83_in_forloop1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_assigment1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Dot_in_initialize_21142 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_VAR_in_initialize_21145 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_initialize_21147 = new BitSet(new long[]{0x4080001000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_initialize_21154 = new BitSet(new long[]{0x4080001000000000L});
    public static final BitSet FOLLOW_62_in_initialize_21163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_assign1203 = new BitSet(new long[]{0xA080003400224000L,0x000000000000009BL});
    public static final BitSet FOLLOW_change_in_assign1206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_assign1208 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_VAR_in_assign1211 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_New_in_assign1215 = new BitSet(new long[]{0xA080001400224000L});
    public static final BitSet FOLLOW_63_in_assign1219 = new BitSet(new long[]{0x2080001400224000L});
    public static final BitSet FOLLOW_generalArithExpr_in_assign1225 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_initialize_2_in_assign1228 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_assign1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_change1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_change1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_change1248 = new BitSet(new long[]{0x2080001400204000L});
    public static final BitSet FOLLOW_generalArithExpr_in_change1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_num_in_init_11272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_init_11274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_init_11276 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Dot_in_init_11278 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_VAR_in_init_11280 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_init_11282 = new BitSet(new long[]{0x4080001000000000L});
    public static final BitSet FOLLOW_62_in_init_11290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_types_in_init_21297 = new BitSet(new long[]{0x0080001000000000L});
    public static final BitSet FOLLOW_var_num_in_init_21299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_types_in_init_31306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_init_31308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_init_31310 = new BitSet(new long[]{0x0080001000000000L});
    public static final BitSet FOLLOW_var_num_in_init_31311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_num_in_init_41318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_init_41320 = new BitSet(new long[]{0x0080001000000000L});
    public static final BitSet FOLLOW_var_num_in_init_41321 = new BitSet(new long[]{0x0000008400000000L});
    public static final BitSet FOLLOW_op_in_init_41323 = new BitSet(new long[]{0x0080001000000000L});
    public static final BitSet FOLLOW_var_num_in_init_41325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_num_in_init_51334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_init_51336 = new BitSet(new long[]{0x0080001000000000L});
    public static final BitSet FOLLOW_var_num_in_init_51338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_num_in_init_61346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_init_61348 = new BitSet(new long[]{0x0080001000000000L});
    public static final BitSet FOLLOW_var_num_in_init_61349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_init_61351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_init_61352 = new BitSet(new long[]{0x0080001000000000L});
    public static final BitSet FOLLOW_var_num_in_init_61353 = new BitSet(new long[]{0x0000008400000000L});
    public static final BitSet FOLLOW_op_in_init_61355 = new BitSet(new long[]{0x0080001000000000L});
    public static final BitSet FOLLOW_var_num_in_init_61357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_1_in_big_init1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_2_in_big_init1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_3_in_big_init1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_4_in_big_init1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_5_in_big_init1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_6_in_big_init1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_generalArithExpr_in_condition1399 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_RelationalOperators_in_condition1401 = new BitSet(new long[]{0x2080001400204000L});
    public static final BitSet FOLLOW_generalArithExpr_in_condition1403 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AndOr_in_condition1406 = new BitSet(new long[]{0x2080001400204000L});
    public static final BitSet FOLLOW_condition_in_condition1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_int_dec1467 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_INT_in_int_dec1470 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_VAR_in_int_dec1472 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000084L});
    public static final BitSet FOLLOW_71_in_int_dec1476 = new BitSet(new long[]{0x2080001400204000L});
    public static final BitSet FOLLOW_generalArithExpr_in_int_dec1478 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_66_in_int_dec1483 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_VAR_in_int_dec1485 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMICOLON_in_int_dec1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_double_dec1505 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DOUBLE_in_double_dec1508 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_VAR_in_double_dec1510 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000084L});
    public static final BitSet FOLLOW_71_in_double_dec1514 = new BitSet(new long[]{0x2080001400204000L});
    public static final BitSet FOLLOW_generalArithExpr_in_double_dec1516 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_66_in_double_dec1521 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_VAR_in_double_dec1523 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMICOLON_in_double_dec1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_string_dec1541 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_STRING_in_string_dec1544 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_VAR_in_string_dec1546 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_string_dec1549 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_Strings_in_string_dec1551 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_string_dec1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_generalArithExpr1587 = new BitSet(new long[]{0x0000008400000002L});
    public static final BitSet FOLLOW_set_in_generalArithExpr1590 = new BitSet(new long[]{0x2080001400204000L});
    public static final BitSet FOLLOW_term_in_generalArithExpr1602 = new BitSet(new long[]{0x0000008400000002L});
    public static final BitSet FOLLOW_factor_in_term1640 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_term1644 = new BitSet(new long[]{0x2080001400204000L});
    public static final BitSet FOLLOW_factor_in_term1656 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_VAR_in_factor1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_factor1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DNUM_in_factor1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Minus_in_factor1732 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_VAR_in_factor1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Minus_in_factor1750 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_INT_in_factor1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Minus_in_factor1768 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DNUM_in_factor1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_factor1787 = new BitSet(new long[]{0x2080001400204000L});
    public static final BitSet FOLLOW_generalArithExpr_in_factor1789 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_factor1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Fun_in_factor1809 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_factor1811 = new BitSet(new long[]{0x2080001400204000L});
    public static final BitSet FOLLOW_generalArithExpr_in_factor1813 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_factor1815 = new BitSet(new long[]{0x0000000000000002L});

}