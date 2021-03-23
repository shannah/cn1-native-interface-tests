#import <Foundation/Foundation.h>

@interface com_codename1_testnativeinterface_HelloNativeImpl : NSObject {
    int i;
    float f;
    double d;
    NSData* ints;
    NSData* floats;
    NSData* bytes;
    NSData* doubles;
    NSString* str;
    
}

-(int)getInt;
-(float)getFloat;
-(double)getDouble;
-(NSData*)getBytes;
-(void)setInt:(int)param;
-(float)setFloat:(float)param;
-(void)setDouble:(double)param;
-(void)setInts:(NSData*)param;
-(NSData*)getInts;
-(void)setBytes:(NSData*)param;
-(NSData*)getFloats;
-(void)setDoubles:(NSData*)param;
-(void)setFloats:(NSData*)param;
-(NSData*)getDoubles;
-(NSString*)getString;
-(BOOL)isSupported;
@end
