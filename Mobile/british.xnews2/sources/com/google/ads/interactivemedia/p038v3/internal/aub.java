package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aub */
/* compiled from: IMASDK */
public class aub<K, V> extends auj<K, V> implements auq<K, V> {
    private static final long serialVersionUID = 0;

    aub(aue<K, atz<V>> aue, int i) {
        super(aue, i);
    }

    /* renamed from: a */
    public static <K, V> aua<K, V> m14829a() {
        return new aua<>();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            auc b = aue.m14837b();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    atv s = atz.m14815s();
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        s.mo14514d(objectInputStream.readObject());
                    }
                    b.mo14540b(readObject, s.mo14513c());
                    i2 += readInt2;
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder(31);
                    sb.append("Invalid value count ");
                    sb.append(readInt2);
                    throw new InvalidObjectException(sb.toString());
                }
            }
            try {
                auh.f15759a.mo14621a(this, b.mo14539a());
                auh.f15760b.mo14622b(this, i2);
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        } else {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Invalid key count ");
            sb2.append(readInt);
            throw new InvalidObjectException(sb2.toString());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(mo14398y().size());
        for (Map.Entry entry : mo14398y().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            for (Object writeObject : (Collection) entry.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }

    /* renamed from: b */
    public final atz<V> mo14538b(K k) {
        atz<V> atz = (atz) this.f15762b.get(k);
        return atz == null ? atz.m14807i() : atz;
    }
}
