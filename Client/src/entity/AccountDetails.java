/**
 * AccountDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package entity;

public class AccountDetails  implements java.io.Serializable {
    private entity.MovieAccountDetail[] movieAccountDetail;

    private int noOfMovies;

    private java.lang.String plan;

    public AccountDetails() {
    }

    public AccountDetails(
           entity.MovieAccountDetail[] movieAccountDetail,
           int noOfMovies,
           java.lang.String plan) {
           this.movieAccountDetail = movieAccountDetail;
           this.noOfMovies = noOfMovies;
           this.plan = plan;
    }


    /**
     * Gets the movieAccountDetail value for this AccountDetails.
     * 
     * @return movieAccountDetail
     */
    public entity.MovieAccountDetail[] getMovieAccountDetail() {
        return movieAccountDetail;
    }


    /**
     * Sets the movieAccountDetail value for this AccountDetails.
     * 
     * @param movieAccountDetail
     */
    public void setMovieAccountDetail(entity.MovieAccountDetail[] movieAccountDetail) {
        this.movieAccountDetail = movieAccountDetail;
    }


    /**
     * Gets the noOfMovies value for this AccountDetails.
     * 
     * @return noOfMovies
     */
    public int getNoOfMovies() {
        return noOfMovies;
    }


    /**
     * Sets the noOfMovies value for this AccountDetails.
     * 
     * @param noOfMovies
     */
    public void setNoOfMovies(int noOfMovies) {
        this.noOfMovies = noOfMovies;
    }


    /**
     * Gets the plan value for this AccountDetails.
     * 
     * @return plan
     */
    public java.lang.String getPlan() {
        return plan;
    }


    /**
     * Sets the plan value for this AccountDetails.
     * 
     * @param plan
     */
    public void setPlan(java.lang.String plan) {
        this.plan = plan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountDetails)) return false;
        AccountDetails other = (AccountDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.movieAccountDetail==null && other.getMovieAccountDetail()==null) || 
             (this.movieAccountDetail!=null &&
              java.util.Arrays.equals(this.movieAccountDetail, other.getMovieAccountDetail()))) &&
            this.noOfMovies == other.getNoOfMovies() &&
            ((this.plan==null && other.getPlan()==null) || 
             (this.plan!=null &&
              this.plan.equals(other.getPlan())));
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
        if (getMovieAccountDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMovieAccountDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMovieAccountDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getNoOfMovies();
        if (getPlan() != null) {
            _hashCode += getPlan().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity", "AccountDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("movieAccountDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "movieAccountDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity", "MovieAccountDetail"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://VideoLibrary", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noOfMovies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "noOfMovies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "plan"));
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
