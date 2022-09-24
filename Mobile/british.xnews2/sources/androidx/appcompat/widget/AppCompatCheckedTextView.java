package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.C0624k;
import p078g.C5264a;

public class AppCompatCheckedTextView extends CheckedTextView {

    /* renamed from: c */
    private static final int[] f1210c = {16843016};

    /* renamed from: b */
    private final C0399l f1211b;

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0399l lVar = this.f1211b;
        if (lVar != null) {
            lVar.mo2184b();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0385g.m2015a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C5264a.m23789d(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0624k.m3469s(this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0399l lVar = this.f1211b;
        if (lVar != null) {
            lVar.mo2198q(context, i);
        }
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0377c0.m1949b(context), attributeSet, i);
        C0373a0.m1942a(this, getContext());
        C0399l lVar = new C0399l(this);
        this.f1211b = lVar;
        lVar.mo2194m(attributeSet, i);
        lVar.mo2184b();
        C0384f0 v = C0384f0.m1994v(getContext(), attributeSet, f1210c, i, 0);
        setCheckMarkDrawable(v.mo2101g(0));
        v.mo2114w();
    }
}
