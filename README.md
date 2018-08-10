# SpringBoot搭建项目

----------------------

## 简单示例：dao->service->controller

### 注意：数据字段要与实体类匹配，例如：user_id对应userId

  ```java
   @Select("select * from users where user_id = #{userId}")
      @Results({
              @Result(column = "user_id",property = "userId"),
              @Result(column = "user_name",property = "userName"),
              @Result(column = "user_age",property = "userAge")
      })
      Users findOne(int userId);
  ```

  ###      mybatis的注解方式，相当于之前mapper.xml文件



  ###     最后controller返回json格式的字符串
  ```json
{
	code: 0,
	msg: "成功",
	data: {
		userId: 1,
		userName: "Bob ",
		userAge: 22
	}
}
  ```
### 项目统一配置文件在application.yml文件中

