package com.google.android.exoplayer2.p041ui;

import android.graphics.Color;
import com.google.android.exoplayer2.util.Util;

/* renamed from: com.google.android.exoplayer2.ui.HtmlUtils */
final class HtmlUtils {
    private HtmlUtils() {
    }

    public static String cssAllClassDescendantsSelector(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str).length());
        sb.append(".");
        sb.append(str);
        sb.append(",.");
        sb.append(str);
        sb.append(" *");
        return sb.toString();
    }

    public static String toCssRgba(int i) {
        double alpha = (double) Color.alpha(i);
        Double.isNaN(alpha);
        return Util.formatInvariant("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(alpha / 255.0d));
    }
}
