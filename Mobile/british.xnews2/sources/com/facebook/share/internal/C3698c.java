package com.facebook.share.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.C3451g;
import com.facebook.common.C3439c;
import com.facebook.common.C3442f;
import com.facebook.common.C3443g;
import p078g.C5264a;

@Deprecated
/* renamed from: com.facebook.share.internal.c */
/* compiled from: LikeButton */
public class C3698c extends C3451g {
    @Deprecated
    public C3698c(Context context, boolean z) {
        super(context, (AttributeSet) null, 0, 0, "fb_like_button_create", "fb_like_button_did_tap");
        setSelected(z);
    }

    /* renamed from: n */
    private void m12480n() {
        if (isSelected()) {
            setCompoundDrawablesWithIntrinsicBounds(C3439c.com_facebook_button_like_icon_selected, 0, 0, 0);
            setText(getResources().getString(C3442f.com_facebook_like_button_liked));
            return;
        }
        setCompoundDrawablesWithIntrinsicBounds(C5264a.m23789d(getContext(), C3439c.com_facebook_button_icon), (Drawable) null, (Drawable) null, (Drawable) null);
        setText(getResources().getString(C3442f.com_facebook_like_button_not_liked));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo11880e(Context context, AttributeSet attributeSet, int i, int i2) {
        super.mo11880e(context, attributeSet, i, i2);
        m12480n();
    }

    /* access modifiers changed from: protected */
    public int getDefaultRequestCode() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public int getDefaultStyleResource() {
        return C3443g.com_facebook_button_like;
    }

    @Deprecated
    public void setSelected(boolean z) {
        super.setSelected(z);
        m12480n();
    }
}
