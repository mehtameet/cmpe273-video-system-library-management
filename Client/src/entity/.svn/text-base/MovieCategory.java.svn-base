/**
 * MovieCategory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package entity;

public class MovieCategory  implements java.io.Serializable {
    private int movieCategoryId;

    private java.lang.String movieCategoryName;

    public MovieCategory() {
    }

    public MovieCategory(
           int movieCategoryId,
           java.lang.String movieCategoryName) {
           this.movieCategoryId = movieCategoryId;
           this.movieCategoryName = movieCategoryName;
    }


    /**
     * Gets the movieCategoryId value for this MovieCategory.
     * 
     * @return movieCategoryId
     */
    public int getMovieCategoryId() {
        return movieCategoryId;
    }


    /**
     * Sets the movieCategoryId value for this MovieCategory.
     * 
     * @param movieCategoryId
     */
    public void setMovieCategoryId(int movieCategoryId) {
        this.movieCategoryId = movieCategoryId;
    }


    /**
     * Gets the movieCategoryName value for this MovieCategory.
     * 
     * @return movieCategoryName
     */
    public java.lang.String getMovieCategoryName() {
        return movieCategoryName;
    }


    /**
     * Sets the movieCategoryName value for this MovieCategory.
     * 
     * @param movieCategoryName
     */
    public void setMovieCategoryName(java.lang.String movieCategoryName) {
        this.movieCategoryName = movieCategoryName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MovieCategory)) return false;
        MovieCategory other = (MovieCategory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.movieCategoryId == other.getMovieCategoryId() &&
            ((this.movieCategoryName==null && other.getMovieCategoryName()==null) || 
             (this.movieCategoryName!=null &&
              this.movieCategoryName.equals(other.getMovieCategoryName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getMovieCategoryId();
        if (getMovieCategoryName() != null) {
            _hashCode += getMovieCategoryName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MovieCategory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity", "MovieCategory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("movieCategoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "movieCategoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("movieCategoryName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "movieCategoryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
