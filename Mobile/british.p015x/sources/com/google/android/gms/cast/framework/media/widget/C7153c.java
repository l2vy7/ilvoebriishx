package com.google.android.gms.cast.framework.media.widget;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import p006a5.C6492o;

/* renamed from: com.google.android.gms.cast.framework.media.widget.c */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final class C7153c extends View.AccessibilityDelegate {

    /* renamed from: a */
    final /* synthetic */ CastSeekBar f28818a;

    /* synthetic */ C7153c(CastSeekBar castSeekBar, C7152b bVar) {
        this.f28818a = castSeekBar;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(SeekBar.class.getName());
        accessibilityEvent.setItemCount(this.f28818a.f28757b.f49651b);
        accessibilityEvent.setCurrentItemIndex(this.f28818a.getProgress());
    }

    @TargetApi(16)
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        if (C6492o.m28280c() && view.isEnabled()) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    @TargetApi(16)
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (!view.isEnabled()) {
            return false;
        }
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (C6492o.m28280c() && (i == 4096 || i == 8192)) {
            this.f28818a.m29417h();
            CastSeekBar castSeekBar = this.f28818a;
            int i2 = castSeekBar.f28757b.f49651b / 20;
            if (i == 8192) {
                i2 = -i2;
            }
            castSeekBar.m29416g(castSeekBar.getProgress() + i2);
            this.f28818a.m29418i();
        }
        return false;
    }
}
