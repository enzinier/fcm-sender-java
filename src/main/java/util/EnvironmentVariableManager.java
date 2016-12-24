package util;

import java.util.Map;
import java.util.Optional;

/**
 * @deprecated
 */
public class EnvironmentVariableManager {

  private static EnvironmentVariableManager instance = null;

  public static EnvironmentVariableManager getInstance() {
    if (instance == null) {
      instance = new EnvironmentVariableManager();
    }
    return instance;
  }

  public Optional<String> getEnvironmentVariable(String keyName) {
    Map<String, String> env = System.getenv();
    for (String envName : env.keySet()) {
      if (envName.equals(keyName)) {
        return Optional.of(env.get(envName));
      }
    }

    return null;
  }
}
