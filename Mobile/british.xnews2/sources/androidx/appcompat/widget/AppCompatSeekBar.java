package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p072f.C5238a;

public class AppCompatSeekBar extends SeekBar {

    /* renamed from: b */
    private final C0395j f1229b;

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5238a.f22798L);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1229b.mo2174h();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1229b.mo2175i();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1229b.mo2173g(canvas);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0373a0.m1942a(this, getContext());
        C0395j jVar = new C0395j(this);
        this.f1229b = jVar;
        jVar.mo2164c(attributeSet, i);
    }
}
