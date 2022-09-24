package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import p104l0.C5648h;

/* renamed from: androidx.appcompat.widget.k */
/* compiled from: AppCompatTextClassifierHelper */
final class C0397k {

    /* renamed from: a */
    private TextView f1618a;

    /* renamed from: b */
    private TextClassifier f1619b;

    C0397k(TextView textView) {
        this.f1618a = (TextView) C5648h.m24964c(textView);
    }

    /* renamed from: a */
    public TextClassifier mo2180a() {
        TextClassifier textClassifier = this.f1619b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1618a.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }

    /* renamed from: b */
    public void mo2181b(TextClassifier textClassifier) {
        this.f1619b = textClassifier;
    }
}
