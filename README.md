# fcm-sender-java

fcm-sender-java is libary for sending notification to FCM server.

## Add dependency
```xml
<repositories>
  <repository>
    <snapshots>
      <enabled>false</enabled>
    </snapshots>
    <id>bintray-enzinier-fcm-sender-java</id>
    <name>bintray</name>
    <url>http://dl.bintray.com/enzinier/fcm-sender-java</url>
  </repository>
</repositories>

<dependency>
  <groupId>com.illicis</groupId>
  <artifactId>fcm-sender-java</artifactId>
  <version>0.0.1</version>
</dependency>
```

```gradle
compile 'com.illicis:fcm-sender-java:0.0.1'
```

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

FcmSender fcmSender = new FcmSender("Your Server Key");
DownstreamHttpResponse downstreamHttpResponse = fcmSender.sendNotification(downstreamHttpMessages);
```
You can find server key from setting of firebase console. (Project Setting > Cloud Messaging)
DownstreamHttpData is just interface for getting common parameter.
Therefore you should write code to include your own data implement DownstreamHttpData.

## Reference
- https://developers.google.com/cloud-messaging/http-server-ref
