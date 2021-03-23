namespace com.codename1.testnativeinterface{


public class HelloNativeImpl : IHelloNativeImpl {
    private int i;
    private float f;
    private double d;
    private string str;
    private byte[] bytes;
    private float[] floats;
    private double[] doubles;
    private int[] ints;

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
        return bytes;
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
        ints = param;
    }

    public int[] getInts() {
        return ints;
    }

    public void setBytes(byte[] param) {
        bytes = param;
    }

    public float[] getFloats() {
        return floats;
    }

    public void setDoubles(double[] param) {
        doubles = param;
    }

    public void setFloats(float[] param) {
        floats = param;
    }

    public double[] getDoubles() {

        return doubles;
    }

    public string  getString() {
        return "hello";
    }

    public bool isSupported() {
        return true;
    }

}
}
