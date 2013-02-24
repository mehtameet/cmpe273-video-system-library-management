/**
 * Customer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package entity;

public class Customer  implements java.io.Serializable {
    private java.lang.String address;

    private java.lang.String city;

    private java.lang.String dateOfBirth;

    private java.lang.String emailId;

    private java.lang.String expiryDate;

    private java.lang.String firstName;

    private java.lang.String gender;

    private java.lang.String lastName;

    private int membershipId;

    private java.lang.String numberOfMoviesIssued;

    private entity.Movie[] objMovieDtls;

    private entity.Transactions[] objTrans;

    private java.lang.String password;

    private java.lang.String registrationDate;

    private java.lang.String state;

    private java.lang.String userType;

    private int zipCode;

    public Customer() {
    }

    public Customer(
           java.lang.String address,
           java.lang.String city,
           java.lang.String dateOfBirth,
           java.lang.String emailId,
           java.lang.String expiryDate,
           java.lang.String firstName,
           java.lang.String gender,
           java.lang.String lastName,
           int membershipId,
           java.lang.String numberOfMoviesIssued,
           entity.Movie[] objMovieDtls,
           entity.Transactions[] objTrans,
           java.lang.String password,
           java.lang.String registrationDate,
           java.lang.String state,
           java.lang.String userType,
           int zipCode) {
           this.address = address;
           this.city = city;
           this.dateOfBirth = dateOfBirth;
           this.emailId = emailId;
           this.expiryDate = expiryDate;
           this.firstName = firstName;
           this.gender = gender;
           this.lastName = lastName;
           this.membershipId = membershipId;
           this.numberOfMoviesIssued = numberOfMoviesIssued;
           this.objMovieDtls = objMovieDtls;
           this.objTrans = objTrans;
           this.password = password;
           this.registrationDate = registrationDate;
           this.state = state;
           this.userType = userType;
           this.zipCode = zipCode;
    }


    /**
     * Gets the address value for this Customer.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Customer.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the city value for this Customer.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Customer.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the dateOfBirth value for this Customer.
     * 
     * @return dateOfBirth
     */
    public java.lang.String getDateOfBirth() {
        return dateOfBirth;
    }


    /**
     * Sets the dateOfBirth value for this Customer.
     * 
     * @param dateOfBirth
     */
    public void setDateOfBirth(java.lang.String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets the emailId value for this Customer.
     * 
     * @return emailId
     */
    public java.lang.String getEmailId() {
        return emailId;
    }


    /**
     * Sets the emailId value for this Customer.
     * 
     * @param emailId
     */
    public void setEmailId(java.lang.String emailId) {
        this.emailId = emailId;
    }


    /**
     * Gets the expiryDate value for this Customer.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this Customer.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the firstName value for this Customer.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this Customer.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the gender value for this Customer.
     * 
     * @return gender
     */
    public java.lang.String getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this Customer.
     * 
     * @param gender
     */
    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }


    /**
     * Gets the lastName value for this Customer.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this Customer.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the membershipId value for this Customer.
     * 
     * @return membershipId
     */
    public int getMembershipId() {
        return membershipId;
    }


    /**
     * Sets the membershipId value for this Customer.
     * 
     * @param membershipId
     */
    public void setMembershipId(int membershipId) {
        this.membershipId = membershipId;
    }


    /**
     * Gets the numberOfMoviesIssued value for this Customer.
     * 
     * @return numberOfMoviesIssued
     */
    public java.lang.String getNumberOfMoviesIssued() {
        return numberOfMoviesIssued;
    }


    /**
     * Sets the numberOfMoviesIssued value for this Customer.
     * 
     * @param numberOfMoviesIssued
     */
    public void setNumberOfMoviesIssued(java.lang.String numberOfMoviesIssued) {
        this.numberOfMoviesIssued = numberOfMoviesIssued;
    }


    /**
     * Gets the objMovieDtls value for this Customer.
     * 
     * @return objMovieDtls
     */
    public entity.Movie[] getObjMovieDtls() {
        return objMovieDtls;
    }


    /**
     * Sets the objMovieDtls value for this Customer.
     * 
     * @param objMovieDtls
     */
    public void setObjMovieDtls(entity.Movie[] objMovieDtls) {
        this.objMovieDtls = objMovieDtls;
    }


    /**
     * Gets the objTrans value for this Customer.
     * 
     * @return objTrans
     */
    public entity.Transactions[] getObjTrans() {
        return objTrans;
    }


    /**
     * Sets the objTrans value for this Customer.
     * 
     * @param objTrans
     */
    public void setObjTrans(entity.Transactions[] objTrans) {
        this.objTrans = objTrans;
    }


    /**
     * Gets the password value for this Customer.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this Customer.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the registrationDate value for this Customer.
     * 
     * @return registrationDate
     */
    public java.lang.String getRegistrationDate() {
        return registrationDate;
    }


    /**
     * Sets the registrationDate value for this Customer.
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(java.lang.String registrationDate) {
        this.registrationDate = registrationDate;
    }


    /**
     * Gets the state value for this Customer.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Customer.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the userType value for this Customer.
     * 
     * @return userType
     */
    public java.lang.String getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this Customer.
     * 
     * @param userType
     */
    public void setUserType(java.lang.String userType) {
        this.userType = userType;
    }


    /**
     * Gets the zipCode value for this Customer.
     * 
     * @return zipCode
     */
    public int getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this Customer.
     * 
     * @param zipCode
     */
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Customer)) return false;
        Customer other = (Customer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.dateOfBirth==null && other.getDateOfBirth()==null) || 
             (this.dateOfBirth!=null &&
              this.dateOfBirth.equals(other.getDateOfBirth()))) &&
            ((this.emailId==null && other.getEmailId()==null) || 
             (this.emailId!=null &&
              this.emailId.equals(other.getEmailId()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            this.membershipId == other.getMembershipId() &&
            ((this.numberOfMoviesIssued==null && other.getNumberOfMoviesIssued()==null) || 
             (this.numberOfMoviesIssued!=null &&
              this.numberOfMoviesIssued.equals(other.getNumberOfMoviesIssued()))) &&
            ((this.objMovieDtls==null && other.getObjMovieDtls()==null) || 
             (this.objMovieDtls!=null &&
              java.util.Arrays.equals(this.objMovieDtls, other.getObjMovieDtls()))) &&
            ((this.objTrans==null && other.getObjTrans()==null) || 
             (this.objTrans!=null &&
              java.util.Arrays.equals(this.objTrans, other.getObjTrans()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.registrationDate==null && other.getRegistrationDate()==null) || 
             (this.registrationDate!=null &&
              this.registrationDate.equals(other.getRegistrationDate()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.userType==null && other.getUserType()==null) || 
             (this.userType!=null &&
              this.userType.equals(other.getUserType()))) &&
            this.zipCode == other.getZipCode();
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getDateOfBirth() != null) {
            _hashCode += getDateOfBirth().hashCode();
        }
        if (getEmailId() != null) {
            _hashCode += getEmailId().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        _hashCode += getMembershipId();
        if (getNumberOfMoviesIssued() != null) {
            _hashCode += getNumberOfMoviesIssued().hashCode();
        }
        if (getObjMovieDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObjMovieDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObjMovieDtls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getObjTrans() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObjTrans());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObjTrans(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getRegistrationDate() != null) {
            _hashCode += getRegistrationDate().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getUserType() != null) {
            _hashCode += getUserType().hashCode();
        }
        _hashCode += getZipCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Customer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity", "Customer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "dateOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "emailId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "expiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("membershipId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "membershipId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfMoviesIssued");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "numberOfMoviesIssued"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objMovieDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "objMovieDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity", "Movie"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://VideoLibrary", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objTrans");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "objTrans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity", "Transactions"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://VideoLibrary", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "registrationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "userType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "zipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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