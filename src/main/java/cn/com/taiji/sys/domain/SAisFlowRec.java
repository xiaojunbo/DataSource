package cn.com.taiji.sys.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the s_ais_flow_rec database table.
 * 
 */
@Entity
@Table(name="s_ais_flow_rec")
@NamedQuery(name="SAisFlowRec.findAll", query="SELECT s FROM SAisFlowRec s")
public class SAisFlowRec implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ais_id")
	private Integer aisId;

	@Column(name="cargo_type")
	private BigDecimal cargoType;

	@Column(name="collect_datetime")
	private Timestamp collectDatetime;

	@Column(name="data_source")
	private String dataSource;

	private String destination;

	@Column(name="device_code")
	private String deviceCode;

	private Timestamp eta;

	@Column(name="locationg_device_type")
	private BigDecimal locationgDeviceType;

	private BigDecimal mmsi;

	@Column(name="plat_form_code")
	private String platFormCode;

	@Column(name="protocol_version")
	private String protocolVersion;

	@Column(name="record_datetime")
	private Timestamp recordDatetime;

	@Column(name="record_user_id")
	private BigDecimal recordUserId;

	@Column(name="update_frequency")
	private String updateFrequency;

	public SAisFlowRec() {
	}

	public Integer getAisId() {
		return this.aisId;
	}

	public void setAisId(Integer aisId) {
		this.aisId = aisId;
	}

	public BigDecimal getCargoType() {
		return this.cargoType;
	}

	public void setCargoType(BigDecimal cargoType) {
		this.cargoType = cargoType;
	}

	public Timestamp getCollectDatetime() {
		return this.collectDatetime;
	}

	public void setCollectDatetime(Timestamp collectDatetime) {
		this.collectDatetime = collectDatetime;
	}

	public String getDataSource() {
		return this.dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDeviceCode() {
		return this.deviceCode;
	}

	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}

	public Timestamp getEta() {
		return this.eta;
	}

	public void setEta(Timestamp eta) {
		this.eta = eta;
	}

	public BigDecimal getLocationgDeviceType() {
		return this.locationgDeviceType;
	}

	public void setLocationgDeviceType(BigDecimal locationgDeviceType) {
		this.locationgDeviceType = locationgDeviceType;
	}

	public BigDecimal getMmsi() {
		return this.mmsi;
	}

	public void setMmsi(BigDecimal mmsi) {
		this.mmsi = mmsi;
	}

	public String getPlatFormCode() {
		return this.platFormCode;
	}

	public void setPlatFormCode(String platFormCode) {
		this.platFormCode = platFormCode;
	}

	public String getProtocolVersion() {
		return this.protocolVersion;
	}

	public void setProtocolVersion(String protocolVersion) {
		this.protocolVersion = protocolVersion;
	}

	public Timestamp getRecordDatetime() {
		return this.recordDatetime;
	}

	public void setRecordDatetime(Timestamp recordDatetime) {
		this.recordDatetime = recordDatetime;
	}

	public BigDecimal getRecordUserId() {
		return this.recordUserId;
	}

	public void setRecordUserId(BigDecimal recordUserId) {
		this.recordUserId = recordUserId;
	}

	public String getUpdateFrequency() {
		return this.updateFrequency;
	}

	public void setUpdateFrequency(String updateFrequency) {
		this.updateFrequency = updateFrequency;
	}
	
	public SAisFlowRec(int aisId,String dataSource,String deviceCode){
		this.aisId = aisId;
		this.dataSource = dataSource;
		this.deviceCode = deviceCode;
	}

}