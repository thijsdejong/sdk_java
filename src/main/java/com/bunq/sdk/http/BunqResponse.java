package com.bunq.sdk.http;

import java.util.Map;

public class BunqResponse<T> {

  private T value;
  private Map<String, String> headers;
  private Pagination pagination;

  public BunqResponse(T value, Map<String, String> headers) {
    this(value, headers, null);
  }

  public BunqResponse(T value, Map<String, String> headers, Pagination pagination) {
    this.value = value;
    this.headers = headers;
    this.pagination = pagination;
  }

  public T getValue() {
    return value;
  }

  public Map<String, String> getHeaders() {
    return headers;
  }

  public Pagination getPagination() {
    return pagination;
  }

}
