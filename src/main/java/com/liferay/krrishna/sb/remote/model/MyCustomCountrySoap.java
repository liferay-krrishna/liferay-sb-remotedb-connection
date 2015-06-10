package com.liferay.krrishna.sb.remote.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.krrishna.sb.remote.service.http.MyCustomCountryServiceSoap}.
 *
 * @author Liferay
 * @see com.liferay.krrishna.sb.remote.service.http.MyCustomCountryServiceSoap
 * @generated
 */
public class MyCustomCountrySoap implements Serializable {
    private String _countryId;
    private String _name;
    private String _a2;
    private String _a3;
    private String _number_;
    private String _idd_;
    private int _zipRequired;
    private int _active_;

    public MyCustomCountrySoap() {
    }

    public static MyCustomCountrySoap toSoapModel(MyCustomCountry model) {
        MyCustomCountrySoap soapModel = new MyCustomCountrySoap();

        soapModel.setCountryId(model.getCountryId());
        soapModel.setName(model.getName());
        soapModel.setA2(model.getA2());
        soapModel.setA3(model.getA3());
        soapModel.setNumber_(model.getNumber_());
        soapModel.setIdd_(model.getIdd_());
        soapModel.setZipRequired(model.getZipRequired());
        soapModel.setActive_(model.getActive_());

        return soapModel;
    }

    public static MyCustomCountrySoap[] toSoapModels(MyCustomCountry[] models) {
        MyCustomCountrySoap[] soapModels = new MyCustomCountrySoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static MyCustomCountrySoap[][] toSoapModels(
        MyCustomCountry[][] models) {
        MyCustomCountrySoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new MyCustomCountrySoap[models.length][models[0].length];
        } else {
            soapModels = new MyCustomCountrySoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static MyCustomCountrySoap[] toSoapModels(
        List<MyCustomCountry> models) {
        List<MyCustomCountrySoap> soapModels = new ArrayList<MyCustomCountrySoap>(models.size());

        for (MyCustomCountry model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new MyCustomCountrySoap[soapModels.size()]);
    }

    public String getPrimaryKey() {
        return _countryId;
    }

    public void setPrimaryKey(String pk) {
        setCountryId(pk);
    }

    public String getCountryId() {
        return _countryId;
    }

    public void setCountryId(String countryId) {
        _countryId = countryId;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getA2() {
        return _a2;
    }

    public void setA2(String a2) {
        _a2 = a2;
    }

    public String getA3() {
        return _a3;
    }

    public void setA3(String a3) {
        _a3 = a3;
    }

    public String getNumber_() {
        return _number_;
    }

    public void setNumber_(String number_) {
        _number_ = number_;
    }

    public String getIdd_() {
        return _idd_;
    }

    public void setIdd_(String idd_) {
        _idd_ = idd_;
    }

    public int getZipRequired() {
        return _zipRequired;
    }

    public void setZipRequired(int zipRequired) {
        _zipRequired = zipRequired;
    }

    public int getActive_() {
        return _active_;
    }

    public void setActive_(int active_) {
        _active_ = active_;
    }
}
