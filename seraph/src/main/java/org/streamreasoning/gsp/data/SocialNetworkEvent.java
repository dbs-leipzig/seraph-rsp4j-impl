/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.streamreasoning.gsp.data;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class SocialNetworkEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4381903079481368363L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SocialNetworkEvent\",\"namespace\":\"org.streamreasoning.gsp.data\",\"fields\":[{\"name\":\"initiated\",\"type\":\"string\",\"doc\":\"Person who initiated the friend request\"},{\"name\":\"accepted\",\"type\":\"string\",\"doc\":\"Person who accepted the friend request\"},{\"name\":\"friends\",\"type\":\"boolean\",\"doc\":\"Are they friends or not\"},{\"name\":\"date\",\"type\":\"string\",\"doc\":\"Timestamp of the moment the friend request was accepted\"}],\"version\":\"1\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<SocialNetworkEvent> ENCODER =
      new BinaryMessageEncoder<SocialNetworkEvent>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<SocialNetworkEvent> DECODER =
      new BinaryMessageDecoder<SocialNetworkEvent>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<SocialNetworkEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<SocialNetworkEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<SocialNetworkEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<SocialNetworkEvent>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this SocialNetworkEvent to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a SocialNetworkEvent from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a SocialNetworkEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static SocialNetworkEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Person who initiated the friend request */
  @Deprecated public java.lang.CharSequence initiated;
  /** Person who accepted the friend request */
  @Deprecated public java.lang.CharSequence accepted;
  /** Are they friends or not */
  @Deprecated public boolean friends;
  /** Timestamp of the moment the friend request was accepted */
  @Deprecated public java.lang.CharSequence date;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public SocialNetworkEvent() {}

  /**
   * All-args constructor.
   * @param initiated Person who initiated the friend request
   * @param accepted Person who accepted the friend request
   * @param friends Are they friends or not
   * @param date Timestamp of the moment the friend request was accepted
   */
  public SocialNetworkEvent(java.lang.CharSequence initiated, java.lang.CharSequence accepted, java.lang.Boolean friends, java.lang.CharSequence date) {
    this.initiated = initiated;
    this.accepted = accepted;
    this.friends = friends;
    this.date = date;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return initiated;
    case 1: return accepted;
    case 2: return friends;
    case 3: return date;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: initiated = (java.lang.CharSequence)value$; break;
    case 1: accepted = (java.lang.CharSequence)value$; break;
    case 2: friends = (java.lang.Boolean)value$; break;
    case 3: date = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'initiated' field.
   * @return Person who initiated the friend request
   */
  public java.lang.CharSequence getInitiated() {
    return initiated;
  }


  /**
   * Sets the value of the 'initiated' field.
   * Person who initiated the friend request
   * @param value the value to set.
   */
  public void setInitiated(java.lang.CharSequence value) {
    this.initiated = value;
  }

  /**
   * Gets the value of the 'accepted' field.
   * @return Person who accepted the friend request
   */
  public java.lang.CharSequence getAccepted() {
    return accepted;
  }


  /**
   * Sets the value of the 'accepted' field.
   * Person who accepted the friend request
   * @param value the value to set.
   */
  public void setAccepted(java.lang.CharSequence value) {
    this.accepted = value;
  }

  /**
   * Gets the value of the 'friends' field.
   * @return Are they friends or not
   */
  public boolean getFriends() {
    return friends;
  }


  /**
   * Sets the value of the 'friends' field.
   * Are they friends or not
   * @param value the value to set.
   */
  public void setFriends(boolean value) {
    this.friends = value;
  }

  /**
   * Gets the value of the 'date' field.
   * @return Timestamp of the moment the friend request was accepted
   */
  public java.lang.CharSequence getDate() {
    return date;
  }


  /**
   * Sets the value of the 'date' field.
   * Timestamp of the moment the friend request was accepted
   * @param value the value to set.
   */
  public void setDate(java.lang.CharSequence value) {
    this.date = value;
  }

  /**
   * Creates a new SocialNetworkEvent RecordBuilder.
   * @return A new SocialNetworkEvent RecordBuilder
   */
  public static org.streamreasoning.gsp.data.SocialNetworkEvent.Builder newBuilder() {
    return new org.streamreasoning.gsp.data.SocialNetworkEvent.Builder();
  }

  /**
   * Creates a new SocialNetworkEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new SocialNetworkEvent RecordBuilder
   */
  public static org.streamreasoning.gsp.data.SocialNetworkEvent.Builder newBuilder(org.streamreasoning.gsp.data.SocialNetworkEvent.Builder other) {
    if (other == null) {
      return new org.streamreasoning.gsp.data.SocialNetworkEvent.Builder();
    } else {
      return new org.streamreasoning.gsp.data.SocialNetworkEvent.Builder(other);
    }
  }

  /**
   * Creates a new SocialNetworkEvent RecordBuilder by copying an existing SocialNetworkEvent instance.
   * @param other The existing instance to copy.
   * @return A new SocialNetworkEvent RecordBuilder
   */
  public static org.streamreasoning.gsp.data.SocialNetworkEvent.Builder newBuilder(org.streamreasoning.gsp.data.SocialNetworkEvent other) {
    if (other == null) {
      return new org.streamreasoning.gsp.data.SocialNetworkEvent.Builder();
    } else {
      return new org.streamreasoning.gsp.data.SocialNetworkEvent.Builder(other);
    }
  }

  /**
   * RecordBuilder for SocialNetworkEvent instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SocialNetworkEvent>
    implements org.apache.avro.data.RecordBuilder<SocialNetworkEvent> {

    /** Person who initiated the friend request */
    private java.lang.CharSequence initiated;
    /** Person who accepted the friend request */
    private java.lang.CharSequence accepted;
    /** Are they friends or not */
    private boolean friends;
    /** Timestamp of the moment the friend request was accepted */
    private java.lang.CharSequence date;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.streamreasoning.gsp.data.SocialNetworkEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.initiated)) {
        this.initiated = data().deepCopy(fields()[0].schema(), other.initiated);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.accepted)) {
        this.accepted = data().deepCopy(fields()[1].schema(), other.accepted);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.friends)) {
        this.friends = data().deepCopy(fields()[2].schema(), other.friends);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.date)) {
        this.date = data().deepCopy(fields()[3].schema(), other.date);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing SocialNetworkEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(org.streamreasoning.gsp.data.SocialNetworkEvent other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.initiated)) {
        this.initiated = data().deepCopy(fields()[0].schema(), other.initiated);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.accepted)) {
        this.accepted = data().deepCopy(fields()[1].schema(), other.accepted);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.friends)) {
        this.friends = data().deepCopy(fields()[2].schema(), other.friends);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.date)) {
        this.date = data().deepCopy(fields()[3].schema(), other.date);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'initiated' field.
      * Person who initiated the friend request
      * @return The value.
      */
    public java.lang.CharSequence getInitiated() {
      return initiated;
    }


    /**
      * Sets the value of the 'initiated' field.
      * Person who initiated the friend request
      * @param value The value of 'initiated'.
      * @return This builder.
      */
    public org.streamreasoning.gsp.data.SocialNetworkEvent.Builder setInitiated(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.initiated = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'initiated' field has been set.
      * Person who initiated the friend request
      * @return True if the 'initiated' field has been set, false otherwise.
      */
    public boolean hasInitiated() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'initiated' field.
      * Person who initiated the friend request
      * @return This builder.
      */
    public org.streamreasoning.gsp.data.SocialNetworkEvent.Builder clearInitiated() {
      initiated = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'accepted' field.
      * Person who accepted the friend request
      * @return The value.
      */
    public java.lang.CharSequence getAccepted() {
      return accepted;
    }


    /**
      * Sets the value of the 'accepted' field.
      * Person who accepted the friend request
      * @param value The value of 'accepted'.
      * @return This builder.
      */
    public org.streamreasoning.gsp.data.SocialNetworkEvent.Builder setAccepted(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.accepted = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'accepted' field has been set.
      * Person who accepted the friend request
      * @return True if the 'accepted' field has been set, false otherwise.
      */
    public boolean hasAccepted() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'accepted' field.
      * Person who accepted the friend request
      * @return This builder.
      */
    public org.streamreasoning.gsp.data.SocialNetworkEvent.Builder clearAccepted() {
      accepted = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'friends' field.
      * Are they friends or not
      * @return The value.
      */
    public boolean getFriends() {
      return friends;
    }


    /**
      * Sets the value of the 'friends' field.
      * Are they friends or not
      * @param value The value of 'friends'.
      * @return This builder.
      */
    public org.streamreasoning.gsp.data.SocialNetworkEvent.Builder setFriends(boolean value) {
      validate(fields()[2], value);
      this.friends = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'friends' field has been set.
      * Are they friends or not
      * @return True if the 'friends' field has been set, false otherwise.
      */
    public boolean hasFriends() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'friends' field.
      * Are they friends or not
      * @return This builder.
      */
    public org.streamreasoning.gsp.data.SocialNetworkEvent.Builder clearFriends() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'date' field.
      * Timestamp of the moment the friend request was accepted
      * @return The value.
      */
    public java.lang.CharSequence getDate() {
      return date;
    }


    /**
      * Sets the value of the 'date' field.
      * Timestamp of the moment the friend request was accepted
      * @param value The value of 'date'.
      * @return This builder.
      */
    public org.streamreasoning.gsp.data.SocialNetworkEvent.Builder setDate(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.date = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'date' field has been set.
      * Timestamp of the moment the friend request was accepted
      * @return True if the 'date' field has been set, false otherwise.
      */
    public boolean hasDate() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'date' field.
      * Timestamp of the moment the friend request was accepted
      * @return This builder.
      */
    public org.streamreasoning.gsp.data.SocialNetworkEvent.Builder clearDate() {
      date = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SocialNetworkEvent build() {
      try {
        SocialNetworkEvent record = new SocialNetworkEvent();
        record.initiated = fieldSetFlags()[0] ? this.initiated : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.accepted = fieldSetFlags()[1] ? this.accepted : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.friends = fieldSetFlags()[2] ? this.friends : (java.lang.Boolean) defaultValue(fields()[2]);
        record.date = fieldSetFlags()[3] ? this.date : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<SocialNetworkEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<SocialNetworkEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<SocialNetworkEvent>
    READER$ = (org.apache.avro.io.DatumReader<SocialNetworkEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.initiated);

    out.writeString(this.accepted);

    out.writeBoolean(this.friends);

    out.writeString(this.date);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.initiated = in.readString(this.initiated instanceof Utf8 ? (Utf8)this.initiated : null);

      this.accepted = in.readString(this.accepted instanceof Utf8 ? (Utf8)this.accepted : null);

      this.friends = in.readBoolean();

      this.date = in.readString(this.date instanceof Utf8 ? (Utf8)this.date : null);

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.initiated = in.readString(this.initiated instanceof Utf8 ? (Utf8)this.initiated : null);
          break;

        case 1:
          this.accepted = in.readString(this.accepted instanceof Utf8 ? (Utf8)this.accepted : null);
          break;

        case 2:
          this.friends = in.readBoolean();
          break;

        case 3:
          this.date = in.readString(this.date instanceof Utf8 ? (Utf8)this.date : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









