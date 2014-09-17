package ru.barsopen.plsqlconverter.ast.typed;
public class expression_element_and implements expression_element, _baseNode {
  public int _line = -1;
  public int _col = -1;
  public int _tokenStartIndex = -1;
  public int _tokenStopIndex = -1;
  public _baseNode _parent = null;
  public _baseNode _getParent() { return _parent; }
  public void _setParent(_baseNode value) { _parent = value; }
  public void _setBaseNode(_baseNode value) { this._parent = value; }
  public int _getLine() { return _line; }
  public int _getCol() { return _col; }
  public int _getTokenStartIndex() { return _tokenStartIndex; }
  public int _getTokenStopIndex() { return _tokenStopIndex; }
  public expression_element lhs = null;
  public expression_element get_lhs() { return this.lhs; }
  public void set_lhs(expression_element value) {
    if (this.lhs != null) { this.lhs._setParent(null); }
    this.lhs = value;
    if (this.lhs != null) { this.lhs._setParent(this); }
  }
  public expression_element rhs = null;
  public expression_element get_rhs() { return this.rhs; }
  public void set_rhs(expression_element value) {
    if (this.rhs != null) { this.rhs._setParent(null); }
    this.rhs = value;
    if (this.rhs != null) { this.rhs._setParent(this); }
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(br.com.porcelli.parser.plsql.PLSQLParser.SQL92_RESERVED_AND);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("SQL92_RESERVED_AND");
    org.antlr.runtime.tree.CommonTree _result = new org.antlr.runtime.tree.CommonTree(_token);
    _result.setTokenStartIndex(_tokenStartIndex);
    _result.setTokenStopIndex(_tokenStopIndex);
    if (lhs == null) { throw new RuntimeException(); }
    _result.addChild(lhs.unparse());


    if (rhs == null) { throw new RuntimeException(); }
    _result.addChild(rhs.unparse());


    return _result;
  }

}
