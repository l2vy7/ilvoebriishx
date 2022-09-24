package androidx.appcompat.widget;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.widget.C0624k;
import androidx.core.widget.RichContentReceiverCompat;
import p073f.C5238a;
import p111m0.C5722t;
import p122o0.C5859b;

public class AppCompatEditText extends EditText implements C5722t {

    /* renamed from: b */
    private final C0378d f1212b;

    /* renamed from: c */
    private final C0399l f1213c;

    /* renamed from: d */
    private final C0397k f1214d;

    /* renamed from: e */
    private RichContentReceiverCompat<TextView> f1215e;

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5238a.f22789C);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0378d dVar = this.f1212b;
        if (dVar != null) {
            dVar.mo2067b();
        }
        C0399l lVar = this.f1213c;
        if (lVar != null) {
            lVar.mo2184b();
        }
    }

    public RichContentReceiverCompat<TextView> getRichContentReceiverCompat() {
        return this.f1215e;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0378d dVar = this.f1212b;
        if (dVar != null) {
            return dVar.mo2068c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0378d dVar = this.f1212b;
        if (dVar != null) {
            return dVar.mo2069d();
        }
        return null;
    }

    public TextClassifier getTextClassifier() {
        C0397k kVar;
        if (Build.VERSION.SDK_INT >= 28 || (kVar = this.f1214d) == null) {
            return super.getTextClassifier();
        }
        return kVar.mo2180a();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        RichContentReceiverCompat<TextView> richContentReceiverCompat;
        InputConnection a = C0385g.m2015a(super.onCreateInputConnection(editorInfo), editorInfo, this);
        if (a == null || (richContentReceiverCompat = this.f1215e) == null) {
            return a;
        }
        richContentReceiverCompat.populateEditorInfoContentMimeTypes(a, editorInfo);
        return C5859b.m25854a(a, editorInfo, this.f1215e.buildOnCommitContentListener(this));
    }

    public boolean onTextContextMenuItem(int i) {
        ClipData clipData;
        if (this.f1215e == null) {
            return super.onTextContextMenuItem(i);
        }
        if (i != 16908322 && i != 16908337) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            clipData = null;
        } else {
            clipData = clipboardManager.getPrimaryClip();
        }
        if (clipData != null) {
            this.f1215e.onReceive(this, clipData, 0, i == 16908322 ? 0 : 1);
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0378d dVar = this.f1212b;
        if (dVar != null) {
            dVar.mo2071f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0378d dVar = this.f1212b;
        if (dVar != null) {
            dVar.mo2072g(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0624k.m3469s(this, callback));
    }

    public void setRichContentReceiverCompat(RichContentReceiverCompat<TextView> richContentReceiverCompat) {
        this.f1215e = richContentReceiverCompat;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0378d dVar = this.f1212b;
        if (dVar != null) {
            dVar.mo2074i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0378d dVar = this.f1212b;
        if (dVar != null) {
            dVar.mo2075j(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0399l lVar = this.f1213c;
        if (lVar != null) {
            lVar.mo2198q(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0397k kVar;
        if (Build.VERSION.SDK_INT >= 28 || (kVar = this.f1214d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            kVar.mo2181b(textClassifier);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(C0377c0.m1949b(context), attributeSet, i);
        C0373a0.m1942a(this, getContext());
        C0378d dVar = new C0378d(this);
        this.f1212b = dVar;
        dVar.mo2070e(attributeSet, i);
        C0399l lVar = new C0399l(this);
        this.f1213c = lVar;
        lVar.mo2194m(attributeSet, i);
        lVar.mo2184b();
        this.f1214d = new C0397k(this);
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
