import com.task.dao.CategoryMapper;
import com.task.service.CRUD;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class test {
    @Autowired
    //因idea检测不到Spring装配的CategoryMapper，需通过此标签声明
    @SuppressWarnings("SpringJavaAutowiringInspection")
    CategoryMapper categoryMapper;
    @Test
    public void CURD(){

        //CRUD.Add(categoryMapper);
        //CRUD.Del(categoryMapper);
        //CRUD.Upd(categoryMapper);
        //CRUD.List(categoryMapper);
        //CRUD.SelOfName(categoryMapper);
        //CRUD.SelOfId(categoryMapper);
        //CRUD.SelOfNo(categoryMapper);
    }

}
