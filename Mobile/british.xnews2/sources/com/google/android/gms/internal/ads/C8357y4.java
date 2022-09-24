package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.y4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class C8357y4 extends X509Certificate {

    /* renamed from: b */
    private final X509Certificate f41691b;

    public C8357y4(X509Certificate x509Certificate) {
        this.f41691b = x509Certificate;
    }

    public final void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
        this.f41691b.checkValidity();
    }

    public final int getBasicConstraints() {
        return this.f41691b.getBasicConstraints();
    }

    public final Set<String> getCriticalExtensionOIDs() {
        return this.f41691b.getCriticalExtensionOIDs();
    }

    public final byte[] getExtensionValue(String str) {
        return this.f41691b.getExtensionValue(str);
    }

    public final Principal getIssuerDN() {
        return this.f41691b.getIssuerDN();
    }

    public final boolean[] getIssuerUniqueID() {
        return this.f41691b.getIssuerUniqueID();
    }

    public final boolean[] getKeyUsage() {
        return this.f41691b.getKeyUsage();
    }

    public final Set<String> getNonCriticalExtensionOIDs() {
        return this.f41691b.getNonCriticalExtensionOIDs();
    }

    public final Date getNotAfter() {
        return this.f41691b.getNotAfter();
    }

    public final Date getNotBefore() {
        return this.f41691b.getNotBefore();
    }

    public final PublicKey getPublicKey() {
        return this.f41691b.getPublicKey();
    }

    public final BigInteger getSerialNumber() {
        return this.f41691b.getSerialNumber();
    }

    public final String getSigAlgName() {
        return this.f41691b.getSigAlgName();
    }

    public final String getSigAlgOID() {
        return this.f41691b.getSigAlgOID();
    }

    public final byte[] getSigAlgParams() {
        return this.f41691b.getSigAlgParams();
    }

    public final byte[] getSignature() {
        return this.f41691b.getSignature();
    }

    public final Principal getSubjectDN() {
        return this.f41691b.getSubjectDN();
    }

    public final boolean[] getSubjectUniqueID() {
        return this.f41691b.getSubjectUniqueID();
    }

    public final byte[] getTBSCertificate() throws CertificateEncodingException {
        return this.f41691b.getTBSCertificate();
    }

    public final int getVersion() {
        return this.f41691b.getVersion();
    }

    public final boolean hasUnsupportedCriticalExtension() {
        return this.f41691b.hasUnsupportedCriticalExtension();
    }

    public final String toString() {
        return this.f41691b.toString();
    }

    public final void verify(PublicKey publicKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.f41691b.verify(publicKey);
    }

    public final void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
        this.f41691b.checkValidity(date);
    }

    public final void verify(PublicKey publicKey, String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.f41691b.verify(publicKey, str);
    }
}
