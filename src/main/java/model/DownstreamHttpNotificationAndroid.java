package model;

import com.google.common.base.MoreObjects;

import java.io.Serializable;

/**
 * ref. https://firebase.google.com/docs/cloud-messaging/http-server-ref#notification-payload-support
 */
public class DownstreamHttpNotificationAndroid extends DownstreamHttpNotificationImpl
    implements Serializable {

  private static final long serialVersionUID = 6141848209058691502L;

  // Optional
  private final String title;
  private final String icon;
  private final String tag;
  private final String color;

  public String getTitle() {
    return title;
  }

  public String getIcon() {
    return icon;
  }

  public String getTag() {
    return tag;
  }

  public String getColor() {
    return color;
  }

  public abstract static class Builder<T extends DownstreamHttpNotificationAndroid>
      extends DownstreamHttpNotificationImpl.Builder<T> {

    // Required
    private String title;
    private String icon;

    // Optional
    private String tag;
    private String color;

    public Builder<T> setTitle(String title) {
      this.title = title;
      return this;
    }

    public Builder<T> setIcon(String icon) {
      this.icon = icon;
      return this;
    }

    public Builder<T> setTag(String tag) {
      this.tag = tag;
      return this;
    }

    public Builder<T> setColor(String color) {
      this.color = color;
      return this;
    }
  }

  public static Builder<?> builder() {
    return new Builder<DownstreamHttpNotificationAndroid>() {
      @Override
      public DownstreamHttpNotificationAndroid build() {
        return new DownstreamHttpNotificationAndroid(this);
      }
    };
  }

  protected DownstreamHttpNotificationAndroid(Builder<?> builder) {
    super(builder);
    this.title = builder.title;
    this.icon = builder.icon;
    this.tag = builder.tag;
    this.color = builder.color;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("title", title)
        .add("icon", icon)
        .add("tag", tag)
        .add("color", color)
        .toString();
  }
}
