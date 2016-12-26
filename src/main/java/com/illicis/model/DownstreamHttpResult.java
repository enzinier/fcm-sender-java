package com.illicis.model;

import com.google.common.base.MoreObjects;

public class DownstreamHttpResult {

  // Required
  private String messageId;

  // Optional
  private String registrationId;
  private String error;

  public String getMessageId() {
    return messageId;
  }

  public String getRegistrationId() {
    return registrationId;
  }

  public String getError() {
    return error;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("messageId", messageId)
        .add("registrationId", registrationId)
        .add("error", error)
        .toString();
  }
}
