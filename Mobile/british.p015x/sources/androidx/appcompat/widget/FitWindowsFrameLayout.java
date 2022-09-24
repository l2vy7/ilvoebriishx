package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.C0413r;

public class FitWindowsFrameLayout extends FrameLayout implements C0413r {

    /* renamed from: b */
    private C0413r.C0414a f1277b;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        C0413r.C0414a aVar = this.f1277b;
        if (aVar != null) {
            aVar.mo871a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C0413r.C0414a aVar) {
        this.f1277b = aVar;
    }
}
