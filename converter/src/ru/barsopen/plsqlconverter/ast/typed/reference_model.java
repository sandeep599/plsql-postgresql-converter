package ru.barsopen.plsqlconverter.ast.typed;
public class reference_model implements _baseNode {
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
  public reference_model_name reference_model_name = null;
  public reference_model_name get_reference_model_name() { return this.reference_model_name; }
  public void set_reference_model_name(reference_model_name value) {
    if (this.reference_model_name != null) { this.reference_model_name._setParent(null); }
    this.reference_model_name = value;
    if (this.reference_model_name != null) { this.reference_model_name._setParent(this); }
  }
  public subquery subquery = null;
  public subquery get_subquery() { return this.subquery; }
  public void set_subquery(subquery value) {
    if (this.subquery != null) { this.subquery._setParent(null); }
    this.subquery = value;
    if (this.subquery != null) { this.subquery._setParent(this); }
  }
  public model_column_clauses model_column_clauses = null;
  public model_column_clauses get_model_column_clauses() { return this.model_column_clauses; }
  public void set_model_column_clauses(model_column_clauses value) {
    if (this.model_column_clauses != null) { this.model_column_clauses._setParent(null); }
    this.model_column_clauses = value;
    if (this.model_column_clauses != null) { this.model_column_clauses._setParent(this); }
  }
  public java.util.List<cell_reference_options> cell_reference_optionss = new java.util.ArrayList<cell_reference_options>();
  public java.util.List<cell_reference_options> get_cell_reference_optionss() { return this.cell_reference_optionss; }
  public void add_cell_reference_optionss(cell_reference_options value) {
    insert_cell_reference_optionss(cell_reference_optionss.size(), value);
  }
  public void insert_cell_reference_optionss(int pos, cell_reference_options value) {
    this.cell_reference_optionss.add(pos, value);
    value._setParent(this);
  }
  public void remove_cell_reference_optionss(int pos) {
    this.cell_reference_optionss.get(pos)._setParent(null);
    this.cell_reference_optionss.remove(pos);
  }
  public void remove_cell_reference_optionss(cell_reference_options value) {
    this.remove_cell_reference_optionss(this.cell_reference_optionss.indexOf(value));
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(br.com.porcelli.parser.plsql.PLSQLParser.REFERENCE_VK);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("REFERENCE_VK");
    org.antlr.runtime.tree.CommonTree _result = new org.antlr.runtime.tree.CommonTree(_token);
    _result.setTokenStartIndex(_tokenStartIndex);
    _result.setTokenStopIndex(_tokenStopIndex);
    if (reference_model_name == null) { throw new RuntimeException(); }
    _result.addChild(reference_model_name.unparse());


    if (subquery == null) { throw new RuntimeException(); }
    _result.addChild(subquery.unparse());


    if (model_column_clauses == null) { throw new RuntimeException(); }
    _result.addChild(model_column_clauses.unparse());


    for (int i = 0; i < cell_reference_optionss.size(); ++i) {
      _result.addChild(cell_reference_optionss.get(i).unparse());
    }


    return _result;
  }

}
