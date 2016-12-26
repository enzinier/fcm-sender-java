package model;

import com.google.common.base.MoreObjects;

import java.util.List;

/**
 * ref. https://firebase.google.com/docs/cloud-messaging/http-server-ref#notification-payload-support
 */
public class DownstreamHttpNotificationImpl implements DownstreamHttpNotification {

  // Optional
  private final String body;
  private final String sound;
  private final String clickAction;
  private final String bodyLocKey;
  private final List<String> bodyLocArgs;
  private final String titleLocKey;
  private final List<String> titleLocArgs;

  public String getBody() {
    return body;
  }

  public String getSound() {
    return sound;
  }

  public String getClickAction() {
    return clickAction;
  }

  public String getBodyLocKey() {
    return bodyLocKey;
  }

  public List<String> getBodyLocArgs() {
    return bodyLocArgs;
  }

  public String getTitleLocKey() {
    return titleLocKey;
  }

  public List<String> getTitleLocArgs() {
    return titleLocArgs;
  }

  public abstract static class Builder<T extends DownstreamHttpNotificationImpl> {

    private String body;
    private String sound;
    private String clickAction;
    private String bodyLocKey;
    private List<String> bodyLocArgs;
    private String titleLocKey;
    private List<String> titleLocArgs;

    public Builder<T> setBody(String body) {
      this.body = body;
      return this;
    }

    public Builder<T> setSound(String sound) {
      this.sound = sound;
      return this;
    }

    public Builder<T> setClickAction(String clickAction) {
      this.clickAction = clickAction;
      return this;
    }

    public Builder<T> setBodyLocKey(String bodyLocKey) {
      this.bodyLocKey = bodyLocKey;
      return this;
    }

    public Builder<T> setBodyLocArgs(List<String> bodyLocArgs) {
      this.bodyLocArgs = bodyLocArgs;
      return this;
    }

    public Builder<T> setTitleLocKey(String titleLocKey) {
      this.titleLocKey = titleLocKey;
      return this;
    }

    public Builder<T> setTitleLocArgs(List<String> titleLocArgs) {
      this.titleLocArgs = titleLocArgs;
      return this;
    }

    public abstract T build();
  }

  public static Builder<?> builder() {
    return new Builder<DownstreamHttpNotificationImpl>() {
      @Override
      public DownstreamHttpNotificationImpl build() {
        return new DownstreamHttpNotificationImpl(this);
      }
    };
  }

  protected DownstreamHttpNotificationImpl(Builder<?> builder) {
    this.body = builder.body;
    this.sound = builder.sound;
    this.clickAction = builder.clickAction;
    this.bodyLocKey = builder.bodyLocKey;
    this.bodyLocArgs = builder.bodyLocArgs;
    this.titleLocKey = builder.bodyLocKey;
    this.titleLocArgs = builder.bodyLocArgs;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("body", body)
        .add("sound", sound)
        .add("clickAction", clickAction)
        .add("bodyLocKey", bodyLocKey)
        .add("bodyLocArgs", bodyLocArgs)
        .add("titleLocKey", titleLocKey)
        .add("titleLocArgs", titleLocArgs)
        .toString();
  }
}
