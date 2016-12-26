# fcm-sender-java

fcm-sender-java is libary for sending notification to FCM server.

## Usage

```java
DownstreamHttpNotification downstreamHttpNotificationAndroid =
  DownstreamHttpNotificationAndroid.builder()
    .setTitle("Hello")
    .setBody("This is test notification.")
    .build();

DownstreamHttpMessages downstreamHttpMessages =
  new DownstreamHttpMessages(registrationIdForTest, null)
    .setContentAvailable(true)
    .setNotification(downstreamHttpNotificationAndroid)
    .setData(this.getDownstreamHttpData())
    .setDryRun(false);

FcmSender fcmSender = new FcmSender("Your Auth Key");
DownstreamHttpResponse downstreamHttpResponse = fcmSender.sendNotification(downstreamHttpMessages);
```

## Reference
- https://developers.google.com/cloud-messaging/http-server-ref
