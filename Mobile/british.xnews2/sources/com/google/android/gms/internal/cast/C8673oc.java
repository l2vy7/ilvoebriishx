package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.C8673oc;
import com.google.android.gms.internal.cast.C8705qc;

/* renamed from: com.google.android.gms.internal.cast.oc */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class C8673oc<MessageType extends C8705qc<MessageType, BuilderType>, BuilderType extends C8673oc<MessageType, BuilderType>> extends C8591jb<MessageType, BuilderType> {

    /* renamed from: b */
    private final MessageType f43876b;

    /* renamed from: c */
    protected MessageType f43877c;

    /* renamed from: d */
    protected boolean f43878d = false;

    protected C8673oc(MessageType messagetype) {
        this.f43876b = messagetype;
        this.f43877c = (C8705qc) messagetype.mo36369d(4, (Object) null, (Object) null);
    }

    /* renamed from: c */
    private static final void m41190c(MessageType messagetype, MessageType messagetype2) {
        C8511ee.m40831a().mo36471b(messagetype.getClass()).mo36371b(messagetype, messagetype2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C8591jb mo36565b(C8608kb kbVar) {
        mo36635k((C8705qc) kbVar);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo36631d() {
        MessageType messagetype = (C8705qc) this.f43877c.mo36369d(4, (Object) null, (Object) null);
        m41190c(messagetype, this.f43877c);
        this.f43877c = messagetype;
    }

    /* renamed from: g */
    public final BuilderType clone() {
        BuilderType buildertype = (C8673oc) this.f43876b.mo36369d(5, (Object) null, (Object) null);
        buildertype.mo36635k(zzr());
        return buildertype;
    }

    /* renamed from: h */
    public MessageType zzr() {
        if (this.f43878d) {
            return this.f43877c;
        }
        MessageType messagetype = this.f43877c;
        C8511ee.m40831a().mo36471b(messagetype.getClass()).mo36373d(messagetype);
        this.f43878d = true;
        return this.f43877c;
    }

    /* renamed from: i */
    public final MessageType mo36634i() {
        MessageType h = zzr();
        boolean z = true;
        byte byteValue = ((Byte) h.mo36369d(1, (Object) null, (Object) null)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z = false;
            } else {
                boolean a = C8511ee.m40831a().mo36471b(h.getClass()).mo36370a(h);
                h.mo36369d(2, true != a ? null : h, (Object) null);
                z = a;
            }
        }
        if (z) {
            return h;
        }
        throw new C8768ue(h);
    }

    /* renamed from: k */
    public final BuilderType mo36635k(MessageType messagetype) {
        if (this.f43878d) {
            mo36631d();
            this.f43878d = false;
        }
        m41190c(this.f43877c, messagetype);
        return this;
    }

    public final /* bridge */ /* synthetic */ C8782vd zzs() {
        return this.f43876b;
    }
}
