package cn.victorplus.vehicle.mapper;

import cn.victorplus.vehicle.bean.db.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMapper extends BaseMapper<User> {


	List<User> getAll();

	User getOne(@Param("name") String name);


}