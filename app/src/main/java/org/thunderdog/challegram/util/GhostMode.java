package org.thunderdog.challegram.util;

import android.content.Context;
import android.content.SharedPreferences;

public final class GhostMode {
  private static final String PREF = "tgx_ghost_mode";
  private static final String KEY_ENABLED = "enabled";

  private GhostMode() {}

  private static SharedPreferences prefs(Context context) {
    return context.getApplicationContext()
        .getSharedPreferences(PREF, Context.MODE_PRIVATE);
  }

  public static boolean isEnabled(Context context) {
    if (context == null) return false;
    return prefs(context).getBoolean(KEY_ENABLED, false);
  }

  public static void setEnabled(Context context, boolean enabled) {
    if (context == null) return;
    prefs(context).edit().putBoolean(KEY_ENABLED, enabled).apply();
  }
}
