
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sat May 30 14:11:36 CST 2020
//----------------------------------------------------

package System;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sat May 30 14:11:36 CST 2020
  */
public class sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public sintax() {super();}

  /** Constructor which sets the default scanner. */
  public sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\054\000\002\002\004\000\002\002\004\000\002\003" +
    "\003\000\002\003\003\000\002\003\004\000\002\003\004" +
    "\000\002\004\004\000\002\004\004\000\002\004\004\000" +
    "\002\004\004\000\002\004\003\000\002\004\003\000\002" +
    "\004\003\000\002\004\003\000\002\006\005\000\002\007" +
    "\007\000\002\010\007\000\002\011\007\000\002\005\004" +
    "\000\002\005\003\000\002\012\010\000\002\012\011\000" +
    "\002\012\007\000\002\012\010\000\002\012\007\000\002" +
    "\012\010\000\002\013\007\000\002\014\010\000\002\014" +
    "\010\000\002\014\007\000\002\014\007\000\002\015\010" +
    "\000\002\015\007\000\002\016\010\000\002\016\007\000" +
    "\002\021\003\000\002\021\003\000\002\021\004\000\002" +
    "\021\004\000\002\017\004\000\002\017\003\000\002\020" +
    "\004\000\002\020\003\000\002\022\007" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\155\000\004\004\004\001\002\000\004\016\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\001\001\002" +
    "\000\014\005\144\006\142\007\145\010\143\011\027\001" +
    "\002\000\006\002\ufff6\016\ufff6\001\002\000\004\002\000" +
    "\001\002\000\006\002\ufff5\016\ufff5\001\002\000\006\002" +
    "\ufff4\016\ufff4\001\002\000\006\002\ufffe\016\007\001\002" +
    "\000\006\002\ufff7\016\ufff7\001\002\000\006\002\uffff\016" +
    "\007\001\002\000\006\002\uffee\016\uffee\001\002\000\006" +
    "\002\ufff8\016\ufff8\001\002\000\006\002\ufff9\016\ufff9\001" +
    "\002\000\006\002\ufffd\016\025\001\002\000\006\002\ufffb" +
    "\016\ufffb\001\002\000\006\002\ufffa\016\ufffa\001\002\000" +
    "\004\011\027\001\002\000\006\002\uffef\016\uffef\001\002" +
    "\000\006\016\032\021\030\001\002\000\004\022\134\001" +
    "\002\000\006\016\107\017\127\001\002\000\006\012\123" +
    "\013\113\001\002\000\004\016\032\001\002\000\006\016" +
    "\036\017\035\001\002\000\004\011\101\001\002\000\004" +
    "\013\037\001\002\000\004\016\042\001\002\000\006\016" +
    "\073\017\072\001\002\000\006\016\064\017\063\001\002" +
    "\000\006\014\044\015\043\001\002\000\006\020\050\024" +
    "\045\001\002\000\006\020\050\024\045\001\002\000\010" +
    "\017\uffd7\020\uffd7\024\uffd7\001\002\000\004\017\056\001" +
    "\002\000\010\017\uffdd\020\050\024\054\001\002\000\010" +
    "\017\uffd9\020\uffd9\024\uffd9\001\002\000\010\017\uffde\020" +
    "\053\024\045\001\002\000\006\017\uffdc\024\054\001\002" +
    "\000\010\017\uffda\020\uffda\024\uffda\001\002\000\010\017" +
    "\uffd8\020\uffd8\024\uffd8\001\002\000\006\017\uffdb\020\053" +
    "\001\002\000\004\014\057\001\002\000\006\016\uffe1\017" +
    "\uffe1\001\002\000\004\017\061\001\002\000\004\015\062" +
    "\001\002\000\006\016\uffdf\017\uffdf\001\002\000\004\013" +
    "\071\001\002\000\004\015\065\001\002\000\006\020\050" +
    "\024\045\001\002\000\004\017\067\001\002\000\004\015" +
    "\070\001\002\000\006\016\uffe0\017\uffe0\001\002\000\006" +
    "\016\uffe5\017\uffe5\001\002\000\004\013\100\001\002\000" +
    "\004\014\074\001\002\000\006\020\050\024\045\001\002" +
    "\000\004\017\076\001\002\000\004\014\077\001\002\000" +
    "\006\016\uffe2\017\uffe2\001\002\000\006\016\uffe6\017\uffe6" +
    "\001\002\000\006\002\uffeb\016\uffeb\001\002\000\006\016" +
    "\107\017\106\001\002\000\006\016\036\017\104\001\002" +
    "\000\004\011\105\001\002\000\006\002\uffea\016\uffea\001" +
    "\002\000\004\011\122\001\002\000\004\013\113\001\002" +
    "\000\006\016\036\017\111\001\002\000\004\011\112\001" +
    "\002\000\006\002\uffec\016\uffec\001\002\000\004\016\042" +
    "\001\002\000\006\016\064\017\120\001\002\000\006\016" +
    "\073\017\116\001\002\000\004\013\117\001\002\000\006" +
    "\016\uffe4\017\uffe4\001\002\000\004\013\121\001\002\000" +
    "\006\016\uffe3\017\uffe3\001\002\000\006\002\uffe8\016\uffe8" +
    "\001\002\000\006\020\050\024\045\001\002\000\004\017" +
    "\125\001\002\000\004\012\126\001\002\000\006\016\uffe7" +
    "\017\uffe7\001\002\000\004\011\133\001\002\000\006\016" +
    "\036\017\131\001\002\000\004\011\132\001\002\000\006" +
    "\002\uffed\016\uffed\001\002\000\006\002\uffe9\016\uffe9\001" +
    "\002\000\004\023\135\001\002\000\004\020\136\001\002" +
    "\000\004\023\137\001\002\000\004\016\uffd6\001\002\000" +
    "\006\002\ufffc\016\141\001\002\000\012\005\144\006\142" +
    "\007\145\010\143\001\002\000\004\017\157\001\002\000" +
    "\006\020\050\024\045\001\002\000\006\020\050\024\045" +
    "\001\002\000\006\020\050\024\045\001\002\000\004\017" +
    "\147\001\002\000\004\007\150\001\002\000\006\002\ufff1" +
    "\016\ufff1\001\002\000\004\017\152\001\002\000\004\005" +
    "\153\001\002\000\006\002\ufff2\016\ufff2\001\002\000\004" +
    "\017\155\001\002\000\004\010\156\001\002\000\006\002" +
    "\ufff0\016\ufff0\001\002\000\006\002\ufff3\016\ufff3\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\155\000\004\002\004\001\001\000\022\003\010\004" +
    "\015\005\013\006\014\007\007\010\011\011\012\012\016" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\016\004\137\006\014\007\007\010" +
    "\011\011\012\012\025\001\001\000\002\001\001\000\016" +
    "\005\021\006\022\007\023\010\020\011\017\012\016\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\012\025\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\013\030" +
    "\014\033\022\032\001\001\000\002\001\001\000\004\014" +
    "\127\001\001\000\002\001\001\000\006\013\101\014\102" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\015\037\016\040\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\010\017\050\020" +
    "\046\021\057\001\001\000\010\017\050\020\046\021\045" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\017" +
    "\054\001\001\000\002\001\001\000\004\020\051\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\010\017\050\020\046\021\065" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\017\050\020\046\021\074\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\014\107\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\015\114\016\113\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\017\050\020\046\021\123\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\012\006\022\007\023\010" +
    "\020\011\017\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\017\050\020\046\021\153\001\001\000\010\017" +
    "\050\020\046\021\150\001\001\000\010\017\050\020\046" +
    "\021\145\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$sintax$actions {
  private final sintax parser;

  /** Constructor */
  CUP$sintax$actions(sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$sintax$do_action(
    int                        CUP$sintax$act_num,
    java_cup.runtime.lr_parser CUP$sintax$parser,
    java.util.Stack            CUP$sintax$stack,
    int                        CUP$sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$sintax$result;

      /* select the action based on the action number */
      switch (CUP$sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // S_BORDE ::= Borde Igual Comilla Identificador Comilla 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_BORDE",16, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-4)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // S_NUM ::= Numero 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_NUM",14, ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // S_NUM ::= S_NUM Numero 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_NUM",14, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-1)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // S_ID ::= Identificador 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_ID",13, ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // S_ID ::= S_ID Identificador 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_ID",13, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-1)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // S_VAR ::= S_NUM S_ID 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_VAR",15, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-1)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // S_VAR ::= S_ID S_NUM 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_VAR",15, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-1)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // S_VAR ::= S_NUM 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_VAR",15, ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // S_VAR ::= S_ID 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_VAR",15, ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // S_CELDA ::= AbreEtiqueta Celda S_VAR CierraEtiqueta Celda 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_CELDA",12, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-4)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // S_CELDA ::= S_CELDA AbreEtiqueta Celda S_VAR CierraEtiqueta Celda 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_CELDA",12, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-5)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // S_CELDA_ENCABEZADO ::= AbreEtiqueta CeldaEncabezado S_VAR CierraEtiqueta CeldaEncabezado 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_CELDA_ENCABEZADO",11, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-4)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // S_CELDA_ENCABEZADO ::= S_CELDA_ENCABEZADO AbreEtiqueta CeldaEncabezado S_VAR CierraEtiqueta CeldaEncabezado 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_CELDA_ENCABEZADO",11, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-5)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // S_FILA ::= AbreEtiqueta Fila S_CELDA CierraEtiqueta Fila 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_FILA",10, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-4)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // S_FILA ::= AbreEtiqueta Fila S_CELDA_ENCABEZADO CierraEtiqueta Fila 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_FILA",10, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-4)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // S_FILA ::= S_FILA AbreEtiqueta Fila S_CELDA CierraEtiqueta Fila 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_FILA",10, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-5)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // S_FILA ::= S_FILA AbreEtiqueta Fila S_CELDA_ENCABEZADO CierraEtiqueta Fila 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_FILA",10, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-5)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // S_ETIQUETA_TABLA ::= AbreEtiqueta EtiquetaTabla S_VAR CierraEtiqueta EtiquetaTabla 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_ETIQUETA_TABLA",9, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-4)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // S_TABLA ::= AbreEtiqueta Tabla S_BORDE S_ETIQUETA_TABLA CierraEtiqueta Tabla 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_TABLA",8, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-5)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // S_TABLA ::= AbreEtiqueta Tabla S_ETIQUETA_TABLA CierraEtiqueta Tabla 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_TABLA",8, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-4)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // S_TABLA ::= AbreEtiqueta Tabla S_BORDE S_FILA CierraEtiqueta Tabla 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_TABLA",8, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-5)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // S_TABLA ::= AbreEtiqueta Tabla S_FILA CierraEtiqueta Tabla 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_TABLA",8, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-4)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // S_TABLA ::= AbreEtiqueta Tabla S_BORDE S_ETIQUETA_TABLA S_FILA CierraEtiqueta Tabla 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_TABLA",8, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-6)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // S_TABLA ::= AbreEtiqueta Tabla S_ETIQUETA_TABLA S_FILA CierraEtiqueta Tabla 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_TABLA",8, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-5)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // TAG_TABLAS ::= S_TABLA 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("TAG_TABLAS",3, ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // TAG_TABLAS ::= TAG_TABLAS S_TABLA 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("TAG_TABLAS",3, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-1)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // S_CAJA_TEXTO ::= AbreEtiqueta CajaTexto S_VAR CierraEtiqueta CajaTexto 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_CAJA_TEXTO",7, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-4)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // S_ETIQUETA_TEXTO ::= AbreEtiqueta EtiquetaTexto S_VAR CierraEtiqueta EtiquetaTexto 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_ETIQUETA_TEXTO",6, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-4)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // S_BOTON ::= AbreEtiqueta Boton S_VAR CierraEtiqueta Boton 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_BOTON",5, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-4)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // S_SALTO ::= AbreEtiqueta Salto CierraEtiqueta 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("S_SALTO",4, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-2)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // TAG_NORMAL ::= S_CAJA_TEXTO 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("TAG_NORMAL",2, ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // TAG_NORMAL ::= S_ETIQUETA_TEXTO 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("TAG_NORMAL",2, ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // TAG_NORMAL ::= S_BOTON 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("TAG_NORMAL",2, ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // TAG_NORMAL ::= S_SALTO 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("TAG_NORMAL",2, ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // TAG_NORMAL ::= TAG_NORMAL S_CAJA_TEXTO 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("TAG_NORMAL",2, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-1)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // TAG_NORMAL ::= TAG_NORMAL S_ETIQUETA_TEXTO 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("TAG_NORMAL",2, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-1)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // TAG_NORMAL ::= TAG_NORMAL S_BOTON 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("TAG_NORMAL",2, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-1)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // TAG_NORMAL ::= TAG_NORMAL S_SALTO 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("TAG_NORMAL",2, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-1)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // ESTRUCTURA ::= TAG_TABLAS TAG_NORMAL 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("ESTRUCTURA",1, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-1)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // ESTRUCTURA ::= TAG_NORMAL TAG_TABLAS 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("ESTRUCTURA",1, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-1)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // ESTRUCTURA ::= TAG_TABLAS 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("ESTRUCTURA",1, ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // ESTRUCTURA ::= TAG_NORMAL 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("ESTRUCTURA",1, ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= InicioPrograma ESTRUCTURA 
            {
              Object RESULT =null;

              CUP$sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-1)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          return CUP$sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$sintax$stack.elementAt(CUP$sintax$top-1)).value;
		RESULT = start_val;
              CUP$sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$sintax$stack.elementAt(CUP$sintax$top-1)), ((java_cup.runtime.Symbol)CUP$sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$sintax$parser.done_parsing();
          return CUP$sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

