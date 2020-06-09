package cn.victorplus.vehicle.mapper;

public interface BaseMapper<T> {
        int add(T var1);

        int delete(Long var1);

        int updateIgnoreNull(T var1);

        int update(T var1);

        T get(Long var1);


}
