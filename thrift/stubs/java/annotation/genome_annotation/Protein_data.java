/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
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
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-4-20")
public class Protein_data implements org.apache.thrift.TBase<Protein_data, Protein_data._Fields>, java.io.Serializable, Cloneable, Comparable<Protein_data> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Protein_data");

  private static final org.apache.thrift.protocol.TField PROTEIN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("protein_id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PROTEIN_AMINO_ACID_SEQUENCE_FIELD_DESC = new org.apache.thrift.protocol.TField("protein_amino_acid_sequence", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PROTEIN_FUNCTION_FIELD_DESC = new org.apache.thrift.protocol.TField("protein_function", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PROTEIN_ALIASES_FIELD_DESC = new org.apache.thrift.protocol.TField("protein_aliases", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField PROTEIN_MD5_FIELD_DESC = new org.apache.thrift.protocol.TField("protein_md5", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField PROTEIN_DOMAIN_LOCATIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("protein_domain_locations", org.apache.thrift.protocol.TType.LIST, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new Protein_dataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new Protein_dataTupleSchemeFactory());
  }

  /**
   * Protein identifier, which is feature ID plus ".protein"
   */
  public String protein_id; // required
  /**
   * Amino acid sequence for this protein
   */
  public String protein_amino_acid_sequence; // required
  /**
   * Function of protein
   */
  public String protein_function; // required
  /**
   * List of aliases for the protein
   */
  public List<String> protein_aliases; // required
  /**
   * MD5 hash of the protein translation (uppercase)
   */
  public String protein_md5; // required
  public List<String> protein_domain_locations; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Protein identifier, which is feature ID plus ".protein"
     */
    PROTEIN_ID((short)1, "protein_id"),
    /**
     * Amino acid sequence for this protein
     */
    PROTEIN_AMINO_ACID_SEQUENCE((short)2, "protein_amino_acid_sequence"),
    /**
     * Function of protein
     */
    PROTEIN_FUNCTION((short)3, "protein_function"),
    /**
     * List of aliases for the protein
     */
    PROTEIN_ALIASES((short)4, "protein_aliases"),
    /**
     * MD5 hash of the protein translation (uppercase)
     */
    PROTEIN_MD5((short)5, "protein_md5"),
    PROTEIN_DOMAIN_LOCATIONS((short)6, "protein_domain_locations");

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
        case 1: // PROTEIN_ID
          return PROTEIN_ID;
        case 2: // PROTEIN_AMINO_ACID_SEQUENCE
          return PROTEIN_AMINO_ACID_SEQUENCE;
        case 3: // PROTEIN_FUNCTION
          return PROTEIN_FUNCTION;
        case 4: // PROTEIN_ALIASES
          return PROTEIN_ALIASES;
        case 5: // PROTEIN_MD5
          return PROTEIN_MD5;
        case 6: // PROTEIN_DOMAIN_LOCATIONS
          return PROTEIN_DOMAIN_LOCATIONS;
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
    tmpMap.put(_Fields.PROTEIN_ID, new org.apache.thrift.meta_data.FieldMetaData("protein_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PROTEIN_AMINO_ACID_SEQUENCE, new org.apache.thrift.meta_data.FieldMetaData("protein_amino_acid_sequence", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PROTEIN_FUNCTION, new org.apache.thrift.meta_data.FieldMetaData("protein_function", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PROTEIN_ALIASES, new org.apache.thrift.meta_data.FieldMetaData("protein_aliases", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.PROTEIN_MD5, new org.apache.thrift.meta_data.FieldMetaData("protein_md5", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PROTEIN_DOMAIN_LOCATIONS, new org.apache.thrift.meta_data.FieldMetaData("protein_domain_locations", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Protein_data.class, metaDataMap);
  }

  public Protein_data() {
  }

  public Protein_data(
    String protein_id,
    String protein_amino_acid_sequence,
    String protein_function,
    List<String> protein_aliases,
    String protein_md5,
    List<String> protein_domain_locations)
  {
    this();
    this.protein_id = protein_id;
    this.protein_amino_acid_sequence = protein_amino_acid_sequence;
    this.protein_function = protein_function;
    this.protein_aliases = protein_aliases;
    this.protein_md5 = protein_md5;
    this.protein_domain_locations = protein_domain_locations;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Protein_data(Protein_data other) {
    if (other.isSetProtein_id()) {
      this.protein_id = other.protein_id;
    }
    if (other.isSetProtein_amino_acid_sequence()) {
      this.protein_amino_acid_sequence = other.protein_amino_acid_sequence;
    }
    if (other.isSetProtein_function()) {
      this.protein_function = other.protein_function;
    }
    if (other.isSetProtein_aliases()) {
      List<String> __this__protein_aliases = new ArrayList<String>(other.protein_aliases);
      this.protein_aliases = __this__protein_aliases;
    }
    if (other.isSetProtein_md5()) {
      this.protein_md5 = other.protein_md5;
    }
    if (other.isSetProtein_domain_locations()) {
      List<String> __this__protein_domain_locations = new ArrayList<String>(other.protein_domain_locations);
      this.protein_domain_locations = __this__protein_domain_locations;
    }
  }

  public Protein_data deepCopy() {
    return new Protein_data(this);
  }

  @Override
  public void clear() {
    this.protein_id = null;
    this.protein_amino_acid_sequence = null;
    this.protein_function = null;
    this.protein_aliases = null;
    this.protein_md5 = null;
    this.protein_domain_locations = null;
  }

  /**
   * Protein identifier, which is feature ID plus ".protein"
   */
  public String getProtein_id() {
    return this.protein_id;
  }

  /**
   * Protein identifier, which is feature ID plus ".protein"
   */
  public Protein_data setProtein_id(String protein_id) {
    this.protein_id = protein_id;
    return this;
  }

  public void unsetProtein_id() {
    this.protein_id = null;
  }

  /** Returns true if field protein_id is set (has been assigned a value) and false otherwise */
  public boolean isSetProtein_id() {
    return this.protein_id != null;
  }

  public void setProtein_idIsSet(boolean value) {
    if (!value) {
      this.protein_id = null;
    }
  }

  /**
   * Amino acid sequence for this protein
   */
  public String getProtein_amino_acid_sequence() {
    return this.protein_amino_acid_sequence;
  }

  /**
   * Amino acid sequence for this protein
   */
  public Protein_data setProtein_amino_acid_sequence(String protein_amino_acid_sequence) {
    this.protein_amino_acid_sequence = protein_amino_acid_sequence;
    return this;
  }

  public void unsetProtein_amino_acid_sequence() {
    this.protein_amino_acid_sequence = null;
  }

  /** Returns true if field protein_amino_acid_sequence is set (has been assigned a value) and false otherwise */
  public boolean isSetProtein_amino_acid_sequence() {
    return this.protein_amino_acid_sequence != null;
  }

  public void setProtein_amino_acid_sequenceIsSet(boolean value) {
    if (!value) {
      this.protein_amino_acid_sequence = null;
    }
  }

  /**
   * Function of protein
   */
  public String getProtein_function() {
    return this.protein_function;
  }

  /**
   * Function of protein
   */
  public Protein_data setProtein_function(String protein_function) {
    this.protein_function = protein_function;
    return this;
  }

  public void unsetProtein_function() {
    this.protein_function = null;
  }

  /** Returns true if field protein_function is set (has been assigned a value) and false otherwise */
  public boolean isSetProtein_function() {
    return this.protein_function != null;
  }

  public void setProtein_functionIsSet(boolean value) {
    if (!value) {
      this.protein_function = null;
    }
  }

  public int getProtein_aliasesSize() {
    return (this.protein_aliases == null) ? 0 : this.protein_aliases.size();
  }

  public java.util.Iterator<String> getProtein_aliasesIterator() {
    return (this.protein_aliases == null) ? null : this.protein_aliases.iterator();
  }

  public void addToProtein_aliases(String elem) {
    if (this.protein_aliases == null) {
      this.protein_aliases = new ArrayList<String>();
    }
    this.protein_aliases.add(elem);
  }

  /**
   * List of aliases for the protein
   */
  public List<String> getProtein_aliases() {
    return this.protein_aliases;
  }

  /**
   * List of aliases for the protein
   */
  public Protein_data setProtein_aliases(List<String> protein_aliases) {
    this.protein_aliases = protein_aliases;
    return this;
  }

  public void unsetProtein_aliases() {
    this.protein_aliases = null;
  }

  /** Returns true if field protein_aliases is set (has been assigned a value) and false otherwise */
  public boolean isSetProtein_aliases() {
    return this.protein_aliases != null;
  }

  public void setProtein_aliasesIsSet(boolean value) {
    if (!value) {
      this.protein_aliases = null;
    }
  }

  /**
   * MD5 hash of the protein translation (uppercase)
   */
  public String getProtein_md5() {
    return this.protein_md5;
  }

  /**
   * MD5 hash of the protein translation (uppercase)
   */
  public Protein_data setProtein_md5(String protein_md5) {
    this.protein_md5 = protein_md5;
    return this;
  }

  public void unsetProtein_md5() {
    this.protein_md5 = null;
  }

  /** Returns true if field protein_md5 is set (has been assigned a value) and false otherwise */
  public boolean isSetProtein_md5() {
    return this.protein_md5 != null;
  }

  public void setProtein_md5IsSet(boolean value) {
    if (!value) {
      this.protein_md5 = null;
    }
  }

  public int getProtein_domain_locationsSize() {
    return (this.protein_domain_locations == null) ? 0 : this.protein_domain_locations.size();
  }

  public java.util.Iterator<String> getProtein_domain_locationsIterator() {
    return (this.protein_domain_locations == null) ? null : this.protein_domain_locations.iterator();
  }

  public void addToProtein_domain_locations(String elem) {
    if (this.protein_domain_locations == null) {
      this.protein_domain_locations = new ArrayList<String>();
    }
    this.protein_domain_locations.add(elem);
  }

  public List<String> getProtein_domain_locations() {
    return this.protein_domain_locations;
  }

  public Protein_data setProtein_domain_locations(List<String> protein_domain_locations) {
    this.protein_domain_locations = protein_domain_locations;
    return this;
  }

  public void unsetProtein_domain_locations() {
    this.protein_domain_locations = null;
  }

  /** Returns true if field protein_domain_locations is set (has been assigned a value) and false otherwise */
  public boolean isSetProtein_domain_locations() {
    return this.protein_domain_locations != null;
  }

  public void setProtein_domain_locationsIsSet(boolean value) {
    if (!value) {
      this.protein_domain_locations = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROTEIN_ID:
      if (value == null) {
        unsetProtein_id();
      } else {
        setProtein_id((String)value);
      }
      break;

    case PROTEIN_AMINO_ACID_SEQUENCE:
      if (value == null) {
        unsetProtein_amino_acid_sequence();
      } else {
        setProtein_amino_acid_sequence((String)value);
      }
      break;

    case PROTEIN_FUNCTION:
      if (value == null) {
        unsetProtein_function();
      } else {
        setProtein_function((String)value);
      }
      break;

    case PROTEIN_ALIASES:
      if (value == null) {
        unsetProtein_aliases();
      } else {
        setProtein_aliases((List<String>)value);
      }
      break;

    case PROTEIN_MD5:
      if (value == null) {
        unsetProtein_md5();
      } else {
        setProtein_md5((String)value);
      }
      break;

    case PROTEIN_DOMAIN_LOCATIONS:
      if (value == null) {
        unsetProtein_domain_locations();
      } else {
        setProtein_domain_locations((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROTEIN_ID:
      return getProtein_id();

    case PROTEIN_AMINO_ACID_SEQUENCE:
      return getProtein_amino_acid_sequence();

    case PROTEIN_FUNCTION:
      return getProtein_function();

    case PROTEIN_ALIASES:
      return getProtein_aliases();

    case PROTEIN_MD5:
      return getProtein_md5();

    case PROTEIN_DOMAIN_LOCATIONS:
      return getProtein_domain_locations();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PROTEIN_ID:
      return isSetProtein_id();
    case PROTEIN_AMINO_ACID_SEQUENCE:
      return isSetProtein_amino_acid_sequence();
    case PROTEIN_FUNCTION:
      return isSetProtein_function();
    case PROTEIN_ALIASES:
      return isSetProtein_aliases();
    case PROTEIN_MD5:
      return isSetProtein_md5();
    case PROTEIN_DOMAIN_LOCATIONS:
      return isSetProtein_domain_locations();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Protein_data)
      return this.equals((Protein_data)that);
    return false;
  }

  public boolean equals(Protein_data that) {
    if (that == null)
      return false;

    boolean this_present_protein_id = true && this.isSetProtein_id();
    boolean that_present_protein_id = true && that.isSetProtein_id();
    if (this_present_protein_id || that_present_protein_id) {
      if (!(this_present_protein_id && that_present_protein_id))
        return false;
      if (!this.protein_id.equals(that.protein_id))
        return false;
    }

    boolean this_present_protein_amino_acid_sequence = true && this.isSetProtein_amino_acid_sequence();
    boolean that_present_protein_amino_acid_sequence = true && that.isSetProtein_amino_acid_sequence();
    if (this_present_protein_amino_acid_sequence || that_present_protein_amino_acid_sequence) {
      if (!(this_present_protein_amino_acid_sequence && that_present_protein_amino_acid_sequence))
        return false;
      if (!this.protein_amino_acid_sequence.equals(that.protein_amino_acid_sequence))
        return false;
    }

    boolean this_present_protein_function = true && this.isSetProtein_function();
    boolean that_present_protein_function = true && that.isSetProtein_function();
    if (this_present_protein_function || that_present_protein_function) {
      if (!(this_present_protein_function && that_present_protein_function))
        return false;
      if (!this.protein_function.equals(that.protein_function))
        return false;
    }

    boolean this_present_protein_aliases = true && this.isSetProtein_aliases();
    boolean that_present_protein_aliases = true && that.isSetProtein_aliases();
    if (this_present_protein_aliases || that_present_protein_aliases) {
      if (!(this_present_protein_aliases && that_present_protein_aliases))
        return false;
      if (!this.protein_aliases.equals(that.protein_aliases))
        return false;
    }

    boolean this_present_protein_md5 = true && this.isSetProtein_md5();
    boolean that_present_protein_md5 = true && that.isSetProtein_md5();
    if (this_present_protein_md5 || that_present_protein_md5) {
      if (!(this_present_protein_md5 && that_present_protein_md5))
        return false;
      if (!this.protein_md5.equals(that.protein_md5))
        return false;
    }

    boolean this_present_protein_domain_locations = true && this.isSetProtein_domain_locations();
    boolean that_present_protein_domain_locations = true && that.isSetProtein_domain_locations();
    if (this_present_protein_domain_locations || that_present_protein_domain_locations) {
      if (!(this_present_protein_domain_locations && that_present_protein_domain_locations))
        return false;
      if (!this.protein_domain_locations.equals(that.protein_domain_locations))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_protein_id = true && (isSetProtein_id());
    list.add(present_protein_id);
    if (present_protein_id)
      list.add(protein_id);

    boolean present_protein_amino_acid_sequence = true && (isSetProtein_amino_acid_sequence());
    list.add(present_protein_amino_acid_sequence);
    if (present_protein_amino_acid_sequence)
      list.add(protein_amino_acid_sequence);

    boolean present_protein_function = true && (isSetProtein_function());
    list.add(present_protein_function);
    if (present_protein_function)
      list.add(protein_function);

    boolean present_protein_aliases = true && (isSetProtein_aliases());
    list.add(present_protein_aliases);
    if (present_protein_aliases)
      list.add(protein_aliases);

    boolean present_protein_md5 = true && (isSetProtein_md5());
    list.add(present_protein_md5);
    if (present_protein_md5)
      list.add(protein_md5);

    boolean present_protein_domain_locations = true && (isSetProtein_domain_locations());
    list.add(present_protein_domain_locations);
    if (present_protein_domain_locations)
      list.add(protein_domain_locations);

    return list.hashCode();
  }

  @Override
  public int compareTo(Protein_data other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetProtein_id()).compareTo(other.isSetProtein_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProtein_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.protein_id, other.protein_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProtein_amino_acid_sequence()).compareTo(other.isSetProtein_amino_acid_sequence());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProtein_amino_acid_sequence()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.protein_amino_acid_sequence, other.protein_amino_acid_sequence);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProtein_function()).compareTo(other.isSetProtein_function());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProtein_function()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.protein_function, other.protein_function);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProtein_aliases()).compareTo(other.isSetProtein_aliases());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProtein_aliases()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.protein_aliases, other.protein_aliases);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProtein_md5()).compareTo(other.isSetProtein_md5());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProtein_md5()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.protein_md5, other.protein_md5);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProtein_domain_locations()).compareTo(other.isSetProtein_domain_locations());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProtein_domain_locations()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.protein_domain_locations, other.protein_domain_locations);
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
    StringBuilder sb = new StringBuilder("Protein_data(");
    boolean first = true;

    sb.append("protein_id:");
    if (this.protein_id == null) {
      sb.append("null");
    } else {
      sb.append(this.protein_id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("protein_amino_acid_sequence:");
    if (this.protein_amino_acid_sequence == null) {
      sb.append("null");
    } else {
      sb.append(this.protein_amino_acid_sequence);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("protein_function:");
    if (this.protein_function == null) {
      sb.append("null");
    } else {
      sb.append(this.protein_function);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("protein_aliases:");
    if (this.protein_aliases == null) {
      sb.append("null");
    } else {
      sb.append(this.protein_aliases);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("protein_md5:");
    if (this.protein_md5 == null) {
      sb.append("null");
    } else {
      sb.append(this.protein_md5);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("protein_domain_locations:");
    if (this.protein_domain_locations == null) {
      sb.append("null");
    } else {
      sb.append(this.protein_domain_locations);
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

  private static class Protein_dataStandardSchemeFactory implements SchemeFactory {
    public Protein_dataStandardScheme getScheme() {
      return new Protein_dataStandardScheme();
    }
  }

  private static class Protein_dataStandardScheme extends StandardScheme<Protein_data> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Protein_data struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROTEIN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.protein_id = iprot.readString();
              struct.setProtein_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PROTEIN_AMINO_ACID_SEQUENCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.protein_amino_acid_sequence = iprot.readString();
              struct.setProtein_amino_acid_sequenceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PROTEIN_FUNCTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.protein_function = iprot.readString();
              struct.setProtein_functionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PROTEIN_ALIASES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list192 = iprot.readListBegin();
                struct.protein_aliases = new ArrayList<String>(_list192.size);
                String _elem193;
                for (int _i194 = 0; _i194 < _list192.size; ++_i194)
                {
                  _elem193 = iprot.readString();
                  struct.protein_aliases.add(_elem193);
                }
                iprot.readListEnd();
              }
              struct.setProtein_aliasesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PROTEIN_MD5
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.protein_md5 = iprot.readString();
              struct.setProtein_md5IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PROTEIN_DOMAIN_LOCATIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list195 = iprot.readListBegin();
                struct.protein_domain_locations = new ArrayList<String>(_list195.size);
                String _elem196;
                for (int _i197 = 0; _i197 < _list195.size; ++_i197)
                {
                  _elem196 = iprot.readString();
                  struct.protein_domain_locations.add(_elem196);
                }
                iprot.readListEnd();
              }
              struct.setProtein_domain_locationsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Protein_data struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.protein_id != null) {
        oprot.writeFieldBegin(PROTEIN_ID_FIELD_DESC);
        oprot.writeString(struct.protein_id);
        oprot.writeFieldEnd();
      }
      if (struct.protein_amino_acid_sequence != null) {
        oprot.writeFieldBegin(PROTEIN_AMINO_ACID_SEQUENCE_FIELD_DESC);
        oprot.writeString(struct.protein_amino_acid_sequence);
        oprot.writeFieldEnd();
      }
      if (struct.protein_function != null) {
        oprot.writeFieldBegin(PROTEIN_FUNCTION_FIELD_DESC);
        oprot.writeString(struct.protein_function);
        oprot.writeFieldEnd();
      }
      if (struct.protein_aliases != null) {
        oprot.writeFieldBegin(PROTEIN_ALIASES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.protein_aliases.size()));
          for (String _iter198 : struct.protein_aliases)
          {
            oprot.writeString(_iter198);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.protein_md5 != null) {
        oprot.writeFieldBegin(PROTEIN_MD5_FIELD_DESC);
        oprot.writeString(struct.protein_md5);
        oprot.writeFieldEnd();
      }
      if (struct.protein_domain_locations != null) {
        oprot.writeFieldBegin(PROTEIN_DOMAIN_LOCATIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.protein_domain_locations.size()));
          for (String _iter199 : struct.protein_domain_locations)
          {
            oprot.writeString(_iter199);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class Protein_dataTupleSchemeFactory implements SchemeFactory {
    public Protein_dataTupleScheme getScheme() {
      return new Protein_dataTupleScheme();
    }
  }

  private static class Protein_dataTupleScheme extends TupleScheme<Protein_data> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Protein_data struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetProtein_id()) {
        optionals.set(0);
      }
      if (struct.isSetProtein_amino_acid_sequence()) {
        optionals.set(1);
      }
      if (struct.isSetProtein_function()) {
        optionals.set(2);
      }
      if (struct.isSetProtein_aliases()) {
        optionals.set(3);
      }
      if (struct.isSetProtein_md5()) {
        optionals.set(4);
      }
      if (struct.isSetProtein_domain_locations()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetProtein_id()) {
        oprot.writeString(struct.protein_id);
      }
      if (struct.isSetProtein_amino_acid_sequence()) {
        oprot.writeString(struct.protein_amino_acid_sequence);
      }
      if (struct.isSetProtein_function()) {
        oprot.writeString(struct.protein_function);
      }
      if (struct.isSetProtein_aliases()) {
        {
          oprot.writeI32(struct.protein_aliases.size());
          for (String _iter200 : struct.protein_aliases)
          {
            oprot.writeString(_iter200);
          }
        }
      }
      if (struct.isSetProtein_md5()) {
        oprot.writeString(struct.protein_md5);
      }
      if (struct.isSetProtein_domain_locations()) {
        {
          oprot.writeI32(struct.protein_domain_locations.size());
          for (String _iter201 : struct.protein_domain_locations)
          {
            oprot.writeString(_iter201);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Protein_data struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.protein_id = iprot.readString();
        struct.setProtein_idIsSet(true);
      }
      if (incoming.get(1)) {
        struct.protein_amino_acid_sequence = iprot.readString();
        struct.setProtein_amino_acid_sequenceIsSet(true);
      }
      if (incoming.get(2)) {
        struct.protein_function = iprot.readString();
        struct.setProtein_functionIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list202 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.protein_aliases = new ArrayList<String>(_list202.size);
          String _elem203;
          for (int _i204 = 0; _i204 < _list202.size; ++_i204)
          {
            _elem203 = iprot.readString();
            struct.protein_aliases.add(_elem203);
          }
        }
        struct.setProtein_aliasesIsSet(true);
      }
      if (incoming.get(4)) {
        struct.protein_md5 = iprot.readString();
        struct.setProtein_md5IsSet(true);
      }
      if (incoming.get(5)) {
        {
          org.apache.thrift.protocol.TList _list205 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.protein_domain_locations = new ArrayList<String>(_list205.size);
          String _elem206;
          for (int _i207 = 0; _i207 < _list205.size; ++_i207)
          {
            _elem206 = iprot.readString();
            struct.protein_domain_locations.add(_elem206);
          }
        }
        struct.setProtein_domain_locationsIsSet(true);
      }
    }
  }

}

