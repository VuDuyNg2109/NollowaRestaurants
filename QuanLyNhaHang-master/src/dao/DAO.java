
package dao;

import java.util.List;

abstract class DAO <EntityType, KeyType> {
//    abstract public void insert(EntityType entity);
//    abstract public void update(EntityType entity);
//    abstract public void delete(KeyType id);
    abstract public int insert(EntityType entity);
    abstract public int update(EntityType entity);
    abstract public int delete(KeyType...id);
    abstract public EntityType selectById(KeyType...id);
    abstract public List<EntityType> selectAll();
    abstract protected List<EntityType> selectBySql(String sql, Object...args);
}
