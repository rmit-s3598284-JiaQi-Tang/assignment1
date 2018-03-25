package MiniNet;
import java.util.ArrayList;
import java.util.List;
//Author:JiaQi Tang s3598284
public class ImageList {
	public List imageToSelect;
	public ImageList() {
		this.imageToSelect=new ArrayList();
	}
	public void AddImage() {
		//for adding id into idToSelect
		Image a0=new Image(1);
		Image a1=new Image(2);
		Image a2=new Image(1);
		Image a3=new Image(2);
		Image a4=new Image(1);
		Image a5=new Image(2);
		Image a6=new Image(1);
		Image a7=new Image(2);
		Image a8=new Image(1);
		imageToSelect.add(0,a0);
		imageToSelect.add(1,a1);
		imageToSelect.add(2,a2);
		imageToSelect.add(3,a3);
		imageToSelect.add(4,a4);
		imageToSelect.add(5,a5);
		imageToSelect.add(6,a6);
		imageToSelect.add(7,a7);
		imageToSelect.add(8,a8);
	}
	public int GetImage(int i) {
	    Image image=(Image) imageToSelect.get(i);
		return image.getImage();
	}
	public void DeleteImage(int i) {
		imageToSelect.remove(i);
	}
	public void AddNewImage(int i) {
		Image a=new Image(i);
		imageToSelect.add(imageToSelect.size(),a);
	}
	public void ChangeImage(int i,int n) {
		imageToSelect.set(i,n);
}
}
