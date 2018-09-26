/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)")
public class BuildJobStateFileHashes implements org.apache.thrift.TBase<BuildJobStateFileHashes, BuildJobStateFileHashes._Fields>, java.io.Serializable, Cloneable, Comparable<BuildJobStateFileHashes> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuildJobStateFileHashes");

  private static final org.apache.thrift.protocol.TField CELL_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("cellIndex", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ENTRIES_FIELD_DESC = new org.apache.thrift.protocol.TField("entries", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new BuildJobStateFileHashesStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new BuildJobStateFileHashesTupleSchemeFactory();

  public int cellIndex; // optional
  public java.util.List<BuildJobStateFileHashEntry> entries; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CELL_INDEX((short)1, "cellIndex"),
    ENTRIES((short)2, "entries");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CELL_INDEX
          return CELL_INDEX;
        case 2: // ENTRIES
          return ENTRIES;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CELLINDEX_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CELL_INDEX,_Fields.ENTRIES};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CELL_INDEX, new org.apache.thrift.meta_data.FieldMetaData("cellIndex", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ENTRIES, new org.apache.thrift.meta_data.FieldMetaData("entries", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BuildJobStateFileHashEntry.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuildJobStateFileHashes.class, metaDataMap);
  }

  public BuildJobStateFileHashes() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuildJobStateFileHashes(BuildJobStateFileHashes other) {
    __isset_bitfield = other.__isset_bitfield;
    this.cellIndex = other.cellIndex;
    if (other.isSetEntries()) {
      java.util.List<BuildJobStateFileHashEntry> __this__entries = new java.util.ArrayList<BuildJobStateFileHashEntry>(other.entries.size());
      for (BuildJobStateFileHashEntry other_element : other.entries) {
        __this__entries.add(new BuildJobStateFileHashEntry(other_element));
      }
      this.entries = __this__entries;
    }
  }

  public BuildJobStateFileHashes deepCopy() {
    return new BuildJobStateFileHashes(this);
  }

  @Override
  public void clear() {
    setCellIndexIsSet(false);
    this.cellIndex = 0;
    this.entries = null;
  }

  public int getCellIndex() {
    return this.cellIndex;
  }

  public BuildJobStateFileHashes setCellIndex(int cellIndex) {
    this.cellIndex = cellIndex;
    setCellIndexIsSet(true);
    return this;
  }

  public void unsetCellIndex() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CELLINDEX_ISSET_ID);
  }

  /** Returns true if field cellIndex is set (has been assigned a value) and false otherwise */
  public boolean isSetCellIndex() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CELLINDEX_ISSET_ID);
  }

  public void setCellIndexIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CELLINDEX_ISSET_ID, value);
  }

  public int getEntriesSize() {
    return (this.entries == null) ? 0 : this.entries.size();
  }

  public java.util.Iterator<BuildJobStateFileHashEntry> getEntriesIterator() {
    return (this.entries == null) ? null : this.entries.iterator();
  }

  public void addToEntries(BuildJobStateFileHashEntry elem) {
    if (this.entries == null) {
      this.entries = new java.util.ArrayList<BuildJobStateFileHashEntry>();
    }
    this.entries.add(elem);
  }

  public java.util.List<BuildJobStateFileHashEntry> getEntries() {
    return this.entries;
  }

  public BuildJobStateFileHashes setEntries(java.util.List<BuildJobStateFileHashEntry> entries) {
    this.entries = entries;
    return this;
  }

  public void unsetEntries() {
    this.entries = null;
  }

  /** Returns true if field entries is set (has been assigned a value) and false otherwise */
  public boolean isSetEntries() {
    return this.entries != null;
  }

  public void setEntriesIsSet(boolean value) {
    if (!value) {
      this.entries = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case CELL_INDEX:
      if (value == null) {
        unsetCellIndex();
      } else {
        setCellIndex((java.lang.Integer)value);
      }
      break;

    case ENTRIES:
      if (value == null) {
        unsetEntries();
      } else {
        setEntries((java.util.List<BuildJobStateFileHashEntry>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CELL_INDEX:
      return getCellIndex();

    case ENTRIES:
      return getEntries();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CELL_INDEX:
      return isSetCellIndex();
    case ENTRIES:
      return isSetEntries();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof BuildJobStateFileHashes)
      return this.equals((BuildJobStateFileHashes)that);
    return false;
  }

  public boolean equals(BuildJobStateFileHashes that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_cellIndex = true && this.isSetCellIndex();
    boolean that_present_cellIndex = true && that.isSetCellIndex();
    if (this_present_cellIndex || that_present_cellIndex) {
      if (!(this_present_cellIndex && that_present_cellIndex))
        return false;
      if (this.cellIndex != that.cellIndex)
        return false;
    }

    boolean this_present_entries = true && this.isSetEntries();
    boolean that_present_entries = true && that.isSetEntries();
    if (this_present_entries || that_present_entries) {
      if (!(this_present_entries && that_present_entries))
        return false;
      if (!this.entries.equals(that.entries))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCellIndex()) ? 131071 : 524287);
    if (isSetCellIndex())
      hashCode = hashCode * 8191 + cellIndex;

    hashCode = hashCode * 8191 + ((isSetEntries()) ? 131071 : 524287);
    if (isSetEntries())
      hashCode = hashCode * 8191 + entries.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(BuildJobStateFileHashes other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetCellIndex()).compareTo(other.isSetCellIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCellIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cellIndex, other.cellIndex);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEntries()).compareTo(other.isSetEntries());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEntries()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.entries, other.entries);
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
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("BuildJobStateFileHashes(");
    boolean first = true;

    if (isSetCellIndex()) {
      sb.append("cellIndex:");
      sb.append(this.cellIndex);
      first = false;
    }
    if (isSetEntries()) {
      if (!first) sb.append(", ");
      sb.append("entries:");
      if (this.entries == null) {
        sb.append("null");
      } else {
        sb.append(this.entries);
      }
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BuildJobStateFileHashesStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BuildJobStateFileHashesStandardScheme getScheme() {
      return new BuildJobStateFileHashesStandardScheme();
    }
  }

  private static class BuildJobStateFileHashesStandardScheme extends org.apache.thrift.scheme.StandardScheme<BuildJobStateFileHashes> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuildJobStateFileHashes struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CELL_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.cellIndex = iprot.readI32();
              struct.setCellIndexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ENTRIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list44 = iprot.readListBegin();
                struct.entries = new java.util.ArrayList<BuildJobStateFileHashEntry>(_list44.size);
                BuildJobStateFileHashEntry _elem45;
                for (int _i46 = 0; _i46 < _list44.size; ++_i46)
                {
                  _elem45 = new BuildJobStateFileHashEntry();
                  _elem45.read(iprot);
                  struct.entries.add(_elem45);
                }
                iprot.readListEnd();
              }
              struct.setEntriesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuildJobStateFileHashes struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetCellIndex()) {
        oprot.writeFieldBegin(CELL_INDEX_FIELD_DESC);
        oprot.writeI32(struct.cellIndex);
        oprot.writeFieldEnd();
      }
      if (struct.entries != null) {
        if (struct.isSetEntries()) {
          oprot.writeFieldBegin(ENTRIES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.entries.size()));
            for (BuildJobStateFileHashEntry _iter47 : struct.entries)
            {
              _iter47.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuildJobStateFileHashesTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BuildJobStateFileHashesTupleScheme getScheme() {
      return new BuildJobStateFileHashesTupleScheme();
    }
  }

  private static class BuildJobStateFileHashesTupleScheme extends org.apache.thrift.scheme.TupleScheme<BuildJobStateFileHashes> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuildJobStateFileHashes struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCellIndex()) {
        optionals.set(0);
      }
      if (struct.isSetEntries()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetCellIndex()) {
        oprot.writeI32(struct.cellIndex);
      }
      if (struct.isSetEntries()) {
        {
          oprot.writeI32(struct.entries.size());
          for (BuildJobStateFileHashEntry _iter48 : struct.entries)
          {
            _iter48.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuildJobStateFileHashes struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.cellIndex = iprot.readI32();
        struct.setCellIndexIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list49 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.entries = new java.util.ArrayList<BuildJobStateFileHashEntry>(_list49.size);
          BuildJobStateFileHashEntry _elem50;
          for (int _i51 = 0; _i51 < _list49.size; ++_i51)
          {
            _elem50 = new BuildJobStateFileHashEntry();
            _elem50.read(iprot);
            struct.entries.add(_elem50);
          }
        }
        struct.setEntriesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

