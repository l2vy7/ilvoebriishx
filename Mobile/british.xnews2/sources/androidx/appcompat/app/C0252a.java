package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import p072f.C5238a;

/* renamed from: androidx.appcompat.app.a */
/* compiled from: AlertDialog */
public class C0252a extends C0256d {

    /* renamed from: d */
    final AlertController f771d = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.a$a */
    /* compiled from: AlertDialog */
    public static class C0253a {

        /* renamed from: a */
        private final AlertController.C0219f f772a;

        /* renamed from: b */
        private final int f773b;

        public C0253a(Context context) {
            this(context, C0252a.m1154g(context, 0));
        }

        /* renamed from: a */
        public C0253a mo908a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0219f fVar = this.f772a;
            fVar.f651w = listAdapter;
            fVar.f652x = onClickListener;
            return this;
        }

        /* renamed from: b */
        public C0253a mo909b(View view) {
            this.f772a.f635g = view;
            return this;
        }

        /* renamed from: c */
        public C0253a mo910c(Drawable drawable) {
            this.f772a.f632d = drawable;
            return this;
        }

        public C0252a create() {
            C0252a aVar = new C0252a(this.f772a.f629a, this.f773b);
            this.f772a.mo753a(aVar.f771d);
            aVar.setCancelable(this.f772a.f646r);
            if (this.f772a.f646r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.f772a.f647s);
            aVar.setOnDismissListener(this.f772a.f648t);
            DialogInterface.OnKeyListener onKeyListener = this.f772a.f649u;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            return aVar;
        }

        /* renamed from: d */
        public C0253a mo912d(DialogInterface.OnKeyListener onKeyListener) {
            this.f772a.f649u = onKeyListener;
            return this;
        }

        /* renamed from: e */
        public C0253a mo913e(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0219f fVar = this.f772a;
            fVar.f651w = listAdapter;
            fVar.f652x = onClickListener;
            fVar.f621I = i;
            fVar.f620H = true;
            return this;
        }

        public Context getContext() {
            return this.f772a.f629a;
        }

        public C0253a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0219f fVar = this.f772a;
            fVar.f640l = fVar.f629a.getText(i);
            this.f772a.f642n = onClickListener;
            return this;
        }

        public C0253a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0219f fVar = this.f772a;
            fVar.f637i = fVar.f629a.getText(i);
            this.f772a.f639k = onClickListener;
            return this;
        }

        public C0253a setTitle(CharSequence charSequence) {
            this.f772a.f634f = charSequence;
            return this;
        }

        public C0253a setView(View view) {
            AlertController.C0219f fVar = this.f772a;
            fVar.f654z = view;
            fVar.f653y = 0;
            fVar.f617E = false;
            return this;
        }

        public C0253a(Context context, int i) {
            this.f772a = new AlertController.C0219f(new ContextThemeWrapper(context, C0252a.m1154g(context, i)));
            this.f773b = i;
        }
    }

    protected C0252a(Context context, int i) {
        super(context, m1154g(context, i));
    }

    /* renamed from: g */
    static int m1154g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C5238a.f22819o, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: f */
    public ListView mo903f() {
        return this.f771d.mo733d();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f771d.mo734e();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f771d.mo735g(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f771d.mo736h(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f771d.mo742q(charSequence);
    }
}
