package ro.sok.niinoo.generic.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ro.sok.niinoo.generic.dao.GenericDAO;
import ro.sok.niinoo.utils.exception.NiinooException;
import ro.sok.niinoo.utils.query.Pair;
import ro.sok.niinoo.utils.query.QueryParameter;

@Service("genericService")
@Transactional
public class GenericServiceImpl implements GenericService {

	@Autowired
	private GenericDAO genericDAO;

	@Override
	public <T> List<T> addList(final List<T> list) throws NiinooException {
		return genericDAO.addList(list);
	}

	@Override
	public <T> T get(final Class<T> objClass, final Serializable id) throws NiinooException {
		return genericDAO.get(objClass, id);
	}

	@Override
	public <T> T add(final T obj) throws NiinooException {
		return genericDAO.add(obj);
	}

	@Override
	public <T> void update(final T obj) throws NiinooException {
		genericDAO.update(obj);
	}

	@Override
	public <T> void updateList(final List<T> list) throws NiinooException {
		genericDAO.updateList(list);
	}

	@Override
	public <T> void delete(final T obj) throws NiinooException {
		genericDAO.delete(obj);
	}

	@Override
	public <T> void delete(final Class<T> clazz, final Serializable id) throws NiinooException {
		genericDAO.delete(clazz, id);
	}

	@Override
	public <T> void deleteBulk(final Class<T> clazz) throws NiinooException {
		genericDAO.deleteBulk(clazz);
	}

	@Override
	public <T> void deleteBulk(final Class<T> clazz, final QueryParameter qp) throws NiinooException {
		genericDAO.deleteBulk(clazz, qp);
	}

	@Override
	public <T> void deleteBulk(final Class<T> clazz, final T filter) throws NiinooException {
		genericDAO.deleteBulk(clazz, filter);
	}

	@Override
	public <T> void deleteBulk(final Class<T> clazz, final QueryParameter qp, final T filter) throws NiinooException {
		genericDAO.deleteBulk(clazz, qp, filter);
	}

	@Override
	public <T> T getUnique(final Class<T> clazz) throws NiinooException {
		return genericDAO.getUnique(clazz);
	}

	@Override
	public <T> T getUnique(final Class<T> clazz, final QueryParameter qp) throws NiinooException {
		return genericDAO.getUnique(clazz, qp);
	}

	@Override
	public <T> T getUnique(final Class<T> clazz, final T filter) throws NiinooException {
		return genericDAO.getUnique(clazz, filter);
	}

	@Override
	public <T> T getUnique(final Class<T> clazz, final QueryParameter qp, final T filter) throws NiinooException {
		return genericDAO.getUnique(clazz, qp, filter);
	}

	@Override
	public <T> T getUniqueCached(final Class<T> clazz) throws NiinooException {
		return genericDAO.getUniqueCached(clazz);
	}

	@Override
	public <T> T getUniqueCached(final Class<T> clazz, final QueryParameter qp) throws NiinooException {
		return genericDAO.getUniqueCached(clazz, qp);
	}

	@Override
	public <T> T getUniqueCached(final Class<T> clazz, final T filter) throws NiinooException {
		return genericDAO.getUniqueCached(clazz, filter);
	}

	@Override
	public <T> T getUniqueCached(final Class<T> clazz, final QueryParameter qp, final T filter) throws NiinooException {
		return genericDAO.getUniqueCached(clazz, qp, filter);
	}

	@Override
	public <T> List<T> getList(final Class<T> clazz) throws NiinooException {
		return genericDAO.getList(clazz);
	}

	@Override
	public <T> Long getCount(final Class<T> clazz) throws NiinooException {
		return genericDAO.getCount(clazz);
	}

	@Override
	public <T> List<T> getList(final Class<T> clazz, final QueryParameter qp) throws NiinooException {
		return genericDAO.getList(clazz, qp);
	}

	@Override
	public <T> Long getCount(final Class<T> clazz, final QueryParameter qp) throws NiinooException {
		return genericDAO.getCount(clazz, qp);
	}

	@Override
	public <T> List<T> getList(final Class<T> clazz, final T filter) throws NiinooException {
		return genericDAO.getList(clazz, filter);
	}

	@Override
	public <T> Long getCount(final Class<T> clazz, final T filter) throws NiinooException {
		return genericDAO.getCount(clazz, filter);
	}

	@Override
	public <T> List<T> getList(final Class<T> clazz, final QueryParameter qp, final T filter) throws NiinooException {
		return genericDAO.getList(clazz, qp, filter);
	}

	@Override
	public <T> Long getCount(final Class<T> clazz, final QueryParameter qp, final T filter) throws NiinooException {
		return genericDAO.getCount(clazz, qp, filter);
	}

	@Override
	public <T> List<T> getListCached(final Class<T> clazz) throws NiinooException {
		return genericDAO.getListCached(clazz);
	}

	@Override
	public <T> Long getCountCached(final Class<T> clazz) throws NiinooException {
		return genericDAO.getCountCached(clazz);
	}

	@Override
	public <T> List<T> getListCached(final Class<T> clazz, final QueryParameter qp) throws NiinooException {
		return genericDAO.getListCached(clazz, qp);
	}

	@Override
	public <T> Long getCountCached(final Class<T> clazz, final QueryParameter qp) throws NiinooException {
		return genericDAO.getCountCached(clazz, qp);
	}

	@Override
	public <T> List<T> getListCached(final Class<T> clazz, final T filter) throws NiinooException {
		return genericDAO.getListCached(clazz, filter);
	}

	@Override
	public <T> Long getCountCached(final Class<T> clazz, final T filter) throws NiinooException {
		return genericDAO.getCountCached(clazz, filter);
	}

	@Override
	public <T> List<T> getListCached(final Class<T> clazz, final QueryParameter qp, final T filter)
			throws NiinooException {
		return genericDAO.getListCached(clazz, qp, filter);
	}

	@Override
	public <T> Long getCountCached(final Class<T> clazz, final QueryParameter qp, final T filter)
			throws NiinooException {
		return genericDAO.getCountCached(clazz, qp, filter);
	}

	@Override
	public <T, V> List<V> getPropertyValues(final Class<T> clazz, final QueryParameter qp, final T filter,
			final String propName, final Class<V> returnClass) throws NiinooException {
		return genericDAO.getPropertyValues(clazz, qp, filter, propName, returnClass);
	}

	@Override
	public <T, V> List<V> getPropertyValuesCachedDistinct(final Class<T> clazz, final QueryParameter qp, final T filter,
			final String propName, final Class<V> returnClass) throws NiinooException {
		return genericDAO.getPropertyValuesCachedDistinct(clazz, qp, filter, propName, returnClass);
	};

	@Override
	public <T, V> V getPropertyValue(final Class<T> clazz, final Serializable id, final String propName,
			final Class<V> returnClass) throws NiinooException {
		return genericDAO.getPropertyValue(clazz, id, propName, returnClass);
	}

	@Override
	public <T, V> List<V> getPropertyValuesCached(final Class<T> clazz, final QueryParameter qp, final T filter,
			final String propName, final Class<V> returnClass) throws NiinooException {
		return genericDAO.getPropertyValuesCached(clazz, qp, filter, propName, returnClass);
	}

	@Override
	public <T, V> List<V> getPropertyValuesDistinct(final Class<T> clazz, final QueryParameter qp, final T filter,
			final String propName, final Class<V> returnClass) throws NiinooException {
		return genericDAO.getPropertyValuesCachedDistinct(clazz, qp, filter, propName, returnClass);
	};

	@Override
	public <T, V> V getPropertyValueCached(final Class<T> clazz, final Serializable id, final String propName,
			final Class<V> returnClass) throws NiinooException {
		return genericDAO.getPropertyValueCached(clazz, id, propName, returnClass);
	}

	@Override
	public <T> void saveOrUpdate(final T obj) throws NiinooException {
		genericDAO.saveOrUpdate(obj);
	}

	@Override
	public <T> List<Pair<Long, String>> getLiteList(final Class<T> clazz, final String idPropName,
			final String displayPropName) throws NiinooException {
		return genericDAO.getLiteList(clazz, idPropName, displayPropName);
	}

	@Override
	public <T> List<Pair<Long, String>> getLiteList(final Class<T> clazz, final String idPropName,
			final String displayPropName, final QueryParameter qp) throws NiinooException {
		return genericDAO.getLiteList(clazz, idPropName, displayPropName, qp);
	}

	@Override
	public <T> List<Pair<Long, String>> getLiteList(final Class<T> clazz, final String idPropName,
			final String displayPropName, final QueryParameter qp, final T filter) throws NiinooException {
		return genericDAO.getLiteList(clazz, idPropName, displayPropName, qp, filter);
	}

	@Override
	public <T> List<Pair<Long, String>> getLiteListCached(final Class<T> clazz, final String idPropName,
			final String displayPropName) throws NiinooException {
		return genericDAO.getLiteListCached(clazz, idPropName, displayPropName);
	}

	@Override
	public <T> List<Pair<Long, String>> getLiteListCached(final Class<T> clazz, final String idPropName,
			final String displayPropName, final QueryParameter qp) throws NiinooException {
		return genericDAO.getLiteListCached(clazz, idPropName, displayPropName, qp);
	}

	@Override
	public <T> List<Pair<Long, String>> getLiteListCached(final Class<T> clazz, final String idPropName,
			final String displayPropName, final QueryParameter qp, final T filter) throws NiinooException {
		return genericDAO.getLiteListCached(clazz, idPropName, displayPropName, qp, filter);
	}
}