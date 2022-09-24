package com.google.android.gms.internal.cast;

import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.cast.framework.media.C4580e;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import p114m4.C10758h;
import p114m4.C10766k;
import p114m4.C10772n;
import p114m4.C10773o;
import p114m4.C5759d;
import p125o4.C10844c;

/* renamed from: com.google.android.gms.internal.cast.w */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C8784w extends C8723s {

    /* renamed from: c */
    private final RelativeLayout f44153c;

    /* renamed from: d */
    private final TextView f44154d;

    /* renamed from: e */
    private final CastSeekBar f44155e;

    /* renamed from: f */
    private final C10844c f44156f;

    public C8784w(RelativeLayout relativeLayout, CastSeekBar castSeekBar, C10844c cVar) {
        this.f44153c = relativeLayout;
        TextView textView = (TextView) relativeLayout.findViewById(C10766k.tooltip);
        this.f44154d = textView;
        this.f44155e = castSeekBar;
        this.f44156f = cVar;
        TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes((AttributeSet) null, C10773o.f49480a, C10758h.f49394a, C10772n.f49476a);
        int resourceId = obtainStyledAttributes.getResourceId(C10773o.f49501v, 0);
        obtainStyledAttributes.recycle();
        textView.getBackground().setColorFilter(textView.getContext().getResources().getColor(resourceId), PorterDuff.Mode.SRC_IN);
    }

    /* renamed from: c */
    public final void mo36473c() {
        mo36754j();
    }

    /* renamed from: e */
    public final void mo36474e(C5759d dVar) {
        super.mo36474e(dVar);
        mo36754j();
    }

    /* renamed from: f */
    public final void mo36475f() {
        super.mo36475f();
        mo36754j();
    }

    /* renamed from: g */
    public final void mo36723g(long j) {
        mo36754j();
    }

    /* renamed from: h */
    public final void mo36724h(boolean z) {
        super.mo36724h(z);
        mo36754j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo36754j() {
        C4580e b = mo36472b();
        if (b == null || !b.mo17850o() || mo36725i()) {
            this.f44153c.setVisibility(8);
            return;
        }
        this.f44153c.setVisibility(0);
        TextView textView = this.f44154d;
        C10844c cVar = this.f44156f;
        textView.setText(cVar.mo43023m(((long) this.f44155e.getProgress()) + cVar.mo43018h()));
        int measuredWidth = (this.f44155e.getMeasuredWidth() - this.f44155e.getPaddingLeft()) - this.f44155e.getPaddingRight();
        this.f44154d.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth2 = this.f44154d.getMeasuredWidth();
        double progress = (double) this.f44155e.getProgress();
        double maxProgress = (double) this.f44155e.getMaxProgress();
        Double.isNaN(progress);
        Double.isNaN(maxProgress);
        double d = progress / maxProgress;
        double d2 = (double) measuredWidth;
        Double.isNaN(d2);
        int min = Math.min(Math.max(0, ((int) (d * d2)) - (measuredWidth2 / 2)), measuredWidth - measuredWidth2);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f44154d.getLayoutParams();
        layoutParams.leftMargin = min;
        this.f44154d.setLayoutParams(layoutParams);
    }
}
