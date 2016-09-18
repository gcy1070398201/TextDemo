package com.ctxd.textdemo.entiy;

import java.io.Serializable;
import java.util.List;

public class Good implements Serializable {
	private Data data;
	private String resCode;
	private String resMsg;
	private String serialNum;


	public Good() {
		super();
	}
	public Good(Data data, String resCode, String resMsg, String serialNum) {
		super();
		this.data = data;
		this.resCode = resCode;
		this.resMsg = resMsg;
		this.serialNum = serialNum;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public Data getData() {
		return data;
	}


	public void setRescode(String rescode) {
		this.resCode = rescode;
	}
	public String getRescode() {
		return resCode;
	}


	public void setResmsg(String resmsg) {
		this.resMsg = resmsg;
	}
	public String getResmsg() {
		return resMsg;
	}


	public void setSerialnum(String serialnum) {
		this.serialNum = serialnum;
	}
	public String getSerialnum() {
		return serialNum;
	}

	@Override
	public String toString() {
		return "Good [data=" + data + ", resCode=" + resCode + ", resMsg="
				+ resMsg + ", serialNum=" + serialNum + "]";
	}

	public static class Crops implements Serializable {

		private String imagePath;
		private int id;
		private String name;


		public Crops() {
			super();
		}
		public Crops(String imagePath, int id, String name) {
			super();
			this.imagePath = imagePath;
			this.id = id;
			this.name = name;
		}
	    
		public String getImagePath() {
			return imagePath;
		}
		public void setImagePath(String imagePath) {
			this.imagePath = imagePath;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getId() {
			return id;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		@Override
		public String toString() {
			return "Crops [imagePath=" + imagePath + ", id=" + id + ", name="
					+ name + "]";
		}

	}
	public static class Banners implements Serializable {

		private String imagePath;
		private String linkType;
		private String linkUrl;
		private String title;


		public Banners() {
			super();
		}
	

		public Banners(String imagePath, String linkType, String linkUrl,
				String title) {
			super();
			this.imagePath = imagePath;
			this.linkType = linkType;
			this.linkUrl = linkUrl;
			this.title = title;
		}
		public String getImagePath() {
			return imagePath;
		}
		public void setImagePath(String imagePath) {
			this.imagePath = imagePath;
		}
		public void setLinktype(String linktype) {
			this.linkType = linktype;
		}
		public String getLinktype() {
			return linkType;
		}
		public void setLinkurl(String linkurl) {
			this.linkUrl = linkurl;
		}
		public String getLinkurl() {
			return linkUrl;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getTitle() {
			return title;
		}
		@Override
		public String toString() {
			return "Banners [imagePath=" + imagePath + ", linkType=" + linkType
					+ ", linkUrl=" + linkUrl + ", title=" + title + "]";
		}
	


	}
	public static class Data implements Serializable {
		private List<Crops> categorys;
		private List<Banners> banners;

		public Data() {
			super();
		}
		public Data(List<Crops> categorys, List<Banners> banners) {
			super();
			this.categorys = categorys;
			this.banners = banners;
		}
		public List<Crops> getCategorys() {
			return categorys;
		}
		public void setCategorys(List<Crops> categorys) {
			this.categorys = categorys;
		}

		public void setBanners(List<Banners> banners) {
			this.banners = banners;
		}
		public List<Banners> getBanners() {
			return banners;
		}
		@Override
		public String toString() {
			return "Data [categorys=" + categorys + ", banners=" + banners
					+ "]";
		}
	}
}