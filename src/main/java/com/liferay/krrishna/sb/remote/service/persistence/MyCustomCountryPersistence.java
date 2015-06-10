package com.liferay.krrishna.sb.remote.service.persistence;

import com.liferay.krrishna.sb.remote.model.MyCustomCountry;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the my custom country service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Liferay
 * @see MyCustomCountryPersistenceImpl
 * @see MyCustomCountryUtil
 * @generated
 */
public interface MyCustomCountryPersistence extends BasePersistence<MyCustomCountry> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link MyCustomCountryUtil} to access the my custom country persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the my custom country in the entity cache if it is enabled.
    *
    * @param myCustomCountry the my custom country
    */
    public void cacheResult(
        com.liferay.krrishna.sb.remote.model.MyCustomCountry myCustomCountry);

    /**
    * Caches the my custom countries in the entity cache if it is enabled.
    *
    * @param myCustomCountries the my custom countries
    */
    public void cacheResult(
        java.util.List<com.liferay.krrishna.sb.remote.model.MyCustomCountry> myCustomCountries);

    /**
    * Creates a new my custom country with the primary key. Does not add the my custom country to the database.
    *
    * @param countryId the primary key for the new my custom country
    * @return the new my custom country
    */
    public com.liferay.krrishna.sb.remote.model.MyCustomCountry create(
        java.lang.String countryId);

    /**
    * Removes the my custom country with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param countryId the primary key of the my custom country
    * @return the my custom country that was removed
    * @throws com.liferay.krrishna.sb.remote.NoSuchMyCustomCountryException if a my custom country with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.krrishna.sb.remote.model.MyCustomCountry remove(
        java.lang.String countryId)
        throws com.liferay.krrishna.sb.remote.NoSuchMyCustomCountryException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.krrishna.sb.remote.model.MyCustomCountry updateImpl(
        com.liferay.krrishna.sb.remote.model.MyCustomCountry myCustomCountry)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the my custom country with the primary key or throws a {@link com.liferay.krrishna.sb.remote.NoSuchMyCustomCountryException} if it could not be found.
    *
    * @param countryId the primary key of the my custom country
    * @return the my custom country
    * @throws com.liferay.krrishna.sb.remote.NoSuchMyCustomCountryException if a my custom country with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.krrishna.sb.remote.model.MyCustomCountry findByPrimaryKey(
        java.lang.String countryId)
        throws com.liferay.krrishna.sb.remote.NoSuchMyCustomCountryException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the my custom country with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param countryId the primary key of the my custom country
    * @return the my custom country, or <code>null</code> if a my custom country with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.krrishna.sb.remote.model.MyCustomCountry fetchByPrimaryKey(
        java.lang.String countryId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the my custom countries.
    *
    * @return the my custom countries
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.krrishna.sb.remote.model.MyCustomCountry> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.krrishna.sb.remote.model.MyCustomCountry> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.krrishna.sb.remote.model.MyCustomCountry> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the my custom countries from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of my custom countries.
    *
    * @return the number of my custom countries
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
