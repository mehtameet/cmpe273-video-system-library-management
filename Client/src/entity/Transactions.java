/**
 * Transactions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package entity;

public class Transactions  implements java.io.Serializable {
    private java.lang.String actualReturnDate;

    private double balance;

    private java.lang.String dueDate;

    private java.lang.String fineamount;

    private java.lang.String isActive;

    private java.lang.String issueDate;

    private int movieId;

    private java.lang.String paymentStatus;

    private java.lang.String returnStatus;

    private int transactionId;

    private int userId;

    public Transactions() {
    }

    public Transactions(
           java.lang.String actualReturnDate,
           double balance,
           java.lang.String dueDate,
           java.lang.String fineamount,
           java.lang.String isActive,
           java.lang.String issueDate,
           int movieId,
           java.lang.String paymentStatus,
           java.lang.String returnStatus,
           int transactionId,
           int userId) {
           this.actualReturnDate = actualReturnDate;
           this.balance = balance;
           this.dueDate = dueDate;
           this.fineamount = fineamount;
           this.isActive = isActive;
           this.issueDate = issueDate;
           this.movieId = movieId;
           this.paymentStatus = paymentStatus;
           this.returnStatus = returnStatus;
           this.transactionId = transactionId;
           this.userId = userId;
    }


    /**
     * Gets the actualReturnDate value for this Transactions.
     * 
     * @return actualReturnDate
     */
    public java.lang.String getActualReturnDate() {
        return actualReturnDate;
    }


    /**
     * Sets the actualReturnDate value for this Transactions.
     * 
     * @param actualReturnDate
     */
    public void setActualReturnDate(java.lang.String actualReturnDate) {
        this.actualReturnDate = actualReturnDate;
    }


    /**
     * Gets the balance value for this Transactions.
     * 
     * @return balance
     */
    public double getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this Transactions.
     * 
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }


    /**
     * Gets the dueDate value for this Transactions.
     * 
     * @return dueDate
     */
    public java.lang.String getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this Transactions.
     * 
     * @param dueDate
     */
    public void setDueDate(java.lang.String dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the fineamount value for this Transactions.
     * 
     * @return fineamount
     */
    public java.lang.String getFineamount() {
        return fineamount;
    }


    /**
     * Sets the fineamount value for this Transactions.
     * 
     * @param fineamount
     */
    public void setFineamount(java.lang.String fineamount) {
        this.fineamount = fineamount;
    }


    /**
     * Gets the isActive value for this Transactions.
     * 
     * @return isActive
     */
    public java.lang.String getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this Transactions.
     * 
     * @param isActive
     */
    public void setIsActive(java.lang.String isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the issueDate value for this Transactions.
     * 
     * @return issueDate
     */
    public java.lang.String getIssueDate() {
        return issueDate;
    }


    /**
     * Sets the issueDate value for this Transactions.
     * 
     * @param issueDate
     */
    public void setIssueDate(java.lang.String issueDate) {
        this.issueDate = issueDate;
    }


    /**
     * Gets the movieId value for this Transactions.
     * 
     * @return movieId
     */
    public int getMovieId() {
        return movieId;
    }


    /**
     * Sets the movieId value for this Transactions.
     * 
     * @param movieId
     */
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }


    /**
     * Gets the paymentStatus value for this Transactions.
     * 
     * @return paymentStatus
     */
    public java.lang.String getPaymentStatus() {
        return paymentStatus;
    }


    /**
     * Sets the paymentStatus value for this Transactions.
     * 
     * @param paymentStatus
     */
    public void setPaymentStatus(java.lang.String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }


    /**
     * Gets the returnStatus value for this Transactions.
     * 
     * @return returnStatus
     */
    public java.lang.String getReturnStatus() {
        return returnStatus;
    }


    /**
     * Sets the returnStatus value for this Transactions.
     * 
     * @param returnStatus
     */
    public void setReturnStatus(java.lang.String returnStatus) {
        this.returnStatus = returnStatus;
    }


    /**
     * Gets the transactionId value for this Transactions.
     * 
     * @return transactionId
     */
    public int getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this Transactions.
     * 
     * @param transactionId
     */
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the userId value for this Transactions.
     * 
     * @return userId
     */
    public int getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this Transactions.
     * 
     * @param userId
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Transactions)) return false;
        Transactions other = (Transactions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actualReturnDate==null && other.getActualReturnDate()==null) || 
             (this.actualReturnDate!=null &&
              this.actualReturnDate.equals(other.getActualReturnDate()))) &&
            this.balance == other.getBalance() &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.fineamount==null && other.getFineamount()==null) || 
             (this.fineamount!=null &&
              this.fineamount.equals(other.getFineamount()))) &&
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive()))) &&
            ((this.issueDate==null && other.getIssueDate()==null) || 
             (this.issueDate!=null &&
              this.issueDate.equals(other.getIssueDate()))) &&
            this.movieId == other.getMovieId() &&
            ((this.paymentStatus==null && other.getPaymentStatus()==null) || 
             (this.paymentStatus!=null &&
              this.paymentStatus.equals(other.getPaymentStatus()))) &&
            ((this.returnStatus==null && other.getReturnStatus()==null) || 
             (this.returnStatus!=null &&
              this.returnStatus.equals(other.getReturnStatus()))) &&
            this.transactionId == other.getTransactionId() &&
            this.userId == other.getUserId();
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
        if (getActualReturnDate() != null) {
            _hashCode += getActualReturnDate().hashCode();
        }
        _hashCode += new Double(getBalance()).hashCode();
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getFineamount() != null) {
            _hashCode += getFineamount().hashCode();
        }
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
        }
        if (getIssueDate() != null) {
            _hashCode += getIssueDate().hashCode();
        }
        _hashCode += getMovieId();
        if (getPaymentStatus() != null) {
            _hashCode += getPaymentStatus().hashCode();
        }
        if (getReturnStatus() != null) {
            _hashCode += getReturnStatus().hashCode();
        }
        _hashCode += getTransactionId();
        _hashCode += getUserId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Transactions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity", "Transactions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualReturnDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "actualReturnDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "dueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fineamount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "fineamount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "isActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "issueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("movieId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "movieId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "paymentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "returnStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "userId"));
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
