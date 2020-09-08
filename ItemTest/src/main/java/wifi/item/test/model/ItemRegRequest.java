package wifi.item.test.model;

import java.sql.Timestamp;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonFormat;



public class ItemRegRequest {
	
	private String title;
	private int category;
	private int price;
	private int count_m;
	private int count_w;
	private String addr;
	
	@JsonFormat(pattern = "YYYY-MM-DD HH:mm:ss", timezone = "Asia/Seoul")
	private Timestamp receive;
	
	private MultipartFile photo;
	private String content;
	//거래중/거래완료/게시기간만료/수령대기중?/추천공구 / 일반공구 - 통합 상태값
	private int state;
	private int midx;
	
	public ItemRegRequest() {
		
	}
	
//	public ItemRegRequest(String title, int price, int count_m, int count_w, String addr,
//			 String content, int state, int category, int midx) {
//		
//		this.title = title;
//		this.category = category;
//		this.price = price;
//		this.count_m = count_m;
//		this.count_w = count_w;
//		this.addr = addr;
//		this.content = content;
//		this.state = state;
//		this.midx = midx;
//	}
	
	public ItemRegRequest(String title, int price, int count_m, int count_w, Timestamp receive, String addr,
			MultipartFile photo, String content, int state, int category, int midx) {
		
		this.title = title;
		this.category = category;
		this.price = price;
		this.count_m = count_m;
		this.count_w = count_w;
		this.addr = addr;
		this.receive = receive;
		this.photo = photo;
		this.content = content;
		this.state = state;
		this.midx = midx;
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
	
	public int getCount_m() {
		return count_m;
	}
	public void setCount_m(int count_m) {
		this.count_m = count_m;
	}
	
	public int getCount_w() {
		return count_w;
	}
	public void setCount_w(int count_w) {
		this.count_w = count_w;
	}
	
	public Timestamp getReceive() {
		return receive;
	}
	
	public void setReceive(Timestamp receive) {
		this.receive = receive;
	}
	
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

	public MultipartFile getPhoto() {
		return photo;
	}

	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
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
	
	public Item toItem() {
		return new Item(0, title, category, price, count_m, count_w, 
				null, addr, receive, null, content, state, 0, midx);
	}
	
	
}