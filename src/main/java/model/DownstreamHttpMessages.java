package model;

import com.google.common.base.MoreObjects;

import java.io.Serializable;
import java.util.List;

/**
 * ref. https://firebase.google.com/docs/cloud-messaging/http-server-ref#downstream-http-messages-json
 */
public class DownstreamHttpMessages implements Serializable {

  private static final long serialVersionUID = -4670133270589402627L;

  // Required
  private String to;
  private List<String> registrationIds;

  // Optional
  private String collapseKey;
  private String priority;
  private Boolean contentAvailable;
  private Integer timeToLive;
  private String restrictedPackageName;
  private Boolean dryRun;
  private DownstreamHttpData data;
  private DownstreamHttpNotification notification;

  public DownstreamHttpMessages(String to, List<String> registrationIds) {
    this.to = to;
    this.registrationIds = registrationIds;
  }

  public String getTo() {
    return to;
  }

  public List<String> getRegistrationIds() {
    return registrationIds;
  }

  public String getCollapseKey() {
    return collapseKey;
  }

  public String getPriority() {
    return priority;
  }

  public Boolean getContentAvailable() {
    return contentAvailable;
  }

  public Integer getTimeToLive() {
    return timeToLive;
  }

  public String getRestrictedPackageName() {
    return restrictedPackageName;
  }

  public Boolean getDryRun() {
    return dryRun;
  }

  public DownstreamHttpData getData() {
    return data;
  }

  public DownstreamHttpNotification getNotification() {
    return notification;
  }

  public DownstreamHttpMessages setCollapseKey(String collapseKey) {
    this.collapseKey = collapseKey;
    return this;
  }

  public DownstreamHttpMessages setPriority(String priority) {
    this.priority = priority;
    return this;
  }

  public DownstreamHttpMessages setContentAvailable(Boolean contentAvailable) {
    this.contentAvailable = contentAvailable;
    return this;
  }

  public DownstreamHttpMessages setTimeToLive(Integer timeToLive) {
    this.timeToLive = timeToLive;
    return this;
  }

  public DownstreamHttpMessages setRestrictedPackageName(String restrictedPackageName) {
    this.restrictedPackageName = restrictedPackageName;
    return this;
  }

  public DownstreamHttpMessages setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  public DownstreamHttpMessages setData(DownstreamHttpData data) {
    this.data = data;
    return this;
  }

  public DownstreamHttpMessages setNotification(DownstreamHttpNotification notification) {
    this.notification = notification;
    return this;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("to", to)
        .add("registrationIds", registrationIds)
        .add("collapseKey", collapseKey)
        .add("priority", priority)
        .add("contentAvailable", contentAvailable)
        .add("timeToLive", timeToLive)
        .add("restrictedPackageName", restrictedPackageName)
        .add("dryRun", dryRun)
        .add("data", data)
        .add("notification", notification)
        .toString();
  }
}
