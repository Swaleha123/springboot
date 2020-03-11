package com.example.demo.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sectordata")
public class SectorData {
			@Id
			private Integer id;
			private String sectorName;
			private String brief;
			@Override
			public String toString() {
				return "SectorData [id=" + id + ", sectorName=" + sectorName + ", brief=" + brief + "]";
			}
			
			public Integer getId() {
				return id;
			}
			public void setId(Integer id) {
				this.id = id;
			}
			public String getsectorName() {
				return sectorName;
			}
			public void setsectorName(String sectorName) {
				this.sectorName = sectorName;
			}
			public String getBrief() {
				return brief;
			}
			public void setBrief(String brief) {
				this.brief = brief;
			}
			
			
}
