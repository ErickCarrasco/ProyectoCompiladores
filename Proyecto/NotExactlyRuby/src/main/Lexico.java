// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/main/LexicoProyecto.flex

import java_cup.runtime.*;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Lexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int COMMENT_PORTION = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1, 1
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\36\u0200\1\u0300\1\u0400\266\u0200\10\u0500\u1020\u0200";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\2\22\0\1\1\2\0"+
    "\1\4\1\0\1\5\2\0\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\0\1\10\12\14\1\15\1\16\1\17"+
    "\1\20\1\21\2\0\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\33"+
    "\1\36\1\37\1\40\1\33\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\33\1\47\1\33\1\50\1\0\1\51"+
    "\1\0\1\33\1\0\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\33"+
    "\1\36\1\37\1\40\1\33\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\33\1\47\1\33\1\52\1\53\1\54"+
    "\1\17\6\0\1\3\252\0\2\55\115\0\1\56\u01a8\0"+
    "\2\3\u0100\0\1\57\325\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1536];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\11\1\13\1\14\1\15\1\16"+
    "\1\1\20\17\1\20\1\21\1\22\1\23\1\24\2\1"+
    "\1\2\1\25\1\26\1\16\1\0\12\27\1\30\3\27"+
    "\1\16\7\27\1\30\4\0\1\31\2\27\1\0\1\27"+
    "\1\32\2\27\1\0\2\27\1\0\2\27\1\33\1\0"+
    "\6\27\1\0\3\27\1\0\1\33\2\0\1\27\2\34"+
    "\1\35\1\27\1\36\1\37\1\27\1\0\1\37\1\27"+
    "\2\0\1\40\2\41\1\42\2\27\1\43\1\44\1\27"+
    "\1\0\1\45\2\27\1\0\1\43\1\44\2\46\1\27"+
    "\2\47\1\50\1\45\1\50\1\27\1\0\3\27\1\0"+
    "\1\27\2\51\1\0\2\27\1\0\1\27\1\52\2\53"+
    "\1\54\1\52\1\55\2\56\2\57";

  private static int [] zzUnpackAction() {
    int [] result = new int[164];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\60\0\140\0\220\0\140\0\140\0\140\0\140"+
    "\0\140\0\140\0\140\0\140\0\300\0\360\0\140\0\140"+
    "\0\u0120\0\u0150\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240\0\u0270"+
    "\0\u02a0\0\u02d0\0\u0300\0\u0330\0\u0360\0\u0390\0\u03c0\0\u03f0"+
    "\0\u0420\0\u0450\0\140\0\140\0\140\0\140\0\140\0\u0480"+
    "\0\u04b0\0\140\0\140\0\140\0\140\0\u04e0\0\u02a0\0\u0510"+
    "\0\u0540\0\u0570\0\u05a0\0\u05d0\0\u0600\0\u0630\0\u0660\0\u0690"+
    "\0\u02a0\0\u06c0\0\u06f0\0\u0720\0\u02a0\0\u0750\0\u0780\0\u07b0"+
    "\0\u07e0\0\u0810\0\u0840\0\u0870\0\140\0\u08a0\0\u08d0\0\u0900"+
    "\0\u0930\0\140\0\u0960\0\u0990\0\u09c0\0\u09f0\0\u0a20\0\u0a50"+
    "\0\u0a80\0\u0ab0\0\u0ae0\0\u0b10\0\u0b40\0\u0b70\0\u0ba0\0\u02a0"+
    "\0\u0bd0\0\u0c00\0\u0c30\0\u0c60\0\u0c90\0\u0cc0\0\u0cf0\0\u0d20"+
    "\0\u0d50\0\u0d80\0\u0db0\0\u0de0\0\140\0\u0e10\0\u0e40\0\u0e70"+
    "\0\u02a0\0\140\0\u02a0\0\u0ea0\0\u02a0\0\u02a0\0\u0ed0\0\u0f00"+
    "\0\140\0\u0f30\0\u0f60\0\u0f90\0\u02a0\0\u02a0\0\140\0\u02a0"+
    "\0\u0fc0\0\u0ff0\0\u02a0\0\u1020\0\u1050\0\u1080\0\u02a0\0\u10b0"+
    "\0\u10e0\0\u1110\0\140\0\u1140\0\u02a0\0\140\0\u1170\0\u02a0"+
    "\0\140\0\u02a0\0\140\0\140\0\u11a0\0\u11d0\0\u1200\0\u1230"+
    "\0\u1260\0\u1290\0\u12c0\0\u02a0\0\140\0\u12f0\0\u1320\0\u1350"+
    "\0\u1380\0\u13b0\0\u02a0\0\u02a0\0\140\0\u02a0\0\140\0\u02a0"+
    "\0\u02a0\0\140\0\u02a0\0\140";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[164];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\2\4\1\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\21\1\23\1\24\1\25\1\26\1\27\1\30\2\31"+
    "\1\32\2\31\1\33\1\34\1\35\1\36\1\31\1\37"+
    "\1\40\1\31\1\41\1\42\1\31\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\3\2\52\2\5\1\53"+
    "\53\52\61\0\2\4\76\0\1\54\52\0\1\16\63\0"+
    "\1\55\57\0\1\56\53\0\1\57\5\0\14\57\1\60"+
    "\11\57\24\0\1\57\5\0\17\57\1\61\6\57\24\0"+
    "\1\57\5\0\1\62\6\57\1\63\16\57\24\0\1\57"+
    "\5\0\4\57\1\64\21\57\24\0\1\57\5\0\1\65"+
    "\12\57\1\66\12\57\24\0\1\57\5\0\1\67\21\57"+
    "\1\70\3\57\24\0\1\57\5\0\26\57\24\0\1\57"+
    "\5\0\5\57\1\71\6\57\1\72\11\57\24\0\1\57"+
    "\5\0\15\57\1\73\10\57\24\0\1\57\5\0\15\57"+
    "\1\74\10\57\24\0\1\57\5\0\17\57\1\75\6\57"+
    "\24\0\1\57\5\0\1\76\25\57\24\0\1\57\5\0"+
    "\2\57\1\77\12\57\1\100\6\57\1\101\1\57\24\0"+
    "\1\57\5\0\17\57\1\102\6\57\24\0\1\57\5\0"+
    "\4\57\1\103\21\57\24\0\1\57\5\0\7\57\1\104"+
    "\16\57\37\0\1\105\6\0\1\106\45\0\1\107\12\0"+
    "\1\110\6\0\1\111\31\0\1\112\53\0\1\57\5\0"+
    "\3\57\1\75\22\57\24\0\1\57\5\0\4\57\1\113"+
    "\21\57\24\0\1\57\5\0\20\57\1\114\5\57\6\0"+
    "\1\115\15\0\1\57\5\0\1\116\25\57\24\0\1\57"+
    "\5\0\5\57\1\117\20\57\24\0\1\57\5\0\2\57"+
    "\1\120\23\57\24\0\1\57\5\0\20\57\1\121\5\57"+
    "\6\0\1\122\15\0\1\57\5\0\12\57\1\123\1\124"+
    "\12\57\7\0\1\125\14\0\1\57\5\0\14\57\1\126"+
    "\11\57\24\0\1\57\5\0\10\57\1\127\10\57\1\130"+
    "\4\57\5\0\1\131\16\0\1\57\5\0\15\57\1\132"+
    "\10\57\24\0\1\57\5\0\21\57\1\133\4\57\24\0"+
    "\1\57\5\0\25\57\1\134\24\0\1\57\5\0\1\135"+
    "\25\57\24\0\1\57\5\0\22\57\1\136\3\57\24\0"+
    "\1\57\5\0\10\57\1\137\15\57\5\0\1\140\16\0"+
    "\1\57\5\0\22\57\1\141\3\57\24\0\1\57\5\0"+
    "\2\57\1\142\23\57\24\0\1\57\5\0\10\57\1\143"+
    "\15\57\5\0\1\144\34\0\1\131\10\0\1\145\11\0"+
    "\1\131\24\0\1\146\101\0\1\147\45\0\1\140\22\0"+
    "\1\140\16\0\1\57\5\0\1\150\25\57\24\0\1\57"+
    "\5\0\4\57\1\151\21\57\36\0\1\152\45\0\1\57"+
    "\5\0\17\57\1\153\6\57\24\0\1\57\5\0\1\154"+
    "\25\57\24\0\1\57\5\0\7\57\1\155\16\57\24\0"+
    "\1\57\5\0\4\57\1\156\3\57\1\157\15\57\5\0"+
    "\1\160\30\0\1\161\3\0\1\160\22\0\1\160\16\0"+
    "\1\57\5\0\4\57\1\162\21\57\24\0\1\57\5\0"+
    "\20\57\1\141\5\57\6\0\1\163\27\0\1\164\45\0"+
    "\1\57\5\0\2\57\1\165\23\57\24\0\1\57\5\0"+
    "\21\57\1\166\4\57\53\0\1\167\30\0\1\57\5\0"+
    "\16\57\1\170\7\57\24\0\1\57\5\0\7\57\1\171"+
    "\16\57\24\0\1\57\5\0\1\57\1\172\24\57\24\0"+
    "\1\57\5\0\14\57\1\173\11\57\24\0\1\57\5\0"+
    "\21\57\1\174\4\57\24\0\1\57\5\0\21\57\1\175"+
    "\4\57\53\0\1\176\30\0\1\57\5\0\4\57\1\177"+
    "\21\57\24\0\1\57\5\0\21\57\1\200\4\57\24\0"+
    "\1\57\5\0\13\57\1\201\12\57\45\0\1\202\60\0"+
    "\1\203\64\0\1\204\30\0\1\57\5\0\12\57\1\205"+
    "\13\57\7\0\1\206\14\0\1\57\5\0\22\57\1\207"+
    "\3\57\24\0\1\57\5\0\5\57\1\210\20\57\37\0"+
    "\1\211\44\0\1\57\5\0\17\57\1\212\6\57\36\0"+
    "\1\213\72\0\1\214\32\0\1\57\5\0\10\57\1\215"+
    "\15\57\5\0\1\216\16\0\1\57\5\0\1\217\25\57"+
    "\24\0\1\57\5\0\13\57\1\220\12\57\24\0\1\57"+
    "\5\0\2\57\1\221\23\57\34\0\1\222\47\0\1\57"+
    "\5\0\15\57\1\223\10\57\24\0\1\57\5\0\4\57"+
    "\1\224\21\57\36\0\1\225\66\0\1\226\36\0\1\57"+
    "\5\0\13\57\1\227\12\57\24\0\1\57\5\0\14\57"+
    "\1\230\11\57\46\0\1\231\35\0\1\57\5\0\2\57"+
    "\1\232\23\57\24\0\1\57\5\0\14\57\1\233\11\57"+
    "\24\0\1\57\5\0\7\57\1\234\16\57\41\0\1\235"+
    "\42\0\1\57\5\0\17\57\1\236\6\57\46\0\1\237"+
    "\35\0\1\57\5\0\21\57\1\240\4\57\24\0\1\57"+
    "\5\0\6\57\1\241\17\57\40\0\1\242\43\0\1\57"+
    "\5\0\12\57\1\243\13\57\7\0\1\244";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5088];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\1\1\10\11\2\1\2\11\22\1\5\11"+
    "\2\1\4\11\1\0\26\1\1\11\4\0\1\11\2\1"+
    "\1\0\4\1\1\0\2\1\1\0\3\1\1\0\6\1"+
    "\1\0\3\1\1\0\1\11\2\0\2\1\1\11\5\1"+
    "\1\0\1\11\1\1\2\0\2\1\1\11\6\1\1\0"+
    "\3\1\1\0\1\11\2\1\1\11\2\1\1\11\1\1"+
    "\2\11\1\1\1\0\3\1\1\0\2\1\1\11\1\0"+
    "\2\1\1\0\3\1\1\11\1\1\1\11\2\1\1\11"+
    "\1\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[164];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
	public static int erroresLexicos = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.out.println("Falla en lexico, char o variable no aceptada: " +yytext()+">. Linea: "+(yyline + 1)+ ", Columna: "+(yycolumn+1));
							erroresLexicos++;
            }
            // fall through
          case 48: break;
          case 2:
            { 
            }
            // fall through
          case 49: break;
          case 3:
            { System.out.print(yytext());
            }
            // fall through
          case 50: break;
          case 4:
            { yybegin(COMMENT_PORTION);
            }
            // fall through
          case 51: break;
          case 5:
            { return new Symbol(sym.OPRES, yycolumn, yyline, yytext());
            }
            // fall through
          case 52: break;
          case 6:
            { return new Symbol(sym.LPAR, yycolumn, yyline, yytext());
            }
            // fall through
          case 53: break;
          case 7:
            { return new Symbol(sym.RPAR, yycolumn, yyline, yytext());
            }
            // fall through
          case 54: break;
          case 8:
            { return new Symbol(sym.OPMULT, yycolumn, yyline, yytext());
            }
            // fall through
          case 55: break;
          case 9:
            { return new Symbol(sym.OPSUMA, yycolumn, yyline, yytext());
            }
            // fall through
          case 56: break;
          case 10:
            { return new Symbol(sym.COMMA, yycolumn, yyline, yytext());
            }
            // fall through
          case 57: break;
          case 11:
            { return new Symbol(sym.INTEGER, yycolumn, yyline, yytext());
            }
            // fall through
          case 58: break;
          case 12:
            { return new Symbol(sym.COLON, yycolumn, yyline, yytext());
            }
            // fall through
          case 59: break;
          case 13:
            { return new Symbol(sym.SEMICOLON, yycolumn, yyline, yytext());
            }
            // fall through
          case 60: break;
          case 14:
            { return new Symbol(sym.OPREL, yycolumn, yyline, yytext());
            }
            // fall through
          case 61: break;
          case 15:
            { return new Symbol(sym.LETTERS, yycolumn, yyline, yytext());
            }
            // fall through
          case 62: break;
          case 16:
            { return new Symbol(sym.LSBRACKET, yycolumn, yyline, yytext());
            }
            // fall through
          case 63: break;
          case 17:
            { return new Symbol(sym.RSBRACKET, yycolumn, yyline, yytext());
            }
            // fall through
          case 64: break;
          case 18:
            { return new Symbol(sym.LCBRACKET, yycolumn, yyline, yytext());
            }
            // fall through
          case 65: break;
          case 19:
            { return new Symbol(sym.PIPE, yycolumn, yyline, yytext());
            }
            // fall through
          case 66: break;
          case 20:
            { return new Symbol(sym.RCBRACKET, yycolumn, yyline, yytext());
            }
            // fall through
          case 67: break;
          case 21:
            { yybegin(YYINITIAL);
            }
            // fall through
          case 68: break;
          case 22:
            { return new Symbol(sym.ASSIGNMENT, yycolumn, yyline, yytext());
            }
            // fall through
          case 69: break;
          case 23:
            { return new Symbol(sym.ID, yycolumn, yyline, yytext());
            }
            // fall through
          case 70: break;
          case 24:
            { return new Symbol(sym.IF, yycolumn, yyline, yytext());
            }
            // fall through
          case 71: break;
          case 25:
            { return new Symbol(sym.EQUALS, yycolumn, yyline, yytext());
            }
            // fall through
          case 72: break;
          case 26:
            { return new Symbol(sym.DEF, yycolumn, yyline, yytext());
            }
            // fall through
          case 73: break;
          case 27:
            { return new Symbol(sym.INT, yycolumn, yyline, yytext());
            }
            // fall through
          case 74: break;
          case 28:
            { return new Symbol(sym.CASE, yycolumn, yyline, yytext());
            }
            // fall through
          case 75: break;
          case 29:
            { return new Symbol(sym.CHAR, yycolumn, yyline, yytext());
            }
            // fall through
          case 76: break;
          case 30:
            { return new Symbol(sym.EACH, yycolumn, yyline, yytext());
            }
            // fall through
          case 77: break;
          case 31:
            { return new Symbol(sym.ELSE, yycolumn, yyline, yytext());
            }
            // fall through
          case 78: break;
          case 32:
            { return new Symbol(sym.FUNC, yycolumn, yyline, yytext());
            }
            // fall through
          case 79: break;
          case 33:
            { return new Symbol(sym.INIT, yycolumn, yyline, yytext());
            }
            // fall through
          case 80: break;
          case 34:
            { return new Symbol(sym.LOOP, yycolumn, yyline, yytext());
            }
            // fall through
          case 81: break;
          case 35:
            { return new Symbol(sym.SCAN, yycolumn, yyline, yytext());
            }
            // fall through
          case 82: break;
          case 36:
            { return new Symbol(sym.SOUT, yycolumn, yyline, yytext());
            }
            // fall through
          case 83: break;
          case 37:
            { return new Symbol(sym.BOOL, yycolumn, yyline, yytext());
            }
            // fall through
          case 84: break;
          case 38:
            { return new Symbol(sym.BREAK, yycolumn, yyline, yytext());
            }
            // fall through
          case 85: break;
          case 39:
            { return new Symbol(sym.ELSIF, yycolumn, yyline, yytext());
            }
            // fall through
          case 86: break;
          case 40:
            { return new Symbol(sym.FAKER, yycolumn, yyline, yytext());
            }
            // fall through
          case 87: break;
          case 41:
            { return new Symbol(sym.WHILE, yycolumn, yyline, yytext());
            }
            // fall through
          case 88: break;
          case 42:
            { return new Symbol(sym.SOUTLN, yycolumn, yyline, yytext());
            }
            // fall through
          case 89: break;
          case 43:
            { return new Symbol(sym.SWITCH, yycolumn, yyline, yytext());
            }
            // fall through
          case 90: break;
          case 44:
            { return new Symbol(sym.VECTOR, yycolumn, yyline, yytext());
            }
            // fall through
          case 91: break;
          case 45:
            { return new Symbol(sym.DEFAULT, yycolumn, yyline, yytext());
            }
            // fall through
          case 92: break;
          case 46:
            { return new Symbol(sym.NOTHING, yycolumn, yyline, yytext());
            }
            // fall through
          case 93: break;
          case 47:
            { return new Symbol(sym.PAYBACK, yycolumn, yyline, yytext());
            }
            // fall through
          case 94: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String[] argv) {
    if (argv.length == 0) {
      System.out.println("Usage : java Lexico [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          // Side-effect: is encodingName valid?
          java.nio.charset.Charset.forName(encodingName);
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Lexico scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Lexico(reader);
          while ( !scanner.zzAtEOF ) scanner.next_token();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
