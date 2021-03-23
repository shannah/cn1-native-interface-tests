/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.testnativeinterface;

import com.codename1.system.NativeLookup;
import com.codename1.testing.AbstractTest;

/**
 *
 * @author shannah
 */
public class HelloNativeTest extends AbstractTest {

    @Override
    public boolean runTest() throws Exception {
        HelloNative hello = NativeLookup.create(HelloNative.class);
        hello.setInt(10);
        assertEqual(10, hello.getInt());
        hello.setInt(-10);
        assertEqual(-10, hello.getInt());
        
        hello.setFloat(10);
        assertEqual(10, Math.round(hello.getFloat()));
        
        hello.setFloat(-5.5f);
        assertEqual(-55, Math.round(10*hello.getFloat()));
        
        hello.setDouble(10);
        assertEqual(10, Math.round(hello.getDouble()));
        hello.setDouble(-6.5);
        assertEqual(-65, Math.round(10*hello.getDouble()));
        
        assertEqual("hello", hello.getString());
        
        hello.setBytes(new byte[]{1, 2, 3});
        assertArrayEqual(new byte[]{1, 2, 3}, hello.getBytes());
        
        hello.setInts(new int[]{1, 2, 3});
        assertArrayEqual(new int[]{1, 2, 3}, hello.getInts());
        
        return true;
        
        
        
        
    }
    
}
