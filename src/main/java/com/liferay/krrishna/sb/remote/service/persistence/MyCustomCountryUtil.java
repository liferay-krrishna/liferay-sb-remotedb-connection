package com.liferay.krrishna.sb.remote.service.persistence;

import com.liferay.krrishna.sb.remote.model.MyCustomCountry;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the my custom country service. This utility wraps {@link MyCustomCountryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Liferay
 * @see MyCustomCountryPersistence
 * @see MyCustomCountryPersistenceImpl
 * @generated
 */
public class MyCustomCountryUtil {
    private static MyCustomCountryPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(MyCustomCountry myCustomCountry) {
        getPersistence().clearCache(myCustomCountry);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<MyCustomCountry> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<MyCustomCountry> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<MyCustomCountry> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static MyCustomCountry update(MyCustomCountry myCustomCountry)
        throws SystemException {
        return getPersistence().update(myCustomCountry);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static MyCustomCountry update(MyCustomCountry myCustomCountry,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(myCustomCountry, serviceContext);
    }

    /**
    * Caches the my custom country in the entity cache if it is enabled.
    *
    * @param myCustomCountry the my custom country
    */
    public static void cacheResult(
        com.liferay.krrishna.sb.remote.model.MyCustomCountry myCustomCountry) {
        getPersistence().cacheResult(myCustomCountry);
    }

    /**
    * Caches the my custom countries in the entity cache if it is enabled.
    *
    * @param myCustomCountries the my custom countries
    */
    public static void cacheResult(
        java.util.List<com.liferay.krrishna.sb.remote.model.MyCustomCountry> myCustomCountries) {
        getPersistence().cacheResult(myCustomCountries);
    }

    /**
    * Creates a new my custom country with the primary key. Does not add the my custom country to the database.
    *
    * @param countryId the primary key for the new my custom country
    * @return the new my custom country
    */
    public static com.liferay.krrishna.sb.remote.model.MyCustomCountry create(
        java.lang.String countryId) {
        return getPersistence().create(countryId);
    }

    /**
    * Removes the my custom country with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param countryId the primary key of the my custom country
    * @return the my custom country that was removed
    * @throws com.liferay.krrishna.sb.remote.NoSuchMyCustomCountryException if a my custom country with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.krrishna.sb.remote.model.MyCustomCountry remove(
        java.lang.String countryId)
        throws com.liferay.krrishna.sb.remote.NoSuchMyCustomCountryException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(countryId);
    }

    public static com.liferay.krrishna.sb.remote.model.MyCustomCountry updateImpl(
        com.liferay.krrishna.sb.remote.model.MyCustomCountry myCustomCountry)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(myCustomCountry);
    }

    /**
    * Returns the my custom country with the primary key or throws a {@link com.liferay.krrishna.sb.remote.NoSuchMyCustomCountryException} if it could not be found.
    *
    * @param countryId the primary key of the my custom country
    * @return the my custom country
    * @throws com.liferay.krrishna.sb.remote.NoSuchMyCustomCountryException if a my custom country with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.krrishna.sb.remote.model.MyCustomCountry findByPrimaryKey(
        java.lang.String countryId)
        throws com.liferay.krrishna.sb.remote.NoSuchMyCustomCountryException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(countryId);
    }

    /**
    * Returns the my custom country with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param countryId the primary key of the my custom country
    * @return the my custom country, or <code>null</code> if a my custom country with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.krrishna.sb.remote.model.MyCustomCountry fetchByPrimaryKey(
        java.lang.String countryId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(countryId);
    }

    /**
    * Returns all the my custom countries.
    *
    * @return the my custom countries
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.krrishna.sb.remote.model.MyCustomCountry> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the my custom countries.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.krrishna.sb.remote.model.impl.MyCustomCountryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of my custom countries
    * @param end the upper bound of the range of my custom countries (not inclusive)
    * @return the range of my custom countries
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.krrishna.sb.remote.model.MyCustomCountry> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the my custom countries.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.krrishna.sb.remote.model.impl.MyCustomCountryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of my custom countries
    * @param end the upper bound of the range of my custom countries (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of my custom countries
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.krrishna.sb.remote.model.MyCustomCountry> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the my custom countries from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of my custom countries.
    *
    * @return the number of my custom countries
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static MyCustomCountryPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (MyCustomCountryPersistence) PortletBeanLocatorUtil.locate(com.liferay.krrishna.sb.remote.service.ClpSerializer.getServletContextName(),
                    MyCustomCountryPersistence.class.getName());

            ReferenceRegistry.registerReference(MyCustomCountryUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(MyCustomCountryPersistence persistence) {
    }
}
