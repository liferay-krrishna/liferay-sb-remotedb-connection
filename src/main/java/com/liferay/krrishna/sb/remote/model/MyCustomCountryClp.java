package com.liferay.krrishna.sb.remote.model;

import com.liferay.krrishna.sb.remote.service.ClpSerializer;
import com.liferay.krrishna.sb.remote.service.MyCustomCountryLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class MyCustomCountryClp extends BaseModelImpl<MyCustomCountry>
    implements MyCustomCountry {
    private String _countryId;
    private String _name;
    private String _a2;
    private String _a3;
    private String _number_;
    private String _idd_;
    private int _zipRequired;
    private int _active_;
    private BaseModel<?> _myCustomCountryRemoteModel;
    private Class<?> _clpSerializerClass = com.liferay.krrishna.sb.remote.service.ClpSerializer.class;

    public MyCustomCountryClp() {
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
    public String getPrimaryKey() {
        return _countryId;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setCountryId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _countryId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
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

    @Override
    public String getCountryId() {
        return _countryId;
    }

    @Override
    public void setCountryId(String countryId) {
        _countryId = countryId;

        if (_myCustomCountryRemoteModel != null) {
            try {
                Class<?> clazz = _myCustomCountryRemoteModel.getClass();

                Method method = clazz.getMethod("setCountryId", String.class);

                method.invoke(_myCustomCountryRemoteModel, countryId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_myCustomCountryRemoteModel != null) {
            try {
                Class<?> clazz = _myCustomCountryRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_myCustomCountryRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getA2() {
        return _a2;
    }

    @Override
    public void setA2(String a2) {
        _a2 = a2;

        if (_myCustomCountryRemoteModel != null) {
            try {
                Class<?> clazz = _myCustomCountryRemoteModel.getClass();

                Method method = clazz.getMethod("setA2", String.class);

                method.invoke(_myCustomCountryRemoteModel, a2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getA3() {
        return _a3;
    }

    @Override
    public void setA3(String a3) {
        _a3 = a3;

        if (_myCustomCountryRemoteModel != null) {
            try {
                Class<?> clazz = _myCustomCountryRemoteModel.getClass();

                Method method = clazz.getMethod("setA3", String.class);

                method.invoke(_myCustomCountryRemoteModel, a3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNumber_() {
        return _number_;
    }

    @Override
    public void setNumber_(String number_) {
        _number_ = number_;

        if (_myCustomCountryRemoteModel != null) {
            try {
                Class<?> clazz = _myCustomCountryRemoteModel.getClass();

                Method method = clazz.getMethod("setNumber_", String.class);

                method.invoke(_myCustomCountryRemoteModel, number_);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getIdd_() {
        return _idd_;
    }

    @Override
    public void setIdd_(String idd_) {
        _idd_ = idd_;

        if (_myCustomCountryRemoteModel != null) {
            try {
                Class<?> clazz = _myCustomCountryRemoteModel.getClass();

                Method method = clazz.getMethod("setIdd_", String.class);

                method.invoke(_myCustomCountryRemoteModel, idd_);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getZipRequired() {
        return _zipRequired;
    }

    @Override
    public void setZipRequired(int zipRequired) {
        _zipRequired = zipRequired;

        if (_myCustomCountryRemoteModel != null) {
            try {
                Class<?> clazz = _myCustomCountryRemoteModel.getClass();

                Method method = clazz.getMethod("setZipRequired", int.class);

                method.invoke(_myCustomCountryRemoteModel, zipRequired);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getActive_() {
        return _active_;
    }

    @Override
    public void setActive_(int active_) {
        _active_ = active_;

        if (_myCustomCountryRemoteModel != null) {
            try {
                Class<?> clazz = _myCustomCountryRemoteModel.getClass();

                Method method = clazz.getMethod("setActive_", int.class);

                method.invoke(_myCustomCountryRemoteModel, active_);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getMyCustomCountryRemoteModel() {
        return _myCustomCountryRemoteModel;
    }

    public void setMyCustomCountryRemoteModel(
        BaseModel<?> myCustomCountryRemoteModel) {
        _myCustomCountryRemoteModel = myCustomCountryRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _myCustomCountryRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_myCustomCountryRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            MyCustomCountryLocalServiceUtil.addMyCustomCountry(this);
        } else {
            MyCustomCountryLocalServiceUtil.updateMyCustomCountry(this);
        }
    }

    @Override
    public MyCustomCountry toEscapedModel() {
        return (MyCustomCountry) ProxyUtil.newProxyInstance(MyCustomCountry.class.getClassLoader(),
            new Class[] { MyCustomCountry.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        MyCustomCountryClp clone = new MyCustomCountryClp();

        clone.setCountryId(getCountryId());
        clone.setName(getName());
        clone.setA2(getA2());
        clone.setA3(getA3());
        clone.setNumber_(getNumber_());
        clone.setIdd_(getIdd_());
        clone.setZipRequired(getZipRequired());
        clone.setActive_(getActive_());

        return clone;
    }

    @Override
    public int compareTo(MyCustomCountry myCustomCountry) {
        String primaryKey = myCustomCountry.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof MyCustomCountryClp)) {
            return false;
        }

        MyCustomCountryClp myCustomCountry = (MyCustomCountryClp) obj;

        String primaryKey = myCustomCountry.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return getPrimaryKey().hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{countryId=");
        sb.append(getCountryId());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", a2=");
        sb.append(getA2());
        sb.append(", a3=");
        sb.append(getA3());
        sb.append(", number_=");
        sb.append(getNumber_());
        sb.append(", idd_=");
        sb.append(getIdd_());
        sb.append(", zipRequired=");
        sb.append(getZipRequired());
        sb.append(", active_=");
        sb.append(getActive_());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(28);

        sb.append("<model><model-name>");
        sb.append("com.liferay.krrishna.sb.remote.model.MyCustomCountry");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>countryId</column-name><column-value><![CDATA[");
        sb.append(getCountryId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>a2</column-name><column-value><![CDATA[");
        sb.append(getA2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>a3</column-name><column-value><![CDATA[");
        sb.append(getA3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>number_</column-name><column-value><![CDATA[");
        sb.append(getNumber_());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idd_</column-name><column-value><![CDATA[");
        sb.append(getIdd_());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>zipRequired</column-name><column-value><![CDATA[");
        sb.append(getZipRequired());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>active_</column-name><column-value><![CDATA[");
        sb.append(getActive_());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
