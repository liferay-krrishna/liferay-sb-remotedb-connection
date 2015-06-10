package com.liferay.krrishna.sb.remote.model.impl;

import com.liferay.krrishna.sb.remote.model.MyCustomCountry;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing MyCustomCountry in entity cache.
 *
 * @author Liferay
 * @see MyCustomCountry
 * @generated
 */
public class MyCustomCountryCacheModel implements CacheModel<MyCustomCountry>,
    Externalizable {
    public String countryId;
    public String name;
    public String a2;
    public String a3;
    public String number_;
    public String idd_;
    public int zipRequired;
    public int active_;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{countryId=");
        sb.append(countryId);
        sb.append(", name=");
        sb.append(name);
        sb.append(", a2=");
        sb.append(a2);
        sb.append(", a3=");
        sb.append(a3);
        sb.append(", number_=");
        sb.append(number_);
        sb.append(", idd_=");
        sb.append(idd_);
        sb.append(", zipRequired=");
        sb.append(zipRequired);
        sb.append(", active_=");
        sb.append(active_);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public MyCustomCountry toEntityModel() {
        MyCustomCountryImpl myCustomCountryImpl = new MyCustomCountryImpl();

        if (countryId == null) {
            myCustomCountryImpl.setCountryId(StringPool.BLANK);
        } else {
            myCustomCountryImpl.setCountryId(countryId);
        }

        if (name == null) {
            myCustomCountryImpl.setName(StringPool.BLANK);
        } else {
            myCustomCountryImpl.setName(name);
        }

        if (a2 == null) {
            myCustomCountryImpl.setA2(StringPool.BLANK);
        } else {
            myCustomCountryImpl.setA2(a2);
        }

        if (a3 == null) {
            myCustomCountryImpl.setA3(StringPool.BLANK);
        } else {
            myCustomCountryImpl.setA3(a3);
        }

        if (number_ == null) {
            myCustomCountryImpl.setNumber_(StringPool.BLANK);
        } else {
            myCustomCountryImpl.setNumber_(number_);
        }

        if (idd_ == null) {
            myCustomCountryImpl.setIdd_(StringPool.BLANK);
        } else {
            myCustomCountryImpl.setIdd_(idd_);
        }

        myCustomCountryImpl.setZipRequired(zipRequired);
        myCustomCountryImpl.setActive_(active_);

        myCustomCountryImpl.resetOriginalValues();

        return myCustomCountryImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        countryId = objectInput.readUTF();
        name = objectInput.readUTF();
        a2 = objectInput.readUTF();
        a3 = objectInput.readUTF();
        number_ = objectInput.readUTF();
        idd_ = objectInput.readUTF();
        zipRequired = objectInput.readInt();
        active_ = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (countryId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(countryId);
        }

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (a2 == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(a2);
        }

        if (a3 == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(a3);
        }

        if (number_ == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(number_);
        }

        if (idd_ == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(idd_);
        }

        objectOutput.writeInt(zipRequired);
        objectOutput.writeInt(active_);
    }
}
