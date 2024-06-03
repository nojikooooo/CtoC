package solekia.CtoC.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;

public interface FurimaMapper {




        @Select("select * from customer")

        public List<FurimaModel> findAll();

        @Insert("insert into customer(customer_id,customer_pw,customer_name,customer_mail) VALUES(1,'pw',#{customer_name},#{customer_mail}) ")
        public void insert(

                        @Param("customer_name") String customer_name,

                        @Param("customer_mail") String customer_mail);

}