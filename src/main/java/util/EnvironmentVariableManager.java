package util;

import java.util.Map;
import java.util.Optional;

public class EnvironmentVariableManager {

  public static String getEnvironmentVariable(String keyName) {
    Map<String, String> env = System.getenv();
    for (String envName : env.keySet()) {
      if (envName.equals(keyName)) {
        return env.get(envName);
      }
    }

    // TODO: throw exception
    return null;
  }
}
