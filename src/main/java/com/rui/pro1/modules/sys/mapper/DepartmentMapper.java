package com.rui.pro1.modules.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.rui.pro1.common.bean.page.Query;
import com.rui.pro1.modules.sys.entity.Department;

public interface DepartmentMapper {

	List<Department> queryPages(Query query);

	Long getCount(Query query);

	Department get(@Param("id") int id);

	int del(int id);

	int add(Department user);

	int update(Department user);
}
