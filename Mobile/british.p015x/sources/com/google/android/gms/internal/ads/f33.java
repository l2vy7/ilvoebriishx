package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class f33 {

    /* renamed from: a */
    public static final int f20322a = (Build.VERSION.SDK_INT > 22 ? 67108864 : 0);

    /* renamed from: b */
    public static final ClipData f20323b = ClipData.newIntent("", new Intent());

    @Nullable
    /* renamed from: a */
    public static PendingIntent m20442a(Context context, int i, Intent intent, int i2, int i3) {
        boolean z = true;
        b43.m20208e((i2 & 95) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        b43.m20208e(intent.getComponent() != null, "Must set component on Intent.");
        if (m20443b(0, 1)) {
            b43.m20208e(!m20443b(i2, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            if (Build.VERSION.SDK_INT >= 23 && !m20443b(i2, 67108864)) {
                z = false;
            }
            b43.m20208e(z, "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (Build.VERSION.SDK_INT < 23 || !m20443b(i2, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!m20443b(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!m20443b(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!m20443b(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!m20443b(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(f20323b);
            }
        }
        return PendingIntent.getService(context, 0, intent2, i2);
    }

    /* renamed from: b */
    private static boolean m20443b(int i, int i2) {
        return (i & i2) == i2;
    }
}
