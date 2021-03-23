/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.testnativeinterface;

import com.codename1.system.NativeInterface;

/**
 *
 * @author shannah
 */
public interface HelloNative extends NativeInterface {
    public int getInt();
    public void setInt(int i);
    public float getFloat();
    public float setFloat(float f);
    public double getDouble();
    public void setDouble(double d);
    public String getString();
    public void setBytes(byte[] b);
    public byte[] getBytes();
    public int[] getInts();
    public void setInts(int[] i);
    public float[] getFloats();
    public void setFloats(float[] f);
    public double[] getDoubles();
    public void setDoubles(double[] d);
    
}
