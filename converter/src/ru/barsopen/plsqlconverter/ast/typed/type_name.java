package ru.barsopen.plsqlconverter.ast.typed;
public class type_name implements _baseNode {
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
  public java.util.List<id> ids = new java.util.ArrayList<id>();
  public java.util.List<id> get_ids() { return this.ids; }
  public void add_ids(id value) {
    insert_ids(ids.size(), value);
  }
  public void insert_ids(int pos, id value) {
    this.ids.add(pos, value);
    value._setParent(this);
  }
  public void remove_ids(int pos) {
    this.ids.get(pos)._setParent(null);
    this.ids.remove(pos);
  }
  public void remove_ids(id value) {
    this.remove_ids(this.ids.indexOf(value));
  }

  public void _walk(_visitor visitor) {
    visitor.visit(this);
    for (id _value: this.ids) {
      _value._walk(visitor);
    }
  }
  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.TYPE_NAME);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("TYPE_NAME");
    org.antlr.runtime.tree.CommonTree _result = new org.antlr.runtime.tree.CommonTree(_token);
    _result.setTokenStartIndex(_tokenStartIndex);
    _result.setTokenStopIndex(_tokenStopIndex);
    if (ids.size() == 0) { throw new RuntimeException(); }
    for (int i = 0; i < ids.size(); ++i) {
      _result.addChild(ids.get(i).unparse());
    }


    return _result;
  }

}
