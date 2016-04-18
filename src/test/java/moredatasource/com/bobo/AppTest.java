package moredatasource.com.bobo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.taiji.bobo.Application;

import cn.com.taiji.sys.domain.SAisFlowRec;
import cn.com.taiji.sys.respository.SAisFlowRecRespository;
import cn.com.taiji.sys.sc.domain.EOrder;
import cn.com.taiji.sys.sc.domain.EOrderRespository;

import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class AppTest {

	@Autowired
    private EOrderRespository eorderRepository;
    @Autowired
    private SAisFlowRecRespository saisflowRepository;

   @org.junit.Test
    public void test() throws Exception {

    	eorderRepository.save(new EOrder((long)60,"bbb"));
    	eorderRepository.save(new EOrder((long)70,"bbb"));
    	eorderRepository.save(new EOrder((long)80,"ccc"));
    	eorderRepository.save(new EOrder((long)90,"ddd"));
    	eorderRepository.save(new EOrder((long)91,"eee"));

        Assert.assertEquals(5, eorderRepository.findAll().size());

        saisflowRepository.save(new SAisFlowRec(4000,"aaa","00004300"));
        saisflowRepository.save(new SAisFlowRec(4001,"bbb","00004300"));
        saisflowRepository.save(new SAisFlowRec(4002,"bbb","00004300"));

        Assert.assertEquals(3, saisflowRepository.findAll().size());

    }
}
