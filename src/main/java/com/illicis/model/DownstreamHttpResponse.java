package com.illicis.model;

import com.google.common.base.MoreObjects;

import java.util.List;

public class DownstreamHttpResponse {

  // Required
  private long multicastId;
  private boolean success;
  private boolean failure;
  private int canonicalIds;

  // Optional
  List<DownstreamHttpResult> results;

  public long getMulticastId() {
    return multicastId;
  }

  public boolean isSuccess() {
    return success;
  }

  public boolean isFailure() {
    return failure;
  }

  public int getCanonicalIds() {
    return canonicalIds;
  }

  public List<DownstreamHttpResult> getResults() {
    return results;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("multicastId", multicastId)
        .add("success", success)
        .add("failure", failure)
        .add("canonicalIds", canonicalIds)
        .add("results", results)
        .toString();
  }
}
