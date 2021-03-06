package com.rapleaf.jack.queries.where_operators;

public class LessThan<V extends Comparable<V>> extends WhereOperator<V> {

  public LessThan(V value) {
    super(value);
    ensureNoNullParameter();
  }

  @Override
  public String getSqlStatement() {
    return "< ?";
  }

  @Override
  public boolean apply(V value) {
    return value.compareTo(getParameter()) < 0;
  }

  public V getParameter() {
    return getParameters().get(0);
  }
}
