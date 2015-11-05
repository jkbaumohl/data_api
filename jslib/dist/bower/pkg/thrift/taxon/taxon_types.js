/*global define */
/*jslint white:true */
define(["thrift"], function (Thrift) {
"use strict";
//
// Autogenerated by Thrift Compiler (0.9.2)
//
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
//


var taxon = {};

taxon.ServiceException = function(args) {
  this.message = null;
  this.stacktrace = null;
  this.method = null;
  this.inputs = null;
  if (args) {
    if (args.message !== undefined) {
      this.message = args.message;
    }
    if (args.stacktrace !== undefined) {
      this.stacktrace = args.stacktrace;
    }
    if (args.method !== undefined) {
      this.method = args.method;
    }
    if (args.inputs !== undefined) {
      this.inputs = args.inputs;
    }
  }
};
Thrift.inherits(taxon.ServiceException, Thrift.TException);
taxon.ServiceException.prototype.name = 'ServiceException';
taxon.ServiceException.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype === Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype === Thrift.Type.STRING) {
        this.message = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype === Thrift.Type.STRING) {
        this.stacktrace = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype === Thrift.Type.STRING) {
        this.method = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype === Thrift.Type.MAP) {
        var _size0 = 0;
        var _rtmp34;
        this.inputs = {};
        var _ktype1 = 0;
        var _vtype2 = 0;
        _rtmp34 = input.readMapBegin();
        _ktype1 = _rtmp34.ktype;
        _vtype2 = _rtmp34.vtype;
        _size0 = _rtmp34.size;
        for (var _i5 = 0; _i5 < _size0; ++_i5)
        {
          if (_i5 > 0 ) {
            if (input.rstack.length > input.rpos[input.rpos.length -1] + 1) {
              input.rstack.pop();
            }
          }
          var key6 = null;
          var val7 = null;
          key6 = input.readString().value;
          val7 = input.readString().value;
          this.inputs[key6] = val7;
        }
        input.readMapEnd();
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

taxon.ServiceException.prototype.write = function(output) {
  output.writeStructBegin('ServiceException');
  if (this.message !== null && this.message !== undefined) {
    output.writeFieldBegin('message', Thrift.Type.STRING, 1);
    output.writeString(this.message);
    output.writeFieldEnd();
  }
  if (this.stacktrace !== null && this.stacktrace !== undefined) {
    output.writeFieldBegin('stacktrace', Thrift.Type.STRING, 2);
    output.writeString(this.stacktrace);
    output.writeFieldEnd();
  }
  if (this.method !== null && this.method !== undefined) {
    output.writeFieldBegin('method', Thrift.Type.STRING, 3);
    output.writeString(this.method);
    output.writeFieldEnd();
  }
  if (this.inputs !== null && this.inputs !== undefined) {
    output.writeFieldBegin('inputs', Thrift.Type.MAP, 4);
    output.writeMapBegin(Thrift.Type.STRING, Thrift.Type.STRING, Thrift.objectLength(this.inputs));
    for (var kiter8 in this.inputs)
    {
      if (this.inputs.hasOwnProperty(kiter8))
      {
        var viter9 = this.inputs[kiter8];
        output.writeString(kiter8);
        output.writeString(viter9);
      }
    }
    output.writeMapEnd();
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

taxon.VERSION = '0.0.1';

return taxon;
});