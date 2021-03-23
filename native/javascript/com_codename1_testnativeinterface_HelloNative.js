(function(exports){

var o = {};

    o.getInt_ = function(callback) {
        callback.complete(this.i||0);
    };

    o.getFloat_ = function(callback) {
        callback.complete(this.f||0);
    };

    o.getDouble_ = function(callback) {
        callback.complete(this.d||0);
    };

    o.getBytes_ = function(callback) {
        callback.complete(this.bs||null)
    };

    o.setInt__int = function(param1, callback) {
        this.i = param1;
        callback.complete(null);
    };

    o.setFloat__float = function(param1, callback) {
        var old = this.f ||0;
        this.f = param1;
        callback.complete(old);
    };

    o.setDouble__double = function(param1, callback) {
        this.d = param1;
        callback.complete(null);
    };

    o.setInts__int_1ARRAY = function(param1, callback) {
        this.ints = param1;
        callback.complete(null);
    };

    o.getInts_ = function(callback) {
        callback.error(new Error("Not implemented yet"));
    };

    o.setBytes__byte_1ARRAY = function(param1, callback) {
        this.bytes = param1;
        callback.complete(null);
    };

    o.getFloats_ = function(callback) {
        callback.complete(this.floats||null);
    };

    o.setDoubles__double_1ARRAY = function(param1, callback) {
        this.doubles = param1;
        callback.complete(null);
    };

    o.setFloats__float_1ARRAY = function(param1, callback) {
        this.floats = param1;
        callback.complete(null);
    };

    o.getDoubles_ = function(callback) {
        callback.complete(this.doubles||null);
    };

    o.getString_ = function(callback) {
        callback.complete("hello");
    };

    o.isSupported_ = function(callback) {
        callback.complete(true);
    };

exports.com_codename1_testnativeinterface_HelloNative= o;

})(cn1_get_native_interfaces());
