package com.liferay.krrishna.sb.remote.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MyCustomCountry}.
 * </p>
 *
 * @author Liferay
 * @see MyCustomCountry
 * @generated
 */
public class MyCustomCountryWrapper implements MyCustomCountry,
    ModelWrapper<MyCustomCountry> {
    private MyCustomCountry _myCustomCountry;

    public MyCustomCountryWrapper(MyCustomCountry myCustomCountry) {
        _myCustomCountry = myCustomCountry;
    }

    @Override
    public Class<?> getModelClass() {
        return MyCustomCountry.class;
    }

    @Override
    public String getModelClassName() {
        return MyCustomCountry.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("countryId", getCountryId());
        attributes.put("name", getName());
        attributes.put("a2", getA2());
        attributes.put("a3", getA3());
        attributes.put("number_", getNumber_());
        attributes.put("idd_", getIdd_());
        attributes.put("zipRequired", getZipRequired());
        attributes.put("active_", getActive_());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String countryId = (String) attributes.get("countryId");

        if (countryId != null) {
            setCountryId(countryId);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String a2 = (String) attributes.get("a2");

        if (a2 != null) {
            setA2(a2);
        }

        String a3 = (String) attributes.get("a3");

        if (a3 != null) {
            setA3(a3);
        }

        String number_ = (String) attributes.get("number_");

        if (number_ != null) {
            setNumber_(number_);
        }

        String idd_ = (String) attributes.get("idd_");

        if (idd_ != null) {
            setIdd_(idd_);
        }

        Integer zipRequired = (Integer) attributes.get("zipRequired");

        if (zipRequired != null) {
            setZipRequired(zipRequired);
        }

        Integer active_ = (Integer) attributes.get("active_");

        if (active_ != null) {
            setActive_(active_);
        }
    }

    /**
    * Returns the primary key of this my custom country.
    *
    * @return the primary key of this my custom country
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _myCustomCountry.getPrimaryKey();
    }

    /**
    * Sets the primary key of this my custom country.
    *
    * @param primaryKey the primary key of this my custom country
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _myCustomCountry.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the country ID of this my custom country.
    *
    * @return the country ID of this my custom country
    */
    @Override
    public java.lang.String getCountryId() {
        return _myCustomCountry.getCountryId();
    }

    /**
    * Sets the country ID of this my custom country.
    *
    * @param countryId the country ID of this my custom country
    */
    @Override
    public void setCountryId(java.lang.String countryId) {
        _myCustomCountry.setCountryId(countryId);
    }

    /**
    * Returns the name of this my custom country.
    *
    * @return the name of this my custom country
    */
    @Override
    public java.lang.String getName() {
        return _myCustomCountry.getName();
    }

    /**
    * Sets the name of this my custom country.
    *
    * @param name the name of this my custom country
    */
    @Override
    public void setName(java.lang.String name) {
        _myCustomCountry.setName(name);
    }

    /**
    * Returns the a2 of this my custom country.
    *
    * @return the a2 of this my custom country
    */
    @Override
    public java.lang.String getA2() {
        return _myCustomCountry.getA2();
    }

    /**
    * Sets the a2 of this my custom country.
    *
    * @param a2 the a2 of this my custom country
    */
    @Override
    public void setA2(java.lang.String a2) {
        _myCustomCountry.setA2(a2);
    }

    /**
    * Returns the a3 of this my custom country.
    *
    * @return the a3 of this my custom country
    */
    @Override
    public java.lang.String getA3() {
        return _myCustomCountry.getA3();
    }

    /**
    * Sets the a3 of this my custom country.
    *
    * @param a3 the a3 of this my custom country
    */
    @Override
    public void setA3(java.lang.String a3) {
        _myCustomCountry.setA3(a3);
    }

    /**
    * Returns the number_ of this my custom country.
    *
    * @return the number_ of this my custom country
    */
    @Override
    public java.lang.String getNumber_() {
        return _myCustomCountry.getNumber_();
    }

    /**
    * Sets the number_ of this my custom country.
    *
    * @param number_ the number_ of this my custom country
    */
    @Override
    public void setNumber_(java.lang.String number_) {
        _myCustomCountry.setNumber_(number_);
    }

    /**
    * Returns the idd_ of this my custom country.
    *
    * @return the idd_ of this my custom country
    */
    @Override
    public java.lang.String getIdd_() {
        return _myCustomCountry.getIdd_();
    }

    /**
    * Sets the idd_ of this my custom country.
    *
    * @param idd_ the idd_ of this my custom country
    */
    @Override
    public void setIdd_(java.lang.String idd_) {
        _myCustomCountry.setIdd_(idd_);
    }

    /**
    * Returns the zip required of this my custom country.
    *
    * @return the zip required of this my custom country
    */
    @Override
    public int getZipRequired() {
        return _myCustomCountry.getZipRequired();
    }

    /**
    * Sets the zip required of this my custom country.
    *
    * @param zipRequired the zip required of this my custom country
    */
    @Override
    public void setZipRequired(int zipRequired) {
        _myCustomCountry.setZipRequired(zipRequired);
    }

    /**
    * Returns the active_ of this my custom country.
    *
    * @return the active_ of this my custom country
    */
    @Override
    public int getActive_() {
        return _myCustomCountry.getActive_();
    }

    /**
    * Sets the active_ of this my custom country.
    *
    * @param active_ the active_ of this my custom country
    */
    @Override
    public void setActive_(int active_) {
        _myCustomCountry.setActive_(active_);
    }

    @Override
    public boolean isNew() {
        return _myCustomCountry.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _myCustomCountry.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _myCustomCountry.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _myCustomCountry.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _myCustomCountry.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _myCustomCountry.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _myCustomCountry.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _myCustomCountry.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _myCustomCountry.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _myCustomCountry.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _myCustomCountry.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new MyCustomCountryWrapper((MyCustomCountry) _myCustomCountry.clone());
    }

    @Override
    public int compareTo(
        com.liferay.krrishna.sb.remote.model.MyCustomCountry myCustomCountry) {
        return _myCustomCountry.compareTo(myCustomCountry);
    }

    @Override
    public int hashCode() {
        return _myCustomCountry.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.liferay.krrishna.sb.remote.model.MyCustomCountry> toCacheModel() {
        return _myCustomCountry.toCacheModel();
    }

    @Override
    public com.liferay.krrishna.sb.remote.model.MyCustomCountry toEscapedModel() {
        return new MyCustomCountryWrapper(_myCustomCountry.toEscapedModel());
    }

    @Override
    public com.liferay.krrishna.sb.remote.model.MyCustomCountry toUnescapedModel() {
        return new MyCustomCountryWrapper(_myCustomCountry.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _myCustomCountry.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _myCustomCountry.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _myCustomCountry.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof MyCustomCountryWrapper)) {
            return false;
        }

        MyCustomCountryWrapper myCustomCountryWrapper = (MyCustomCountryWrapper) obj;

        if (Validator.equals(_myCustomCountry,
                    myCustomCountryWrapper._myCustomCountry)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public MyCustomCountry getWrappedMyCustomCountry() {
        return _myCustomCountry;
    }

    @Override
    public MyCustomCountry getWrappedModel() {
        return _myCustomCountry;
    }

    @Override
    public void resetOriginalValues() {
        _myCustomCountry.resetOriginalValues();
    }
}
