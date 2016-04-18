package cn.com.taiji.sys.respository;

import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import cn.com.taiji.sys.domain.SAisFlowRec;
//,a.aisDirection,a.aisSog,a.collectDatetime,a.comment,a.dataSource,a.deviceIdCode,a.latitude,a.longitude,a.mmsi,a.platFormCode,a.recordDatetime,a.recordUserId,a.roteSpeed,a.shippingState,a.updateFrequency,b.aisId,b.cargoType,b.destination,b.deviceCode,b.eta,b.locationgDeviceType,b.protocolVersion
public interface SAisFlowRecRespository
		extends JpaRepository<SAisFlowRec ,BigDecimal>, JpaSpecificationExecutor<SAisFlowRec>  {
	


}
