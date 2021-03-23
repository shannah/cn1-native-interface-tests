package com.codename1.testnativeinterface;

public class HelloNativeImpl implements com.codename1.testnativeinterface.HelloNative{
    
    private int i;
    private byte b;
    private float f;
    private String s = "hello";
    private double d;
    private byte[] bs;
    private float[] fs;
    private double[] ds;
    private int[] is;
    
    public int getInt() {
        return i;
    }

    public float getFloat() {
        return f;
    }

    public double getDouble() {
        return d;
    }

    public byte[] getBytes() {
        return bs;
    }

    public void setInt(int param) {
        i = param;
    }

    public float setFloat(float param) {
        float old = f;
        f = param;
        return old;
    }

    public void setDouble(double param) {
        d = param;
    }

    public void setInts(int[] param) {
        is = param;
    }

    public int[] getInts() {
        return is;
    }

    public void setBytes(byte[] param) {
        bs = param;
    }

    public float[] getFloats() {
        return fs;
    }

    public void setDoubles(double[] param) {
        ds = param;
    }

    public void setFloats(float[] param) {
        fs = param;
    }

    public double[] getDoubles() {
        return ds;
    }

    public String getString() {
        return s;
    }

    public boolean isSupported() {
        return true;
    }

}
