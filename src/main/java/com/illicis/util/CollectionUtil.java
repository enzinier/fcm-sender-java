package com.illicis.util;

import java.util.Collection;

public class CollectionUtil {

  /**
   * Check null safe.
   *
   * @param collection target collection.
   * @return true if empty or null.
   */
  public static boolean isNullOrEmpty(final Collection<?> collection) {
    return collection == null || collection.isEmpty();
  }
}
