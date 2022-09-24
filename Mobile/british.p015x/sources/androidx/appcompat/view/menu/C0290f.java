package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.C0252a;
import androidx.appcompat.view.menu.C0296j;
import p073f.C5244g;

/* renamed from: androidx.appcompat.view.menu.f */
/* compiled from: MenuDialogHelper */
class C0290f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C0296j.C0297a {

    /* renamed from: b */
    private C0287e f989b;

    /* renamed from: c */
    private C0252a f990c;

    /* renamed from: d */
    C0284c f991d;

    /* renamed from: e */
    private C0296j.C0297a f992e;

    public C0290f(C0287e eVar) {
        this.f989b = eVar;
    }

    /* renamed from: a */
    public void mo1166a() {
        C0252a aVar = this.f990c;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: b */
    public void mo877b(C0287e eVar, boolean z) {
        if (z || eVar == this.f989b) {
            mo1166a();
        }
        C0296j.C0297a aVar = this.f992e;
        if (aVar != null) {
            aVar.mo877b(eVar, z);
        }
    }

    /* renamed from: c */
    public boolean mo878c(C0287e eVar) {
        C0296j.C0297a aVar = this.f992e;
        if (aVar != null) {
            return aVar.mo878c(eVar);
        }
        return false;
    }

    /* renamed from: d */
    public void mo1167d(IBinder iBinder) {
        C0287e eVar = this.f989b;
        C0252a.C0253a aVar = new C0252a.C0253a(eVar.mo1162w());
        C0284c cVar = new C0284c(aVar.getContext(), C5244g.f22951l);
        this.f991d = cVar;
        cVar.mo1031g(this);
        this.f989b.mo1124b(this.f991d);
        aVar.mo908a(this.f991d.mo1069a(), this);
        View A = eVar.mo1090A();
        if (A != null) {
            aVar.mo909b(A);
        } else {
            aVar.mo910c(eVar.mo1164y()).setTitle(eVar.mo1165z());
        }
        aVar.mo912d(this);
        C0252a create = aVar.create();
        this.f990c = create;
        create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f990c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f990c.show();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f989b.mo1102N((C0291g) this.f991d.mo1069a().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f991d.mo1027b(this.f989b, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f990c.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f990c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f989b.mo1133e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f989b.performShortcut(i, keyEvent, 0);
    }
}
