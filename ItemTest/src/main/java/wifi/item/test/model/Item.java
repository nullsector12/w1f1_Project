package wifi.item.test.model;

import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Item {
	
	private int iidx;
	private String title;
	private int category;
	private int price;
	private int conut_m;
	private int count_w;
	
	@JsonFormat(pattern="YYYY-MM-DD hh:mm:ss", timezone="Asia/Seoul")
	private Timestamp regdate;
	
	private String addr;
	
	@JsonFormat(pattern="YYYY-MM-DD hh:mm:ss", timezone="Asia/Seoul")
	private Timestamp receive;
	
	private String photo;
	private String content;
	private int state;
	private int view_count;
	private int midx;
	
	public Item() {
		
	}
	
//	public Item(String title, int category, int price, int count_m, int count_w, String addr, 
//			String content, int state, int midx) {
//		this(0, title, category, price, count_m, count_w, addr, content, state, 0, midx);
//	}
//	
//
//	
//	
//	public Item(int iidx, String title, int category, int price, int conut_m, int count_w, String addr,
//			String content, int state, int view_count, int midx) {
//		
//		this.iidx = iidx;
//		this.title = title;
//		this.category = category;
//		this.price = price;
//		this.conut_m = conut_m;
//		this.count_w = count_w;
//		this.addr = addr;
//		this.content = content;
//		this.state = state;
//		this.view_count = view_count;
//		this.midx = midx;
//	}
	
	public Item(String title, int category, int price, int count_m, int count_w, String addr, Timestamp receive, 
			String content, int state, int midx) {
		this(0, title, category, price, count_m, count_w, null, addr, receive, null, content, state, 0, midx);
	}
	public Item(int iidx, String title, int category, int price, int conut_m, int count_w, Timestamp regdate, String addr, Timestamp receive,
			String photo, String content, int state, int view_count, 
			int midx) {
		
		this.iidx = iidx;
		this.title = title;
		this.category = category;
		this.price = price;
		this.conut_m = conut_m;
		this.count_w = count_w;
		this.regdate = regdate;
		this.addr = addr;
		this.receive = receive;
		this.photo = photo;
		this.content = content;
		this.state = state;
		this.view_count = view_count;
		this.midx = midx;
	}
	
	public int getIidx() {
		return iidx;
	}
	public void setIidx(int iidx) {
		this.iidx = iidx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getConut_m() {
		return conut_m;
	}
	public void setConut_m(int conut_m) {
		this.conut_m = conut_m;
	}
	public int getCount_w() {
		return count_w;
	}
	public void setCount_w(int count_w) {
		this.count_w = count_w;
	}
	
	@JsonFormat(pattern="YYYY-MM-DD hh:mm:ss", timezone="Asia/Seoul")
	public Timestamp getRegdate() {
		return regdate;
	}
	
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	
	@JsonFormat(pattern="YYYY-MM-DD hh:mm:ss", timezone="Asia/Seoul")
	public Timestamp getReceive() {
		return receive;
	}
	
	@JsonFormat(pattern="YYYY-MM-DD hh:mm:ss", timezone="Asia/Seoul")
	public void setReceive(Timestamp receive) {
		this.receive = receive;
	}
	
	
	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	public int getView_count() {
		return view_count;
	}
	
	public void setView_count(int view_count) {
		this.view_count = view_count;
	}
	
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public int getMidx() {
		return midx;
	}
	public void setMidx(int midx) {
		this.midx = midx;
	}

	@Override
	public String toString() {
		return "Item [iidx=" + iidx + ", title=" + title + ", category=" + category + ", price=" + price + ", conut_m="
				+ conut_m + ", count_w=" + count_w + ", regdate=" + regdate + ", addr=" + addr + ", receive=" + receive
				+ ", photo=" + photo + ", content=" + content + ", state=" + state + ", view_count=" + view_count
				+ ", midx=" + midx + "]";
	}

//	@Override
//	public String toString() {
//		return "Item [iidx=" + iidx + ", title=" + title + ", category=" + category + ", price=" + price + ", conut_m="
//				+ conut_m + ", count_w=" + count_w + ", addr=" + addr + ", content=" + content
//				+ ", state=" + state + ", view_count=" + view_count + ", midx=" + midx + "]";
//	}

	
	
	
}

