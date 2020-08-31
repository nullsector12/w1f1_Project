package wifi.item.test.model;

import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Item {
	
	private int iidx;
	private String title;
	private int price;
	private int conut_m;
	private int count_w;
	
	@JsonFormat(pattern="YYYY/MM/DD hh:mm:ss", timezone="Asia/Seoul")
	private Timestamp regdate;

	@JsonFormat(pattern="YYYY/MM/DD hh:mm:ss", timezone="Asia/Seoul")
	private Timestamp receive;
	
	private String addr;
	private String content;

	private int state;
	private int view_count;
	private int category;
	private int midx;
	
	public Item() {
		
	}
	
	public Item(String title, int price, int count_m, int count_w, Timestamp receive, String addr,
			String content, int state, int view_count, int category, int midx) {
		this(0, title, price, count_m, count_w, null, receive, addr, 
				content, state, view_count, category, midx);
	}
	
	public Item(int iidx, String title, int price, int conut_m, int count_w, Timestamp regdate, Timestamp receive,
			String addr, String content, int state, int view_count, int category,
			int midx) {
		super();
		this.iidx = iidx;
		this.title = title;
		this.price = price;
		this.conut_m = conut_m;
		this.count_w = count_w;
		this.regdate = regdate;
		this.receive = receive;
		this.addr = addr;
		this.content = content;
		this.state = state;
		this.view_count = view_count;
		this.category = category;
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
	
	@JsonFormat(pattern="YYYY/MM/DD hh:mm:ss", timezone="Asia/Seoul")
	public Timestamp getRegdate() {
		return regdate;
	}
	
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	
	public Timestamp getReceive() {
		return receive;
	}
	
	@JsonFormat(pattern="YYYY/MM/DD hh:mm:ss", timezone="Asia/Seoul")
	public void setReceive(Timestamp receive) {
		this.receive = receive;
	}
	
	@JsonFormat(pattern="YYYY/MM/DD hh:mm:ss", timezone="Asia/Seoul")
	public Date getToDate() {
		return new Date(receive.getTime());
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
	
	
}

