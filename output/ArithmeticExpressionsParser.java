// $ANTLR 3.4 E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g 2024-05-12 18:52:25

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
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
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


            char_literal5=(Token)match(input,79,FOLLOW_79_in_classDec159);  
            stream_79.add(char_literal5);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:48:36: ( stmt )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==BOOLEAN||LA4_0==DOUBLE||LA4_0==INT||LA4_0==Modifier||LA4_0==SEMICOLON||LA4_0==STRING||LA4_0==System||LA4_0==VAR||(LA4_0 >= 75 && LA4_0 <= 76)||LA4_0==78) ) {
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


            char_literal7=(Token)match(input,80,FOLLOW_80_in_classDec164);  
            stream_80.add(char_literal7);


            // AST REWRITE
            // elements: Modifier, stmt, VAR, Class, 80, 79
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
                stream_79.nextNode()
                );

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:48:83: ( stmt )*
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
                        int LA5_23 = input.LA(4);

                        if ( (LA5_23==SEMICOLON||LA5_23==63||LA5_23==69) ) {
                            alt5=1;
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
                        int LA5_24 = input.LA(4);

                        if ( (LA5_24==SEMICOLON||LA5_24==69) ) {
                            alt5=8;
                        }
                        else if ( (LA5_24==VAR||LA5_24==57) ) {
                            alt5=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 24, input);

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
                            int LA5_30 = input.LA(5);

                            if ( (LA5_30==VAR) ) {
                                int LA5_33 = input.LA(6);

                                if ( (LA5_33==57) ) {
                                    switch ( input.LA(7) ) {
                                    case NUM:
                                    case VAR:
                                        {
                                        switch ( input.LA(8) ) {
                                        case DNUM:
                                        case Fun:
                                        case 55:
                                        case 57:
                                        case 60:
                                        case 64:
                                            {
                                            alt5=6;
                                            }
                                            break;
                                        case VAR:
                                            {
                                            int LA5_45 = input.LA(9);

                                            if ( (LA5_45==Dot||(LA5_45 >= 59 && LA5_45 <= 60)||LA5_45==64||LA5_45==67) ) {
                                                alt5=6;
                                            }
                                            else if ( (LA5_45==58) ) {
                                                int LA5_48 = input.LA(10);

                                                if ( (LA5_48==SEMICOLON||LA5_48==60||LA5_48==64) ) {
                                                    alt5=6;
                                                }
                                                else if ( (LA5_48==BOOLEAN||LA5_48==DOUBLE||LA5_48==INT||LA5_48==Modifier||LA5_48==STRING||LA5_48==System||LA5_48==VAR||(LA5_48 >= 74 && LA5_48 <= 78)||LA5_48==80) ) {
                                                    alt5=10;
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("", 5, 48, input);

                                                    throw nvae;

                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 5, 45, input);

                                                throw nvae;

                                            }
                                            }
                                            break;
                                        case 58:
                                            {
                                            int LA5_46 = input.LA(9);

                                            if ( (LA5_46==SEMICOLON||LA5_46==60||LA5_46==64) ) {
                                                alt5=6;
                                            }
                                            else if ( (LA5_46==BOOLEAN||LA5_46==DOUBLE||LA5_46==INT||LA5_46==Modifier||LA5_46==STRING||LA5_46==System||LA5_46==VAR||(LA5_46 >= 74 && LA5_46 <= 78)||LA5_46==80) ) {
                                                alt5=10;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 5, 46, input);

                                                throw nvae;

                                            }
                                            }
                                            break;
                                        case NUM:
                                            {
                                            int LA5_47 = input.LA(9);

                                            if ( ((LA5_47 >= 59 && LA5_47 <= 60)||LA5_47==64||LA5_47==67) ) {
                                                alt5=6;
                                            }
                                            else if ( (LA5_47==58) ) {
                                                int LA5_48 = input.LA(10);

                                                if ( (LA5_48==SEMICOLON||LA5_48==60||LA5_48==64) ) {
                                                    alt5=6;
                                                }
                                                else if ( (LA5_48==BOOLEAN||LA5_48==DOUBLE||LA5_48==INT||LA5_48==Modifier||LA5_48==STRING||LA5_48==System||LA5_48==VAR||(LA5_48 >= 74 && LA5_48 <= 78)||LA5_48==80) ) {
                                                    alt5=10;
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("", 5, 48, input);

                                                    throw nvae;

                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 5, 47, input);

                                                throw nvae;

                                            }
                                            }
                                            break;
                                        case 63:
                                            {
                                            int LA5_38 = input.LA(9);

                                            if ( (LA5_38==NUM||LA5_38==VAR) ) {
                                                int LA5_42 = input.LA(10);

                                                if ( (LA5_42==58) ) {
                                                    int LA5_39 = input.LA(11);

                                                    if ( (LA5_39==BOOLEAN||LA5_39==DOUBLE||LA5_39==INT||LA5_39==Modifier||LA5_39==STRING||LA5_39==System||LA5_39==VAR||(LA5_39 >= 74 && LA5_39 <= 78)||LA5_39==80) ) {
                                                        alt5=10;
                                                    }
                                                    else if ( (LA5_39==SEMICOLON) ) {
                                                        alt5=6;
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("", 5, 39, input);

                                                        throw nvae;

                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("", 5, 42, input);

                                                    throw nvae;

                                                }
                                            }
                                            else if ( (LA5_38==58) ) {
                                                int LA5_39 = input.LA(10);

                                                if ( (LA5_39==BOOLEAN||LA5_39==DOUBLE||LA5_39==INT||LA5_39==Modifier||LA5_39==STRING||LA5_39==System||LA5_39==VAR||(LA5_39 >= 74 && LA5_39 <= 78)||LA5_39==80) ) {
                                                    alt5=10;
                                                }
                                                else if ( (LA5_39==SEMICOLON) ) {
                                                    alt5=6;
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("", 5, 39, input);

                                                    throw nvae;

                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 5, 38, input);

                                                throw nvae;

                                            }
                                            }
                                            break;
                                        default:
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 5, 40, input);

                                            throw nvae;

                                        }

                                        }
                                        break;
                                    case 58:
                                        {
                                        int LA5_41 = input.LA(8);

                                        if ( (LA5_41==SEMICOLON||LA5_41==60||LA5_41==64) ) {
                                            alt5=6;
                                        }
                                        else if ( (LA5_41==BOOLEAN||LA5_41==DOUBLE||LA5_41==INT||LA5_41==Modifier||LA5_41==STRING||LA5_41==System||LA5_41==VAR||(LA5_41 >= 74 && LA5_41 <= 78)||LA5_41==80) ) {
                                            alt5=10;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 5, 41, input);

                                            throw nvae;

                                        }
                                        }
                                        break;
                                    case 63:
                                        {
                                        int LA5_38 = input.LA(8);

                                        if ( (LA5_38==NUM||LA5_38==VAR) ) {
                                            int LA5_42 = input.LA(9);

                                            if ( (LA5_42==58) ) {
                                                int LA5_39 = input.LA(10);

                                                if ( (LA5_39==BOOLEAN||LA5_39==DOUBLE||LA5_39==INT||LA5_39==Modifier||LA5_39==STRING||LA5_39==System||LA5_39==VAR||(LA5_39 >= 74 && LA5_39 <= 78)||LA5_39==80) ) {
                                                    alt5=10;
                                                }
                                                else if ( (LA5_39==SEMICOLON) ) {
                                                    alt5=6;
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("", 5, 39, input);

                                                    throw nvae;

                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 5, 42, input);

                                                throw nvae;

                                            }
                                        }
                                        else if ( (LA5_38==58) ) {
                                            int LA5_39 = input.LA(9);

                                            if ( (LA5_39==BOOLEAN||LA5_39==DOUBLE||LA5_39==INT||LA5_39==Modifier||LA5_39==STRING||LA5_39==System||LA5_39==VAR||(LA5_39 >= 74 && LA5_39 <= 78)||LA5_39==80) ) {
                                                alt5=10;
                                            }
                                            else if ( (LA5_39==SEMICOLON) ) {
                                                alt5=6;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 5, 39, input);

                                                throw nvae;

                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 5, 38, input);

                                            throw nvae;

                                        }
                                        }
                                        break;
                                    default:
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 5, 36, input);

                                        throw nvae;

                                    }

                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 33, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 30, input);

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
                        case 59:
                        case 60:
                        case 64:
                        case 67:
                            {
                            alt5=6;
                            }
                            break;
                        case VAR:
                            {
                            int LA5_31 = input.LA(5);

                            if ( (LA5_31==57) ) {
                                switch ( input.LA(6) ) {
                                case NUM:
                                case VAR:
                                    {
                                    switch ( input.LA(7) ) {
                                    case 63:
                                        {
                                        int LA5_38 = input.LA(8);

                                        if ( (LA5_38==NUM||LA5_38==VAR) ) {
                                            int LA5_42 = input.LA(9);

                                            if ( (LA5_42==58) ) {
                                                int LA5_39 = input.LA(10);

                                                if ( (LA5_39==BOOLEAN||LA5_39==DOUBLE||LA5_39==INT||LA5_39==Modifier||LA5_39==STRING||LA5_39==System||LA5_39==VAR||(LA5_39 >= 74 && LA5_39 <= 78)||LA5_39==80) ) {
                                                    alt5=10;
                                                }
                                                else if ( (LA5_39==SEMICOLON) ) {
                                                    alt5=6;
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("", 5, 39, input);

                                                    throw nvae;

                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 5, 42, input);

                                                throw nvae;

                                            }
                                        }
                                        else if ( (LA5_38==58) ) {
                                            int LA5_39 = input.LA(9);

                                            if ( (LA5_39==BOOLEAN||LA5_39==DOUBLE||LA5_39==INT||LA5_39==Modifier||LA5_39==STRING||LA5_39==System||LA5_39==VAR||(LA5_39 >= 74 && LA5_39 <= 78)||LA5_39==80) ) {
                                                alt5=10;
                                            }
                                            else if ( (LA5_39==SEMICOLON) ) {
                                                alt5=6;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 5, 39, input);

                                                throw nvae;

                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 5, 38, input);

                                            throw nvae;

                                        }
                                        }
                                        break;
                                    case NUM:
                                    case VAR:
                                        {
                                        int LA5_42 = input.LA(8);

                                        if ( (LA5_42==58) ) {
                                            int LA5_39 = input.LA(9);

                                            if ( (LA5_39==BOOLEAN||LA5_39==DOUBLE||LA5_39==INT||LA5_39==Modifier||LA5_39==STRING||LA5_39==System||LA5_39==VAR||(LA5_39 >= 74 && LA5_39 <= 78)||LA5_39==80) ) {
                                                alt5=10;
                                            }
                                            else if ( (LA5_39==SEMICOLON) ) {
                                                alt5=6;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 5, 39, input);

                                                throw nvae;

                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 5, 42, input);

                                            throw nvae;

                                        }
                                        }
                                        break;
                                    case 58:
                                        {
                                        int LA5_39 = input.LA(8);

                                        if ( (LA5_39==BOOLEAN||LA5_39==DOUBLE||LA5_39==INT||LA5_39==Modifier||LA5_39==STRING||LA5_39==System||LA5_39==VAR||(LA5_39 >= 74 && LA5_39 <= 78)||LA5_39==80) ) {
                                            alt5=10;
                                        }
                                        else if ( (LA5_39==SEMICOLON) ) {
                                            alt5=6;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 5, 39, input);

                                            throw nvae;

                                        }
                                        }
                                        break;
                                    default:
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 5, 37, input);

                                        throw nvae;

                                    }

                                    }
                                    break;
                                case 63:
                                    {
                                    int LA5_38 = input.LA(7);

                                    if ( (LA5_38==NUM||LA5_38==VAR) ) {
                                        int LA5_42 = input.LA(8);

                                        if ( (LA5_42==58) ) {
                                            int LA5_39 = input.LA(9);

                                            if ( (LA5_39==BOOLEAN||LA5_39==DOUBLE||LA5_39==INT||LA5_39==Modifier||LA5_39==STRING||LA5_39==System||LA5_39==VAR||(LA5_39 >= 74 && LA5_39 <= 78)||LA5_39==80) ) {
                                                alt5=10;
                                            }
                                            else if ( (LA5_39==SEMICOLON) ) {
                                                alt5=6;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 5, 39, input);

                                                throw nvae;

                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 5, 42, input);

                                            throw nvae;

                                        }
                                    }
                                    else if ( (LA5_38==58) ) {
                                        int LA5_39 = input.LA(8);

                                        if ( (LA5_39==BOOLEAN||LA5_39==DOUBLE||LA5_39==INT||LA5_39==Modifier||LA5_39==STRING||LA5_39==System||LA5_39==VAR||(LA5_39 >= 74 && LA5_39 <= 78)||LA5_39==80) ) {
                                            alt5=10;
                                        }
                                        else if ( (LA5_39==SEMICOLON) ) {
                                            alt5=6;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 5, 39, input);

                                            throw nvae;

                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 5, 38, input);

                                        throw nvae;

                                    }
                                    }
                                    break;
                                case 58:
                                    {
                                    int LA5_39 = input.LA(7);

                                    if ( (LA5_39==BOOLEAN||LA5_39==DOUBLE||LA5_39==INT||LA5_39==Modifier||LA5_39==STRING||LA5_39==System||LA5_39==VAR||(LA5_39 >= 74 && LA5_39 <= 78)||LA5_39==80) ) {
                                        alt5=10;
                                    }
                                    else if ( (LA5_39==SEMICOLON) ) {
                                        alt5=6;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 5, 39, input);

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
                            else if ( (LA5_31==Dot||LA5_31==SEMICOLON||(LA5_31 >= 59 && LA5_31 <= 60)||LA5_31==64||LA5_31==67) ) {
                                alt5=6;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 31, input);

                                throw nvae;

                            }
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 27, input);

                            throw nvae;

                        }

                        }
                        break;
                    case DNUM:
                    case Dot:
                    case Fun:
                    case NUM:
                    case SEMICOLON:
                    case 55:
                    case 57:
                    case 59:
                    case 60:
                    case 64:
                        {
                        alt5=6;
                        }
                        break;
                    case New:
                        {
                        switch ( input.LA(4) ) {
                        case Dot:
                            {
                            int LA5_32 = input.LA(5);

                            if ( (LA5_32==VAR) ) {
                                int LA5_35 = input.LA(6);

                                if ( (LA5_35==57) ) {
                                    switch ( input.LA(7) ) {
                                    case NUM:
                                    case VAR:
                                        {
                                        switch ( input.LA(8) ) {
                                        case 63:
                                            {
                                            int LA5_38 = input.LA(9);

                                            if ( (LA5_38==NUM||LA5_38==VAR) ) {
                                                int LA5_42 = input.LA(10);

                                                if ( (LA5_42==58) ) {
                                                    int LA5_39 = input.LA(11);

                                                    if ( (LA5_39==BOOLEAN||LA5_39==DOUBLE||LA5_39==INT||LA5_39==Modifier||LA5_39==STRING||LA5_39==System||LA5_39==VAR||(LA5_39 >= 74 && LA5_39 <= 78)||LA5_39==80) ) {
                                                        alt5=10;
                                                    }
                                                    else if ( (LA5_39==SEMICOLON) ) {
                                                        alt5=6;
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("", 5, 39, input);

                                                        throw nvae;

                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("", 5, 42, input);

                                                    throw nvae;

                                                }
                                            }
                                            else if ( (LA5_38==58) ) {
                                                int LA5_39 = input.LA(10);

                                                if ( (LA5_39==BOOLEAN||LA5_39==DOUBLE||LA5_39==INT||LA5_39==Modifier||LA5_39==STRING||LA5_39==System||LA5_39==VAR||(LA5_39 >= 74 && LA5_39 <= 78)||LA5_39==80) ) {
                                                    alt5=10;
                                                }
                                                else if ( (LA5_39==SEMICOLON) ) {
                                                    alt5=6;
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("", 5, 39, input);

                                                    throw nvae;

                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 5, 38, input);

                                                throw nvae;

                                            }
                                            }
                                            break;
                                        case NUM:
                                        case VAR:
                                            {
                                            int LA5_42 = input.LA(9);

                                            if ( (LA5_42==58) ) {
                                                int LA5_39 = input.LA(10);

                                                if ( (LA5_39==BOOLEAN||LA5_39==DOUBLE||LA5_39==INT||LA5_39==Modifier||LA5_39==STRING||LA5_39==System||LA5_39==VAR||(LA5_39 >= 74 && LA5_39 <= 78)||LA5_39==80) ) {
                                                    alt5=10;
                                                }
                                                else if ( (LA5_39==SEMICOLON) ) {
                                                    alt5=6;
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("", 5, 39, input);

                                                    throw nvae;

                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 5, 42, input);

                                                throw nvae;

                                            }
                                            }
                                            break;
                                        case 58:
                                            {
                                            int LA5_39 = input.LA(9);

                                            if ( (LA5_39==BOOLEAN||LA5_39==DOUBLE||LA5_39==INT||LA5_39==Modifier||LA5_39==STRING||LA5_39==System||LA5_39==VAR||(LA5_39 >= 74 && LA5_39 <= 78)||LA5_39==80) ) {
                                                alt5=10;
                                            }
                                            else if ( (LA5_39==SEMICOLON) ) {
                                                alt5=6;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 5, 39, input);

                                                throw nvae;

                                            }
                                            }
                                            break;
                                        default:
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 5, 37, input);

                                            throw nvae;

                                        }

                                        }
                                        break;
                                    case 63:
                                        {
                                        int LA5_38 = input.LA(8);

                                        if ( (LA5_38==NUM||LA5_38==VAR) ) {
                                            int LA5_42 = input.LA(9);

                                            if ( (LA5_42==58) ) {
                                                int LA5_39 = input.LA(10);

                                                if ( (LA5_39==BOOLEAN||LA5_39==DOUBLE||LA5_39==INT||LA5_39==Modifier||LA5_39==STRING||LA5_39==System||LA5_39==VAR||(LA5_39 >= 74 && LA5_39 <= 78)||LA5_39==80) ) {
                                                    alt5=10;
                                                }
                                                else if ( (LA5_39==SEMICOLON) ) {
                                                    alt5=6;
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("", 5, 39, input);

                                                    throw nvae;

                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 5, 42, input);

                                                throw nvae;

                                            }
                                        }
                                        else if ( (LA5_38==58) ) {
                                            int LA5_39 = input.LA(9);

                                            if ( (LA5_39==BOOLEAN||LA5_39==DOUBLE||LA5_39==INT||LA5_39==Modifier||LA5_39==STRING||LA5_39==System||LA5_39==VAR||(LA5_39 >= 74 && LA5_39 <= 78)||LA5_39==80) ) {
                                                alt5=10;
                                            }
                                            else if ( (LA5_39==SEMICOLON) ) {
                                                alt5=6;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 5, 39, input);

                                                throw nvae;

                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 5, 38, input);

                                            throw nvae;

                                        }
                                        }
                                        break;
                                    case 58:
                                        {
                                        int LA5_39 = input.LA(8);

                                        if ( (LA5_39==BOOLEAN||LA5_39==DOUBLE||LA5_39==INT||LA5_39==Modifier||LA5_39==STRING||LA5_39==System||LA5_39==VAR||(LA5_39 >= 74 && LA5_39 <= 78)||LA5_39==80) ) {
                                            alt5=10;
                                        }
                                        else if ( (LA5_39==SEMICOLON) ) {
                                            alt5=6;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 5, 39, input);

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
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 35, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 32, input);

                                throw nvae;

                            }
                            }
                            break;
                        case VAR:
                            {
                            int LA5_31 = input.LA(5);

                            if ( (LA5_31==57) ) {
                                switch ( input.LA(6) ) {
                                case NUM:
                                case VAR:
                                    {
                                    switch ( input.LA(7) ) {
                                    case 63:
                                        {
                                        int LA5_38 = input.LA(8);

                                        if ( (LA5_38==NUM||LA5_38==VAR) ) {
                                            int LA5_42 = input.LA(9);

                                            if ( (LA5_42==58) ) {
                                                int LA5_39 = input.LA(10);

                                                if ( (LA5_39==BOOLEAN||LA5_39==DOUBLE||LA5_39==INT||LA5_39==Modifier||LA5_39==STRING||LA5_39==System||LA5_39==VAR||(LA5_39 >= 74 && LA5_39 <= 78)||LA5_39==80) ) {
                                                    alt5=10;
                                                }
                                                else if ( (LA5_39==SEMICOLON) ) {
                                                    alt5=6;
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("", 5, 39, input);

                                                    throw nvae;

                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 5, 42, input);

                                                throw nvae;

                                            }
                                        }
                                        else if ( (LA5_38==58) ) {
                                            int LA5_39 = input.LA(9);

                                            if ( (LA5_39==BOOLEAN||LA5_39==DOUBLE||LA5_39==INT||LA5_39==Modifier||LA5_39==STRING||LA5_39==System||LA5_39==VAR||(LA5_39 >= 74 && LA5_39 <= 78)||LA5_39==80) ) {
                                                alt5=10;
                                            }
                                            else if ( (LA5_39==SEMICOLON) ) {
                                                alt5=6;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 5, 39, input);

                                                throw nvae;

                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 5, 38, input);

                                            throw nvae;

                                        }
                                        }
                                        break;
                                    case NUM:
                                    case VAR:
                                        {
                                        int LA5_42 = input.LA(8);

                                        if ( (LA5_42==58) ) {
                                            int LA5_39 = input.LA(9);

                                            if ( (LA5_39==BOOLEAN||LA5_39==DOUBLE||LA5_39==INT||LA5_39==Modifier||LA5_39==STRING||LA5_39==System||LA5_39==VAR||(LA5_39 >= 74 && LA5_39 <= 78)||LA5_39==80) ) {
                                                alt5=10;
                                            }
                                            else if ( (LA5_39==SEMICOLON) ) {
                                                alt5=6;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 5, 39, input);

                                                throw nvae;

                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 5, 42, input);

                                            throw nvae;

                                        }
                                        }
                                        break;
                                    case 58:
                                        {
                                        int LA5_39 = input.LA(8);

                                        if ( (LA5_39==BOOLEAN||LA5_39==DOUBLE||LA5_39==INT||LA5_39==Modifier||LA5_39==STRING||LA5_39==System||LA5_39==VAR||(LA5_39 >= 74 && LA5_39 <= 78)||LA5_39==80) ) {
                                            alt5=10;
                                        }
                                        else if ( (LA5_39==SEMICOLON) ) {
                                            alt5=6;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 5, 39, input);

                                            throw nvae;

                                        }
                                        }
                                        break;
                                    default:
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 5, 37, input);

                                        throw nvae;

                                    }

                                    }
                                    break;
                                case 63:
                                    {
                                    int LA5_38 = input.LA(7);

                                    if ( (LA5_38==NUM||LA5_38==VAR) ) {
                                        int LA5_42 = input.LA(8);

                                        if ( (LA5_42==58) ) {
                                            int LA5_39 = input.LA(9);

                                            if ( (LA5_39==BOOLEAN||LA5_39==DOUBLE||LA5_39==INT||LA5_39==Modifier||LA5_39==STRING||LA5_39==System||LA5_39==VAR||(LA5_39 >= 74 && LA5_39 <= 78)||LA5_39==80) ) {
                                                alt5=10;
                                            }
                                            else if ( (LA5_39==SEMICOLON) ) {
                                                alt5=6;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 5, 39, input);

                                                throw nvae;

                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 5, 42, input);

                                            throw nvae;

                                        }
                                    }
                                    else if ( (LA5_38==58) ) {
                                        int LA5_39 = input.LA(8);

                                        if ( (LA5_39==BOOLEAN||LA5_39==DOUBLE||LA5_39==INT||LA5_39==Modifier||LA5_39==STRING||LA5_39==System||LA5_39==VAR||(LA5_39 >= 74 && LA5_39 <= 78)||LA5_39==80) ) {
                                            alt5=10;
                                        }
                                        else if ( (LA5_39==SEMICOLON) ) {
                                            alt5=6;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 5, 39, input);

                                            throw nvae;

                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 5, 38, input);

                                        throw nvae;

                                    }
                                    }
                                    break;
                                case 58:
                                    {
                                    int LA5_39 = input.LA(7);

                                    if ( (LA5_39==BOOLEAN||LA5_39==DOUBLE||LA5_39==INT||LA5_39==Modifier||LA5_39==STRING||LA5_39==System||LA5_39==VAR||(LA5_39 >= 74 && LA5_39 <= 78)||LA5_39==80) ) {
                                        alt5=10;
                                    }
                                    else if ( (LA5_39==SEMICOLON) ) {
                                        alt5=6;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 5, 39, input);

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
                            else if ( (LA5_31==Dot||LA5_31==SEMICOLON||(LA5_31 >= 59 && LA5_31 <= 60)||LA5_31==64||LA5_31==67) ) {
                                alt5=6;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 31, input);

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
                        case 59:
                        case 60:
                        case 64:
                            {
                            alt5=6;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 28, input);

                            throw nvae;

                        }

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
                    {
                    alt5=6;
                    }
                    break;
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
                    int LA5_21 = input.LA(3);

                    if ( (LA5_21==SEMICOLON||LA5_21==69) ) {
                        alt5=8;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 21, input);

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

            char_literal23=(Token)match(input,79,FOLLOW_79_in_method404);  
            stream_79.add(char_literal23);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:78:34: ( stmt )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==BOOLEAN||LA8_0==DOUBLE||LA8_0==INT||LA8_0==Modifier||LA8_0==SEMICOLON||LA8_0==STRING||LA8_0==System||LA8_0==VAR||(LA8_0 >= 75 && LA8_0 <= 76)||LA8_0==78) ) {
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
            // elements: types, 80, VAR, 79, Modifier, params, SEMICOLON, stmt, return_type, 77
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
                stream_79.nextNode()
                );

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:79:47: ( stmt )*
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


            char_literal41=(Token)match(input,80,FOLLOW_80_in_main_method482);  
            stream_80.add(char_literal41);


            // AST REWRITE
            // elements: 79, 58, 73, print, 71, VOID, Modifier, 72, Main, Static, 57, 80, STRING
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

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:86:138: ( print )*
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


            char_literal56=(Token)match(input,58,FOLLOW_58_in_print541);  
            stream_58.add(char_literal56);


            char_literal57=(Token)match(input,58,FOLLOW_58_in_print543);  
            stream_58.add(char_literal57);


            SEMICOLON58=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_print545);  
            stream_SEMICOLON.add(SEMICOLON58);


            // AST REWRITE
            // elements: Dot, Println, NUM, System, 57, 58, VAR, 58, SEMICOLON, 58, New, Out, Dot, Dot, 57, 57, VAR
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

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:87:149: ( NUM )?
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

                    if ( (LA11_0==71) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:93:20: '[' ']'
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:95:1: initialize_1 : VAR '=' ( New | VAR ) ( Dot )? VAR '(' ( NUM | VAR )? ( ',' )? ( NUM | VAR )? ')' ;
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
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:96:2: ( VAR '=' ( New | VAR ) ( Dot )? VAR '(' ( NUM | VAR )? ( ',' )? ( NUM | VAR )? ')' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:96:4: VAR '=' ( New | VAR ) ( Dot )? VAR '(' ( NUM | VAR )? ( ',' )? ( NUM | VAR )? ')'
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


            char_literal72=(Token)match(input,57,FOLLOW_57_in_initialize_1640); 
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


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:96:44: ( ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==63) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:96:44: ','
                    {
                    char_literal74=(Token)match(input,63,FOLLOW_63_in_initialize_1647); 
                    char_literal74_tree = 
                    (Object)adaptor.create(char_literal74)
                    ;
                    adaptor.addChild(root_0, char_literal74_tree);


                    }
                    break;

            }


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:96:48: ( NUM | VAR )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==NUM||LA17_0==VAR) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:97:1: sys_print : System Dot Out Dot Println '(' ( NUM | VAR Dot VAR '(' ( NUM )? ')' ) ')' SEMICOLON ;
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
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:98:2: ( System Dot Out Dot Println '(' ( NUM | VAR Dot VAR '(' ( NUM )? ')' ) ')' SEMICOLON )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:98:4: System Dot Out Dot Println '(' ( NUM | VAR Dot VAR '(' ( NUM )? ')' ) ')' SEMICOLON
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


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:98:34: ( NUM | VAR Dot VAR '(' ( NUM )? ')' )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:98:35: NUM
                    {
                    NUM83=(Token)match(input,NUM,FOLLOW_NUM_in_sys_print677); 
                    NUM83_tree = 
                    (Object)adaptor.create(NUM83)
                    ;
                    adaptor.addChild(root_0, NUM83_tree);


                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:98:39: VAR Dot VAR '(' ( NUM )? ')'
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


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:98:54: ( NUM )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NUM) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:98:54: NUM
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:99:1: object : ( ob_cho | ( VAR )? | NUM );
    public final ArithmeticExpressionsParser.object_return object() throws RecognitionException {
        ArithmeticExpressionsParser.object_return retval = new ArithmeticExpressionsParser.object_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR93=null;
        Token NUM94=null;
        ArithmeticExpressionsParser.ob_cho_return ob_cho92 =null;


        Object VAR93_tree=null;
        Object NUM94_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:99:8: ( ob_cho | ( VAR )? | NUM )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 55:
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
                else if ( (LA21_2==AndOr||(LA21_2 >= RelationalOperators && LA21_2 <= SEMICOLON)||LA21_2==56||LA21_2==58||LA21_2==60||LA21_2==64||LA21_2==68||LA21_2==70) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:99:10: ob_cho
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ob_cho_in_object701);
                    ob_cho92=ob_cho();

                    state._fsp--;

                    adaptor.addChild(root_0, ob_cho92.getTree());

                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:99:19: ( VAR )?
                    {
                    root_0 = (Object)adaptor.nil();


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:99:19: ( VAR )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==VAR) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:99:19: VAR
                            {
                            VAR93=(Token)match(input,VAR,FOLLOW_VAR_in_object705); 
                            VAR93_tree = 
                            (Object)adaptor.create(VAR93)
                            ;
                            adaptor.addChild(root_0, VAR93_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:99:26: NUM
                    {
                    root_0 = (Object)adaptor.nil();


                    NUM94=(Token)match(input,NUM,FOLLOW_NUM_in_object710); 
                    NUM94_tree = 
                    (Object)adaptor.create(NUM94)
                    ;
                    adaptor.addChild(root_0, NUM94_tree);


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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:101:1: ob_body : ( '!' )? VAR Dot VAR '(' ( NUM | VAR ) ( generalArithExpr ) ')' ;
    public final ArithmeticExpressionsParser.ob_body_return ob_body() throws RecognitionException {
        ArithmeticExpressionsParser.ob_body_return retval = new ArithmeticExpressionsParser.ob_body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal95=null;
        Token VAR96=null;
        Token Dot97=null;
        Token VAR98=null;
        Token char_literal99=null;
        Token set100=null;
        Token char_literal102=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr101 =null;


        Object char_literal95_tree=null;
        Object VAR96_tree=null;
        Object Dot97_tree=null;
        Object VAR98_tree=null;
        Object char_literal99_tree=null;
        Object set100_tree=null;
        Object char_literal102_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:101:9: ( ( '!' )? VAR Dot VAR '(' ( NUM | VAR ) ( generalArithExpr ) ')' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:101:11: ( '!' )? VAR Dot VAR '(' ( NUM | VAR ) ( generalArithExpr ) ')'
            {
            root_0 = (Object)adaptor.nil();


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:101:11: ( '!' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==55) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:101:12: '!'
                    {
                    char_literal95=(Token)match(input,55,FOLLOW_55_in_ob_body719); 
                    char_literal95_tree = 
                    (Object)adaptor.create(char_literal95)
                    ;
                    adaptor.addChild(root_0, char_literal95_tree);


                    }
                    break;

            }


            VAR96=(Token)match(input,VAR,FOLLOW_VAR_in_ob_body723); 
            VAR96_tree = 
            (Object)adaptor.create(VAR96)
            ;
            adaptor.addChild(root_0, VAR96_tree);


            Dot97=(Token)match(input,Dot,FOLLOW_Dot_in_ob_body725); 
            Dot97_tree = 
            (Object)adaptor.create(Dot97)
            ;
            adaptor.addChild(root_0, Dot97_tree);


            VAR98=(Token)match(input,VAR,FOLLOW_VAR_in_ob_body727); 
            VAR98_tree = 
            (Object)adaptor.create(VAR98)
            ;
            adaptor.addChild(root_0, VAR98_tree);


            char_literal99=(Token)match(input,57,FOLLOW_57_in_ob_body729); 
            char_literal99_tree = 
            (Object)adaptor.create(char_literal99)
            ;
            adaptor.addChild(root_0, char_literal99_tree);


            set100=(Token)input.LT(1);

            if ( input.LA(1)==NUM||input.LA(1)==VAR ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set100)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:101:45: ( generalArithExpr )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:101:46: generalArithExpr
            {
            pushFollow(FOLLOW_generalArithExpr_in_ob_body739);
            generalArithExpr101=generalArithExpr();

            state._fsp--;

            adaptor.addChild(root_0, generalArithExpr101.getTree());

            }


            char_literal102=(Token)match(input,58,FOLLOW_58_in_ob_body742); 
            char_literal102_tree = 
            (Object)adaptor.create(char_literal102)
            ;
            adaptor.addChild(root_0, char_literal102_tree);


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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:102:1: ob_cho : ( ( '!' )? VAR Dot VAR '(' ( NUM | VAR )? ')' | ob_body );
    public final ArithmeticExpressionsParser.ob_cho_return ob_cho() throws RecognitionException {
        ArithmeticExpressionsParser.ob_cho_return retval = new ArithmeticExpressionsParser.ob_cho_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal103=null;
        Token VAR104=null;
        Token Dot105=null;
        Token VAR106=null;
        Token char_literal107=null;
        Token set108=null;
        Token char_literal109=null;
        ArithmeticExpressionsParser.ob_body_return ob_body110 =null;


        Object char_literal103_tree=null;
        Object VAR104_tree=null;
        Object Dot105_tree=null;
        Object VAR106_tree=null;
        Object char_literal107_tree=null;
        Object set108_tree=null;
        Object char_literal109_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:102:8: ( ( '!' )? VAR Dot VAR '(' ( NUM | VAR )? ')' | ob_body )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==55) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==VAR) ) {
                    int LA25_2 = input.LA(3);

                    if ( (LA25_2==Dot) ) {
                        int LA25_3 = input.LA(4);

                        if ( (LA25_3==VAR) ) {
                            int LA25_4 = input.LA(5);

                            if ( (LA25_4==57) ) {
                                int LA25_5 = input.LA(6);

                                if ( (LA25_5==NUM||LA25_5==VAR) ) {
                                    int LA25_6 = input.LA(7);

                                    if ( (LA25_6==DNUM||LA25_6==Fun||LA25_6==NUM||LA25_6==VAR||LA25_6==55||LA25_6==57||LA25_6==60||LA25_6==64) ) {
                                        alt25=2;
                                    }
                                    else if ( (LA25_6==58) ) {
                                        alt25=1;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 25, 6, input);

                                        throw nvae;

                                    }
                                }
                                else if ( (LA25_5==58) ) {
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

                        if ( (LA25_4==57) ) {
                            int LA25_5 = input.LA(5);

                            if ( (LA25_5==NUM||LA25_5==VAR) ) {
                                int LA25_6 = input.LA(6);

                                if ( (LA25_6==DNUM||LA25_6==Fun||LA25_6==NUM||LA25_6==VAR||LA25_6==55||LA25_6==57||LA25_6==60||LA25_6==64) ) {
                                    alt25=2;
                                }
                                else if ( (LA25_6==58) ) {
                                    alt25=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 25, 6, input);

                                    throw nvae;

                                }
                            }
                            else if ( (LA25_5==58) ) {
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:102:9: ( '!' )? VAR Dot VAR '(' ( NUM | VAR )? ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:102:9: ( '!' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==55) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:102:10: '!'
                            {
                            char_literal103=(Token)match(input,55,FOLLOW_55_in_ob_cho749); 
                            char_literal103_tree = 
                            (Object)adaptor.create(char_literal103)
                            ;
                            adaptor.addChild(root_0, char_literal103_tree);


                            }
                            break;

                    }


                    VAR104=(Token)match(input,VAR,FOLLOW_VAR_in_ob_cho753); 
                    VAR104_tree = 
                    (Object)adaptor.create(VAR104)
                    ;
                    adaptor.addChild(root_0, VAR104_tree);


                    Dot105=(Token)match(input,Dot,FOLLOW_Dot_in_ob_cho755); 
                    Dot105_tree = 
                    (Object)adaptor.create(Dot105)
                    ;
                    adaptor.addChild(root_0, Dot105_tree);


                    VAR106=(Token)match(input,VAR,FOLLOW_VAR_in_ob_cho757); 
                    VAR106_tree = 
                    (Object)adaptor.create(VAR106)
                    ;
                    adaptor.addChild(root_0, VAR106_tree);


                    char_literal107=(Token)match(input,57,FOLLOW_57_in_ob_cho759); 
                    char_literal107_tree = 
                    (Object)adaptor.create(char_literal107)
                    ;
                    adaptor.addChild(root_0, char_literal107_tree);


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:102:32: ( NUM | VAR )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==NUM||LA24_0==VAR) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:
                            {
                            set108=(Token)input.LT(1);

                            if ( input.LA(1)==NUM||input.LA(1)==VAR ) {
                                input.consume();
                                adaptor.addChild(root_0, 
                                (Object)adaptor.create(set108)
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


                    char_literal109=(Token)match(input,58,FOLLOW_58_in_ob_cho769); 
                    char_literal109_tree = 
                    (Object)adaptor.create(char_literal109)
                    ;
                    adaptor.addChild(root_0, char_literal109_tree);


                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:102:50: ob_body
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ob_body_in_ob_cho773);
                    ob_body110=ob_body();

                    state._fsp--;

                    adaptor.addChild(root_0, ob_body110.getTree());

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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:103:1: params : '(' ( ( types VAR | VAR VAR ) ( ',' types VAR )* )? ')' ;
    public final ArithmeticExpressionsParser.params_return params() throws RecognitionException {
        ArithmeticExpressionsParser.params_return retval = new ArithmeticExpressionsParser.params_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal111=null;
        Token VAR113=null;
        Token VAR114=null;
        Token VAR115=null;
        Token char_literal116=null;
        Token VAR118=null;
        Token char_literal119=null;
        ArithmeticExpressionsParser.types_return types112 =null;

        ArithmeticExpressionsParser.types_return types117 =null;


        Object char_literal111_tree=null;
        Object VAR113_tree=null;
        Object VAR114_tree=null;
        Object VAR115_tree=null;
        Object char_literal116_tree=null;
        Object VAR118_tree=null;
        Object char_literal119_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:103:8: ( '(' ( ( types VAR | VAR VAR ) ( ',' types VAR )* )? ')' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:103:10: '(' ( ( types VAR | VAR VAR ) ( ',' types VAR )* )? ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal111=(Token)match(input,57,FOLLOW_57_in_params781); 
            char_literal111_tree = 
            (Object)adaptor.create(char_literal111)
            ;
            adaptor.addChild(root_0, char_literal111_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:103:13: ( ( types VAR | VAR VAR ) ( ',' types VAR )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==BOOLEAN||LA28_0==DOUBLE||LA28_0==INT||LA28_0==STRING||LA28_0==VAR) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:103:14: ( types VAR | VAR VAR ) ( ',' types VAR )*
                    {
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:103:14: ( types VAR | VAR VAR )
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
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:103:15: types VAR
                            {
                            pushFollow(FOLLOW_types_in_params784);
                            types112=types();

                            state._fsp--;

                            adaptor.addChild(root_0, types112.getTree());

                            VAR113=(Token)match(input,VAR,FOLLOW_VAR_in_params786); 
                            VAR113_tree = 
                            (Object)adaptor.create(VAR113)
                            ;
                            adaptor.addChild(root_0, VAR113_tree);


                            }
                            break;
                        case 2 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:103:25: VAR VAR
                            {
                            VAR114=(Token)match(input,VAR,FOLLOW_VAR_in_params788); 
                            VAR114_tree = 
                            (Object)adaptor.create(VAR114)
                            ;
                            adaptor.addChild(root_0, VAR114_tree);


                            VAR115=(Token)match(input,VAR,FOLLOW_VAR_in_params790); 
                            VAR115_tree = 
                            (Object)adaptor.create(VAR115)
                            ;
                            adaptor.addChild(root_0, VAR115_tree);


                            }
                            break;

                    }


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:103:34: ( ',' types VAR )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==63) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:103:35: ',' types VAR
                    	    {
                    	    char_literal116=(Token)match(input,63,FOLLOW_63_in_params794); 
                    	    char_literal116_tree = 
                    	    (Object)adaptor.create(char_literal116)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal116_tree);


                    	    pushFollow(FOLLOW_types_in_params796);
                    	    types117=types();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, types117.getTree());

                    	    VAR118=(Token)match(input,VAR,FOLLOW_VAR_in_params798); 
                    	    VAR118_tree = 
                    	    (Object)adaptor.create(VAR118)
                    	    ;
                    	    adaptor.addChild(root_0, VAR118_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal119=(Token)match(input,58,FOLLOW_58_in_params804); 
            char_literal119_tree = 
            (Object)adaptor.create(char_literal119)
            ;
            adaptor.addChild(root_0, char_literal119_tree);


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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:104:1: decl : ( int_dec -> ^( Int_dec int_dec ) | double_dec -> ^( Double_dec double_dec ) );
    public final ArithmeticExpressionsParser.decl_return decl() throws RecognitionException {
        ArithmeticExpressionsParser.decl_return retval = new ArithmeticExpressionsParser.decl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.int_dec_return int_dec120 =null;

        ArithmeticExpressionsParser.double_dec_return double_dec121 =null;


        RewriteRuleSubtreeStream stream_int_dec=new RewriteRuleSubtreeStream(adaptor,"rule int_dec");
        RewriteRuleSubtreeStream stream_double_dec=new RewriteRuleSubtreeStream(adaptor,"rule double_dec");
        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:104:9: ( int_dec -> ^( Int_dec int_dec ) | double_dec -> ^( Double_dec double_dec ) )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:105:2: int_dec
                    {
                    pushFollow(FOLLOW_int_dec_in_decl818);
                    int_dec120=int_dec();

                    state._fsp--;

                    stream_int_dec.add(int_dec120.getTree());

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
                    // 105:10: -> ^( Int_dec int_dec )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:105:13: ^( Int_dec int_dec )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:106:3: double_dec
                    {
                    pushFollow(FOLLOW_double_dec_in_decl830);
                    double_dec121=double_dec();

                    state._fsp--;

                    stream_double_dec.add(double_dec121.getTree());

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
                    // 106:14: -> ^( Double_dec double_dec )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:106:17: ^( Double_dec double_dec )
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:108:2: while_condition : ( '(' condition ')' | object );
    public final ArithmeticExpressionsParser.while_condition_return while_condition() throws RecognitionException {
        ArithmeticExpressionsParser.while_condition_return retval = new ArithmeticExpressionsParser.while_condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal122=null;
        Token char_literal124=null;
        ArithmeticExpressionsParser.condition_return condition123 =null;

        ArithmeticExpressionsParser.object_return object125 =null;


        Object char_literal122_tree=null;
        Object char_literal124_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:109:4: ( '(' condition ')' | object )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==57) ) {
                alt30=1;
            }
            else if ( (LA30_0==AndOr||LA30_0==NUM||(LA30_0 >= RelationalOperators && LA30_0 <= SEMICOLON)||LA30_0==VAR||(LA30_0 >= 55 && LA30_0 <= 56)||LA30_0==58||LA30_0==60||LA30_0==64||LA30_0==68||LA30_0==70) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:109:6: '(' condition ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal122=(Token)match(input,57,FOLLOW_57_in_while_condition851); 
                    char_literal122_tree = 
                    (Object)adaptor.create(char_literal122)
                    ;
                    adaptor.addChild(root_0, char_literal122_tree);


                    pushFollow(FOLLOW_condition_in_while_condition853);
                    condition123=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, condition123.getTree());

                    char_literal124=(Token)match(input,58,FOLLOW_58_in_while_condition855); 
                    char_literal124_tree = 
                    (Object)adaptor.create(char_literal124)
                    ;
                    adaptor.addChild(root_0, char_literal124_tree);


                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:109:24: object
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_object_in_while_condition857);
                    object125=object();

                    state._fsp--;

                    adaptor.addChild(root_0, object125.getTree());

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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:110:1: whilestmt : 'while' '(' while_condition ')' '{' ( stmt )* '}' -> ^( Whilestmt 'while' '(' while_condition ')' '{' ( stmt )* '}' ) ;
    public final ArithmeticExpressionsParser.whilestmt_return whilestmt() throws RecognitionException {
        ArithmeticExpressionsParser.whilestmt_return retval = new ArithmeticExpressionsParser.whilestmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal126=null;
        Token char_literal127=null;
        Token char_literal129=null;
        Token char_literal130=null;
        Token char_literal132=null;
        ArithmeticExpressionsParser.while_condition_return while_condition128 =null;

        ArithmeticExpressionsParser.stmt_return stmt131 =null;


        Object string_literal126_tree=null;
        Object char_literal127_tree=null;
        Object char_literal129_tree=null;
        Object char_literal130_tree=null;
        Object char_literal132_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleSubtreeStream stream_while_condition=new RewriteRuleSubtreeStream(adaptor,"rule while_condition");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:110:11: ( 'while' '(' while_condition ')' '{' ( stmt )* '}' -> ^( Whilestmt 'while' '(' while_condition ')' '{' ( stmt )* '}' ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:111:2: 'while' '(' while_condition ')' '{' ( stmt )* '}'
            {
            string_literal126=(Token)match(input,78,FOLLOW_78_in_whilestmt866);  
            stream_78.add(string_literal126);


            char_literal127=(Token)match(input,57,FOLLOW_57_in_whilestmt868);  
            stream_57.add(char_literal127);


            pushFollow(FOLLOW_while_condition_in_whilestmt870);
            while_condition128=while_condition();

            state._fsp--;

            stream_while_condition.add(while_condition128.getTree());

            char_literal129=(Token)match(input,58,FOLLOW_58_in_whilestmt872);  
            stream_58.add(char_literal129);


            char_literal130=(Token)match(input,79,FOLLOW_79_in_whilestmt874);  
            stream_79.add(char_literal130);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:111:38: ( stmt )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==BOOLEAN||LA31_0==DOUBLE||LA31_0==INT||LA31_0==Modifier||LA31_0==SEMICOLON||LA31_0==STRING||LA31_0==System||LA31_0==VAR||(LA31_0 >= 75 && LA31_0 <= 76)||LA31_0==78) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:111:38: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_whilestmt876);
            	    stmt131=stmt();

            	    state._fsp--;

            	    stream_stmt.add(stmt131.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            char_literal132=(Token)match(input,80,FOLLOW_80_in_whilestmt879);  
            stream_80.add(char_literal132);


            // AST REWRITE
            // elements: 78, 57, 58, 79, 80, while_condition, stmt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 112:3: -> ^( Whilestmt 'while' '(' while_condition ')' '{' ( stmt )* '}' )
            {
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:112:6: ^( Whilestmt 'while' '(' while_condition ')' '{' ( stmt )* '}' )
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

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:112:54: ( stmt )*
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:117:1: ifstmt : 'if' '(' ( '!' )? ( '(' )? if_cond ( ')' )? ')' ( '{' )? ( stmt )* ( '}' )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )? ;
    public final ArithmeticExpressionsParser.ifstmt_return ifstmt() throws RecognitionException {
        ArithmeticExpressionsParser.ifstmt_return retval = new ArithmeticExpressionsParser.ifstmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal133=null;
        Token char_literal134=null;
        Token char_literal135=null;
        Token char_literal136=null;
        Token char_literal138=null;
        Token char_literal139=null;
        Token char_literal140=null;
        Token char_literal142=null;
        Token string_literal143=null;
        Token char_literal144=null;
        Token char_literal146=null;
        Token string_literal147=null;
        Token char_literal148=null;
        Token char_literal150=null;
        ArithmeticExpressionsParser.if_cond_return if_cond137 =null;

        ArithmeticExpressionsParser.stmt_return stmt141 =null;

        ArithmeticExpressionsParser.stmt_return stmt145 =null;

        ArithmeticExpressionsParser.stmt_return stmt149 =null;


        Object string_literal133_tree=null;
        Object char_literal134_tree=null;
        Object char_literal135_tree=null;
        Object char_literal136_tree=null;
        Object char_literal138_tree=null;
        Object char_literal139_tree=null;
        Object char_literal140_tree=null;
        Object char_literal142_tree=null;
        Object string_literal143_tree=null;
        Object char_literal144_tree=null;
        Object char_literal146_tree=null;
        Object string_literal147_tree=null;
        Object char_literal148_tree=null;
        Object char_literal150_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:117:9: ( 'if' '(' ( '!' )? ( '(' )? if_cond ( ')' )? ')' ( '{' )? ( stmt )* ( '}' )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )? )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:2: 'if' '(' ( '!' )? ( '(' )? if_cond ( ')' )? ')' ( '{' )? ( stmt )* ( '}' )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )? ( 'else' ( '{' )? ( stmt )* ( '}' )? )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal133=(Token)match(input,76,FOLLOW_76_in_ifstmt924); 
            string_literal133_tree = 
            (Object)adaptor.create(string_literal133)
            ;
            adaptor.addChild(root_0, string_literal133_tree);


            char_literal134=(Token)match(input,57,FOLLOW_57_in_ifstmt926); 
            char_literal134_tree = 
            (Object)adaptor.create(char_literal134)
            ;
            adaptor.addChild(root_0, char_literal134_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:11: ( '!' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==55) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:12: '!'
                    {
                    char_literal135=(Token)match(input,55,FOLLOW_55_in_ifstmt929); 
                    char_literal135_tree = 
                    (Object)adaptor.create(char_literal135)
                    ;
                    adaptor.addChild(root_0, char_literal135_tree);


                    }
                    break;

            }


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:19: ( '(' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==57) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:20: '('
                    {
                    char_literal136=(Token)match(input,57,FOLLOW_57_in_ifstmt935); 
                    char_literal136_tree = 
                    (Object)adaptor.create(char_literal136)
                    ;
                    adaptor.addChild(root_0, char_literal136_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_if_cond_in_ifstmt939);
            if_cond137=if_cond();

            state._fsp--;

            adaptor.addChild(root_0, if_cond137.getTree());

            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:34: ( ')' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==58) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==58) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:35: ')'
                    {
                    char_literal138=(Token)match(input,58,FOLLOW_58_in_ifstmt942); 
                    char_literal138_tree = 
                    (Object)adaptor.create(char_literal138)
                    ;
                    adaptor.addChild(root_0, char_literal138_tree);


                    }
                    break;

            }


            char_literal139=(Token)match(input,58,FOLLOW_58_in_ifstmt946); 
            char_literal139_tree = 
            (Object)adaptor.create(char_literal139)
            ;
            adaptor.addChild(root_0, char_literal139_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:45: ( '{' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==79) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:46: '{'
                    {
                    char_literal140=(Token)match(input,79,FOLLOW_79_in_ifstmt949); 
                    char_literal140_tree = 
                    (Object)adaptor.create(char_literal140)
                    ;
                    adaptor.addChild(root_0, char_literal140_tree);


                    }
                    break;

            }


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:52: ( stmt )*
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
                case 76:
                    {
                    alt36=1;
                    }
                    break;
                case 78:
                    {
                    alt36=1;
                    }
                    break;
                case 75:
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
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:52: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_ifstmt953);
            	    stmt141=stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stmt141.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:58: ( '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==80) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:59: '}'
                    {
                    char_literal142=(Token)match(input,80,FOLLOW_80_in_ifstmt957); 
                    char_literal142_tree = 
                    (Object)adaptor.create(char_literal142)
                    ;
                    adaptor.addChild(root_0, char_literal142_tree);


                    }
                    break;

            }


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:65: ( 'else' ( '{' )? ( stmt )* ( '}' )? )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==74) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:66: 'else' ( '{' )? ( stmt )* ( '}' )?
                    {
                    string_literal143=(Token)match(input,74,FOLLOW_74_in_ifstmt962); 
                    string_literal143_tree = 
                    (Object)adaptor.create(string_literal143)
                    ;
                    adaptor.addChild(root_0, string_literal143_tree);


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:73: ( '{' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==79) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:74: '{'
                            {
                            char_literal144=(Token)match(input,79,FOLLOW_79_in_ifstmt965); 
                            char_literal144_tree = 
                            (Object)adaptor.create(char_literal144)
                            ;
                            adaptor.addChild(root_0, char_literal144_tree);


                            }
                            break;

                    }


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:80: ( stmt )*
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
                        case 76:
                            {
                            alt39=1;
                            }
                            break;
                        case 78:
                            {
                            alt39=1;
                            }
                            break;
                        case 75:
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
                    	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:80: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_ifstmt969);
                    	    stmt145=stmt();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, stmt145.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:86: ( '}' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==80) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:87: '}'
                            {
                            char_literal146=(Token)match(input,80,FOLLOW_80_in_ifstmt973); 
                            char_literal146_tree = 
                            (Object)adaptor.create(char_literal146)
                            ;
                            adaptor.addChild(root_0, char_literal146_tree);


                            }
                            break;

                    }


                    }
                    break;

            }


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:95: ( 'else' ( '{' )? ( stmt )* ( '}' )? )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==74) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:96: 'else' ( '{' )? ( stmt )* ( '}' )?
                    {
                    string_literal147=(Token)match(input,74,FOLLOW_74_in_ifstmt980); 
                    string_literal147_tree = 
                    (Object)adaptor.create(string_literal147)
                    ;
                    adaptor.addChild(root_0, string_literal147_tree);


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:103: ( '{' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==79) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:104: '{'
                            {
                            char_literal148=(Token)match(input,79,FOLLOW_79_in_ifstmt983); 
                            char_literal148_tree = 
                            (Object)adaptor.create(char_literal148)
                            ;
                            adaptor.addChild(root_0, char_literal148_tree);


                            }
                            break;

                    }


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:110: ( stmt )*
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
                        case 76:
                            {
                            alt43=1;
                            }
                            break;
                        case 78:
                            {
                            alt43=1;
                            }
                            break;
                        case 75:
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
                    	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:110: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_ifstmt987);
                    	    stmt149=stmt();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, stmt149.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:116: ( '}' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==80) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:118:117: '}'
                            {
                            char_literal150=(Token)match(input,80,FOLLOW_80_in_ifstmt991); 
                            char_literal150_tree = 
                            (Object)adaptor.create(char_literal150)
                            ;
                            adaptor.addChild(root_0, char_literal150_tree);


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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:121:2: if_cond : if_nor ;
    public final ArithmeticExpressionsParser.if_cond_return if_cond() throws RecognitionException {
        ArithmeticExpressionsParser.if_cond_return retval = new ArithmeticExpressionsParser.if_cond_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.if_nor_return if_nor151 =null;



        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:121:10: ( if_nor )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:121:13: if_nor
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_if_nor_in_if_cond1009);
            if_nor151=if_nor();

            state._fsp--;

            adaptor.addChild(root_0, if_nor151.getTree());

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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:122:2: if_nor : object ( ( '>' | '<' | '&&' ) ^ object )* ;
    public final ArithmeticExpressionsParser.if_nor_return if_nor() throws RecognitionException {
        ArithmeticExpressionsParser.if_nor_return retval = new ArithmeticExpressionsParser.if_nor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set153=null;
        ArithmeticExpressionsParser.object_return object152 =null;

        ArithmeticExpressionsParser.object_return object154 =null;


        Object set153_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:122:9: ( object ( ( '>' | '<' | '&&' ) ^ object )* )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:122:12: object ( ( '>' | '<' | '&&' ) ^ object )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_object_in_if_nor1021);
            object152=object();

            state._fsp--;

            adaptor.addChild(root_0, object152.getTree());

            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:122:19: ( ( '>' | '<' | '&&' ) ^ object )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==56||LA46_0==68||LA46_0==70) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:122:20: ( '>' | '<' | '&&' ) ^ object
            	    {
            	    set153=(Token)input.LT(1);

            	    set153=(Token)input.LT(1);

            	    if ( input.LA(1)==56||input.LA(1)==68||input.LA(1)==70 ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set153)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_object_in_if_nor1039);
            	    object154=object();

            	    state._fsp--;

            	    adaptor.addChild(root_0, object154.getTree());

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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:123:1: forloop : 'for' '(' ( decl ) ( condition ) SEMICOLON ( VAR change ) ')' '{' ( stmt )* '}' ;
    public final ArithmeticExpressionsParser.forloop_return forloop() throws RecognitionException {
        ArithmeticExpressionsParser.forloop_return retval = new ArithmeticExpressionsParser.forloop_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal155=null;
        Token char_literal156=null;
        Token SEMICOLON159=null;
        Token VAR160=null;
        Token char_literal162=null;
        Token char_literal163=null;
        Token char_literal165=null;
        ArithmeticExpressionsParser.decl_return decl157 =null;

        ArithmeticExpressionsParser.condition_return condition158 =null;

        ArithmeticExpressionsParser.change_return change161 =null;

        ArithmeticExpressionsParser.stmt_return stmt164 =null;


        Object string_literal155_tree=null;
        Object char_literal156_tree=null;
        Object SEMICOLON159_tree=null;
        Object VAR160_tree=null;
        Object char_literal162_tree=null;
        Object char_literal163_tree=null;
        Object char_literal165_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:123:9: ( 'for' '(' ( decl ) ( condition ) SEMICOLON ( VAR change ) ')' '{' ( stmt )* '}' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:124:2: 'for' '(' ( decl ) ( condition ) SEMICOLON ( VAR change ) ')' '{' ( stmt )* '}'
            {
            root_0 = (Object)adaptor.nil();


            string_literal155=(Token)match(input,75,FOLLOW_75_in_forloop1054); 
            string_literal155_tree = 
            (Object)adaptor.create(string_literal155)
            ;
            adaptor.addChild(root_0, string_literal155_tree);


            char_literal156=(Token)match(input,57,FOLLOW_57_in_forloop1056); 
            char_literal156_tree = 
            (Object)adaptor.create(char_literal156)
            ;
            adaptor.addChild(root_0, char_literal156_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:124:12: ( decl )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:124:13: decl
            {
            pushFollow(FOLLOW_decl_in_forloop1059);
            decl157=decl();

            state._fsp--;

            adaptor.addChild(root_0, decl157.getTree());

            }


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:124:19: ( condition )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:124:20: condition
            {
            pushFollow(FOLLOW_condition_in_forloop1063);
            condition158=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition158.getTree());

            }


            SEMICOLON159=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_forloop1066); 
            SEMICOLON159_tree = 
            (Object)adaptor.create(SEMICOLON159)
            ;
            adaptor.addChild(root_0, SEMICOLON159_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:124:41: ( VAR change )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:124:42: VAR change
            {
            VAR160=(Token)match(input,VAR,FOLLOW_VAR_in_forloop1069); 
            VAR160_tree = 
            (Object)adaptor.create(VAR160)
            ;
            adaptor.addChild(root_0, VAR160_tree);


            pushFollow(FOLLOW_change_in_forloop1071);
            change161=change();

            state._fsp--;

            adaptor.addChild(root_0, change161.getTree());

            }


            char_literal162=(Token)match(input,58,FOLLOW_58_in_forloop1074); 
            char_literal162_tree = 
            (Object)adaptor.create(char_literal162)
            ;
            adaptor.addChild(root_0, char_literal162_tree);


            char_literal163=(Token)match(input,79,FOLLOW_79_in_forloop1076); 
            char_literal163_tree = 
            (Object)adaptor.create(char_literal163)
            ;
            adaptor.addChild(root_0, char_literal163_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:124:62: ( stmt )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==BOOLEAN||LA47_0==DOUBLE||LA47_0==INT||LA47_0==Modifier||LA47_0==SEMICOLON||LA47_0==STRING||LA47_0==System||LA47_0==VAR||(LA47_0 >= 75 && LA47_0 <= 76)||LA47_0==78) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:124:62: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_forloop1078);
            	    stmt164=stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stmt164.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            char_literal165=(Token)match(input,80,FOLLOW_80_in_forloop1081); 
            char_literal165_tree = 
            (Object)adaptor.create(char_literal165)
            ;
            adaptor.addChild(root_0, char_literal165_tree);


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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:126:1: assigment : assign -> ^( Assigment assign ) ;
    public final ArithmeticExpressionsParser.assigment_return assigment() throws RecognitionException {
        ArithmeticExpressionsParser.assigment_return retval = new ArithmeticExpressionsParser.assigment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.assign_return assign166 =null;


        RewriteRuleSubtreeStream stream_assign=new RewriteRuleSubtreeStream(adaptor,"rule assign");
        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:126:10: ( assign -> ^( Assigment assign ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:127:2: assign
            {
            pushFollow(FOLLOW_assign_in_assigment1093);
            assign166=assign();

            state._fsp--;

            stream_assign.add(assign166.getTree());

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
            // 128:2: -> ^( Assigment assign )
            {
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:128:5: ^( Assigment assign )
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:130:1: initialize_2 : ( Dot )? VAR '(' ( NUM | VAR )? ( ',' )? ( NUM | VAR )? ')' ;
    public final ArithmeticExpressionsParser.initialize_2_return initialize_2() throws RecognitionException {
        ArithmeticExpressionsParser.initialize_2_return retval = new ArithmeticExpressionsParser.initialize_2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Dot167=null;
        Token VAR168=null;
        Token char_literal169=null;
        Token set170=null;
        Token char_literal171=null;
        Token set172=null;
        Token char_literal173=null;

        Object Dot167_tree=null;
        Object VAR168_tree=null;
        Object char_literal169_tree=null;
        Object set170_tree=null;
        Object char_literal171_tree=null;
        Object set172_tree=null;
        Object char_literal173_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:131:2: ( ( Dot )? VAR '(' ( NUM | VAR )? ( ',' )? ( NUM | VAR )? ')' )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:131:5: ( Dot )? VAR '(' ( NUM | VAR )? ( ',' )? ( NUM | VAR )? ')'
            {
            root_0 = (Object)adaptor.nil();


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:131:5: ( Dot )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==Dot) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:131:5: Dot
                    {
                    Dot167=(Token)match(input,Dot,FOLLOW_Dot_in_initialize_21113); 
                    Dot167_tree = 
                    (Object)adaptor.create(Dot167)
                    ;
                    adaptor.addChild(root_0, Dot167_tree);


                    }
                    break;

            }


            VAR168=(Token)match(input,VAR,FOLLOW_VAR_in_initialize_21116); 
            VAR168_tree = 
            (Object)adaptor.create(VAR168)
            ;
            adaptor.addChild(root_0, VAR168_tree);


            char_literal169=(Token)match(input,57,FOLLOW_57_in_initialize_21118); 
            char_literal169_tree = 
            (Object)adaptor.create(char_literal169)
            ;
            adaptor.addChild(root_0, char_literal169_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:131:17: ( NUM | VAR )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==NUM||LA49_0==VAR) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:
                    {
                    set170=(Token)input.LT(1);

                    if ( input.LA(1)==NUM||input.LA(1)==VAR ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set170)
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


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:131:27: ( ',' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==63) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:131:27: ','
                    {
                    char_literal171=(Token)match(input,63,FOLLOW_63_in_initialize_21125); 
                    char_literal171_tree = 
                    (Object)adaptor.create(char_literal171)
                    ;
                    adaptor.addChild(root_0, char_literal171_tree);


                    }
                    break;

            }


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:131:31: ( NUM | VAR )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==NUM||LA51_0==VAR) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:
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


            char_literal173=(Token)match(input,58,FOLLOW_58_in_initialize_21134); 
            char_literal173_tree = 
            (Object)adaptor.create(char_literal173)
            ;
            adaptor.addChild(root_0, char_literal173_tree);


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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:141:1: assign : VAR ( ( change )? | '=' ( ( VAR | New )? ( '*' )? ( generalArithExpr | initialize_2 ) ) ) SEMICOLON ;
    public final ArithmeticExpressionsParser.assign_return assign() throws RecognitionException {
        ArithmeticExpressionsParser.assign_return retval = new ArithmeticExpressionsParser.assign_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR174=null;
        Token char_literal176=null;
        Token set177=null;
        Token char_literal178=null;
        Token SEMICOLON181=null;
        ArithmeticExpressionsParser.change_return change175 =null;

        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr179 =null;

        ArithmeticExpressionsParser.initialize_2_return initialize_2180 =null;


        Object VAR174_tree=null;
        Object char_literal176_tree=null;
        Object set177_tree=null;
        Object char_literal178_tree=null;
        Object SEMICOLON181_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:141:8: ( VAR ( ( change )? | '=' ( ( VAR | New )? ( '*' )? ( generalArithExpr | initialize_2 ) ) ) SEMICOLON )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:142:3: VAR ( ( change )? | '=' ( ( VAR | New )? ( '*' )? ( generalArithExpr | initialize_2 ) ) ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            VAR174=(Token)match(input,VAR,FOLLOW_VAR_in_assign1174); 
            VAR174_tree = 
            (Object)adaptor.create(VAR174)
            ;
            adaptor.addChild(root_0, VAR174_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:142:7: ( ( change )? | '=' ( ( VAR | New )? ( '*' )? ( generalArithExpr | initialize_2 ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==SEMICOLON||(LA56_0 >= 61 && LA56_0 <= 62)||(LA56_0 >= 65 && LA56_0 <= 66)) ) {
                alt56=1;
            }
            else if ( (LA56_0==69) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }
            switch (alt56) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:142:8: ( change )?
                    {
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:142:8: ( change )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( ((LA52_0 >= 61 && LA52_0 <= 62)||(LA52_0 >= 65 && LA52_0 <= 66)) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:142:8: change
                            {
                            pushFollow(FOLLOW_change_in_assign1177);
                            change175=change();

                            state._fsp--;

                            adaptor.addChild(root_0, change175.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:142:16: '=' ( ( VAR | New )? ( '*' )? ( generalArithExpr | initialize_2 ) )
                    {
                    char_literal176=(Token)match(input,69,FOLLOW_69_in_assign1180); 
                    char_literal176_tree = 
                    (Object)adaptor.create(char_literal176)
                    ;
                    adaptor.addChild(root_0, char_literal176_tree);


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:142:20: ( ( VAR | New )? ( '*' )? ( generalArithExpr | initialize_2 ) )
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:142:22: ( VAR | New )? ( '*' )? ( generalArithExpr | initialize_2 )
                    {
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:142:22: ( VAR | New )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==New||LA53_0==VAR) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:
                            {
                            set177=(Token)input.LT(1);

                            if ( input.LA(1)==New||input.LA(1)==VAR ) {
                                input.consume();
                                adaptor.addChild(root_0, 
                                (Object)adaptor.create(set177)
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


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:142:35: ( '*' )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==59) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:142:36: '*'
                            {
                            char_literal178=(Token)match(input,59,FOLLOW_59_in_assign1194); 
                            char_literal178_tree = 
                            (Object)adaptor.create(char_literal178)
                            ;
                            adaptor.addChild(root_0, char_literal178_tree);


                            }
                            break;

                    }


                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:142:42: ( generalArithExpr | initialize_2 )
                    int alt55=2;
                    switch ( input.LA(1) ) {
                    case DNUM:
                    case Fun:
                    case NUM:
                    case SEMICOLON:
                    case 55:
                    case 57:
                    case 60:
                    case 64:
                        {
                        alt55=1;
                        }
                        break;
                    case VAR:
                        {
                        int LA55_2 = input.LA(2);

                        if ( (LA55_2==Dot||LA55_2==SEMICOLON||(LA55_2 >= 59 && LA55_2 <= 60)||LA55_2==64||LA55_2==67) ) {
                            alt55=1;
                        }
                        else if ( (LA55_2==57) ) {
                            alt55=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 55, 2, input);

                            throw nvae;

                        }
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
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:142:44: generalArithExpr
                            {
                            pushFollow(FOLLOW_generalArithExpr_in_assign1200);
                            generalArithExpr179=generalArithExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, generalArithExpr179.getTree());

                            }
                            break;
                        case 2 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:142:62: initialize_2
                            {
                            pushFollow(FOLLOW_initialize_2_in_assign1203);
                            initialize_2180=initialize_2();

                            state._fsp--;

                            adaptor.addChild(root_0, initialize_2180.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            SEMICOLON181=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assign1209); 
            SEMICOLON181_tree = 
            (Object)adaptor.create(SEMICOLON181)
            ;
            adaptor.addChild(root_0, SEMICOLON181_tree);


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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:144:1: change : ( '++' | '--' | ( '+=' | '-=' ) generalArithExpr ) ;
    public final ArithmeticExpressionsParser.change_return change() throws RecognitionException {
        ArithmeticExpressionsParser.change_return retval = new ArithmeticExpressionsParser.change_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal182=null;
        Token string_literal183=null;
        Token set184=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr185 =null;


        Object string_literal182_tree=null;
        Object string_literal183_tree=null;
        Object set184_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:144:8: ( ( '++' | '--' | ( '+=' | '-=' ) generalArithExpr ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:145:2: ( '++' | '--' | ( '+=' | '-=' ) generalArithExpr )
            {
            root_0 = (Object)adaptor.nil();


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:145:2: ( '++' | '--' | ( '+=' | '-=' ) generalArithExpr )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt57=1;
                }
                break;
            case 65:
                {
                alt57=2;
                }
                break;
            case 62:
            case 66:
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:145:3: '++'
                    {
                    string_literal182=(Token)match(input,61,FOLLOW_61_in_change1221); 
                    string_literal182_tree = 
                    (Object)adaptor.create(string_literal182)
                    ;
                    adaptor.addChild(root_0, string_literal182_tree);


                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:145:8: '--'
                    {
                    string_literal183=(Token)match(input,65,FOLLOW_65_in_change1223); 
                    string_literal183_tree = 
                    (Object)adaptor.create(string_literal183)
                    ;
                    adaptor.addChild(root_0, string_literal183_tree);


                    }
                    break;
                case 3 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:145:13: ( '+=' | '-=' ) generalArithExpr
                    {
                    set184=(Token)input.LT(1);

                    if ( input.LA(1)==62||input.LA(1)==66 ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set184)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_generalArithExpr_in_change1230);
                    generalArithExpr185=generalArithExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, generalArithExpr185.getTree());

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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:148:1: condition : generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? -> ^( Condition generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? ) ;
    public final ArithmeticExpressionsParser.condition_return condition() throws RecognitionException {
        ArithmeticExpressionsParser.condition_return retval = new ArithmeticExpressionsParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RelationalOperators187=null;
        Token AndOr189=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr186 =null;

        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr188 =null;

        ArithmeticExpressionsParser.condition_return condition190 =null;


        Object RelationalOperators187_tree=null;
        Object AndOr189_tree=null;
        RewriteRuleTokenStream stream_RelationalOperators=new RewriteRuleTokenStream(adaptor,"token RelationalOperators");
        RewriteRuleTokenStream stream_AndOr=new RewriteRuleTokenStream(adaptor,"token AndOr");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_generalArithExpr=new RewriteRuleSubtreeStream(adaptor,"rule generalArithExpr");
        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:148:10: ( generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? -> ^( Condition generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:149:2: generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )?
            {
            pushFollow(FOLLOW_generalArithExpr_in_condition1243);
            generalArithExpr186=generalArithExpr();

            state._fsp--;

            stream_generalArithExpr.add(generalArithExpr186.getTree());

            RelationalOperators187=(Token)match(input,RelationalOperators,FOLLOW_RelationalOperators_in_condition1245);  
            stream_RelationalOperators.add(RelationalOperators187);


            pushFollow(FOLLOW_generalArithExpr_in_condition1247);
            generalArithExpr188=generalArithExpr();

            state._fsp--;

            stream_generalArithExpr.add(generalArithExpr188.getTree());

            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:149:56: ( AndOr condition )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==AndOr) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:149:57: AndOr condition
                    {
                    AndOr189=(Token)match(input,AndOr,FOLLOW_AndOr_in_condition1250);  
                    stream_AndOr.add(AndOr189);


                    pushFollow(FOLLOW_condition_in_condition1252);
                    condition190=condition();

                    state._fsp--;

                    stream_condition.add(condition190.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: generalArithExpr, RelationalOperators, condition, generalArithExpr, AndOr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 150:2: -> ^( Condition generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? )
            {
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:150:4: ^( Condition generalArithExpr RelationalOperators generalArithExpr ( AndOr condition )? )
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

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:150:70: ( AndOr condition )?
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:157:1: int_dec : ( Modifier )? INT VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON ;
    public final ArithmeticExpressionsParser.int_dec_return int_dec() throws RecognitionException {
        ArithmeticExpressionsParser.int_dec_return retval = new ArithmeticExpressionsParser.int_dec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier191=null;
        Token INT192=null;
        Token VAR193=null;
        Token char_literal194=null;
        Token char_literal196=null;
        Token VAR197=null;
        Token SEMICOLON198=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr195 =null;


        Object Modifier191_tree=null;
        Object INT192_tree=null;
        Object VAR193_tree=null;
        Object char_literal194_tree=null;
        Object char_literal196_tree=null;
        Object VAR197_tree=null;
        Object SEMICOLON198_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:157:9: ( ( Modifier )? INT VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:159:2: ( Modifier )? INT VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:159:2: ( Modifier )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==Modifier) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:159:2: Modifier
                    {
                    Modifier191=(Token)match(input,Modifier,FOLLOW_Modifier_in_int_dec1311); 
                    Modifier191_tree = 
                    (Object)adaptor.create(Modifier191)
                    ;
                    adaptor.addChild(root_0, Modifier191_tree);


                    }
                    break;

            }


            INT192=(Token)match(input,INT,FOLLOW_INT_in_int_dec1314); 
            INT192_tree = 
            (Object)adaptor.create(INT192)
            ;
            adaptor.addChild(root_0, INT192_tree);


            VAR193=(Token)match(input,VAR,FOLLOW_VAR_in_int_dec1316); 
            VAR193_tree = 
            (Object)adaptor.create(VAR193)
            ;
            adaptor.addChild(root_0, VAR193_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:159:20: ( ( '=' generalArithExpr )? | ( ',' VAR )* )
            int alt62=2;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt62=1;
                }
                break;
            case SEMICOLON:
                {
                alt62=1;
                }
                break;
            case 63:
                {
                alt62=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;

            }

            switch (alt62) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:159:21: ( '=' generalArithExpr )?
                    {
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:159:21: ( '=' generalArithExpr )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==69) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:159:22: '=' generalArithExpr
                            {
                            char_literal194=(Token)match(input,69,FOLLOW_69_in_int_dec1320); 
                            char_literal194_tree = 
                            (Object)adaptor.create(char_literal194)
                            ;
                            adaptor.addChild(root_0, char_literal194_tree);


                            pushFollow(FOLLOW_generalArithExpr_in_int_dec1322);
                            generalArithExpr195=generalArithExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, generalArithExpr195.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:159:45: ( ',' VAR )*
                    {
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:159:45: ( ',' VAR )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==63) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:159:46: ',' VAR
                    	    {
                    	    char_literal196=(Token)match(input,63,FOLLOW_63_in_int_dec1327); 
                    	    char_literal196_tree = 
                    	    (Object)adaptor.create(char_literal196)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal196_tree);


                    	    VAR197=(Token)match(input,VAR,FOLLOW_VAR_in_int_dec1329); 
                    	    VAR197_tree = 
                    	    (Object)adaptor.create(VAR197)
                    	    ;
                    	    adaptor.addChild(root_0, VAR197_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);


                    }
                    break;

            }


            SEMICOLON198=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_int_dec1334); 
            SEMICOLON198_tree = 
            (Object)adaptor.create(SEMICOLON198)
            ;
            adaptor.addChild(root_0, SEMICOLON198_tree);


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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:162:1: double_dec : ( Modifier )? DOUBLE VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON ;
    public final ArithmeticExpressionsParser.double_dec_return double_dec() throws RecognitionException {
        ArithmeticExpressionsParser.double_dec_return retval = new ArithmeticExpressionsParser.double_dec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier199=null;
        Token DOUBLE200=null;
        Token VAR201=null;
        Token char_literal202=null;
        Token char_literal204=null;
        Token VAR205=null;
        Token SEMICOLON206=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr203 =null;


        Object Modifier199_tree=null;
        Object DOUBLE200_tree=null;
        Object VAR201_tree=null;
        Object char_literal202_tree=null;
        Object char_literal204_tree=null;
        Object VAR205_tree=null;
        Object SEMICOLON206_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:162:11: ( ( Modifier )? DOUBLE VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:164:2: ( Modifier )? DOUBLE VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:164:2: ( Modifier )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==Modifier) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:164:2: Modifier
                    {
                    Modifier199=(Token)match(input,Modifier,FOLLOW_Modifier_in_double_dec1349); 
                    Modifier199_tree = 
                    (Object)adaptor.create(Modifier199)
                    ;
                    adaptor.addChild(root_0, Modifier199_tree);


                    }
                    break;

            }


            DOUBLE200=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_double_dec1352); 
            DOUBLE200_tree = 
            (Object)adaptor.create(DOUBLE200)
            ;
            adaptor.addChild(root_0, DOUBLE200_tree);


            VAR201=(Token)match(input,VAR,FOLLOW_VAR_in_double_dec1354); 
            VAR201_tree = 
            (Object)adaptor.create(VAR201)
            ;
            adaptor.addChild(root_0, VAR201_tree);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:164:23: ( ( '=' generalArithExpr )? | ( ',' VAR )* )
            int alt66=2;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt66=1;
                }
                break;
            case SEMICOLON:
                {
                alt66=1;
                }
                break;
            case 63:
                {
                alt66=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;

            }

            switch (alt66) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:164:24: ( '=' generalArithExpr )?
                    {
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:164:24: ( '=' generalArithExpr )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==69) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:164:25: '=' generalArithExpr
                            {
                            char_literal202=(Token)match(input,69,FOLLOW_69_in_double_dec1358); 
                            char_literal202_tree = 
                            (Object)adaptor.create(char_literal202)
                            ;
                            adaptor.addChild(root_0, char_literal202_tree);


                            pushFollow(FOLLOW_generalArithExpr_in_double_dec1360);
                            generalArithExpr203=generalArithExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, generalArithExpr203.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:164:48: ( ',' VAR )*
                    {
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:164:48: ( ',' VAR )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==63) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:164:49: ',' VAR
                    	    {
                    	    char_literal204=(Token)match(input,63,FOLLOW_63_in_double_dec1365); 
                    	    char_literal204_tree = 
                    	    (Object)adaptor.create(char_literal204)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal204_tree);


                    	    VAR205=(Token)match(input,VAR,FOLLOW_VAR_in_double_dec1367); 
                    	    VAR205_tree = 
                    	    (Object)adaptor.create(VAR205)
                    	    ;
                    	    adaptor.addChild(root_0, VAR205_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);


                    }
                    break;

            }


            SEMICOLON206=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_double_dec1372); 
            SEMICOLON206_tree = 
            (Object)adaptor.create(SEMICOLON206)
            ;
            adaptor.addChild(root_0, SEMICOLON206_tree);


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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:167:1: string_dec : ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON -> ^( String_Dec ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON ) ;
    public final ArithmeticExpressionsParser.string_dec_return string_dec() throws RecognitionException {
        ArithmeticExpressionsParser.string_dec_return retval = new ArithmeticExpressionsParser.string_dec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier207=null;
        Token STRING208=null;
        Token VAR209=null;
        Token char_literal210=null;
        Token Strings211=null;
        Token SEMICOLON212=null;

        Object Modifier207_tree=null;
        Object STRING208_tree=null;
        Object VAR209_tree=null;
        Object char_literal210_tree=null;
        Object Strings211_tree=null;
        Object SEMICOLON212_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_Modifier=new RewriteRuleTokenStream(adaptor,"token Modifier");
        RewriteRuleTokenStream stream_Strings=new RewriteRuleTokenStream(adaptor,"token Strings");

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:167:11: ( ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON -> ^( String_Dec ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON ) )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:169:2: ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON
            {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:169:2: ( Modifier )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==Modifier) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:169:2: Modifier
                    {
                    Modifier207=(Token)match(input,Modifier,FOLLOW_Modifier_in_string_dec1385);  
                    stream_Modifier.add(Modifier207);


                    }
                    break;

            }


            STRING208=(Token)match(input,STRING,FOLLOW_STRING_in_string_dec1388);  
            stream_STRING.add(STRING208);


            VAR209=(Token)match(input,VAR,FOLLOW_VAR_in_string_dec1390);  
            stream_VAR.add(VAR209);


            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:169:23: ( '=' Strings )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==69) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:169:24: '=' Strings
                    {
                    char_literal210=(Token)match(input,69,FOLLOW_69_in_string_dec1393);  
                    stream_69.add(char_literal210);


                    Strings211=(Token)match(input,Strings,FOLLOW_Strings_in_string_dec1395);  
                    stream_Strings.add(Strings211);


                    }
                    break;

            }


            SEMICOLON212=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_string_dec1399);  
            stream_SEMICOLON.add(SEMICOLON212);


            // AST REWRITE
            // elements: Strings, 69, SEMICOLON, Modifier, STRING, VAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 170:3: -> ^( String_Dec ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON )
            {
                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:170:6: ^( String_Dec ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(String_Dec, "String_Dec")
                , root_1);

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:170:19: ( Modifier )?
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

                // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:170:40: ( '=' Strings )?
                if ( stream_Strings.hasNext()||stream_69.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_69.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_Strings.nextNode()
                    );

                }
                stream_Strings.reset();
                stream_69.reset();

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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:172:1: generalArithExpr : term ( ( '+' | '-' ) ^ term )* ;
    public final ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr() throws RecognitionException {
        ArithmeticExpressionsParser.generalArithExpr_return retval = new ArithmeticExpressionsParser.generalArithExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set214=null;
        ArithmeticExpressionsParser.term_return term213 =null;

        ArithmeticExpressionsParser.term_return term215 =null;


        Object set214_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:172:17: ( term ( ( '+' | '-' ) ^ term )* )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:172:19: term ( ( '+' | '-' ) ^ term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_generalArithExpr1431);
            term213=term();

            state._fsp--;

            adaptor.addChild(root_0, term213.getTree());

            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:172:24: ( ( '+' | '-' ) ^ term )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==60||LA69_0==64) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:172:25: ( '+' | '-' ) ^ term
            	    {
            	    set214=(Token)input.LT(1);

            	    set214=(Token)input.LT(1);

            	    if ( input.LA(1)==60||input.LA(1)==64 ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set214)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_term_in_generalArithExpr1446);
            	    term215=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term215.getTree());

            	    }
            	    break;

            	default :
            	    break loop69;
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:180:1: term : ( object | factor ( ( '*' | '/' ) ^ factor )* );
    public final ArithmeticExpressionsParser.term_return term() throws RecognitionException {
        ArithmeticExpressionsParser.term_return retval = new ArithmeticExpressionsParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set218=null;
        ArithmeticExpressionsParser.object_return object216 =null;

        ArithmeticExpressionsParser.factor_return factor217 =null;

        ArithmeticExpressionsParser.factor_return factor219 =null;


        Object set218_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:180:6: ( object | factor ( ( '*' | '/' ) ^ factor )* )
            int alt71=2;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt71=1;
                }
                break;
            case AndOr:
            case RelationalOperators:
            case SEMICOLON:
            case VAR:
            case 58:
                {
                alt71=1;
                }
                break;
            case 64:
                {
                switch ( input.LA(2) ) {
                case VAR:
                    {
                    alt71=1;
                    }
                    break;
                case INT:
                    {
                    alt71=2;
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
                    alt71=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 3, input);

                    throw nvae;

                }

                }
                break;
            case NUM:
            case 60:
                {
                alt71=1;
                }
                break;
            case DNUM:
            case Fun:
            case 57:
                {
                alt71=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;

            }

            switch (alt71) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:180:7: object
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_object_in_term1483);
                    object216=object();

                    state._fsp--;

                    adaptor.addChild(root_0, object216.getTree());

                    }
                    break;
                case 2 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:180:15: factor ( ( '*' | '/' ) ^ factor )*
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_factor_in_term1486);
                    factor217=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor217.getTree());

                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:180:22: ( ( '*' | '/' ) ^ factor )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==59||LA70_0==67) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:180:24: ( '*' | '/' ) ^ factor
                    	    {
                    	    set218=(Token)input.LT(1);

                    	    set218=(Token)input.LT(1);

                    	    if ( input.LA(1)==59||input.LA(1)==67 ) {
                    	        input.consume();
                    	        root_0 = (Object)adaptor.becomeRoot(
                    	        (Object)adaptor.create(set218)
                    	        , root_0);
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }


                    	    pushFollow(FOLLOW_factor_in_term1502);
                    	    factor219=factor();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, factor219.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop70;
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:188:1: factor : ( VAR -> ^( Factor VAR ) | NUM -> ^( Factor NUM ) | DNUM -> ^( Factor DOUBLE ) | '-' VAR -> ^( Factor '-' VAR ) | '-' INT -> ^( Factor '-' INT ) | '-' DNUM -> ^( Factor '-' DOUBLE ) | '(' generalArithExpr ')' -> ^( Factor '(' generalArithExpr ')' ) | Fun '(' generalArithExpr ')' -> ^( Factor Fun '(' generalArithExpr ')' ) );
    public final ArithmeticExpressionsParser.factor_return factor() throws RecognitionException {
        ArithmeticExpressionsParser.factor_return retval = new ArithmeticExpressionsParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR220=null;
        Token NUM221=null;
        Token DNUM222=null;
        Token char_literal223=null;
        Token VAR224=null;
        Token char_literal225=null;
        Token INT226=null;
        Token char_literal227=null;
        Token DNUM228=null;
        Token char_literal229=null;
        Token char_literal231=null;
        Token Fun232=null;
        Token char_literal233=null;
        Token char_literal235=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr230 =null;

        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr234 =null;


        Object VAR220_tree=null;
        Object NUM221_tree=null;
        Object DNUM222_tree=null;
        Object char_literal223_tree=null;
        Object VAR224_tree=null;
        Object char_literal225_tree=null;
        Object INT226_tree=null;
        Object char_literal227_tree=null;
        Object DNUM228_tree=null;
        Object char_literal229_tree=null;
        Object char_literal231_tree=null;
        Object Fun232_tree=null;
        Object char_literal233_tree=null;
        Object char_literal235_tree=null;
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
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:188:8: ( VAR -> ^( Factor VAR ) | NUM -> ^( Factor NUM ) | DNUM -> ^( Factor DOUBLE ) | '-' VAR -> ^( Factor '-' VAR ) | '-' INT -> ^( Factor '-' INT ) | '-' DNUM -> ^( Factor '-' DOUBLE ) | '(' generalArithExpr ')' -> ^( Factor '(' generalArithExpr ')' ) | Fun '(' generalArithExpr ')' -> ^( Factor Fun '(' generalArithExpr ')' ) )
            int alt72=8;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt72=1;
                }
                break;
            case NUM:
                {
                alt72=2;
                }
                break;
            case DNUM:
                {
                alt72=3;
                }
                break;
            case 64:
                {
                switch ( input.LA(2) ) {
                case VAR:
                    {
                    alt72=4;
                    }
                    break;
                case INT:
                    {
                    alt72=5;
                    }
                    break;
                case DNUM:
                    {
                    alt72=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 4, input);

                    throw nvae;

                }

                }
                break;
            case 57:
                {
                alt72=7;
                }
                break;
            case Fun:
                {
                alt72=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;

            }

            switch (alt72) {
                case 1 :
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:189:2: VAR
                    {
                    VAR220=(Token)match(input,VAR,FOLLOW_VAR_in_factor1542);  
                    stream_VAR.add(VAR220);


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
                    // 189:6: -> ^( Factor VAR )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:189:9: ^( Factor VAR )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:190:3: NUM
                    {
                    NUM221=(Token)match(input,NUM,FOLLOW_NUM_in_factor1554);  
                    stream_NUM.add(NUM221);


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
                    // 190:7: -> ^( Factor NUM )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:190:10: ^( Factor NUM )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:191:3: DNUM
                    {
                    DNUM222=(Token)match(input,DNUM,FOLLOW_DNUM_in_factor1566);  
                    stream_DNUM.add(DNUM222);


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
                    // 191:8: -> ^( Factor DOUBLE )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:191:11: ^( Factor DOUBLE )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:192:3: '-' VAR
                    {
                    char_literal223=(Token)match(input,64,FOLLOW_64_in_factor1578);  
                    stream_64.add(char_literal223);


                    VAR224=(Token)match(input,VAR,FOLLOW_VAR_in_factor1581);  
                    stream_VAR.add(VAR224);


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
                    // 192:12: -> ^( Factor '-' VAR )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:192:15: ^( Factor '-' VAR )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:193:3: '-' INT
                    {
                    char_literal225=(Token)match(input,64,FOLLOW_64_in_factor1596);  
                    stream_64.add(char_literal225);


                    INT226=(Token)match(input,INT,FOLLOW_INT_in_factor1599);  
                    stream_INT.add(INT226);


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
                    // 193:12: -> ^( Factor '-' INT )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:193:15: ^( Factor '-' INT )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:194:3: '-' DNUM
                    {
                    char_literal227=(Token)match(input,64,FOLLOW_64_in_factor1614);  
                    stream_64.add(char_literal227);


                    DNUM228=(Token)match(input,DNUM,FOLLOW_DNUM_in_factor1617);  
                    stream_DNUM.add(DNUM228);


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
                    // 194:14: -> ^( Factor '-' DOUBLE )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:194:17: ^( Factor '-' DOUBLE )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:195:3: '(' generalArithExpr ')'
                    {
                    char_literal229=(Token)match(input,57,FOLLOW_57_in_factor1633);  
                    stream_57.add(char_literal229);


                    pushFollow(FOLLOW_generalArithExpr_in_factor1635);
                    generalArithExpr230=generalArithExpr();

                    state._fsp--;

                    stream_generalArithExpr.add(generalArithExpr230.getTree());

                    char_literal231=(Token)match(input,58,FOLLOW_58_in_factor1637);  
                    stream_58.add(char_literal231);


                    // AST REWRITE
                    // elements: generalArithExpr, 58, 57
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 195:28: -> ^( Factor '(' generalArithExpr ')' )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:195:31: ^( Factor '(' generalArithExpr ')' )
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
                    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:196:4: Fun '(' generalArithExpr ')'
                    {
                    Fun232=(Token)match(input,Fun,FOLLOW_Fun_in_factor1655);  
                    stream_Fun.add(Fun232);


                    char_literal233=(Token)match(input,57,FOLLOW_57_in_factor1657);  
                    stream_57.add(char_literal233);


                    pushFollow(FOLLOW_generalArithExpr_in_factor1659);
                    generalArithExpr234=generalArithExpr();

                    state._fsp--;

                    stream_generalArithExpr.add(generalArithExpr234.getTree());

                    char_literal235=(Token)match(input,58,FOLLOW_58_in_factor1661);  
                    stream_58.add(char_literal235);


                    // AST REWRITE
                    // elements: 57, Fun, 58, generalArithExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 196:33: -> ^( Factor Fun '(' generalArithExpr ')' )
                    {
                        // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:196:36: ^( Factor Fun '(' generalArithExpr ')' )
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
    // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:213:1: types : ( STRING | BOOLEAN | DOUBLE | INT );
    public final ArithmeticExpressionsParser.types_return types() throws RecognitionException {
        ArithmeticExpressionsParser.types_return retval = new ArithmeticExpressionsParser.types_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set236=null;

        Object set236_tree=null;

        try {
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:213:7: ( STRING | BOOLEAN | DOUBLE | INT )
            // E:\\computer science\\cs\\level4\\407\\try\\sub\\project\\comp407\\ArithmeticExpressions.g:
            {
            root_0 = (Object)adaptor.nil();


            set236=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEAN||input.LA(1)==DOUBLE||input.LA(1)==INT||input.LA(1)==STRING ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set236)
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
    public static final BitSet FOLLOW_ob_cho_in_object701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_object705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_object710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ob_body719 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_ob_body723 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Dot_in_ob_body725 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_ob_body727 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ob_body729 = new BitSet(new long[]{0x0008000200000000L});
    public static final BitSet FOLLOW_set_in_ob_body731 = new BitSet(new long[]{0x0288000200102000L,0x0000000000000001L});
    public static final BitSet FOLLOW_generalArithExpr_in_ob_body739 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ob_body742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ob_cho749 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_ob_cho753 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Dot_in_ob_cho755 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_ob_cho757 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ob_cho759 = new BitSet(new long[]{0x0408000200000000L});
    public static final BitSet FOLLOW_58_in_ob_cho769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ob_body_in_ob_cho773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_params781 = new BitSet(new long[]{0x0408020000404080L});
    public static final BitSet FOLLOW_types_in_params784 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_params786 = new BitSet(new long[]{0x8400000000000000L});
    public static final BitSet FOLLOW_VAR_in_params788 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_params790 = new BitSet(new long[]{0x8400000000000000L});
    public static final BitSet FOLLOW_63_in_params794 = new BitSet(new long[]{0x0000020000404080L});
    public static final BitSet FOLLOW_types_in_params796 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_params798 = new BitSet(new long[]{0x8400000000000000L});
    public static final BitSet FOLLOW_58_in_params804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_dec_in_decl818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_dec_in_decl830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_while_condition851 = new BitSet(new long[]{0x0288000200102000L,0x0000000000000001L});
    public static final BitSet FOLLOW_condition_in_while_condition853 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_while_condition855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_while_condition857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_whilestmt866 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_whilestmt868 = new BitSet(new long[]{0x0288000200000000L});
    public static final BitSet FOLLOW_while_condition_in_whilestmt870 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_whilestmt872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_whilestmt874 = new BitSet(new long[]{0x0009028100404080L,0x0000000000015800L});
    public static final BitSet FOLLOW_stmt_in_whilestmt876 = new BitSet(new long[]{0x0009028100404080L,0x0000000000015800L});
    public static final BitSet FOLLOW_80_in_whilestmt879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ifstmt924 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ifstmt926 = new BitSet(new long[]{0x0388000200000000L,0x0000000000000050L});
    public static final BitSet FOLLOW_55_in_ifstmt929 = new BitSet(new long[]{0x0388000200000000L,0x0000000000000050L});
    public static final BitSet FOLLOW_57_in_ifstmt935 = new BitSet(new long[]{0x0188000200000000L,0x0000000000000050L});
    public static final BitSet FOLLOW_if_cond_in_ifstmt939 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ifstmt942 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ifstmt946 = new BitSet(new long[]{0x0009028100404082L,0x000000000001DC00L});
    public static final BitSet FOLLOW_79_in_ifstmt949 = new BitSet(new long[]{0x0009028100404082L,0x0000000000015C00L});
    public static final BitSet FOLLOW_stmt_in_ifstmt953 = new BitSet(new long[]{0x0009028100404082L,0x0000000000015C00L});
    public static final BitSet FOLLOW_80_in_ifstmt957 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ifstmt962 = new BitSet(new long[]{0x0009028100404082L,0x000000000001DC00L});
    public static final BitSet FOLLOW_79_in_ifstmt965 = new BitSet(new long[]{0x0009028100404082L,0x0000000000015C00L});
    public static final BitSet FOLLOW_stmt_in_ifstmt969 = new BitSet(new long[]{0x0009028100404082L,0x0000000000015C00L});
    public static final BitSet FOLLOW_80_in_ifstmt973 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ifstmt980 = new BitSet(new long[]{0x0009028100404082L,0x000000000001D800L});
    public static final BitSet FOLLOW_79_in_ifstmt983 = new BitSet(new long[]{0x0009028100404082L,0x0000000000015800L});
    public static final BitSet FOLLOW_stmt_in_ifstmt987 = new BitSet(new long[]{0x0009028100404082L,0x0000000000015800L});
    public static final BitSet FOLLOW_80_in_ifstmt991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_nor_in_if_cond1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_if_nor1021 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000050L});
    public static final BitSet FOLLOW_set_in_if_nor1024 = new BitSet(new long[]{0x0188000200000000L,0x0000000000000050L});
    public static final BitSet FOLLOW_object_in_if_nor1039 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000050L});
    public static final BitSet FOLLOW_75_in_forloop1054 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_forloop1056 = new BitSet(new long[]{0x0000000100404000L});
    public static final BitSet FOLLOW_decl_in_forloop1059 = new BitSet(new long[]{0x0288000200102000L,0x0000000000000001L});
    public static final BitSet FOLLOW_condition_in_forloop1063 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_forloop1066 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_forloop1069 = new BitSet(new long[]{0x6000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_change_in_forloop1071 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_forloop1074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_forloop1076 = new BitSet(new long[]{0x0009028100404080L,0x0000000000015800L});
    public static final BitSet FOLLOW_stmt_in_forloop1078 = new BitSet(new long[]{0x0009028100404080L,0x0000000000015800L});
    public static final BitSet FOLLOW_80_in_forloop1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_assigment1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Dot_in_initialize_21113 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_initialize_21116 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_initialize_21118 = new BitSet(new long[]{0x8408000200000000L});
    public static final BitSet FOLLOW_63_in_initialize_21125 = new BitSet(new long[]{0x0408000200000000L});
    public static final BitSet FOLLOW_58_in_initialize_21134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_assign1174 = new BitSet(new long[]{0x6000008000000000L,0x0000000000000026L});
    public static final BitSet FOLLOW_change_in_assign1177 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_69_in_assign1180 = new BitSet(new long[]{0x0A88000600112000L,0x0000000000000001L});
    public static final BitSet FOLLOW_59_in_assign1194 = new BitSet(new long[]{0x0288000200112000L,0x0000000000000001L});
    public static final BitSet FOLLOW_generalArithExpr_in_assign1200 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_initialize_2_in_assign1203 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_assign1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_change1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_change1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_change1225 = new BitSet(new long[]{0x0288000200102000L,0x0000000000000001L});
    public static final BitSet FOLLOW_generalArithExpr_in_change1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_generalArithExpr_in_condition1243 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RelationalOperators_in_condition1245 = new BitSet(new long[]{0x0288000200102000L,0x0000000000000001L});
    public static final BitSet FOLLOW_generalArithExpr_in_condition1247 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AndOr_in_condition1250 = new BitSet(new long[]{0x0288000200102000L,0x0000000000000001L});
    public static final BitSet FOLLOW_condition_in_condition1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_int_dec1311 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_INT_in_int_dec1314 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_int_dec1316 = new BitSet(new long[]{0x8000008000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_int_dec1320 = new BitSet(new long[]{0x0288000200102000L,0x0000000000000001L});
    public static final BitSet FOLLOW_generalArithExpr_in_int_dec1322 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_63_in_int_dec1327 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_int_dec1329 = new BitSet(new long[]{0x8000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_int_dec1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_double_dec1349 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DOUBLE_in_double_dec1352 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_double_dec1354 = new BitSet(new long[]{0x8000008000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_double_dec1358 = new BitSet(new long[]{0x0288000200102000L,0x0000000000000001L});
    public static final BitSet FOLLOW_generalArithExpr_in_double_dec1360 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_63_in_double_dec1365 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_double_dec1367 = new BitSet(new long[]{0x8000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_double_dec1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_string_dec1385 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_STRING_in_string_dec1388 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_string_dec1390 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_string_dec1393 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_Strings_in_string_dec1395 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_string_dec1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_generalArithExpr1431 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_set_in_generalArithExpr1434 = new BitSet(new long[]{0x0288000200102000L,0x0000000000000001L});
    public static final BitSet FOLLOW_term_in_generalArithExpr1446 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_object_in_term1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term1486 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_term1490 = new BitSet(new long[]{0x0208000200102000L,0x0000000000000001L});
    public static final BitSet FOLLOW_factor_in_term1502 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_in_factor1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_factor1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DNUM_in_factor1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_factor1578 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_VAR_in_factor1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_factor1596 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_INT_in_factor1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_factor1614 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DNUM_in_factor1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_factor1633 = new BitSet(new long[]{0x0288000200102000L,0x0000000000000001L});
    public static final BitSet FOLLOW_generalArithExpr_in_factor1635 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_factor1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Fun_in_factor1655 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_factor1657 = new BitSet(new long[]{0x0288000200102000L,0x0000000000000001L});
    public static final BitSet FOLLOW_generalArithExpr_in_factor1659 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_factor1661 = new BitSet(new long[]{0x0000000000000002L});

}