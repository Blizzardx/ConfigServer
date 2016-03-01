/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.example.upload.tools.auto;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VersionConfig implements org.apache.thrift.TBase<VersionConfig, VersionConfig._Fields>, java.io.Serializable, Cloneable, Comparable<VersionConfig> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("VersionConfig");

  private static final org.apache.thrift.protocol.TField VERSION_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("versionList", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new VersionConfigStandardSchemeFactory());
    schemes.put(TupleScheme.class, new VersionConfigTupleSchemeFactory());
  }

  public List<VersionConfigElement> versionList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    VERSION_LIST((short)1, "versionList");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // VERSION_LIST
          return VERSION_LIST;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VERSION_LIST, new org.apache.thrift.meta_data.FieldMetaData("versionList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, VersionConfigElement.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(VersionConfig.class, metaDataMap);
  }

  public VersionConfig() {
  }

  public VersionConfig(
    List<VersionConfigElement> versionList)
  {
    this();
    this.versionList = versionList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public VersionConfig(VersionConfig other) {
    if (other.isSetVersionList()) {
      List<VersionConfigElement> __this__versionList = new ArrayList<VersionConfigElement>(other.versionList.size());
      for (VersionConfigElement other_element : other.versionList) {
        __this__versionList.add(new VersionConfigElement(other_element));
      }
      this.versionList = __this__versionList;
    }
  }

  public VersionConfig deepCopy() {
    return new VersionConfig(this);
  }

  @Override
  public void clear() {
    this.versionList = null;
  }

  public int getVersionListSize() {
    return (this.versionList == null) ? 0 : this.versionList.size();
  }

  public java.util.Iterator<VersionConfigElement> getVersionListIterator() {
    return (this.versionList == null) ? null : this.versionList.iterator();
  }

  public void addToVersionList(VersionConfigElement elem) {
    if (this.versionList == null) {
      this.versionList = new ArrayList<VersionConfigElement>();
    }
    this.versionList.add(elem);
  }

  public List<VersionConfigElement> getVersionList() {
    return this.versionList;
  }

  public VersionConfig setVersionList(List<VersionConfigElement> versionList) {
    this.versionList = versionList;
    return this;
  }

  public void unsetVersionList() {
    this.versionList = null;
  }

  /** Returns true if field versionList is set (has been assigned a value) and false otherwise */
  public boolean isSetVersionList() {
    return this.versionList != null;
  }

  public void setVersionListIsSet(boolean value) {
    if (!value) {
      this.versionList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VERSION_LIST:
      if (value == null) {
        unsetVersionList();
      } else {
        setVersionList((List<VersionConfigElement>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VERSION_LIST:
      return getVersionList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case VERSION_LIST:
      return isSetVersionList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof VersionConfig)
      return this.equals((VersionConfig)that);
    return false;
  }

  public boolean equals(VersionConfig that) {
    if (that == null)
      return false;

    boolean this_present_versionList = true && this.isSetVersionList();
    boolean that_present_versionList = true && that.isSetVersionList();
    if (this_present_versionList || that_present_versionList) {
      if (!(this_present_versionList && that_present_versionList))
        return false;
      if (!this.versionList.equals(that.versionList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(VersionConfig other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetVersionList()).compareTo(other.isSetVersionList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersionList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.versionList, other.versionList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("VersionConfig(");
    boolean first = true;

    sb.append("versionList:");
    if (this.versionList == null) {
      sb.append("null");
    } else {
      sb.append(this.versionList);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class VersionConfigStandardSchemeFactory implements SchemeFactory {
    public VersionConfigStandardScheme getScheme() {
      return new VersionConfigStandardScheme();
    }
  }

  private static class VersionConfigStandardScheme extends StandardScheme<VersionConfig> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, VersionConfig struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VERSION_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.versionList = new ArrayList<VersionConfigElement>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  VersionConfigElement _elem2;
                  _elem2 = new VersionConfigElement();
                  _elem2.read(iprot);
                  struct.versionList.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setVersionListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, VersionConfig struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.versionList != null) {
        oprot.writeFieldBegin(VERSION_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.versionList.size()));
          for (VersionConfigElement _iter3 : struct.versionList)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class VersionConfigTupleSchemeFactory implements SchemeFactory {
    public VersionConfigTupleScheme getScheme() {
      return new VersionConfigTupleScheme();
    }
  }

  private static class VersionConfigTupleScheme extends TupleScheme<VersionConfig> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, VersionConfig struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetVersionList()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetVersionList()) {
        {
          oprot.writeI32(struct.versionList.size());
          for (VersionConfigElement _iter4 : struct.versionList)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, VersionConfig struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.versionList = new ArrayList<VersionConfigElement>(_list5.size);
          for (int _i6 = 0; _i6 < _list5.size; ++_i6)
          {
            VersionConfigElement _elem7;
            _elem7 = new VersionConfigElement();
            _elem7.read(iprot);
            struct.versionList.add(_elem7);
          }
        }
        struct.setVersionListIsSet(true);
      }
    }
  }

}
