package cn.com.taiji.sys.respository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cn.com.taiji.sys.domain.PfEEetectionFlowRec;

public interface PfEDetectionFlowRecRespository extends JpaRepository<PfEEetectionFlowRec, Integer>, JpaSpecificationExecutor<PfEEetectionFlowRec> {

	@Query("select u from PfEEetectionFlowRec u where u.collectDatetime between :startTime and :endTime")
	public List<PfEEetectionFlowRec> findByPeriodList(@Param("startTime") Timestamp startTime,@Param("endTime") Timestamp endTime);
}
