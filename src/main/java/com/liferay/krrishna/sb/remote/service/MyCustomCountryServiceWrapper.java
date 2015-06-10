package com.liferay.krrishna.sb.remote.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MyCustomCountryService}.
 *
 * @author Liferay
 * @see MyCustomCountryService
 * @generated
 */
public class MyCustomCountryServiceWrapper implements MyCustomCountryService,
    ServiceWrapper<MyCustomCountryService> {
    private MyCustomCountryService _myCustomCountryService;

    public MyCustomCountryServiceWrapper(
        MyCustomCountryService myCustomCountryService) {
        _myCustomCountryService = myCustomCountryService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _myCustomCountryService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _myCustomCountryService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _myCustomCountryService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public MyCustomCountryService getWrappedMyCustomCountryService() {
        return _myCustomCountryService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedMyCustomCountryService(
        MyCustomCountryService myCustomCountryService) {
        _myCustomCountryService = myCustomCountryService;
    }

    @Override
    public MyCustomCountryService getWrappedService() {
        return _myCustomCountryService;
    }

    @Override
    public void setWrappedService(MyCustomCountryService myCustomCountryService) {
        _myCustomCountryService = myCustomCountryService;
    }
}
