package ru.barsopen.plsqlconverter.ast.typed;
public class delete_statement implements data_manipulation_language_statements, _baseNode {
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
  public general_table_ref general_table_ref = null;
  public general_table_ref get_general_table_ref() { return this.general_table_ref; }
  public void set_general_table_ref(general_table_ref value) {
    if (this.general_table_ref != null) { this.general_table_ref._setParent(null); }
    this.general_table_ref = value;
    if (this.general_table_ref != null) { this.general_table_ref._setParent(this); }
  }
  public where_clause where_clause = null;
  public where_clause get_where_clause() { return this.where_clause; }
  public void set_where_clause(where_clause value) {
    if (this.where_clause != null) { this.where_clause._setParent(null); }
    this.where_clause = value;
    if (this.where_clause != null) { this.where_clause._setParent(this); }
  }
  public boolean is_where_clause() { return this.where_clause != null; }
  public static_returning_clause static_returning_clause = null;
  public static_returning_clause get_static_returning_clause() { return this.static_returning_clause; }
  public void set_static_returning_clause(static_returning_clause value) {
    if (this.static_returning_clause != null) { this.static_returning_clause._setParent(null); }
    this.static_returning_clause = value;
    if (this.static_returning_clause != null) { this.static_returning_clause._setParent(this); }
  }
  public boolean is_static_returning_clause() { return this.static_returning_clause != null; }
  public error_logging_clause error_logging_clause = null;
  public error_logging_clause get_error_logging_clause() { return this.error_logging_clause; }
  public void set_error_logging_clause(error_logging_clause value) {
    if (this.error_logging_clause != null) { this.error_logging_clause._setParent(null); }
    this.error_logging_clause = value;
    if (this.error_logging_clause != null) { this.error_logging_clause._setParent(this); }
  }
  public boolean is_error_logging_clause() { return this.error_logging_clause != null; }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(br.com.porcelli.parser.plsql.PLSQLParser.SQL92_RESERVED_DELETE);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("SQL92_RESERVED_DELETE");
    org.antlr.runtime.tree.CommonTree _result = new org.antlr.runtime.tree.CommonTree(_token);
    _result.setTokenStartIndex(_tokenStartIndex);
    _result.setTokenStopIndex(_tokenStopIndex);
    if (general_table_ref == null) { throw new RuntimeException(); }
    _result.addChild(general_table_ref.unparse());


    if (where_clause != null) {
      _result.addChild(where_clause.unparse());
    }


    if (static_returning_clause != null) {
      _result.addChild(static_returning_clause.unparse());
    }


    if (error_logging_clause != null) {
      _result.addChild(error_logging_clause.unparse());
    }


    return _result;
  }

}
