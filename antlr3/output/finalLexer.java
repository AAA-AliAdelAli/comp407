// $ANTLR 3.4 E:\\antlr3\\final.g 2024-05-13 16:28:25

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class finalLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int Bool_L=4;
    public static final int CLASSDEC=5;
    public static final int COMMENT=6;
    public static final int EXPR=7;
    public static final int ID=8;
    public static final int Int_L=9;
    public static final int MAINCLASS=10;
    public static final int MAINSTMT=11;
    public static final int METHODDEC=12;
    public static final int Operator=13;
    public static final int STARTIT=14;
    public static final int WS=15;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public finalLexer() {} 
    public finalLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public finalLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "E:\\antlr3\\final.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:2:7: ( '!' )
            // E:\\antlr3\\final.g:2:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:3:7: ( '(' )
            // E:\\antlr3\\final.g:3:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:4:7: ( ')' )
            // E:\\antlr3\\final.g:4:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:5:7: ( ',' )
            // E:\\antlr3\\final.g:5:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:6:7: ( '.' )
            // E:\\antlr3\\final.g:6:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:7:7: ( ';' )
            // E:\\antlr3\\final.g:7:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:8:7: ( '=' )
            // E:\\antlr3\\final.g:8:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:9:7: ( 'String' )
            // E:\\antlr3\\final.g:9:9: 'String'
            {
            match("String"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:10:7: ( 'System.out.println' )
            // E:\\antlr3\\final.g:10:9: 'System.out.println'
            {
            match("System.out.println"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:11:7: ( '[' )
            // E:\\antlr3\\final.g:11:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:12:7: ( ']' )
            // E:\\antlr3\\final.g:12:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:13:7: ( 'boolean' )
            // E:\\antlr3\\final.g:13:9: 'boolean'
            {
            match("boolean"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:14:7: ( 'class' )
            // E:\\antlr3\\final.g:14:9: 'class'
            {
            match("class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:15:7: ( 'else' )
            // E:\\antlr3\\final.g:15:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:16:7: ( 'extends' )
            // E:\\antlr3\\final.g:16:9: 'extends'
            {
            match("extends"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:17:7: ( 'if' )
            // E:\\antlr3\\final.g:17:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:18:7: ( 'int' )
            // E:\\antlr3\\final.g:18:9: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:19:7: ( 'length' )
            // E:\\antlr3\\final.g:19:9: 'length'
            {
            match("length"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:20:7: ( 'main' )
            // E:\\antlr3\\final.g:20:9: 'main'
            {
            match("main"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:21:7: ( 'new' )
            // E:\\antlr3\\final.g:21:9: 'new'
            {
            match("new"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:22:7: ( 'public' )
            // E:\\antlr3\\final.g:22:9: 'public'
            {
            match("public"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:23:7: ( 'return' )
            // E:\\antlr3\\final.g:23:9: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:24:7: ( 'static' )
            // E:\\antlr3\\final.g:24:9: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:25:7: ( 'this' )
            // E:\\antlr3\\final.g:25:9: 'this'
            {
            match("this"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:26:7: ( 'void' )
            // E:\\antlr3\\final.g:26:9: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:27:7: ( 'while' )
            // E:\\antlr3\\final.g:27:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:28:7: ( '{' )
            // E:\\antlr3\\final.g:28:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:29:7: ( '}' )
            // E:\\antlr3\\final.g:29:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "Bool_L"
    public final void mBool_L() throws RecognitionException {
        try {
            int _type = Bool_L;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:124:7: ( ( 'true' | 'false' ) )
            // E:\\antlr3\\final.g:124:9: ( 'true' | 'false' )
            {
            // E:\\antlr3\\final.g:124:9: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // E:\\antlr3\\final.g:124:10: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // E:\\antlr3\\final.g:124:19: 'false'
                    {
                    match("false"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Bool_L"

    // $ANTLR start "Int_L"
    public final void mInt_L() throws RecognitionException {
        try {
            int _type = Int_L;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:126:6: ( ( '0' .. '9' )+ )
            // E:\\antlr3\\final.g:126:8: ( '0' .. '9' )+
            {
            // E:\\antlr3\\final.g:126:8: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // E:\\antlr3\\final.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Int_L"

    // $ANTLR start "Operator"
    public final void mOperator() throws RecognitionException {
        try {
            int _type = Operator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:128:9: ( ( '&&' | '<' | '+' | '-' | '*' ) )
            // E:\\antlr3\\final.g:128:11: ( '&&' | '<' | '+' | '-' | '*' )
            {
            // E:\\antlr3\\final.g:128:11: ( '&&' | '<' | '+' | '-' | '*' )
            int alt3=5;
            switch ( input.LA(1) ) {
            case '&':
                {
                alt3=1;
                }
                break;
            case '<':
                {
                alt3=2;
                }
                break;
            case '+':
                {
                alt3=3;
                }
                break;
            case '-':
                {
                alt3=4;
                }
                break;
            case '*':
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // E:\\antlr3\\final.g:128:12: '&&'
                    {
                    match("&&"); 



                    }
                    break;
                case 2 :
                    // E:\\antlr3\\final.g:128:19: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // E:\\antlr3\\final.g:128:25: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 4 :
                    // E:\\antlr3\\final.g:128:31: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 5 :
                    // E:\\antlr3\\final.g:128:37: '*'
                    {
                    match('*'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Operator"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:130:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )* )
            // E:\\antlr3\\final.g:130:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )*
            {
            if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // E:\\antlr3\\final.g:130:34: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='$'||(LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // E:\\antlr3\\final.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:132:8: ( ( '/*' ( options {greedy=false; } : . )* '*/' | '//' (~ ( '\\n' | '\\r' ) )* ) )
            // E:\\antlr3\\final.g:132:12: ( '/*' ( options {greedy=false; } : . )* '*/' | '//' (~ ( '\\n' | '\\r' ) )* )
            {
            // E:\\antlr3\\final.g:132:12: ( '/*' ( options {greedy=false; } : . )* '*/' | '//' (~ ( '\\n' | '\\r' ) )* )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='/') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='*') ) {
                    alt7=1;
                }
                else if ( (LA7_1=='/') ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // E:\\antlr3\\final.g:132:13: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // E:\\antlr3\\final.g:132:18: ( options {greedy=false; } : . )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='*') ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1=='/') ) {
                                alt5=2;
                            }
                            else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // E:\\antlr3\\final.g:132:46: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    match("*/"); 



                    skip();

                    }
                    break;
                case 2 :
                    // E:\\antlr3\\final.g:132:70: '//' (~ ( '\\n' | '\\r' ) )*
                    {
                    match("//"); 



                    // E:\\antlr3\\final.g:132:75: (~ ( '\\n' | '\\r' ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // E:\\antlr3\\final.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    skip();

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\antlr3\\final.g:135:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // E:\\antlr3\\final.g:135:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // E:\\antlr3\\final.g:135:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '\t' && LA8_0 <= '\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // E:\\antlr3\\final.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // E:\\antlr3\\final.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | Bool_L | Int_L | Operator | ID | COMMENT | WS )
        int alt9=34;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // E:\\antlr3\\final.g:1:10: T__16
                {
                mT__16(); 


                }
                break;
            case 2 :
                // E:\\antlr3\\final.g:1:16: T__17
                {
                mT__17(); 


                }
                break;
            case 3 :
                // E:\\antlr3\\final.g:1:22: T__18
                {
                mT__18(); 


                }
                break;
            case 4 :
                // E:\\antlr3\\final.g:1:28: T__19
                {
                mT__19(); 


                }
                break;
            case 5 :
                // E:\\antlr3\\final.g:1:34: T__20
                {
                mT__20(); 


                }
                break;
            case 6 :
                // E:\\antlr3\\final.g:1:40: T__21
                {
                mT__21(); 


                }
                break;
            case 7 :
                // E:\\antlr3\\final.g:1:46: T__22
                {
                mT__22(); 


                }
                break;
            case 8 :
                // E:\\antlr3\\final.g:1:52: T__23
                {
                mT__23(); 


                }
                break;
            case 9 :
                // E:\\antlr3\\final.g:1:58: T__24
                {
                mT__24(); 


                }
                break;
            case 10 :
                // E:\\antlr3\\final.g:1:64: T__25
                {
                mT__25(); 


                }
                break;
            case 11 :
                // E:\\antlr3\\final.g:1:70: T__26
                {
                mT__26(); 


                }
                break;
            case 12 :
                // E:\\antlr3\\final.g:1:76: T__27
                {
                mT__27(); 


                }
                break;
            case 13 :
                // E:\\antlr3\\final.g:1:82: T__28
                {
                mT__28(); 


                }
                break;
            case 14 :
                // E:\\antlr3\\final.g:1:88: T__29
                {
                mT__29(); 


                }
                break;
            case 15 :
                // E:\\antlr3\\final.g:1:94: T__30
                {
                mT__30(); 


                }
                break;
            case 16 :
                // E:\\antlr3\\final.g:1:100: T__31
                {
                mT__31(); 


                }
                break;
            case 17 :
                // E:\\antlr3\\final.g:1:106: T__32
                {
                mT__32(); 


                }
                break;
            case 18 :
                // E:\\antlr3\\final.g:1:112: T__33
                {
                mT__33(); 


                }
                break;
            case 19 :
                // E:\\antlr3\\final.g:1:118: T__34
                {
                mT__34(); 


                }
                break;
            case 20 :
                // E:\\antlr3\\final.g:1:124: T__35
                {
                mT__35(); 


                }
                break;
            case 21 :
                // E:\\antlr3\\final.g:1:130: T__36
                {
                mT__36(); 


                }
                break;
            case 22 :
                // E:\\antlr3\\final.g:1:136: T__37
                {
                mT__37(); 


                }
                break;
            case 23 :
                // E:\\antlr3\\final.g:1:142: T__38
                {
                mT__38(); 


                }
                break;
            case 24 :
                // E:\\antlr3\\final.g:1:148: T__39
                {
                mT__39(); 


                }
                break;
            case 25 :
                // E:\\antlr3\\final.g:1:154: T__40
                {
                mT__40(); 


                }
                break;
            case 26 :
                // E:\\antlr3\\final.g:1:160: T__41
                {
                mT__41(); 


                }
                break;
            case 27 :
                // E:\\antlr3\\final.g:1:166: T__42
                {
                mT__42(); 


                }
                break;
            case 28 :
                // E:\\antlr3\\final.g:1:172: T__43
                {
                mT__43(); 


                }
                break;
            case 29 :
                // E:\\antlr3\\final.g:1:178: Bool_L
                {
                mBool_L(); 


                }
                break;
            case 30 :
                // E:\\antlr3\\final.g:1:185: Int_L
                {
                mInt_L(); 


                }
                break;
            case 31 :
                // E:\\antlr3\\final.g:1:191: Operator
                {
                mOperator(); 


                }
                break;
            case 32 :
                // E:\\antlr3\\final.g:1:200: ID
                {
                mID(); 


                }
                break;
            case 33 :
                // E:\\antlr3\\final.g:1:203: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 34 :
                // E:\\antlr3\\final.g:1:211: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\10\uffff\1\35\2\uffff\15\35\2\uffff\1\35\5\uffff\6\35\1\71\22\35"+
        "\1\uffff\1\114\2\35\1\117\14\35\1\134\1\35\1\uffff\1\35\1\137\1"+
        "\uffff\3\35\1\143\1\144\1\145\5\35\1\153\1\uffff\2\35\1\uffff\3"+
        "\35\3\uffff\1\161\1\144\1\162\2\35\1\uffff\1\35\1\166\1\167\1\170"+
        "\1\171\3\uffff\1\172\1\173\6\uffff";
    static final String DFA9_eofS =
        "\174\uffff";
    static final String DFA9_minS =
        "\1\11\7\uffff\1\164\2\uffff\1\157\2\154\1\146\1\145\1\141\1\145"+
        "\1\165\1\145\1\164\1\150\1\157\1\150\2\uffff\1\141\5\uffff\1\162"+
        "\1\163\1\157\1\141\1\163\1\164\1\44\1\164\1\156\1\151\1\167\1\142"+
        "\1\164\1\141\1\151\1\165\2\151\1\154\1\151\1\164\1\154\1\163\2\145"+
        "\1\uffff\1\44\1\147\1\156\1\44\1\154\1\165\1\164\1\163\1\145\1\144"+
        "\1\154\1\163\1\156\2\145\1\163\1\44\1\156\1\uffff\1\164\1\44\1\uffff"+
        "\1\151\1\162\1\151\3\44\2\145\1\147\1\155\1\141\1\44\1\uffff\1\144"+
        "\1\150\1\uffff\1\143\1\156\1\143\3\uffff\3\44\1\56\1\156\1\uffff"+
        "\1\163\4\44\3\uffff\2\44\6\uffff";
    static final String DFA9_maxS =
        "\1\175\7\uffff\1\171\2\uffff\1\157\1\154\1\170\1\156\1\145\1\141"+
        "\1\145\1\165\1\145\1\164\1\162\1\157\1\150\2\uffff\1\141\5\uffff"+
        "\1\162\1\163\1\157\1\141\1\163\1\164\1\172\1\164\1\156\1\151\1\167"+
        "\1\142\1\164\1\141\1\151\1\165\2\151\1\154\1\151\1\164\1\154\1\163"+
        "\2\145\1\uffff\1\172\1\147\1\156\1\172\1\154\1\165\1\164\1\163\1"+
        "\145\1\144\1\154\1\163\1\156\2\145\1\163\1\172\1\156\1\uffff\1\164"+
        "\1\172\1\uffff\1\151\1\162\1\151\3\172\2\145\1\147\1\155\1\141\1"+
        "\172\1\uffff\1\144\1\150\1\uffff\1\143\1\156\1\143\3\uffff\3\172"+
        "\1\56\1\156\1\uffff\1\163\4\172\3\uffff\2\172\6\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\12\1\13\15\uffff"+
        "\1\33\1\34\1\uffff\1\36\1\37\1\40\1\41\1\42\31\uffff\1\20\22\uffff"+
        "\1\21\2\uffff\1\24\14\uffff\1\16\2\uffff\1\23\3\uffff\1\30\1\35"+
        "\1\31\5\uffff\1\15\5\uffff\1\32\1\10\1\11\2\uffff\1\22\1\25\1\26"+
        "\1\27\1\14\1\17";
    static final String DFA9_specialS =
        "\174\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\37\2\uffff\1\37\22\uffff\1\37\1\1\2\uffff\1\35\1\uffff\1"+
            "\34\1\uffff\1\2\1\3\2\34\1\4\1\34\1\5\1\36\12\33\1\uffff\1\6"+
            "\1\34\1\7\3\uffff\22\35\1\10\7\35\1\11\1\uffff\1\12\1\uffff"+
            "\1\35\1\uffff\1\35\1\13\1\14\1\35\1\15\1\32\2\35\1\16\2\35\1"+
            "\17\1\20\1\21\1\35\1\22\1\35\1\23\1\24\1\25\1\35\1\26\1\27\3"+
            "\35\1\30\1\uffff\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\40\4\uffff\1\41",
            "",
            "",
            "\1\42",
            "\1\43",
            "\1\44\13\uffff\1\45",
            "\1\46\7\uffff\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56\11\uffff\1\57",
            "\1\60",
            "\1\61",
            "",
            "",
            "\1\62",
            "",
            "",
            "",
            "",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\115",
            "\1\116",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\135",
            "",
            "\1\136",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "",
            "\1\154",
            "\1\155",
            "",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "",
            "",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\163",
            "\1\164",
            "",
            "\1\165",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "",
            "",
            "",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | Bool_L | Int_L | Operator | ID | COMMENT | WS );";
        }
    }
 

}