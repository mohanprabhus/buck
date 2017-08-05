/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-07-19")
public class BuildModeInfo implements org.apache.thrift.TBase<BuildModeInfo, BuildModeInfo._Fields>, java.io.Serializable, Cloneable, Comparable<BuildModeInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuildModeInfo");

  private static final org.apache.thrift.protocol.TField MODE_FIELD_DESC = new org.apache.thrift.protocol.TField("mode", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NUMBER_OF_MINIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("numberOfMinions", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField COORDINATOR_ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("coordinatorAddress", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField COORDINATOR_PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("coordinatorPort", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BuildModeInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BuildModeInfoTupleSchemeFactory());
  }

  /**
   * 
   * @see BuildMode
   */
  public BuildMode mode; // optional
  public int numberOfMinions; // optional
  public String coordinatorAddress; // optional
  public int coordinatorPort; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see BuildMode
     */
    MODE((short)1, "mode"),
    NUMBER_OF_MINIONS((short)2, "numberOfMinions"),
    COORDINATOR_ADDRESS((short)3, "coordinatorAddress"),
    COORDINATOR_PORT((short)4, "coordinatorPort");

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
        case 1: // MODE
          return MODE;
        case 2: // NUMBER_OF_MINIONS
          return NUMBER_OF_MINIONS;
        case 3: // COORDINATOR_ADDRESS
          return COORDINATOR_ADDRESS;
        case 4: // COORDINATOR_PORT
          return COORDINATOR_PORT;
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
  private static final int __NUMBEROFMINIONS_ISSET_ID = 0;
  private static final int __COORDINATORPORT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.MODE,_Fields.NUMBER_OF_MINIONS,_Fields.COORDINATOR_ADDRESS,_Fields.COORDINATOR_PORT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MODE, new org.apache.thrift.meta_data.FieldMetaData("mode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, BuildMode.class)));
    tmpMap.put(_Fields.NUMBER_OF_MINIONS, new org.apache.thrift.meta_data.FieldMetaData("numberOfMinions", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.COORDINATOR_ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("coordinatorAddress", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COORDINATOR_PORT, new org.apache.thrift.meta_data.FieldMetaData("coordinatorPort", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuildModeInfo.class, metaDataMap);
  }

  public BuildModeInfo() {
    this.mode = com.facebook.buck.distributed.thrift.BuildMode.UNKNOWN;

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuildModeInfo(BuildModeInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMode()) {
      this.mode = other.mode;
    }
    this.numberOfMinions = other.numberOfMinions;
    if (other.isSetCoordinatorAddress()) {
      this.coordinatorAddress = other.coordinatorAddress;
    }
    this.coordinatorPort = other.coordinatorPort;
  }

  public BuildModeInfo deepCopy() {
    return new BuildModeInfo(this);
  }

  @Override
  public void clear() {
    this.mode = com.facebook.buck.distributed.thrift.BuildMode.UNKNOWN;

    setNumberOfMinionsIsSet(false);
    this.numberOfMinions = 0;
    this.coordinatorAddress = null;
    setCoordinatorPortIsSet(false);
    this.coordinatorPort = 0;
  }

  /**
   * 
   * @see BuildMode
   */
  public BuildMode getMode() {
    return this.mode;
  }

  /**
   * 
   * @see BuildMode
   */
  public BuildModeInfo setMode(BuildMode mode) {
    this.mode = mode;
    return this;
  }

  public void unsetMode() {
    this.mode = null;
  }

  /** Returns true if field mode is set (has been assigned a value) and false otherwise */
  public boolean isSetMode() {
    return this.mode != null;
  }

  public void setModeIsSet(boolean value) {
    if (!value) {
      this.mode = null;
    }
  }

  public int getNumberOfMinions() {
    return this.numberOfMinions;
  }

  public BuildModeInfo setNumberOfMinions(int numberOfMinions) {
    this.numberOfMinions = numberOfMinions;
    setNumberOfMinionsIsSet(true);
    return this;
  }

  public void unsetNumberOfMinions() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUMBEROFMINIONS_ISSET_ID);
  }

  /** Returns true if field numberOfMinions is set (has been assigned a value) and false otherwise */
  public boolean isSetNumberOfMinions() {
    return EncodingUtils.testBit(__isset_bitfield, __NUMBEROFMINIONS_ISSET_ID);
  }

  public void setNumberOfMinionsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUMBEROFMINIONS_ISSET_ID, value);
  }

  public String getCoordinatorAddress() {
    return this.coordinatorAddress;
  }

  public BuildModeInfo setCoordinatorAddress(String coordinatorAddress) {
    this.coordinatorAddress = coordinatorAddress;
    return this;
  }

  public void unsetCoordinatorAddress() {
    this.coordinatorAddress = null;
  }

  /** Returns true if field coordinatorAddress is set (has been assigned a value) and false otherwise */
  public boolean isSetCoordinatorAddress() {
    return this.coordinatorAddress != null;
  }

  public void setCoordinatorAddressIsSet(boolean value) {
    if (!value) {
      this.coordinatorAddress = null;
    }
  }

  public int getCoordinatorPort() {
    return this.coordinatorPort;
  }

  public BuildModeInfo setCoordinatorPort(int coordinatorPort) {
    this.coordinatorPort = coordinatorPort;
    setCoordinatorPortIsSet(true);
    return this;
  }

  public void unsetCoordinatorPort() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COORDINATORPORT_ISSET_ID);
  }

  /** Returns true if field coordinatorPort is set (has been assigned a value) and false otherwise */
  public boolean isSetCoordinatorPort() {
    return EncodingUtils.testBit(__isset_bitfield, __COORDINATORPORT_ISSET_ID);
  }

  public void setCoordinatorPortIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COORDINATORPORT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MODE:
      if (value == null) {
        unsetMode();
      } else {
        setMode((BuildMode)value);
      }
      break;

    case NUMBER_OF_MINIONS:
      if (value == null) {
        unsetNumberOfMinions();
      } else {
        setNumberOfMinions((Integer)value);
      }
      break;

    case COORDINATOR_ADDRESS:
      if (value == null) {
        unsetCoordinatorAddress();
      } else {
        setCoordinatorAddress((String)value);
      }
      break;

    case COORDINATOR_PORT:
      if (value == null) {
        unsetCoordinatorPort();
      } else {
        setCoordinatorPort((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MODE:
      return getMode();

    case NUMBER_OF_MINIONS:
      return getNumberOfMinions();

    case COORDINATOR_ADDRESS:
      return getCoordinatorAddress();

    case COORDINATOR_PORT:
      return getCoordinatorPort();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MODE:
      return isSetMode();
    case NUMBER_OF_MINIONS:
      return isSetNumberOfMinions();
    case COORDINATOR_ADDRESS:
      return isSetCoordinatorAddress();
    case COORDINATOR_PORT:
      return isSetCoordinatorPort();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BuildModeInfo)
      return this.equals((BuildModeInfo)that);
    return false;
  }

  public boolean equals(BuildModeInfo that) {
    if (that == null)
      return false;

    boolean this_present_mode = true && this.isSetMode();
    boolean that_present_mode = true && that.isSetMode();
    if (this_present_mode || that_present_mode) {
      if (!(this_present_mode && that_present_mode))
        return false;
      if (!this.mode.equals(that.mode))
        return false;
    }

    boolean this_present_numberOfMinions = true && this.isSetNumberOfMinions();
    boolean that_present_numberOfMinions = true && that.isSetNumberOfMinions();
    if (this_present_numberOfMinions || that_present_numberOfMinions) {
      if (!(this_present_numberOfMinions && that_present_numberOfMinions))
        return false;
      if (this.numberOfMinions != that.numberOfMinions)
        return false;
    }

    boolean this_present_coordinatorAddress = true && this.isSetCoordinatorAddress();
    boolean that_present_coordinatorAddress = true && that.isSetCoordinatorAddress();
    if (this_present_coordinatorAddress || that_present_coordinatorAddress) {
      if (!(this_present_coordinatorAddress && that_present_coordinatorAddress))
        return false;
      if (!this.coordinatorAddress.equals(that.coordinatorAddress))
        return false;
    }

    boolean this_present_coordinatorPort = true && this.isSetCoordinatorPort();
    boolean that_present_coordinatorPort = true && that.isSetCoordinatorPort();
    if (this_present_coordinatorPort || that_present_coordinatorPort) {
      if (!(this_present_coordinatorPort && that_present_coordinatorPort))
        return false;
      if (this.coordinatorPort != that.coordinatorPort)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_mode = true && (isSetMode());
    list.add(present_mode);
    if (present_mode)
      list.add(mode.getValue());

    boolean present_numberOfMinions = true && (isSetNumberOfMinions());
    list.add(present_numberOfMinions);
    if (present_numberOfMinions)
      list.add(numberOfMinions);

    boolean present_coordinatorAddress = true && (isSetCoordinatorAddress());
    list.add(present_coordinatorAddress);
    if (present_coordinatorAddress)
      list.add(coordinatorAddress);

    boolean present_coordinatorPort = true && (isSetCoordinatorPort());
    list.add(present_coordinatorPort);
    if (present_coordinatorPort)
      list.add(coordinatorPort);

    return list.hashCode();
  }

  @Override
  public int compareTo(BuildModeInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMode()).compareTo(other.isSetMode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mode, other.mode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNumberOfMinions()).compareTo(other.isSetNumberOfMinions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumberOfMinions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.numberOfMinions, other.numberOfMinions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCoordinatorAddress()).compareTo(other.isSetCoordinatorAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCoordinatorAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.coordinatorAddress, other.coordinatorAddress);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCoordinatorPort()).compareTo(other.isSetCoordinatorPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCoordinatorPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.coordinatorPort, other.coordinatorPort);
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
    StringBuilder sb = new StringBuilder("BuildModeInfo(");
    boolean first = true;

    if (isSetMode()) {
      sb.append("mode:");
      if (this.mode == null) {
        sb.append("null");
      } else {
        sb.append(this.mode);
      }
      first = false;
    }
    if (isSetNumberOfMinions()) {
      if (!first) sb.append(", ");
      sb.append("numberOfMinions:");
      sb.append(this.numberOfMinions);
      first = false;
    }
    if (isSetCoordinatorAddress()) {
      if (!first) sb.append(", ");
      sb.append("coordinatorAddress:");
      if (this.coordinatorAddress == null) {
        sb.append("null");
      } else {
        sb.append(this.coordinatorAddress);
      }
      first = false;
    }
    if (isSetCoordinatorPort()) {
      if (!first) sb.append(", ");
      sb.append("coordinatorPort:");
      sb.append(this.coordinatorPort);
      first = false;
    }
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BuildModeInfoStandardSchemeFactory implements SchemeFactory {
    public BuildModeInfoStandardScheme getScheme() {
      return new BuildModeInfoStandardScheme();
    }
  }

  private static class BuildModeInfoStandardScheme extends StandardScheme<BuildModeInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuildModeInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.mode = com.facebook.buck.distributed.thrift.BuildMode.findByValue(iprot.readI32());
              struct.setModeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NUMBER_OF_MINIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.numberOfMinions = iprot.readI32();
              struct.setNumberOfMinionsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COORDINATOR_ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.coordinatorAddress = iprot.readString();
              struct.setCoordinatorAddressIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // COORDINATOR_PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.coordinatorPort = iprot.readI32();
              struct.setCoordinatorPortIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuildModeInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.mode != null) {
        if (struct.isSetMode()) {
          oprot.writeFieldBegin(MODE_FIELD_DESC);
          oprot.writeI32(struct.mode.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetNumberOfMinions()) {
        oprot.writeFieldBegin(NUMBER_OF_MINIONS_FIELD_DESC);
        oprot.writeI32(struct.numberOfMinions);
        oprot.writeFieldEnd();
      }
      if (struct.coordinatorAddress != null) {
        if (struct.isSetCoordinatorAddress()) {
          oprot.writeFieldBegin(COORDINATOR_ADDRESS_FIELD_DESC);
          oprot.writeString(struct.coordinatorAddress);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetCoordinatorPort()) {
        oprot.writeFieldBegin(COORDINATOR_PORT_FIELD_DESC);
        oprot.writeI32(struct.coordinatorPort);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuildModeInfoTupleSchemeFactory implements SchemeFactory {
    public BuildModeInfoTupleScheme getScheme() {
      return new BuildModeInfoTupleScheme();
    }
  }

  private static class BuildModeInfoTupleScheme extends TupleScheme<BuildModeInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuildModeInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMode()) {
        optionals.set(0);
      }
      if (struct.isSetNumberOfMinions()) {
        optionals.set(1);
      }
      if (struct.isSetCoordinatorAddress()) {
        optionals.set(2);
      }
      if (struct.isSetCoordinatorPort()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetMode()) {
        oprot.writeI32(struct.mode.getValue());
      }
      if (struct.isSetNumberOfMinions()) {
        oprot.writeI32(struct.numberOfMinions);
      }
      if (struct.isSetCoordinatorAddress()) {
        oprot.writeString(struct.coordinatorAddress);
      }
      if (struct.isSetCoordinatorPort()) {
        oprot.writeI32(struct.coordinatorPort);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuildModeInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.mode = com.facebook.buck.distributed.thrift.BuildMode.findByValue(iprot.readI32());
        struct.setModeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.numberOfMinions = iprot.readI32();
        struct.setNumberOfMinionsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.coordinatorAddress = iprot.readString();
        struct.setCoordinatorAddressIsSet(true);
      }
      if (incoming.get(3)) {
        struct.coordinatorPort = iprot.readI32();
        struct.setCoordinatorPortIsSet(true);
      }
    }
  }

}
