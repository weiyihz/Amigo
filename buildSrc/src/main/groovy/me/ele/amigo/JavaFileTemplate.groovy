package me.ele.amigo

class JavaFileTemplate {

    String application

    String packageName

    def getContent() {
        return """
package ${packageName};

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

public class acd {
    public static final String n = "$application";
}
"""
    }
}