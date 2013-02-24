/**
 * Movie.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package entity;

public class Movie  implements java.io.Serializable {
    private int availableCopies;

    private java.lang.String movieBanner;

    private int movieCategoryId;

    private java.lang.String movieCategoryName;

    private java.lang.String movieDescription;

    private int movieHits;

    private int movieId;

    private java.lang.String movieName;

    private int movieRating;

    private int movieRent;

    private java.lang.String releaseDate;

    public Movie() {
    }

    public Movie(
           int availableCopies,
           java.lang.String movieBanner,
           int movieCategoryId,
           java.lang.String movieCategoryName,
           java.lang.String movieDescription,
           int movieHits,
           int movieId,
           java.lang.String movieName,
           int movieRating,
           int movieRent,
           java.lang.String releaseDate) {
           this.availableCopies = availableCopies;
           this.movieBanner = movieBanner;
           this.movieCategoryId = movieCategoryId;
           this.movieCategoryName = movieCategoryName;
           this.movieDescription = movieDescription;
           this.movieHits = movieHits;
           this.movieId = movieId;
           this.movieName = movieName;
           this.movieRating = movieRating;
           this.movieRent = movieRent;
           this.releaseDate = releaseDate;
    }


    /**
     * Gets the availableCopies value for this Movie.
     * 
     * @return availableCopies
     */
    public int getAvailableCopies() {
        return availableCopies;
    }


    /**
     * Sets the availableCopies value for this Movie.
     * 
     * @param availableCopies
     */
    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }


    /**
     * Gets the movieBanner value for this Movie.
     * 
     * @return movieBanner
     */
    public java.lang.String getMovieBanner() {
        return movieBanner;
    }


    /**
     * Sets the movieBanner value for this Movie.
     * 
     * @param movieBanner
     */
    public void setMovieBanner(java.lang.String movieBanner) {
        this.movieBanner = movieBanner;
    }


    /**
     * Gets the movieCategoryId value for this Movie.
     * 
     * @return movieCategoryId
     */
    public int getMovieCategoryId() {
        return movieCategoryId;
    }


    /**
     * Sets the movieCategoryId value for this Movie.
     * 
     * @param movieCategoryId
     */
    public void setMovieCategoryId(int movieCategoryId) {
        this.movieCategoryId = movieCategoryId;
    }


    /**
     * Gets the movieCategoryName value for this Movie.
     * 
     * @return movieCategoryName
     */
    public java.lang.String getMovieCategoryName() {
        return movieCategoryName;
    }


    /**
     * Sets the movieCategoryName value for this Movie.
     * 
     * @param movieCategoryName
     */
    public void setMovieCategoryName(java.lang.String movieCategoryName) {
        this.movieCategoryName = movieCategoryName;
    }


    /**
     * Gets the movieDescription value for this Movie.
     * 
     * @return movieDescription
     */
    public java.lang.String getMovieDescription() {
        return movieDescription;
    }


    /**
     * Sets the movieDescription value for this Movie.
     * 
     * @param movieDescription
     */
    public void setMovieDescription(java.lang.String movieDescription) {
        this.movieDescription = movieDescription;
    }


    /**
     * Gets the movieHits value for this Movie.
     * 
     * @return movieHits
     */
    public int getMovieHits() {
        return movieHits;
    }


    /**
     * Sets the movieHits value for this Movie.
     * 
     * @param movieHits
     */
    public void setMovieHits(int movieHits) {
        this.movieHits = movieHits;
    }


    /**
     * Gets the movieId value for this Movie.
     * 
     * @return movieId
     */
    public int getMovieId() {
        return movieId;
    }


    /**
     * Sets the movieId value for this Movie.
     * 
     * @param movieId
     */
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }


    /**
     * Gets the movieName value for this Movie.
     * 
     * @return movieName
     */
    public java.lang.String getMovieName() {
        return movieName;
    }


    /**
     * Sets the movieName value for this Movie.
     * 
     * @param movieName
     */
    public void setMovieName(java.lang.String movieName) {
        this.movieName = movieName;
    }


    /**
     * Gets the movieRating value for this Movie.
     * 
     * @return movieRating
     */
    public int getMovieRating() {
        return movieRating;
    }


    /**
     * Sets the movieRating value for this Movie.
     * 
     * @param movieRating
     */
    public void setMovieRating(int movieRating) {
        this.movieRating = movieRating;
    }


    /**
     * Gets the movieRent value for this Movie.
     * 
     * @return movieRent
     */
    public int getMovieRent() {
        return movieRent;
    }


    /**
     * Sets the movieRent value for this Movie.
     * 
     * @param movieRent
     */
    public void setMovieRent(int movieRent) {
        this.movieRent = movieRent;
    }


    /**
     * Gets the releaseDate value for this Movie.
     * 
     * @return releaseDate
     */
    public java.lang.String getReleaseDate() {
        return releaseDate;
    }


    /**
     * Sets the releaseDate value for this Movie.
     * 
     * @param releaseDate
     */
    public void setReleaseDate(java.lang.String releaseDate) {
        this.releaseDate = releaseDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Movie)) return false;
        Movie other = (Movie) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.availableCopies == other.getAvailableCopies() &&
            ((this.movieBanner==null && other.getMovieBanner()==null) || 
             (this.movieBanner!=null &&
              this.movieBanner.equals(other.getMovieBanner()))) &&
            this.movieCategoryId == other.getMovieCategoryId() &&
            ((this.movieCategoryName==null && other.getMovieCategoryName()==null) || 
             (this.movieCategoryName!=null &&
              this.movieCategoryName.equals(other.getMovieCategoryName()))) &&
            ((this.movieDescription==null && other.getMovieDescription()==null) || 
             (this.movieDescription!=null &&
              this.movieDescription.equals(other.getMovieDescription()))) &&
            this.movieHits == other.getMovieHits() &&
            this.movieId == other.getMovieId() &&
            ((this.movieName==null && other.getMovieName()==null) || 
             (this.movieName!=null &&
              this.movieName.equals(other.getMovieName()))) &&
            this.movieRating == other.getMovieRating() &&
            this.movieRent == other.getMovieRent() &&
            ((this.releaseDate==null && other.getReleaseDate()==null) || 
             (this.releaseDate!=null &&
              this.releaseDate.equals(other.getReleaseDate())));
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
        _hashCode += getAvailableCopies();
        if (getMovieBanner() != null) {
            _hashCode += getMovieBanner().hashCode();
        }
        _hashCode += getMovieCategoryId();
        if (getMovieCategoryName() != null) {
            _hashCode += getMovieCategoryName().hashCode();
        }
        if (getMovieDescription() != null) {
            _hashCode += getMovieDescription().hashCode();
        }
        _hashCode += getMovieHits();
        _hashCode += getMovieId();
        if (getMovieName() != null) {
            _hashCode += getMovieName().hashCode();
        }
        _hashCode += getMovieRating();
        _hashCode += getMovieRent();
        if (getReleaseDate() != null) {
            _hashCode += getReleaseDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Movie.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity", "Movie"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableCopies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "availableCopies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("movieBanner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "movieBanner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("movieDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "movieDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("movieHits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "movieHits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("movieId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "movieId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("movieName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "movieName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("movieRating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "movieRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("movieRent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "movieRent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity", "releaseDate"));
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
