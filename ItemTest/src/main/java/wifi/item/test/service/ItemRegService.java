package wifi.item.test.service;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import wifi.item.test.dao.ItemDao;
import wifi.item.test.model.Item;
import wifi.item.test.model.ItemRegRequest;


@Service
public class ItemRegService {
	
	
	private ItemDao dao;
	
	@Autowired
	private SqlSessionTemplate template;

	public int regItem (ItemRegRequest regRequest, HttpServletRequest request) {
		
		Item item = regRequest.toItem();
		
		System.out.println("item 확인 : " + item);
		
		dao = template.getMapper(ItemDao.class);
		
		int result = 0;
		
		try {

			MultipartFile file = regRequest.getPhoto();
			
			System.out.println("ItemRegRequest 확인 : " +regRequest);

			// 사진이 있다면 사진 파일을 물리적으로 저장하고, 없다면 기본 이미지 파일의 경로를 저장한다.
			if (file != null && !file.isEmpty() && file.getSize() > 0) {

				// 서버 내부의 경로
				String uri = "/upload";
				//String uri = request.getSession().getServletContext().getInitParameter("itemUploadPath");

				// 시스템의 실제(절대) 경로
				String realPath = request.getSession().getServletContext().getRealPath(uri);
				System.out.println(realPath);

				// 저장할 이미지 파일의 새로운 이름 생성
				String newFileName = System.nanoTime() + "_" + file.getOriginalFilename();

				// 서버의 저장소에 실제 저장
				File saveFile = new File(realPath, newFileName);
				file.transferTo(saveFile);
				System.out.println("저장 완료 : " + newFileName);

				// 데이터베이스에 저장할 Member 객체의 데이터를 완성한다. : 사진 경로
				item.setPhoto(newFileName);

			} else {
				item.setPhoto("default.png");
			}

		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		result = dao.insertItem(item);
		
		return result;
	}
}
