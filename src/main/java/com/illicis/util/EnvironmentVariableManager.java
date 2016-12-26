package com.illicis.util;

import java.util.Map;

public class EnvironmentVariableManager {

  public static String getEnvironmentVariable(String keyName) {
    Map<String, String> env = System.getenv();
    for (String envName : env.keySet()) {
      if (envName.equals(keyName)) {
        return env.get(envName);
      }
    }

    // TODO: throw com.illicis.com.illicis.exception
    return null;
  }
}
