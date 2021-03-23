#import "com_codename1_testnativeinterface_HelloNativeImpl.h"

@implementation com_codename1_testnativeinterface_HelloNativeImpl

-(int)getInt{
    return i;
}

-(float)getFloat{
    return f;
}

-(double)getDouble{
    return d;
}

-(NSData*)getBytes{
    return bytes;
}

-(void)setInt:(int)param{
    i = param;
}

-(float)setFloat:(float)param{
    float old = f;
    f = param;
    return old;
}

-(void)setDouble:(double)param{
    d = param;
}

-(void)setInts:(NSData*)param{
    if (ints != nil) {
        [ints release];
    }
    ints = param;
    if (ints != nil) {
        [ints retain];
    }
}

-(NSData*)getInts{
    return ints;
}

-(void)setBytes:(NSData*)param{
    if (bytes != nil) {
        [bytes release];
    }
    bytes = param;
    if (bytes != nil) {
        [bytes retain];
    }
}

-(NSData*)getFloats{
    return floats;
}

-(void)setDoubles:(NSData*)param{
    if (doubles != nil) {
        [doubles release];
    }
    doubles = param;
    if (doubles != nil) {
        [doubles retain];
    }
}

-(void)setFloats:(NSData*)param{
    if (floats != nil) {
        [floats release];
    }
    floats = param;
    if (floats != nil) {
        [floats retain];
    }
}

-(NSData*)getDoubles{
    return doubles;
}

-(NSString*)getString{
    if (str == nil) {
        str = @"hello";
    }
    return str;
}

-(BOOL)isSupported{
    return YES;
}

@end
