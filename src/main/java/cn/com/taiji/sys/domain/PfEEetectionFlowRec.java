package cn.com.taiji.sys.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="pf_e_detection_flow_rec")
@NamedQuery(name="PfEEetectionFlowRec.findAll",query="SELECT p FROM PfEEetectionFlowRec p")
public class PfEEetectionFlowRec implements Serializable{

	/**
	 * 电磁信号侦测（高频）表
	 */
	private static final long serialVersionUID = 1L;
	
	//电磁信号侦测ID
	@Id
	@Column(name="e_detection_id")
	private Integer eDetectionId;

	//平台编码
	@Column(name="plat_form_code")
	private String platFormCode;
	
	//设备编码
	@Column(name="device_code")
	private String deviceCode;
	
	//信号编码(批号)
	@Column(name="signal_code")
	private BigDecimal signalCode;
	
	//总截获次数
	@Column(name="capture_count")
	private BigDecimal captureCount;
	
	//首次时间，信号第一次出现时间，单位：0.1微秒
	@Column(name="first_capture_datetime")
	private Timestamp firstCaptureDatetime;
	
	//最新时间，信号最新时间，单位：0.1微秒
	@Column(name="lastest_time")
	private Timestamp lastestTime;
	
	//信号消失标识，信号消失触发:1:消失；0:存在
	@Column(name="sig_disappear_id")
	private String sigDisappearId;
	
	//敌我属性，0：不知道；1：敌方；2：我方；3：友方；4：中立；5：多方；
	@Column(name="friend_or_foe")
	private String friendOrFoe;
	
	//威胁等级，0-9(值越大威胁越大)
	@Column(name="thread_level")
	private BigDecimal threadLevel;
	
	//雷达类型，0:常规，1：连续波，2：重频参差，3：频率捷变，5：抖动
	@Column(name="radar_type")
	private String radarType;
	
	//雷达编码，雷达识别库主键，从1开始递增，无实际意义
	@Column(name="radar_id")
	private BigDecimal radarId;
	
	/**
	 * 雷达对应的平台类型平台类型：0：不明；1：地面固定；2：舰船；3：飞机；4：导弹；5：卫星；6：汽球；7：地面移动；
	 * 	8：潜艇；9：直升机；10：无人机；11：车辆；12：便携背负；13：飞船载；
	 * */
	@Column(name="platform_type")
	private BigDecimal platformType;
	
	//最低载频 单位：MHz
	@Column(name="min_carrier_frequency")
	private BigDecimal minCarrierFrequency;
	
	//最高载频 单位：MHz
	@Column(name="max_carrier_frequency")
	private BigDecimal maxCarrierFrequency;
	
	//脉宽 单位：0.1us(微秒)
	@Column(name="pulse_band")
	private BigDecimal pulseBand;
	
	//幅度（相对值，无实际意义）
	private BigDecimal range;
	
	//参差数 单位：个
	@Column(name="parameter_diff")
	private BigDecimal parameterDiff;
	
	//周期1 单位： 0.1us(微秒)
	@Column(name="period_one")
	private BigDecimal periodOne;
	
	//周期2 单位： 0.1us(微秒)
	@Column(name="period_two")
	private BigDecimal period_two;
	
	//周期3 单位： 0.1us(微秒)
	@Column(name="period_three")
	private BigDecimal periodThree;
	
	//周期4 单位： 0.1us(微秒)
	@Column(name="period_four")
	private BigDecimal periodFour;
	
	//周期5 单位： 0.1us(微秒)
	@Column(name="period_five")
	private BigDecimal periodFive;
	
	//周期6 单位： 0.1us(微秒)
	@Column(name="period_six")
	private BigDecimal periodSix;
	
	//精测向标志，0：无，1：精测向
	@Column(name="precision_direction_flag")
	private String precisionDirectionFlag;
	
	//抖动比，百分比
	@Column(name="vibration_ratio")
	private BigDecimal vibrationRatio;
	
	//示向度（方位）  单位度
	@Column(name="orientation_degree")
	private BigDecimal orientationDegree;
	
	//采集时间
	@Column(name="collect_datetime")
	private Timestamp collectDatetime;
	
	//报文发送时间
	@Column(name="send_datetime")
	private Timestamp sendDatetime;
	
	//数据来源：1：真实数据；2：仿真数据
	@Column(name="record_source")
	private String recordSource;
	
	//记录类型：1：实时数据；2：历史数据
	@Column(name="record_type")
	private String recordType;
	
	//插入用户ID：处理平台统一写入0
	@Column(name="record_user_id")
	private String recordUserId;
	
	//数据记录时间
	@Column(name="record_datetime")
	private Timestamp recordDatetime;

	public Integer geteDetectionId() {
		return eDetectionId;
	}

	public void seteDetectionId(Integer eDetectionId) {
		this.eDetectionId = eDetectionId;
	}

	public String getPlatFormCode() {
		return platFormCode;
	}

	public void setPlatFormCode(String platFormCode) {
		this.platFormCode = platFormCode;
	}

	public String getDeviceCode() {
		return deviceCode;
	}

	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}

	public BigDecimal getSignalCode() {
		return signalCode;
	}

	public void setSignalCode(BigDecimal signalCode) {
		this.signalCode = signalCode;
	}

	public BigDecimal getCaptureCount() {
		return captureCount;
	}

	public void setCaptureCount(BigDecimal captureCount) {
		this.captureCount = captureCount;
	}

	public Timestamp getFirstCaptureDatetime() {
		return firstCaptureDatetime;
	}

	public void setFirstCaptureDatetime(Timestamp firstCaptureDatetime) {
		this.firstCaptureDatetime = firstCaptureDatetime;
	}

	public Timestamp getLastestTime() {
		return lastestTime;
	}

	public void setLastestTime(Timestamp lastestTime) {
		this.lastestTime = lastestTime;
	}

	public String getSigDisappearId() {
		return sigDisappearId;
	}

	public void setSigDisappearId(String sigDisappearId) {
		this.sigDisappearId = sigDisappearId;
	}

	public String getFriendOrFoe() {
		return friendOrFoe;
	}

	public void setFriendOrFoe(String friendOrFoe) {
		this.friendOrFoe = friendOrFoe;
	}

	public BigDecimal getThreadLevel() {
		return threadLevel;
	}

	public void setThreadLevel(BigDecimal threadLevel) {
		this.threadLevel = threadLevel;
	}

	public String getRadarType() {
		return radarType;
	}

	public void setRadarType(String radarType) {
		this.radarType = radarType;
	}

	public BigDecimal getRadarId() {
		return radarId;
	}

	public void setRadarId(BigDecimal radarId) {
		this.radarId = radarId;
	}

	public BigDecimal getPlatformType() {
		return platformType;
	}

	public void setPlatformType(BigDecimal platformType) {
		this.platformType = platformType;
	}

	public BigDecimal getMinCarrierFrequency() {
		return minCarrierFrequency;
	}

	public void setMinCarrierFrequency(BigDecimal minCarrierFrequency) {
		this.minCarrierFrequency = minCarrierFrequency;
	}

	public BigDecimal getMaxCarrierFrequency() {
		return maxCarrierFrequency;
	}

	public void setMaxCarrierFrequency(BigDecimal maxCarrierFrequency) {
		this.maxCarrierFrequency = maxCarrierFrequency;
	}

	public BigDecimal getPulseBand() {
		return pulseBand;
	}

	public void setPulseBand(BigDecimal pulseBand) {
		this.pulseBand = pulseBand;
	}

	public BigDecimal getRange() {
		return range;
	}

	public void setRange(BigDecimal range) {
		this.range = range;
	}

	public BigDecimal getParameterDiff() {
		return parameterDiff;
	}

	public void setParameterDiff(BigDecimal parameterDiff) {
		this.parameterDiff = parameterDiff;
	}

	public BigDecimal getPeriodOne() {
		return periodOne;
	}

	public void setPeriodOne(BigDecimal periodOne) {
		this.periodOne = periodOne;
	}

	public BigDecimal getPeriod_two() {
		return period_two;
	}

	public void setPeriod_two(BigDecimal period_two) {
		this.period_two = period_two;
	}

	public BigDecimal getPeriodThree() {
		return periodThree;
	}

	public void setPeriodThree(BigDecimal periodThree) {
		this.periodThree = periodThree;
	}

	public BigDecimal getPeriodFour() {
		return periodFour;
	}

	public void setPeriodFour(BigDecimal periodFour) {
		this.periodFour = periodFour;
	}

	public BigDecimal getPeriodFive() {
		return periodFive;
	}

	public void setPeriodFive(BigDecimal periodFive) {
		this.periodFive = periodFive;
	}

	public BigDecimal getPeriodSix() {
		return periodSix;
	}

	public void setPeriodSix(BigDecimal periodSix) {
		this.periodSix = periodSix;
	}

	public String getPrecisionDirectionFlag() {
		return precisionDirectionFlag;
	}

	public void setPrecisionDirectionFlag(String precisionDirectionFlag) {
		this.precisionDirectionFlag = precisionDirectionFlag;
	}

	public BigDecimal getVibrationRatio() {
		return vibrationRatio;
	}

	public void setVibrationRatio(BigDecimal vibrationRatio) {
		this.vibrationRatio = vibrationRatio;
	}

	public BigDecimal getOrientationDegree() {
		return orientationDegree;
	}

	public void setOrientationDegree(BigDecimal orientationDegree) {
		this.orientationDegree = orientationDegree;
	}

	public Timestamp getCollectDatetime() {
		return collectDatetime;
	}

	public void setCollectDatetime(Timestamp collectDatetime) {
		this.collectDatetime = collectDatetime;
	}

	public Timestamp getSendDatetime() {
		return sendDatetime;
	}

	public void setSendDatetime(Timestamp sendDatetime) {
		this.sendDatetime = sendDatetime;
	}

	public String getRecordSource() {
		return recordSource;
	}

	public void setRecordSource(String recordSource) {
		this.recordSource = recordSource;
	}

	public String getRecordType() {
		return recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public String getRecordUserId() {
		return recordUserId;
	}

	public void setRecordUserId(String recordUserId) {
		this.recordUserId = recordUserId;
	}

	public Timestamp getRecordDatetime() {
		return recordDatetime;
	}

	public void setRecordDatetime(Timestamp recordDatetime) {
		this.recordDatetime = recordDatetime;
	}
	
	
}
